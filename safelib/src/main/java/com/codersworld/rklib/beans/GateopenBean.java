package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class GateopenBean implements Serializable {

    String strDate;
    @SerializedName("SetupTime")
    private String strsetupTime;
    @SerializedName("SentTime")
    private String strsenttime;
    @SerializedName("OpenedThrough")
    private String stropenthrough;
    @SerializedName("trackingtimes")
    private String strtrackingtimes;
    @SerializedName("CreatedBy")
    private String strcreatedby;
    @SerializedName("PhoneNumber")
    private String strphonenumber;
    @SerializedName("Latitude")
    private String strlatitude;
    @SerializedName("CurrentLocation")
    private String strcurrentlocation;
    @SerializedName("CommandID")
    private String strcommandid;

    @SerializedName("Status")
    private String strstatus;
  @SerializedName("Command")
    private String strCommand;

    public long getUnixTime() {
        return unixTime;
    }

    public void setUnixTime(long unixTime) {
        this.unixTime = unixTime;
    }

    private long unixTime;



    @SerializedName("Status1")
    private String strstatus1;

    @SerializedName("Lat")
    private String strLAt;

    @SerializedName("lat")
    private String strlatt;

    @SerializedName("AlartDateTime")
    private String strAlartdatetime;


    @SerializedName("CardOwnerName")
    String CardOwnerName;

    public String getCardOwnerName() {
        return CardOwnerName;
    }

    public void setCardOwnerName(String cardOwnerName) {
        CardOwnerName = cardOwnerName;
    }

    public String getStrAlartdatetm() {
        return strAlartdatetm;
    }

    public void setStrAlartdatetm(String strAlartdatetm) {
        this.strAlartdatetm = strAlartdatetm;
    }

    @SerializedName("AlartDatetime")
    private String strAlartdatetm;

    @SerializedName("LocationName")
    private String strLocationname;
    @SerializedName("Long")
    private String strLong;
    @SerializedName("Longitude")
    private String strLongiTude;

    @SerializedName("Speed")
    private String strspeed;
    @SerializedName("InsertDatetime")
    private String strinsertdatetime;
    @SerializedName("AckTime")
    private String stracktime;
    @SerializedName("AckComment")
    private String strackcomment;
    @SerializedName("NotificationSent")
    private String strnotificationsent;

    @SerializedName("WorkType")
    private String strworktype;

    @SerializedName("Fieldwork_Date")
    private String atrfieldwork;
    @SerializedName("ClientName")
    private String strclientname;
    @SerializedName("EmployeeName")
    private String stremployeename;
    @SerializedName("VehicleNumber")
    private String strVehicleno;
    @SerializedName("VehicleType")
    private String strvehicletype;
    @SerializedName("Comment")
    private String strcomment;


    @SerializedName("SIMNumber")
    private String strsimnumber;
    @SerializedName("BillingID")
    private String strbillingid;
    @SerializedName("CurrentStatus")
    private String strcurrentstatus;
    @SerializedName("FieldworkID")
    private String strFieldworkid;
    @SerializedName("Updated_By")
    private String strupdatedby;
    @SerializedName("DriverNumberAssignbytech")
    private String strdrivernumberassigntech;
    @SerializedName("OwnerPhoneNo")
    private String strownerno;
    @SerializedName("DriverPhoneNo")
    private String strdriverphoneno;

    @SerializedName("UnlockTime")
    private String strunlocktime;
    @SerializedName("LockedTime")
    private String strlockedtime;
    @SerializedName("UnlockedDuration")
    private String strunlockduration;
    @SerializedName("FirstGateOpenedTime")
    private String strfirstgateopenedtime;
    @SerializedName("LastGateClosedTime")
    private String strlastgateclosedtime;
    @SerializedName("AuthorisedBy")
    private String strauthorisedby;

    @SerializedName("Alarkpid")
    private String stralarkpid;
    @SerializedName("devicecode")
    private String strdevicecode;

    @SerializedName("DeviceID")
    private String strDeviceID;

    @SerializedName("DeviceCode")
    private String strDevicecode;

    @SerializedName("longs")
    private String strlongs;

    public String getStrCommand() {
        return strCommand;
    }

    public void setStrCommand(String strCommand) {
        this.strCommand = strCommand;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public GateopenBean() {
    }
    public String getStrsetupTime() {
        return strsetupTime;
    }

    public void setStrsetupTime(String strsetupTime) {
        this.strsetupTime = strsetupTime;
    }

    public String getStrsenttime() {
        return strsenttime;
    }

    public void setStrsenttime(String strsenttime) {
        this.strsenttime = strsenttime;
    }

    public String getStropenthrough() {
        return stropenthrough;
    }

    public void setStropenthrough(String stropenthrough) {
        this.stropenthrough = stropenthrough;
    }

    public String getStrtrackingtimes() {
        return strtrackingtimes;
    }

    public void setStrtrackingtimes(String strtrackingtimes) {
        this.strtrackingtimes = strtrackingtimes;
    }

    public String getStrcreatedby() {
        return strcreatedby;
    }

    public void setStrcreatedby(String strcreatedby) {
        this.strcreatedby = strcreatedby;
    }


    public String getStrlatitude() {
        return strlatitude;
    }

    public void setStrlatitude(String strlatitude) {
        this.strlatitude = strlatitude;
    }

    public String getStrcurrentlocation() {
        return strcurrentlocation;
    }

    public void setStrcurrentlocation(String strcurrentlocation) {
        this.strcurrentlocation = strcurrentlocation;
    }

    public String getStrcommandid() {
        return strcommandid;
    }

    public void setStrcommandid(String strcommandid) {
        this.strcommandid = strcommandid;
    }


    public String getStrAlartdatetime() {
        return strAlartdatetime;
    }

    public void setStrAlartdatetime(String strAlartdatetime) {
        this.strAlartdatetime = strAlartdatetime;
    }


    public String getStrLong() {
        return strLong;
    }

    public void setStrLong(String strLong) {
        this.strLong = strLong;
    }

    public String getStrspeed() {
        return strspeed;
    }

    public void setStrspeed(String strspeed) {
        this.strspeed = strspeed;
    }

    public String getStrinsertdatetime() {
        return strinsertdatetime;
    }

    public void setStrinsertdatetime(String strinsertdatetime) {
        this.strinsertdatetime = strinsertdatetime;
    }

    public String getStracktime() {
        return stracktime;
    }

    public void setStracktime(String stracktime) {
        this.stracktime = stracktime;
    }

    public String getStrackcomment() {
        return strackcomment;
    }

    public void setStrackcomment(String strackcomment) {
        this.strackcomment = strackcomment;
    }

    public String getStrnotificationsent() {
        return strnotificationsent;
    }

    public void setStrnotificationsent(String strnotificationsent) {
        this.strnotificationsent = strnotificationsent;
    }

    public String getAtrfieldwork() {
        return atrfieldwork;
    }

    public void setAtrfieldwork(String atrfieldwork) {
        this.atrfieldwork = atrfieldwork;
    }

    public String getStrclientname() {
        return strclientname;
    }

    public void setStrclientname(String strclientname) {
        this.strclientname = strclientname;
    }

    public String getStremployeename() {
        return stremployeename;
    }

    public void setStremployeename(String stremployeename) {
        this.stremployeename = stremployeename;
    }

    public String getStrVehicleno() {
        return strVehicleno;
    }

    public void setStrVehicleno(String strVehicleno) {
        this.strVehicleno = strVehicleno;
    }

    public String getStrvehicletype() {
        return strvehicletype;
    }

    public void setStrvehicletype(String strvehicletype) {
        this.strvehicletype = strvehicletype;
    }

    public String getStrcomment() {
        return strcomment;
    }

    public void setStrcomment(String strcomment) {
        this.strcomment = strcomment;
    }




    public String getStrsimnumber() {
        return strsimnumber;
    }

    public void setStrsimnumber(String strsimnumber) {
        this.strsimnumber = strsimnumber;
    }

    public String getStrbillingid() {
        return strbillingid;
    }

    public void setStrbillingid(String strbillingid) {
        this.strbillingid = strbillingid;
    }

    public String getStrcurrentstatus() {
        return strcurrentstatus;
    }

    public void setStrcurrentstatus(String strcurrentstatus) {
        this.strcurrentstatus = strcurrentstatus;
    }

    public String getStrFieldworkid() {
        return strFieldworkid;
    }

    public void setStrFieldworkid(String strFieldworkid) {
        this.strFieldworkid = strFieldworkid;
    }

    public String getStrupdatedby() {
        return strupdatedby;
    }

    public void setStrupdatedby(String strupdatedby) {
        this.strupdatedby = strupdatedby;
    }

    public String getStrdrivernumberassigntech() {
        return strdrivernumberassigntech;
    }

    public void setStrdrivernumberassigntech(String strdrivernumberassigntech) {
        this.strdrivernumberassigntech = strdrivernumberassigntech;
    }

    public String getStrownerno() {
        return strownerno;
    }

    public void setStrownerno(String strownerno) {
        this.strownerno = strownerno;
    }

    public String getStrdriverphoneno() {
        return strdriverphoneno;
    }

    public void setStrdriverphoneno(String strdriverphoneno) {
        this.strdriverphoneno = strdriverphoneno;
    }



    public String getStrLocationname() {
        return strLocationname;
    }

    public void setStrLocationname(String strLocationname) {
        this.strLocationname = strLocationname;
    }

    public String getStrunlocktime() {
        return strunlocktime;
    }

    public void setStrunlocktime(String strunlocktime) {
        this.strunlocktime = strunlocktime;
    }

    public String getStrlockedtime() {
        return strlockedtime;
    }

    public void setStrlockedtime(String strlockedtime) {
        this.strlockedtime = strlockedtime;
    }

    public String getStrunlockduration() {
        return strunlockduration;
    }

    public void setStrunlockduration(String strunlockduration) {
        this.strunlockduration = strunlockduration;
    }

    public String getStrfirstgateopenedtime() {
        return strfirstgateopenedtime;
    }

    public void setStrfirstgateopenedtime(String strfirstgateopenedtime) {
        this.strfirstgateopenedtime = strfirstgateopenedtime;
    }

    public String getStrlastgateclosedtime() {
        return strlastgateclosedtime;
    }

    public void setStrlastgateclosedtime(String strlastgateclosedtime) {
        this.strlastgateclosedtime = strlastgateclosedtime;
    }

    public String getStrauthorisedby() {
        return strauthorisedby;
    }

    public void setStrauthorisedby(String strauthorisedby) {
        this.strauthorisedby = strauthorisedby;
    }

    public String getStrstatus() {
        return strstatus;
    }

    public void setStrstatus(String strstatus) {
        this.strstatus = strstatus;
    }

    public String getStralarkpid() {
        return stralarkpid;
    }

    public void setStralarkpid(String stralarkpid) {
        this.stralarkpid = stralarkpid;
    }



    public String getStrlongs() {
        return strlongs;
    }

    public void setStrlongs(String strlongs) {
        this.strlongs = strlongs;
    }

    public String getStrphonenumber() {
        return strphonenumber;
    }

    public void setStrphonenumber(String strphonenumber) {
        this.strphonenumber = strphonenumber;
    }

    public String getStrLAt() {
        return strLAt;
    }

    public void setStrLAt(String strLAt) {
        this.strLAt = strLAt;
    }

    public String getStrworktype() {
        return strworktype;
    }

    public void setStrworktype(String strworktype) {
        this.strworktype = strworktype;
    }

    public String getStrDevicecode() {
        return strDevicecode;
    }

    public void setStrDevicecode(String strDevicecode) {
        this.strDevicecode = strDevicecode;
    }

    public String getStrstatus1() {
        return strstatus1;
    }

    public void setStrstatus1(String strstatus1) {
        this.strstatus1 = strstatus1;
    }

    public String getStrlatt() {
        return strlatt;
    }

    public void setStrlatt(String strlatt) {
        this.strlatt = strlatt;
    }

    public String getStrDeviceID() {
        return strDeviceID;
    }

    public void setStrDeviceID(String strDeviceID) {
        this.strDeviceID = strDeviceID;
    }

    public String getStrdevicecode() {
        return strdevicecode;
    }

    public void setStrdevicecode(String strdevicecode) {
        this.strdevicecode = strdevicecode;
    }

    public String getStrLongiTude() {
        return strLongiTude;
    }

    public void setStrLongiTude(String strLongiTude) {
        this.strLongiTude = strLongiTude;
    }
}
