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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CalculationRateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExchangeMarketIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MathematicOperatorCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceCurrencyBaseRateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TargetCurrencyBaseRateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TargetCurrencyCodeType;
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
 * <p>Java class for ExchangeRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceCurrencyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceCurrencyBaseRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetCurrencyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetCurrencyBaseRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExchangeMarketID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MathematicOperatorCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForeignExchangeContract" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateType", propOrder = {
    "sourceCurrencyCode",
    "sourceCurrencyBaseRate",
    "targetCurrencyCode",
    "targetCurrencyBaseRate",
    "exchangeMarketID",
    "calculationRate",
    "mathematicOperatorCode",
    "date",
    "foreignExchangeContract"
})
public class ExchangeRateType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SourceCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceCurrencyCodeType sourceCurrencyCode;
    @XmlElement(name = "SourceCurrencyBaseRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SourceCurrencyBaseRateType sourceCurrencyBaseRate;
    @XmlElement(name = "TargetCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TargetCurrencyCodeType targetCurrencyCode;
    @XmlElement(name = "TargetCurrencyBaseRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TargetCurrencyBaseRateType targetCurrencyBaseRate;
    @XmlElement(name = "ExchangeMarketID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExchangeMarketIDType exchangeMarketID;
    @XmlElement(name = "CalculationRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CalculationRateType calculationRate;
    @XmlElement(name = "MathematicOperatorCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MathematicOperatorCodeType mathematicOperatorCode;
    @XmlElement(name = "Date", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DateType date;
    @XmlElement(name = "ForeignExchangeContract")
    protected ContractType foreignExchangeContract;

    /**
     * Gets the value of the sourceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyCodeType }
     *     
     */
    public SourceCurrencyCodeType getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Sets the value of the sourceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyCodeType }
     *     
     */
    public void setSourceCurrencyCode(SourceCurrencyCodeType value) {
        this.sourceCurrencyCode = value;
    }

    /**
     * Gets the value of the sourceCurrencyBaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyBaseRateType }
     *     
     */
    public SourceCurrencyBaseRateType getSourceCurrencyBaseRate() {
        return sourceCurrencyBaseRate;
    }

    /**
     * Sets the value of the sourceCurrencyBaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyBaseRateType }
     *     
     */
    public void setSourceCurrencyBaseRate(SourceCurrencyBaseRateType value) {
        this.sourceCurrencyBaseRate = value;
    }

    /**
     * Gets the value of the targetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyCodeType }
     *     
     */
    public TargetCurrencyCodeType getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Sets the value of the targetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyCodeType }
     *     
     */
    public void setTargetCurrencyCode(TargetCurrencyCodeType value) {
        this.targetCurrencyCode = value;
    }

    /**
     * Gets the value of the targetCurrencyBaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyBaseRateType }
     *     
     */
    public TargetCurrencyBaseRateType getTargetCurrencyBaseRate() {
        return targetCurrencyBaseRate;
    }

    /**
     * Sets the value of the targetCurrencyBaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyBaseRateType }
     *     
     */
    public void setTargetCurrencyBaseRate(TargetCurrencyBaseRateType value) {
        this.targetCurrencyBaseRate = value;
    }

    /**
     * Gets the value of the exchangeMarketID property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeMarketIDType }
     *     
     */
    public ExchangeMarketIDType getExchangeMarketID() {
        return exchangeMarketID;
    }

    /**
     * Sets the value of the exchangeMarketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeMarketIDType }
     *     
     */
    public void setExchangeMarketID(ExchangeMarketIDType value) {
        this.exchangeMarketID = value;
    }

    /**
     * Gets the value of the calculationRate property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationRateType }
     *     
     */
    public CalculationRateType getCalculationRate() {
        return calculationRate;
    }

    /**
     * Sets the value of the calculationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationRateType }
     *     
     */
    public void setCalculationRate(CalculationRateType value) {
        this.calculationRate = value;
    }

    /**
     * Gets the value of the mathematicOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link MathematicOperatorCodeType }
     *     
     */
    public MathematicOperatorCodeType getMathematicOperatorCode() {
        return mathematicOperatorCode;
    }

    /**
     * Sets the value of the mathematicOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathematicOperatorCodeType }
     *     
     */
    public void setMathematicOperatorCode(MathematicOperatorCodeType value) {
        this.mathematicOperatorCode = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDate(DateType value) {
        this.date = value;
    }

    /**
     * Gets the value of the foreignExchangeContract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getForeignExchangeContract() {
        return foreignExchangeContract;
    }

    /**
     * Sets the value of the foreignExchangeContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setForeignExchangeContract(ContractType value) {
        this.foreignExchangeContract = value;
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
            SourceCurrencyCodeType theSourceCurrencyCode;
            theSourceCurrencyCode = this.getSourceCurrencyCode();
            strategy.appendField(locator, this, "sourceCurrencyCode", buffer, theSourceCurrencyCode);
        }
        {
            SourceCurrencyBaseRateType theSourceCurrencyBaseRate;
            theSourceCurrencyBaseRate = this.getSourceCurrencyBaseRate();
            strategy.appendField(locator, this, "sourceCurrencyBaseRate", buffer, theSourceCurrencyBaseRate);
        }
        {
            TargetCurrencyCodeType theTargetCurrencyCode;
            theTargetCurrencyCode = this.getTargetCurrencyCode();
            strategy.appendField(locator, this, "targetCurrencyCode", buffer, theTargetCurrencyCode);
        }
        {
            TargetCurrencyBaseRateType theTargetCurrencyBaseRate;
            theTargetCurrencyBaseRate = this.getTargetCurrencyBaseRate();
            strategy.appendField(locator, this, "targetCurrencyBaseRate", buffer, theTargetCurrencyBaseRate);
        }
        {
            ExchangeMarketIDType theExchangeMarketID;
            theExchangeMarketID = this.getExchangeMarketID();
            strategy.appendField(locator, this, "exchangeMarketID", buffer, theExchangeMarketID);
        }
        {
            CalculationRateType theCalculationRate;
            theCalculationRate = this.getCalculationRate();
            strategy.appendField(locator, this, "calculationRate", buffer, theCalculationRate);
        }
        {
            MathematicOperatorCodeType theMathematicOperatorCode;
            theMathematicOperatorCode = this.getMathematicOperatorCode();
            strategy.appendField(locator, this, "mathematicOperatorCode", buffer, theMathematicOperatorCode);
        }
        {
            DateType theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            ContractType theForeignExchangeContract;
            theForeignExchangeContract = this.getForeignExchangeContract();
            strategy.appendField(locator, this, "foreignExchangeContract", buffer, theForeignExchangeContract);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExchangeRateType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExchangeRateType that = ((ExchangeRateType) object);
        {
            SourceCurrencyCodeType lhsSourceCurrencyCode;
            lhsSourceCurrencyCode = this.getSourceCurrencyCode();
            SourceCurrencyCodeType rhsSourceCurrencyCode;
            rhsSourceCurrencyCode = that.getSourceCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceCurrencyCode", lhsSourceCurrencyCode), LocatorUtils.property(thatLocator, "sourceCurrencyCode", rhsSourceCurrencyCode), lhsSourceCurrencyCode, rhsSourceCurrencyCode)) {
                return false;
            }
        }
        {
            SourceCurrencyBaseRateType lhsSourceCurrencyBaseRate;
            lhsSourceCurrencyBaseRate = this.getSourceCurrencyBaseRate();
            SourceCurrencyBaseRateType rhsSourceCurrencyBaseRate;
            rhsSourceCurrencyBaseRate = that.getSourceCurrencyBaseRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceCurrencyBaseRate", lhsSourceCurrencyBaseRate), LocatorUtils.property(thatLocator, "sourceCurrencyBaseRate", rhsSourceCurrencyBaseRate), lhsSourceCurrencyBaseRate, rhsSourceCurrencyBaseRate)) {
                return false;
            }
        }
        {
            TargetCurrencyCodeType lhsTargetCurrencyCode;
            lhsTargetCurrencyCode = this.getTargetCurrencyCode();
            TargetCurrencyCodeType rhsTargetCurrencyCode;
            rhsTargetCurrencyCode = that.getTargetCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetCurrencyCode", lhsTargetCurrencyCode), LocatorUtils.property(thatLocator, "targetCurrencyCode", rhsTargetCurrencyCode), lhsTargetCurrencyCode, rhsTargetCurrencyCode)) {
                return false;
            }
        }
        {
            TargetCurrencyBaseRateType lhsTargetCurrencyBaseRate;
            lhsTargetCurrencyBaseRate = this.getTargetCurrencyBaseRate();
            TargetCurrencyBaseRateType rhsTargetCurrencyBaseRate;
            rhsTargetCurrencyBaseRate = that.getTargetCurrencyBaseRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetCurrencyBaseRate", lhsTargetCurrencyBaseRate), LocatorUtils.property(thatLocator, "targetCurrencyBaseRate", rhsTargetCurrencyBaseRate), lhsTargetCurrencyBaseRate, rhsTargetCurrencyBaseRate)) {
                return false;
            }
        }
        {
            ExchangeMarketIDType lhsExchangeMarketID;
            lhsExchangeMarketID = this.getExchangeMarketID();
            ExchangeMarketIDType rhsExchangeMarketID;
            rhsExchangeMarketID = that.getExchangeMarketID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exchangeMarketID", lhsExchangeMarketID), LocatorUtils.property(thatLocator, "exchangeMarketID", rhsExchangeMarketID), lhsExchangeMarketID, rhsExchangeMarketID)) {
                return false;
            }
        }
        {
            CalculationRateType lhsCalculationRate;
            lhsCalculationRate = this.getCalculationRate();
            CalculationRateType rhsCalculationRate;
            rhsCalculationRate = that.getCalculationRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculationRate", lhsCalculationRate), LocatorUtils.property(thatLocator, "calculationRate", rhsCalculationRate), lhsCalculationRate, rhsCalculationRate)) {
                return false;
            }
        }
        {
            MathematicOperatorCodeType lhsMathematicOperatorCode;
            lhsMathematicOperatorCode = this.getMathematicOperatorCode();
            MathematicOperatorCodeType rhsMathematicOperatorCode;
            rhsMathematicOperatorCode = that.getMathematicOperatorCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mathematicOperatorCode", lhsMathematicOperatorCode), LocatorUtils.property(thatLocator, "mathematicOperatorCode", rhsMathematicOperatorCode), lhsMathematicOperatorCode, rhsMathematicOperatorCode)) {
                return false;
            }
        }
        {
            DateType lhsDate;
            lhsDate = this.getDate();
            DateType rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            ContractType lhsForeignExchangeContract;
            lhsForeignExchangeContract = this.getForeignExchangeContract();
            ContractType rhsForeignExchangeContract;
            rhsForeignExchangeContract = that.getForeignExchangeContract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "foreignExchangeContract", lhsForeignExchangeContract), LocatorUtils.property(thatLocator, "foreignExchangeContract", rhsForeignExchangeContract), lhsForeignExchangeContract, rhsForeignExchangeContract)) {
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
            SourceCurrencyCodeType theSourceCurrencyCode;
            theSourceCurrencyCode = this.getSourceCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceCurrencyCode", theSourceCurrencyCode), currentHashCode, theSourceCurrencyCode);
        }
        {
            SourceCurrencyBaseRateType theSourceCurrencyBaseRate;
            theSourceCurrencyBaseRate = this.getSourceCurrencyBaseRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceCurrencyBaseRate", theSourceCurrencyBaseRate), currentHashCode, theSourceCurrencyBaseRate);
        }
        {
            TargetCurrencyCodeType theTargetCurrencyCode;
            theTargetCurrencyCode = this.getTargetCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetCurrencyCode", theTargetCurrencyCode), currentHashCode, theTargetCurrencyCode);
        }
        {
            TargetCurrencyBaseRateType theTargetCurrencyBaseRate;
            theTargetCurrencyBaseRate = this.getTargetCurrencyBaseRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetCurrencyBaseRate", theTargetCurrencyBaseRate), currentHashCode, theTargetCurrencyBaseRate);
        }
        {
            ExchangeMarketIDType theExchangeMarketID;
            theExchangeMarketID = this.getExchangeMarketID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeMarketID", theExchangeMarketID), currentHashCode, theExchangeMarketID);
        }
        {
            CalculationRateType theCalculationRate;
            theCalculationRate = this.getCalculationRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculationRate", theCalculationRate), currentHashCode, theCalculationRate);
        }
        {
            MathematicOperatorCodeType theMathematicOperatorCode;
            theMathematicOperatorCode = this.getMathematicOperatorCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mathematicOperatorCode", theMathematicOperatorCode), currentHashCode, theMathematicOperatorCode);
        }
        {
            DateType theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            ContractType theForeignExchangeContract;
            theForeignExchangeContract = this.getForeignExchangeContract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "foreignExchangeContract", theForeignExchangeContract), currentHashCode, theForeignExchangeContract);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
