
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custom_property" type="{}CustomProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomProperties", propOrder = {
    "customProperty"
})
public class CustomProperties {

    @XmlElement(name = "custom_property")
    protected List<CustomProperty> customProperty;

    /**
     * Gets the value of the customProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomProperty }
     * 
     * 
     */
    public List<CustomProperty> getCustomProperty() {
        if (customProperty == null) {
            customProperty = new ArrayList<CustomProperty>();
        }
        return this.customProperty;
    }

    public boolean isSetCustomProperty() {
        return ((this.customProperty!= null)&&(!this.customProperty.isEmpty()));
    }

    public void unsetCustomProperty() {
        this.customProperty = null;
    }

}
