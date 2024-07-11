package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TripStatusBean implements Serializable {
    @SerializedName("VehicleStatus")
    private String strTripType;
    @SerializedName("Count")
    private int mCount;
    @SerializedName("Totals")
    private int mTotal;

    public TripStatusBean() {
    }

    public String getStrTripType() {
        return this.strTripType;
    }

    public void setStrTripType(String strTripType) {
        this.strTripType = strTripType;
    }

    public int getmCount() {
        return this.mCount;
    }

    public void setmCount(int mCount) {
        this.mCount = mCount;
    }

    public int getmTotal() {
        return this.mTotal;
    }

    public void setmTotal(int mTotal) {
        this.mTotal = mTotal;
    }
}