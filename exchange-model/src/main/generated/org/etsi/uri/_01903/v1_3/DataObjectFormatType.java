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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for DataObjectFormatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataObjectFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjectIdentifier" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ObjectReference" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObjectFormatType", propOrder = {
    "description",
    "objectIdentifier",
    "mimeType",
    "encoding"
})
public class DataObjectFormatType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ObjectIdentifier")
    protected ObjectIdentifierType objectIdentifier;
    @XmlElement(name = "MimeType")
    protected String mimeType;
    @XmlElement(name = "Encoding")
    @XmlSchemaType(name = "anyURI")
    protected String encoding;
    @XmlAttribute(name = "ObjectReference", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String objectReference;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the objectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getObjectIdentifier() {
        return objectIdentifier;
    }

    /**
     * Sets the value of the objectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setObjectIdentifier(ObjectIdentifierType value) {
        this.objectIdentifier = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectReference(String value) {
        this.objectReference = value;
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            ObjectIdentifierType theObjectIdentifier;
            theObjectIdentifier = this.getObjectIdentifier();
            strategy.appendField(locator, this, "objectIdentifier", buffer, theObjectIdentifier);
        }
        {
            String theMimeType;
            theMimeType = this.getMimeType();
            strategy.appendField(locator, this, "mimeType", buffer, theMimeType);
        }
        {
            String theEncoding;
            theEncoding = this.getEncoding();
            strategy.appendField(locator, this, "encoding", buffer, theEncoding);
        }
        {
            String theObjectReference;
            theObjectReference = this.getObjectReference();
            strategy.appendField(locator, this, "objectReference", buffer, theObjectReference);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DataObjectFormatType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DataObjectFormatType that = ((DataObjectFormatType) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            ObjectIdentifierType lhsObjectIdentifier;
            lhsObjectIdentifier = this.getObjectIdentifier();
            ObjectIdentifierType rhsObjectIdentifier;
            rhsObjectIdentifier = that.getObjectIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectIdentifier", lhsObjectIdentifier), LocatorUtils.property(thatLocator, "objectIdentifier", rhsObjectIdentifier), lhsObjectIdentifier, rhsObjectIdentifier)) {
                return false;
            }
        }
        {
            String lhsMimeType;
            lhsMimeType = this.getMimeType();
            String rhsMimeType;
            rhsMimeType = that.getMimeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimeType", lhsMimeType), LocatorUtils.property(thatLocator, "mimeType", rhsMimeType), lhsMimeType, rhsMimeType)) {
                return false;
            }
        }
        {
            String lhsEncoding;
            lhsEncoding = this.getEncoding();
            String rhsEncoding;
            rhsEncoding = that.getEncoding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encoding", lhsEncoding), LocatorUtils.property(thatLocator, "encoding", rhsEncoding), lhsEncoding, rhsEncoding)) {
                return false;
            }
        }
        {
            String lhsObjectReference;
            lhsObjectReference = this.getObjectReference();
            String rhsObjectReference;
            rhsObjectReference = that.getObjectReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectReference", lhsObjectReference), LocatorUtils.property(thatLocator, "objectReference", rhsObjectReference), lhsObjectReference, rhsObjectReference)) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            ObjectIdentifierType theObjectIdentifier;
            theObjectIdentifier = this.getObjectIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectIdentifier", theObjectIdentifier), currentHashCode, theObjectIdentifier);
        }
        {
            String theMimeType;
            theMimeType = this.getMimeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimeType", theMimeType), currentHashCode, theMimeType);
        }
        {
            String theEncoding;
            theEncoding = this.getEncoding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encoding", theEncoding), currentHashCode, theEncoding);
        }
        {
            String theObjectReference;
            theObjectReference = this.getObjectReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectReference", theObjectReference), currentHashCode, theObjectReference);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
