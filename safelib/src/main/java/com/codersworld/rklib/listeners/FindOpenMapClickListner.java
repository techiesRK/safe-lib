package com.codersworld.rklib.listeners;

import com.codersworld.rklib.beans.FindVehhicleBEan;

import java.util.ArrayList;

public interface FindOpenMapClickListner {
    void onMapOpenClick(ArrayList<FindVehhicleBEan> mListVch, FindVehhicleBEan mbean);
    void onCameraClick(FindVehhicleBEan mbean);
}
