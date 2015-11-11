//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineNumberNumericType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for EventLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipatingLocationsLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RetailPlannedImpact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLineItemType", propOrder = {
    "lineNumberNumeric",
    "participatingLocationsLocation",
    "retailPlannedImpact",
    "supplyItem"
})
public class EventLineItemType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "LineNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineNumberNumericType lineNumberNumeric;
    @XmlElement(name = "ParticipatingLocationsLocation")
    protected LocationType participatingLocationsLocation;
    @XmlElement(name = "RetailPlannedImpact")
    protected List<RetailPlannedImpactType> retailPlannedImpact;
    @XmlElement(name = "SupplyItem", required = true)
    protected ItemType supplyItem;

    /**
     * Gets the value of the lineNumberNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link LineNumberNumericType }
     *     
     */
    public LineNumberNumericType getLineNumberNumeric() {
        return lineNumberNumeric;
    }

    /**
     * Sets the value of the lineNumberNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineNumberNumericType }
     *     
     */
    public void setLineNumberNumeric(LineNumberNumericType value) {
        this.lineNumberNumeric = value;
    }

    /**
     * Gets the value of the participatingLocationsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getParticipatingLocationsLocation() {
        return participatingLocationsLocation;
    }

    /**
     * Sets the value of the participatingLocationsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setParticipatingLocationsLocation(LocationType value) {
        this.participatingLocationsLocation = value;
    }

    /**
     * Gets the value of the retailPlannedImpact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPlannedImpact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailPlannedImpact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPlannedImpactType }
     * 
     * 
     */
    public List<RetailPlannedImpactType> getRetailPlannedImpact() {
        if (retailPlannedImpact == null) {
            retailPlannedImpact = new ArrayList<RetailPlannedImpactType>();
        }
        return this.retailPlannedImpact;
    }

    /**
     * Gets the value of the supplyItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getSupplyItem() {
        return supplyItem;
    }

    /**
     * Sets the value of the supplyItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setSupplyItem(ItemType value) {
        this.supplyItem = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            LineNumberNumericType theLineNumberNumeric;
            theLineNumberNumeric = this.getLineNumberNumeric();
            strategy.appendField(locator, this, "lineNumberNumeric", buffer, theLineNumberNumeric);
        }
        {
            LocationType theParticipatingLocationsLocation;
            theParticipatingLocationsLocation = this.getParticipatingLocationsLocation();
            strategy.appendField(locator, this, "participatingLocationsLocation", buffer, theParticipatingLocationsLocation);
        }
        {
            List<RetailPlannedImpactType> theRetailPlannedImpact;
            theRetailPlannedImpact = (((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty()))?this.getRetailPlannedImpact():null);
            strategy.appendField(locator, this, "retailPlannedImpact", buffer, theRetailPlannedImpact);
        }
        {
            ItemType theSupplyItem;
            theSupplyItem = this.getSupplyItem();
            strategy.appendField(locator, this, "supplyItem", buffer, theSupplyItem);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EventLineItemType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EventLineItemType that = ((EventLineItemType) object);
        {
            LineNumberNumericType lhsLineNumberNumeric;
            lhsLineNumberNumeric = this.getLineNumberNumeric();
            LineNumberNumericType rhsLineNumberNumeric;
            rhsLineNumberNumeric = that.getLineNumberNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumberNumeric", lhsLineNumberNumeric), LocatorUtils.property(thatLocator, "lineNumberNumeric", rhsLineNumberNumeric), lhsLineNumberNumeric, rhsLineNumberNumeric)) {
                return false;
            }
        }
        {
            LocationType lhsParticipatingLocationsLocation;
            lhsParticipatingLocationsLocation = this.getParticipatingLocationsLocation();
            LocationType rhsParticipatingLocationsLocation;
            rhsParticipatingLocationsLocation = that.getParticipatingLocationsLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participatingLocationsLocation", lhsParticipatingLocationsLocation), LocatorUtils.property(thatLocator, "participatingLocationsLocation", rhsParticipatingLocationsLocation), lhsParticipatingLocationsLocation, rhsParticipatingLocationsLocation)) {
                return false;
            }
        }
        {
            List<RetailPlannedImpactType> lhsRetailPlannedImpact;
            lhsRetailPlannedImpact = (((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty()))?this.getRetailPlannedImpact():null);
            List<RetailPlannedImpactType> rhsRetailPlannedImpact;
            rhsRetailPlannedImpact = (((that.retailPlannedImpact!= null)&&(!that.retailPlannedImpact.isEmpty()))?that.getRetailPlannedImpact():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retailPlannedImpact", lhsRetailPlannedImpact), LocatorUtils.property(thatLocator, "retailPlannedImpact", rhsRetailPlannedImpact), lhsRetailPlannedImpact, rhsRetailPlannedImpact)) {
                return false;
            }
        }
        {
            ItemType lhsSupplyItem;
            lhsSupplyItem = this.getSupplyItem();
            ItemType rhsSupplyItem;
            rhsSupplyItem = that.getSupplyItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyItem", lhsSupplyItem), LocatorUtils.property(thatLocator, "supplyItem", rhsSupplyItem), lhsSupplyItem, rhsSupplyItem)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            LineNumberNumericType theLineNumberNumeric;
            theLineNumberNumeric = this.getLineNumberNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumberNumeric", theLineNumberNumeric), currentHashCode, theLineNumberNumeric);
        }
        {
            LocationType theParticipatingLocationsLocation;
            theParticipatingLocationsLocation = this.getParticipatingLocationsLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participatingLocationsLocation", theParticipatingLocationsLocation), currentHashCode, theParticipatingLocationsLocation);
        }
        {
            List<RetailPlannedImpactType> theRetailPlannedImpact;
            theRetailPlannedImpact = (((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty()))?this.getRetailPlannedImpact():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retailPlannedImpact", theRetailPlannedImpact), currentHashCode, theRetailPlannedImpact);
        }
        {
            ItemType theSupplyItem;
            theSupplyItem = this.getSupplyItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyItem", theSupplyItem), currentHashCode, theSupplyItem);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
