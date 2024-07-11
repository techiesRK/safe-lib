package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class IdleVehicleBean implements Serializable {
    @SerializedName("Totals")
    private String mTotal;
    @SerializedName("VehicleCount")
    private String mVehicle_count;
    @SerializedName("IdleSince")
    private String mIdle_time;
    @SerializedName("PercentVehicles")
    private double mVehiclePer;

    public IdleVehicleBean() {
    }

    public String getmTotal() {
        return this.mTotal;
    }

    public void setmTotal(String mTotal) {
        this.mTotal = mTotal;
    }

    public String getmVehicle_count() {
        return this.mVehicle_count;
    }

    public void setmVehicle_count(String mVehicle_count) {
        this.mVehicle_count = mVehicle_count;
    }

    public String getmIdle_time() {
        return this.mIdle_time;
    }

    public void setmIdle_time(String mIdle_time) {
        this.mIdle_time = mIdle_time;
    }

    public double getmVehiclePer() {
        return this.mVehiclePer;
    }

    public void setmVehiclePer(double mVehiclePer) {
        this.mVehiclePer = mVehiclePer;
    }
}
