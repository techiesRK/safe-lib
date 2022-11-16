package com.codersworld.rklib.Helper;

import android.Manifest;
import android.content.pm.PackageManager;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.ACCESS_NETWORK_STATE;
import static android.Manifest.permission.ACCESS_WIFI_STATE;
import static android.Manifest.permission.CHANGE_WIFI_STATE;
import static android.Manifest.permission.INTERNET;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;

/*
import static android.Manifest.permission.BLUETOOTH;
import static android.Manifest.permission.BLUETOOTH_ADMIN;
*/
/*
import static android.Manifest.permission.READ_CALL_LOG;
import static android.Manifest.permission.READ_CONTACTS;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
*/
/*import static android.Manifest.permission.READ_SMS;
import static android.Manifest.permission.RECEIVE_SMS;
import static android.Manifest.permission.SEND_SMS;
import static android.Manifest.permission.WRITE_CALL_LOG;*/

/**
 * Created by karan on 12/15/2016.
 */

public class MarshMallowPermission {

    public static final int RECORD_PERMISSION_REQUEST_CODE = 1;
    public static final int EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE = 2;
    public static final int CAMERA_PERMISSION_REQUEST_CODE = 3;
    public static final int ACCESS_WIFI_STATE_PERMISSION_REQUEST_CODE = 4;
    public static final int ACCESS_NETWORK_STATE_PERMISSION_REQUEST_CODE = 5;
    public static final int CHANGE_WIFI_STATE_PERMISSION_REQUEST_CODE = 6;
    public static final int INTERNET_PERMISSION_REQUEST_CODE = 7;
    public static final int READ_PHONE_STATE_PERMISSION_REQUEST_CODE = 8;
    public static final int READ_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE = 9;
    public static final int READ_SMS_PERMISSION_REQUEST_CODE = 10;
    public static final int READ_CONTACTS_PERMISSION_REQUEST_CODE = 11;
    public static final int READ_CALL_LOG_PERMISSION_REQUEST_CODE = 12;
    public static final int WRITE_CALL_LOG_PERMISSION_REQUEST_CODE = 13;
    public static final int CALL_PHONE_PERMISSION_REQUEST_CODE = 14;
    public static final int BLUETOOTH_ADMIN_PERMISSION_REQUEST_CODE = 15;
    public static final int BLUETOOTH_PERMISSION_REQUEST_CODE = 16;
    public static final int ACCESS_FINE_LOCATION_PERMISSION_REQUEST_CODE = 17;
    public static final int ACCESS_COARSE_LOCATION_PERMISSION_REQUEST_CODE = 18;
    public static final int WRITE_SMS_PERMISSION_REQUEST_CODE = 19;
    public static final int RECEIVE_SMS_PERMISSION_REQUEST_CODE = 20;
    public static final int SEND_SMS_PERMISSION_REQUEST_CODE = 21;
    public static final int CALL_REQUEST_PERMISSION_CODE=22;


    AppCompatActivity activity;

    public MarshMallowPermission(AppCompatActivity activity) {
        this.activity = activity;
    }

