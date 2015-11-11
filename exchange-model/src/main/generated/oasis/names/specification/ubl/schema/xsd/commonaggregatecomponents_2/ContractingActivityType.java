//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActivityTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActivityTypeType;
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
 * <p>Java class for ContractingActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractingActivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActivityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractingActivityType", propOrder = {
    "activityTypeCode",
    "activityType"
})
public class ContractingActivityType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActivityTypeCodeType activityTypeCode;
    @XmlElement(name = "ActivityType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActivityTypeType activityType;

    /**
     * Gets the value of the activityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityTypeCodeType }
     *     
     */
    public ActivityTypeCodeType getActivityTypeCode() {
        return activityTypeCode;
    }

    /**
     * Sets the value of the activityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityTypeCodeType }
     *     
     */
    public void setActivityTypeCode(ActivityTypeCodeType value) {
        this.activityTypeCode = value;
    }

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityTypeType }
     *     
     */
    public ActivityTypeType getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityTypeType }
     *     
     */
    public void setActivityType(ActivityTypeType value) {
        this.activityType = value;
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
            ActivityTypeCodeType theActivityTypeCode;
            theActivityTypeCode = this.getActivityTypeCode();
            strategy.appendField(locator, this, "activityTypeCode", buffer, theActivityTypeCode);
        }
        {
            ActivityTypeType theActivityType;
            theActivityType = this.getActivityType();
            strategy.appendField(locator, this, "activityType", buffer, theActivityType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContractingActivityType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContractingActivityType that = ((ContractingActivityType) object);
        {
            ActivityTypeCodeType lhsActivityTypeCode;
            lhsActivityTypeCode = this.getActivityTypeCode();
            ActivityTypeCodeType rhsActivityTypeCode;
            rhsActivityTypeCode = that.getActivityTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityTypeCode", lhsActivityTypeCode), LocatorUtils.property(thatLocator, "activityTypeCode", rhsActivityTypeCode), lhsActivityTypeCode, rhsActivityTypeCode)) {
                return false;
            }
        }
        {
            ActivityTypeType lhsActivityType;
            lhsActivityType = this.getActivityType();
            ActivityTypeType rhsActivityType;
            rhsActivityType = that.getActivityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityType", lhsActivityType), LocatorUtils.property(thatLocator, "activityType", rhsActivityType), lhsActivityType, rhsActivityType)) {
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
            ActivityTypeCodeType theActivityTypeCode;
            theActivityTypeCode = this.getActivityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityTypeCode", theActivityTypeCode), currentHashCode, theActivityTypeCode);
        }
        {
            ActivityTypeType theActivityType;
            theActivityType = this.getActivityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityType", theActivityType), currentHashCode, theActivityType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
