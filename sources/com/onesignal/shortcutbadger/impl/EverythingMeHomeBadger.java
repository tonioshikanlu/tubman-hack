package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import b.o.w4.a;
import java.util.Arrays;
import java.util.List;

public class EverythingMeHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"me.everything.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i2));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
