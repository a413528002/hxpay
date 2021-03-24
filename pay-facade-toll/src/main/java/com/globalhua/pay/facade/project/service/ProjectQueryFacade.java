package com.globalhua.pay.facade.project.service;

import com.globalhua.pay.facade.project.entity.Project;

import java.util.List;

/**
 * 项目查询
 */
public interface ProjectQueryFacade {

    List<Project> listByAccountId(Long accountId);
}
