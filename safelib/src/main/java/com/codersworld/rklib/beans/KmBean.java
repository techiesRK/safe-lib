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


    @SerializedName("PhoneNumber")
    private String PhoneNumber;
    @SerializedName("VehicleType")
    private String VehicleType;
    @SerializedName("PowerCutTime")
    private String PowerCutTime;
    @SerializedName("VoltageLevel")
    private String VoltageLevel;
    @SerializedName("GSMSignal")
    private String GSMSignal;
    @SerializedName("LockType")
    private String LockType;
    @SerializedName("GateOpenTime")
    private String GateOpenTime;
    @SerializedName("GateClosedTime")
    private String GateClosedTime;
    @SerializedName("LockOpenTime")
    private String LockOpenTime;
    @SerializedName("LockClosedTime")
    private String LockClosedTime;
    @SerializedName("InstallDate")
    private String InstallDate;
    @SerializedName("Origin")
    private String Origin;
    @SerializedName("VendorName")
    private String VendorName;
    @SerializedName("CompanyName")
    private String CompanyName;
    @SerializedName("NFCLockNumber")
    private String NFCLockNumber;
    @SerializedName("PadLockNumber")
    private String PadLockNumber;
    @SerializedName("PhoneType")
    private String PhoneType;
    @SerializedName("LockStatus")
    private String LockStatus;

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getPowerCutTime() {
        return PowerCutTime;
    }

    public void setPowerCutTime(String powerCutTime) {
        PowerCutTime = powerCutTime;
    }

    public String getVoltageLevel() {
        return VoltageLevel;
    }

    public void setVoltageLevel(String voltageLevel) {
        VoltageLevel = voltageLevel;
    }

    public String getGSMSignal() {
        return GSMSignal;
    }

    public void setGSMSignal(String GSMSignal) {
        this.GSMSignal = GSMSignal;
    }

    public String getLockType() {
        return LockType;
    }

    public void setLockType(String lockType) {
        LockType = lockType;
    }

    public String getGateOpenTime() {
        return GateOpenTime;
    }

    public void setGateOpenTime(String gateOpenTime) {
        GateOpenTime = gateOpenTime;
    }

    public String getGateClosedTime() {
        return GateClosedTime;
    }

    public void setGateClosedTime(String gateClosedTime) {
        GateClosedTime = gateClosedTime;
    }

    public String getLockOpenTime() {
        return LockOpenTime;
    }

    public void setLockOpenTime(String lockOpenTime) {
        LockOpenTime = lockOpenTime;
    }

    public String getLockClosedTime() {
        return LockClosedTime;
    }

    public void setLockClosedTime(String lockClosedTime) {
        LockClosedTime = lockClosedTime;
    }

    public String getInstallDate() {
        return InstallDate;
    }

    public void setInstallDate(String installDate) {
        InstallDate = installDate;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getNFCLockNumber() {
        return NFCLockNumber;
    }

    public void setNFCLockNumber(String NFCLockNumber) {
        this.NFCLockNumber = NFCLockNumber;
    }

    public String getPadLockNumber() {
        return PadLockNumber;
    }

    public void setPadLockNumber(String padLockNumber) {
        PadLockNumber = padLockNumber;
    }

    public String getPhoneType() {
        return PhoneType;
    }

    public void setPhoneType(String phoneType) {
        PhoneType = phoneType;
    }

    public String getLockStatus() {
        return LockStatus;
    }

    public void setLockStatus(String lockStatus) {
        LockStatus = lockStatus;
    }

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
