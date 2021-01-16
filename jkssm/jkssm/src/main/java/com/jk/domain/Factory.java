package com.jk.domain;


public class Factory {

    /**
     * 字段属性
     */
    private String factoryId;
    private String fullName;
    private String factoryName;
    private String contacts;
    private String phone;
    private String mobile;
    private String fax;
    private String cnote;
    private String inspector;
    private Integer orderNo;
    private String createBy;
    private String createDept;
    private String createTime;
    //set与get的方法


    public String getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(String factoryId) {
        this.factoryId = factoryId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCnote() {
        return cnote;
    }

    public void setCnote(String cnote) {
        this.cnote = cnote;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    //construct构造方法
    //三个构造方法
    //无参构造方法

    public Factory() {
    }

    //全参构造方法

    public Factory(String factoryId, String fullName, String factoryName, String contacts, String phone, String mobile, String fax, String cnote, String inspector, Integer orderNo, String createBy, String createDept, String createTime) {
        this.factoryId = factoryId;
        this.fullName = fullName;
        this.factoryName = factoryName;
        this.contacts = contacts;
        this.phone = phone;
        this.mobile = mobile;
        this.fax = fax;
        this.cnote = cnote;
        this.inspector = inspector;
        this.orderNo = orderNo;
        this.createBy = createBy;
        this.createDept = createDept;
        this.createTime = createTime;
    }

    //最小化构造方法
    public Factory(String factoryId,  String factoryName) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
    }
}
