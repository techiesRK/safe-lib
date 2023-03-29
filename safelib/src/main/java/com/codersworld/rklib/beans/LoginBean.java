package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoginBean implements Serializable {

    @SerializedName("returnmessage")
    private String strreturnmessage;
    @SerializedName("uid")
    private String struid;
   @SerializedName("isbackupuser")
    private String isbackupuser;
    @SerializedName("val1")
    private String strval1;
    @SerializedName("gcmstatus")
    private String strgcmstatus;
    @SerializedName("usercategory")
    private String strusercategory;
    @SerializedName("Blatlong")
    private String strblatlong;
    @SerializedName("val2")
    private String strval2;
    @SerializedName("val3")
    private String strval3;
    @SerializedName("val4")
    private String strval4;

    @SerializedName("btmainuserId")
    private String btmainuserId;
    @SerializedName("btmailpwd")
    private String btmailpwd;

    @SerializedName("btusername")
    private String btusername;

    @SerializedName("IsHotelUser")
    private String IsHotelUser;

    @SerializedName("clientid")
    private String clientid;

    @SerializedName("clientsecret")
    private String clientsecret;

    @SerializedName("MainContactId")
    private String MainContactId;

    public String getIsbackupuser() {
        return isbackupuser;
    }

    public void setIsbackupuser(String isbackupuser) {
        this.isbackupuser = isbackupuser;
    }

    public String getMainContactId() {
        return MainContactId;
    }

    public void setMainContactId(String mainContactId) {
        MainContactId = mainContactId;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getClientsecret() {
        return clientsecret;
    }

    public void setClientsecret(String clientsecret) {
        this.clientsecret = clientsecret;
    }

    public String getBtmainuserId() {
        return btmainuserId;
    }

    public void setBtmainuserId(String btmainuserId) {
        this.btmainuserId = btmainuserId;
    }

    public String getBtmailpwd() {
        return btmailpwd;
    }

    public void setBtmailpwd(String btmailpwd) {
        this.btmailpwd = btmailpwd;
    }

    public String getIsHotelUser() {
        return IsHotelUser;
    }

    public void setIsHotelUser(String isHotelUser) {
        IsHotelUser = isHotelUser;
    }

    public String getBtusername() {
        return btusername;
    }

    public void setBtusername(String btusername) {
        this.btusername = btusername;
    }

    @SerializedName("usertype")
    private String usertype;

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @SerializedName("token")
    private String strtoken;

    public LoginBean() {
    }


    public String getStrreturnmessage() {
        return strreturnmessage;
    }

    public void setStrreturnmessage(String strreturnmessage) {
        this.strreturnmessage = strreturnmessage;
    }

    public String getStruid() {
        return struid;
    }

    public void setStruid(String struid) {
        this.struid = struid;

    }

    public String getStrval1() {
        return strval1;
    }

    public void setStrval1(String strval1) {
        this.strval1 = strval1;
    }

    public String getStrval2() {
        return strval2;
    }

    public void setStrval2(String strval2) {
        this.strval2 = strval2;
    }

    public String getStrval3() {
        return strval3;
    }

    public void setStrval3(String strval3) {
        this.strval3 = strval3;
    }

    public String getStrval4() {
        return strval4;
    }

    public void setStrval4(String strval4) {
        this.strval4 = strval4;
    }

    public String getStrgcmstatus() {
        return strgcmstatus;
    }

    public void setStrgcmstatus(String strgcmstatus) {
        this.strgcmstatus = strgcmstatus;
    }

    public String getStrusercategory() {
        return strusercategory;
    }

    public String getStrblatlong() {
        return strblatlong;
    }

    public void setStrblatlong(String strblatlong) {
        this.strblatlong = strblatlong;
    }

    public void setStrusercategory(String strusercategory) {
        this.strusercategory = strusercategory;
    }


    public String getStrtoken() {
        return strtoken;
    }

    public void setStrtoken(String strtoken) {
        this.strtoken = strtoken;
    }
}
