package com.karumi.dexter;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.PermissionChecker;

public class AndroidPermissionService {
    public int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        return PermissionChecker.checkSelfPermission(context, str);
    }

    public boolean isPermissionPermanentlyDenied(@Nullable Activity activity, @NonNull String str) {
        return !shouldShowRequestPermissionRationale(activity, str);
    }

    public void requestPermissions(@Nullable Activity activity, @NonNull String[] strArr, int i2) {
        if (activity != null) {
            ActivityCompat.requestPermissions(activity, strArr, i2);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@Nullable Activity activity, @NonNull String str) {
        if (activity == null) {
            return false;
        }
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
    }
}
