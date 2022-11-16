package com.codersworld.rklib.beans;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class StoppageBean implements Serializable {

    @SerializedName("Period")
    private String strstopperiod;
    @SerializedName("StayingDuration")
    private String strstopstayingduration;
    @SerializedName("Address")
    private String strstopaddress;
    @SerializedName("Latitude")
    private String strstoplatitude;
    @SerializedName("Longitude")
    private String strstoplongitude;
    @SerializedName("DeviceCode")
    private String strstopdevicecode;
    @SerializedName("detail")
    private String strstopdetail;
    @SerializedName("StartTime")
    private String strStartTime;
    @SerializedName("Type")
    private String strType;
    @SerializedName("EndTime")
    private String strEndTime;
    @SerializedName("Description")
    private String strDescription;
    @SerializedName("Stayingdurationdescription")
    private String strStayingdurationdescription;
    @SerializedName("Distance")
    private String strDistance;
    @SerializedName("AvgSpeed")
    private String strAvgSpeed;
    @SerializedName("MaxSpeed")
    private String strMaxSpeed;


    public String getStrstopperiod() {
        return strstopperiod;
    }

    public void setStrstopperiod(String strstopperiod) {
        this.strstopperiod = strstopperiod;
    }

    public String getStrstopstayingduration() {
        return strstopstayingduration;
    }

    public void setStrstopstayingduration(String strstopstayingduration) {
        this.strstopstayingduration = strstopstayingduration;
    }

    public String getStrstopaddress() {
        return strstopaddress;
    }

    public void setStrstopaddress(String strstopaddress) {
        this.strstopaddress = strstopaddress;
    }

    public String getStrstoplatitude() {
        return strstoplatitude;
    }

    public void setStrstoplatitude(String strstoplatitude) {
        this.strstoplatitude = strstoplatitude;
    }

    public String getStrstoplongitude() {
        return strstoplongitude;
    }

    public void setStrstoplongitude(String strstoplongitude) {
        this.strstoplongitude = strstoplongitude;
    }

    public String getStrstopdevicecode() {
        return strstopdevicecode;
    }

    public void setStrstopdevicecode(String strstopdevicecode) {
        this.strstopdevicecode = strstopdevicecode;
    }

    public String getStrstopdetail() {
        return strstopdetail;
    }

    public void setStrstopdetail(String strstopdetail) {
        this.strstopdetail = strstopdetail;
    }


    public String getStrStartTime() {
        return strStartTime;
    }

    public void setStrStartTime(String strStartTime) {
        this.strStartTime = strStartTime;
    }

    public String getStrType() {
        return strType;
    }

    public void setStrType(String strType) {
        this.strType = strType;
    }

    public String getStrEndTime() {
        return strEndTime;
    }

    public void setStrEndTime(String strEndTime) {
        this.strEndTime = strEndTime;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

    public String getStrStayingdurationdescription() {
        return strStayingdurationdescription;
    }

    public void setStrStayingdurationdescription(String strStayingdurationdescription) {
        this.strStayingdurationdescription = strStayingdurationdescription;
    }

    public String getStrDistance() {
        return strDistance;
    }

    public void setStrDistance(String strDistance) {
        this.strDistance = strDistance;
    }

    public String getStrAvgSpeed() {
        return strAvgSpeed;
    }

    public void setStrAvgSpeed(String strAvgSpeed) {
        this.strAvgSpeed = strAvgSpeed;
    }

    public String getStrMaxSpeed() {
        return strMaxSpeed;
    }

    public void setStrMaxSpeed(String strMaxSpeed) {
        this.strMaxSpeed = strMaxSpeed;
    }
}
