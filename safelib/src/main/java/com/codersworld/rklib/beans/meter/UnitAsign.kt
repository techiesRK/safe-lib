package com.codersworld.rklib.beans.meter


import com.google.gson.annotations.SerializedName

data class UnitAsign(
    @SerializedName("success")
    val success: String,
    @SerializedName("returnds")
    val returnds: List<Returnd>
) {
    data class Returnd(
        @SerializedName("Success")
        val success: String,
        @SerializedName("returnval")
        val returnval: String,
        @SerializedName("returnLoginId")
        val returnLoginId: Any,
        @SerializedName("contactId")
        val contactId: Any,
        @SerializedName("username")
        val username: Any,
        @SerializedName("GuestMasterID")
        val guestMasterID: Any,
        @SerializedName("SubContactID")
        val subContactID: Any,
        @SerializedName("pwd")
        val pwd: Any
    )
}