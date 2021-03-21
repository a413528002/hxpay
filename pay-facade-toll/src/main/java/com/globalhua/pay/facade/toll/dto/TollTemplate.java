package com.globalhua.pay.facade.toll.dto;

import java.math.BigDecimal;

/**
 * 代发导入模板
 */
public class TollTemplate {

    /**
     * 姓名
     */
    private String realname;
    /**
     * 身份证号
     */
    private String idCardNo;
    /**
     * 代发账户
     */
    private String targetAccount;
    /**
     * 代发金额
     */
    private BigDecimal amount;


    /**
     * 归属地
     */
    private String location;
    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 商户自定义
     */
    private String outRemark;

    /**
     * 商户账单号、自定义ID
     */
    private String outId;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOutRemark() {
        return outRemark;
    }

    public void setOutRemark(String outRemark) {
        this.outRemark = outRemark;
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }
}
