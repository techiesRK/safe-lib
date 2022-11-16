package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LinkBeanMain {

    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnmessage")
    private ArrayList<LoginBean> mListlink;

    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }


    public ArrayList<LoginBean> getmListlink() {
        return mListlink;
    }

    public void setmListlink(ArrayList<LoginBean> mListlink) {
        this.mListlink = mListlink;
    }
}
