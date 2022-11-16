package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class StoppageBeanMain implements Serializable {

    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnds")
    private ArrayList<StoppageBean> mListrstoppagedata;


    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<StoppageBean> getmListrstoppagedata() {
        return mListrstoppagedata;
    }

    public void setmListrstoppagedata(ArrayList<StoppageBean> mListrstoppagedata) {
        this.mListrstoppagedata = mListrstoppagedata;
    }
}
