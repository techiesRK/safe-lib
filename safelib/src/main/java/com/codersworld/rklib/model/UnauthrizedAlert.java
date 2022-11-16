package com.codersworld.rklib.model;

import android.os.Parcel;
import android.os.Parcelable;

public class UnauthrizedAlert implements Parcelable {

   private String VehicleNumber;
   private String AlertCode;
   private String AlertDatetime;
   private String speed;
   private String Lat;
   private String Long;
   private String LocationName;
   private String AckTime;
   private String AckComment;
   private String Flagstatus;
    private String status;


    protected UnauthrizedAlert(Parcel in) {
        VehicleNumber = in.readString();
        AlertCode = in.readString();
        AlertDatetime = in.readString();
        speed = in.readString();
        Lat = in.readString();
        Long = in.readString();
        LocationName = in.readString();
        AckTime = in.readString();
        AckComment = in.readString();
        Flagstatus = in.readString();
        status = in.readString();
    }

    public static final Creator<UnauthrizedAlert> CREATOR = new Creator<UnauthrizedAlert>() {
        @Override
        public UnauthrizedAlert createFromParcel(Parcel in) {
            return new UnauthrizedAlert(in);
        }

        @Override
        public UnauthrizedAlert[] newArray(int size) {
            return new UnauthrizedAlert[size];
        }
    };

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getAlertCode() {
        return AlertCode;
    }

    public void setAlertCode(String alertCode) {
        AlertCode = alertCode;
    }

    public String getAlertDateTime() {
        return AlertDatetime;
    }

    public void setAlertDateTime(String alertDateTime) {
        AlertDatetime = alertDateTime;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
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

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    public String getAckTime() {
        return AckTime;
    }

    public void setAckTime(String ackTime) {
        AckTime = ackTime;
    }

    public String getAckComment() {
        return AckComment;
    }

    public void setAckComment(String ackComment) {
        AckComment = ackComment;
    }

    public String getFlagstatus() {
        return Flagstatus;
    }

    public void setFlagstatus(String flagstatus) {
        Flagstatus = flagstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(VehicleNumber);
        dest.writeString(AlertCode);
        dest.writeString(AlertDatetime);
        dest.writeString(speed);
        dest.writeString(Lat);
        dest.writeString(Long);
        dest.writeString(LocationName);
        dest.writeString(AckTime);
        dest.writeString(AckComment);
        dest.writeString(Flagstatus);
        dest.writeString(status);



    }
}
