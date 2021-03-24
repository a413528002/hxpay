package com.globalhua.pay.facade.project.service.impl;

import com.globalhua.pay.facade.project.entity.Project;
import com.globalhua.pay.facade.project.service.ProjectQueryFacade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectQueryFacadeImpl implements ProjectQueryFacade {

    @Override
    public List<Project> listByAccountId(Long accountId) {
        return null;
    }
}
