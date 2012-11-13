
package org.ovirt.engine.sdk.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedLink">
 *   &lt;complexContent>
 *     &lt;extension base="{}Link">
 *       &lt;sequence>
 *         &lt;element ref="{}request" minOccurs="0"/>
 *         &lt;element ref="{}response" minOccurs="0"/>
 *         &lt;element ref="{}linkCapabilities" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedLink", propOrder = {
    "request",
    "response",
    "linkCapabilities"
})
public class DetailedLink
    extends Link
{

    protected Request request;
    protected Response response;
    protected LinkCapabilities linkCapabilities;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    public boolean isSetRequest() {
        return (this.request!= null);
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    public boolean isSetResponse() {
        return (this.response!= null);
    }

    /**
     * Gets the value of the linkCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link LinkCapabilities }
     *     
     */
    public LinkCapabilities getLinkCapabilities() {
        return linkCapabilities;
    }

    /**
     * Sets the value of the linkCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkCapabilities }
     *     
     */
    public void setLinkCapabilities(LinkCapabilities value) {
        this.linkCapabilities = value;
    }

    public boolean isSetLinkCapabilities() {
        return (this.linkCapabilities!= null);
    }

}
