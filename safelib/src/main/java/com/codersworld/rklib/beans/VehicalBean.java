package com.codersworld.rklib.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class VehicalBean implements Serializable {
    String strVehicalGroup;
    String strVehicleId;
    int id;
    String strColorB;
    String strColorT;
    @SerializedName("status")
    private String strstatus;
    @SerializedName("isBackupexist")
    private String isBackupexist;
    @SerializedName("ClientContactNumber")
    private String strclientcontctno;
    @SerializedName("VendorID")
    private String strvendorid;
    @SerializedName("DepartureDate")
    private String strdeparture_time;
    @SerializedName("DelayStatus")
    private String strdelaystatus;
    @SerializedName("PlacementTime")
    private String strplacementtie;
    @SerializedName("ActualPlacementtime")
    private String stractualplacementtime;
    @SerializedName("ActualDepTime")
    private String stractualdepttime;
    @SerializedName("ActualArrivalTime")
    private String stractualarrtime;
    @SerializedName("HourDifferences")
    private String strhourdifference;
    @SerializedName("DriverNumber")
    private String strdriverno;
    @SerializedName("Distance")
    private String strdistance;
    @SerializedName("DistanceCovered")
    private String strdistancecovered;
    @SerializedName("DistanceToCovered")
    private String strdisttocovrd;
    @SerializedName("TripCOmment")
    private String strtripcmt;
    @SerializedName("Comment")
    private String strcmt;

    @SerializedName("LockFlag")
    private String strLockFlag;


    @SerializedName("ClientTripID")
    private String strclienttripiD;
    @SerializedName("RMasterid")
    private String strrmasterid;
    @SerializedName("vehiclenumber")
    private String strCarNumber;
    @SerializedName("accstatus")
    private String strCarStatus;
    @SerializedName("tme")
    private String strCarTime;
    @SerializedName("idletime")
    private String strCarIdleTime;
    @SerializedName("address")
    private String strVehicleLocation;
    @SerializedName("speed")
    private String strVehicleSpeed;
    @SerializedName("lat")
    private String strLat;
    @SerializedName("lng")
    private String strLong;
    @SerializedName("distance")
    private String strDistance;
    @SerializedName("destination")
    private String strDestination;
    @SerializedName("PhoneNo")
    private String strPhone;
    @SerializedName("DriverName")
    private String strDriverName;
    @SerializedName("DistanceSinceMorning")
    private String strDistanceSinceMorning;
    @SerializedName("Val1")
    private String strVal1;
    @SerializedName("Val2")
    private String strVal2;
    @SerializedName("Val3")
    private String strVal3;
    @SerializedName("Val4")
    private String strVal4;
    @SerializedName("VehicleType")
    private String strVehicletype;
    @SerializedName("VoltageLevel")
    private String strVoltagelvl;
    @SerializedName("GSMSignal")
    private String strGsmSgnl;
    @SerializedName("GateOpenTime")
    private String strgateopntime;
    @SerializedName("PowerCutTime")
    private String strPwrCuttime;
    @SerializedName("GateClosedTime")
    private String strgateclosedtm;
    @SerializedName("LockOpenTime")
    private String strlockopentime;
    @SerializedName("LockClosedTime")
    private String strLockclosedtime;
    @SerializedName("InstallDate")
    private String strinstalldate;
    @SerializedName("Origin")
    private String strorigin;
    @SerializedName("Consignor")
    private String strconsignor;
    @SerializedName("ETAHour")
    private String stretahour;
    @SerializedName("VendorName")
    private String strvendoname;
    @SerializedName("ELastTime")
    private String strelasttime;
    @SerializedName("CompanyName")
    private String strcompanyname;
    @SerializedName("NFCLockNumber")
    private String strnfclockno;
    @SerializedName("LockType")
    private String strlocktype;
    @SerializedName("PadLockNumber")
    private String strpadlockno;
    @SerializedName("PhoneType")
    private String strphonetype;
    @SerializedName("LockStatus")
    private String strlockstats;
    @SerializedName("PhoneNumber")
    private String strphoneno;
    @SerializedName("SupervisorNo")
    private String strsupervisorno;
    @SerializedName("TripStartLat")
    private String strtripstartlat;
    @SerializedName("TripStartLong")
    private String strtripstartlong;
    @SerializedName("TripCloseLat")
    private String strtripcloselat;
    @SerializedName("TripCLoseLong")
    private String strtripcloselong;
    @SerializedName("StartOdometer")
    private String strstartodometer;
    @SerializedName("EndOdometer")
    private String strendodometer;
    @SerializedName("ETA")
    private String strETA;
    @SerializedName("PaidAmount")
    private String strPaidAmount;
    @SerializedName("AllowedAmount")
    private String strAllowedAmount;
    @SerializedName("CreatedDate")
    private String strCreatedDate;
    @SerializedName("BalanceAmount")
    private String strBalanceAmount;
    private int isChecked = 0;

    public String getStrCreatedDate() {
        return strCreatedDate;
    }

    public void setStrCreatedDate(String strCreatedDate) {
        this.strCreatedDate = strCreatedDate;
    }

    public VehicalBean() {
    }

    public String getIsBackupexist() {
        return isBackupexist;
    }

    public void setIsBackupexist(String isBackupexist) {
        this.isBackupexist = isBackupexist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(int isChecked) {
        this.isChecked = isChecked;
    }

    public String getStrCarNumber() {
        return this.strCarNumber;
    }

    public void setStrCarNumber(String strCarNumber) {
        this.strCarNumber = strCarNumber;
    }

    public String getStrCarStatus() {
        return this.strCarStatus;
    }

    public void setStrCarStatus(String strCarStatus) {
        this.strCarStatus = strCarStatus;
    }

    public String getStrCarTime() {
        return this.strCarTime;
    }

    public void setStrCarTime(String strCarTime) {
        this.strCarTime = strCarTime;
    }

    public String getStrCarIdleTime() {
        return this.strCarIdleTime;
    }

    public void setStrCarIdleTime(String strCarIdleTime) {
        this.strCarIdleTime = strCarIdleTime;
    }

    public String getStrVehicleLocation() {
        return this.strVehicleLocation;
    }

    public void setStrVehicleLocation(String strVehicleLocation) {
        this.strVehicleLocation = strVehicleLocation;
    }

    public String getStrVehicalGroup() {
        return this.strVehicalGroup;
    }

    public void setStrVehicalGroup(String strVehicalGroup) {
        this.strVehicalGroup = strVehicalGroup;
    }

    public String getStrVehicleId() {
        return this.strVehicleId;
    }

    public void setStrVehicleId(String strVehicleId) {
        this.strVehicleId = strVehicleId;
    }

    public String getStrVehicleSpeed() {
        return this.strVehicleSpeed;
    }

    public void setStrVehicleSpeed(String strVehicleSpeed) {
        this.strVehicleSpeed = strVehicleSpeed;
    }

    public String getStrLat() {
        return this.strLat;
    }

    public void setStrLat(String strLat) {
        this.strLat = strLat;
    }

    public String getStrLong() {
        return this.strLong;
    }

    public void setStrLong(String strLong) {
        this.strLong = strLong;
    }

    public String getStrDistance() {
        return this.strDistance;
    }

    public void setStrDistance(String strDistance) {
        this.strDistance = strDistance;
    }

    public String getStrDestination() {
        return this.strDestination;
    }

    public void setStrDestination(String strDestination) {
        this.strDestination = strDestination;
    }

    public String getStrPhone() {
        return this.strPhone;
    }

    public void setStrPhone(String strPhone) {
        this.strPhone = strPhone;
    }

    public String getStrDriverName() {
        return this.strDriverName;
    }

    public void setStrDriverName(String strDriverName) {
        this.strDriverName = strDriverName;
    }

    public String getStrDistanceSinceMorning() {
        return this.strDistanceSinceMorning;
    }

    public void setStrDistanceSinceMorning(String strDistanceSinceMorning) {
        this.strDistanceSinceMorning = strDistanceSinceMorning;
    }

    public String getStrVal1() {
        return this.strVal1;
    }

    public void setStrVal1(String strVal1) {
        this.strVal1 = strVal1;
    }

    public String getStrVal2() {
        return this.strVal2;
    }

    public void setStrVal2(String strVal2) {
        this.strVal2 = strVal2;
    }

    public String getStrVal3() {
        return this.strVal3;
    }

    public void setStrVal3(String strVal3) {
        this.strVal3 = strVal3;
    }

    public String getStrVal4() {
        return this.strVal4;
    }

    public void setStrVal4(String strVal4) {
        this.strVal4 = strVal4;
    }

    public String getStrVehicletype() {
        return strVehicletype;
    }

    public void setStrVehicletype(String strVehicletype) {
        this.strVehicletype = strVehicletype;
    }

    public String getStrVoltagelvl() {
        return strVoltagelvl;
    }

    public void setStrVoltagelvl(String strVoltagelvl) {
        this.strVoltagelvl = strVoltagelvl;
    }

    public String getStrGsmSgnl() {
        return strGsmSgnl;
    }

    public void setStrGsmSgnl(String strGsmSgnl) {
        this.strGsmSgnl = strGsmSgnl;
    }

    public String getStrgateopntime() {
        return strgateopntime;
    }

    public void setStrgateopntime(String strgateopntime) {
        this.strgateopntime = strgateopntime;
    }

    public String getStrPwrCuttime() {
        return strPwrCuttime;
    }

    public void setStrPwrCuttime(String strPwrCuttime) {
        this.strPwrCuttime = strPwrCuttime;
    }

    public String getStrgateclosedtm() {
        return strgateclosedtm;
    }

    public void setStrgateclosedtm(String strgateclosedtm) {
        this.strgateclosedtm = strgateclosedtm;
    }

    public String getStrlockopentime() {
        return strlockopentime;
    }

    public void setStrlockopentime(String strlockopentime) {
        this.strlockopentime = strlockopentime;
    }

    public String getStrLockclosedtime() {
        return strLockclosedtime;
    }

    public void setStrLockclosedtime(String strLockclosedtime) {
        this.strLockclosedtime = strLockclosedtime;
    }

    public String getStrinstalldate() {
        return strinstalldate;
    }

    public void setStrinstalldate(String strinstalldate) {
        this.strinstalldate = strinstalldate;
    }

    public String getStrorigin() {
        return strorigin;
    }

    public void setStrorigin(String strorigin) {
        this.strorigin = strorigin;
    }

    public String getStrvendoname() {
        return strvendoname;
    }

    public void setStrvendoname(String strvendoname) {
        this.strvendoname = strvendoname;
    }

    public String getStrcompanyname() {
        return strcompanyname;
    }

    public void setStrcompanyname(String strcompanyname) {
        this.strcompanyname = strcompanyname;
    }

    public String getStrnfclockno() {
        return strnfclockno;
    }

    public void setStrnfclockno(String strnfclockno) {
        this.strnfclockno = strnfclockno;
    }

    public String getStrpadlockno() {
        return strpadlockno;
    }

    public void setStrpadlockno(String strpadlockno) {
        this.strpadlockno = strpadlockno;
    }

    public String getStrphonetype() {
        return strphonetype;
    }

    public void setStrphonetype(String strphonetype) {
        this.strphonetype = strphonetype;
    }

    public String getStrlockstats() {
        return strlockstats;
    }

    public void setStrlockstats(String strlockstats) {
        this.strlockstats = strlockstats;
    }

    public String getStrphoneno() {
        return strphoneno;
    }

    public void setStrphoneno(String strphoneno) {
        this.strphoneno = strphoneno;
    }

    public String getStrlocktype() {
        return strlocktype;
    }

    public void setStrlocktype(String strlocktype) {
        this.strlocktype = strlocktype;
    }

    public String getStrtripstartlat() {
        return strtripstartlat;
    }

    public void setStrtripstartlat(String strtripstartlat) {
        this.strtripstartlat = strtripstartlat;
    }

    public String getStrtripstartlong() {
        return strtripstartlong;
    }

    public void setStrtripstartlong(String strtripstartlong) {
        this.strtripstartlong = strtripstartlong;
    }

    public String getStrtripcloselat() {
        return strtripcloselat;
    }

    public void setStrtripcloselat(String strtripcloselat) {
        this.strtripcloselat = strtripcloselat;
    }

    public String getStrtripcloselong() {
        return strtripcloselong;
    }

    public void setStrtripcloselong(String strtripcloselong) {
        this.strtripcloselong = strtripcloselong;
    }

    public String getStrsupervisorno() {
        return strsupervisorno;
    }

    public void setStrsupervisorno(String strsupervisorno) {
        this.strsupervisorno = strsupervisorno;
    }

    public String getStrstatus() {
        return strstatus;
    }

    public void setStrstatus(String strstatus) {
        this.strstatus = strstatus;
    }

    public String getStrdelaystatus() {
        return strdelaystatus;
    }

    public void setStrdelaystatus(String strdelaystatus) {
        this.strdelaystatus = strdelaystatus;
    }

    public String getStrplacementtie() {
        return strplacementtie;
    }

    public void setStrplacementtie(String strplacementtie) {
        this.strplacementtie = strplacementtie;
    }

    public String getStractualplacementtime() {
        return stractualplacementtime;
    }

    public void setStractualplacementtime(String stractualplacementtime) {
        this.stractualplacementtime = stractualplacementtime;
    }

    public String getStractualdepttime() {
        return stractualdepttime;
    }

    public void setStractualdepttime(String stractualdepttime) {
        this.stractualdepttime = stractualdepttime;
    }

    public String getStractualarrtime() {
        return stractualarrtime;
    }

    public void setStractualarrtime(String stractualarrtime) {
        this.stractualarrtime = stractualarrtime;
    }

    public String getStrhourdifference() {
        return strhourdifference;
    }

    public void setStrhourdifference(String strhourdifference) {
        this.strhourdifference = strhourdifference;
    }

    public String getStrdriverno() {
        return strdriverno;
    }

    public void setStrdriverno(String strdriverno) {
        this.strdriverno = strdriverno;
    }

    public String getStrdistance() {
        return strdistance;
    }

    public void setStrdistance(String strdistance) {
        this.strdistance = strdistance;
    }

    public String getStrdistancecovered() {
        return strdistancecovered;
    }

    public void setStrdistancecovered(String strdistancecovered) {
        this.strdistancecovered = strdistancecovered;
    }

    public String getStrdisttocovrd() {
        return strdisttocovrd;
    }

    public void setStrdisttocovrd(String strdisttocovrd) {
        this.strdisttocovrd = strdisttocovrd;
    }

    public String getStrtripcmt() {
        return strtripcmt;
    }

    public void setStrtripcmt(String strtripcmt) {
        this.strtripcmt = strtripcmt;
    }

    public String getStrcmt() {
        return strcmt;
    }

    public void setStrcmt(String strcmt) {
        this.strcmt = strcmt;
    }

    public String getStrrmasterid() {
        return strrmasterid;
    }

    public void setStrrmasterid(String strrmasterid) {
        this.strrmasterid = strrmasterid;
    }

    public String getStrvendorid() {
        return strvendorid;
    }

    public void setStrvendorid(String strvendorid) {
        this.strvendorid = strvendorid;
    }

    public String getStrclientcontctno() {
        return strclientcontctno;
    }

    public void setStrclientcontctno(String strclientcontctno) {
        this.strclientcontctno = strclientcontctno;
    }

    public String getStrelasttime() {
        return strelasttime;
    }

    public void setStrelasttime(String strelasttime) {
        this.strelasttime = strelasttime;
    }

    public String getStrclienttripiD() {
        return strclienttripiD;
    }

    public void setStrclienttripiD(String strclienttripiD) {
        this.strclienttripiD = strclienttripiD;
    }

    public String getStrconsignor() {
        return strconsignor;
    }

    public void setStrconsignor(String strconsignor) {
        this.strconsignor = strconsignor;
    }

    public String getStretahour() {
        return stretahour;
    }

    public void setStretahour(String stretahour) {
        this.stretahour = stretahour;
    }

    public String getStrstartodometer() {
        return strstartodometer;
    }

    public void setStrstartodometer(String strstartodometer) {
        this.strstartodometer = strstartodometer;
    }

    public String getStrendodometer() {
        return strendodometer;
    }

    public void setStrendodometer(String strendodometer) {
        this.strendodometer = strendodometer;
    }

    public String getStrdeparture_time() {
        return strdeparture_time;
    }

    public void setStrdeparture_time(String strdeparture_time) {
        this.strdeparture_time = strdeparture_time;
    }

    public String getETA() {
        return strETA;
    }

    public void setETA(String strETA) {
        this.strETA = strETA;
    }

    public String getPaidAmount() {
        return strPaidAmount;
    }

    public void setPaidAmount(String strPaidAmount) {
        this.strPaidAmount = strPaidAmount;
    }

    public String getAllowedAmount() {
        return strAllowedAmount;
    }

    public void setAllowedAmount(String strAllowedAmount) {
        this.strAllowedAmount = strAllowedAmount;
    }

    public String getBalanceAmount() {
        return strBalanceAmount;
    }

    public void setBalanceAmount(String strBalanceAmount) {
        this.strBalanceAmount = strBalanceAmount;
    }

    public String getStrColorB() {
        return strColorB;
    }

    public void setStrColorB(String strColorB) {
        this.strColorB = strColorB;
    }

    public String getStrColorT() {
        return strColorT;
    }

    public void setStrColorT(String strColorT) {
        this.strColorT = strColorT;
    }

    public String getStrLockFlag() {
        return strLockFlag;
    }

    public void setStrLockFlag(String strLockFlag) {
        this.strLockFlag = strLockFlag;
    }

    public String getStrETA() {
        return strETA;
    }

    public void setStrETA(String strETA) {
        this.strETA = strETA;
    }

    public String getStrPaidAmount() {
        return strPaidAmount;
    }

    public void setStrPaidAmount(String strPaidAmount) {
        this.strPaidAmount = strPaidAmount;
    }

    public String getStrAllowedAmount() {
        return strAllowedAmount;
    }

    public void setStrAllowedAmount(String strAllowedAmount) {
        this.strAllowedAmount = strAllowedAmount;
    }

    public String getStrBalanceAmount() {
        return strBalanceAmount;
    }

    public void setStrBalanceAmount(String strBalanceAmount) {
        this.strBalanceAmount = strBalanceAmount;
    }

/*

    public void writeToParcel(Parcel dest, int flags){
        //write all properties to the parcle

        dest.writeString( strColorB                    );
        dest.writeString(         strColorT            );
        dest.writeString( strstatus                    );
        dest.writeString(         strclientcontctno    );
        dest.writeString( strvendorid                  );
        dest.writeString(         strdeparture_time    );
        dest.writeString( strdelaystatus               );
        dest.writeString(         strplacementtie      );
        dest.writeString( stractualplacementtime       );
        dest.writeString(         stractualdepttime    );
        dest.writeString( stractualarrtime             );
        dest.writeString(         strhourdifference    );
        dest.writeString( strdriverno                  );
        dest.writeString(         strdistance          );
        dest.writeString( strdistancecovered           );
        dest.writeString(         strdisttocovrd       );
        dest.writeString( strtripcmt                   );
        dest.writeString(         strcmt               );
        dest.writeString( strclienttripiD              );
        dest.writeString(         strrmasterid         );
        dest.writeString( strCarNumber                 );
        dest.writeString(         strCarStatus         );
        dest.writeString( strCarTime                   );
        dest.writeString(         strCarIdleTime       );
        dest.writeString( strVehicleLocation           );
        dest.writeString(         strVehicleSpeed      );
        dest.writeString( strLat                       );
        dest.writeString(         strLong              );
        dest.writeString( strDistance                  );
        dest.writeString(         strDestination       );
        dest.writeString( strPhone                     );
        dest.writeString(         strDriverName        );
        dest.writeString( strDistanceSinceMorning      );
        dest.writeString(         strVal1              );
        dest.writeString( strVal2                      );
        dest.writeString(         strVal3              );
        dest.writeString( strVal4                      );
        dest.writeString(         strVehicletype       );
        dest.writeString( strVoltagelvl                );
        dest.writeString(         strGsmSgnl           );
        dest.writeString( strgateopntime               );
        dest.writeString(         strPwrCuttime        );
        dest.writeString( strgateclosedtm              );
        dest.writeString(         strlockopentime      );
        dest.writeString( strLockclosedtime            );
        dest.writeString(         strinstalldate       );
        dest.writeString( strorigin                    );
        dest.writeString(         strconsignor         );
        dest.writeString( stretahour                   );
        dest.writeString(         strvendoname         );
        dest.writeString( strelasttime                 );
        dest.writeString(         strcompanyname       );
        dest.writeString( strnfclockno                 );
        dest.writeString(         strlocktype          );
        dest.writeString( strpadlockno                 );
        dest.writeString(         strphonetype         );
        dest.writeString( strlockstats                 );
        dest.writeString(         strphoneno           );
        dest.writeString( strsupervisorno              );
        dest.writeString(         strtripstartlat      );
        dest.writeString( strtripstartlong             );
        dest.writeString(         strtripcloselat      );
        dest.writeString( strtripcloselong             );
        dest.writeString(         strstartodometer     );
        dest.writeString( strendodometer               );
        dest.writeString(         strETA               );
        dest.writeString( strPaidAmount                );
        dest.writeString(         strAllowedAmount     );
        dest.writeString( strCreatedDate               );
        dest.writeString(         strBalanceAmount     );

    }
    public VehicalBean(Parcel parcel){
        strColorB                  =parcel.readString();
                strColorT          =parcel.readString();
        strstatus                  =parcel.readString();
                strclientcontctno  =parcel.readString();
        strvendorid                =parcel.readString();
                strdeparture_time  =parcel.readString();
        strdelaystatus             =parcel.readString();
                strplacementtie    =parcel.readString();
        stractualplacementtime     =parcel.readString();
                stractualdepttime  =parcel.readString();
        stractualarrtime           =parcel.readString();
                strhourdifference  =parcel.readString();
        strdriverno                =parcel.readString();
                strdistance        =parcel.readString();
        strdistancecovered         =parcel.readString();
                strdisttocovrd     =parcel.readString();
        strtripcmt                 =parcel.readString();
                strcmt             =parcel.readString();
        strclienttripiD            =parcel.readString();
                strrmasterid       =parcel.readString();
        strCarNumber               =parcel.readString();
                strCarStatus       =parcel.readString();
        strCarTime                 =parcel.readString();
                strCarIdleTime     =parcel.readString();
        strVehicleLocation         =parcel.readString();
                strVehicleSpeed    =parcel.readString();
        strLat                     =parcel.readString();
                strLong            =parcel.readString();
        strDistance                =parcel.readString();
                strDestination     =parcel.readString();
        strPhone                   =parcel.readString();
                strDriverName      =parcel.readString();
        strDistanceSinceMorning    =parcel.readString();
                strVal1            =parcel.readString();
        strVal2                    =parcel.readString();
                strVal3            =parcel.readString();
        strVal4                    =parcel.readString();
                strVehicletype     =parcel.readString();
        strVoltagelvl              =parcel.readString();
                strGsmSgnl         =parcel.readString();
        strgateopntime             =parcel.readString();
                strPwrCuttime      =parcel.readString();
        strgateclosedtm            =parcel.readString();
                strlockopentime    =parcel.readString();
        strLockclosedtime          =parcel.readString();
                strinstalldate     =parcel.readString();
        strorigin                  =parcel.readString();
                strconsignor       =parcel.readString();
        stretahour                 =parcel.readString();
                strvendoname       =parcel.readString();
        strelasttime               =parcel.readString();
                strcompanyname     =parcel.readString();
        strnfclockno               =parcel.readString();
                strlocktype        =parcel.readString();
        strpadlockno               =parcel.readString();
                strphonetype       =parcel.readString();
        strlockstats               =parcel.readString();
                strphoneno         =parcel.readString();
        strsupervisorno            =parcel.readString();
                strtripstartlat    =parcel.readString();
        strtripstartlong           =parcel.readString();
                strtripcloselat    =parcel.readString();
        strtripcloselong           =parcel.readString();
                strstartodometer   =parcel.readString();
        strendodometer             =parcel.readString();
                strETA             =parcel.readString();
        strPaidAmount              =parcel.readString();
                strAllowedAmount   =parcel.readString();
        strCreatedDate             =parcel.readString();
                strBalanceAmount   =parcel.readString();

        //read and set saved values from parcel
    }
    //creator - used when un-parceling our parcle (creating the object)
    public static final Parcelable.Creator<VehicalBean> CREATOR = new Parcelable.Creator<VehicalBean>(){

        @Override
        public VehicalBean createFromParcel(Parcel parcel) {
            return new VehicalBean(parcel);
        }

        @Override
        public VehicalBean[] newArray(int size) {
            return new VehicalBean[0];
        }
    };

    //return hashcode of object
    public int describeContents() {
        return hashCode();
    }*/
}
