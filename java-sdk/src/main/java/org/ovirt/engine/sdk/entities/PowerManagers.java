
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PowerManagers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerManagers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}power_management" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerManagers", propOrder = {
    "powerManagers"
})
public class PowerManagers {

    @XmlElement(name = "power_management")
    protected List<PowerManagement> powerManagers;

    /**
     * Gets the value of the powerManagers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerManagers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerManagers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerManagement }
     * 
     * 
     */
    public List<PowerManagement> getPowerManagers() {
        if (powerManagers == null) {
            powerManagers = new ArrayList<PowerManagement>();
        }
        return this.powerManagers;
    }

    public boolean isSetPowerManagers() {
        return ((this.powerManagers!= null)&&(!this.powerManagers.isEmpty()));
    }

    public void unsetPowerManagers() {
        this.powerManagers = null;
    }

}
