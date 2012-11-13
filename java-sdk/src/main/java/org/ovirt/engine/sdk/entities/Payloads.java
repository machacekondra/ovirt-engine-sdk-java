
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payloads complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payloads">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payload" type="{}Payload" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payloads", propOrder = {
    "payload"
})
public class Payloads {

    protected List<Payload> payload;

    /**
     * Gets the value of the payload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payload }
     * 
     * 
     */
    public List<Payload> getPayload() {
        if (payload == null) {
            payload = new ArrayList<Payload>();
        }
        return this.payload;
    }

    public boolean isSetPayload() {
        return ((this.payload!= null)&&(!this.payload.isEmpty()));
    }

    public void unsetPayload() {
        this.payload = null;
    }

}
