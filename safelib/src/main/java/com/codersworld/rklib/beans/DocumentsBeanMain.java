package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;


public class DocumentsBeanMain implements Serializable {

    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnmessage")
    private ArrayList<DocumentsBean> mListDriverdata;


    public DocumentsBeanMain() {
    }


    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<DocumentsBean> getmListDriverdata() {
        return mListDriverdata;
    }

    public void setmListDriverdata(ArrayList<DocumentsBean> mListDriverdata) {
        this.mListDriverdata = mListDriverdata;
    }
}