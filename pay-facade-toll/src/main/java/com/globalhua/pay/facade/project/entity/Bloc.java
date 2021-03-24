package com.globalhua.pay.facade.project.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

/**
 * <p>
 * 集团表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-23
 */
@TableName("hx_component_bloc")
public class Bloc extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 集团名称
     */
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bloc{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
