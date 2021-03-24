package com.globalhua.pay.facade.project.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

/**
 * <p>
 * 客户信息表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-23
 */
@TableName("hx_component_client")
public class Client extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 客户编号
     */
    private Long number;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 客户状态
     */
    private String status;

    /**
     * 银行账号
     */
    private String bankAccount;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 税务识别号
     */
    private String bizlicNo;

    /**
     * 联系人邮箱
     */
    private String contactEmail;

    /**
     * 联系人电话
     */
    private String contactMobile;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 开票内容
     */
    private String invoiceContent;

    /**
     * 缩写编号
     */
    private String abbreviate;

    /**
     * 客户地址
     */
    private String address;

    /**
     * 关联集团外键
     */
    private Long blocId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBizlicNo() {
        return bizlicNo;
    }

    public void setBizlicNo(String bizlicNo) {
        this.bizlicNo = bizlicNo;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public String getAbbreviate() {
        return abbreviate;
    }

    public void setAbbreviate(String abbreviate) {
        this.abbreviate = abbreviate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getBlocId() {
        return blocId;
    }

    public void setBlocId(Long blocId) {
        this.blocId = blocId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bizlicNo='" + bizlicNo + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactMobile='" + contactMobile + '\'' +
                ", contactName='" + contactName + '\'' +
                ", invoiceContent='" + invoiceContent + '\'' +
                ", abbreviate='" + abbreviate + '\'' +
                ", address='" + address + '\'' +
                ", blocId=" + blocId +
                ", id=" + id +
                '}';
    }
}
