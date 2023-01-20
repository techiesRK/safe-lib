package com.codersworld.rklib.beans.meter


import com.google.gson.annotations.SerializedName

data class MeterUnitsHourlyReportData(
    @SerializedName("success")
    val success: String,
    @SerializedName("returnmessage")
    val returndata: List<Returndata>
) {
    data class Returndata(
        @SerializedName("UnitName")
        val unitName: String,
        @SerializedName("Date")
        val date: String,
        @SerializedName("hour")
        val hour: String,
        @SerializedName("MainUnit")
        val mainUnit: String,
        @SerializedName("DGUnit")
        val dGUnit: String,
        @SerializedName("MainUnitR")
        val mainUnitR: String,
        @SerializedName("DGUnitR")
        val dGUnitR: String,
        @SerializedName("MainUnitA")
        val mainUnitA: String,
        @SerializedName("DGUnitA")
        val dGUnitA: String,
        @SerializedName("OtherA")
        val otherA: String,
        @SerializedName("electricCurrent")
        val electricCurrent: String,
        @SerializedName("power")
        val power: String,
        @SerializedName("voltage")
        val voltage: String,
        @SerializedName("TotalA")
        val totalA: String,
        @SerializedName("devicecode")
        val devicecode: String,
        @SerializedName("DeviceID")
        val deviceID: String,
        @SerializedName("Currentupdatetime")
        val currentupdatetime: String,
        @SerializedName("MainUnitRold")
        val mainUnitRold: String,
        @SerializedName("DGUnitRold")
        val dGUnitRold: String,
        @SerializedName("Mainconsumption")
        val mainconsumption: String,
        @SerializedName("DGconsumption")
        val dGconsumption: String,
        @SerializedName("oldbalance")
        val oldbalance: String,
        @SerializedName("Used")
        val used: String,
        @SerializedName("fixedcharges")
        val fixedcharges: String,
        @SerializedName("Newbalance")
        val newbalance: String,
        @SerializedName("maincahrges")
        val maincahrges: String,
        @SerializedName("DGCharges")
        val dGCharges: String
    )
}