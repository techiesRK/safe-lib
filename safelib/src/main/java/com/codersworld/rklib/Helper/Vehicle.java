package com.codersworld.rklib.Helper;
public class Vehicle {
    private String mVehicleNumber;
    private String mDeviceId;
    private int mId;
    private String LockFlag;
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