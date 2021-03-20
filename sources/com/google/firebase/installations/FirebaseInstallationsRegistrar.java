package com.google.firebase.installations;

import androidx.annotation.Keep;
import b.l.a.c.b.a;
import b.l.d.p.d;
import b.l.d.p.h;
import b.l.d.p.r;
import b.l.d.u.f;
import b.l.d.x.d;
import b.l.d.x.e;
import b.l.d.x.g;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements h {
    public static /* synthetic */ e lambda$getComponents$0(b.l.d.p.e eVar) {
        return new d((b.l.d.d) eVar.a(b.l.d.d.class), eVar.c(b.l.d.a0.h.class), eVar.c(f.class));
    }

    public List<b.l.d.p.d<?>> getComponents() {
        d.b<e> a = b.l.d.p.d.a(e.class);
        a.a(new r(b.l.d.d.class, 1, 0));
        a.a(new r(f.class, 0, 1));
        a.a(new r(b.l.d.a0.h.class, 0, 1));
        a.c(g.a);
        return Arrays.asList(new b.l.d.p.d[]{a.b(), a.I("fire-installations", "16.3.5")});
    }
}
