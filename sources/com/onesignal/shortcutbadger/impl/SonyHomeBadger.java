package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import b.o.w4.a;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements a {
    public final Uri a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b  reason: collision with root package name */
    public AsyncQueryHandler f7403b;

    public List<String> a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        boolean z = false;
        if (!(context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null)) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i2));
            if (i2 > 0) {
                z = true;
            }
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
            context.sendBroadcast(intent);
        } else if (i2 >= 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i2));
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f7403b == null) {
                    this.f7403b = new b.o.w4.d.a(this, context.getApplicationContext().getContentResolver());
                }
                this.f7403b.startInsert(0, (Object) null, this.a, contentValues);
                return;
            }
            context.getApplicationContext().getContentResolver().insert(this.a, contentValues);
        }
    }
}
