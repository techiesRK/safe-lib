package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class KmBean implements Serializable {


    @SerializedName("lat")
    private String strkmlat;
    @SerializedName("lng")
    private String strkmlng;
    @SerializedName("tme")
    private String strkmtime;
    @SerializedName("speed")
    private String strkmspeed;
    @SerializedName("address")
    private String strkmaddress;
    @SerializedName("idletime")
    private String strkmidletime;
    @SerializedName("accstatus")
    private String strkmaccstatus;
    @SerializedName("destination")
    private String strkmdestination;
    @SerializedName("distance")
    private String strkmdistance;

    @SerializedName("vehiclenumber")
    private String strkmvehiclenumber;
    @SerializedName("PhoneNo")
    private String strkmphoneNo;
    @SerializedName("Status")
    private String strstatus;
    @SerializedName("DriverName")
    private String strkmdrivername;
    @SerializedName("DistanceSinceMorning")
    private String strkmDistanceSinceMorning;

    @SerializedName("Val1")
    private String strkmVal1;
    @SerializedName("Val2")
    private String strkmVal2;
    @SerializedName("Val3")
    private String strkmVal3;
    @SerializedName("Val4")
    private String strkmVal4;



    public String getStrkmlat() {
        return strkmlat;
    }

    public void setStrkmlat(String strkmlat) {
        this.strkmlat = strkmlat;
    }

    public String getStrkmlng() {
        return strkmlng;
    }

    public void setStrkmlng(String strkmlng) {
        this.strkmlng = strkmlng;
    }

    public String getStrkmtime() {
        return strkmtime;
    }

    public void setStrkmtime(String strkmtime) {
        this.strkmtime = strkmtime;
    }

    public String getStrkmspeed() {
        return strkmspeed;
    }

    public void setStrkmspeed(String strkmspeed) {
        this.strkmspeed = strkmspeed;
    }

    public String getStrkmaddress() {
        return strkmaddress;
    }

    public void setStrkmaddress(String strkmaddress) {
        this.strkmaddress = strkmaddress;
    }

    public String getStrkmidletime() {
        return strkmidletime;
    }

    public void setStrkmidletime(String strkmidletime) {
        this.strkmidletime = strkmidletime;
    }

    public String getStrkmaccstatus() {
        return strkmaccstatus;
    }

    public void setStrkmaccstatus(String strkmaccstatus) {
        this.strkmaccstatus = strkmaccstatus;
    }

    public String getStrkmdestination() {
        return strkmdestination;
    }

    public void setStrkmdestination(String strkmdestination) {
        this.strkmdestination = strkmdestination;
    }

    public String getStrkmdistance() {
        return strkmdistance;
    }

    public void setStrkmdistance(String strkmdistance) {
        this.strkmdistance = strkmdistance;
    }

    public String getStrkmvehiclenumber() {
        return strkmvehiclenumber;
    }

    public void setStrkmvehiclenumber(String strkmvehiclenumber) {
        this.strkmvehiclenumber = strkmvehiclenumber;
    }

    public String getStrkmphoneNo() {
        return strkmphoneNo;
    }

    public void setStrkmphoneNo(String strkmphoneNo) {
        this.strkmphoneNo = strkmphoneNo;
    }

    public String getStrstatus() {
        return strstatus;
    }

    public void setStrstatus(String strstatus) {
        this.strstatus = strstatus;
    }

    public String getStrkmdrivername() {
        return strkmdrivername;
    }

    public void setStrkmdrivername(String strkmdrivername) {
        this.strkmdrivername = strkmdrivername;
    }



    public String getStrkmVal1() {
        return strkmVal1;
    }

    public void setStrkmVal1(String strkmVal1) {
        this.strkmVal1 = strkmVal1;
    }

    public String getStrkmVal2() {
        return strkmVal2;
    }

    public void setStrkmVal2(String strkmVal2) {
        this.strkmVal2 = strkmVal2;
    }

    public String getStrkmVal3() {
        return strkmVal3;
    }

    public void setStrkmVal3(String strkmVal3) {
        this.strkmVal3 = strkmVal3;
    }

    public String getStrkmVal4() {
        return strkmVal4;
    }

    public void setStrkmVal4(String strkmVal4) {
        this.strkmVal4 = strkmVal4;
    }


    public String getStrkmDistanceSinceMorning() {
        return strkmDistanceSinceMorning;
    }

    public void setStrkmDistanceSinceMorning(String strkmDistanceSinceMorning) {
        this.strkmDistanceSinceMorning = strkmDistanceSinceMorning;
    }
}
