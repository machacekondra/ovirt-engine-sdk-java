
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiskStates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiskStates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disk_state" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskStates", propOrder = {
    "diskStates"
})
public class DiskStates {

    @XmlElement(name = "disk_state")
    protected List<String> diskStates;

    /**
     * Gets the value of the diskStates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diskStates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiskStates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDiskStates() {
        if (diskStates == null) {
            diskStates = new ArrayList<String>();
        }
        return this.diskStates;
    }

    public boolean isSetDiskStates() {
        return ((this.diskStates!= null)&&(!this.diskStates.isEmpty()));
    }

    public void unsetDiskStates() {
        this.diskStates = null;
    }

}
