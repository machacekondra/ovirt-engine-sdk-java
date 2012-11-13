
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlusterBricks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlusterBricks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="replica_count" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="stripe_count" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element ref="{}brick" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlusterBricks", propOrder = {
    "replicaCount",
    "stripeCount",
    "glusterBricks"
})
public class GlusterBricks {

    @XmlElement(name = "replica_count")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer replicaCount;
    @XmlElement(name = "stripe_count")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer stripeCount;
    @XmlElement(name = "brick")
    protected List<GlusterBrick> glusterBricks;

    /**
     * Gets the value of the replicaCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReplicaCount() {
        return replicaCount;
    }

    /**
     * Sets the value of the replicaCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReplicaCount(Integer value) {
        this.replicaCount = value;
    }

    public boolean isSetReplicaCount() {
        return (this.replicaCount!= null);
    }

    /**
     * Gets the value of the stripeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStripeCount() {
        return stripeCount;
    }

    /**
     * Sets the value of the stripeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStripeCount(Integer value) {
        this.stripeCount = value;
    }

    public boolean isSetStripeCount() {
        return (this.stripeCount!= null);
    }

    /**
     * Gets the value of the glusterBricks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glusterBricks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlusterBricks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlusterBrick }
     * 
     * 
     */
    public List<GlusterBrick> getGlusterBricks() {
        if (glusterBricks == null) {
            glusterBricks = new ArrayList<GlusterBrick>();
        }
        return this.glusterBricks;
    }

    public boolean isSetGlusterBricks() {
        return ((this.glusterBricks!= null)&&(!this.glusterBricks.isEmpty()));
    }

    public void unsetGlusterBricks() {
        this.glusterBricks = null;
    }

}
