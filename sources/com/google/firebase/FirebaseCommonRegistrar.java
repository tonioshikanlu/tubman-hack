package com.google.firebase;

import android.content.Context;
import android.os.Build;
import b.l.a.c.b.a;
import b.l.d.a0.b;
import b.l.d.a0.e;
import b.l.d.g;
import b.l.d.p.d;
import b.l.d.p.h;
import b.l.d.p.r;
import b.l.d.u.f;
import java.util.ArrayList;
import java.util.List;

public class FirebaseCommonRegistrar implements h {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<d<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        d.b<b.l.d.a0.h> a = d.a(b.l.d.a0.h.class);
        a.a(new r(e.class, 2, 0));
        a.c(b.a);
        arrayList.add(a.b());
        int i2 = b.l.d.u.d.f5294b;
        d.b<f> a2 = d.a(f.class);
        a2.a(new r(Context.class, 1, 0));
        a2.a(new r(b.l.d.u.e.class, 2, 0));
        a2.c(b.l.d.u.b.a);
        arrayList.add(a2.b());
        arrayList.add(a.I("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(a.I("fire-core", "19.5.0"));
        arrayList.add(a.I("device-name", a(Build.PRODUCT)));
        arrayList.add(a.I("device-model", a(Build.DEVICE)));
        arrayList.add(a.I("device-brand", a(Build.BRAND)));
        arrayList.add(a.Y("android-target-sdk", b.l.d.e.a));
        arrayList.add(a.Y("android-min-sdk", b.l.d.f.a));
        arrayList.add(a.Y("android-platform", g.a));
        arrayList.add(a.Y("android-installer", b.l.d.h.a));
        try {
            str = e.e.f7897l.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(a.I("kotlin", str));
        }
        return arrayList;
    }
}
