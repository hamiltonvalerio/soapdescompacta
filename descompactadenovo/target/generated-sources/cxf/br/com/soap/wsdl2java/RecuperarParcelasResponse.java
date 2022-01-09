
package br.com.soap.wsdl2java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recuperarParcelasReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recuperarParcelasReturn"
})
@XmlRootElement(name = "recuperarParcelasResponse")
public class RecuperarParcelasResponse {

    @XmlElement(required = true)
    protected byte[] recuperarParcelasReturn;

    /**
     * Gets the value of the recuperarParcelasReturn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRecuperarParcelasReturn() {
        return recuperarParcelasReturn;
    }

    /**
     * Sets the value of the recuperarParcelasReturn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRecuperarParcelasReturn(byte[] value) {
        this.recuperarParcelasReturn = value;
    }

}
