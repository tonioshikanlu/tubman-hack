package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import androidx.annotation.NonNull;

public class LPaint extends Paint {
    public LPaint() {
    }

    public LPaint(int i2) {
        super(i2);
    }

    public LPaint(int i2, PorterDuff.Mode mode) {
        super(i2);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public LPaint(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public void setTextLocales(@NonNull LocaleList localeList) {
    }
}
