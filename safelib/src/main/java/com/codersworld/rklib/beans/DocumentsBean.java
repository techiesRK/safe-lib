package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DocumentsBean implements Serializable {





    @SerializedName("CategoryId")
    private String strcategoryid;

    @SerializedName("AuthorityName")
    private String strauthname;

    @SerializedName("DocumentNumber")
    private String strdocno;
    @SerializedName("DocumentID")
    private String strdocid;


    @SerializedName("DocumentName")
    private String strdocname;


    @SerializedName("DocumentType")
    private String strdoctype;


    @SerializedName("CreatedBy")
    private String strcreatedby;


    @SerializedName("CreatedDate")
    private String strcreatedate;

    @SerializedName("AttachDocument")
    private String strattachdoc;

    @SerializedName("VehicleId")
    private String strvehicleid;


    @SerializedName("EmpContactId")
    private String stremocontactid;


    @SerializedName("Comment")
    private String strcomment;
    @SerializedName("StartDate")
    private String strstartdate;

    @SerializedName("EndDate")
    private String strenddate;


    @SerializedName("TripID")
    private String strtripid;

 @SerializedName("DocumentPath")
    private String DocumentPath;


    public String getDocumentPath() {
        return DocumentPath;
    }

    public void setDocumentPath(String documentPath) {
        DocumentPath = documentPath;
    }

    public DocumentsBean() {
    }

    public String getStrcategoryid() {
        return strcategoryid;
    }

    public void setStrcategoryid(String strcategoryid) {
        this.strcategoryid = strcategoryid;
    }

    public String getStrauthname() {
        return strauthname;
    }

    public void setStrauthname(String strauthname) {
        this.strauthname = strauthname;
    }

    public String getStrdocno() {
        return strdocno;
    }

    public void setStrdocno(String strdocno) {
        this.strdocno = strdocno;
    }

    public String getStrdocid() {
        return strdocid;
    }

    public void setStrdocid(String strdocid) {
        this.strdocid = strdocid;
    }

    public String getStrdocname() {
        return strdocname;
    }

    public void setStrdocname(String strdocname) {
        this.strdocname = strdocname;
    }

    public String getStrdoctype() {
        return strdoctype;
    }

    public void setStrdoctype(String strdoctype) {
        this.strdoctype = strdoctype;
    }

    public String getStrcreatedby() {
        return strcreatedby;
    }

    public void setStrcreatedby(String strcreatedby) {
        this.strcreatedby = strcreatedby;
    }

    public String getStrcreatedate() {
        return strcreatedate;
    }

    public void setStrcreatedate(String strcreatedate) {
        this.strcreatedate = strcreatedate;
    }

    public String getStrattachdoc() {
        return strattachdoc;
    }

    public void setStrattachdoc(String strattachdoc) {
        this.strattachdoc = strattachdoc;
    }

    public String getStrvehicleid() {
        return strvehicleid;
    }

    public void setStrvehicleid(String strvehicleid) {
        this.strvehicleid = strvehicleid;
    }

    public String getStremocontactid() {
        return stremocontactid;
    }

    public void setStremocontactid(String stremocontactid) {
        this.stremocontactid = stremocontactid;
    }

    public String getStrcomment() {
        return strcomment;
    }

    public void setStrcomment(String strcomment) {
        this.strcomment = strcomment;
    }

    public String getStrstartdate() {
        return strstartdate;
    }

    public void setStrstartdate(String strstartdate) {
        this.strstartdate = strstartdate;
    }

    public String getStrenddate() {
        return strenddate;
    }

    public void setStrenddate(String strenddate) {
        this.strenddate = strenddate;
    }

    public String getStrtripid() {
        return strtripid;
    }

    public void setStrtripid(String strtripid) {
        this.strtripid = strtripid;
    }
}
