package com.onesignal.shortcutbadger.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import b.o.w4.a;
import java.util.Arrays;
import java.util.List;

public class HuaweiHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }

    @SuppressLint({"NewApi"})
    public void b(Context context, ComponentName componentName, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i2);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
