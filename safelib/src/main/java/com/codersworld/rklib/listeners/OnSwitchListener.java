package com.codersworld.rklib.listeners;

public interface OnSwitchListener {
    void onPageChange(String mPage);
    void onMeterData(String date,String mainPrice,String grid,String DG);
}