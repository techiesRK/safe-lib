package com.codersworld.rklib.beans.shutterlock;

import java.io.Serializable;

public class LockDataUploadBean implements Serializable {
     int accessoryElectricQuantity;
     int deleteDate;
     int electricQuantity;
     int keyId;
     String operateDate;
     int recordId;
     int recordType;
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    int uid;



    public int getAccessoryElectricQuantity() {
        return accessoryElectricQuantity;
    }

    public void setAccessoryElectricQuantity(int accessoryElectricQuantity) {
        this.accessoryElectricQuantity = accessoryElectricQuantity;
    }

    public int getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(int deleteDate) {
        this.deleteDate = deleteDate;
    }

    public int getElectricQuantity() {
        return electricQuantity;
    }

    public void setElectricQuantity(int electricQuantity) {
        this.electricQuantity = electricQuantity;
    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getRecordType() {
        return recordType;
    }

    public void setRecordType(int recordType) {
        this.recordType = recordType;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
