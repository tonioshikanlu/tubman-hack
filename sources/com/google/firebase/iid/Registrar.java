package com.google.firebase.iid;

import androidx.annotation.Keep;
import b.l.d.p.d;
import b.l.d.p.h;
import b.l.d.p.r;
import b.l.d.v.s;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements h {

    public static class a implements b.l.d.v.c.a {
        public a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Keep
    public final List<d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        d.b<FirebaseInstanceId> a2 = d.a(cls);
        a2.a(new r(b.l.d.d.class, 1, 0));
        a2.a(new r(b.l.d.t.d.class, 1, 0));
        a2.a(new r(b.l.d.a0.h.class, 1, 0));
        a2.c(s.a);
        a2.d(1);
        d<FirebaseInstanceId> b2 = a2.b();
        d.b<b.l.d.v.c.a> a3 = d.a(b.l.d.v.c.a.class);
        a3.a(new r(cls, 1, 0));
        a3.c(b.l.d.v.r.a);
        return Arrays.asList(new d[]{b2, a3.b(), b.l.a.c.b.a.I("fire-iid", "18.0.0")});
    }
}
