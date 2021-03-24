package com.globalhua.pay.facade.toll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-03-24
 */
@TableName("hx_component_toll_batch")
public class TollBatch extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 开票总额
     */
    private BigDecimal realpay;

    /**
     * 实发总额
     */
    private BigDecimal expspay;

    /**
     * 导入渠道;MANAGER(管理端)	WEB(B端)	API(API)
     */
    private String channelCode;

    /**
     * 城建税总额
     */
    private BigDecimal constructionTax;

    /**
     * 逻辑删除标识
     */
    private Boolean isDeleted;

    /**
     * 教育附加税率总额
     */
    private BigDecimal educationAttachTax;

    /**
     * 佣金税金合计;税总额
     */
    private BigDecimal billTotalTax;

    /**
     * 公司开票税金
     */
    private BigDecimal invoiceTax;

    /**
     * 其它附加税总额
     */
    private BigDecimal otherSurtax;

    /**
     * 代发渠道;CMBEBANK(招商银行)	MYBANK(网商银行)	QPAY(QQ钱包)	EPAY(网易宝)	OFFLINE(线下代发)
     */
    private String payChannel;

    /**
     * 个税总额
     */
    private BigDecimal pertax;

    /**
     * 手续费
     */
    private BigDecimal poundage;

    /**
     * 账单应收合计
     */
    private BigDecimal receivable;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 服务费及税金
     */
    private BigDecimal serviceAndTaxAmount;

    /**
     * 服务费总额
     */
    private BigDecimal serviceCharge;

    /**
     * 数据类型;TEST(测算)	REGULAR(正式)
     */
    private String step;

    /**
     * 成功总金额
     */
    private BigDecimal successAmount;

    /**
     * 成功总笔数
     */
    private Long successCount;

    /**
     * 总金额
     */
    private BigDecimal totalAmount;

    /**
     * 总笔数
     */
    private Long totalCount;

    /**
     * 地方教育附加总额
     */
    private BigDecimal taxAttach;

    /**
     * 税费总额
     */
    private BigDecimal totalTax;

    /**
     * 增值税总额
     */
    private BigDecimal vatax;

    /**
     * 账单外键;关联账单信息ID
     */
    private Long billId;

    /**
     * 流程外键;关联流程状态ID
     */
    private Long flowId;

    /**
     * 项目外键
     */
    private Long projectId;

    /**
     *  项目合同外键
     */
    private Long contractId;

    /**
     * 所属月份
     */
    private LocalDate belongDate;


    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public BigDecimal getRealpay() {
        return realpay;
    }

    public void setRealpay(BigDecimal realpay) {
        this.realpay = realpay;
    }

    public BigDecimal getExpspay() {
        return expspay;
    }

    public void setExpspay(BigDecimal expspay) {
        this.expspay = expspay;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public BigDecimal getConstructionTax() {
        return constructionTax;
    }

    public void setConstructionTax(BigDecimal constructionTax) {
        this.constructionTax = constructionTax;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public BigDecimal getEducationAttachTax() {
        return educationAttachTax;
    }

    public void setEducationAttachTax(BigDecimal educationAttachTax) {
        this.educationAttachTax = educationAttachTax;
    }

    public BigDecimal getBillTotalTax() {
        return billTotalTax;
    }

    public void setBillTotalTax(BigDecimal billTotalTax) {
        this.billTotalTax = billTotalTax;
    }

    public BigDecimal getInvoiceTax() {
        return invoiceTax;
    }

    public void setInvoiceTax(BigDecimal invoiceTax) {
        this.invoiceTax = invoiceTax;
    }

    public BigDecimal getOtherSurtax() {
        return otherSurtax;
    }

    public void setOtherSurtax(BigDecimal otherSurtax) {
        this.otherSurtax = otherSurtax;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public BigDecimal getPertax() {
        return pertax;
    }

    public void setPertax(BigDecimal pertax) {
        this.pertax = pertax;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getServiceAndTaxAmount() {
        return serviceAndTaxAmount;
    }

    public void setServiceAndTaxAmount(BigDecimal serviceAndTaxAmount) {
        this.serviceAndTaxAmount = serviceAndTaxAmount;
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public BigDecimal getSuccessAmount() {
        return successAmount;
    }

    public void setSuccessAmount(BigDecimal successAmount) {
        this.successAmount = successAmount;
    }

    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getTaxAttach() {
        return taxAttach;
    }

    public void setTaxAttach(BigDecimal taxAttach) {
        this.taxAttach = taxAttach;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getVatax() {
        return vatax;
    }

    public void setVatax(BigDecimal vatax) {
        this.vatax = vatax;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public LocalDate getBelongDate() {
        return belongDate;
    }

    public void setBelongDate(LocalDate belongDate) {
        this.belongDate = belongDate;
    }

    @Override
    public String toString() {
        return "TollBatch{" +
                "batchNo='" + batchNo + '\'' +
                ", realpay=" + realpay +
                ", expspay=" + expspay +
                ", channelCode='" + channelCode + '\'' +
                ", constructionTax=" + constructionTax +
                ", isDeleted=" + isDeleted +
                ", educationAttachTax=" + educationAttachTax +
                ", billTotalTax=" + billTotalTax +
                ", invoiceTax=" + invoiceTax +
                ", otherSurtax=" + otherSurtax +
                ", payChannel='" + payChannel + '\'' +
                ", pertax=" + pertax +
                ", poundage=" + poundage +
                ", receivable=" + receivable +
                ", remark='" + remark + '\'' +
                ", serviceAndTaxAmount=" + serviceAndTaxAmount +
                ", serviceCharge=" + serviceCharge +
                ", step='" + step + '\'' +
                ", successAmount=" + successAmount +
                ", successCount=" + successCount +
                ", totalAmount=" + totalAmount +
                ", totalCount=" + totalCount +
                ", taxAttach=" + taxAttach +
                ", totalTax=" + totalTax +
                ", vatax=" + vatax +
                ", billId=" + billId +
                ", flowId=" + flowId +
                ", projectId=" + projectId +
                ", contractId=" + contractId +
                ", belongDate=" + belongDate +
                ", id=" + id +
                '}';
    }
}
