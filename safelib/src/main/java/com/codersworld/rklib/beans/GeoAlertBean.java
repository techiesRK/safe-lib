package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

public class GeoAlertBean {

    @SerializedName("SRNo")
    private String strSRno;
    @SerializedName("GeocodeName")
    private String strGeocodename;
    @SerializedName("VehicleNumber")
    private String strVehicleNum;
    @SerializedName("EntryTime")
    private String strEntryTime;
    @SerializedName("ExitTime")
    private String strExitTime;
    @SerializedName("StayingDuration")
    private String strStayingduration;


    public String getStrSRno() {
        return strSRno;
    }

    public void setStrSRno(String strSRno) {
        this.strSRno = strSRno;
    }

    public String getStrGeocodename() {
        return strGeocodename;
    }

    public void setStrGeocodename(String strGeocodename) {
        this.strGeocodename = strGeocodename;
    }

    public String getStrVehicleNum() {
        return strVehicleNum;
    }

    public void setStrVehicleNum(String strVehicleNum) {
        this.strVehicleNum = strVehicleNum;
    }

    public String getStrExitTime() {
        return strExitTime;
    }

    public void setStrExitTime(String strExitTime) {
        this.strExitTime = strExitTime;
    }

    public String getStrStayingduration() {
        return strStayingduration;
    }

    public void setStrStayingduration(String strStayingduration) {
        this.strStayingduration = strStayingduration;
    }

    public String getStrEntryTime() {
        return strEntryTime;
    }

    public void setStrEntryTime(String strEntryTime) {
        this.strEntryTime = strEntryTime;
    }
}
