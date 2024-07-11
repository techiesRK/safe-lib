package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class KMSBean implements Serializable {
    @SerializedName("date")
    private String mDate;
    @SerializedName("TotalDistance")
    private String mTotalDistance;
    @SerializedName("MaxSpeed")
    private String mMaxSpeed;
    @SerializedName("AvgSpeed")
    private String mAvgSpeed;

    public KMSBean() {
    }

    public String getmDate() {
        return this.mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmTotalDistance() {
        return this.mTotalDistance;
    }

    public void setmTotalDistance(String mTotalDistance) {
        this.mTotalDistance = mTotalDistance;
    }

    public String getmMaxSpeed() {
        return this.mMaxSpeed;
    }

    public void setmMaxSpeed(String mMaxSpeed) {
        this.mMaxSpeed = mMaxSpeed;
    }

    public String getmAvgSpeed() {
        return this.mAvgSpeed;
    }

    public void setmAvgSpeed(String mAvgSpeed) {
        this.mAvgSpeed = mAvgSpeed;
    }
}
