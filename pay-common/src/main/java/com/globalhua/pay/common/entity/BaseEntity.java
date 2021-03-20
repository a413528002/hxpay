package com.globalhua.pay.common.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础实体类，包含各实体公用属性
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer version;

    protected LocalDateTime createdTime;

    protected LocalDateTime modifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
