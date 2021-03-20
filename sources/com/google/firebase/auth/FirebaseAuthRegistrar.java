package com.google.firebase.auth;

import androidx.annotation.Keep;
import b.l.a.c.b.a;
import b.l.d.o.e0.b;
import b.l.d.o.w0;
import b.l.d.p.d;
import b.l.d.p.h;
import b.l.d.p.r;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseAuthRegistrar implements h {
    public static final /* synthetic */ int zza = 0;

    @Keep
    public List<d<?>> getComponents() {
        d.b bVar = new d.b(FirebaseAuth.class, new Class[]{b.class}, (d.a) null);
        bVar.a(new r(b.l.d.d.class, 1, 0));
        bVar.c(w0.a);
        bVar.d(2);
        return Arrays.asList(new d[]{bVar.b(), a.I("fire-auth", "20.0.2")});
    }
}
