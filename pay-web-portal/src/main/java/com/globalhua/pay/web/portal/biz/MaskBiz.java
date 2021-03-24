package com.globalhua.pay.web.portal.biz;

import com.globalhua.pay.facade.project.entity.Project;
import com.globalhua.pay.web.portal.security.User;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 消除敏感信息
 */
@Component
public class MaskBiz {

    public void maskUser(User user) {
        if (user != null) {
            String phoneNumber = user.getPhoneNumber();
            if (phoneNumber != null && phoneNumber.length() == 11) {
                user.setPhoneNumber(phoneNumber.replace("(\\d{3})\\d{4}(\\d{4})", "$1****$2"));
            }
        }
    }

    public void maskProject(Project project) {
        if (project != null) {
            project.setMerchantCode(null);
            project.setMerchantSecret(null);
            project.setPayOpenId(null);
        }
    }

    public void maskProject(Collection<Project> projects) {
        if (projects != null) {
            for (Project project : projects) {
                maskProject(project);
            }
        }
    }
}
