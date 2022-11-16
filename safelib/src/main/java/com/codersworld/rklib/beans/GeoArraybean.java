package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

public class GeoArraybean {

    @SerializedName("ObjType")
    private String sttrobjtyp;

    @SerializedName("LatLong")
    private String strlatlng;
    @SerializedName("Lat")
    private String strlat;
    @SerializedName("Long")
    private String strlong;

    public String getSttrobjtyp() {
        return sttrobjtyp;
    }

    public void setSttrobjtyp(String sttrobjtyp) {
        this.sttrobjtyp = sttrobjtyp;
    }

    public String getStrlatlng() {
        return strlatlng;
    }

    public void setStrlatlng(String strlatlng) {
        this.strlatlng = strlatlng;
    }

    public String getStrlat() {
        return strlat;
    }

    public void setStrlat(String strlat) {
        this.strlat = strlat;
    }

    public String getStrlong() {
        return strlong;
    }

    public void setStrlong(String strlong) {
        this.strlong = strlong;
    }
}