    public boolean checkPermissionForRecord(){
        int result = ContextCompat.checkSelfPermission(activity, Manifest.permission.RECORD_AUDIO);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public boolean checkPermissionForExternalStorage(){
        int result = ContextCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public boolean checkPermissionForCamera(){
        int result = ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForRecord(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.RECORD_AUDIO)){
            Toast.makeText(activity, "Microphone permission needed for recording. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.RECORD_AUDIO},RECORD_PERMISSION_REQUEST_CODE);
        }
    }
    public void requestPermissionForExternalStorage(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE)){
            Toast.makeText(activity, "External Storage permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE);
        }
    }
    public void requestPermissionForCamera(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CAMERA)){
            Toast.makeText(activity, "Camera permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.CAMERA},CAMERA_PERMISSION_REQUEST_CODE);
        }
    }
    public boolean checkPermissionForaccesswifistate(){
        int result = ContextCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_WIFI_STATE);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForaccesswifistate(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, ACCESS_WIFI_STATE)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},ACCESS_WIFI_STATE_PERMISSION_REQUEST_CODE);
        }
    }
    public boolean checkPermissionForACCESS_NETWORK_STATE(){
        int result = ContextCompat.checkSelfPermission(activity, ACCESS_NETWORK_STATE);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForACCESS_NETWORK_STATE(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, ACCESS_NETWORK_STATE)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},ACCESS_NETWORK_STATE_PERMISSION_REQUEST_CODE);
        }
    }
    public boolean checkPermissionForCHANGE_WIFI_STATE(){
        int result = ContextCompat.checkSelfPermission(activity, CHANGE_WIFI_STATE);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForCHANGE_WIFI_STATE(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, CHANGE_WIFI_STATE)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},CHANGE_WIFI_STATE_PERMISSION_REQUEST_CODE);
        }
    }
    public boolean checkPermissionForINTERNET(){
        int result = ContextCompat.checkSelfPermission(activity, INTERNET);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForINTERNET(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, INTERNET)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},INTERNET_PERMISSION_REQUEST_CODE);
        }
    }
    /* public boolean checkPermissionForREAD_PHONE_STATE(){
         int result = ContextCompat.checkSelfPermission(activity, READ_PHONE_STATE);
         if (result == PackageManager.PERMISSION_GRANTED){
             return true;
         } else {
             return false;
         }
     }
     public void requestPermissionForREAD_PHONE_STATE(){
         if (ActivityCompat.shouldShowRequestPermissionRationale(activity, READ_PHONE_STATE)){
             Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
         } else {
             ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},READ_PHONE_STATE_PERMISSION_REQUEST_CODE);
         }
     }*/
    public boolean checkPermissionForREAD_EXTERNAL_STORAGE(){
        int result = ContextCompat.checkSelfPermission(activity, READ_EXTERNAL_STORAGE);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForREAD_EXTERNAL_STORAGE(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, READ_EXTERNAL_STORAGE)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},READ_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE);
        }
    }
   /* public boolean checkPermissionForREAD_SMS(){
        int result = ContextCompat.checkSelfPermission(activity, READ_SMS);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForREAD_SMS(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, READ_SMS)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},READ_SMS_PERMISSION_REQUEST_CODE);
        }
    }*/
  /*  public boolean checkPermissionForREAD_CONTACTS(){
        int result = ContextCompat.checkSelfPermission(activity, READ_CONTACTS);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }*/
  /*  public void requestPermissionForREAD_CONTACTS(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, READ_CONTACTS)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},READ_CONTACTS_PERMISSION_REQUEST_CODE);
        }
    }*/

    /*    public boolean checkPermissionForREAD_CALL_LOG(){
            int result = ContextCompat.checkSelfPermission(activity, READ_CALL_LOG);
            if (result == PackageManager.PERMISSION_GRANTED){
                return true;
            } else {
                return false;
            }
        }
        public void requestPermissionForREAD_CALL_LOG(){
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, READ_CALL_LOG)){
                Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
            } else {
                ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},READ_CALL_LOG_PERMISSION_REQUEST_CODE);
            }
        }
        public boolean checkPermissionForWRITE_CALL_LOG(){
            int result = ContextCompat.checkSelfPermission(activity, WRITE_CALL_LOG);
            if (result == PackageManager.PERMISSION_GRANTED){
                return true;
            } else {
                return false;
            }
        }
        public void requestPermissionForWRITE_CALL_LOG(){
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, WRITE_CALL_LOG)){
                Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
            } else {
                ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},WRITE_CALL_LOG_PERMISSION_REQUEST_CODE);
            }
        }
        public boolean checkPermissionForCALL_PHONE(){
            int result = ContextCompat.checkSelfPermission(activity, CALL_PHONE);
            if (result == PackageManager.PERMISSION_GRANTED){
                return true;
            } else {
                return false;
            }
        }
        public void requestPermissionForCALL_PHONE(){
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, CALL_PHONE)){
                Toast.makeText(activity, "Phone permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
            } else {
                ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},CALL_PHONE_PERMISSION_REQUEST_CODE);
            }
        }
        public boolean checkPermissionForBLUETOOTH_ADMIN(){
            int result = ContextCompat.checkSelfPermission(activity, BLUETOOTH_ADMIN);
            if (result == PackageManager.PERMISSION_GRANTED){
                return true;
            } else {
                return false;
            }
        }
        public void requestPermissionForBLUETOOTH_ADMIN(){
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, BLUETOOTH_ADMIN)){
                Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
            } else {
                ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},BLUETOOTH_ADMIN_PERMISSION_REQUEST_CODE);
            }
        }

        public boolean checkPermissionForBLUETOOTH(){
            int result = ContextCompat.checkSelfPermission(activity, BLUETOOTH);
            if (result == PackageManager.PERMISSION_GRANTED){
                return true;
            } else {
                return false;
            }
        }
        public void requestPermissionForBLUETOOTH(){
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, BLUETOOTH)){
                Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
            } else {
                ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},BLUETOOTH_PERMISSION_REQUEST_CODE);
            }
        }*/
    public boolean checkPermissionForACCESS_FINE_LOCATION(){
        int result = ContextCompat.checkSelfPermission(activity, ACCESS_FINE_LOCATION);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForACCESS_FINE_LOCATION(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, ACCESS_FINE_LOCATION)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},ACCESS_FINE_LOCATION_PERMISSION_REQUEST_CODE);
        }
    }
    public boolean checkPermissionForACCESS_COARSE_LOCATION(){
        int result = ContextCompat.checkSelfPermission(activity, ACCESS_COARSE_LOCATION);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForACCESS_COARSE_LOCATION(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, ACCESS_COARSE_LOCATION)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},ACCESS_COARSE_LOCATION_PERMISSION_REQUEST_CODE);
        }
    }
/*
    public boolean checkPermissionForWRITE_SMS(){
        int result = ContextCompat.checkSelfPermission(activity, WRITE_SMS);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForWRITE_SMS(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, WRITE_SMS)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},ACCESS_NETWORK_STATE_PERMISSION_REQUEST_CODE);
        }
    }
*/
   /* public boolean checkPermissionForRECEIVE_SMS(){
        int result = ContextCompat.checkSelfPermission(activity, RECEIVE_SMS);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForRECEIVE_SMS(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, RECEIVE_SMS)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},RECEIVE_SMS_PERMISSION_REQUEST_CODE);
        }
    }
    public boolean checkPermissionForSEND_SMS(){
        int result = ContextCompat.checkSelfPermission(activity, SEND_SMS);
        if (result == PackageManager.PERMISSION_GRANTED){
            return true;
        } else {
            return false;
        }
    }
    public void requestPermissionForSEND_SMS(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, SEND_SMS)){
            Toast.makeText(activity, "GPS permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{ACCESS_WIFI_STATE},SEND_SMS_PERMISSION_REQUEST_CODE);
        }
    }
    public void requestPermissionForCall(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, Manifest.permission.CALL_PHONE)) {
            Toast.makeText(activity, "Call permission needed. Please allow in App Settings for additional functionality.", Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.CALL_PHONE},CALL_REQUEST_PERMISSION_CODE);
        }

    }
    public boolean checkPermissionForCall() {
        int result = ContextCompat.checkSelfPermission(activity, Manifest.permission.CALL_PHONE);
        if (result == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }*/

}
