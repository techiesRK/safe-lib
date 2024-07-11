package com.codersworld.rklib.MMthinkBizUtils.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoadBean implements Serializable {
    @SerializedName("LoadStatus")
    private String mLoadSTatus;
    @SerializedName("Count")
    private int mCount;
    @SerializedName("Totals")
    private int mTotal;

    public LoadBean() {
    }

    public String getmLoadSTatus() {
        return this.mLoadSTatus;
    }

    public void setmLoadSTatus(String mLoadSTatus) {
        this.mLoadSTatus = mLoadSTatus;
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
