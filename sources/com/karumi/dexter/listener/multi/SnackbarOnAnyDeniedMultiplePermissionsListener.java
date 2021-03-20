package com.karumi.dexter.listener.multi;

import android.view.View;
import androidx.annotation.StringRes;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.listener.SettingsClickListener;
import com.karumi.dexter.listener.SnackbarUtils;

public class SnackbarOnAnyDeniedMultiplePermissionsListener extends BaseMultiplePermissionsListener {
    private final String buttonText;
    private final int duration;
    private final View.OnClickListener onButtonClickListener;
    private final Snackbar.Callback snackbarCallback;
    private final String text;
    private final View view;

    public static class Builder {
        private String buttonText;
        private int duration = 0;
        private View.OnClickListener onClickListener;
        private Snackbar.Callback snackbarCallback;
        private final String text;
        private final View view;

        private Builder(View view2, String str) {
            this.view = view2;
            this.text = str;
        }

        public static Builder with(View view2, @StringRes int i2) {
            return with(view2, view2.getContext().getString(i2));
        }

        public static Builder with(View view2, String str) {
            return new Builder(view2, str);
        }

        public SnackbarOnAnyDeniedMultiplePermissionsListener build() {
            return new SnackbarOnAnyDeniedMultiplePermissionsListener(this.view, this.text, this.buttonText, this.onClickListener, this.snackbarCallback, this.duration);
        }

        public Builder withButton(@StringRes int i2, View.OnClickListener onClickListener2) {
            return withButton(this.view.getContext().getString(i2), onClickListener2);
        }

        public Builder withButton(String str, View.OnClickListener onClickListener2) {
            this.buttonText = str;
            this.onClickListener = onClickListener2;
            return this;
        }

        public Builder withCallback(Snackbar.Callback callback) {
            this.snackbarCallback = callback;
            return this;
        }

        public Builder withDuration(int i2) {
            this.duration = i2;
            return this;
        }

        public Builder withOpenSettingsButton(@StringRes int i2) {
            return withOpenSettingsButton(this.view.getContext().getString(i2));
        }

        public Builder withOpenSettingsButton(String str) {
            this.buttonText = str;
            this.onClickListener = new SettingsClickListener();
            return this;
        }
    }

    private SnackbarOnAnyDeniedMultiplePermissionsListener(View view2, String str, String str2, View.OnClickListener onClickListener, Snackbar.Callback callback, int i2) {
        this.view = view2;
        this.text = str;
        this.buttonText = str2;
        this.onButtonClickListener = onClickListener;
        this.snackbarCallback = callback;
        this.duration = i2;
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        super.onPermissionsChecked(multiplePermissionsReport);
        if (!multiplePermissionsReport.areAllPermissionsGranted()) {
            SnackbarUtils.show(this.view, this.text, this.duration, this.buttonText, this.onButtonClickListener, this.snackbarCallback);
        }
    }
}
