package com.globalhua.pay.facade.toll.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.globalhua.pay.facade.toll.entity.TollOrder;
import com.globalhua.pay.facade.toll.service.TollQueryFacade;
import com.globalhua.pay.facade.toll.vo.TollBatchVo;
import org.springframework.stereotype.Service;

@Service
public class TollQueryFacadeImpl implements TollQueryFacade {

    @Override
    public Page<TollBatchVo> pageTollBatchByProjectAndBatchNoLike(Long projectId, String batchNoLike, Page<?> page) {

        return null;
    }

    @Override
    public Page<TollOrder> pageTollOrderByBatchId(Long batchId, Page<?> page) {

        return null;
    }
}
