package com.globalhua.pay.facade.account.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

/**
 * <p>
 * 账号表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-22
 */
@TableName("hx_component_account")
public class Account extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 登录账号
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 支付密码
     */
    private String payPassword;

    /**
     * 是否管理员
     */
    private Boolean isAdmin;

    /**
     * 对外开放ID
     */
    private String openId;

    /**
     * 所属平台
     */
    private String origin;

    /**
     * 帐号状态
     */
    private String status;

    /**
     * 账号类型
     */
    private String type;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", payPassword='" + payPassword + '\'' +
                ", isAdmin=" + isAdmin +
                ", openId='" + openId + '\'' +
                ", origin='" + origin + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                '}';
    }
}
