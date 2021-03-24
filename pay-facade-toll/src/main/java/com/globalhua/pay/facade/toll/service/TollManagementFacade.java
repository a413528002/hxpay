package com.globalhua.pay.facade.toll.service;

import com.globalhua.pay.facade.toll.dto.TollTemplate;
import com.globalhua.pay.facade.toll.vo.TollBatchVo;

import java.util.List;

/**
 * 代发操作
 */
public interface TollManagementFacade {

    /**
     * 导入代发
     * 返回批次Vo
     * @param temp
     */
    TollBatchVo importToll(List<TollTemplate> temp);

    /**
     * 确认代发
     * @param batchId 批次ID
     */
    void confirmToll(Long batchId);

    /**
     * 支付代发
     * @param batchId 批次ID
     */
    void payToll(Long batchId);
}
