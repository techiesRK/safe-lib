package com.codersworld.rklib.beans.meter


import com.google.gson.annotations.SerializedName

data class MeterlatesthistoryData(
    @SerializedName("success")
    var success: String,
    @SerializedName("returnmessage")
    var returnmessage: List<Returnmessage>
) {
    data class Returnmessage(
        @SerializedName("meterstatus")
        var meterstatus: String,
        @SerializedName("UnitName")
        var unitName: String,
        @SerializedName("currentbalance")
        var currentbalance: String,
        @SerializedName("Date")
        var date: String,
        @SerializedName("hour")
        var hour: String,
        @SerializedName("MainUnit")
        var mainUnit: String,
        @SerializedName("DGUnit")
        var dGUnit: String,
        @SerializedName("MainUnitR")
        var mainUnitR: String,
        @SerializedName("DGUnitR")
        var dGUnitR: String,
        @SerializedName("MainUnitA")
        var mainUnitA: String,
        @SerializedName("DGUnitA")
        var dGUnitA: String,
        @SerializedName("OtherA")
        var otherA: String,
        @SerializedName("electricCurrent")
        var electricCurrent: String,
        @SerializedName("power")
        var power: String,
        @SerializedName("voltage")
        var voltage: String,
        @SerializedName("TotalA")
        var totalA: String,
        @SerializedName("devicecode")
        var devicecode: String,
        @SerializedName("DeviceID")
        var deviceID: String,
        @SerializedName("Currentupdatetime")
        var Currentupdatetime: String
    )
}