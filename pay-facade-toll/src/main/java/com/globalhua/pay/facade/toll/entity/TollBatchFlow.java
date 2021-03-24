package com.globalhua.pay.facade.toll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-03-24
 */
@TableName("hx_component_toll_batch_flow")
public class TollBatchFlow extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 备注
     */
    private String remark;

    /**
     * 综合状态；PAY_PENDING(待付款)	PAY_SUCCESS(已完成)	PAY_FAIL(部分完成)
     */
    private String state;

    /**
     * 流程状态；INIT(导入)	PAY_HANDLE(待付款)	PAY_CHECKING(待审核)	PAY_CHECKING_FAIL(驳回)	PAID(正在代发)	REHANDLE_PAID(正在重发)	REHANDLE_PREPARE(重发待审核)	REHANDLE_CHECKING_FAIL(重发驳回)	REHANDLE_CHECKING_SUCCESS(重发待付款)	PAY_FAIL(部分完成)	PAY_SUCCESS(已完成)
     */
    private String status;

    /**
     * 批次外键
     */
    private Long batchId;

    /**
     * 操作账户ID
     */
    private Long createdUserId;

    /**
     * 操作账户姓名
     */
    private String createdUserName;


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    @Override
    public String toString() {
        return "TollBatchFlow{" +
                "remark='" + remark + '\'' +
                ", state='" + state + '\'' +
                ", status='" + status + '\'' +
                ", batchId=" + batchId +
                ", createdUserId=" + createdUserId +
                ", createdUserName='" + createdUserName + '\'' +
                ", id=" + id +
                '}';
    }
}
