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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EvaluationCriterionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpressionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpressionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThresholdAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThresholdQuantityType;
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
 * <p>Java class for EvaluationCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvaluationCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EvaluationCriterionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpressionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Expression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SuggestedEvidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluationCriterionType", propOrder = {
    "evaluationCriterionTypeCode",
    "description",
    "thresholdAmount",
    "thresholdQuantity",
    "expressionCode",
    "expression",
    "durationPeriod",
    "suggestedEvidence"
})
public class EvaluationCriterionType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "EvaluationCriterionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EvaluationCriterionTypeCodeType evaluationCriterionTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ThresholdAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThresholdAmountType thresholdAmount;
    @XmlElement(name = "ThresholdQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThresholdQuantityType thresholdQuantity;
    @XmlElement(name = "ExpressionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpressionCodeType expressionCode;
    @XmlElement(name = "Expression", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ExpressionType> expression;
    @XmlElement(name = "DurationPeriod")
    protected PeriodType durationPeriod;
    @XmlElement(name = "SuggestedEvidence")
    protected List<EvidenceType> suggestedEvidence;

    /**
     * Gets the value of the evaluationCriterionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationCriterionTypeCodeType }
     *     
     */
    public EvaluationCriterionTypeCodeType getEvaluationCriterionTypeCode() {
        return evaluationCriterionTypeCode;
    }

    /**
     * Sets the value of the evaluationCriterionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationCriterionTypeCodeType }
     *     
     */
    public void setEvaluationCriterionTypeCode(EvaluationCriterionTypeCodeType value) {
        this.evaluationCriterionTypeCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the thresholdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdAmountType }
     *     
     */
    public ThresholdAmountType getThresholdAmount() {
        return thresholdAmount;
    }

    /**
     * Sets the value of the thresholdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdAmountType }
     *     
     */
    public void setThresholdAmount(ThresholdAmountType value) {
        this.thresholdAmount = value;
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
     * Gets the value of the expressionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionCodeType }
     *     
     */
    public ExpressionCodeType getExpressionCode() {
        return expressionCode;
    }

    /**
     * Sets the value of the expressionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionCodeType }
     *     
     */
    public void setExpressionCode(ExpressionCodeType value) {
        this.expressionCode = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpressionType }
     * 
     * 
     */
    public List<ExpressionType> getExpression() {
        if (expression == null) {
            expression = new ArrayList<ExpressionType>();
        }
        return this.expression;
    }

    /**
     * Gets the value of the durationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Sets the value of the durationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setDurationPeriod(PeriodType value) {
        this.durationPeriod = value;
    }

    /**
     * Gets the value of the suggestedEvidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedEvidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceType }
     * 
     * 
     */
    public List<EvidenceType> getSuggestedEvidence() {
        if (suggestedEvidence == null) {
            suggestedEvidence = new ArrayList<EvidenceType>();
        }
        return this.suggestedEvidence;
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
            EvaluationCriterionTypeCodeType theEvaluationCriterionTypeCode;
            theEvaluationCriterionTypeCode = this.getEvaluationCriterionTypeCode();
            strategy.appendField(locator, this, "evaluationCriterionTypeCode", buffer, theEvaluationCriterionTypeCode);
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            ThresholdAmountType theThresholdAmount;
            theThresholdAmount = this.getThresholdAmount();
            strategy.appendField(locator, this, "thresholdAmount", buffer, theThresholdAmount);
        }
        {
            ThresholdQuantityType theThresholdQuantity;
            theThresholdQuantity = this.getThresholdQuantity();
            strategy.appendField(locator, this, "thresholdQuantity", buffer, theThresholdQuantity);
        }
        {
            ExpressionCodeType theExpressionCode;
            theExpressionCode = this.getExpressionCode();
            strategy.appendField(locator, this, "expressionCode", buffer, theExpressionCode);
        }
        {
            List<ExpressionType> theExpression;
            theExpression = (((this.expression!= null)&&(!this.expression.isEmpty()))?this.getExpression():null);
            strategy.appendField(locator, this, "expression", buffer, theExpression);
        }
        {
            PeriodType theDurationPeriod;
            theDurationPeriod = this.getDurationPeriod();
            strategy.appendField(locator, this, "durationPeriod", buffer, theDurationPeriod);
        }
        {
            List<EvidenceType> theSuggestedEvidence;
            theSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            strategy.appendField(locator, this, "suggestedEvidence", buffer, theSuggestedEvidence);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EvaluationCriterionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EvaluationCriterionType that = ((EvaluationCriterionType) object);
        {
            EvaluationCriterionTypeCodeType lhsEvaluationCriterionTypeCode;
            lhsEvaluationCriterionTypeCode = this.getEvaluationCriterionTypeCode();
            EvaluationCriterionTypeCodeType rhsEvaluationCriterionTypeCode;
            rhsEvaluationCriterionTypeCode = that.getEvaluationCriterionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evaluationCriterionTypeCode", lhsEvaluationCriterionTypeCode), LocatorUtils.property(thatLocator, "evaluationCriterionTypeCode", rhsEvaluationCriterionTypeCode), lhsEvaluationCriterionTypeCode, rhsEvaluationCriterionTypeCode)) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            ThresholdAmountType lhsThresholdAmount;
            lhsThresholdAmount = this.getThresholdAmount();
            ThresholdAmountType rhsThresholdAmount;
            rhsThresholdAmount = that.getThresholdAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thresholdAmount", lhsThresholdAmount), LocatorUtils.property(thatLocator, "thresholdAmount", rhsThresholdAmount), lhsThresholdAmount, rhsThresholdAmount)) {
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
            ExpressionCodeType lhsExpressionCode;
            lhsExpressionCode = this.getExpressionCode();
            ExpressionCodeType rhsExpressionCode;
            rhsExpressionCode = that.getExpressionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expressionCode", lhsExpressionCode), LocatorUtils.property(thatLocator, "expressionCode", rhsExpressionCode), lhsExpressionCode, rhsExpressionCode)) {
                return false;
            }
        }
        {
            List<ExpressionType> lhsExpression;
            lhsExpression = (((this.expression!= null)&&(!this.expression.isEmpty()))?this.getExpression():null);
            List<ExpressionType> rhsExpression;
            rhsExpression = (((that.expression!= null)&&(!that.expression.isEmpty()))?that.getExpression():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expression", lhsExpression), LocatorUtils.property(thatLocator, "expression", rhsExpression), lhsExpression, rhsExpression)) {
                return false;
            }
        }
        {
            PeriodType lhsDurationPeriod;
            lhsDurationPeriod = this.getDurationPeriod();
            PeriodType rhsDurationPeriod;
            rhsDurationPeriod = that.getDurationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "durationPeriod", lhsDurationPeriod), LocatorUtils.property(thatLocator, "durationPeriod", rhsDurationPeriod), lhsDurationPeriod, rhsDurationPeriod)) {
                return false;
            }
        }
        {
            List<EvidenceType> lhsSuggestedEvidence;
            lhsSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            List<EvidenceType> rhsSuggestedEvidence;
            rhsSuggestedEvidence = (((that.suggestedEvidence!= null)&&(!that.suggestedEvidence.isEmpty()))?that.getSuggestedEvidence():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suggestedEvidence", lhsSuggestedEvidence), LocatorUtils.property(thatLocator, "suggestedEvidence", rhsSuggestedEvidence), lhsSuggestedEvidence, rhsSuggestedEvidence)) {
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
            EvaluationCriterionTypeCodeType theEvaluationCriterionTypeCode;
            theEvaluationCriterionTypeCode = this.getEvaluationCriterionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evaluationCriterionTypeCode", theEvaluationCriterionTypeCode), currentHashCode, theEvaluationCriterionTypeCode);
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            ThresholdAmountType theThresholdAmount;
            theThresholdAmount = this.getThresholdAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thresholdAmount", theThresholdAmount), currentHashCode, theThresholdAmount);
        }
        {
            ThresholdQuantityType theThresholdQuantity;
            theThresholdQuantity = this.getThresholdQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thresholdQuantity", theThresholdQuantity), currentHashCode, theThresholdQuantity);
        }
        {
            ExpressionCodeType theExpressionCode;
            theExpressionCode = this.getExpressionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expressionCode", theExpressionCode), currentHashCode, theExpressionCode);
        }
        {
            List<ExpressionType> theExpression;
            theExpression = (((this.expression!= null)&&(!this.expression.isEmpty()))?this.getExpression():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expression", theExpression), currentHashCode, theExpression);
        }
        {
            PeriodType theDurationPeriod;
            theDurationPeriod = this.getDurationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durationPeriod", theDurationPeriod), currentHashCode, theDurationPeriod);
        }
        {
            List<EvidenceType> theSuggestedEvidence;
            theSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suggestedEvidence", theSuggestedEvidence), currentHashCode, theSuggestedEvidence);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
