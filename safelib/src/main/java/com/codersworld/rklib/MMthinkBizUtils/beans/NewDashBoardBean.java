package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;


public class NewDashBoardBean implements Serializable {
    @SerializedName("success")
    private int mStatus;
    @SerializedName("returnds")
    private int mIdleVehicleCount;
    @SerializedName("vehicle_idle")
    private ArrayList<IdleVehicleBean> mListIdleVehicle;
    @SerializedName("returnchart")
    private int mVehicleStatusCount;
    @SerializedName("vehicle_status")
    private ArrayList<TripStatusBean> mListVehicleStatus;
    @SerializedName("returnds1")
    private int mReturnds1Count;
    @SerializedName("load_Status")
    private ArrayList<LoadBean> mListLoadStatus;
    @SerializedName("returnds2")
    private int mDaysCount;
    @SerializedName("7DayKMRun")
    private ArrayList<KMSBean> mListKMS;
    @SerializedName("returnds3")
    private int mIdleCount2;
    @SerializedName("Loaded_Unloaded")
    private ArrayList<LoadUnloadBean> mListIdle2;
    @SerializedName("returnds4")
    private int mTripStatusCount;
    @SerializedName("Gate_Status")
    private ArrayList<GateStatusBean> mListGateStatus;

    public NewDashBoardBean() {
    }

    public int getmStatus() {
        return this.mStatus;
    }

    public void setmStatus(int mStatus) {
        this.mStatus = mStatus;
    }

    public int getmIdleVehicleCount() {
        return this.mIdleVehicleCount;
    }

    public void setmIdleVehicleCount(int mIdleVehicleCount) {
        this.mIdleVehicleCount = mIdleVehicleCount;
    }

    public ArrayList<IdleVehicleBean> getmListIdleVehicle() {
        return this.mListIdleVehicle;
    }

    public void setmListIdleVehicle(ArrayList<IdleVehicleBean> mListIdleVehicle) {
        this.mListIdleVehicle = mListIdleVehicle;
    }

    public int getmVehicleStatusCount() {
        return this.mVehicleStatusCount;
    }

    public void setmVehicleStatusCount(int mVehicleStatusCount) {
        this.mVehicleStatusCount = mVehicleStatusCount;
    }

    public ArrayList<TripStatusBean> getmListVehicleStatus() {
        return this.mListVehicleStatus;
    }

    public void setmListVehicleStatus(ArrayList<TripStatusBean> mListVehicleStatus) {
        this.mListVehicleStatus = mListVehicleStatus;
    }

    public int getmReturnds1Count() {
        return this.mReturnds1Count;
    }

    public void setmReturnds1Count(int mReturnds1Count) {
        this.mReturnds1Count = mReturnds1Count;
    }

    public ArrayList<LoadBean> getmListLoadStatus() {
        return this.mListLoadStatus;
    }

    public void setmListLoadStatus(ArrayList<LoadBean> mListLoadStatus) {
        this.mListLoadStatus = mListLoadStatus;
    }

    public int getmDaysCount() {
        return this.mDaysCount;
    }

    public void setmDaysCount(int mDaysCount) {
        this.mDaysCount = mDaysCount;
    }

    public ArrayList<KMSBean> getmListKMS() {
        return this.mListKMS;
    }

    public void setmListKMS(ArrayList<KMSBean> mListKMS) {
        this.mListKMS = mListKMS;
    }

    public int getmIdleCount2() {
        return this.mIdleCount2;
    }

    public void setmIdleCount2(int mIdleCount2) {
        this.mIdleCount2 = mIdleCount2;
    }

    public ArrayList<LoadUnloadBean> getmListIdle2() {
        return this.mListIdle2;
    }

    public void setmListIdle2(ArrayList<LoadUnloadBean> mListIdle2) {
        this.mListIdle2 = mListIdle2;
    }

    public int getmTripStatusCount() {
        return this.mTripStatusCount;
    }

    public void setmTripStatusCount(int mTripStatusCount) {
        this.mTripStatusCount = mTripStatusCount;
    }

    public ArrayList<GateStatusBean> getmListGateStatus() {
        return this.mListGateStatus;
    }

    public void setmListGateStatus(ArrayList<GateStatusBean> mListGateStatus) {
        this.mListGateStatus = mListGateStatus;
    }
}
