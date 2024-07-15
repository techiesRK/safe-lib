package com.codersworld.rklib.customFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class SBTextViewBold extends AppCompatTextView {
    public SBTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
            setTypeface(Typeface.createFromAsset(context.getAssets(), "nunito_bold.ttf"));
    }
}
