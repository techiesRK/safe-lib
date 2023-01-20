package com.codersworld.rklib.beans.shutterlock;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class SubUsersBeans implements Serializable {

    @SerializedName("success")
    int Success;
    @SerializedName("returnds")
    ArrayList<SubUserBean> mListCards;

    public int getSuccess() {
        return Success;
    }

    public void setSuccess(int success) {
        Success = success;
    }

    public ArrayList<SubUserBean> getmListCards() {
        return mListCards;
    }

    public void setmListCards(ArrayList<SubUserBean> mListCards) {
        this.mListCards = mListCards;
    }

    public static class SubUserBean implements Serializable {
        @SerializedName("firstname")
        String firstname;
        @SerializedName("contactid")
        String contactid;
        @SerializedName("alartphonenumber")
        String alartphonenumber;
        @SerializedName("userid")
        String userid;

        @SerializedName("UserType")
        String UserType;

        @SerializedName("Email")
        String Email;

        @SerializedName("Country")
        String Country;

        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        public String getUserType() {
            return UserType;
        }

        public void setUserType(String userType) {
            UserType = userType;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getContactid() {
            return contactid;
        }

        public void setContactid(String contactid) {
            this.contactid = contactid;
        }

        public String getAlartphonenumber() {
            return alartphonenumber;
        }

        public void setAlartphonenumber(String alartphonenumber) {
            this.alartphonenumber = alartphonenumber;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }
    }
    }


