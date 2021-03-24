package com.globalhua.pay.facade.toll.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.globalhua.pay.common.entity.BaseEntity;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-03-24
 */
@TableName("hx_customer")
public class Customer extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * E签宝用户ID
     */
    private String eAccountId;

    /**
     * 身份证反面地址
     */
    private String cardNoBackImg;

    /**
     * 身份证正面地址
     */
    private String cardNoImg;

    /**
     * 身份证号码
     */
    private String certNo;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 对外开放ID
     */
    private String openId;

    /**
     * 证件类型;ID_CARD(身份证)	PASSPORT(护照)
     */
    private String papersType;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 印章信息
     */
    private String sealData;


    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String geteAccountId() {
        return eAccountId;
    }

    public void seteAccountId(String eAccountId) {
        this.eAccountId = eAccountId;
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

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getPapersType() {
        return papersType;
    }

    public void setPapersType(String papersType) {
        this.papersType = papersType;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSealData() {
        return sealData;
    }

    public void setSealData(String sealData) {
        this.sealData = sealData;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "qq='" + qq + '\'' +
                ", eAccountId='" + eAccountId + '\'' +
                ", cardNoBackImg='" + cardNoBackImg + '\'' +
                ", cardNoImg='" + cardNoImg + '\'' +
                ", certNo='" + certNo + '\'' +
                ", mobile='" + mobile + '\'' +
                ", openId='" + openId + '\'' +
                ", papersType='" + papersType + '\'' +
                ", realname='" + realname + '\'' +
                ", sealData='" + sealData + '\'' +
                ", id=" + id +
                '}';
    }
}
