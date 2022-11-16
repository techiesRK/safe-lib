package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class GateopenBeanMain implements Serializable {

    @SerializedName("success")
    private int strSuccess;
    @SerializedName("GetCOmmandSent")
    private ArrayList<GateopenBean> mListgetcommandsent;

    @SerializedName("GetGateOpendStatus")
    private ArrayList<GateopenBean> mListGateopen;

    @SerializedName("GetFieldworks")
    private ArrayList<GateopenBean> mListgetFieldwork;

    @SerializedName("GetLockSummary")
    private ArrayList<GateopenBean> mListgetlocksummary;
    //
    @SerializedName("GetPowerCut")
    private ArrayList<GateopenBean> mlistgetpowercut;


    public GateopenBeanMain() {
    }

    public int getStrSuccess() {
        return this.strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<GateopenBean> getmListgetcommandsent() {
        return this.mListgetcommandsent;
    }

    public void setmListgetcommandsent(ArrayList<GateopenBean> mListgetcommandsent) {
        this.mListgetcommandsent = mListgetcommandsent;
    }

    public ArrayList<GateopenBean> getmListGateopen() {
        return mListGateopen;
    }

    public void setmListGateopen(ArrayList<GateopenBean> mListGateopen) {
        this.mListGateopen = mListGateopen;
    }

    //
    public ArrayList<GateopenBean> getmListgetFieldwork() {
        return mListgetFieldwork;
    }

    public void setmListgetFieldwork(ArrayList<GateopenBean> mListgetFieldwork) {
        this.mListgetFieldwork = mListgetFieldwork;
    }

    public ArrayList<GateopenBean> getmListgetlocksummary() {
        return mListgetlocksummary;
    }

    public void setmListgetlocksummary(ArrayList<GateopenBean> mListgetlocksummary) {
        this.mListgetlocksummary = mListgetlocksummary;
    }


    public ArrayList<GateopenBean> getMlistgetpowercut() {
        return mlistgetpowercut;
    }

    public void setMlistgetpowercut(ArrayList<GateopenBean> mlistgetpowercut) {
        this.mlistgetpowercut = mlistgetpowercut;
    }
}
