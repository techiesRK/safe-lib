package com.codersworld.rklib.beans.shutterlock;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class CardsBean implements Serializable {
    @SerializedName("success")
    int Success;
    @SerializedName("newusercreation")
    ArrayList<CardBean> mListCards;

    public int getSuccess() {
        return Success;
    }

    public void setSuccess(int success) {
        Success = success;
    }

    public ArrayList<CardBean> getmListCards() {
        return mListCards;
    }

    public void setmListCards(ArrayList<CardBean> mListCards) {
        this.mListCards = mListCards;
    }

    public static class CardBean implements Serializable {
        @SerializedName("Success")
        String Success;
        @SerializedName("CardId")
        String CardId;
        @SerializedName("LockCardID")
        String LockCardID;
        @SerializedName("CardName")
        String CardName;
        @SerializedName("LockId")
        String LockId;
        @SerializedName("DeviceId")
        String DeviceId;
        @SerializedName("CustomerName")
        String CustomerName;
        @SerializedName("Createdby")
        String Createdby;
        @SerializedName("Passcode")
        String Passcode;
        @SerializedName("ekey")
        String ekey;
        @SerializedName("AccessStartDate")
        String AccessStartDate;
        @SerializedName("AccessEndDate")
        String AccessEndDate;
        @SerializedName("Generatetype")
        String Generatetype;
        @SerializedName("Createddatetime")
        String Createddatetime;

        @SerializedName("ReturnBTLockCardId")
        String ReturnBTLockCardId;

        @SerializedName("ReturnBTLockmsg")
        String ReturnBTLockmsg;

        @SerializedName("CustomerId")
        String CustomerId;

        public String getCustomerId() {
            return CustomerId;
        }

        public void setCustomerId(String customerId) {
            CustomerId = customerId;
        }

        public String getReturnBTLockCardId() {
            return ReturnBTLockCardId;
        }

        public void setReturnBTLockCardId(String returnBTLockCardId) {
            ReturnBTLockCardId = returnBTLockCardId;
        }

        public String getReturnBTLockmsg() {
            return ReturnBTLockmsg;
        }

        public void setReturnBTLockmsg(String returnBTLockmsg) {
            ReturnBTLockmsg = returnBTLockmsg;
        }

        public String getSuccess() {
            return Success;
        }

        public void setSuccess(String success) {
            Success = success;
        }

        public String getCardId() {
            return CardId;
        }

        public void setCardId(String cardId) {
            CardId = cardId;
        }

        public String getLockCardID() {
            return LockCardID;
        }

        public void setLockCardID(String lockCardID) {
            LockCardID = lockCardID;
        }

        public String getCardName() {
            return CardName;
        }

        public void setCardName(String cardName) {
            CardName = cardName;
        }

        public String getLockId() {
            return LockId;
        }

        public void setLockId(String lockId) {
            LockId = lockId;
        }

        public String getDeviceId() {
            return DeviceId;
        }

        public void setDeviceId(String deviceId) {
            DeviceId = deviceId;
        }

        public String getCustomerName() {
            return CustomerName;
        }

        public void setCustomerName(String customerName) {
            CustomerName = customerName;
        }

        public String getCreatedby() {
            return Createdby;
        }

        public void setCreatedby(String createdby) {
            Createdby = createdby;
        }

        public String getPasscode() {
            return Passcode;
        }

        public void setPasscode(String passcode) {
            Passcode = passcode;
        }

        public String getEkey() {
            return ekey;
        }

        public void setEkey(String ekey) {
            this.ekey = ekey;
        }

        public String getAccessStartDate() {
            return AccessStartDate;
        }

        public void setAccessStartDate(String accessStartDate) {
            AccessStartDate = accessStartDate;
        }

        public String getAccessEndDate() {
            return AccessEndDate;
        }

        public void setAccessEndDate(String accessEndDate) {
            AccessEndDate = accessEndDate;
        }

        public String getGeneratetype() {
            return Generatetype;
        }

        public void setGeneratetype(String generatetype) {
            Generatetype = generatetype;
        }

        public String getCreateddatetime() {
            return Createddatetime;
        }

        public void setCreateddatetime(String createddatetime) {
            Createddatetime = createddatetime;
        }
    }


}
