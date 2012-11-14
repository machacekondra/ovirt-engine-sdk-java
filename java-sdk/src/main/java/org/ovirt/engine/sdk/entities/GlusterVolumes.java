
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlusterVolumes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlusterVolumes">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseResources">
 *       &lt;sequence>
 *         &lt;element ref="{}gluster_volume" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlusterVolumes", propOrder = {
    "glusterVolumes"
})
public class GlusterVolumes
    extends BaseResources
{

    @XmlElement(name = "gluster_volume")
    protected List<GlusterVolume> glusterVolumes;

    /**
     * Gets the value of the glusterVolumes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glusterVolumes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlusterVolumes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlusterVolume }
     * 
     * 
     */
    public List<GlusterVolume> getGlusterVolumes() {
        if (glusterVolumes == null) {
            glusterVolumes = new ArrayList<GlusterVolume>();
        }
        return this.glusterVolumes;
    }

    public boolean isSetGlusterVolumes() {
        return ((this.glusterVolumes!= null)&&(!this.glusterVolumes.isEmpty()));
    }

    public void unsetGlusterVolumes() {
        this.glusterVolumes = null;
    }

}