package com.codersworld.rklib.listeners;

import com.codersworld.rklib.beans.VehicalBean;

import java.util.ArrayList;

public interface OpenMapClickListener {
    void onMapOpenClick(ArrayList<VehicalBean> mListVch,VehicalBean mbean);
    void onCameraClick(VehicalBean mbean);

//    void OnFilterCLick2(int mPosition);
}
