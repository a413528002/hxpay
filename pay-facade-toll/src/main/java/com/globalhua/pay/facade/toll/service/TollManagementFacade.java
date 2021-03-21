package com.globalhua.pay.facade.toll.service;

import com.globalhua.pay.facade.toll.dto.TollTemplate;

import java.util.List;

/**
 * 代发管理
 */
public interface TollManagementFacade {

    /**
     * 导入代发
     * @param temp
     */
    void importToll(List<TollTemplate> temp);
}
