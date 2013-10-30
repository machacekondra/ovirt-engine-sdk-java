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

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.ovirt.engine.sdk.entities.Action;
import org.ovirt.engine.sdk.entities.Response;
import org.ovirt.engine.sdk.exceptions.ServerException;
import org.ovirt.engine.sdk.utils.HttpHeaderBuilder;
import org.ovirt.engine.sdk.utils.HttpHeaderUtils;
import org.ovirt.engine.sdk.utils.UrlBuilder;
import org.ovirt.engine.sdk.web.HttpProxyBroker;
import org.ovirt.engine.sdk.web.UrlParameterType;

/**
 * <p>VnicProfile providing relation and functional services
 * <p>to {@link org.ovirt.engine.sdk.entities.VnicProfile }.
 */
@SuppressWarnings("unused")
public class VnicProfile extends
        org.ovirt.engine.sdk.entities.VnicProfile {

    private HttpProxyBroker proxy;
    private final Object LOCK = new Object();

    private volatile VnicProfilePermissions vnicProfilePermissions;


    /**
     * @param proxy HttpProxyBroker
     */
    public VnicProfile(HttpProxyBroker proxy) {
        this.proxy = proxy;
    }

    /**
     * @return HttpProxyBroker
     */
    private HttpProxyBroker getProxy() {
        return proxy;
    }

    /**
     * Gets the value of the VnicProfilePermissions property.
     *
     * @return
     *     {@link VnicProfilePermissions }
     */
    public VnicProfilePermissions getPermissions() {
        if (this.vnicProfilePermissions == null) {
            synchronized (this.LOCK) {
                if (this.vnicProfilePermissions == null) {
                    this.vnicProfilePermissions = new VnicProfilePermissions(proxy, this);
                }
            }
        }
        return vnicProfilePermissions;
    }


    /**
     * Updates VnicProfile object.
     *
     * @param vnicprofile {@link org.ovirt.engine.sdk.entities.VnicProfile}
     *    <pre>
     *    [vnicprofile.name]
     *    [vnicprofile.description]
     *    [vnicprofile.port_mirroring]
     *    [vnicprofile.custom_properties.custom_property]
     *    </pre>
     *
     * @return
     *     {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VnicProfile update() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().update(
                url,
                this,
                org.ovirt.engine.sdk.entities.VnicProfile.class,
                VnicProfile.class,
                headers);
    }
    /**
     * Updates VnicProfile object.
     *
     * @param vnicprofile {@link org.ovirt.engine.sdk.entities.VnicProfile}
     *    <pre>
     *    [vnicprofile.name]
     *    [vnicprofile.description]
     *    [vnicprofile.port_mirroring]
     *    [vnicprofile.custom_properties.custom_property]
     *    </pre>
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     *
     * @return
     *     {@link VnicProfile }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public VnicProfile update(String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().update(
                url,
                this,
                org.ovirt.engine.sdk.entities.VnicProfile.class,
                VnicProfile.class,
                headers);
    }
    /**
     * Deletes object.
     *
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Response delete() throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .build();

        url = new UrlBuilder(url)
                .build();

        return getProxy().delete(url, Response.class, headers);
    }
    /**
     * Deletes object.
     *
     * @param correlationId
     *    <pre>
     *    [any string]
     *    </pre>
     * @param async
     *    <pre>
     *    [true|false]
     *    </pre>
     *
     * @return
     *     {@link Response }
     *
     * @throws ClientProtocolException
     *             Signals that HTTP/S protocol error has occurred.
     * @throws ServerException
     *             Signals that an oVirt api error has occurred.
     * @throws IOException
     *             Signals that an I/O exception of some sort has occurred.
     */
    public Response delete(Boolean async, String correlationId) throws ClientProtocolException,
            ServerException, IOException {
        String url = this.getHref();

        List<Header> headers = new HttpHeaderBuilder()
                .add("Correlation-Id", correlationId)
                .build();

        url = new UrlBuilder(url)
                .add("async", async, UrlParameterType.MATRIX)
                .build();

        return getProxy().delete(url, Response.class, headers);
    }

}
