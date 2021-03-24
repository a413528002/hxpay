package com.globalhua.pay.facade.toll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-03-24
 */
@TableName("hx_component_toll_order")
public class TollOrder extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 银行账号
     */
    private String bankAccount;

    /**
     * 银行卡归属地
     */
    private String bankCardLocation;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 实发金额
     */
    private BigDecimal expspay;

    /**
     * 应发金额
     */
    private BigDecimal realpay;

    /**
     * 应发金额
     */
    private BigDecimal constructionTax;

    /**
     * 教育附加税
     */
    private BigDecimal educationAttachTax;

    /**
     * 其他附加税
     */
    private BigDecimal otherSurtax;

    /**
     * 个税
     */
    private BigDecimal pertax;

    /**
     * 地方教育附加税
     */
    private BigDecimal taxAttach;

    /**
     * 增值税
     */
    private BigDecimal vatax;

    /**
     * 开票税金
     */
    private BigDecimal invoiceTax;

    /**
     * 手续费
     */
    private BigDecimal poundage;

    /**
     * 账单应收合计
     */
    private BigDecimal receivable;

    /**
     * 服务费
     */
    private BigDecimal serviceCharge;

    /**
     * 附加费
     */
    private BigDecimal surtax;

    /**
     * 税费总额
     */
    private BigDecimal totalTax;

    /**
     * 导入状态
     */
    private String status;

    /**
     * 代发状态
     */
    private String orderStatus;

    /**
     * 对账状态
     */
    private String finalStatus;

    /**
     * 代发信息说明
     */
    private String orderReason;

    /**
     * 代发方式;EXPSPAY(佣金实发)	REALPAY(佣金应发)	BILLPAY(账单金额)
     */
    private String model;

    /**
     * 银行支行
     */
    private String subBranch;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 备注信息;手动通过备注
     */
    private String memo;

    /**
     * 三方平台交易号
     */
    private String transNo;

    /**
     * 关联账单流水ID
     */
    private Long billFlowId;

    /**
     * 出账标记
     */
    private Boolean billStatus;

    /**
     * 逻辑删除标识
     */
    private Boolean deleteStatus;

    /**
     * 手动标记失败状态
     */
    private Boolean orderFailStatus;

    /**
     * 待退款标志
     */
    private Boolean refund;

    /**
     * 出账修改状态;UPDATE(修改处理)	SUCCESS(已出账处理)
     */
    private String sign;

    /**
     * 批次外键
     */
    private Long batchId;

    /**
     * 代发客户外键
     */
    private Long customerId;


    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankCardLocation() {
        return bankCardLocation;
    }

    public void setBankCardLocation(String bankCardLocation) {
        this.bankCardLocation = bankCardLocation;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BigDecimal getExpspay() {
        return expspay;
    }

    public void setExpspay(BigDecimal expspay) {
        this.expspay = expspay;
    }

    public BigDecimal getRealpay() {
        return realpay;
    }

    public void setRealpay(BigDecimal realpay) {
        this.realpay = realpay;
    }

    public BigDecimal getConstructionTax() {
        return constructionTax;
    }

    public void setConstructionTax(BigDecimal constructionTax) {
        this.constructionTax = constructionTax;
    }

    public BigDecimal getEducationAttachTax() {
        return educationAttachTax;
    }

    public void setEducationAttachTax(BigDecimal educationAttachTax) {
        this.educationAttachTax = educationAttachTax;
    }

    public BigDecimal getOtherSurtax() {
        return otherSurtax;
    }

    public void setOtherSurtax(BigDecimal otherSurtax) {
        this.otherSurtax = otherSurtax;
    }

    public BigDecimal getPertax() {
        return pertax;
    }

    public void setPertax(BigDecimal pertax) {
        this.pertax = pertax;
    }

    public BigDecimal getTaxAttach() {
        return taxAttach;
    }

    public void setTaxAttach(BigDecimal taxAttach) {
        this.taxAttach = taxAttach;
    }

    public BigDecimal getVatax() {
        return vatax;
    }

    public void setVatax(BigDecimal vatax) {
        this.vatax = vatax;
    }

    public BigDecimal getInvoiceTax() {
        return invoiceTax;
    }

    public void setInvoiceTax(BigDecimal invoiceTax) {
        this.invoiceTax = invoiceTax;
    }

    public BigDecimal getPoundage() {
        return poundage;
    }

    public void setPoundage(BigDecimal poundage) {
        this.poundage = poundage;
    }

    public BigDecimal getReceivable() {
        return receivable;
    }

    public void setReceivable(BigDecimal receivable) {
        this.receivable = receivable;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public BigDecimal getSurtax() {
        return surtax;
    }

    public void setSurtax(BigDecimal surtax) {
        this.surtax = surtax;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getFinalStatus() {
        return finalStatus;
    }

    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }

    public String getOrderReason() {
        return orderReason;
    }

    public void setOrderReason(String orderReason) {
        this.orderReason = orderReason;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSubBranch() {
        return subBranch;
    }

    public void setSubBranch(String subBranch) {
        this.subBranch = subBranch;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public Long getBillFlowId() {
        return billFlowId;
    }

    public void setBillFlowId(Long billFlowId) {
        this.billFlowId = billFlowId;
    }

    public Boolean getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Boolean billStatus) {
        this.billStatus = billStatus;
    }

    public Boolean getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Boolean deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Boolean getOrderFailStatus() {
        return orderFailStatus;
    }

    public void setOrderFailStatus(Boolean orderFailStatus) {
        this.orderFailStatus = orderFailStatus;
    }

    public Boolean getRefund() {
        return refund;
    }

    public void setRefund(Boolean refund) {
        this.refund = refund;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "TollOrder{" +
                "orderNo='" + orderNo + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", bankCardLocation='" + bankCardLocation + '\'' +
                ", bankName='" + bankName + '\'' +
                ", expspay=" + expspay +
                ", realpay=" + realpay +
                ", constructionTax=" + constructionTax +
                ", educationAttachTax=" + educationAttachTax +
                ", otherSurtax=" + otherSurtax +
                ", pertax=" + pertax +
                ", taxAttach=" + taxAttach +
                ", vatax=" + vatax +
                ", invoiceTax=" + invoiceTax +
                ", poundage=" + poundage +
                ", receivable=" + receivable +
                ", serviceCharge=" + serviceCharge +
                ", surtax=" + surtax +
                ", totalTax=" + totalTax +
                ", status='" + status + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", finalStatus='" + finalStatus + '\'' +
                ", orderReason='" + orderReason + '\'' +
                ", model='" + model + '\'' +
                ", subBranch='" + subBranch + '\'' +
                ", remark='" + remark + '\'' +
                ", memo='" + memo + '\'' +
                ", transNo='" + transNo + '\'' +
                ", billFlowId=" + billFlowId +
                ", billStatus=" + billStatus +
                ", deleteStatus=" + deleteStatus +
                ", orderFailStatus=" + orderFailStatus +
                ", refund=" + refund +
                ", sign='" + sign + '\'' +
                ", batchId=" + batchId +
                ", customerId=" + customerId +
                ", id=" + id +
                '}';
    }
}
