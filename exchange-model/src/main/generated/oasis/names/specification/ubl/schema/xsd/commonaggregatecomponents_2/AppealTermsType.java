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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
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
 * <p>Java class for AppealTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppealTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PresentationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AppealInformationParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AppealReceiverParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MediationParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppealTermsType", propOrder = {
    "description",
    "presentationPeriod",
    "appealInformationParty",
    "appealReceiverParty",
    "mediationParty"
})
public class AppealTermsType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "PresentationPeriod")
    protected PeriodType presentationPeriod;
    @XmlElement(name = "AppealInformationParty")
    protected PartyType appealInformationParty;
    @XmlElement(name = "AppealReceiverParty")
    protected PartyType appealReceiverParty;
    @XmlElement(name = "MediationParty")
    protected PartyType mediationParty;

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
     * Gets the value of the presentationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPresentationPeriod() {
        return presentationPeriod;
    }

    /**
     * Sets the value of the presentationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPresentationPeriod(PeriodType value) {
        this.presentationPeriod = value;
    }

    /**
     * Gets the value of the appealInformationParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAppealInformationParty() {
        return appealInformationParty;
    }

    /**
     * Sets the value of the appealInformationParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAppealInformationParty(PartyType value) {
        this.appealInformationParty = value;
    }

    /**
     * Gets the value of the appealReceiverParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAppealReceiverParty() {
        return appealReceiverParty;
    }

    /**
     * Sets the value of the appealReceiverParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAppealReceiverParty(PartyType value) {
        this.appealReceiverParty = value;
    }

    /**
     * Gets the value of the mediationParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getMediationParty() {
        return mediationParty;
    }

    /**
     * Sets the value of the mediationParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setMediationParty(PartyType value) {
        this.mediationParty = value;
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            PeriodType thePresentationPeriod;
            thePresentationPeriod = this.getPresentationPeriod();
            strategy.appendField(locator, this, "presentationPeriod", buffer, thePresentationPeriod);
        }
        {
            PartyType theAppealInformationParty;
            theAppealInformationParty = this.getAppealInformationParty();
            strategy.appendField(locator, this, "appealInformationParty", buffer, theAppealInformationParty);
        }
        {
            PartyType theAppealReceiverParty;
            theAppealReceiverParty = this.getAppealReceiverParty();
            strategy.appendField(locator, this, "appealReceiverParty", buffer, theAppealReceiverParty);
        }
        {
            PartyType theMediationParty;
            theMediationParty = this.getMediationParty();
            strategy.appendField(locator, this, "mediationParty", buffer, theMediationParty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AppealTermsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AppealTermsType that = ((AppealTermsType) object);
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
            PeriodType lhsPresentationPeriod;
            lhsPresentationPeriod = this.getPresentationPeriod();
            PeriodType rhsPresentationPeriod;
            rhsPresentationPeriod = that.getPresentationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "presentationPeriod", lhsPresentationPeriod), LocatorUtils.property(thatLocator, "presentationPeriod", rhsPresentationPeriod), lhsPresentationPeriod, rhsPresentationPeriod)) {
                return false;
            }
        }
        {
            PartyType lhsAppealInformationParty;
            lhsAppealInformationParty = this.getAppealInformationParty();
            PartyType rhsAppealInformationParty;
            rhsAppealInformationParty = that.getAppealInformationParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appealInformationParty", lhsAppealInformationParty), LocatorUtils.property(thatLocator, "appealInformationParty", rhsAppealInformationParty), lhsAppealInformationParty, rhsAppealInformationParty)) {
                return false;
            }
        }
        {
            PartyType lhsAppealReceiverParty;
            lhsAppealReceiverParty = this.getAppealReceiverParty();
            PartyType rhsAppealReceiverParty;
            rhsAppealReceiverParty = that.getAppealReceiverParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appealReceiverParty", lhsAppealReceiverParty), LocatorUtils.property(thatLocator, "appealReceiverParty", rhsAppealReceiverParty), lhsAppealReceiverParty, rhsAppealReceiverParty)) {
                return false;
            }
        }
        {
            PartyType lhsMediationParty;
            lhsMediationParty = this.getMediationParty();
            PartyType rhsMediationParty;
            rhsMediationParty = that.getMediationParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mediationParty", lhsMediationParty), LocatorUtils.property(thatLocator, "mediationParty", rhsMediationParty), lhsMediationParty, rhsMediationParty)) {
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            PeriodType thePresentationPeriod;
            thePresentationPeriod = this.getPresentationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "presentationPeriod", thePresentationPeriod), currentHashCode, thePresentationPeriod);
        }
        {
            PartyType theAppealInformationParty;
            theAppealInformationParty = this.getAppealInformationParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appealInformationParty", theAppealInformationParty), currentHashCode, theAppealInformationParty);
        }
        {
            PartyType theAppealReceiverParty;
            theAppealReceiverParty = this.getAppealReceiverParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appealReceiverParty", theAppealReceiverParty), currentHashCode, theAppealReceiverParty);
        }
        {
            PartyType theMediationParty;
            theMediationParty = this.getMediationParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mediationParty", theMediationParty), currentHashCode, theMediationParty);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
