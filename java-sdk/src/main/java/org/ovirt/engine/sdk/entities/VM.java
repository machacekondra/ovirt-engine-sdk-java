
package org.ovirt.engine.sdk.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VM">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseResource">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}status" minOccurs="0"/>
 *         &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cpu" type="{}CPU" minOccurs="0"/>
 *         &lt;element name="os" type="{}OperatingSystem" minOccurs="0"/>
 *         &lt;element name="high_availability" type="{}HighAvailability" minOccurs="0"/>
 *         &lt;element name="display" type="{}Display" minOccurs="0"/>
 *         &lt;element ref="{}host" minOccurs="0"/>
 *         &lt;element ref="{}cluster" minOccurs="0"/>
 *         &lt;element ref="{}template" minOccurs="0"/>
 *         &lt;element ref="{}storage_domain" minOccurs="0"/>
 *         &lt;element name="start_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creation_time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateless" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}domain" minOccurs="0"/>
 *         &lt;element name="custom_properties" type="{}CustomProperties" minOccurs="0"/>
 *         &lt;element name="payloads" type="{}Payloads" minOccurs="0"/>
 *         &lt;element name="statistics" type="{}Statistics" minOccurs="0"/>
 *         &lt;element name="disks" type="{}Disks" minOccurs="0"/>
 *         &lt;element name="nics" type="{}Nics" minOccurs="0"/>
 *         &lt;element name="tags" type="{}Tags" minOccurs="0"/>
 *         &lt;element name="snapshots" type="{}Snapshots" minOccurs="0"/>
 *         &lt;element name="placement_policy" type="{}VmPlacementPolicy" minOccurs="0"/>
 *         &lt;element name="memory_policy" type="{}MemoryPolicy" minOccurs="0"/>
 *         &lt;element name="guest_info" type="{}GuestInfo" minOccurs="0"/>
 *         &lt;element ref="{}quota" minOccurs="0"/>
 *         &lt;element ref="{}usb" minOccurs="0"/>
 *         &lt;element ref="{}vmpool" minOccurs="0"/>
 *         &lt;element ref="{}cdroms" minOccurs="0"/>
 *         &lt;element ref="{}floppies" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VM", propOrder = {
    "type",
    "status",
    "memory",
    "cpu",
    "os",
    "highAvailability",
    "display",
    "host",
    "cluster",
    "template",
    "storageDomain",
    "startTime",
    "creationTime",
    "origin",
    "stateless",
    "timezone",
    "domain",
    "customProperties",
    "payloads",
    "statistics",
    "disks",
    "nics",
    "tags",
    "snapshots",
    "placementPolicy",
    "memoryPolicy",
    "guestInfo",
    "quota",
    "usb",
    "vmPool",
    "cdroms",
    "floppies"
})
@XmlSeeAlso({
    Snapshot.class
})
public class VM
    extends BaseResource
{

    protected String type;
    protected Status status;
    protected Long memory;
    protected CPU cpu;
    protected OperatingSystem os;
    @XmlElement(name = "high_availability")
    protected HighAvailability highAvailability;
    protected Display display;
    protected Host host;
    protected Cluster cluster;
    protected Template template;
    @XmlElement(name = "storage_domain")
    protected StorageDomain storageDomain;
    @XmlElement(name = "start_time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "creation_time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    protected String origin;
    protected Boolean stateless;
    protected String timezone;
    protected Domain domain;
    @XmlElement(name = "custom_properties")
    protected CustomProperties customProperties;
    protected Payloads payloads;
    protected Statistics statistics;
    protected Disks disks;
    protected Nics nics;
    protected Tags tags;
    protected Snapshots snapshots;
    @XmlElement(name = "placement_policy")
    protected VmPlacementPolicy placementPolicy;
    @XmlElement(name = "memory_policy")
    protected MemoryPolicy memoryPolicy;
    @XmlElement(name = "guest_info")
    protected GuestInfo guestInfo;
    protected Quota quota;
    protected Usb usb;
    @XmlElement(name = "vmpool")
    protected VmPool vmPool;
    protected CdRoms cdroms;
    protected Floppies floppies;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the memory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemory() {
        return memory;
    }

    /**
     * Sets the value of the memory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemory(Long value) {
        this.memory = value;
    }

    public boolean isSetMemory() {
        return (this.memory!= null);
    }

    /**
     * Gets the value of the cpu property.
     * 
     * @return
     *     possible object is
     *     {@link CPU }
     *     
     */
    public CPU getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPU }
     *     
     */
    public void setCpu(CPU value) {
        this.cpu = value;
    }

    public boolean isSetCpu() {
        return (this.cpu!= null);
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystem }
     *     
     */
    public OperatingSystem getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystem }
     *     
     */
    public void setOs(OperatingSystem value) {
        this.os = value;
    }

    public boolean isSetOs() {
        return (this.os!= null);
    }

    /**
     * Gets the value of the highAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link HighAvailability }
     *     
     */
    public HighAvailability getHighAvailability() {
        return highAvailability;
    }

    /**
     * Sets the value of the highAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighAvailability }
     *     
     */
    public void setHighAvailability(HighAvailability value) {
        this.highAvailability = value;
    }

    public boolean isSetHighAvailability() {
        return (this.highAvailability!= null);
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link Display }
     *     
     */
    public Display getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link Display }
     *     
     */
    public void setDisplay(Display value) {
        this.display = value;
    }

    public boolean isSetDisplay() {
        return (this.display!= null);
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

    /**
     * Gets the value of the cluster property.
     * 
     * @return
     *     possible object is
     *     {@link Cluster }
     *     
     */
    public Cluster getCluster() {
        return cluster;
    }

    /**
     * Sets the value of the cluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cluster }
     *     
     */
    public void setCluster(Cluster value) {
        this.cluster = value;
    }

    public boolean isSetCluster() {
        return (this.cluster!= null);
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setTemplate(Template value) {
        this.template = value;
    }

    public boolean isSetTemplate() {
        return (this.template!= null);
    }

    /**
     * Gets the value of the storageDomain property.
     * 
     * @return
     *     possible object is
     *     {@link StorageDomain }
     *     
     */
    public StorageDomain getStorageDomain() {
        return storageDomain;
    }

    /**
     * Sets the value of the storageDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageDomain }
     *     
     */
    public void setStorageDomain(StorageDomain value) {
        this.storageDomain = value;
    }

    public boolean isSetStorageDomain() {
        return (this.storageDomain!= null);
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    public boolean isSetStartTime() {
        return (this.startTime!= null);
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    public boolean isSetCreationTime() {
        return (this.creationTime!= null);
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    public boolean isSetOrigin() {
        return (this.origin!= null);
    }

    /**
     * Gets the value of the stateless property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStateless() {
        return stateless;
    }

    /**
     * Sets the value of the stateless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStateless(Boolean value) {
        this.stateless = value;
    }

    public boolean isSetStateless() {
        return (this.stateless!= null);
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    public boolean isSetTimezone() {
        return (this.timezone!= null);
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link Domain }
     *     
     */
    public Domain getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Domain }
     *     
     */
    public void setDomain(Domain value) {
        this.domain = value;
    }

    public boolean isSetDomain() {
        return (this.domain!= null);
    }

    /**
     * Gets the value of the customProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CustomProperties }
     *     
     */
    public CustomProperties getCustomProperties() {
        return customProperties;
    }

    /**
     * Sets the value of the customProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomProperties }
     *     
     */
    public void setCustomProperties(CustomProperties value) {
        this.customProperties = value;
    }

    public boolean isSetCustomProperties() {
        return (this.customProperties!= null);
    }

    /**
     * Gets the value of the payloads property.
     * 
     * @return
     *     possible object is
     *     {@link Payloads }
     *     
     */
    public Payloads getPayloads() {
        return payloads;
    }

    /**
     * Sets the value of the payloads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payloads }
     *     
     */
    public void setPayloads(Payloads value) {
        this.payloads = value;
    }

    public boolean isSetPayloads() {
        return (this.payloads!= null);
    }
















    /**
     * Gets the value of the placementPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link VmPlacementPolicy }
     *     
     */
    public VmPlacementPolicy getPlacementPolicy() {
        return placementPolicy;
    }

    /**
     * Sets the value of the placementPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmPlacementPolicy }
     *     
     */
    public void setPlacementPolicy(VmPlacementPolicy value) {
        this.placementPolicy = value;
    }

    public boolean isSetPlacementPolicy() {
        return (this.placementPolicy!= null);
    }

    /**
     * Gets the value of the memoryPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link MemoryPolicy }
     *     
     */
    public MemoryPolicy getMemoryPolicy() {
        return memoryPolicy;
    }

    /**
     * Sets the value of the memoryPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryPolicy }
     *     
     */
    public void setMemoryPolicy(MemoryPolicy value) {
        this.memoryPolicy = value;
    }

    public boolean isSetMemoryPolicy() {
        return (this.memoryPolicy!= null);
    }

    /**
     * Gets the value of the guestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GuestInfo }
     *     
     */
    public GuestInfo getGuestInfo() {
        return guestInfo;
    }

    /**
     * Sets the value of the guestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestInfo }
     *     
     */
    public void setGuestInfo(GuestInfo value) {
        this.guestInfo = value;
    }

    public boolean isSetGuestInfo() {
        return (this.guestInfo!= null);
    }

    /**
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link Quota }
     *     
     */
    public Quota getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quota }
     *     
     */
    public void setQuota(Quota value) {
        this.quota = value;
    }

    public boolean isSetQuota() {
        return (this.quota!= null);
    }

    /**
     * Gets the value of the usb property.
     * 
     * @return
     *     possible object is
     *     {@link Usb }
     *     
     */
    public Usb getUsb() {
        return usb;
    }

    /**
     * Sets the value of the usb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usb }
     *     
     */
    public void setUsb(Usb value) {
        this.usb = value;
    }

    public boolean isSetUsb() {
        return (this.usb!= null);
    }

    /**
     * Gets the value of the vmPool property.
     * 
     * @return
     *     possible object is
     *     {@link VmPool }
     *     
     */
    public VmPool getVmPool() {
        return vmPool;
    }

    /**
     * Sets the value of the vmPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmPool }
     *     
     */
    public void setVmPool(VmPool value) {
        this.vmPool = value;
    }

    public boolean isSetVmPool() {
        return (this.vmPool!= null);
    }




    /**
     * Gets the value of the floppies property.
     * 
     * @return
     *     possible object is
     *     {@link Floppies }
     *     
     */
    public Floppies getFloppies() {
        return floppies;
    }

    /**
     * Sets the value of the floppies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Floppies }
     *     
     */
    public void setFloppies(Floppies value) {
        this.floppies = value;
    }

    public boolean isSetFloppies() {
        return (this.floppies!= null);
    }

}
