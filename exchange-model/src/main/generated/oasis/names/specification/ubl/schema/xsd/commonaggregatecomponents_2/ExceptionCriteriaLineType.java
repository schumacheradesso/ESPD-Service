//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CollaborationPriorityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExceptionResolutionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExceptionStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerformanceMetricTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SupplyChainActivityTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThresholdQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThresholdValueComparisonCodeType;
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
 * <p>Java class for ExceptionCriteriaLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionCriteriaLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdValueComparisonCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CollaborationPriorityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionResolutionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EffectivePeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastExceptionCriterionLine" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionCriteriaLineType", propOrder = {
    "id",
    "note",
    "thresholdValueComparisonCode",
    "thresholdQuantity",
    "exceptionStatusCode",
    "collaborationPriorityCode",
    "exceptionResolutionCode",
    "supplyChainActivityTypeCode",
    "performanceMetricTypeCode",
    "effectivePeriod",
    "supplyItem",
    "forecastExceptionCriterionLine"
})
public class ExceptionCriteriaLineType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "ThresholdValueComparisonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ThresholdValueComparisonCodeType thresholdValueComparisonCode;
    @XmlElement(name = "ThresholdQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ThresholdQuantityType thresholdQuantity;
    @XmlElement(name = "ExceptionStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExceptionStatusCodeType exceptionStatusCode;
    @XmlElement(name = "CollaborationPriorityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CollaborationPriorityCodeType collaborationPriorityCode;
    @XmlElement(name = "ExceptionResolutionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExceptionResolutionCodeType exceptionResolutionCode;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SupplyChainActivityTypeCodeType supplyChainActivityTypeCode;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformanceMetricTypeCodeType performanceMetricTypeCode;
    @XmlElement(name = "EffectivePeriod")
    protected PeriodType effectivePeriod;
    @XmlElement(name = "SupplyItem", required = true)
    protected List<ItemType> supplyItem;
    @XmlElement(name = "ForecastExceptionCriterionLine")
    protected ForecastExceptionCriterionLineType forecastExceptionCriterionLine;

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
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Gets the value of the thresholdValueComparisonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdValueComparisonCodeType }
     *     
     */
    public ThresholdValueComparisonCodeType getThresholdValueComparisonCode() {
        return thresholdValueComparisonCode;
    }

    /**
     * Sets the value of the thresholdValueComparisonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdValueComparisonCodeType }
     *     
     */
    public void setThresholdValueComparisonCode(ThresholdValueComparisonCodeType value) {
        this.thresholdValueComparisonCode = value;
    }

    /**
     * Gets the value of the thresholdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdQuantityType }
     *     
     */
    public ThresholdQuantityType getThresholdQuantity() {
        return thresholdQuantity;
    }

    /**
     * Sets the value of the thresholdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdQuantityType }
     *     
     */
    public void setThresholdQuantity(ThresholdQuantityType value) {
        this.thresholdQuantity = value;
    }

    /**
     * Gets the value of the exceptionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionStatusCodeType }
     *     
     */
    public ExceptionStatusCodeType getExceptionStatusCode() {
        return exceptionStatusCode;
    }

    /**
     * Sets the value of the exceptionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionStatusCodeType }
     *     
     */
    public void setExceptionStatusCode(ExceptionStatusCodeType value) {
        this.exceptionStatusCode = value;
    }

    /**
     * Gets the value of the collaborationPriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationPriorityCodeType }
     *     
     */
    public CollaborationPriorityCodeType getCollaborationPriorityCode() {
        return collaborationPriorityCode;
    }

    /**
     * Sets the value of the collaborationPriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationPriorityCodeType }
     *     
     */
    public void setCollaborationPriorityCode(CollaborationPriorityCodeType value) {
        this.collaborationPriorityCode = value;
    }

    /**
     * Gets the value of the exceptionResolutionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionResolutionCodeType }
     *     
     */
    public ExceptionResolutionCodeType getExceptionResolutionCode() {
        return exceptionResolutionCode;
    }

    /**
     * Sets the value of the exceptionResolutionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionResolutionCodeType }
     *     
     */
    public void setExceptionResolutionCode(ExceptionResolutionCodeType value) {
        this.exceptionResolutionCode = value;
    }

    /**
     * Gets the value of the supplyChainActivityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainActivityTypeCodeType }
     *     
     */
    public SupplyChainActivityTypeCodeType getSupplyChainActivityTypeCode() {
        return supplyChainActivityTypeCode;
    }

    /**
     * Sets the value of the supplyChainActivityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainActivityTypeCodeType }
     *     
     */
    public void setSupplyChainActivityTypeCode(SupplyChainActivityTypeCodeType value) {
        this.supplyChainActivityTypeCode = value;
    }

    /**
     * Gets the value of the performanceMetricTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMetricTypeCodeType }
     *     
     */
    public PerformanceMetricTypeCodeType getPerformanceMetricTypeCode() {
        return performanceMetricTypeCode;
    }

    /**
     * Sets the value of the performanceMetricTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMetricTypeCodeType }
     *     
     */
    public void setPerformanceMetricTypeCode(PerformanceMetricTypeCodeType value) {
        this.performanceMetricTypeCode = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEffectivePeriod(PeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the supplyItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getSupplyItem() {
        if (supplyItem == null) {
            supplyItem = new ArrayList<ItemType>();
        }
        return this.supplyItem;
    }

    /**
     * Gets the value of the forecastExceptionCriterionLine property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastExceptionCriterionLineType }
     *     
     */
    public ForecastExceptionCriterionLineType getForecastExceptionCriterionLine() {
        return forecastExceptionCriterionLine;
    }

    /**
     * Sets the value of the forecastExceptionCriterionLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastExceptionCriterionLineType }
     *     
     */
    public void setForecastExceptionCriterionLine(ForecastExceptionCriterionLineType value) {
        this.forecastExceptionCriterionLine = value;
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
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote);
        }
        {
            ThresholdValueComparisonCodeType theThresholdValueComparisonCode;
            theThresholdValueComparisonCode = this.getThresholdValueComparisonCode();
            strategy.appendField(locator, this, "thresholdValueComparisonCode", buffer, theThresholdValueComparisonCode);
        }
        {
            ThresholdQuantityType theThresholdQuantity;
            theThresholdQuantity = this.getThresholdQuantity();
            strategy.appendField(locator, this, "thresholdQuantity", buffer, theThresholdQuantity);
        }
        {
            ExceptionStatusCodeType theExceptionStatusCode;
            theExceptionStatusCode = this.getExceptionStatusCode();
            strategy.appendField(locator, this, "exceptionStatusCode", buffer, theExceptionStatusCode);
        }
        {
            CollaborationPriorityCodeType theCollaborationPriorityCode;
            theCollaborationPriorityCode = this.getCollaborationPriorityCode();
            strategy.appendField(locator, this, "collaborationPriorityCode", buffer, theCollaborationPriorityCode);
        }
        {
            ExceptionResolutionCodeType theExceptionResolutionCode;
            theExceptionResolutionCode = this.getExceptionResolutionCode();
            strategy.appendField(locator, this, "exceptionResolutionCode", buffer, theExceptionResolutionCode);
        }
        {
            SupplyChainActivityTypeCodeType theSupplyChainActivityTypeCode;
            theSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            strategy.appendField(locator, this, "supplyChainActivityTypeCode", buffer, theSupplyChainActivityTypeCode);
        }
        {
            PerformanceMetricTypeCodeType thePerformanceMetricTypeCode;
            thePerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            strategy.appendField(locator, this, "performanceMetricTypeCode", buffer, thePerformanceMetricTypeCode);
        }
        {
            PeriodType theEffectivePeriod;
            theEffectivePeriod = this.getEffectivePeriod();
            strategy.appendField(locator, this, "effectivePeriod", buffer, theEffectivePeriod);
        }
        {
            List<ItemType> theSupplyItem;
            theSupplyItem = (((this.supplyItem!= null)&&(!this.supplyItem.isEmpty()))?this.getSupplyItem():null);
            strategy.appendField(locator, this, "supplyItem", buffer, theSupplyItem);
        }
        {
            ForecastExceptionCriterionLineType theForecastExceptionCriterionLine;
            theForecastExceptionCriterionLine = this.getForecastExceptionCriterionLine();
            strategy.appendField(locator, this, "forecastExceptionCriterionLine", buffer, theForecastExceptionCriterionLine);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExceptionCriteriaLineType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExceptionCriteriaLineType that = ((ExceptionCriteriaLineType) object);
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
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote)) {
                return false;
            }
        }
        {
            ThresholdValueComparisonCodeType lhsThresholdValueComparisonCode;
            lhsThresholdValueComparisonCode = this.getThresholdValueComparisonCode();
            ThresholdValueComparisonCodeType rhsThresholdValueComparisonCode;
            rhsThresholdValueComparisonCode = that.getThresholdValueComparisonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thresholdValueComparisonCode", lhsThresholdValueComparisonCode), LocatorUtils.property(thatLocator, "thresholdValueComparisonCode", rhsThresholdValueComparisonCode), lhsThresholdValueComparisonCode, rhsThresholdValueComparisonCode)) {
                return false;
            }
        }
        {
            ThresholdQuantityType lhsThresholdQuantity;
            lhsThresholdQuantity = this.getThresholdQuantity();
            ThresholdQuantityType rhsThresholdQuantity;
            rhsThresholdQuantity = that.getThresholdQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thresholdQuantity", lhsThresholdQuantity), LocatorUtils.property(thatLocator, "thresholdQuantity", rhsThresholdQuantity), lhsThresholdQuantity, rhsThresholdQuantity)) {
                return false;
            }
        }
        {
            ExceptionStatusCodeType lhsExceptionStatusCode;
            lhsExceptionStatusCode = this.getExceptionStatusCode();
            ExceptionStatusCodeType rhsExceptionStatusCode;
            rhsExceptionStatusCode = that.getExceptionStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionStatusCode", lhsExceptionStatusCode), LocatorUtils.property(thatLocator, "exceptionStatusCode", rhsExceptionStatusCode), lhsExceptionStatusCode, rhsExceptionStatusCode)) {
                return false;
            }
        }
        {
            CollaborationPriorityCodeType lhsCollaborationPriorityCode;
            lhsCollaborationPriorityCode = this.getCollaborationPriorityCode();
            CollaborationPriorityCodeType rhsCollaborationPriorityCode;
            rhsCollaborationPriorityCode = that.getCollaborationPriorityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collaborationPriorityCode", lhsCollaborationPriorityCode), LocatorUtils.property(thatLocator, "collaborationPriorityCode", rhsCollaborationPriorityCode), lhsCollaborationPriorityCode, rhsCollaborationPriorityCode)) {
                return false;
            }
        }
        {
            ExceptionResolutionCodeType lhsExceptionResolutionCode;
            lhsExceptionResolutionCode = this.getExceptionResolutionCode();
            ExceptionResolutionCodeType rhsExceptionResolutionCode;
            rhsExceptionResolutionCode = that.getExceptionResolutionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionResolutionCode", lhsExceptionResolutionCode), LocatorUtils.property(thatLocator, "exceptionResolutionCode", rhsExceptionResolutionCode), lhsExceptionResolutionCode, rhsExceptionResolutionCode)) {
                return false;
            }
        }
        {
            SupplyChainActivityTypeCodeType lhsSupplyChainActivityTypeCode;
            lhsSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            SupplyChainActivityTypeCodeType rhsSupplyChainActivityTypeCode;
            rhsSupplyChainActivityTypeCode = that.getSupplyChainActivityTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyChainActivityTypeCode", lhsSupplyChainActivityTypeCode), LocatorUtils.property(thatLocator, "supplyChainActivityTypeCode", rhsSupplyChainActivityTypeCode), lhsSupplyChainActivityTypeCode, rhsSupplyChainActivityTypeCode)) {
                return false;
            }
        }
        {
            PerformanceMetricTypeCodeType lhsPerformanceMetricTypeCode;
            lhsPerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            PerformanceMetricTypeCodeType rhsPerformanceMetricTypeCode;
            rhsPerformanceMetricTypeCode = that.getPerformanceMetricTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "performanceMetricTypeCode", lhsPerformanceMetricTypeCode), LocatorUtils.property(thatLocator, "performanceMetricTypeCode", rhsPerformanceMetricTypeCode), lhsPerformanceMetricTypeCode, rhsPerformanceMetricTypeCode)) {
                return false;
            }
        }
        {
            PeriodType lhsEffectivePeriod;
            lhsEffectivePeriod = this.getEffectivePeriod();
            PeriodType rhsEffectivePeriod;
            rhsEffectivePeriod = that.getEffectivePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectivePeriod", lhsEffectivePeriod), LocatorUtils.property(thatLocator, "effectivePeriod", rhsEffectivePeriod), lhsEffectivePeriod, rhsEffectivePeriod)) {
                return false;
            }
        }
        {
            List<ItemType> lhsSupplyItem;
            lhsSupplyItem = (((this.supplyItem!= null)&&(!this.supplyItem.isEmpty()))?this.getSupplyItem():null);
            List<ItemType> rhsSupplyItem;
            rhsSupplyItem = (((that.supplyItem!= null)&&(!that.supplyItem.isEmpty()))?that.getSupplyItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyItem", lhsSupplyItem), LocatorUtils.property(thatLocator, "supplyItem", rhsSupplyItem), lhsSupplyItem, rhsSupplyItem)) {
                return false;
            }
        }
        {
            ForecastExceptionCriterionLineType lhsForecastExceptionCriterionLine;
            lhsForecastExceptionCriterionLine = this.getForecastExceptionCriterionLine();
            ForecastExceptionCriterionLineType rhsForecastExceptionCriterionLine;
            rhsForecastExceptionCriterionLine = that.getForecastExceptionCriterionLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastExceptionCriterionLine", lhsForecastExceptionCriterionLine), LocatorUtils.property(thatLocator, "forecastExceptionCriterionLine", rhsForecastExceptionCriterionLine), lhsForecastExceptionCriterionLine, rhsForecastExceptionCriterionLine)) {
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
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote);
        }
        {
            ThresholdValueComparisonCodeType theThresholdValueComparisonCode;
            theThresholdValueComparisonCode = this.getThresholdValueComparisonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thresholdValueComparisonCode", theThresholdValueComparisonCode), currentHashCode, theThresholdValueComparisonCode);
        }
        {
            ThresholdQuantityType theThresholdQuantity;
            theThresholdQuantity = this.getThresholdQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thresholdQuantity", theThresholdQuantity), currentHashCode, theThresholdQuantity);
        }
        {
            ExceptionStatusCodeType theExceptionStatusCode;
            theExceptionStatusCode = this.getExceptionStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionStatusCode", theExceptionStatusCode), currentHashCode, theExceptionStatusCode);
        }
        {
            CollaborationPriorityCodeType theCollaborationPriorityCode;
            theCollaborationPriorityCode = this.getCollaborationPriorityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collaborationPriorityCode", theCollaborationPriorityCode), currentHashCode, theCollaborationPriorityCode);
        }
        {
            ExceptionResolutionCodeType theExceptionResolutionCode;
            theExceptionResolutionCode = this.getExceptionResolutionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionResolutionCode", theExceptionResolutionCode), currentHashCode, theExceptionResolutionCode);
        }
        {
            SupplyChainActivityTypeCodeType theSupplyChainActivityTypeCode;
            theSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyChainActivityTypeCode", theSupplyChainActivityTypeCode), currentHashCode, theSupplyChainActivityTypeCode);
        }
        {
            PerformanceMetricTypeCodeType thePerformanceMetricTypeCode;
            thePerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performanceMetricTypeCode", thePerformanceMetricTypeCode), currentHashCode, thePerformanceMetricTypeCode);
        }
        {
            PeriodType theEffectivePeriod;
            theEffectivePeriod = this.getEffectivePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectivePeriod", theEffectivePeriod), currentHashCode, theEffectivePeriod);
        }
        {
            List<ItemType> theSupplyItem;
            theSupplyItem = (((this.supplyItem!= null)&&(!this.supplyItem.isEmpty()))?this.getSupplyItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyItem", theSupplyItem), currentHashCode, theSupplyItem);
        }
        {
            ForecastExceptionCriterionLineType theForecastExceptionCriterionLine;
            theForecastExceptionCriterionLine = this.getForecastExceptionCriterionLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastExceptionCriterionLine", theForecastExceptionCriterionLine), currentHashCode, theForecastExceptionCriterionLine);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
