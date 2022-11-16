package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class FindBeanMain implements Serializable {
    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnds")
    private ArrayList<FindVehhicleBEan> mListVehicle;

    public int getStrSuccess() {
        return strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<FindVehhicleBEan> getmListVehicle() {
        return mListVehicle;
    }

    public void setmListVehicle(ArrayList<FindVehhicleBEan> mListVehicle) {
        this.mListVehicle = mListVehicle;
    }
}
