package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GeoAlertBeanMain
{

    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnds")
    private ArrayList<GeoAlertBean> mListGeoalert;


    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<GeoAlertBean> getmListGeoalert() {
        return mListGeoalert;
    }

    public void setmListGeoalert(ArrayList<GeoAlertBean> mListGeoalert) {
        this.mListGeoalert = mListGeoalert;
    }
}
