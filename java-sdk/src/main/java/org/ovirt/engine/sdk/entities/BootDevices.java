
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BootDevices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BootDevices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boot_device" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BootDevices", propOrder = {
    "bootDevices"
})
public class BootDevices {

    @XmlElement(name = "boot_device")
    protected List<String> bootDevices;

    /**
     * Gets the value of the bootDevices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bootDevices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBootDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBootDevices() {
        if (bootDevices == null) {
            bootDevices = new ArrayList<String>();
        }
        return this.bootDevices;
    }

    public boolean isSetBootDevices() {
        return ((this.bootDevices!= null)&&(!this.bootDevices.isEmpty()));
    }

    public void unsetBootDevices() {
        this.bootDevices = null;
    }

}