package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

public class TripBean {

    @SerializedName("RouteNo")
    private String strRouteno;
    @SerializedName("Consignor")
    private String strconsignor;
    @SerializedName("Val1")
    private String strorigin;
    @SerializedName("TripCloseAddress")
    private String strdestination;

    @SerializedName("DepartureDate")
    private String strtripstrttime;

    @SerializedName("TripCloseTime")
    private String strtripclosetime;
    @SerializedName("ATotalDistance")
    private String strtotalkm;
    @SerializedName("VehicleMovingTime")
    private String strvmovngtme;
    @SerializedName("TimeVariance")
    private String strtmevariance;
    @SerializedName("RunningTime")
    private String strrunningtme;
    @SerializedName("IdleTime")
    private String stridletme;
    @SerializedName("TripMaxSpeed")
    private String strtripmaxspeed;
    @SerializedName("VendorName")
    private String strvendorname;
    @SerializedName("SupervisorNo")
    private String strsuprvisorno;
      @SerializedName("EDistance")
    private String strtravelledkm;
    @SerializedName("createddate")
    private String strcreateddate;

    @SerializedName("TripAvgSpeed")
    private String strtripavgspeed;


    public String getStrRouteno() {
        return strRouteno;
    }

    public void setStrRouteno(String strRouteno) {
        this.strRouteno = strRouteno;
    }

    public String getStrconsignor() {
        return strconsignor;
    }

    public void setStrconsignor(String strconsignor) {
        this.strconsignor = strconsignor;
    }

    public String getStrorigin() {
        return strorigin;
    }

    public void setStrorigin(String strorigin) {
        this.strorigin = strorigin;
    }

    public String getStrdestination() {
        return strdestination;
    }

    public void setStrdestination(String strdestination) {
        this.strdestination = strdestination;
    }

    public String getStrtripstrttime() {
        return strtripstrttime;
    }

    public void setStrtripstrttime(String strtripstrttime) {
        this.strtripstrttime = strtripstrttime;
    }

    public String getStrtripclosetime() {
        return strtripclosetime;
    }

    public void setStrtripclosetime(String strtripclosetime) {
        this.strtripclosetime = strtripclosetime;
    }

    public String getStrtotalkm() {
        return strtotalkm;
    }

    public void setStrtotalkm(String strtotalkm) {
        this.strtotalkm = strtotalkm;
    }

    public String getStrvmovngtme() {
        return strvmovngtme;
    }

    public void setStrvmovngtme(String strvmovngtme) {
        this.strvmovngtme = strvmovngtme;
    }

    public String getStrtmevariance() {
        return strtmevariance;
    }

    public void setStrtmevariance(String strtmevariance) {
        this.strtmevariance = strtmevariance;
    }

    public String getStrrunningtme() {
        return strrunningtme;
    }

    public void setStrrunningtme(String strrunningtme) {
        this.strrunningtme = strrunningtme;
    }

    public String getStridletme() {
        return stridletme;
    }

    public void setStridletme(String stridletme) {
        this.stridletme = stridletme;
    }

    public String getStrtripmaxspeed() {
        return strtripmaxspeed;
    }

    public void setStrtripmaxspeed(String strtripmaxspeed) {
        this.strtripmaxspeed = strtripmaxspeed;
    }

    public String getStrvendorname() {
        return strvendorname;
    }

    public void setStrvendorname(String strvendorname) {
        this.strvendorname = strvendorname;
    }

    public String getStrsuprvisorno() {
        return strsuprvisorno;
    }

    public void setStrsuprvisorno(String strsuprvisorno) {
        this.strsuprvisorno = strsuprvisorno;
    }

    public String getStrtravelledkm() {
        return strtravelledkm;
    }

    public void setStrtravelledkm(String strtravelledkm) {
        this.strtravelledkm = strtravelledkm;
    }

    public String getStrcreateddate() {
        return strcreateddate;
    }

    public void setStrcreateddate(String strcreateddate) {
        this.strcreateddate = strcreateddate;
    }

    public String getStrtripavgspeed() {
        return strtripavgspeed;
    }

    public void setStrtripavgspeed(String strtripavgspeed) {
        this.strtripavgspeed = strtripavgspeed;
    }
}
