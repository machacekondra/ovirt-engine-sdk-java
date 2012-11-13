
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Floppies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Floppies">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseDevices">
 *       &lt;sequence>
 *         &lt;element ref="{}floppy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Floppies", propOrder = {
    "floppies"
})
public class Floppies
    extends BaseDevices
{

    @XmlElement(name = "floppy")
    protected List<Floppy> floppies;

    /**
     * Gets the value of the floppies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floppies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloppies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Floppy }
     * 
     * 
     */
    public List<Floppy> getFloppies() {
        if (floppies == null) {
            floppies = new ArrayList<Floppy>();
        }
        return this.floppies;
    }

    public boolean isSetFloppies() {
        return ((this.floppies!= null)&&(!this.floppies.isEmpty()));
    }

    public void unsetFloppies() {
        this.floppies = null;
    }

}
