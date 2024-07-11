package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoadUnloadBean implements Serializable {
    @SerializedName("Totals")
    private String mTotal;
    @SerializedName("Loaded")
    private int mLoaded;
    @SerializedName("dt")
    private String mDate;
    @SerializedName("Unloaded")
    private int mVehiclePer;

    public LoadUnloadBean() {
    }

    public String getmTotal() {
        return this.mTotal;
    }

    public void setmTotal(String mTotal) {
        this.mTotal = mTotal;
    }

    public int getmLoaded() {
        return this.mLoaded;
    }

    public void setmLoaded(int mLoaded) {
        this.mLoaded = mLoaded;
    }

    public String getmDate() {
        return this.mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public int getmVehiclePer() {
        return this.mVehiclePer;
    }

    public void setmVehiclePer(int mVehiclePer) {
        this.mVehiclePer = mVehiclePer;
    }
}
