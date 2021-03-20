package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import b.l.d.n.a.a;
import b.l.d.p.d;
import b.l.d.p.h;
import b.l.d.p.r;
import java.util.Arrays;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements h {
    public static final /* synthetic */ int zza = 0;

    @RecentlyNonNull
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<d<?>> getComponents() {
        d.b<a> a = d.a(a.class);
        a.a(new r(b.l.d.d.class, 1, 0));
        a.a(new r(Context.class, 1, 0));
        a.a(new r(b.l.d.t.d.class, 1, 0));
        a.c(b.l.d.n.a.c.a.a);
        a.d(2);
        return Arrays.asList(new d[]{a.b(), b.l.a.c.b.a.I("fire-analytics", "18.0.2")});
    }
}
