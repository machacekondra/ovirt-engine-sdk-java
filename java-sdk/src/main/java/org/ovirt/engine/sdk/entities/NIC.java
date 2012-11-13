
package org.ovirt.engine.sdk.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NIC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NIC">
 *   &lt;complexContent>
 *     &lt;extension base="{}BaseDevice">
 *       &lt;sequence>
 *         &lt;element ref="{}network" minOccurs="0"/>
 *         &lt;element name="interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}mac" minOccurs="0"/>
 *         &lt;element name="statistics" type="{}Statistics" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{}port_mirroring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NIC", propOrder = {
    "network",
    "_interface",
    "mac",
    "statistics",
    "active",
    "portMirroring"
})
public class NIC
    extends BaseDevice
{

    protected Network network;
    @XmlElement(name = "interface")
    protected String _interface;
    protected MAC mac;
    protected Statistics statistics;
    protected Boolean active;
    @XmlElement(name = "port_mirroring")
    protected PortMirroring portMirroring;

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetwork(Network value) {
        this.network = value;
    }

    public boolean isSetNetwork() {
        return (this.network!= null);
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface(String value) {
        this._interface = value;
    }

    public boolean isSetInterface() {
        return (this._interface!= null);
    }

    /**
     * Gets the value of the mac property.
     * 
     * @return
     *     possible object is
     *     {@link MAC }
     *     
     */
    public MAC getMac() {
        return mac;
    }

    /**
     * Sets the value of the mac property.
     * 
     * @param value
     *     allowed object is
     *     {@link MAC }
     *     
     */
    public void setMac(MAC value) {
        this.mac = value;
    }

    public boolean isSetMac() {
        return (this.mac!= null);
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link Statistics }
     *     
     */
    public Statistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statistics }
     *     
     */
    public void setStatistics(Statistics value) {
        this.statistics = value;
    }

    public boolean isSetStatistics() {
        return (this.statistics!= null);
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    public boolean isSetActive() {
        return (this.active!= null);
    }

    /**
     * Gets the value of the portMirroring property.
     * 
     * @return
     *     possible object is
     *     {@link PortMirroring }
     *     
     */
    public PortMirroring getPortMirroring() {
        return portMirroring;
    }

    /**
     * Sets the value of the portMirroring property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortMirroring }
     *     
     */
    public void setPortMirroring(PortMirroring value) {
        this.portMirroring = value;
    }

    public boolean isSetPortMirroring() {
        return (this.portMirroring!= null);
    }

}
