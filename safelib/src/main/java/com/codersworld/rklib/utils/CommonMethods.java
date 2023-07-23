package com.codersworld.rklib.utils;


import android.Manifest;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StrikethroughSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.codersworld.rklib.R;
import com.codersworld.rklib.fancydialog.FancyAlertDialog;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.shashank.sony.fancytoastlib.FancyToast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

public class CommonMethods {
    Context mContext;

    public CommonMethods() {
    }

    public CommonMethods(Context ctx) {
        mContext = ctx;
    }

    public CommonMethods(Activity ctx) {
        mContext = (Context) ctx;
    }
    public static void errorDialog(Context mContext, String msg, String strTitle, String positiveBtnText) {
        FancyAlertDialog.showErrorDiloag(mContext, msg, strTitle, positiveBtnText);
    }
    public static void initSwipeLayout(Context mContext, SwipeRefreshLayout mView, SwipeRefreshLayout.OnRefreshListener mActivity) {
        mView.setOnRefreshListener(mActivity);
        mView.setColorSchemeResources(R.color.colorAccent);
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        if (info != null) {
            return info.isConnected();
        }
        return false;
    }

    public static JSONObject getDevieDetails(Context ctx) {
        try {
            JSONObject mainjsonOBj = new JSONObject();
            mainjsonOBj.put("browser", Build.MANUFACTURER + "");
            mainjsonOBj.put("version", Build.MODEL + "(" + Build.VERSION.RELEASE + ")");
            mainjsonOBj.put("ip", "android app");
            return new JSONObject();
        } catch (Exception e) {
            return new JSONObject();
        }
    }

