package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class TripDashboardBeanMain implements Serializable {
    @SerializedName("success")
    private int strSuccess;
    @SerializedName("company")
    private ArrayList<TripDashboardBean> mListTripCompany;
  @SerializedName("lane")
    private ArrayList<TripDashboardBean> mListTriplane;
  @SerializedName("foreman")
    private ArrayList<TripDashboardBean> mListTripforeman;

    public TripDashboardBeanMain() {
    }

    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<TripDashboardBean> getmListTripCompany() {
        return mListTripCompany;
    }

    public void setmListTripCompany(ArrayList<TripDashboardBean> mListTripCompany) {
        this.mListTripCompany = mListTripCompany;
    }

    public ArrayList<TripDashboardBean> getmListTriplane() {
        return mListTriplane;
    }

    public void setmListTriplane(ArrayList<TripDashboardBean> mListTriplane) {
        this.mListTriplane = mListTriplane;
    }

    public ArrayList<TripDashboardBean> getmListTripforeman() {
        return mListTripforeman;
    }

    public void setmListTripforeman(ArrayList<TripDashboardBean> mListTripforeman) {
        this.mListTripforeman = mListTripforeman;
    }
}
