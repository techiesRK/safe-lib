package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AlertBean implements Serializable {

    @SerializedName("VehicleNumber")
    private String strVehicleNumber;
    @SerializedName("Alartcode")
    private String strAlartcode;
    @SerializedName("AlartName")
    private String strAlartName;
    @SerializedName("AlertDatetime")
    private String strAlertDatetime;
    @SerializedName("Speed")
    private String strSpeed;
    @SerializedName("Lat")
    private String strLat;
    @SerializedName("Long")
    private String strLong;
    @SerializedName("LocationName")
    private String strLocationName;
    @SerializedName("AckTime")
    private String strAckTime;

    @SerializedName("AckComment")
    private String strAckComment;


    public AlertBean() {
    }

    public String getStrVehicleNumber() {
        return strVehicleNumber;
    }

    public void setStrVehicleNumber(String strVehicleNumber) {
        this.strVehicleNumber = strVehicleNumber;
    }

    public String getStrAlartcode() {
        return strAlartcode;
    }

    public void setStrAlartcode(String strAlartcode) {
        this.strAlartcode = strAlartcode;
    }

    public String getStrAlartName() {
        return strAlartName;
    }

    public void setStrAlartName(String strAlartName) {
        this.strAlartName = strAlartName;
    }

    public String getStrAlertDatetime() {
        return strAlertDatetime;
    }

    public void setStrAlertDatetime(String strAlertDatetime) {
        this.strAlertDatetime = strAlertDatetime;
    }

    public String getStrSpeed() {
        return strSpeed;
    }

    public void setStrSpeed(String strSpeed) {
        this.strSpeed = strSpeed;
    }

    public String getStrLat() {
        return strLat;
    }

    public void setStrLat(String strLat) {
        this.strLat = strLat;
    }

    public String getStrLong() {
        return strLong;
    }

    public void setStrLong(String strLong) {
        this.strLong = strLong;
    }

    public String getStrLocationName() {
        return strLocationName;
    }

    public void setStrLocationName(String strLocationName) {
        this.strLocationName = strLocationName;
    }

    public String getStrAckTime() {
        return strAckTime;
    }

    public void setStrAckTime(String strAckTime) {
        this.strAckTime = strAckTime;
    }

    public String getStrAckComment() {
        return strAckComment;
    }

    public void setStrAckComment(String strAckComment) {
        this.strAckComment = strAckComment;
    }
}
