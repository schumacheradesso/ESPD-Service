//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package org.w3._2000._09.xmldsig_;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for X509IssuerSerialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X509IssuerSerialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509IssuerSerialType", propOrder = {
    "x509IssuerName",
    "x509SerialNumber"
})
public class X509IssuerSerialType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "X509IssuerName", required = true)
    protected String x509IssuerName;
    @XmlElement(name = "X509SerialNumber", required = true)
    protected BigInteger x509SerialNumber;

    /**
     * Gets the value of the x509IssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX509IssuerName() {
        return x509IssuerName;
    }

    /**
     * Sets the value of the x509IssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX509IssuerName(String value) {
        this.x509IssuerName = value;
    }

    /**
     * Gets the value of the x509SerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getX509SerialNumber() {
        return x509SerialNumber;
    }

    /**
     * Sets the value of the x509SerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setX509SerialNumber(BigInteger value) {
        this.x509SerialNumber = value;
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
            String theX509IssuerName;
            theX509IssuerName = this.getX509IssuerName();
            strategy.appendField(locator, this, "x509IssuerName", buffer, theX509IssuerName);
        }
        {
            BigInteger theX509SerialNumber;
            theX509SerialNumber = this.getX509SerialNumber();
            strategy.appendField(locator, this, "x509SerialNumber", buffer, theX509SerialNumber);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof X509IssuerSerialType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final X509IssuerSerialType that = ((X509IssuerSerialType) object);
        {
            String lhsX509IssuerName;
            lhsX509IssuerName = this.getX509IssuerName();
            String rhsX509IssuerName;
            rhsX509IssuerName = that.getX509IssuerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x509IssuerName", lhsX509IssuerName), LocatorUtils.property(thatLocator, "x509IssuerName", rhsX509IssuerName), lhsX509IssuerName, rhsX509IssuerName)) {
                return false;
            }
        }
        {
            BigInteger lhsX509SerialNumber;
            lhsX509SerialNumber = this.getX509SerialNumber();
            BigInteger rhsX509SerialNumber;
            rhsX509SerialNumber = that.getX509SerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x509SerialNumber", lhsX509SerialNumber), LocatorUtils.property(thatLocator, "x509SerialNumber", rhsX509SerialNumber), lhsX509SerialNumber, rhsX509SerialNumber)) {
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
            String theX509IssuerName;
            theX509IssuerName = this.getX509IssuerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x509IssuerName", theX509IssuerName), currentHashCode, theX509IssuerName);
        }
        {
            BigInteger theX509SerialNumber;
            theX509SerialNumber = this.getX509SerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x509SerialNumber", theX509SerialNumber), currentHashCode, theX509SerialNumber);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
