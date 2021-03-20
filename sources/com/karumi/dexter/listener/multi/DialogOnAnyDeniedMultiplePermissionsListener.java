package com.karumi.dexter.listener.multi;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.listener.OnDialogButtonClickListener;

public class DialogOnAnyDeniedMultiplePermissionsListener extends BaseMultiplePermissionsListener {
    private final Context context;
    private final Drawable icon;
    private final String message;
    /* access modifiers changed from: private */
    public final OnDialogButtonClickListener onDialogButtonClickListener;
    private final String positiveButtonText;
    private final String title;

    public static class Builder {
        private String buttonText;
        private final Context context;
        private Drawable icon;
        private String message;
        private OnDialogButtonClickListener onDialogButtonClickListener;
        private String title;

        private Builder(Context context2) {
            this.context = context2;
        }

        public static Builder withContext(Context context2) {
            return new Builder(context2);
        }

        public DialogOnAnyDeniedMultiplePermissionsListener build() {
            String str = this.title;
            String str2 = str == null ? "" : str;
            String str3 = this.message;
            String str4 = str3 == null ? "" : str3;
            String str5 = this.buttonText;
            String str6 = str5 == null ? "" : str5;
            OnDialogButtonClickListener onDialogButtonClickListener2 = this.onDialogButtonClickListener;
            if (onDialogButtonClickListener2 == null) {
                onDialogButtonClickListener2 = new OnDialogButtonClickListener() {
                    public void onClick() {
                    }
                };
            }
            return new DialogOnAnyDeniedMultiplePermissionsListener(this.context, str2, str4, str6, this.icon, onDialogButtonClickListener2);
        }

        public Builder withButtonText(@StringRes int i2) {
            this.buttonText = this.context.getString(i2);
            return this;
        }

        public Builder withButtonText(@StringRes int i2, OnDialogButtonClickListener onDialogButtonClickListener2) {
            this.buttonText = this.context.getString(i2);
            this.onDialogButtonClickListener = onDialogButtonClickListener2;
            return this;
        }

        public Builder withButtonText(String str) {
            this.buttonText = str;
            return this;
        }

        public Builder withButtonText(String str, OnDialogButtonClickListener onDialogButtonClickListener2) {
            this.buttonText = str;
            this.onDialogButtonClickListener = onDialogButtonClickListener2;
            return this;
        }

        public Builder withIcon(@DrawableRes int i2) {
            this.icon = this.context.getResources().getDrawable(i2);
            return this;
        }

        public Builder withIcon(Drawable drawable) {
            this.icon = drawable;
            return this;
        }

        public Builder withMessage(@StringRes int i2) {
            this.message = this.context.getString(i2);
            return this;
        }

        public Builder withMessage(String str) {
            this.message = str;
            return this;
        }

        public Builder withTitle(@StringRes int i2) {
            this.title = this.context.getString(i2);
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }
    }

    private DialogOnAnyDeniedMultiplePermissionsListener(Context context2, String str, String str2, String str3, Drawable drawable, OnDialogButtonClickListener onDialogButtonClickListener2) {
        this.context = context2;
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.icon = drawable;
        this.onDialogButtonClickListener = onDialogButtonClickListener2;
    }

    private void showDialog() {
        new AlertDialog.Builder(this.context).setTitle(this.title).setMessage(this.message).setPositiveButton(this.positiveButtonText, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
                DialogOnAnyDeniedMultiplePermissionsListener.this.onDialogButtonClickListener.onClick();
            }
        }).setIcon(this.icon).show();
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        super.onPermissionsChecked(multiplePermissionsReport);
        if (!multiplePermissionsReport.areAllPermissionsGranted()) {
            showDialog();
        }
    }
}
