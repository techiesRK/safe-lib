package com.codersworld.rklib.DocumentManagment;

public class Dbvehicletype {
    private String mVehicleType;
    private int mId;

    public String getmvehicletype() {
        return mVehicleType;
    }

    public void setmvehicletype(String vehicletype) {
        this.mVehicleType = vehicletype;
    }
    public int getmId() {
        return mId;
    }
    public void setmId(int mId) {
        this.mId = mId;
    }

    @Override public String toString() {
        return getmvehicletype();
    }
}