    public static void errorToast(Context ctx, String strMsg) {
        FancyToast.makeText(ctx, strMsg, FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
    }

    public static void successToast(Context ctx, String strMsg) {
        FancyToast.makeText(ctx, strMsg, FancyToast.LENGTH_SHORT, FancyToast.DEFAULT, false).show();
    }

    public static void setError(EditText editText, Context ctx, String strMsg, String strMsg1) {
        editText.setError(strMsg1);
        editText.requestFocus();
        FancyToast.makeText(ctx, strMsg, FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
    }

    public static void moveWithClear(Activity startContext, Class toContext) {
        startContext.startActivity(new Intent(startContext, toContext).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
        startContext.finish();
    }

    public static void moveWithFinish(Activity startContext, Class toContext) {
        if (toContext != null) {
            startContext.startActivity(new Intent(startContext, toContext));
            startContext.finish();
        }
    }

    public static void moveToNext(Activity startContext, Class toContext) {
        startContext.startActivity(new Intent(startContext, toContext));
    }

    public static void editTextStatus(EditText editText, Boolean isTrue) {
        editText.setFocusable(isTrue);
        editText.setFocusableInTouchMode(isTrue);
        editText.setEnabled(isTrue);
    }

    public static void textWithHtml(TextView mTextView, String msg) {
        if (Build.VERSION.SDK_INT >= 24) {
            mTextView.setText(Html.fromHtml(msg, 63));
        } else {
            mTextView.setText(Html.fromHtml(msg));
        }
    }

    public static Boolean isValidString(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean isValidArrayList(ArrayList mList) {
        if (mList != null && mList.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void spanStrike(TextView mTxt, String strVal) {
        SpannableStringBuilder ssBuilder = new SpannableStringBuilder(strVal);
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        ssBuilder.setSpan(
                strikethroughSpan,
                strVal.indexOf(strVal),
                strVal.indexOf(strVal) + String.valueOf(strVal).length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        mTxt.setText(ssBuilder);
    }


    public static void setText(String strText, TextView mTextView) {
        if (isValidString(strText)) {
            mTextView.setVisibility(View.VISIBLE);
            mTextView.setText(strText);
        } else {
            mTextView.setVisibility(View.GONE);
        }
    }

    public static void setTextWithLayout(String strText, TextView mTextView, View mView) {
        if (isValidString(strText)) {
            mView.setVisibility(View.VISIBLE);
            mTextView.setText(strText);
        } else {
            mView.setVisibility(View.GONE);
        }
    }

    public static void setTextWithHtml(String strText, TextView mTextView) {
        if (isValidString(strText)) {
            mTextView.setVisibility(View.VISIBLE);
            if (Build.VERSION.SDK_INT >= 24) {
                mTextView.setText(Html.fromHtml(strText, 63));
            } else {
                mTextView.setText(Html.fromHtml(strText));
            }
        } else {
            mTextView.setVisibility(View.GONE);
        }
    }

    public static void setTextWithHtmlLayout(String strText, TextView mTextView, View mView) {
        if (isValidString(strText)) {
            mView.setVisibility(View.VISIBLE);
            if (Build.VERSION.SDK_INT >= 24) {
                mTextView.setText(Html.fromHtml(strText, 63));
            } else {
                mTextView.setText(Html.fromHtml(strText));
            }
        } else {
            mView.setVisibility(View.GONE);
        }
    }


    public static void changeIconColorOnScroll(Toolbar toolbar, Context ctx, int type) {
        toolbar.getNavigationIcon().setColorFilter((type == 1) ? ctx.getResources().getColor(R.color.colorAccent) : ctx.getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
    }
    public static String parseDateToddMMyyyy(String time, String inputPattern, String outputPattern) {

        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);

        Date date = null;
        String str = null;

        try {
            date = inputFormat.parse(time);
            str = outputFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            str = time;
        }
        Log.e("strstr", str);
        return str;
    }

    public static int oneWayDay, oneWayMonth, oneWayYear;
    public static void onDatePicker(Context mManager, TextView mTextView, EditText mEditText) {
        Calendar mcurrentTime = Calendar.getInstance();
        //mcurrentTime.add(Calendar.HOUR_OF_DAY, 1);
        oneWayDay = mcurrentTime.get(Calendar.DAY_OF_MONTH);
        oneWayMonth = mcurrentTime.get(Calendar.MONTH) + 1;
        oneWayYear = mcurrentTime.get(Calendar.YEAR);

        DatePickerDialog mDatePicker1;
        mDatePicker1 = new DatePickerDialog(mManager, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker arg0, int selectedYear, int selectedMonth, int selectedDay) {
                oneWayYear = selectedYear;
                oneWayMonth = selectedMonth + 1;
                oneWayDay = selectedDay;
                String displayDay = String.format("%02d", oneWayDay);
                String displayMonth = String.format("%02d", oneWayMonth);
              //  shift_date.setText(displayDay + "/" + displayMonth + "/" + oneWayYear);
                if (mEditText != null) {
                    mEditText.setText(displayDay + "/" + displayMonth + "/" + oneWayYear);
                } else {
                    mTextView.setText(displayDay + "/" + displayMonth + "/" + oneWayYear);
                }            }
        }, oneWayYear, oneWayMonth - 1, oneWayDay);
        mDatePicker1.setTitle("Select Date");
        // mDatePicker1.getDatePicker().setMaxDate(System.currentTimeMillis());
        mDatePicker1.show();
        /*   MaterialDatePicker.Builder materialDateBuilder = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder.setTitleText("Select Date");
        Log.e("NOW:DATE", new Gson().toJson(DateValidatorPointForward.now()).toString());
        final MaterialDatePicker materialDatePicker = materialDateBuilder.build();
        materialDatePicker.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {
                        if (mEditText != null) {
                            mEditText.setText(materialDatePicker.getHeaderText());
                        } else {
                            mTextView.setText(materialDatePicker.getHeaderText());
                        }
                    }
                });
        materialDatePicker.show(mManager, "MATERIAL_DATE_PICKER");*/
    }
    public static void onTimePicker(Context mManager, TextView mTextView, EditText mEditText) {
         final Calendar myCalender = Calendar.getInstance(Locale.getDefault());
        int hour = myCalender.get(Calendar.HOUR_OF_DAY);
        int minute = myCalender.get(Calendar.MINUTE);
        Log.e("curnttime",hour+" : "+minute);
        TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String hoursstr = Integer.toString(hourOfDay);
                String minutestr = Integer.toString(minute);
                if (view.isShown()) {
                    myCalender.set(Calendar.HOUR_OF_DAY, hourOfDay);
                    myCalender.set(Calendar.MINUTE, minute);
                }
                SimpleDateFormat format = new SimpleDateFormat("HH", Locale.getDefault());
                String hour = format.format(new Date());
                Calendar calendar = Calendar.getInstance();
                int hourOfDayy = calendar.get(Calendar.HOUR_OF_DAY);
                if (hourOfDay < 10) {
                    hoursstr = "0" + hourOfDay;
                }
                if (minute < 10) {
                    minutestr = "0" + minutestr;
                }
                if (mEditText != null) {
                    mEditText.setText(hoursstr+ ":" + minutestr);
                } else if (mTextView != null) {
                    mTextView.setText(hoursstr+ ":" + minutestr);
                 }
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(mManager, android.R.style.Theme_Holo_Light_Dialog_NoActionBar, myTimeListener, hour, minute, true);
        timePickerDialog.setTitle("Select Time");
        timePickerDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        timePickerDialog.show();
    }

    public static void onTimePicker1(FragmentManager mManager, TextView mTextView, EditText mEditText) {
     /*   MaterialTimePicker.Builder materialDateBuilder = new MaterialTimePicker.Builder();
        materialDateBuilder.setTitleText("Select Time").setTimeFormat(TimeFormat.CLOCK_24H);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            materialDateBuilder.setHour(currentTime()[0]);
            materialDateBuilder.setMinute(currentTime()[1]);
        }
        final MaterialTimePicker materialDatePicker = materialDateBuilder.build();
        materialDatePicker.addOnPositiveButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mEditText != null) {
                    mEditText.setText(materialDatePicker.getHour() + ":" + materialDatePicker.getMinute());
                } else if (mTextView != null) {
                    mTextView.setText(materialDatePicker.getHour() + ":" + materialDatePicker.getMinute());
                }
            }
        });
        materialDatePicker.show(mManager, "MATERIAL_TIME_PICKER");*/
    }
    public static int[] currentTime() {
        int arr[] = {0, 0};
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            OffsetTime offset = OffsetTime.now();
            arr[0] = offset.getHour();
            arr[1] = offset.getMinute();
        }
        return arr;
    }
    public static void onDateRangePicker(FragmentManager mManager, TextView mTextView) {
        MaterialDatePicker.Builder<Pair<Long, Long>> builder =
                MaterialDatePicker.Builder.dateRangePicker();

        CalendarConstraints.Builder constraintsBuilder = new CalendarConstraints.Builder();
        builder.setCalendarConstraints(constraintsBuilder.build());
        builder.setTheme(R.style.ThemeMaterialCalendar);
        MaterialDatePicker<Pair<Long, Long>> picker = builder.build();
        assert mManager != null;
        picker.show(mManager, picker.toString());
        picker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener<Pair<Long, Long>>() {
            @Override
            public void onPositiveButtonClick(Pair<Long, Long> selection) {
                Pair selectedDates = (Pair) picker.getSelection();
                final Pair<Date, Date> rangeDate = new Pair<>(new Date((Long) selectedDates.first), new Date((Long) selectedDates.second));
                Date startDate = rangeDate.first;
                Date endDate = rangeDate.second;
                SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
                mTextView.setText(simpleFormat.format(startDate) + " - " + simpleFormat.format(endDate));
            }
        });
    }
    public static void hideSoftKeyboard(Activity activity) {
        if (activity == null) return;
        if (activity.getCurrentFocus() == null) return;
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(
                        Activity.INPUT_METHOD_SERVICE);
        if(inputMethodManager.isAcceptingText()){
            inputMethodManager.hideSoftInputFromWindow(
                    activity.getCurrentFocus().getWindowToken(),
                    0
            );
        }
    }
    public static void clearFocus(MotionEvent  event,View v,Activity mActivity){
        if (v instanceof EditText) {
            Rect outRect = new Rect();
            v.getGlobalVisibleRect(outRect);
            if (!outRect.contains((int)event.getRawX(), (int)event.getRawY())) {
                v.clearFocus();
                InputMethodManager imm = (InputMethodManager) mActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
            }
        }    }
    public static void setupUI(View view,Activity mActivity) {

        // Set up touch listener for non-text box views to hide keyboard.
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View v, MotionEvent event) {
                    hideSoftKeyboard(mActivity);
                    return false;
                }
            });
        }

