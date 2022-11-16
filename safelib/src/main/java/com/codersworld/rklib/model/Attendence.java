package com.codersworld.rklib.model;


public class Attendence {


    private String mDay;
    private String mDate;
    private String mEntryTime;
    private String mExitTime;
    private String mDuration;
    private String mID;
    private String mStatus;


    public String getmStatus() {
        return mStatus;
    }
    public void setmStatus(String mStatus) {
        this.mStatus= mStatus;
    }
    public String getmID() {
        return mID;
    }
    public void setmID(String mID) {
        this.mID= mID;
    }

    public String getmDuration() {
        return mDuration;
    }

    public void setmDuration(String mDuration) {
        this.mDuration = mDuration;
    }

    public String getmDay() {
        return mDay;
    }

    public void setmDay(String mDay) {
        this.mDay = mDay;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmEntryTime() {
        return mEntryTime;
    }

    public void setmEntryTime(String mEntryTime) {
        this.mEntryTime = mEntryTime;
    }

    public String getmExitTime() {
        return mExitTime;
    }

    public void setmExitTime(String mExitTime) {
        this.mExitTime = mExitTime;
    }


}
