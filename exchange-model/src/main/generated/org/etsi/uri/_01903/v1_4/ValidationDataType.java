//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package org.etsi.uri._01903.v1_4;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.etsi.uri._01903.v1_3.CertificateValuesType;
import org.etsi.uri._01903.v1_3.RevocationValuesType;
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
 * <p>Java class for ValidationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CertificateValues" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}RevocationValues" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="UR" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationDataType", propOrder = {
    "certificateValues",
    "revocationValues"
})
public class ValidationDataType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CertificateValues", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected CertificateValuesType certificateValues;
    @XmlElement(name = "RevocationValues", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected RevocationValuesType revocationValues;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "UR")
    @XmlSchemaType(name = "anyURI")
    protected String ur;

    /**
     * Gets the value of the certificateValues property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateValuesType }
     *     
     */
    public CertificateValuesType getCertificateValues() {
        return certificateValues;
    }

    /**
     * Sets the value of the certificateValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateValuesType }
     *     
     */
    public void setCertificateValues(CertificateValuesType value) {
        this.certificateValues = value;
    }

    /**
     * Gets the value of the revocationValues property.
     * 
     * @return
     *     possible object is
     *     {@link RevocationValuesType }
     *     
     */
    public RevocationValuesType getRevocationValues() {
        return revocationValues;
    }

    /**
     * Sets the value of the revocationValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevocationValuesType }
     *     
     */
    public void setRevocationValues(RevocationValuesType value) {
        this.revocationValues = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUR() {
        return ur;
    }

    /**
     * Sets the value of the ur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUR(String value) {
        this.ur = value;
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
            CertificateValuesType theCertificateValues;
            theCertificateValues = this.getCertificateValues();
            strategy.appendField(locator, this, "certificateValues", buffer, theCertificateValues);
        }
        {
            RevocationValuesType theRevocationValues;
            theRevocationValues = this.getRevocationValues();
            strategy.appendField(locator, this, "revocationValues", buffer, theRevocationValues);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theUR;
            theUR = this.getUR();
            strategy.appendField(locator, this, "ur", buffer, theUR);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ValidationDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ValidationDataType that = ((ValidationDataType) object);
        {
            CertificateValuesType lhsCertificateValues;
            lhsCertificateValues = this.getCertificateValues();
            CertificateValuesType rhsCertificateValues;
            rhsCertificateValues = that.getCertificateValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificateValues", lhsCertificateValues), LocatorUtils.property(thatLocator, "certificateValues", rhsCertificateValues), lhsCertificateValues, rhsCertificateValues)) {
                return false;
            }
        }
        {
            RevocationValuesType lhsRevocationValues;
            lhsRevocationValues = this.getRevocationValues();
            RevocationValuesType rhsRevocationValues;
            rhsRevocationValues = that.getRevocationValues();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revocationValues", lhsRevocationValues), LocatorUtils.property(thatLocator, "revocationValues", rhsRevocationValues), lhsRevocationValues, rhsRevocationValues)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsUR;
            lhsUR = this.getUR();
            String rhsUR;
            rhsUR = that.getUR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ur", lhsUR), LocatorUtils.property(thatLocator, "ur", rhsUR), lhsUR, rhsUR)) {
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
            CertificateValuesType theCertificateValues;
            theCertificateValues = this.getCertificateValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificateValues", theCertificateValues), currentHashCode, theCertificateValues);
        }
        {
            RevocationValuesType theRevocationValues;
            theRevocationValues = this.getRevocationValues();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revocationValues", theRevocationValues), currentHashCode, theRevocationValues);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theUR;
            theUR = this.getUR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ur", theUR), currentHashCode, theUR);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
