package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b.l.f.x.a.g;
import b.o.w4.a;
import b.o.w4.b;
import java.util.Arrays;
import java.util.List;

public class NewHtcHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i2);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i2);
        if (g.g(context, intent) || g.g(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
            return;
        }
        StringBuilder y = b.e.a.a.a.y("unable to resolve intent: ");
        y.append(intent2.toString());
        throw new b(y.toString());
    }
}
