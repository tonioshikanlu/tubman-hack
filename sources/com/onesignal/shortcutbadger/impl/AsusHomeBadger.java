package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b.l.f.x.a.g;
import b.o.w4.a;
import b.o.w4.b;
import java.util.Arrays;
import java.util.List;

public class AsusHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.asus.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i2);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        if (g.g(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder y = b.e.a.a.a.y("unable to resolve intent: ");
        y.append(intent.toString());
        throw new b(y.toString());
    }
}
