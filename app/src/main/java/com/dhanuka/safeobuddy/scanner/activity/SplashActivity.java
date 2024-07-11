package com.dhanuka.safeobuddy.scanner.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/*import com.codersworld.rklib.scanner.ScanActivity;
import com.codersworld.rklib.utils.AppUrls;
import com.codersworld.rklib.utils.CommonMethods;*/
import com.codersworld.rklib.utils.AppUrls;
import com.codersworld.rklib.utils.CommonMethods;
import com.dhanuka.safeobuddy.R;


public class SplashActivity extends AppCompatActivity {
TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        txtResult = findViewById(R.id.txtResult);
        //startActivityForResult(new Intent(this, ScanActivity.class).putExtra("open_scanner", true), 102);
         //CommonMethods.successToast(this, AppUrls.GET_UOM_ITEM);
    }

    public void onScan(View mView) {
        txtResult.setText("Result will be here...");
       // startActivityForResult(new Intent(this, ScanActivity.class).putExtra("open_scanner", true), 102);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String mResult="";
        if (requestCode == 102) {
            try {
                mResult = data.getStringExtra("result");
                Log.e("MRESULT", data.getStringExtra("result"));
                txtResult.setText("Result : "+data.getStringExtra("result"));
                //Toast.makeText(this, data.getStringExtra("result") + "", Toast.LENGTH_SHORT).show();
                Intent mIntent=new Intent();
                mIntent.putExtra("result",mResult);
                setResult(102,mIntent);
                finish();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
