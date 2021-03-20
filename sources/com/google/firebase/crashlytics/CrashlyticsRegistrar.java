package com.google.firebase.crashlytics;

import b.l.d.n.a.a;
import b.l.d.p.d;
import b.l.d.p.h;
import b.l.d.p.r;
import b.l.d.q.b;
import b.l.d.q.e;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements h {
    public List<d<?>> getComponents() {
        d.b<e> a = d.a(e.class);
        a.a(new r(b.l.d.d.class, 1, 0));
        a.a(new r(b.l.d.x.e.class, 1, 0));
        a.a(new r(a.class, 0, 0));
        a.a(new r(b.l.d.q.f.a.class, 0, 0));
        a.c(new b(this));
        a.d(2);
        return Arrays.asList(new d[]{a.b(), b.l.a.c.b.a.I("fire-cls", "17.3.1")});
    }
}
