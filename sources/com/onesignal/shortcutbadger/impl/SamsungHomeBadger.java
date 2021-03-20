package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import b.l.f.x.a.g;
import b.o.w4.a;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f7402b = {"_id", "class"};
    public DefaultBadger a = new DefaultBadger();

    public List<String> a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        if (this.a == null || !g.g(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f7402b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        contentResolver.update(parse, c(componentName, i2, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, c(componentName, i2, true));
                    }
                }
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        } else {
            this.a.b(context, componentName, i2);
        }
    }

    public final ContentValues c(ComponentName componentName, int i2, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i2));
        return contentValues;
    }
}
