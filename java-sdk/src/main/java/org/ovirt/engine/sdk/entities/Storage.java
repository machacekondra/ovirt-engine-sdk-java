
package org.ovirt.engine.sdk.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Storage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Storage">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;group ref="{}NfsStorage"/>
 *           &lt;group ref="{}IscsiStorage"/>
 *         &lt;/choice>
 *         &lt;element ref="{}host" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Storage", propOrder = {
    "type",
    "address",
    "path",
    "mountOptions",
    "vfsType",
    "nfsVersion",
    "nfsTimeo",
    "nfsRetrans",
    "logicalUnits",
    "volumeGroup",
    "overrideLuns",
    "host"
})
public class Storage
    extends BaseResource
{

    protected String type;
    protected String address;
    protected String path;
    @XmlElement(name = "mount_options")
    protected String mountOptions;
    @XmlElement(name = "vfs_type")
    protected String vfsType;
    @XmlElement(name = "nfs_version")
    protected String nfsVersion;
    @XmlElement(name = "nfs_timeo")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer nfsTimeo;
    @XmlElement(name = "nfs_retrans")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer nfsRetrans;
    @XmlElement(name = "logical_unit")
    protected List<LogicalUnit> logicalUnits;
    @XmlElement(name = "volume_group")
    protected VolumeGroup volumeGroup;
    @XmlElement(name = "override_luns")
    protected Boolean overrideLuns;
    protected Host host;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    public boolean isSetPath() {
        return (this.path!= null);
    }

    /**
     * Gets the value of the mountOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMountOptions() {
        return mountOptions;
    }

    /**
     * Sets the value of the mountOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMountOptions(String value) {
        this.mountOptions = value;
    }

    public boolean isSetMountOptions() {
        return (this.mountOptions!= null);
    }

    /**
     * Gets the value of the vfsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVfsType() {
        return vfsType;
    }

    /**
     * Sets the value of the vfsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVfsType(String value) {
        this.vfsType = value;
    }

    public boolean isSetVfsType() {
        return (this.vfsType!= null);
    }

    /**
     * Gets the value of the nfsVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfsVersion() {
        return nfsVersion;
    }

    /**
     * Sets the value of the nfsVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfsVersion(String value) {
        this.nfsVersion = value;
    }

    public boolean isSetNfsVersion() {
        return (this.nfsVersion!= null);
    }

    /**
     * Gets the value of the nfsTimeo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNfsTimeo() {
        return nfsTimeo;
    }

    /**
     * Sets the value of the nfsTimeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNfsTimeo(Integer value) {
        this.nfsTimeo = value;
    }

    public boolean isSetNfsTimeo() {
        return (this.nfsTimeo!= null);
    }

    /**
     * Gets the value of the nfsRetrans property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNfsRetrans() {
        return nfsRetrans;
    }

    /**
     * Sets the value of the nfsRetrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNfsRetrans(Integer value) {
        this.nfsRetrans = value;
    }

    public boolean isSetNfsRetrans() {
        return (this.nfsRetrans!= null);
    }

    /**
     * Gets the value of the logicalUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalUnit }
     * 
     * 
     */
    public List<LogicalUnit> getLogicalUnits() {
        if (logicalUnits == null) {
            logicalUnits = new ArrayList<LogicalUnit>();
        }
        return this.logicalUnits;
    }

    public boolean isSetLogicalUnits() {
        return ((this.logicalUnits!= null)&&(!this.logicalUnits.isEmpty()));
    }

    public void unsetLogicalUnits() {
        this.logicalUnits = null;
    }

    /**
     * Gets the value of the volumeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeGroup }
     *     
     */
    public VolumeGroup getVolumeGroup() {
        return volumeGroup;
    }

    /**
     * Sets the value of the volumeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeGroup }
     *     
     */
    public void setVolumeGroup(VolumeGroup value) {
        this.volumeGroup = value;
    }

    public boolean isSetVolumeGroup() {
        return (this.volumeGroup!= null);
    }

    /**
     * Gets the value of the overrideLuns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideLuns() {
        return overrideLuns;
    }

    /**
     * Sets the value of the overrideLuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideLuns(Boolean value) {
        this.overrideLuns = value;
    }

    public boolean isSetOverrideLuns() {
        return (this.overrideLuns!= null);
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link Host }
     *     
     */
    public Host getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link Host }
     *     
     */
    public void setHost(Host value) {
        this.host = value;
    }

    public boolean isSetHost() {
        return (this.host!= null);
    }

}
