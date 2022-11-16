package com.codersworld.rklib.listeners;

import com.codersworld.rklib.beans.VehicalBean;

import java.util.ArrayList;

public interface FilterClickListener {
    void onFilterClick(String type, int position, ArrayList<VehicalBean> mListFltr);

//    void OnFilterCLick2(int mPosition);
}
