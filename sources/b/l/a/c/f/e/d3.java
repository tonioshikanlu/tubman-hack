package b.l.a.c.f.e;

@Deprecated
public final class d3 {
    public static final l9 a = a(16);

    /* renamed from: b  reason: collision with root package name */
    public static final l9 f2905b;

    static {
        a(32);
        b(16, 16);
        b(32, 16);
        t8 t8Var = t8.SHA256;
        f2905b = c(16, 16, 32, 16, t8Var);
        c(32, 16, 32, 32, t8Var);
        k9 v = l9.v();
        new y3();
        v.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        ia iaVar = ia.TINK;
        v.h(iaVar);
        l9 l9Var = (l9) v.c();
        k9 v2 = l9.v();
        new i4();
        v2.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        v2.h(iaVar);
        l9 l9Var2 = (l9) v2.c();
    }

    public static l9 a(int i2) {
        f7 u = g7.u();
        if (u.f3216j) {
            u.a();
            u.f3216j = false;
        }
        ((g7) u.f3215i).zzb = i2;
        k9 v = l9.v();
        v.g(((g7) u.c()).n());
        new s3();
        v.f("type.googleapis.com/google.crypto.tink.AesGcmKey");
        v.h(ia.TINK);
        return (l9) v.c();
    }

    public static l9 b(int i2, int i3) {
        w6 v = x6.v();
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        ((x6) v.f3215i).zze = i2;
        z6 t = a7.t();
        if (t.f3216j) {
            t.a();
            t.f3216j = false;
        }
        ((a7) t.f3215i).zzb = 16;
        a7 a7Var = (a7) t.c();
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        x6.x((x6) v.f3215i, a7Var);
        k9 v2 = l9.v();
        v2.g(((x6) v.c()).n());
        new p3();
        v2.f("type.googleapis.com/google.crypto.tink.AesEaxKey");
        v2.h(ia.TINK);
        return (l9) v2.c();
    }

    public static l9 c(int i2, int i3, int i4, int i5, t8 t8Var) {
        n6 v = o6.v();
        q6 t = r6.t();
        if (t.f3216j) {
            t.a();
            t.f3216j = false;
        }
        ((r6) t.f3215i).zzb = 16;
        r6 r6Var = (r6) t.c();
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        o6.y((o6) v.f3215i, r6Var);
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        ((o6) v.f3215i).zze = i2;
        o6 o6Var = (o6) v.c();
        y8 v2 = z8.v();
        b9 u = c9.u();
        if (u.f3216j) {
            u.a();
            u.f3216j = false;
        }
        ((c9) u.f3215i).zzb = t8Var.a();
        if (u.f3216j) {
            u.a();
            u.f3216j = false;
        }
        ((c9) u.f3215i).zze = i5;
        c9 c9Var = (c9) u.c();
        if (v2.f3216j) {
            v2.a();
            v2.f3216j = false;
        }
        z8.y((z8) v2.f3215i, c9Var);
        if (v2.f3216j) {
            v2.a();
            v2.f3216j = false;
        }
        ((z8) v2.f3215i).zze = 32;
        z8 z8Var = (z8) v2.c();
        h6 v3 = i6.v();
        if (v3.f3216j) {
            v3.a();
            v3.f3216j = false;
        }
        i6.x((i6) v3.f3215i, o6Var);
        if (v3.f3216j) {
            v3.a();
            v3.f3216j = false;
        }
        i6.y((i6) v3.f3215i, z8Var);
        k9 v4 = l9.v();
        v4.g(((i6) v3.c()).n());
        new i3();
        v4.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        v4.h(ia.TINK);
        return (l9) v4.c();
    }
}
