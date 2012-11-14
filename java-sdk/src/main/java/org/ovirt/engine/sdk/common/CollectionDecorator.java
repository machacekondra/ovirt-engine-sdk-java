//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.ovirt.engine.sdk.common;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.JAXBException;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.entities.BaseResource;
import org.ovirt.engine.sdk.entities.BaseResources;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.mapping.Mapper;
import org.ovirt.engine.sdk.utils.SerializationHelper;
import org.ovirt.engine.sdk.web.HttpProxyBroker;

/**
 * CollectionDecorator
 * 
 * @param <R>
 *            entity type
 * @param <Q>
 *            entity collection type
 * @param <Z>
 *            decorator type
 */
public abstract class CollectionDecorator<R extends BaseResource, Q extends BaseResources, Z extends R>
        extends Decorator {

    /**
     * CollectionDecorator
     * 
     * @param proxy
     *            HttpProxy proxy
     */
    public CollectionDecorator(HttpProxyBroker proxy) {
        super(proxy);
    }

    /**
     * List entities in collection
     * 
     * @return List<Z>
     * 
     * @throws ClientProtocolException
     * @throws ServerException
     *             oVirt API error
     * @throws IOException
     * @throws JAXBException
     */
    abstract public List<Z> list() throws ClientProtocolException, ServerException, IOException, JAXBException;

    /**
     * Fetches entity from the collection
     * 
     * @param id
     *            entity id
     * 
     * @return Z
     * 
     * @throws ClientProtocolException
     * @throws ServerException
     *             oVirt API error
     * @throws IOException
     * @throws JAXBException
     */
    abstract public Z get(UUID id) throws ClientProtocolException, ServerException, IOException, JAXBException;

    /**
     * Fetches entity from the collection
     * 
     * @param id
     *            entity name
     * 
     * @return Z
     * 
     * @throws ClientProtocolException
     * @throws ServerException
     *             oVirt API error
     * @throws IOException
     * @throws JAXBException
     */
    abstract public Z get(String name) throws ClientProtocolException, ServerException, IOException, JAXBException;

    protected List<Z> list(String url, Class<Q> from, Class<Z> to) throws JAXBException,
            ClientProtocolException, ServerException, IOException {
        return this.list(url, from, to, null);
    }

    protected List<Z> list(String url, Class<Q> from, Class<Z> to, List<Header> headers) throws JAXBException,
            ClientProtocolException, ServerException, IOException {
        String resXml = getProxy().get(url, headers);

        return unmarshall(from, to, resXml);
    }

    /**
     * Unmarshales collection of items from xml
     * 
     * @param from
     *            model type
     * @param to
     *            decorator type
     * @param xml
     *            string
     * 
     * @return List<Z> where Z is a decorator type
     * 
     * @throws JAXBException
     */
    private List<Z> unmarshall(Class<Q> from, Class<Z> to, String xml) throws JAXBException {
        List<Z> toColl = new ArrayList<Z>();
        Q collObj = SerializationHelper.unmarshall(from, xml);
        List<R> fromColl = fetchCollection(collObj);
        if (fromColl != null && !fromColl.isEmpty()) {
            for (R res : fromColl) {
                toColl.add(Mapper.map(res, to, getProxy()));
            }
        }

        return toColl;
    }

    /**
     * Fetches collection of items from server response
     * 
     * @param collection
     *            of public entities
     * 
     * @return List<R> where Z is a decorator type
     */
    @SuppressWarnings("unchecked")
    private List<R> fetchCollection(Q collection) {
        for (Method m : collection.getClass().getMethods()) {
            // TODO: make sure this is a right getter method
            if (m.getName().startsWith("get") && m.getReturnType().equals(List.class)) {
                try {
                    return (List<R>) m.invoke(collection);
                } catch (Exception e) {
                    e.printStackTrace();
                    // TODO: log exception
                }
            }
        }
        return null;
    }
}