package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Km_Summary_BeanMain implements Serializable {

    @SerializedName("success")
    private int strkmSuccess;
    @SerializedName("Vehicle_No")
    private String strvehicleno;

    @SerializedName("Monthly_Hours")
    private String strmonthly;
    @SerializedName("registrationvalidation")
    private ArrayList<Km_Summary_Bean> mListKmreturnds;

    public int getStrkmSuccess() {
        return strkmSuccess;
    }

    public void setStrkmSuccess(int strkmSuccess) {
        this.strkmSuccess = strkmSuccess;
    }

    public ArrayList<Km_Summary_Bean> getmListKmreturnds() {
        return mListKmreturnds;
    }

    public void setmListKmreturnds(ArrayList<Km_Summary_Bean> mListKmreturnds) {
        this.mListKmreturnds = mListKmreturnds;
    }

    public String getStrvehicleno() {
        return strvehicleno;
    }

    public void setStrvehicleno(String strvehicleno) {
        this.strvehicleno = strvehicleno;
    }

    public String getStrmonthly() {
        return strmonthly;
    }

    public void setStrmonthly(String strmonthly) {
        this.strmonthly = strmonthly;
    }
}
