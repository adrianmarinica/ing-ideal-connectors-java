//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.11 at 04:33:43 PM EEST 
//


package com.ing.ideal.connector.binding;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3._2000._09.xmldsig.SignatureType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDateTimestamp" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}iDEAL.dateTime"/>
 *         &lt;element name="Acquirer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="acquirerID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Acquirer.acquirerID"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transaction">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transactionID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.transactionID"/>
 *                   &lt;element name="status" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.status"/>
 *                   &lt;element name="statusDateTimestamp" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}iDEAL.dateTime" minOccurs="0"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="consumerName" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.consumerName" minOccurs="0"/>
 *                     &lt;element name="consumerIBAN" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.consumerIBAN" minOccurs="0"/>
 *                     &lt;element name="consumerBIC" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.consumerBIC" minOccurs="0"/>
 *                     &lt;element name="amount" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.amount"/>
 *                     &lt;element name="currency" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.currency"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}MessageAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createDateTimestamp",
    "acquirer",
    "transaction",
    "signature"
})
@XmlRootElement(name = "AcquirerStatusRes")
public class AcquirerStatusRes {

    @XmlElement(required = true)
    protected XMLGregorianCalendar createDateTimestamp;
    @XmlElement(name = "Acquirer", required = true)
    protected AcquirerStatusRes.Acquirer acquirer;
    @XmlElement(name = "Transaction", required = true)
    protected AcquirerStatusRes.Transaction transaction;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the createDateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTimestamp() {
        return createDateTimestamp;
    }

    /**
     * Sets the value of the createDateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTimestamp(XMLGregorianCalendar value) {
        this.createDateTimestamp = value;
    }

    /**
     * Gets the value of the acquirer property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerStatusRes.Acquirer }
     *     
     */
    public AcquirerStatusRes.Acquirer getAcquirer() {
        return acquirer;
    }

    /**
     * Sets the value of the acquirer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerStatusRes.Acquirer }
     *     
     */
    public void setAcquirer(AcquirerStatusRes.Acquirer value) {
        this.acquirer = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerStatusRes.Transaction }
     *     
     */
    public AcquirerStatusRes.Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerStatusRes.Transaction }
     *     
     */
    public void setTransaction(AcquirerStatusRes.Transaction value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="acquirerID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Acquirer.acquirerID"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acquirerID"
    })
    public static class Acquirer {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String acquirerID;

        /**
         * Gets the value of the acquirerID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcquirerID() {
            return acquirerID;
        }

        /**
         * Sets the value of the acquirerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcquirerID(String value) {
            this.acquirerID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="transactionID" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.transactionID"/>
     *         &lt;element name="status" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.status"/>
     *         &lt;element name="statusDateTimestamp" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}iDEAL.dateTime" minOccurs="0"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="consumerName" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.consumerName" minOccurs="0"/>
     *           &lt;element name="consumerIBAN" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.consumerIBAN" minOccurs="0"/>
     *           &lt;element name="consumerBIC" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.consumerBIC" minOccurs="0"/>
     *           &lt;element name="amount" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.amount"/>
     *           &lt;element name="currency" type="{http://www.idealdesk.com/ideal/messages/mer-acq/3.3.1}Transaction.currency"/>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transactionID",
        "status",
        "statusDateTimestamp",
        "consumerName",
        "consumerIBAN",
        "consumerBIC",
        "amount",
        "currency"
    })
    public static class Transaction {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String transactionID;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String status;
        protected XMLGregorianCalendar statusDateTimestamp;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String consumerName;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String consumerIBAN;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String consumerBIC;
        protected BigDecimal amount;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String currency;

        /**
         * Gets the value of the transactionID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionID() {
            return transactionID;
        }

        /**
         * Sets the value of the transactionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionID(String value) {
            this.transactionID = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the statusDateTimestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStatusDateTimestamp() {
            return statusDateTimestamp;
        }

        /**
         * Sets the value of the statusDateTimestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStatusDateTimestamp(XMLGregorianCalendar value) {
            this.statusDateTimestamp = value;
        }

        /**
         * Gets the value of the consumerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsumerName() {
            return consumerName;
        }

        /**
         * Sets the value of the consumerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsumerName(String value) {
            this.consumerName = value;
        }

        /**
         * Gets the value of the consumerIBAN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsumerIBAN() {
            return consumerIBAN;
        }

        /**
         * Sets the value of the consumerIBAN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsumerIBAN(String value) {
            this.consumerIBAN = value;
        }

        /**
         * Gets the value of the consumerBIC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsumerBIC() {
            return consumerBIC;
        }

        /**
         * Sets the value of the consumerBIC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsumerBIC(String value) {
            this.consumerBIC = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

    }

}