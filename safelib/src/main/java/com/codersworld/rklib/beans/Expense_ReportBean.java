package com.codersworld.rklib.beans;

import java.io.Serializable;

/**
 * Created by Jatin Sharma on 16-11-2015.
 */
public class Expense_ReportBean implements Serializable {

    private String mDay;
    private String mDate;
    private String mAmount;
    private String mHead;
    private String mStatus;
    private String mComment;

    private String mExpID;
    private String mEmployeeName;
    private String mExpType;
    private String mPaymentMode;

    private String mpercent;

    private String mUnit;
    private String mtripid;
    private String mvehiclenumber;
    private String mvehicleid;
    private String mTagID;
    private String mOriginalTransactionID;
    private String mPlazaID;
    private String mTransactionTime;
    private String mCreatedBy;
    private String mCreatedDate;



    public String getmExpID() {
        return mExpID ;
    }
    public void setmExpID(String ExpID) {
        this.mExpID= ExpID;
    }
    public String getmEmployeeName() {
        return mEmployeeName;
    }
    public void setmEmployeeName(String EmployeeName) {
        this.mEmployeeName= EmployeeName;
    }
    public String getmExpType() {
        return mExpType;
    }
    public void setmExpType(String ExpType) {
        this.mExpType= ExpType;
    }
    public String getmPaymentMode() {
        return mPaymentMode;
    }
    public void setmPaymentMode(String PaymentMode) {
        this.mPaymentMode= PaymentMode;
    }
    public String getmAmount() {
        return mAmount  ;
    }
    public void setmAmount(String mAmount) {
        this.mAmount= mAmount;
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
    public String getmHead() {
        return mHead  ;
    }
    public void setmHead(String mHead) {
        this.mHead= mHead;
    }
    public String getmStatus() {
        return mStatus ;
    }
    public void setmStatus(String mStatus) {
        this.mStatus= mStatus;
    }
    public String getmComment() {
        return mComment  ;
    }
    public void setmComment(String mComment) {
        this.mComment= mComment;
    }
    public String getmpercent() {
        return mpercent;
    }
    public void setmpercent(String mpercent) {
        this.mpercent= mpercent;
    }

    public String getmUnit() { return mUnit; }	public void setmUnit(String Unit) { this.mUnit= Unit; }
    public String getmtripid() { return mtripid; }	public void setmtripid(String tripid) { this.mtripid= tripid; }
    public String getmvehiclenumber() { return mvehiclenumber; }	public void setmvehiclenumber(String vehiclenumber) { this.mvehiclenumber= vehiclenumber; }
    public String getmvehicleid() { return mvehicleid; }	public void setmvehicleid(String vehicleid) { this.mvehicleid= vehicleid; }
    public String getmTagID() { return mTagID; }	public void setmTagID(String TagID) { this.mTagID= TagID; }
    public String getmOriginalTransactionID() { return mOriginalTransactionID; }	public void setmOriginalTransactionID(String OriginalTransactionID) { this.mOriginalTransactionID= OriginalTransactionID; }
    public String getmPlazaID() { return mPlazaID; }	public void setmPlazaID(String PlazaID) { this.mPlazaID= PlazaID; }
    public String getmTransactionTime() { return mTransactionTime; }	public void setmTransactionTime(String TransactionTime) { this.mTransactionTime= TransactionTime; }
    public String getmCreatedBy() { return mCreatedBy; }	public void setmCreatedBy(String CreatedBy) { this.mCreatedBy= CreatedBy; }
    public String getmCreatedDate() { return mCreatedDate; }	public void setmCreatedDate(String CreatedDate) { this.mCreatedDate= CreatedDate; }

}
