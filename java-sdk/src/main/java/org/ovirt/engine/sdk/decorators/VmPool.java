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

// *********************************************************************
// ********************* GENERATED CODE - DO NOT MODIFY ****************
// *********************************************************************

package org.ovirt.engine.sdk.decorators;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.entities.Action;
import org.ovirt.engine.sdk.entities.Response;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.web.HttpProxyBroker;

/**
 * VmPool decorator.
 */
@SuppressWarnings("unused")
public class VmPool extends
        org.ovirt.engine.sdk.entities.VmPool {

    private HttpProxyBroker proxy;

    private VmPoolPermissions vmPoolPermissions;


    /**
     * @param proxy HttpProxyBroker
     */
    public VmPool(HttpProxyBroker proxy) {
        this.proxy = proxy;
    }

    /**
     * @return HttpProxyBroker
     */
    private HttpProxyBroker getProxy() {
        return proxy;
    }

    /**
     * Gets the value of the VmPoolPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link VmPoolPermissions }
     *     
     */
    public synchronized VmPoolPermissions getPermissions() {
        if (this.vmPoolPermissions == null) {
            this.vmPoolPermissions = new VmPoolPermissions(proxy, this);
        }
        return vmPoolPermissions;
    }


    /**
     * Updates VmPool object.
     *
     * @return
     *     possible object is
     *     {@link VmPool }
     *
     * @throws ClientProtocolException
     * @throws ServerException
     * @throws IOException
     * @throws JAXBException
     */
    public VmPool update() throws ClientProtocolException,
            ServerException, IOException, JAXBException {
        String url = this.getHref();
        return getProxy().update(url, this, org.ovirt.engine.sdk.entities.VmPool.class, VmPool.class);
    }
   /**
    * Performs allocatevm action.
    *  
    * @param action Action
     *
    * @return
    *     {@link Action }
    *
    * @throws ClientProtocolException
    * @throws ServerException
    * @throws IOException
    * @throws JAXBException
    */
   public Action allocatevm(Action action) throws ClientProtocolException,
            ServerException, IOException, JAXBException {
        String url = this.getHref() + "/allocatevm";
        return getProxy().action(url, action, Action.class, Action.class);
    }
    /**
     * Deletes resource.
     *
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     * @throws ServerException
     * @throws IOException
     * @throws JAXBException
     */
    public Response delete() throws ClientProtocolException,
            ServerException, IOException, JAXBException {
        String url = this.getHref();
        return getProxy().delete(url, Response.class);
    }

}

