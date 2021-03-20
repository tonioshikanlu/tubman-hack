package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b.l.f.x.a.g;
import b.o.w4.a;
import b.o.w4.b;
import java.util.ArrayList;
import java.util.List;

public class DefaultBadger implements a {
    public List<String> a() {
        return new ArrayList(0);
    }

    public void b(Context context, ComponentName componentName, int i2) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i2);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (g.g(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder y = b.e.a.a.a.y("unable to resolve intent: ");
        y.append(intent.toString());
        throw new b(y.toString());
    }
}
