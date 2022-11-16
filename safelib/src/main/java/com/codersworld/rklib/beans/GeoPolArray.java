package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class GeoPolArray {
    @SerializedName("ObjType")
    private String strobjtyp;

    @SerializedName("LatLong")
    private String strlatlong;


    @SerializedName("Lat")
    private String strlat;

    @SerializedName("Long")
    private String strlong;


    public String getStrobjtyp() {
        return strobjtyp;
    }

    public void setStrobjtyp(String strobjtyp) {
        this.strobjtyp = strobjtyp;
    }

    public String getStrlatlong() {
        return strlatlong;
    }

    public void setStrlatlong(String strlatlong) {
        this.strlatlong = strlatlong;
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
