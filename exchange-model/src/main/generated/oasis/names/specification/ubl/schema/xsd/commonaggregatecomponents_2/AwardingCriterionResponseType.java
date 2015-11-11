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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardingCriterionDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardingCriterionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
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
 * <p>Java class for AwardingCriterionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardingCriterionResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardingCriterionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardingCriterionDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubordinateAwardingCriterionResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardingCriterionResponseType", propOrder = {
    "id",
    "awardingCriterionID",
    "awardingCriterionDescription",
    "description",
    "quantity",
    "amount",
    "subordinateAwardingCriterionResponse"
})
public class AwardingCriterionResponseType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "AwardingCriterionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AwardingCriterionIDType awardingCriterionID;
    @XmlElement(name = "AwardingCriterionDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AwardingCriterionDescriptionType> awardingCriterionDescription;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AmountType amount;
    @XmlElement(name = "SubordinateAwardingCriterionResponse")
    protected List<AwardingCriterionResponseType> subordinateAwardingCriterionResponse;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the awardingCriterionID property.
     * 
     * @return
     *     possible object is
     *     {@link AwardingCriterionIDType }
     *     
     */
    public AwardingCriterionIDType getAwardingCriterionID() {
        return awardingCriterionID;
    }

    /**
     * Sets the value of the awardingCriterionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingCriterionIDType }
     *     
     */
    public void setAwardingCriterionID(AwardingCriterionIDType value) {
        this.awardingCriterionID = value;
    }

    /**
     * Gets the value of the awardingCriterionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardingCriterionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardingCriterionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionDescriptionType }
     * 
     * 
     */
    public List<AwardingCriterionDescriptionType> getAwardingCriterionDescription() {
        if (awardingCriterionDescription == null) {
            awardingCriterionDescription = new ArrayList<AwardingCriterionDescriptionType>();
        }
        return this.awardingCriterionDescription;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the subordinateAwardingCriterionResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subordinateAwardingCriterionResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubordinateAwardingCriterionResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionResponseType }
     * 
     * 
     */
    public List<AwardingCriterionResponseType> getSubordinateAwardingCriterionResponse() {
        if (subordinateAwardingCriterionResponse == null) {
            subordinateAwardingCriterionResponse = new ArrayList<AwardingCriterionResponseType>();
        }
        return this.subordinateAwardingCriterionResponse;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            AwardingCriterionIDType theAwardingCriterionID;
            theAwardingCriterionID = this.getAwardingCriterionID();
            strategy.appendField(locator, this, "awardingCriterionID", buffer, theAwardingCriterionID);
        }
        {
            List<AwardingCriterionDescriptionType> theAwardingCriterionDescription;
            theAwardingCriterionDescription = (((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty()))?this.getAwardingCriterionDescription():null);
            strategy.appendField(locator, this, "awardingCriterionDescription", buffer, theAwardingCriterionDescription);
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity);
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount);
        }
        {
            List<AwardingCriterionResponseType> theSubordinateAwardingCriterionResponse;
            theSubordinateAwardingCriterionResponse = (((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty()))?this.getSubordinateAwardingCriterionResponse():null);
            strategy.appendField(locator, this, "subordinateAwardingCriterionResponse", buffer, theSubordinateAwardingCriterionResponse);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AwardingCriterionResponseType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AwardingCriterionResponseType that = ((AwardingCriterionResponseType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            AwardingCriterionIDType lhsAwardingCriterionID;
            lhsAwardingCriterionID = this.getAwardingCriterionID();
            AwardingCriterionIDType rhsAwardingCriterionID;
            rhsAwardingCriterionID = that.getAwardingCriterionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardingCriterionID", lhsAwardingCriterionID), LocatorUtils.property(thatLocator, "awardingCriterionID", rhsAwardingCriterionID), lhsAwardingCriterionID, rhsAwardingCriterionID)) {
                return false;
            }
        }
        {
            List<AwardingCriterionDescriptionType> lhsAwardingCriterionDescription;
            lhsAwardingCriterionDescription = (((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty()))?this.getAwardingCriterionDescription():null);
            List<AwardingCriterionDescriptionType> rhsAwardingCriterionDescription;
            rhsAwardingCriterionDescription = (((that.awardingCriterionDescription!= null)&&(!that.awardingCriterionDescription.isEmpty()))?that.getAwardingCriterionDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardingCriterionDescription", lhsAwardingCriterionDescription), LocatorUtils.property(thatLocator, "awardingCriterionDescription", rhsAwardingCriterionDescription), lhsAwardingCriterionDescription, rhsAwardingCriterionDescription)) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
                return false;
            }
        }
        {
            AmountType lhsAmount;
            lhsAmount = this.getAmount();
            AmountType rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount)) {
                return false;
            }
        }
        {
            List<AwardingCriterionResponseType> lhsSubordinateAwardingCriterionResponse;
            lhsSubordinateAwardingCriterionResponse = (((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty()))?this.getSubordinateAwardingCriterionResponse():null);
            List<AwardingCriterionResponseType> rhsSubordinateAwardingCriterionResponse;
            rhsSubordinateAwardingCriterionResponse = (((that.subordinateAwardingCriterionResponse!= null)&&(!that.subordinateAwardingCriterionResponse.isEmpty()))?that.getSubordinateAwardingCriterionResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subordinateAwardingCriterionResponse", lhsSubordinateAwardingCriterionResponse), LocatorUtils.property(thatLocator, "subordinateAwardingCriterionResponse", rhsSubordinateAwardingCriterionResponse), lhsSubordinateAwardingCriterionResponse, rhsSubordinateAwardingCriterionResponse)) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            AwardingCriterionIDType theAwardingCriterionID;
            theAwardingCriterionID = this.getAwardingCriterionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardingCriterionID", theAwardingCriterionID), currentHashCode, theAwardingCriterionID);
        }
        {
            List<AwardingCriterionDescriptionType> theAwardingCriterionDescription;
            theAwardingCriterionDescription = (((this.awardingCriterionDescription!= null)&&(!this.awardingCriterionDescription.isEmpty()))?this.getAwardingCriterionDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardingCriterionDescription", theAwardingCriterionDescription), currentHashCode, theAwardingCriterionDescription);
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount);
        }
        {
            List<AwardingCriterionResponseType> theSubordinateAwardingCriterionResponse;
            theSubordinateAwardingCriterionResponse = (((this.subordinateAwardingCriterionResponse!= null)&&(!this.subordinateAwardingCriterionResponse.isEmpty()))?this.getSubordinateAwardingCriterionResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subordinateAwardingCriterionResponse", theSubordinateAwardingCriterionResponse), currentHashCode, theSubordinateAwardingCriterionResponse);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
