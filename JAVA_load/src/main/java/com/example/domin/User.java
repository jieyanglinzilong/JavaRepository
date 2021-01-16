package com.example.domin;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private String userId;
    private String deptId;
    private String businessPositionId;
    private String name;
    private String password;
    private String pyCode;
    private String realName;
    private String position;
    private String dutyDept;
    private String dutyLevel;
    private Integer userLevel;
    private String cnote;
    private String isUse;
    private String isChangePass;
    private String isOnline;
    private String curStation;
    private String orderNo;
    private Integer loginNum;
    private Date loginTime;
    private String realp;
    private Integer superUser;
    private String mobile;
    private String telephone;
    private String isSendSms;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getBusinessPositionId() {
        return businessPositionId;
    }

    public void setBusinessPositionId(String businessPositionId) {
        this.businessPositionId = businessPositionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPyCode() {
        return pyCode;
    }

    public void setPyCode(String pyCode) {
        this.pyCode = pyCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDutyDept() {
        return dutyDept;
    }

    public void setDutyDept(String dutyDept) {
        this.dutyDept = dutyDept;
    }

    public String getDutyLevel() {
        return dutyLevel;
    }

    public void setDutyLevel(String dutyLevel) {
        this.dutyLevel = dutyLevel;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getCnote() {
        return cnote;
    }

    public void setCnote(String cnote) {
        this.cnote = cnote;
    }

    public String getIsUse() {
        return isUse;
    }

    public void setIsUse(String isUse) {
        this.isUse = isUse;
    }

    public String getIsChangePass() {
        return isChangePass;
    }

    public void setIsChangePass(String isChangePass) {
        this.isChangePass = isChangePass;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    public String getCurStation() {
        return curStation;
    }

    public void setCurStation(String curStation) {
        this.curStation = curStation;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getRealp() {
        return realp;
    }

    public void setRealp(String realp) {
        this.realp = realp;
    }

    public Integer getSuperUser() {
        return superUser;
    }

    public void setSuperUser(Integer superUser) {
        this.superUser = superUser;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIsSendSms() {
        return isSendSms;
    }

    public void setIsSendSms(String isSendSms) {
        this.isSendSms = isSendSms;
    }

    public User() {
    }

    public User(String userId, String deptId, String businessPositionId, String name, String password, String pyCode, String realName, String position, String dutyDept, String dutyLevel, Integer userLevel, String cnote, String isUse, String isChangePass, String isOnline, String curStation, String orderNo, Integer loginNum, Date loginTime, String realp, Integer superUser, String mobile, String telephone, String isSendSms) {
        this.userId = userId;
        this.deptId = deptId;
        this.businessPositionId = businessPositionId;
        this.name = name;
        this.password = password;
        this.pyCode = pyCode;
        this.realName = realName;
        this.position = position;
        this.dutyDept = dutyDept;
        this.dutyLevel = dutyLevel;
        this.userLevel = userLevel;
        this.cnote = cnote;
        this.isUse = isUse;
        this.isChangePass = isChangePass;
        this.isOnline = isOnline;
        this.curStation = curStation;
        this.orderNo = orderNo;
        this.loginNum = loginNum;
        this.loginTime = loginTime;
        this.realp = realp;
        this.superUser = superUser;
        this.mobile = mobile;
        this.telephone = telephone;
        this.isSendSms = isSendSms;
    }
}
