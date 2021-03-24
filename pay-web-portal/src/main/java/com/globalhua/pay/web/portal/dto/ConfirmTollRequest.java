package com.globalhua.pay.web.portal.dto;

/**
 * 确认代发请求
 */
public class ConfirmTollRequest {

    /**
     * 代发批次ID
     */
    Long batchId;

    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }
}
