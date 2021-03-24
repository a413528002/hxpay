package com.globalhua.pay.web.portal.controller;

import com.globalhua.pay.common.web.vo.CommonResult;
import com.globalhua.pay.facade.project.entity.Project;
import com.globalhua.pay.web.portal.biz.MaskBiz;
import com.globalhua.pay.web.portal.biz.SelectProjectBiz;
import com.globalhua.pay.web.portal.security.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("principal")
public class PrincipalController {

    @Resource
    SelectProjectBiz selectProjectBiz;

    @Resource
    MaskBiz maskBiz;

    /**
     * 项目列表
     * @return
     */
    @GetMapping("listProject")
    public CommonResult<List<Project>> listProject(@AuthenticationPrincipal User user) {
        List<Project> result = selectProjectBiz.optionalProjectList();
        maskBiz.maskProject(result);
        return CommonResult.ok(result);
    }

    /**
     * 切换项目
     * @param projectId
     * @return
     */
    @PostMapping("selectProject")
    public CommonResult<Project> selectProject(@RequestBody(required = false) Long projectId) {
        Project project = selectProjectBiz.select(projectId);
        maskBiz.maskProject(project);
        return CommonResult.ok(project);
    }

}
