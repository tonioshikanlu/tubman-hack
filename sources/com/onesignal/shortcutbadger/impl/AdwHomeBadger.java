package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b.l.f.x.a.g;
import b.o.w4.a;
import b.o.w4.b;
import java.util.Arrays;
import java.util.List;

public class AdwHomeBadger implements a {
    public List<String> a() {
        return Arrays.asList(new String[]{"org.adw.launcher", "org.adwfreak.launcher"});
    }

    public void b(Context context, ComponentName componentName, int i2) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i2);
        if (g.g(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder y = b.e.a.a.a.y("unable to resolve intent: ");
        y.append(intent.toString());
        throw new b(y.toString());
    }
}
