package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TripDashboardBean  implements Serializable {
int intType;
    private String strColorOne;
    private String strColorTwo;

    @SerializedName("Description")
    private String strDescription;
    @SerializedName("TotalTrips")
    private String strTotalTrips;
    @SerializedName("OnTime")
    private String strOnTime;
    @SerializedName("NoStatus")
    private String strNoStatus;
    @SerializedName("ArrivalDelay")
    private String strArrivalDelay;

    @SerializedName("CanceledTrips")
    private String strCanceledTrips;

    @SerializedName("PlacementDelay")
    private String strPlacementDelay;

    @SerializedName("NoGPS")
    private String strNoGPS;

    @SerializedName("TripTotalExp")
    private String strTripTotalExp;

    @SerializedName("TripDriverAdvance")
    private String strTripDriverAdvance;
    @SerializedName("OTA")
    private String strOTA;
    @SerializedName("SRNO")
    private String strSRNO;
    @SerializedName("BreakDown")
    private String strBreakDown;
  @SerializedName("Ids")
    private String strIds;

    public String getStrIds() {
        return strIds;
    }

    public void setStrIds(String strIds) {
        this.strIds = strIds;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

    public String getStrTotalTrips() {
        return strTotalTrips;
    }

    public void setStrTotalTrips(String strTotalTrips) {
        this.strTotalTrips = strTotalTrips;
    }

    public int getIntType() {
        return intType;
    }

    public void setIntType(int intType) {
        this.intType = intType;
    }

    public String getStrOnTime() {
        return strOnTime;
    }

    public void setStrOnTime(String strOnTime) {
        this.strOnTime = strOnTime;
    }

    public String getStrNoStatus() {
        return strNoStatus;
    }

    public void setStrNoStatus(String strNoStatus) {
        this.strNoStatus = strNoStatus;
    }

    public String getStrArrivalDelay() {
        return strArrivalDelay;
    }

    public String getStrColorOne() {
        return strColorOne;
    }

    public void setStrColorOne(String strColorOne) {
        this.strColorOne = strColorOne;
    }

    public String getStrColorTwo() {
        return strColorTwo;
    }

    public void setStrColorTwo(String strColorTwo) {
        this.strColorTwo = strColorTwo;
    }

    public void setStrArrivalDelay(String strArrivalDelay) {
        this.strArrivalDelay = strArrivalDelay;
    }

    public String getStrCanceledTrips() {
        return strCanceledTrips;
    }

    public void setStrCanceledTrips(String strCanceledTrips) {
        this.strCanceledTrips = strCanceledTrips;
    }

    public String getStrPlacementDelay() {
        return strPlacementDelay;
    }

    public void setStrPlacementDelay(String strPlacementDelay) {
        this.strPlacementDelay = strPlacementDelay;
    }

    public String getStrNoGPS() {
        return strNoGPS;
    }

    public void setStrNoGPS(String strNoGPS) {
        this.strNoGPS = strNoGPS;
    }

    public String getStrTripTotalExp() {
        return strTripTotalExp;
    }

    public void setStrTripTotalExp(String strTripTotalExp) {
        this.strTripTotalExp = strTripTotalExp;
    }

    public String getStrTripDriverAdvance() {
        return strTripDriverAdvance;
    }

    public void setStrTripDriverAdvance(String strTripDriverAdvance) {
        this.strTripDriverAdvance = strTripDriverAdvance;
    }

    public String getStrOTA() {
        return strOTA;
    }

    public void setStrOTA(String strOTA) {
        this.strOTA = strOTA;
    }

    public String getStrSRNO() {
        return strSRNO;
    }

    public void setStrSRNO(String strSRNO) {
        this.strSRNO = strSRNO;
    }

    public String getStrBreakDown() {
        return strBreakDown;
    }

    public void setStrBreakDown(String strBreakDown) {
        this.strBreakDown = strBreakDown;
    }
}
