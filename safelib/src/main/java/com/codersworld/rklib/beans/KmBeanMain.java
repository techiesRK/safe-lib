package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class KmBeanMain implements Serializable {

    @SerializedName("success")
    private int strkmSuccess;

    @SerializedName("returnds")
    private ArrayList<KmBean> mListKmreturnds;

    public int getStrkmSuccess() {
        return strkmSuccess;
    }

    public void setStrkmSuccess(int strkmSuccess) {
        this.strkmSuccess = strkmSuccess;
    }

    public ArrayList<KmBean> getmListKmreturnds() {
        return mListKmreturnds;
    }

    public void setmListKmreturnds(ArrayList<KmBean> mListKmreturnds) {
        this.mListKmreturnds = mListKmreturnds;
    }
}
