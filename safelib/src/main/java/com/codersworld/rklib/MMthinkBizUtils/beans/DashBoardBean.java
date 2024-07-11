package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class DashBoardBean implements Serializable {
    @SerializedName("status")
    private int mStatus;
    @SerializedName("msg")
    private String mMessage;
    @SerializedName("trip_statusCount")
    private int mTripStatusCount;
    @SerializedName("trip_status")
    private ArrayList<TripStatusBean> mListTripStatus;
    @SerializedName("idle_vehicleCount")
    private int mIdleVehicleCount;
    @SerializedName("idle_vehicle")
    private ArrayList<IdleVehicleBean> mListIdleVehicle;
    @SerializedName("vehicle_statusCount")
    private int mVehicleStatusCount;
    @SerializedName("vehicle_status")
    private ArrayList<TripStatusBean> mListVehicleStatus;
    @SerializedName("days_kmsCount")
    private int mDaysCount;
    @SerializedName("days_kms")
    private ArrayList<KMSBean> mListKMS;

    public DashBoardBean() {
    }

    public int getmTripStatusCount() {
        return this.mTripStatusCount;
    }

    public void setmTripStatusCount(int mTripStatusCount) {
        this.mTripStatusCount = mTripStatusCount;
    }

    public int getmIdleVehicleCount() {
        return this.mIdleVehicleCount;
    }

    public void setmIdleVehicleCount(int mIdleVehicleCount) {
        this.mIdleVehicleCount = mIdleVehicleCount;
    }

    public int getmVehicleStatusCount() {
        return this.mVehicleStatusCount;
    }

    public void setmVehicleStatusCount(int mVehicleStatusCount) {
        this.mVehicleStatusCount = mVehicleStatusCount;
    }

    public int getmDaysCount() {
        return this.mDaysCount;
    }

    public void setmDaysCount(int mDaysCount) {
        this.mDaysCount = mDaysCount;
    }

    public int getmStatus() {
        return this.mStatus;
    }

    public void setmStatus(int mStatus) {
        this.mStatus = mStatus;
    }

    public String getmMessage() {
        return this.mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public ArrayList<TripStatusBean> getmListTripStatus() {
        return this.mListTripStatus;
    }

    public void setmListTripStatus(ArrayList<TripStatusBean> mListTripStatus) {
        this.mListTripStatus = mListTripStatus;
    }

    public ArrayList<IdleVehicleBean> getmListIdleVehicle() {
        return this.mListIdleVehicle;
    }

    public void setmListIdleVehicle(ArrayList<IdleVehicleBean> mListIdleVehicle) {
        this.mListIdleVehicle = mListIdleVehicle;
    }

    public ArrayList<TripStatusBean> getmListVehicleStatus() {
        return this.mListVehicleStatus;
    }

    public void setmListVehicleStatus(ArrayList<TripStatusBean> mListVehicleStatus) {
        this.mListVehicleStatus = mListVehicleStatus;
    }

    public ArrayList<KMSBean> getmListKMS() {
        return this.mListKMS;
    }

    public void setmListKMS(ArrayList<KMSBean> mListKMS) {
        this.mListKMS = mListKMS;
    }
}
