package com.codersworld.rklib.model;


public class DbPendingData {

    private int mId;
    private String mAPIName;
    private String mfirstcolumn;
    private String mdetail;
    private int mUploadStatus;
    private String mServerId;
    private String mDate;


    public int getmId() {
        return mId;
    }
    public void setmId(int mId) {
        this.mId = mId;
    }
    public String getmAPIName() {
        return mAPIName;
    }
    public void setmAPIName(String apiname) {
        this.mAPIName= apiname;
    }
    public String getmfirstcolumn() {
        return mfirstcolumn;
    }
    public void setmfirstcolumn(String firstcolumn) {
        this.mfirstcolumn= firstcolumn;
    }
    public String getmdetail() {
        return mdetail;
    }
    public void setmdetail(String detail) {
        this.mdetail= detail;
    }
    public String getmServerId() {
        return mServerId;
    }
    public void setmServerId(String mServerId) {
        this.mServerId = mServerId;
    }
    public int getmUploadStatus() {
        return mUploadStatus;
    }
    public void setmUploadStatus(int UploadStatus) {
        this.mUploadStatus= UploadStatus;
    }
    public String getmDate() {
        return mDate;
    }
    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
