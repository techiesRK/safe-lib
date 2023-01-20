package com.codersworld.rklib.scanner

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import com.codersworld.rklib.R
import com.google.android.material.snackbar.Snackbar
/*import com.google.gson.Gson
import io.github.g00fy2.quickie.ScanCustomCode
import io.github.g00fy2.quickie.ScanQRCode
import io.github.g00fy2.quickie.config.BarcodeFormat
import io.github.g00fy2.quickie.QRResult
import io.github.g00fy2.quickie.config.ScannerConfig

import io.github.g00fy2.quickie.QRResult.QRError
import io.github.g00fy2.quickie.QRResult.QRMissingPermission
import io.github.g00fy2.quickie.QRResult.QRSuccess
import io.github.g00fy2.quickie.QRResult.QRUserCanceled*/

class ScanActivity : AppCompatActivity() {


/*
    private var selectedBarcodeFormat = BarcodeFormat.FORMAT_ALL_FORMATS
    lateinit var qr_scanner_button: Button
    private val scanQrCode = registerForActivityResult(ScanQRCode(), ::showSnackbar)

*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_scan)
        // qr_scanner_button = findViewById(R.id.qr_scanner_button)
        /* qr_scanner_button.setOnClickListener {
             scanQrCode.launch(null)
         }*/
    //    if (intent.extras?.getBoolean("open_scanner") == true) scanQrCode.launch(null)
    }

/*
    private fun showSnackbar(result: QRResult) {
        try {
            Log.e("resultresult", Gson().toJson(result))
        } catch (ex: java.lang.Exception) {
            ex.printStackTrace()
            Log.e("resultqwe", result.toString())
        }
        var text = when (result) {
            is QRSuccess -> result.content.rawValue
            QRUserCanceled -> "User canceled"
            QRMissingPermission -> "Missing permission"
            is QRError -> "${result.exception.javaClass.simpleName}: ${result.exception.localizedMessage}"
        }
        if(text.equals("User canceled",true) || text.equals("Missing permission",true) ){
            text="";
        }
        Log.e("mIntent", text.toString())
        var mIntent: Intent = Intent();
        setResult(102, mIntent.putExtra("result", text))
        finish()
        //Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }

*/
    companion object {
        const val OPEN_SCANNER = "open_scanner"
    }

}