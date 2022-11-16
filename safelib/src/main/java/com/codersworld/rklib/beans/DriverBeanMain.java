package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class DriverBeanMain implements Serializable {

    @SerializedName("success")
    private int strSuccess;
    @SerializedName("Notificationdata")
    private ArrayList<DriverBean> mListDriverdata;


    public DriverBeanMain() {
    }


    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<DriverBean> getmListDriverdata() {
        return mListDriverdata;
    }

    public void setmListDriverdata(ArrayList<DriverBean> mListDriverdata) {
        this.mListDriverdata = mListDriverdata;
    }
}
