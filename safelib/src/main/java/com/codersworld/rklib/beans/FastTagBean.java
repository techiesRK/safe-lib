package com.codersworld.rklib.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class FastTagBean implements Serializable {
    @SerializedName("success")
    String success;
    @SerializedName("returnds")
    ArrayList<FastTagChildBean> mListFastTags;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public ArrayList<FastTagChildBean> getmListFastTags() {
        return mListFastTags;
    }

    public void setmListFastTags(ArrayList<FastTagChildBean> mListFastTags) {
        this.mListFastTags = mListFastTags;
    }

    public class FastTagChildBean implements Serializable {
        private String strColorOne;
        private String strColorTwo;
        @SerializedName("TransactionDate")
        String TransactionDate;
        @SerializedName("TotalAmount")
        String TotalAmount;
        @SerializedName("FastTag")
        String FastTag;
        @SerializedName("FastTagCount")
        String FastTagCount;
        @SerializedName("BPCLTag")
        String BPCLTag;
        @SerializedName("BPCLCount")
        String BPCLCount;
        @SerializedName("Other")
        String Other;
        @SerializedName("OtherCount")
        String OtherCount;
        @SerializedName("TotalCount")
        String TotalCount;

        public String getTransactionDate() {
            return TransactionDate;
        }

        public void setTransactionDate(String transactionDate) {
            TransactionDate = transactionDate;
        }

        public String getStrColorOne() {
            return strColorOne;
        }

        public void setStrColorOne(String strColorOne) {
            this.strColorOne = strColorOne;
        }

        public String getStrColorTwo() {
            return strColorTwo;
        }

        public void setStrColorTwo(String strColorTwo) {
            this.strColorTwo = strColorTwo;
        }

        public String getTotalAmount() {
            return TotalAmount;
        }

        public void setTotalAmount(String totalAmount) {
            TotalAmount = totalAmount;
        }

        public String getFastTag() {
            return FastTag;
        }

        public void setFastTag(String fastTag) {
            FastTag = fastTag;
        }

        public String getFastTagCount() {
            return FastTagCount;
        }

        public void setFastTagCount(String fastTagCount) {
            FastTagCount = fastTagCount;
        }

        public String getBPCLTag() {
            return BPCLTag;
        }

        public void setBPCLTag(String BPCLTag) {
            this.BPCLTag = BPCLTag;
        }

        public String getBPCLCount() {
            return BPCLCount;
        }

        public void setBPCLCount(String BPCLCount) {
            this.BPCLCount = BPCLCount;
        }

        public String getOther() {
            return Other;
        }

        public void setOther(String other) {
            Other = other;
        }

        public String getOtherCount() {
            return OtherCount;
        }

        public void setOtherCount(String otherCount) {
            OtherCount = otherCount;
        }

        public String getTotalCount() {
            return TotalCount;
        }

        public void setTotalCount(String totalCount) {
            TotalCount = totalCount;
        }
    }
}
