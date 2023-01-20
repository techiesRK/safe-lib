package com.codersworld.rklib.beans;


public class DBBranchMODEL {
    private String mBranchID;
    private String mBranchName;
    private String mbranchcode;
    private String mdefaultbranch;
    private String mBranchType;
    private String mMasterBranchID;
    private String mStatus;
    private int mId;


    public String getmBranchID() {
        return mBranchID;
    }
    public void setmBranchID(String BranchID) {
        this.mBranchID= BranchID;
    }
    public String getmBranchName() {
        return mBranchName;
    }
    public void setmBranchName(String BranchName) {
        this.mBranchName= BranchName;
    }
    public String getmbranchcode() {
        return mbranchcode;
    }
    public void setmbranchcode(String branchcode) {
        this.mbranchcode= branchcode;
    }
    public String getmBranchType() {
        return mBranchType;
    }

    public void setmBranchType(String BranchType) {
        this.mBranchType= BranchType;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String Status) {
        this.mStatus= Status;
    }

    public String getmMasterBranchID() {
        return mMasterBranchID;
    }

    public void setmMasterBranchID(String MasterBranchID) {
        this.mMasterBranchID= MasterBranchID;
    }

    public String getmdefaultbranch() {
        return mdefaultbranch;
    }

    public void setmdefaultbranch(String defaultbranch) {
        this.mdefaultbranch= defaultbranch;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    @Override public String toString() {
        return getmBranchName();
    }


}
