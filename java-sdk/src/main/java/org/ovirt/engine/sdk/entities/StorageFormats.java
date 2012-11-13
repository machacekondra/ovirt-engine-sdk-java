
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StorageFormats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageFormats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageFormats", propOrder = {
    "storageFormats"
})
public class StorageFormats {

    @XmlElement(name = "format")
    protected List<String> storageFormats;

    /**
     * Gets the value of the storageFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storageFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorageFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStorageFormats() {
        if (storageFormats == null) {
            storageFormats = new ArrayList<String>();
        }
        return this.storageFormats;
    }

    public boolean isSetStorageFormats() {
        return ((this.storageFormats!= null)&&(!this.storageFormats.isEmpty()));
    }

    public void unsetStorageFormats() {
        this.storageFormats = null;
    }

}
