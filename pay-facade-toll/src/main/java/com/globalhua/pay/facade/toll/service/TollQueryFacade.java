package com.globalhua.pay.facade.toll.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.globalhua.pay.facade.toll.entity.TollOrder;
import com.globalhua.pay.facade.toll.vo.TollBatchVo;

/**
 * 代发查询
 */
public interface TollQueryFacade {

    /**
     * 分页查询代发批次
     * @param projectId 项目ID
     * @param batchNoLike 代发批次号模糊
     * @param page 分页参数
     * @return
     */
    Page<TollBatchVo> pageTollBatchByProjectAndBatchNoLike(Long projectId, String batchNoLike, Page<?> page);

    /**
     * 分页查询代发批次下的流水
     * @param batchId 代发批次ID
     * @param page 分页参数
     * @return
     */
    Page<TollOrder> pageTollOrderByBatchId(Long batchId, Page<?> page);
}
