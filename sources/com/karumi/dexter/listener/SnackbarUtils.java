package com.karumi.dexter.listener;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class SnackbarUtils {
    public static void show(View view, String str, int i2, String str2, View.OnClickListener onClickListener, BaseTransientBottomBar.BaseCallback<Snackbar> baseCallback) {
        Snackbar make = Snackbar.make(view, (CharSequence) str, i2);
        if (!(str2 == null || onClickListener == null)) {
            make.setAction((CharSequence) str2, onClickListener);
        }
        if (baseCallback != null) {
            make.addCallback(baseCallback);
        }
        make.show();
    }
}
