
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quotas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quotas">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseResources">
 *       &lt;sequence>
 *         &lt;element ref="{}quota" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quotas", propOrder = {
    "quotas"
})
public class Quotas
    extends BaseResources
{

    @XmlElement(name = "quota")
    protected List<Quota> quotas;

    /**
     * Gets the value of the quotas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quota }
     * 
     * 
     */
    public List<Quota> getQuotas() {
        if (quotas == null) {
            quotas = new ArrayList<Quota>();
        }
        return this.quotas;
    }

    public boolean isSetQuotas() {
        return ((this.quotas!= null)&&(!this.quotas.isEmpty()));
    }

    public void unsetQuotas() {
        this.quotas = null;
    }

}
