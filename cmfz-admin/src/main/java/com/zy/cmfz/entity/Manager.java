package com.zy.cmfz.entity;

/**
 * @Author:zy
 * @Date: 2018-07-04 15:59
 * @Description:管理员实体
 */
public class Manager {
    private String mgrId;
    private String mgrName;
    private String mgrSalt;
    private String mgrPassword;
    private String mgrStatus;



    public String getMgrId() {
        return mgrId;
    }
    public void setMgrId(String mgrId) {
        this.mgrId = mgrId;
    }
    public String getMgrName() {
        return mgrName;
    }
    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }
    public String getMgrSalt() {
        return mgrSalt;
    }
    public void setMgrSalt(String mgrSalt) {
        this.mgrSalt = mgrSalt;
    }
    public String getMgrPassword() {
        return mgrPassword;
    }
    public void setMgrPassword(String mgrPassword) {
        this.mgrPassword = mgrPassword;
    }
    public String getMgrStatus() {
        return mgrStatus;
    }
    public void setMgrStatus(String mgrStatus) {
        this.mgrStatus = mgrStatus;
    }
}
