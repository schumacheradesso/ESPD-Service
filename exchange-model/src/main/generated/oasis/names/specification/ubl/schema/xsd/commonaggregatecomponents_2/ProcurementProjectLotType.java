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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
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
 * <p>Java class for ProcurementProjectLotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcurementProjectLotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcurementProjectLotType", propOrder = {
    "id",
    "tenderingTerms",
    "procurementProject"
})
public class ProcurementProjectLotType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "TenderingTerms")
    protected TenderingTermsType tenderingTerms;
    @XmlElement(name = "ProcurementProject")
    protected ProcurementProjectType procurementProject;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the tenderingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link TenderingTermsType }
     *     
     */
    public TenderingTermsType getTenderingTerms() {
        return tenderingTerms;
    }

    /**
     * Sets the value of the tenderingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderingTermsType }
     *     
     */
    public void setTenderingTerms(TenderingTermsType value) {
        this.tenderingTerms = value;
    }

    /**
     * Gets the value of the procurementProject property.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementProjectType }
     *     
     */
    public ProcurementProjectType getProcurementProject() {
        return procurementProject;
    }

    /**
     * Sets the value of the procurementProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementProjectType }
     *     
     */
    public void setProcurementProject(ProcurementProjectType value) {
        this.procurementProject = value;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            TenderingTermsType theTenderingTerms;
            theTenderingTerms = this.getTenderingTerms();
            strategy.appendField(locator, this, "tenderingTerms", buffer, theTenderingTerms);
        }
        {
            ProcurementProjectType theProcurementProject;
            theProcurementProject = this.getProcurementProject();
            strategy.appendField(locator, this, "procurementProject", buffer, theProcurementProject);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProcurementProjectLotType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProcurementProjectLotType that = ((ProcurementProjectLotType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            TenderingTermsType lhsTenderingTerms;
            lhsTenderingTerms = this.getTenderingTerms();
            TenderingTermsType rhsTenderingTerms;
            rhsTenderingTerms = that.getTenderingTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderingTerms", lhsTenderingTerms), LocatorUtils.property(thatLocator, "tenderingTerms", rhsTenderingTerms), lhsTenderingTerms, rhsTenderingTerms)) {
                return false;
            }
        }
        {
            ProcurementProjectType lhsProcurementProject;
            lhsProcurementProject = this.getProcurementProject();
            ProcurementProjectType rhsProcurementProject;
            rhsProcurementProject = that.getProcurementProject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementProject", lhsProcurementProject), LocatorUtils.property(thatLocator, "procurementProject", rhsProcurementProject), lhsProcurementProject, rhsProcurementProject)) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            TenderingTermsType theTenderingTerms;
            theTenderingTerms = this.getTenderingTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderingTerms", theTenderingTerms), currentHashCode, theTenderingTerms);
        }
        {
            ProcurementProjectType theProcurementProject;
            theProcurementProject = this.getProcurementProject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementProject", theProcurementProject), currentHashCode, theProcurementProject);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
