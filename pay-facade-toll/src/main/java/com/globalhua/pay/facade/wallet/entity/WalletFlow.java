package com.globalhua.pay.facade.wallet.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

import java.math.BigDecimal;

/**
 * <p>
 * 钱包流水表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-23
 */
@TableName("hx_component_wallet_flow")
public class WalletFlow extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 业务关联ID
     */
    private Long associatedId;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 出账标记
     */
    private Boolean billStatus;

    /**
     * 流水号
     */
    private String flowNo;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 交易类型
     */
    private String type;

    /**
     * 项目外键
     */
    private Long projectId;


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getAssociatedId() {
        return associatedId;
    }

    public void setAssociatedId(Long associatedId) {
        this.associatedId = associatedId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Boolean getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Boolean billStatus) {
        this.billStatus = billStatus;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "WalletFlow{" +
                "amount=" + amount +
                ", associatedId=" + associatedId +
                ", balance=" + balance +
                ", billStatus=" + billStatus +
                ", flowNo='" + flowNo + '\'' +
                ", operator='" + operator + '\'' +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", projectId=" + projectId +
                ", id=" + id +
                '}';
    }
}
