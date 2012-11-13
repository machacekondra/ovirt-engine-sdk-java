
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostStorage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostStorage">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseResources">
 *       &lt;sequence>
 *         &lt;element ref="{}storage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostStorage", propOrder = {
    "storage"
})
public class HostStorage
    extends BaseResources
{

    protected List<Storage> storage;

    /**
     * Gets the value of the storage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Storage }
     * 
     * 
     */
    public List<Storage> getStorage() {
        if (storage == null) {
            storage = new ArrayList<Storage>();
        }
        return this.storage;
    }

    public boolean isSetStorage() {
        return ((this.storage!= null)&&(!this.storage.isEmpty()));
    }

    public void unsetStorage() {
        this.storage = null;
    }

}
