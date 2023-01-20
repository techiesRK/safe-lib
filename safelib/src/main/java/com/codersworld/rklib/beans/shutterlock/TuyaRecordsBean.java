package com.codersworld.rklib.beans.shutterlock;

import java.io.Serializable;

public class TuyaRecordsBean implements Serializable {

    private String Tid;
    private String DataId;
    private String DeviceId;
    private String ProductKey;
    private String StatusArray;
    private String StatusCode;
    private String BizCode;
    private String StatusValue;
    private String Bizdatauid;
    private String Statusdatatime;
    private String Bdatetime;

    private String Date;
    private String Time;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String tid) {
        Tid = tid;
    }

    public String getDataId() {
        return DataId;
    }

    public void setDataId(String dataId) {
        DataId = dataId;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public String getProductKey() {
        return ProductKey;
    }

    public void setProductKey(String productKey) {
        ProductKey = productKey;
    }

    public String getStatusArray() {
        return StatusArray;
    }

    public void setStatusArray(String statusArray) {
        StatusArray = statusArray;
    }

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String statusCode) {
        StatusCode = statusCode;
    }

    public String getBizCode() {
        return BizCode;
    }

    public void setBizCode(String bizCode) {
        BizCode = bizCode;
    }

    public String getStatusValue() {
        return StatusValue;
    }

    public void setStatusValue(String statusValue) {
        StatusValue = statusValue;
    }

    public String getBizdatauid() {
        return Bizdatauid;
    }

    public void setBizdatauid(String bizdatauid) {
        Bizdatauid = bizdatauid;
    }

    public String getStatusdatatime() {
        return Statusdatatime;
    }

    public void setStatusdatatime(String statusdatatime) {
        Statusdatatime = statusdatatime;
    }

    public String getBdatetime() {
        return Bdatetime;
    }

    public void setBdatetime(String bdatetime) {
        Bdatetime = bdatetime;
    }
}
