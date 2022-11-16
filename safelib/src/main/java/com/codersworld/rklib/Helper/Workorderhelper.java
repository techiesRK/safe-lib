package com.codersworld.rklib.Helper;

import java.io.Serializable;

public class Workorderhelper implements Serializable {
    String Referenceid,closedatetme,FieldworkID,VehicleNumber,ClientName,WorkType,Devicecode,Deviceid,PhoneNumber,SIMNumber,
    Comment,VehicleCorrectedPlace,Vendorname,VehicleCoorectedtime,DriverPhoneNumber,CallReceivedtime;

    public String getReferenceid() {
        return Referenceid;
    }

    public void setReferenceid(String referenceid) {
        Referenceid = referenceid;
    }

    public String getFieldworkID() {
        return FieldworkID;
    }

    public void setFieldworkID(String fieldworkID) {
        FieldworkID = fieldworkID;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public String getWorkType() {
        return WorkType;
    }

    public void setWorkType(String workType) {
        WorkType = workType;
    }

    public String getDeviceid() {
        return Deviceid;
    }

    public void setDeviceid(String deviceid) {
        Deviceid = deviceid;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getSIMNumber() {
        return SIMNumber;
    }

    public void setSIMNumber(String SIMNumber) {
        this.SIMNumber = SIMNumber;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getVehicleCorrectedPlace() {
        return VehicleCorrectedPlace;
    }

    public void setVehicleCorrectedPlace(String vehicleCorrectedPlace) {
        VehicleCorrectedPlace = vehicleCorrectedPlace;
    }

    public String getVendorname() {
        return Vendorname;
    }

    public void setVendorname(String vendorname) {
        Vendorname = vendorname;
    }

    public String getVehicleCoorectedtime() {
        return VehicleCoorectedtime;
    }

    public void setVehicleCoorectedtime(String vehicleCoorectedtime) {
        VehicleCoorectedtime = vehicleCoorectedtime;
    }

    public String getDriverPhoneNumber() {
        return DriverPhoneNumber;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        DriverPhoneNumber = driverPhoneNumber;
    }

    public String getCallReceivedtime() {
        return CallReceivedtime;
    }

    public void setCallReceivedtime(String callReceivedtime) {
        CallReceivedtime = callReceivedtime;
    }

    public String getDevicecode() {
        return Devicecode;
    }

    public void setDevicecode(String devicecode) {
        Devicecode = devicecode;
    }

    public String getClosedatetme() {
        return closedatetme;
    }

    public void setClosedatetme(String closedatetme) {
        this.closedatetme = closedatetme;
    }
}
