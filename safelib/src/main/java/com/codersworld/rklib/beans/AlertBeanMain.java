package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;


public class AlertBeanMain implements Serializable {

    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnds")
    private ArrayList<AlertBean> mListAlertdata;


    public AlertBeanMain() {
    }


    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<AlertBean> getmListAlertdata() {
        return mListAlertdata;
    }

    public void setmListAlertdata(ArrayList<AlertBean> mListAlertdata) {
        this.mListAlertdata = mListAlertdata;
    }
}