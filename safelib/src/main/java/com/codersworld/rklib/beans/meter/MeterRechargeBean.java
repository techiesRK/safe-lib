package com.codersworld.rklib.beans.meter;

import java.io.Serializable;

public class MeterRechargeBean implements Serializable {
    int id;
    String title;
    String date;
    String price;
    int status;

    public MeterRechargeBean(int id, String title, int status, String date, String price) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.date = date;
        this.price = price;
    }

    public MeterRechargeBean(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public MeterRechargeBean() {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
