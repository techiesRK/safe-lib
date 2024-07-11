package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GateStatusBean implements Serializable {
    @SerializedName("GateStatus")
    private String mGateStatus;
    @SerializedName("Count")
    private int mCount;
    @SerializedName("Totals")
    private int mTotal;

    public GateStatusBean() {
    }

    public String getmGateStatus() {
        return this.mGateStatus;
    }

    public void setmGateStatus(String mGateStatus) {
        this.mGateStatus = mGateStatus;
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
