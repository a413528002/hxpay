package com.globalhua.pay.facade.toll.service.impl;

import com.globalhua.pay.facade.toll.dto.TollTemplate;
import com.globalhua.pay.facade.toll.service.TollManagementFacade;
import com.globalhua.pay.facade.toll.vo.TollBatchVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TollManagementFacadeImpl implements TollManagementFacade {

    @Override
    public TollBatchVo importToll(List<TollTemplate> temp) {
        // TODO: 2021/3/24
        return null;
    }

    @Override
    public void confirmToll(Long batchId) {
        // TODO: 2021/3/24
    }

    @Override
    public void payToll(Long batchId) {
        // TODO: 2021/3/24
    }
}
