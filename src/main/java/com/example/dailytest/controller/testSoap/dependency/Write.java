
package com.example.dailytest.controller.testSoap.dependency;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}RequestOptions" minOccurs="0"/&gt;
 *         &lt;element name="ItemList" type="{http://opcfoundation.org/webservices/XMLDA/1.0/}WriteRequestItemList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ReturnValuesOnReply" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "options",
    "itemList"
})
@XmlRootElement(name = "Write")
public class Write {

    @XmlElement(name = "Options")
    protected RequestOptions options;
    @XmlElement(name = "ItemList")
    protected WriteRequestItemList itemList;
    @XmlAttribute(name = "ReturnValuesOnReply", required = true)
    protected boolean returnValuesOnReply;

    /**
     * ��ȡoptions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RequestOptions }
     *     
     */
    public RequestOptions getOptions() {
        return options;
    }

    /**
     * ����options���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOptions }
     *     
     */
    public void setOptions(RequestOptions value) {
        this.options = value;
    }

    /**
     * ��ȡitemList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WriteRequestItemList }
     *     
     */
    public WriteRequestItemList getItemList() {
        return itemList;
    }

    /**
     * ����itemList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WriteRequestItemList }
     *     
     */
    public void setItemList(WriteRequestItemList value) {
        this.itemList = value;
    }

    /**
     * ��ȡreturnValuesOnReply���Ե�ֵ��
     * 
     */
    public boolean isReturnValuesOnReply() {
        return returnValuesOnReply;
    }

    /**
     * ����returnValuesOnReply���Ե�ֵ��
     * 
     */
    public void setReturnValuesOnReply(boolean value) {
        this.returnValuesOnReply = value;
    }

}
