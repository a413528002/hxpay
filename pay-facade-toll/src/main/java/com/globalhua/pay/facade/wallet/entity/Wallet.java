package com.globalhua.pay.facade.wallet.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

import java.math.BigDecimal;

/**
 * <p>
 * 钱包表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-23
 */
@TableName("hx_component_wallet")
public class Wallet extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 冻结资金
     */
    private BigDecimal frozenBalance;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 奖励金额
     */
    private BigDecimal reward;

    /**
     * 项目外键
     */
    private Long projectId;


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(BigDecimal frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getReward() {
        return reward;
    }

    public void setReward(BigDecimal reward) {
        this.reward = reward;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                ", frozenBalance=" + frozenBalance +
                ", remark='" + remark + '\'' +
                ", reward=" + reward +
                ", projectId=" + projectId +
                ", id=" + id +
                '}';
    }
}
