package com.codersworld.rklib.Helper;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Vehicle implements Serializable {
    @SerializedName("wifilockdeviceid")
    String wifilockdeviceid;
    @SerializedName("wifilockdevicecode")
    String wifilockdevicecode;
    @SerializedName("DeviceType")
    private String DeviceType;
    @SerializedName("btlockid")
    private String btlockid;
    private String mVehicleNumber;
    private String mDeviceId;
    private int mId;
    private String LockFlag;


    private String lockId;
    private String deviceCode;
    private String lockCode;

    public String getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }

    public String getBtlockid() {
        return btlockid;
    }

    public void setBtlockid(String btlockid) {
        this.btlockid = btlockid;
    }

    public String getWifilockdeviceid() {
        return wifilockdeviceid;
    }

    public void setWifilockdeviceid(String wifilockdeviceid) {
        this.wifilockdeviceid = wifilockdeviceid;
    }

    public String getWifilockdevicecode() {
        return wifilockdevicecode;
    }

    public void setWifilockdevicecode(String wifilockdevicecode) {
        this.wifilockdevicecode = wifilockdevicecode;
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getLockCode() {
        return lockCode;
    }

    public void setLockCode(String lockCode) {
        this.lockCode = lockCode;
    }

    public String getmVehicleNumber() {
        return mVehicleNumber;
    }

    public void setmVehicleNumber(String mVehicleNumber) {
        this.mVehicleNumber = mVehicleNumber;
    }

    public String getmDeviceId() {
        return mDeviceId;
    }

    public void setmDeviceId(String mDeviceId) {
        this.mDeviceId = mDeviceId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getLockFlag() {
        return LockFlag;
    }

    public void setLockFlag(String lockFlag) {
        LockFlag = lockFlag;
    }
}