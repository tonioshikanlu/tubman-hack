package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b.o.w4.a;
import java.util.Arrays;
import java.util.List;

public class VivoHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i2);
        context.sendBroadcast(intent);
    }
}
