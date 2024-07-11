package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class VehicalBean implements Serializable {
    String strVehicalGroup;
    String strVehicleId;
    @SerializedName("vehiclenumber")
    private String strCarNumber;
    @SerializedName("accstatus")
    private String strCarStatus;
    @SerializedName("tme")
    private String strCarTime;
    @SerializedName("idletime")
    private String strCarIdleTime;
    @SerializedName("address")
    private String strVehicleLocation;
    @SerializedName("speed")
    private String strVehicleSpeed;
    @SerializedName("lat")
    private String strLat;
    @SerializedName("lng")
    private String strLong;
    @SerializedName("distance")
    private String strDistance;
    @SerializedName("destination")
    private String strDestination;
    @SerializedName("PhoneNo")
    private String strPhone;
    @SerializedName("DriverName")
    private String strDriverName;
    @SerializedName("DistanceSinceMorning")
    private String strDistanceSinceMorning;
    @SerializedName("Val1")
    private String strVal1;
    @SerializedName("Val2")
    private String strVal2;
    @SerializedName("Val3")
    private String strVal3;
    @SerializedName("Val4")
    private String strVal4;

    public VehicalBean() {
    }

    public String getStrCarNumber() {
        return this.strCarNumber;
    }

    public void setStrCarNumber(String strCarNumber) {
        this.strCarNumber = strCarNumber;
    }

    public String getStrCarStatus() {
        return this.strCarStatus;
    }

    public void setStrCarStatus(String strCarStatus) {
        this.strCarStatus = strCarStatus;
    }

    public String getStrCarTime() {
        return this.strCarTime;
    }

    public void setStrCarTime(String strCarTime) {
        this.strCarTime = strCarTime;
    }

    public String getStrCarIdleTime() {
        return this.strCarIdleTime;
    }

    public void setStrCarIdleTime(String strCarIdleTime) {
        this.strCarIdleTime = strCarIdleTime;
    }

    public String getStrVehicleLocation() {
        return this.strVehicleLocation;
    }

    public void setStrVehicleLocation(String strVehicleLocation) {
        this.strVehicleLocation = strVehicleLocation;
    }

    public String getStrVehicalGroup() {
        return this.strVehicalGroup;
    }

    public void setStrVehicalGroup(String strVehicalGroup) {
        this.strVehicalGroup = strVehicalGroup;
    }

    public String getStrVehicleId() {
        return this.strVehicleId;
    }

    public void setStrVehicleId(String strVehicleId) {
        this.strVehicleId = strVehicleId;
    }

    public String getStrVehicleSpeed() {
        return this.strVehicleSpeed;
    }

    public void setStrVehicleSpeed(String strVehicleSpeed) {
        this.strVehicleSpeed = strVehicleSpeed;
    }

    public String getStrLat() {
        return this.strLat;
    }

    public void setStrLat(String strLat) {
        this.strLat = strLat;
    }

    public String getStrLong() {
        return this.strLong;
    }

    public void setStrLong(String strLong) {
        this.strLong = strLong;
    }

    public String getStrDistance() {
        return this.strDistance;
    }

    public void setStrDistance(String strDistance) {
        this.strDistance = strDistance;
    }

    public String getStrDestination() {
        return this.strDestination;
    }

    public void setStrDestination(String strDestination) {
        this.strDestination = strDestination;
    }

    public String getStrPhone() {
        return this.strPhone;
    }

    public void setStrPhone(String strPhone) {
        this.strPhone = strPhone;
    }

    public String getStrDriverName() {
        return this.strDriverName;
    }

    public void setStrDriverName(String strDriverName) {
        this.strDriverName = strDriverName;
    }

    public String getStrDistanceSinceMorning() {
        return this.strDistanceSinceMorning;
    }

    public void setStrDistanceSinceMorning(String strDistanceSinceMorning) {
        this.strDistanceSinceMorning = strDistanceSinceMorning;
    }

    public String getStrVal1() {
        return this.strVal1;
    }

    public void setStrVal1(String strVal1) {
        this.strVal1 = strVal1;
    }

    public String getStrVal2() {
        return this.strVal2;
    }

    public void setStrVal2(String strVal2) {
        this.strVal2 = strVal2;
    }

    public String getStrVal3() {
        return this.strVal3;
    }

    public void setStrVal3(String strVal3) {
        this.strVal3 = strVal3;
    }

    public String getStrVal4() {
        return this.strVal4;
    }

    public void setStrVal4(String strVal4) {
        this.strVal4 = strVal4;
    }
}

