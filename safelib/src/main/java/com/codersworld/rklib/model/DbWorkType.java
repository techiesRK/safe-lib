package com.codersworld.rklib.model;


public class DbWorkType {


    private String mWorkTypes;
    private String mWorkTypeId;
    private int mId;


    public String getmWorkTypes() {
        return mWorkTypes;
    }

    public void setmWorkTypes(String mWorkTypes) {
        this.mWorkTypes = mWorkTypes;
    }

    public String getmWorkTypeId() {
        return mWorkTypeId;
    }

    public void setmWorkTypeId(String mWorkTypeId) {
        this.mWorkTypeId = mWorkTypeId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    @Override public String toString() {
        return getmWorkTypes();
    }


}
