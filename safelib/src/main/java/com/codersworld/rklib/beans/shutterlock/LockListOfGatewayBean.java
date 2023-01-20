package com.codersworld.rklib.beans.shutterlock;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LockListOfGatewayBean implements Serializable {
    @SerializedName("lockId")
    String lockId;
    @SerializedName("lockAlias")
    String lockAlias;
    @SerializedName("lockMac")
    String lockMac;
    @SerializedName("lockName")
    String lockName;
    @SerializedName("rssi")
    int rssi;
    @SerializedName("updateDate")
    long updateDate;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getLockAlias() {
        return lockAlias;
    }

    public void setLockAlias(String lockAlias) {
        this.lockAlias = lockAlias;
    }

    public String getLockMac() {
        return lockMac;
    }

    public void setLockMac(String lockMac) {
        this.lockMac = lockMac;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(long updateDate) {
        this.updateDate = updateDate;
    }
}
