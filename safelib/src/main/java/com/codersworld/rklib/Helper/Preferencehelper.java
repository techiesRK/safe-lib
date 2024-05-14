package com.codersworld.rklib.Helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preferencehelper {


    private static SharedPreferences prefs;


    public final static String PREFS_city = "city_id";
    public final static String PREFS_flatno = "flatno";
    public final static String PREFS_state = "stateid";
    public final static String PREFS_firstname = "firstname";
    public final static String PREFS_phoneno = "phoneno";
    public final static String PREFS_email2 = "email2";
    public final static String PREFS_Building = "Building";
    public final static String PREFS_society = "society";
    public final static String PREFS_USERNAME = "username";
    public final static String PREFS_CID = "companyId";
    public final static String NEW_POP_RECYCLER = "poprecycid";
    public final static String PREFS_CONTACT_ID = "uid";
    public final static String PREFS_ALL_MAP_LIST = "maplist";
    public final static String PREFS_COMPANY_ID = "company_id";
    public final static String PREFS_LOCK_KEY = "LockKey";
    public final static String PREFS_USER_TYPE = "UserTypeVip";
    public final static String PREFS_USER_NAME_TT = "TTNameVip";
    public final static String PREFS_ADMINUSER_NAME_TT = "TTNameAdminVip";
    public final static String PREFS_ADMIN_PWD_TT = "TTNameAdminPVip";
    public final static String PREFS_RUNONCE = "runonce";
    public final static String PREFS_GCM_STATUS = "gcmstatus";
    public final static String PREFS_EMAIL = "email";
    public final static String PREFS_PASSWORD = "passwordd";
    public final static String PREFS_USERCATEGORY = "usercategory";
    public final static String PREFS_DISPLAYLOCKMENU = "displaylockmenu";
    public final static String PREFS_LOGIN_VALUE = "loginValue";
    public final static String PREFS_SUB_ID = "subinterid";
    public final static String PREFS_IS_FEEDBACK_GIVE = "feedback_taken";
    public final static String PREFS_INTRO = "appintro";
    public final String PREFS_TOKEN ="tokenval";
    public final static String PREFS_CURRENCY = "curreny_tag";
    public final static String PREFS_CLIENTID = "vipClientID";
    public final static String PREFS_CLIENTSECRET = "vipClientSecret";
    public final static String PREFS_GEOFENCE_ID = "geofenceid";
    public final static String PREFS_IS_HOTEL_USER = "vipishoteluser";


    public String getPrefsGeofenceId() {
        return prefs.getString(PREFS_GEOFENCE_ID, "-22");
    }

    public void setPrefsGeofenceId(String string) {
        prefs.edit().putString(PREFS_GEOFENCE_ID, string).commit();
    }



    public String getPrefsIsHotelUser() {
        return prefs.getString(PREFS_IS_HOTEL_USER, "0");
    }

    public void setPrefsIsHotelUser(String string) {
        prefs.edit().putString(PREFS_IS_HOTEL_USER, string).commit();
    }

    public String getMainContactId() {
        return prefs.getString("MainContactId", "0");
    }

    public void setMainContactId(String string) {
        prefs.edit().putString("MainContactId", string).commit();
    }
    public String getIsOfficeUser () {
        return prefs.getString("isOfficeUser ", "0");
    }

    public void setIsOfficeUser(String string) {
        prefs.edit().putString("isOfficeUser ", string).commit();
    }

    public String getPrefsCurrency() {
        return prefs.getString(PREFS_CURRENCY, "0");
    }

    public void setPrefsCurrency(String string) {
        prefs.edit().putString(PREFS_CURRENCY, string).commit();
    }

    public boolean isFeedBackGiven() {
        return prefs.getBoolean(PREFS_IS_FEEDBACK_GIVE, false);
    }
    public void setIsFeedBackGive(boolean valus) {
        prefs.edit().putBoolean(PREFS_IS_FEEDBACK_GIVE, valus).commit();
    }
    public Preferencehelper(Context ctx) {
        prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static String getPrefsEmail() {
        return prefs.getString(PREFS_EMAIL, null);
    }


    public String getPrefsLockKey() {
        return prefs.getString(PREFS_LOCK_KEY, null);
    }
    public String getPrefsUserType() {
        return prefs.getString(PREFS_USER_TYPE, null);
    }


    public void setPrefsLockKey(String string) {
        prefs.edit().putString(PREFS_LOCK_KEY, string).commit();
    }

    public void setPrefsUserType(String string) {
        prefs.edit().putString(PREFS_USER_TYPE, string).commit();
    }
    public String getPrefsbtUserName() {
        return prefs.getString(PREFS_USER_NAME_TT, null);
    }

    public void setPrefsbtUserName(String string) {
        prefs.edit().putString(PREFS_USER_NAME_TT, string).commit();
    }

    public void setPrefsbtAdminUserName(String string) {
        prefs.edit().putString(PREFS_ADMINUSER_NAME_TT, string).commit();
    }




    public String getPrefsbtAdminUserName() {
        return prefs.getString(PREFS_ADMINUSER_NAME_TT, null);
    }

    public void setPrefsbtAdminPass(String string) {
        prefs.edit().putString(PREFS_ADMIN_PWD_TT, string).commit();
    }

    public void setPrefsClientID(String clientID){
        prefs.edit().putString(PREFS_CLIENTID, clientID).commit();
    }
    public String getPrefsClientId(){
        return prefs.getString(PREFS_CLIENTID,"");
    }

    public void setPrefsClientSecret(String clientID){
        prefs.edit().putString(PREFS_CLIENTSECRET, clientID).commit();
    }
    public String getPrefsClientSecret(){
        return prefs.getString(PREFS_CLIENTSECRET,"");
    }


    public String getPrefsbtAdminPass() {
        return prefs.getString(PREFS_ADMIN_PWD_TT, null);
    }

    public String getPREFS_state() {
        return prefs.getString(PREFS_state, null);
    }

    public void setPREFS_state(String string) {
        prefs.edit().putString(PREFS_state, string).commit();
    }



    public String getPREFS_flatno() {
        return prefs.getString(PREFS_flatno, null);
    }

    public void setPREFS_flatno(String string) {
        prefs.edit().putString(PREFS_flatno, string).commit();
    }


    public String getPREFS_phoneno() {
        return prefs.getString(PREFS_phoneno, null);
    }

    public void setPREFS_phoneno(String string) {
        prefs.edit().putString(PREFS_phoneno, string).commit();
    }



    public String getPREFS_email2() {
        return prefs.getString(PREFS_email2, null);
    }

    public void setPREFS_email2(String string) {
        prefs.edit().putString(PREFS_email2, string).commit();
    }

 public String getBannerPrefs() {
        return prefs.getString("bnnr", null);
    }

    public void setBannerPrefs(String string) {
        prefs.edit().putString("bnnr", string).commit();
    }


    public String getPREFS_Building() {
        return prefs.getString(PREFS_Building, null);
    }

    public void setPREFS_Building(String string) {
        prefs.edit().putString(PREFS_Building, string).commit();
    }

    public String getPREFS_society() {
        return prefs.getString(PREFS_society, null);
    }

    public void setPREFS_society(String string) {
        prefs.edit().putString(PREFS_society, string).commit();
    }



    public String getPREFS_firstname() {
        return prefs.getString(PREFS_firstname, null);
    }

    public void setPREFS_firstname(String string) {
        prefs.edit().putString(PREFS_firstname, string).commit();
    }

    public String getPREFS_city() {
        return prefs.getString(PREFS_city, null);
    }

    public void setPREFS_city(String string) {
        prefs.edit().putString(PREFS_city, string).commit();
    }




    public String getDISPLAYLOCKMENU() {
        return prefs.getString(PREFS_DISPLAYLOCKMENU, null);
    }

    public void setDISPLAYLOCKMENU(String string) {
        prefs.edit().putString(PREFS_DISPLAYLOCKMENU, string).commit();
    }

    public String getPrefsRunonce() {
        return prefs.getString(PREFS_RUNONCE, "0");
    }

    public void setPrefsRunonce(String string) {
        prefs.edit().putString(PREFS_RUNONCE, string).commit();
    }


    public void setPrefsEmail(String string) {
        prefs.edit().putString(PREFS_EMAIL, string).commit();

    }

    public String getNewPopRecycler() {

        return prefs.getString(NEW_POP_RECYCLER, null);
    }

    public void setNewPopRecycler(String string) {
        prefs.edit().putString(NEW_POP_RECYCLER, string).commit();
    }

    public String getCID() {

        return prefs.getString(PREFS_CID, null);
    }

    public void setCID(String string) {
        prefs.edit().putString(PREFS_CID, string).commit();
    }

    public static String getPrefsSubId() {
        return prefs.getString(PREFS_SUB_ID, null);
    }

    public void setPrefsSubId(String string) {
        prefs.edit().putString(PREFS_SUB_ID, string).commit();
    }

    public void clear(String value) {
        prefs.edit().remove(value).commit();
    }

    public void clearAllPrefs() {
        prefs.edit().clear().commit();
    }

    public SharedPreferences getPrefs() {
        return prefs;
    }

    public void setPrefsUsername(String string) {
        prefs.edit().putString(PREFS_USERNAME, string).commit();
    }

    public String getPrefsUsername() {
        return prefs.getString(PREFS_USERNAME, null);
    }


    public void setPrefsAllMapList(String string) {
        prefs.edit().putString(PREFS_ALL_MAP_LIST, string).commit();
    }

    public String getPrefsAllMapList() {
        return prefs.getString(PREFS_ALL_MAP_LIST, null);
    }


    public void setPrefsContactId(String string) {
        prefs.edit().putString(PREFS_CONTACT_ID, string).commit();
    }

    public String getPrefsContactId() {
        return prefs.getString(PREFS_CONTACT_ID, null);
    }


    public void setPrefsGcmStatus(String string) {
        prefs.edit().putString(PREFS_GCM_STATUS, string).commit();
    }

    public String getPrefsGcmStatus() {
        return prefs.getString(PREFS_GCM_STATUS, null);
    }


    public void setPrefsCompanyId(String string) {
        prefs.edit().putString(PREFS_COMPANY_ID, string).commit();
    }

    public String getPrefsCompanyId() {
        return prefs.getString(PREFS_COMPANY_ID, null);
    }


    public void setPrefsUsercategory(String string) {
        prefs.edit().putString(PREFS_USERCATEGORY, string).commit();
    }

    public String getPrefsUsercategory() {
        return prefs.getString(PREFS_USERCATEGORY, null);
    }


    public void setPrefsLoginValue(String string) {
        prefs.edit().putString(PREFS_LOGIN_VALUE, string).commit();
    }

    public String getPrefsLoginValue() {
        return prefs.getString(PREFS_LOGIN_VALUE, null);
    }


    public void setPrefs(SharedPreferences prefs) {
        this.prefs = prefs;
    }

    public String getPrefsPassword() {
        return prefs.getString(PREFS_PASSWORD, null);
    }

    public void setPrefsPassword(String string) {
        prefs.edit().putString(PREFS_PASSWORD, string).commit();
    }

    public String getPrefsIntro() {
        return prefs.getString(PREFS_INTRO, null);
    }

    public void setPrefsIntro(String string) {
        prefs.edit().putString(PREFS_INTRO, string).commit();
    }

    public void setTokenValue(String valus) {
        prefs.edit().putString(PREFS_TOKEN, valus).commit();
    }



    public String getTokenValue() {

        return prefs.getString(PREFS_TOKEN, null);
    }


    public final static String PREFS_currentbal = "crtblc";
    public final static String PREFS_IS_FINANCE_BLOCK = "financeblock";
    public final static String PREFS_ZIP_CODE = "zip_code";
    public final static String PREFS_SHOP_CLOSE_TIME = "shopclose";
    public final static String PREFS_SHOP_OPEN_TIME = "shopopen";
    public final static String PREFS_TAG_1 = "tag1";
    public final static String PREFS_TAG_2 = "tag2";
    public final static String PREFS_TAG_3 = "tag3";

    public final static String PREFS_TAG_1_DESC = "tags1";
    public final static String PREFS_TAG_2_DESC = "tags2";
    public final static String PREFS_TAG_3_DESC = "tags3";
    public String getPREFS_currentbal() {
        return prefs.getString(PREFS_currentbal, "0");
    }

    public void setPREFS_currentbal(String string) {
        prefs.edit().putString(PREFS_currentbal, string).commit();
    }


    public String getPrefsIsFinanceBlock() {
        return prefs.getString(PREFS_IS_FINANCE_BLOCK, "");
    }

    public void setPrefsIsFinanceBlock(String string) {
        prefs.edit().putString(PREFS_IS_FINANCE_BLOCK, string).commit();
    }

    public String getPrefsZipCode() {
        return prefs.getString(PREFS_ZIP_CODE, null);
    }

    public void setPrefsZipCode(String string) {
        prefs.edit().putString(PREFS_ZIP_CODE, string).commit();
    }
    public String getPrefsShopCloseTime() {
        return prefs.getString(PREFS_SHOP_CLOSE_TIME, "Demo");
    }

    public void setPrefsShopCloseTime(String string) {
        prefs.edit().putString(PREFS_SHOP_CLOSE_TIME, string).commit();
    }
    public String getPrefsShopOpenTime() {
        return prefs.getString(PREFS_SHOP_OPEN_TIME, "Demo");
    }

    public void setPrefsShopOpenTime(String string) {
        prefs.edit().putString(PREFS_SHOP_OPEN_TIME, string).commit();
    }

    public String getPrefsTag1() {
        return prefs.getString(PREFS_TAG_1, "");
    }

    public void setprefstag1(String valus) {
        prefs.edit().putString(PREFS_TAG_1, valus).commit();
    }

    public String getPrefsTag2() {
        return prefs.getString(PREFS_TAG_2, "");
    }

    public void setprefstag2(String valus) {
        prefs.edit().putString(PREFS_TAG_2, valus).commit();
    }

    public String getPrefsTag3() {
        return prefs.getString(PREFS_TAG_3, "");
    }

    public void setprefstag3(String valus) {
        prefs.edit().putString(PREFS_TAG_3, valus).commit();
    }

    public String getPrefsTag1Desc() {
        return prefs.getString(PREFS_TAG_1_DESC, "");
    }

    public void setPrefsTag1Desc(String valus) {
        prefs.edit().putString(PREFS_TAG_1_DESC, valus).commit();
    }

    public String getPrefsTag2Desc() {
        return prefs.getString(PREFS_TAG_2_DESC, "");
    }

    public void setprefstag2Desc(String valus) {
        prefs.edit().putString(PREFS_TAG_2_DESC, valus).commit();
    }

    public String getPrefsTag3Desc() {
        return prefs.getString(PREFS_TAG_3_DESC, "");
    }

    public void setprefstag3Desc(String valus) {
        prefs.edit().putString(PREFS_TAG_3_DESC, valus).commit();
    }
}
