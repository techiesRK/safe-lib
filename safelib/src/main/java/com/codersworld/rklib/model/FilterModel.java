package com.codersworld.rklib.model;

import com.codersworld.rklib.beans.VehicalBean;

import java.util.ArrayList;

public class FilterModel {
    String filtecount, filtertext;
    String type;
    ArrayList<VehicalBean> mList;
    public FilterModel() {
    }

    public FilterModel( String filtertext,String filtecount,ArrayList<VehicalBean> mList) {
        this.filtecount = filtecount;
        this.filtertext = filtertext;
        this.mList = mList;
    }
    public FilterModel( String filtertext,String filtecount) {
        this.filtecount = filtecount;
        this.filtertext = filtertext;
    }
    public FilterModel( String filtertext,String filtecount,String type) {
        this.filtecount = filtecount;
        this.type = type;
        this.filtertext = filtertext;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<VehicalBean> getmList() {
        return mList;
    }

    public void setmList(ArrayList<VehicalBean> mList) {
        this.mList = mList;
    }

    public String getFiltecount() {
        return filtecount;
    }

    public void setFiltecount(String filtecount) {
        this.filtecount = filtecount;
    }

    public String getFiltertext() {
        return filtertext;
    }

    public void setFiltertext(String filtertext) {
        this.filtertext = filtertext;
    }
}
