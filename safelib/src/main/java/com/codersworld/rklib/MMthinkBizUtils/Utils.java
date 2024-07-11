package com.codersworld.rklib.MMthinkBizUtils;


import android.content.res.Resources;

public final class Utils {
    private Utils() {
    }

    public static float dp2px(Resources resources, float dp) {
        float scale = resources.getDisplayMetrics().density;
        return dp * scale + 0.5F;
    }

    public static float sp2px(Resources resources, float sp) {
        float scale = resources.getDisplayMetrics().scaledDensity;
        return sp * scale;
    }
}
