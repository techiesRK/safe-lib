package com.dhanuka.safeobuddy.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.codersworld.rklib.utils.AppUrls;
import com.codersworld.rklib.utils.CommonMethods;
import com.dhanuka.safeobuddy.R;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        CommonMethods.successToast(this, AppUrls.GET_UOM_ITEM);
    }
}
