package com.globalhua.pay.facade.project.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

import java.time.LocalDateTime;

/**
 * <p>
 * 公司配置代发渠道表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-24
 */
@TableName("hx_component_company_paychannel")
public class CompanyPaychannel extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 逻辑删除标识
     */
    private Boolean isDeleted;

    /**
     * 代发渠道
     */
    private String type;

    /**
     * 公司外键
     */
    private Long companyId;


    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "CompanyPaychannel{" +
                "isDeleted=" + isDeleted +
                ", type='" + type + '\'' +
                ", companyId=" + companyId +
                ", id=" + id +
                '}';
    }
}
