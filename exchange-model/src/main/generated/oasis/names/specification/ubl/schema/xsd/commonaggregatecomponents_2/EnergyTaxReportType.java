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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxEnergyAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxEnergyBalanceAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxEnergyOnAccountAmountType;
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
 * <p>Java class for EnergyTaxReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyTaxReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyOnAccountAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyBalanceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyTaxReportType", propOrder = {
    "taxEnergyAmount",
    "taxEnergyOnAccountAmount",
    "taxEnergyBalanceAmount",
    "taxScheme"
})
public class EnergyTaxReportType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TaxEnergyAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyAmountType taxEnergyAmount;
    @XmlElement(name = "TaxEnergyOnAccountAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyOnAccountAmountType taxEnergyOnAccountAmount;
    @XmlElement(name = "TaxEnergyBalanceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxEnergyBalanceAmountType taxEnergyBalanceAmount;
    @XmlElement(name = "TaxScheme", required = true)
    protected TaxSchemeType taxScheme;

    /**
     * Gets the value of the taxEnergyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyAmountType }
     *     
     */
    public TaxEnergyAmountType getTaxEnergyAmount() {
        return taxEnergyAmount;
    }

    /**
     * Sets the value of the taxEnergyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyAmountType }
     *     
     */
    public void setTaxEnergyAmount(TaxEnergyAmountType value) {
        this.taxEnergyAmount = value;
    }

    /**
     * Gets the value of the taxEnergyOnAccountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyOnAccountAmountType }
     *     
     */
    public TaxEnergyOnAccountAmountType getTaxEnergyOnAccountAmount() {
        return taxEnergyOnAccountAmount;
    }

    /**
     * Sets the value of the taxEnergyOnAccountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyOnAccountAmountType }
     *     
     */
    public void setTaxEnergyOnAccountAmount(TaxEnergyOnAccountAmountType value) {
        this.taxEnergyOnAccountAmount = value;
    }

    /**
     * Gets the value of the taxEnergyBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyBalanceAmountType }
     *     
     */
    public TaxEnergyBalanceAmountType getTaxEnergyBalanceAmount() {
        return taxEnergyBalanceAmount;
    }

    /**
     * Sets the value of the taxEnergyBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyBalanceAmountType }
     *     
     */
    public void setTaxEnergyBalanceAmount(TaxEnergyBalanceAmountType value) {
        this.taxEnergyBalanceAmount = value;
    }

    /**
     * Gets the value of the taxScheme property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSchemeType }
     *     
     */
    public TaxSchemeType getTaxScheme() {
        return taxScheme;
    }

    /**
     * Sets the value of the taxScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSchemeType }
     *     
     */
    public void setTaxScheme(TaxSchemeType value) {
        this.taxScheme = value;
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
            TaxEnergyAmountType theTaxEnergyAmount;
            theTaxEnergyAmount = this.getTaxEnergyAmount();
            strategy.appendField(locator, this, "taxEnergyAmount", buffer, theTaxEnergyAmount);
        }
        {
            TaxEnergyOnAccountAmountType theTaxEnergyOnAccountAmount;
            theTaxEnergyOnAccountAmount = this.getTaxEnergyOnAccountAmount();
            strategy.appendField(locator, this, "taxEnergyOnAccountAmount", buffer, theTaxEnergyOnAccountAmount);
        }
        {
            TaxEnergyBalanceAmountType theTaxEnergyBalanceAmount;
            theTaxEnergyBalanceAmount = this.getTaxEnergyBalanceAmount();
            strategy.appendField(locator, this, "taxEnergyBalanceAmount", buffer, theTaxEnergyBalanceAmount);
        }
        {
            TaxSchemeType theTaxScheme;
            theTaxScheme = this.getTaxScheme();
            strategy.appendField(locator, this, "taxScheme", buffer, theTaxScheme);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EnergyTaxReportType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EnergyTaxReportType that = ((EnergyTaxReportType) object);
        {
            TaxEnergyAmountType lhsTaxEnergyAmount;
            lhsTaxEnergyAmount = this.getTaxEnergyAmount();
            TaxEnergyAmountType rhsTaxEnergyAmount;
            rhsTaxEnergyAmount = that.getTaxEnergyAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxEnergyAmount", lhsTaxEnergyAmount), LocatorUtils.property(thatLocator, "taxEnergyAmount", rhsTaxEnergyAmount), lhsTaxEnergyAmount, rhsTaxEnergyAmount)) {
                return false;
            }
        }
        {
            TaxEnergyOnAccountAmountType lhsTaxEnergyOnAccountAmount;
            lhsTaxEnergyOnAccountAmount = this.getTaxEnergyOnAccountAmount();
            TaxEnergyOnAccountAmountType rhsTaxEnergyOnAccountAmount;
            rhsTaxEnergyOnAccountAmount = that.getTaxEnergyOnAccountAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxEnergyOnAccountAmount", lhsTaxEnergyOnAccountAmount), LocatorUtils.property(thatLocator, "taxEnergyOnAccountAmount", rhsTaxEnergyOnAccountAmount), lhsTaxEnergyOnAccountAmount, rhsTaxEnergyOnAccountAmount)) {
                return false;
            }
        }
        {
            TaxEnergyBalanceAmountType lhsTaxEnergyBalanceAmount;
            lhsTaxEnergyBalanceAmount = this.getTaxEnergyBalanceAmount();
            TaxEnergyBalanceAmountType rhsTaxEnergyBalanceAmount;
            rhsTaxEnergyBalanceAmount = that.getTaxEnergyBalanceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxEnergyBalanceAmount", lhsTaxEnergyBalanceAmount), LocatorUtils.property(thatLocator, "taxEnergyBalanceAmount", rhsTaxEnergyBalanceAmount), lhsTaxEnergyBalanceAmount, rhsTaxEnergyBalanceAmount)) {
                return false;
            }
        }
        {
            TaxSchemeType lhsTaxScheme;
            lhsTaxScheme = this.getTaxScheme();
            TaxSchemeType rhsTaxScheme;
            rhsTaxScheme = that.getTaxScheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxScheme", lhsTaxScheme), LocatorUtils.property(thatLocator, "taxScheme", rhsTaxScheme), lhsTaxScheme, rhsTaxScheme)) {
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
            TaxEnergyAmountType theTaxEnergyAmount;
            theTaxEnergyAmount = this.getTaxEnergyAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxEnergyAmount", theTaxEnergyAmount), currentHashCode, theTaxEnergyAmount);
        }
        {
            TaxEnergyOnAccountAmountType theTaxEnergyOnAccountAmount;
            theTaxEnergyOnAccountAmount = this.getTaxEnergyOnAccountAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxEnergyOnAccountAmount", theTaxEnergyOnAccountAmount), currentHashCode, theTaxEnergyOnAccountAmount);
        }
        {
            TaxEnergyBalanceAmountType theTaxEnergyBalanceAmount;
            theTaxEnergyBalanceAmount = this.getTaxEnergyBalanceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxEnergyBalanceAmount", theTaxEnergyBalanceAmount), currentHashCode, theTaxEnergyBalanceAmount);
        }
        {
            TaxSchemeType theTaxScheme;
            theTaxScheme = this.getTaxScheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxScheme", theTaxScheme), currentHashCode, theTaxScheme);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
