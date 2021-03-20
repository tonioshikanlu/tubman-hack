package com.karumi.dexter;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import java.util.Arrays;
import java.util.LinkedList;

public final class DexterActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback {
    private boolean isTargetSdkUnderAndroidM() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.targetSdkVersion < 23;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Dexter.onActivityReady(this);
        getWindow().addFlags(16);
    }

    public void onDestroy() {
        super.onDestroy();
        Dexter.onActivityDestroyed(this);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Dexter.onActivityReady(this);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        if (isTargetSdkUnderAndroidM()) {
            linkedList2.addAll(Arrays.asList(strArr));
        } else {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                String str = strArr[i3];
                int i4 = iArr[i3];
                if (i4 == -2 || i4 == -1) {
                    linkedList2.add(str);
                } else if (i4 == 0) {
                    linkedList.add(str);
                }
            }
        }
        Dexter.onPermissionsRequested(linkedList, linkedList2);
    }
}
