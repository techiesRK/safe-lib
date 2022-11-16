package com.codersworld.rklib.model;


public class DBAccountsMasterUpload {

    private int mId;
    private int ACGroup;
    private int status;
    private int BillByBillDetail;
    private int CostCenterApplied;
    private int DefaultCostCenter;
    private int TaxInfo;
    private int ShowonMobile;
    private int UploadStatus;
    private String DateTime;
    private String Name;


    public int getmId() {
        return mId;
    }
    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public int getACGroup() {
        return ACGroup;
    }
    public void setACGroup(int ACGroup) {
        this.ACGroup = ACGroup;
    }

    public int getBillByBillDetail() {
        return BillByBillDetail;
    }
    public void setBillByBillDetail(int BillByBillDetail) {
        this.BillByBillDetail = BillByBillDetail;
    }

    public int getCostCenterApplied() {
        return CostCenterApplied;
    }
    public void setCostCenterApplied(int CostCenterApplied) {
        this.CostCenterApplied = CostCenterApplied;
    }

    public int getDefaultCostCenter() {
        return DefaultCostCenter;
    }
    public void setDefaultCostCenter(int DefaultCostCenter) {
        this.DefaultCostCenter = DefaultCostCenter;
    }

    public int getTaxInfo() {
        return TaxInfo;
    }
    public void setTaxInfo(int TaxInfo) {
        this.TaxInfo = TaxInfo;
    }

    public int getShowonMobile() {
        return ShowonMobile;
    }
    public void setShowonMobile(int ShowonMobile) {
        this.ShowonMobile= ShowonMobile;
    }

    public int getUploadStatus() {
        return UploadStatus;
    }
    public void setUploadStatus(int UploadStatus) {
        this.UploadStatus = UploadStatus;
    }

    public String getDateTime() {
        return DateTime;
    }
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

}
