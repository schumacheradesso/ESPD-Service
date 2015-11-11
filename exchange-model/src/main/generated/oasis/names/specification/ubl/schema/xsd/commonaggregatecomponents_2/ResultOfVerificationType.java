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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidateProcessType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidateToolType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidateToolVersionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationResultCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidatorIDType;
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
 * <p>Java class for ResultOfVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultOfVerificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidatorID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationResultCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateProcess" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateTool" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateToolVersion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SignatoryParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultOfVerificationType", propOrder = {
    "validatorID",
    "validationResultCode",
    "validationDate",
    "validationTime",
    "validateProcess",
    "validateTool",
    "validateToolVersion",
    "signatoryParty"
})
public class ResultOfVerificationType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ValidatorID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidatorIDType validatorID;
    @XmlElement(name = "ValidationResultCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationResultCodeType validationResultCode;
    @XmlElement(name = "ValidationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationDateType validationDate;
    @XmlElement(name = "ValidationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationTimeType validationTime;
    @XmlElement(name = "ValidateProcess", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateProcessType validateProcess;
    @XmlElement(name = "ValidateTool", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateToolType validateTool;
    @XmlElement(name = "ValidateToolVersion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidateToolVersionType validateToolVersion;
    @XmlElement(name = "SignatoryParty")
    protected PartyType signatoryParty;

    /**
     * Gets the value of the validatorID property.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorIDType }
     *     
     */
    public ValidatorIDType getValidatorID() {
        return validatorID;
    }

    /**
     * Sets the value of the validatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorIDType }
     *     
     */
    public void setValidatorID(ValidatorIDType value) {
        this.validatorID = value;
    }

    /**
     * Gets the value of the validationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResultCodeType }
     *     
     */
    public ValidationResultCodeType getValidationResultCode() {
        return validationResultCode;
    }

    /**
     * Sets the value of the validationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResultCodeType }
     *     
     */
    public void setValidationResultCode(ValidationResultCodeType value) {
        this.validationResultCode = value;
    }

    /**
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDateType }
     *     
     */
    public ValidationDateType getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDateType }
     *     
     */
    public void setValidationDate(ValidationDateType value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the validationTime property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationTimeType }
     *     
     */
    public ValidationTimeType getValidationTime() {
        return validationTime;
    }

    /**
     * Sets the value of the validationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationTimeType }
     *     
     */
    public void setValidationTime(ValidationTimeType value) {
        this.validationTime = value;
    }

    /**
     * Gets the value of the validateProcess property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateProcessType }
     *     
     */
    public ValidateProcessType getValidateProcess() {
        return validateProcess;
    }

    /**
     * Sets the value of the validateProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateProcessType }
     *     
     */
    public void setValidateProcess(ValidateProcessType value) {
        this.validateProcess = value;
    }

    /**
     * Gets the value of the validateTool property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateToolType }
     *     
     */
    public ValidateToolType getValidateTool() {
        return validateTool;
    }

    /**
     * Sets the value of the validateTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateToolType }
     *     
     */
    public void setValidateTool(ValidateToolType value) {
        this.validateTool = value;
    }

    /**
     * Gets the value of the validateToolVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateToolVersionType }
     *     
     */
    public ValidateToolVersionType getValidateToolVersion() {
        return validateToolVersion;
    }

    /**
     * Sets the value of the validateToolVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateToolVersionType }
     *     
     */
    public void setValidateToolVersion(ValidateToolVersionType value) {
        this.validateToolVersion = value;
    }

    /**
     * Gets the value of the signatoryParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSignatoryParty() {
        return signatoryParty;
    }

    /**
     * Sets the value of the signatoryParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSignatoryParty(PartyType value) {
        this.signatoryParty = value;
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
            ValidatorIDType theValidatorID;
            theValidatorID = this.getValidatorID();
            strategy.appendField(locator, this, "validatorID", buffer, theValidatorID);
        }
        {
            ValidationResultCodeType theValidationResultCode;
            theValidationResultCode = this.getValidationResultCode();
            strategy.appendField(locator, this, "validationResultCode", buffer, theValidationResultCode);
        }
        {
            ValidationDateType theValidationDate;
            theValidationDate = this.getValidationDate();
            strategy.appendField(locator, this, "validationDate", buffer, theValidationDate);
        }
        {
            ValidationTimeType theValidationTime;
            theValidationTime = this.getValidationTime();
            strategy.appendField(locator, this, "validationTime", buffer, theValidationTime);
        }
        {
            ValidateProcessType theValidateProcess;
            theValidateProcess = this.getValidateProcess();
            strategy.appendField(locator, this, "validateProcess", buffer, theValidateProcess);
        }
        {
            ValidateToolType theValidateTool;
            theValidateTool = this.getValidateTool();
            strategy.appendField(locator, this, "validateTool", buffer, theValidateTool);
        }
        {
            ValidateToolVersionType theValidateToolVersion;
            theValidateToolVersion = this.getValidateToolVersion();
            strategy.appendField(locator, this, "validateToolVersion", buffer, theValidateToolVersion);
        }
        {
            PartyType theSignatoryParty;
            theSignatoryParty = this.getSignatoryParty();
            strategy.appendField(locator, this, "signatoryParty", buffer, theSignatoryParty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ResultOfVerificationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResultOfVerificationType that = ((ResultOfVerificationType) object);
        {
            ValidatorIDType lhsValidatorID;
            lhsValidatorID = this.getValidatorID();
            ValidatorIDType rhsValidatorID;
            rhsValidatorID = that.getValidatorID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validatorID", lhsValidatorID), LocatorUtils.property(thatLocator, "validatorID", rhsValidatorID), lhsValidatorID, rhsValidatorID)) {
                return false;
            }
        }
        {
            ValidationResultCodeType lhsValidationResultCode;
            lhsValidationResultCode = this.getValidationResultCode();
            ValidationResultCodeType rhsValidationResultCode;
            rhsValidationResultCode = that.getValidationResultCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationResultCode", lhsValidationResultCode), LocatorUtils.property(thatLocator, "validationResultCode", rhsValidationResultCode), lhsValidationResultCode, rhsValidationResultCode)) {
                return false;
            }
        }
        {
            ValidationDateType lhsValidationDate;
            lhsValidationDate = this.getValidationDate();
            ValidationDateType rhsValidationDate;
            rhsValidationDate = that.getValidationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationDate", lhsValidationDate), LocatorUtils.property(thatLocator, "validationDate", rhsValidationDate), lhsValidationDate, rhsValidationDate)) {
                return false;
            }
        }
        {
            ValidationTimeType lhsValidationTime;
            lhsValidationTime = this.getValidationTime();
            ValidationTimeType rhsValidationTime;
            rhsValidationTime = that.getValidationTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationTime", lhsValidationTime), LocatorUtils.property(thatLocator, "validationTime", rhsValidationTime), lhsValidationTime, rhsValidationTime)) {
                return false;
            }
        }
        {
            ValidateProcessType lhsValidateProcess;
            lhsValidateProcess = this.getValidateProcess();
            ValidateProcessType rhsValidateProcess;
            rhsValidateProcess = that.getValidateProcess();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validateProcess", lhsValidateProcess), LocatorUtils.property(thatLocator, "validateProcess", rhsValidateProcess), lhsValidateProcess, rhsValidateProcess)) {
                return false;
            }
        }
        {
            ValidateToolType lhsValidateTool;
            lhsValidateTool = this.getValidateTool();
            ValidateToolType rhsValidateTool;
            rhsValidateTool = that.getValidateTool();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validateTool", lhsValidateTool), LocatorUtils.property(thatLocator, "validateTool", rhsValidateTool), lhsValidateTool, rhsValidateTool)) {
                return false;
            }
        }
        {
            ValidateToolVersionType lhsValidateToolVersion;
            lhsValidateToolVersion = this.getValidateToolVersion();
            ValidateToolVersionType rhsValidateToolVersion;
            rhsValidateToolVersion = that.getValidateToolVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validateToolVersion", lhsValidateToolVersion), LocatorUtils.property(thatLocator, "validateToolVersion", rhsValidateToolVersion), lhsValidateToolVersion, rhsValidateToolVersion)) {
                return false;
            }
        }
        {
            PartyType lhsSignatoryParty;
            lhsSignatoryParty = this.getSignatoryParty();
            PartyType rhsSignatoryParty;
            rhsSignatoryParty = that.getSignatoryParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatoryParty", lhsSignatoryParty), LocatorUtils.property(thatLocator, "signatoryParty", rhsSignatoryParty), lhsSignatoryParty, rhsSignatoryParty)) {
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
            ValidatorIDType theValidatorID;
            theValidatorID = this.getValidatorID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validatorID", theValidatorID), currentHashCode, theValidatorID);
        }
        {
            ValidationResultCodeType theValidationResultCode;
            theValidationResultCode = this.getValidationResultCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationResultCode", theValidationResultCode), currentHashCode, theValidationResultCode);
        }
        {
            ValidationDateType theValidationDate;
            theValidationDate = this.getValidationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationDate", theValidationDate), currentHashCode, theValidationDate);
        }
        {
            ValidationTimeType theValidationTime;
            theValidationTime = this.getValidationTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationTime", theValidationTime), currentHashCode, theValidationTime);
        }
        {
            ValidateProcessType theValidateProcess;
            theValidateProcess = this.getValidateProcess();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validateProcess", theValidateProcess), currentHashCode, theValidateProcess);
        }
        {
            ValidateToolType theValidateTool;
            theValidateTool = this.getValidateTool();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validateTool", theValidateTool), currentHashCode, theValidateTool);
        }
        {
            ValidateToolVersionType theValidateToolVersion;
            theValidateToolVersion = this.getValidateToolVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validateToolVersion", theValidateToolVersion), currentHashCode, theValidateToolVersion);
        }
        {
            PartyType theSignatoryParty;
            theSignatoryParty = this.getSignatoryParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatoryParty", theSignatoryParty), currentHashCode, theSignatoryParty);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
