package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

public class MaxInputValidator implements InputFilter {
    private int max;

    public MaxInputValidator(int i2) {
        this.max = i2;
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i4, i5, charSequence.subSequence(i2, i3).toString());
            if (Integer.parseInt(sb.toString()) <= this.max) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.max;
    }

    public void setMax(int i2) {
        this.max = i2;
    }
}
