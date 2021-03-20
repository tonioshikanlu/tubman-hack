package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import b.o.w4.a;
import java.util.Arrays;
import java.util.List;

public class NovaHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag", componentName.getPackageName() + "/" + componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i2));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }
}
