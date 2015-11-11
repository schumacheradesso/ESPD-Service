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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CargoTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CommodityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ItemClassificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NatureCodeType;
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
 * <p>Java class for CommodityClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CargoTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ItemClassificationCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityClassificationType", propOrder = {
    "natureCode",
    "cargoTypeCode",
    "commodityCode",
    "itemClassificationCode"
})
public class CommodityClassificationType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "NatureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NatureCodeType natureCode;
    @XmlElement(name = "CargoTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CargoTypeCodeType cargoTypeCode;
    @XmlElement(name = "CommodityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CommodityCodeType commodityCode;
    @XmlElement(name = "ItemClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ItemClassificationCodeType itemClassificationCode;

    /**
     * Gets the value of the natureCode property.
     * 
     * @return
     *     possible object is
     *     {@link NatureCodeType }
     *     
     */
    public NatureCodeType getNatureCode() {
        return natureCode;
    }

    /**
     * Sets the value of the natureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureCodeType }
     *     
     */
    public void setNatureCode(NatureCodeType value) {
        this.natureCode = value;
    }

    /**
     * Gets the value of the cargoTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CargoTypeCodeType }
     *     
     */
    public CargoTypeCodeType getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * Sets the value of the cargoTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoTypeCodeType }
     *     
     */
    public void setCargoTypeCode(CargoTypeCodeType value) {
        this.cargoTypeCode = value;
    }

    /**
     * Gets the value of the commodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityCodeType }
     *     
     */
    public CommodityCodeType getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCodeType }
     *     
     */
    public void setCommodityCode(CommodityCodeType value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the itemClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ItemClassificationCodeType }
     *     
     */
    public ItemClassificationCodeType getItemClassificationCode() {
        return itemClassificationCode;
    }

    /**
     * Sets the value of the itemClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemClassificationCodeType }
     *     
     */
    public void setItemClassificationCode(ItemClassificationCodeType value) {
        this.itemClassificationCode = value;
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
            NatureCodeType theNatureCode;
            theNatureCode = this.getNatureCode();
            strategy.appendField(locator, this, "natureCode", buffer, theNatureCode);
        }
        {
            CargoTypeCodeType theCargoTypeCode;
            theCargoTypeCode = this.getCargoTypeCode();
            strategy.appendField(locator, this, "cargoTypeCode", buffer, theCargoTypeCode);
        }
        {
            CommodityCodeType theCommodityCode;
            theCommodityCode = this.getCommodityCode();
            strategy.appendField(locator, this, "commodityCode", buffer, theCommodityCode);
        }
        {
            ItemClassificationCodeType theItemClassificationCode;
            theItemClassificationCode = this.getItemClassificationCode();
            strategy.appendField(locator, this, "itemClassificationCode", buffer, theItemClassificationCode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CommodityClassificationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CommodityClassificationType that = ((CommodityClassificationType) object);
        {
            NatureCodeType lhsNatureCode;
            lhsNatureCode = this.getNatureCode();
            NatureCodeType rhsNatureCode;
            rhsNatureCode = that.getNatureCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "natureCode", lhsNatureCode), LocatorUtils.property(thatLocator, "natureCode", rhsNatureCode), lhsNatureCode, rhsNatureCode)) {
                return false;
            }
        }
        {
            CargoTypeCodeType lhsCargoTypeCode;
            lhsCargoTypeCode = this.getCargoTypeCode();
            CargoTypeCodeType rhsCargoTypeCode;
            rhsCargoTypeCode = that.getCargoTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cargoTypeCode", lhsCargoTypeCode), LocatorUtils.property(thatLocator, "cargoTypeCode", rhsCargoTypeCode), lhsCargoTypeCode, rhsCargoTypeCode)) {
                return false;
            }
        }
        {
            CommodityCodeType lhsCommodityCode;
            lhsCommodityCode = this.getCommodityCode();
            CommodityCodeType rhsCommodityCode;
            rhsCommodityCode = that.getCommodityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commodityCode", lhsCommodityCode), LocatorUtils.property(thatLocator, "commodityCode", rhsCommodityCode), lhsCommodityCode, rhsCommodityCode)) {
                return false;
            }
        }
        {
            ItemClassificationCodeType lhsItemClassificationCode;
            lhsItemClassificationCode = this.getItemClassificationCode();
            ItemClassificationCodeType rhsItemClassificationCode;
            rhsItemClassificationCode = that.getItemClassificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemClassificationCode", lhsItemClassificationCode), LocatorUtils.property(thatLocator, "itemClassificationCode", rhsItemClassificationCode), lhsItemClassificationCode, rhsItemClassificationCode)) {
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
            NatureCodeType theNatureCode;
            theNatureCode = this.getNatureCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "natureCode", theNatureCode), currentHashCode, theNatureCode);
        }
        {
            CargoTypeCodeType theCargoTypeCode;
            theCargoTypeCode = this.getCargoTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cargoTypeCode", theCargoTypeCode), currentHashCode, theCargoTypeCode);
        }
        {
            CommodityCodeType theCommodityCode;
            theCommodityCode = this.getCommodityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commodityCode", theCommodityCode), currentHashCode, theCommodityCode);
        }
        {
            ItemClassificationCodeType theItemClassificationCode;
            theItemClassificationCode = this.getItemClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemClassificationCode", theItemClassificationCode), currentHashCode, theItemClassificationCode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
