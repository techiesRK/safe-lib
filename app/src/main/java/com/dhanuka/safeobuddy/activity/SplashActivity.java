package com.dhanuka.safeobuddy.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.codersworld.rklib.scanner.ScanActivity;
import com.codersworld.rklib.utils.AppUrls;
import com.codersworld.rklib.utils.CommonMethods;
import com.dhanuka.safeobuddy.R;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        startActivityForResult(new Intent(this, ScanActivity.class).putExtra("open_scanner", true), 102);
        // CommonMethods.successToast(this, AppUrls.GET_UOM_ITEM);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 102) {
            try {
                Log.e("MRESULT",data.getStringExtra("result"));
                Toast.makeText(this, data.getStringExtra("result") + "", Toast.LENGTH_SHORT).show();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
