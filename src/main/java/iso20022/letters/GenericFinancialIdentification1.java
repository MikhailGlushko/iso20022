
package iso20022.letters;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericFinancialIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericFinancialIdentification1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.01}Max35Text"/>
 *         &lt;element name="SchmeNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.01}FinancialIdentificationSchemeName1Choice" minOccurs="0"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.01}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericFinancialIdentification1", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.026.001.01", propOrder = {
    "id",
    "schmeNm",
    "issr"
})
public class GenericFinancialIdentification1 {

    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.026.001.01", required = true)
    protected String id;
    @XmlElement(name = "SchmeNm", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.026.001.01")
    protected FinancialIdentificationSchemeName1Choice schmeNm;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.026.001.01")
    protected String issr;

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
     * Gets the value of the schmeNm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialIdentificationSchemeName1Choice }
     *     
     */
    public FinancialIdentificationSchemeName1Choice getSchmeNm() {
        return schmeNm;
    }

    /**
     * Sets the value of the schmeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialIdentificationSchemeName1Choice }
     *     
     */
    public void setSchmeNm(FinancialIdentificationSchemeName1Choice value) {
        this.schmeNm = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

}