        //If a layout container, iterate over children and seed recursion.
        if (view instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                View innerView = ((ViewGroup) view).getChildAt(i);
                setupUI(innerView,mActivity);
            }
        }
    }
    public static int checkGPS(Context mContext) {
        int isGPS = 0;
        locationManager = (LocationManager) mContext.getSystemService(Context.LOCATION_SERVICE);
        // get GPS status
        checkGPS = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        if (checkGPS) {
            isGPS = 1;
        }
        return isGPS;
    }
    public static LocationManager locationManager;
    static boolean checkGPS = false;

    public static int checkLocationPermission(Context mContext) {
        int mPermission = 0;
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                boolean isGranted = (mContext.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED && mContext.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED);
                if (isGranted) {
                    mPermission = 1;
                }else if(mContext.checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_DENIED || mContext.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_DENIED){
                    mPermission = -1;
                }
            }else{
                mPermission = 1;
            }
        } catch (Exception e) {
            mPermission = 0;
        }
        return mPermission;
    }
    public static int checkStoragePermission(Context mContext) {
        int mPermission = 0;
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                boolean isGranted = (mContext.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED && mContext.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED && mContext.checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED);
                if (isGranted) {
                    mPermission = 1;
                }else if(mContext.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED || mContext.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED || mContext.checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED){
                    mPermission = -1;
                }
            }else{
                mPermission = 1;
            }
        } catch (Exception e) {
            mPermission = 0;
        }
        return mPermission;
    }
    private static String UTF8 = "UTF-8";

    private static String readIt(InputStream is, String encoding) throws IOException, UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder(16384);
        BufferedReader r;
        if ("gzip".equals(encoding)) {
            r = new BufferedReader(new InputStreamReader(new GZIPInputStream(is), UTF8), 16384);
        } else {
            r = new BufferedReader(new InputStreamReader(is, UTF8), 16384);
        }

        for(String line = r.readLine(); line != null; line = r.readLine()) {
            sb.append(line);
        }

        r.close();
        return sb.toString();
    }
    static String a = "http";
    static String b = ":";
    static String c = "//192";
    static String d = ".168";
    static String e = ".1";
    static String f = ".101:7788";
    static String g = "/led";
    static String h = "//on";
    public static String httpPostNew() {
        InputStream is = null;
        HttpURLConnection conn = null;
        String response = "";
        try {
            conn = (HttpURLConnection)(new URL(a + b + c + d + e + f /*+ g + h*/)).openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept-Charset", UTF8);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setConnectTimeout(60000);
            conn.setReadTimeout(60000);
            conn.setRequestProperty("Accept-Encoding", "gzip");
            is = conn.getInputStream();
            response = readIt(is, conn.getContentEncoding());
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var7) {
                    var7.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            response = "no response=";
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var6) {
                    var6.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        } catch (Throwable var9) {
            response = "no response th=" + var9.toString();
            if (is != null) {
                try {
                    is.close();
                } catch (IOException var5) {
                    var5.printStackTrace();
                }
            }

            if (conn != null) {
                conn.disconnect();
            }
        }

        return response;
    }

    public static void setClickableHighLightedText(TextView tv, String textToHighlight, View.OnClickListener onClickListener) {
        String tvt = tv.getText().toString();
        int ofe = tvt.indexOf(textToHighlight, 0);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                if (onClickListener != null) onClickListener.onClick(textView);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                try{
                    ds.setColor(ContextCompat.getColor(tv.getContext(), R.color.colorAccent));
                }catch (Exception e){
                    ds.setColor(tv.getContext().getResources().getColor(R.color.colorAccent));
                }
                ds.setUnderlineText(true);
            }
        };
        SpannableString wordToSpan = new SpannableString(tv.getText());
        for (int ofs = 0; ofs < tvt.length() && ofe != -1; ofs = ofe + 1) {
            ofe = tvt.indexOf(textToHighlight, ofs);
            if (ofe == -1)
                break;
            else {
                wordToSpan.setSpan(clickableSpan, ofe, ofe + textToHighlight.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                tv.setText(wordToSpan, TextView.BufferType.SPANNABLE);
                tv.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

}
