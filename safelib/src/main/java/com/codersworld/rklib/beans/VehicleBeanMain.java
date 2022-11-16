package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class VehicleBeanMain  implements Serializable {
    @SerializedName("success")
    private int strSuccess;
    @SerializedName("returnds")
    private ArrayList<VehicalBean> mListVehicle;

    public VehicleBeanMain() {
    }

    public int getStrSuccess() {
        return this.strSuccess;
    }

    public void setStrSuccess(int strSuccess) {
        this.strSuccess = strSuccess;
    }

    public ArrayList<VehicalBean> getmListVehicle() {
        return this.mListVehicle;
    }

    public void setmListVehicle(ArrayList<VehicalBean> mListVehicle) {
        this.mListVehicle = mListVehicle;
    }
}
