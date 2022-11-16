package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FindVehhicleBEan implements Serializable {


    @SerializedName("VehicleNumbers")
    String VehicleNumbers;
    @SerializedName("Distance")
    String Distance;
    @SerializedName("trackingtime")
    String trackingtime;
    @SerializedName("Speed")
    String Speed;
    @SerializedName("Vendor")
    String Vendor;
    @SerializedName("DriverNumber")
    String DriverNumber;
    @SerializedName("CompanyName")
    String CompanyName;
    @SerializedName("Origin")
    String Origin;
    @SerializedName("Destination")
    String Destination;
    @SerializedName("LockStatus")
    String LockStatus;
    @SerializedName("Lat")
    String Lat;
    @SerializedName("Long")
    String Long;


    public String getVehicleNumbers() {
        return VehicleNumbers;
    }

    public void setVehicleNumbers(String vehicleNumbers) {
        VehicleNumbers = vehicleNumbers;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String distance) {
        Distance = distance;
    }

    public String getTrackingtime() {
        return trackingtime;
    }

    public void setTrackingtime(String trackingtime) {
        this.trackingtime = trackingtime;
    }

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String speed) {
        Speed = speed;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public String getDriverNumber() {
        return DriverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        DriverNumber = driverNumber;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getLockStatus() {
        return LockStatus;
    }

    public void setLockStatus(String lockStatus) {
        LockStatus = lockStatus;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLong() {
        return Long;
    }

    public void setLong(String aLong) {
        Long = aLong;
    }
}
