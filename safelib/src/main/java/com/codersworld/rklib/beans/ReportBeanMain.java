package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class ReportBeanMain implements Serializable {

    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnds")
    private ArrayList<ReportBean> mListreportdata;


    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<ReportBean> getmListreportdata() {
        return mListreportdata;
    }

    public void setmListreportdata(ArrayList<ReportBean> mListreportdata) {
        this.mListreportdata = mListreportdata;
    }
}
