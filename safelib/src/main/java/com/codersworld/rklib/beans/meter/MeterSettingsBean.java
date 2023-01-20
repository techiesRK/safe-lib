package com.codersworld.rklib.beans.meter;

import java.io.Serializable;

public class MeterSettingsBean implements Serializable {
    int id;
    String title;
    int img;

    public MeterSettingsBean(int id, String title, int img) {
        this.id = id;
        this.title = title;
        this.img = img;
    }

    public MeterSettingsBean(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public MeterSettingsBean() {

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

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
