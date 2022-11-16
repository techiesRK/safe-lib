package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ReportBean implements Serializable {

    @SerializedName("lat")
    private String strreportlat;
   /* @SerializedName("tme")
    private String strtme;
   */ @SerializedName("lng")
    private String strreportlng;
    @SerializedName("tme")
    private String strreporttime;
    @SerializedName("speed")
    private String strreportspeed;
    @SerializedName("address")
    private String strreportaddress;
    @SerializedName("distance")
    private String strreportdistance;
    private String strDuration;
    private String strStopTime;
    private String strStartTime;

    public String getStrDuration() {
        return strDuration;
    }

    public void setStrDuration(String strDuration) {
        this.strDuration = strDuration;
    }

    public String getStrStopTime() {
        return strStopTime;
    }

    public void setStrStopTime(String strStopTime) {
        this.strStopTime = strStopTime;
    }

    public String getStrStartTime() {
        return strStartTime;
    }

    public void setStrStartTime(String strStartTime) {
        this.strStartTime = strStartTime;
    }

    /*
    public String getStrtme() {
        return strtme;
    }

    public void setStrtme(String strtme) {
        this.strtme = strtme;
    }*/

    public String getStrreportlat() {
        return strreportlat;
    }

    public void setStrreportlat(String strreportlat) {
        this.strreportlat = strreportlat;
    }

    public String getStrreportlng() {
        return strreportlng;
    }

    public void setStrreportlng(String strreportlng) {
        this.strreportlng = strreportlng;
    }

    public String getStrreporttime() {
        return strreporttime;
    }

    public void setStrreporttime(String strreporttime) {
        this.strreporttime = strreporttime;
    }

    public String getStrreportspeed() {
        return strreportspeed;
    }

    public void setStrreportspeed(String strreportspeed) {
        this.strreportspeed = strreportspeed;
    }

    public String getStrreportaddress() {
        return strreportaddress;
    }

    public void setStrreportaddress(String strreportaddress) {
        this.strreportaddress = strreportaddress;
    }

    public String getStrreportdistance() {
        return strreportdistance;
    }

    public void setStrreportdistance(String strreportdistance) {
        this.strreportdistance = strreportdistance;
    }
}
