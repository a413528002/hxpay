package com.globalhua.pay.facade.project.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 公司信息表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-24
 */
@TableName("hx_component_company")
public class Company extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 地址
     */
    private String area;

    /**
     * 印业执照编号
     */
    private String bizLicNo;

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
     * 申报类型
     */
    private String declarationType;

    /**
     * 缴税计算公式
     */
    private String businessTaxFormula;

    /**
     * 门征个人缴税计算公式
     */
    private String individualTaxFormula;

    /**
     * 税返计算公式
     */
    private String returnTaxFormula;

    /**
     * 开票上限通知手机号
     */
    private String invoiceNotifyMobile;

    /**
     * 月开票数量上限
     */
    private Long monthInvoiceCount;

    /**
     * 月开票金额报警阈值
     */
    private BigDecimal monthInvoiceWarningAmount;

    /**
     * 月开票数量报警阈值
     */
    private Long monthInvoiceWarningCount;

    /**
     * 个人月代发金额上限
     */
    private BigDecimal personalMonthPayAmountMax;

    /**
     * 个人年代发金额上限
     */
    private BigDecimal personalYearPayAmountMax;

    /**
     * 单张票额
     */
    private BigDecimal singleInvoiceAmount;

    /**
     * 逻辑停用标识
     */
    private Boolean isStop;

    /**
     * 是否校验手机号
     */
    private Boolean isCheckMobile;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBizLicNo() {
        return bizLicNo;
    }

    public void setBizLicNo(String bizLicNo) {
        this.bizLicNo = bizLicNo;
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

    public String getDeclarationType() {
        return declarationType;
    }

    public void setDeclarationType(String declarationType) {
        this.declarationType = declarationType;
    }

    public String getBusinessTaxFormula() {
        return businessTaxFormula;
    }

    public void setBusinessTaxFormula(String businessTaxFormula) {
        this.businessTaxFormula = businessTaxFormula;
    }

    public String getIndividualTaxFormula() {
        return individualTaxFormula;
    }

    public void setIndividualTaxFormula(String individualTaxFormula) {
        this.individualTaxFormula = individualTaxFormula;
    }

    public String getReturnTaxFormula() {
        return returnTaxFormula;
    }

    public void setReturnTaxFormula(String returnTaxFormula) {
        this.returnTaxFormula = returnTaxFormula;
    }

    public String getInvoiceNotifyMobile() {
        return invoiceNotifyMobile;
    }

    public void setInvoiceNotifyMobile(String invoiceNotifyMobile) {
        this.invoiceNotifyMobile = invoiceNotifyMobile;
    }

    public Long getMonthInvoiceCount() {
        return monthInvoiceCount;
    }

    public void setMonthInvoiceCount(Long monthInvoiceCount) {
        this.monthInvoiceCount = monthInvoiceCount;
    }

    public BigDecimal getMonthInvoiceWarningAmount() {
        return monthInvoiceWarningAmount;
    }

    public void setMonthInvoiceWarningAmount(BigDecimal monthInvoiceWarningAmount) {
        this.monthInvoiceWarningAmount = monthInvoiceWarningAmount;
    }

    public Long getMonthInvoiceWarningCount() {
        return monthInvoiceWarningCount;
    }

    public void setMonthInvoiceWarningCount(Long monthInvoiceWarningCount) {
        this.monthInvoiceWarningCount = monthInvoiceWarningCount;
    }

    public BigDecimal getPersonalMonthPayAmountMax() {
        return personalMonthPayAmountMax;
    }

    public void setPersonalMonthPayAmountMax(BigDecimal personalMonthPayAmountMax) {
        this.personalMonthPayAmountMax = personalMonthPayAmountMax;
    }

    public BigDecimal getPersonalYearPayAmountMax() {
        return personalYearPayAmountMax;
    }

    public void setPersonalYearPayAmountMax(BigDecimal personalYearPayAmountMax) {
        this.personalYearPayAmountMax = personalYearPayAmountMax;
    }

    public BigDecimal getSingleInvoiceAmount() {
        return singleInvoiceAmount;
    }

    public void setSingleInvoiceAmount(BigDecimal singleInvoiceAmount) {
        this.singleInvoiceAmount = singleInvoiceAmount;
    }

    public Boolean getIsStop() {
        return isStop;
    }

    public void setIsStop(Boolean isStop) {
        this.isStop = isStop;
    }

    public Boolean getIsCheckMobile() {
        return isCheckMobile;
    }

    public void setIsCheckMobile(Boolean isCheckMobile) {
        this.isCheckMobile = isCheckMobile;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", bizLicNo='" + bizLicNo + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactMobile='" + contactMobile + '\'' +
                ", contactName='" + contactName + '\'' +
                ", declarationType='" + declarationType + '\'' +
                ", businessTaxFormula='" + businessTaxFormula + '\'' +
                ", individualTaxFormula='" + individualTaxFormula + '\'' +
                ", returnTaxFormula='" + returnTaxFormula + '\'' +
                ", invoiceNotifyMobile='" + invoiceNotifyMobile + '\'' +
                ", monthInvoiceCount=" + monthInvoiceCount +
                ", monthInvoiceWarningAmount=" + monthInvoiceWarningAmount +
                ", monthInvoiceWarningCount=" + monthInvoiceWarningCount +
                ", personalMonthPayAmountMax=" + personalMonthPayAmountMax +
                ", personalYearPayAmountMax=" + personalYearPayAmountMax +
                ", singleInvoiceAmount=" + singleInvoiceAmount +
                ", isStop=" + isStop +
                ", isCheckMobile=" + isCheckMobile +
                ", id=" + id +
                '}';
    }
}
