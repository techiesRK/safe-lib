package com.codersworld.rklib.customFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatTextView;


public class SBTextViewRegular extends AppCompatTextView {
    Context ctx;

    public SBTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.ctx = context;
            setTypeface(Typeface.createFromAsset(context.getAssets(), "nunito_regular.ttf"));
    }
}
