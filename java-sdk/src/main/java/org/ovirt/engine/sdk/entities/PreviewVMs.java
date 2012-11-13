
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviewVMs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviewVMs">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseResources">
 *       &lt;sequence>
 *         &lt;element name="preview_vm" type="{}VM" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviewVMs", propOrder = {
    "previewVMs"
})
public class PreviewVMs
    extends BaseResources
{

    @XmlElement(name = "preview_vm")
    protected List<VM> previewVMs;

    /**
     * Gets the value of the previewVMs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previewVMs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviewVMs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VM }
     * 
     * 
     */
    public List<VM> getPreviewVMs() {
        if (previewVMs == null) {
            previewVMs = new ArrayList<VM>();
        }
        return this.previewVMs;
    }

    public boolean isSetPreviewVMs() {
        return ((this.previewVMs!= null)&&(!this.previewVMs.isEmpty()));
    }

    public void unsetPreviewVMs() {
        this.previewVMs = null;
    }

}
