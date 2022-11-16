package com.codersworld.rklib.listeners;

import com.codersworld.rklib.beans.VehicalBean;

public interface OnUnlockListener {
    void onUnlock(VehicalBean mBnVehical,String strOTP);
    void askForLocation(int type);
}
