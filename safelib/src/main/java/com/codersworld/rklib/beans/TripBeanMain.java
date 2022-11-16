package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TripBeanMain {
    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnds")
    private ArrayList<TripBean> mlisttripdata;


    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<TripBean> getMlisttripdata() {
        return mlisttripdata;
    }

    public void setMlisttripdata(ArrayList<TripBean> mlisttripdata) {
        this.mlisttripdata = mlisttripdata;
    }
}
