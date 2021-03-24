package com.globalhua.pay.web.portal.biz;

import com.globalhua.pay.facade.project.entity.Project;
import com.globalhua.pay.facade.project.service.ProjectQueryFacade;
import com.globalhua.pay.web.portal.constants.PortalConstants;
import com.globalhua.pay.web.portal.exception.PortalException;
import com.globalhua.pay.web.portal.security.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 切换选择当前项目
 */
@Component
public class SelectProjectBiz {

    @Resource
    ProjectQueryFacade projectQueryFacade;

    @Resource
    HttpServletRequest request;

    public List<Project> optionalProjectList() {
        User principal = getPrincipal();
        List<Project> projects = projectQueryFacade.listByAccountId(principal.getAccountId());
        return projects;
    }

    /**
     * 选择项目
     * 当projectId为 {@code null} 时，选择第一个项目
     * @param projectId 项目ID
     */
    public Project select(Long projectId) {
        List<Project> projects = optionalProjectList();
        if (projects == null || projects.isEmpty()) {
            throw PortalException.PRINCIPAL_SELECT_PROJECT_ERROR;
        }
        Project p = null;
        if (projectId == null) {
            p = projects.get(0);
        } else {
            for (Project project : projects) {
                if (projectId.equals(project.getId())) {
                    p = project;
                    break;
                }
            }
        }
        if (p != null) {
            request.getSession().setAttribute(PortalConstants.SESSION_KEY_SELECT_PROJECT, p.getId());
            return p;
        } else {
            throw PortalException.PRINCIPAL_SELECT_PROJECT_ERROR;
        }
    }

    /**
     * 获取当前项目ID
     * @return
     */
    public Long getCurrentProjectId() {
        Long projectId = (Long) request.getSession()
                .getAttribute(PortalConstants.SESSION_KEY_SELECT_PROJECT);
        if (projectId == null) {
            throw PortalException.PRINCIPAL_SELECT_PROJECT_NOT_FOUND;
        }
        return projectId;
    }

    /**
     * 获取当前用户
     * @return
     */
    private User getPrincipal() {
        User principal = (User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        return principal;
    }
}
