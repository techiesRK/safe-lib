package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DriverBean implements Serializable {

    @SerializedName("Name")
    private String strdrivername;
    @SerializedName("DriverNumber")
    private String strdrivernumber;
    @SerializedName("VehicleNumber")
    private String strvehiclenmber;
    @SerializedName("VehicleId")
    private String strvehicleid;
    @SerializedName("DLNo")
    private String strDlno;

    @SerializedName("DriverId")
    private String strdriverid;
   @SerializedName("DocumentID")
    private String DocumentID;


    public String getDocumentID() {
        return DocumentID;
    }

    public void setDocumentID(String documentID) {
        DocumentID = documentID;
    }

    public DriverBean() {
    }

    public String getStrdrivername() {
        return strdrivername;
    }

    public void setStrdrivername(String strdrivername) {
        this.strdrivername = strdrivername;
    }

    public String getStrdrivernumber() {
        return strdrivernumber;
    }

    public void setStrdrivernumber(String strdrivernumber) {
        this.strdrivernumber = strdrivernumber;
    }

    public String getStrvehiclenmber() {
        return strvehiclenmber;
    }

    public void setStrvehiclenmber(String strvehiclenmber) {
        this.strvehiclenmber = strvehiclenmber;
    }

    public String getStrvehicleid() {
        return strvehicleid;
    }

    public void setStrvehicleid(String strvehicleid) {
        this.strvehicleid = strvehicleid;
    }

    public String getStrDlno() {
        return strDlno;
    }

    public void setStrDlno(String strDlno) {
        this.strDlno = strDlno;
    }

    public String getStrdriverid() {
        return strdriverid;
    }

    public void setStrdriverid(String strdriverid) {
        this.strdriverid = strdriverid;
    }
}
