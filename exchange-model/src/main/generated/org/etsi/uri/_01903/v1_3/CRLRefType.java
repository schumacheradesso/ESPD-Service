//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
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
 * <p>Java class for CRLRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRLRefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DigestAlgAndValue" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType"/&gt;
 *         &lt;element name="CRLIdentifier" type="{http://uri.etsi.org/01903/v1.3.2#}CRLIdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRLRefType", propOrder = {
    "digestAlgAndValue",
    "crlIdentifier"
})
public class CRLRefType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "DigestAlgAndValue", required = true)
    protected DigestAlgAndValueType digestAlgAndValue;
    @XmlElement(name = "CRLIdentifier")
    protected CRLIdentifierType crlIdentifier;

    /**
     * Gets the value of the digestAlgAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getDigestAlgAndValue() {
        return digestAlgAndValue;
    }

    /**
     * Sets the value of the digestAlgAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setDigestAlgAndValue(DigestAlgAndValueType value) {
        this.digestAlgAndValue = value;
    }

    /**
     * Gets the value of the crlIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CRLIdentifierType }
     *     
     */
    public CRLIdentifierType getCRLIdentifier() {
        return crlIdentifier;
    }

    /**
     * Sets the value of the crlIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLIdentifierType }
     *     
     */
    public void setCRLIdentifier(CRLIdentifierType value) {
        this.crlIdentifier = value;
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
            DigestAlgAndValueType theDigestAlgAndValue;
            theDigestAlgAndValue = this.getDigestAlgAndValue();
            strategy.appendField(locator, this, "digestAlgAndValue", buffer, theDigestAlgAndValue);
        }
        {
            CRLIdentifierType theCRLIdentifier;
            theCRLIdentifier = this.getCRLIdentifier();
            strategy.appendField(locator, this, "crlIdentifier", buffer, theCRLIdentifier);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CRLRefType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CRLRefType that = ((CRLRefType) object);
        {
            DigestAlgAndValueType lhsDigestAlgAndValue;
            lhsDigestAlgAndValue = this.getDigestAlgAndValue();
            DigestAlgAndValueType rhsDigestAlgAndValue;
            rhsDigestAlgAndValue = that.getDigestAlgAndValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digestAlgAndValue", lhsDigestAlgAndValue), LocatorUtils.property(thatLocator, "digestAlgAndValue", rhsDigestAlgAndValue), lhsDigestAlgAndValue, rhsDigestAlgAndValue)) {
                return false;
            }
        }
        {
            CRLIdentifierType lhsCRLIdentifier;
            lhsCRLIdentifier = this.getCRLIdentifier();
            CRLIdentifierType rhsCRLIdentifier;
            rhsCRLIdentifier = that.getCRLIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "crlIdentifier", lhsCRLIdentifier), LocatorUtils.property(thatLocator, "crlIdentifier", rhsCRLIdentifier), lhsCRLIdentifier, rhsCRLIdentifier)) {
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
            DigestAlgAndValueType theDigestAlgAndValue;
            theDigestAlgAndValue = this.getDigestAlgAndValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digestAlgAndValue", theDigestAlgAndValue), currentHashCode, theDigestAlgAndValue);
        }
        {
            CRLIdentifierType theCRLIdentifier;
            theCRLIdentifier = this.getCRLIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crlIdentifier", theCRLIdentifier), currentHashCode, theCRLIdentifier);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
