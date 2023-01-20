package com.codersworld.rklib.beans.meter


import com.google.gson.annotations.SerializedName

data class MeterRechargeDetail(
    @SerializedName("success")
    val success: String,
    @SerializedName("returnds")
    val returnds: List<Returnd>
) {
    data class Returnd(
        @SerializedName("ExpID")
        val expID: String,
        @SerializedName("ExpType")
        val expType: String,
        @SerializedName("ExpDate")
        val expDate: String,
        @SerializedName("Amount")
        val amount: String,
        @SerializedName("DeviceName")
        val deviceName: String,
        @SerializedName("deviceid")
        val deviceid: String,
        @SerializedName("Createdby")
        val createdby: String,
        @SerializedName("Createddate")
        val createddate: String,
        @SerializedName("Comment")
        val comment: String,
        @SerializedName("PaymentMode")
        val paymentMode: String,
        @SerializedName("mid")
        val mid: String,
        @SerializedName("txnid")
        val txnid: String,
        @SerializedName("txndate")
        val txndate: String,
        @SerializedName("currency")
        val currency: String
    )
}