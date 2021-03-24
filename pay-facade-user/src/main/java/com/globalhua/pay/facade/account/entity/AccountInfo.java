package com.globalhua.pay.facade.account.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

/**
 * <p>
 * 账号信息详情表
 * </p>
 *
 * @author ${author}
 * @since 2021-03-22
 */
@TableName("hx_component_account_info")
public class AccountInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * E签保账户ID
     */
    private String eAccountId;

    /**
     * 身份证号码
     */
    private String cardNo;

    /**
     * 手持身份证地址
     */
    private String handCardNoImg;

    /**
     * 身份证反面地址
     */
    private String cardNoBackImg;

    /**
     * 身份证正面地址
     */
    private String cardNoImg;

    /**
     * 是否实名认证
     */
    private String certification;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String icon;

    /**
     * 新建标识
     */
    private Boolean initStatus;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 印章信息
     */
    private String sealData;

    /**
     * 关联账号表外键
     */
    private Long accountId;


    public String geteAccountId() {
        return eAccountId;
    }

    public void seteAccountId(String eAccountId) {
        this.eAccountId = eAccountId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getHandCardNoImg() {
        return handCardNoImg;
    }

    public void setHandCardNoImg(String handCardNoImg) {
        this.handCardNoImg = handCardNoImg;
    }

    public String getCardNoBackImg() {
        return cardNoBackImg;
    }

    public void setCardNoBackImg(String cardNoBackImg) {
        this.cardNoBackImg = cardNoBackImg;
    }

    public String getCardNoImg() {
        return cardNoImg;
    }

    public void setCardNoImg(String cardNoImg) {
        this.cardNoImg = cardNoImg;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getInitStatus() {
        return initStatus;
    }

    public void setInitStatus(Boolean initStatus) {
        this.initStatus = initStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSealData() {
        return sealData;
    }

    public void setSealData(String sealData) {
        this.sealData = sealData;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "eAccountId='" + eAccountId + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", handCardNoImg='" + handCardNoImg + '\'' +
                ", cardNoBackImg='" + cardNoBackImg + '\'' +
                ", cardNoImg='" + cardNoImg + '\'' +
                ", certification='" + certification + '\'' +
                ", email='" + email + '\'' +
                ", icon='" + icon + '\'' +
                ", initStatus=" + initStatus +
                ", mobile='" + mobile + '\'' +
                ", qq='" + qq + '\'' +
                ", realname='" + realname + '\'' +
                ", remark='" + remark + '\'' +
                ", sealData='" + sealData + '\'' +
                ", accountId=" + accountId +
                ", id=" + id +
                '}';
    }
}
