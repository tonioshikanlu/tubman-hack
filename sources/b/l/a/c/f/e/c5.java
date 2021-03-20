package b.l.a.c.f.e;

@Deprecated
public final class c5 {
    public static final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final l9 f2878b;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        p8 p8Var = p8.NIST_P256;
        t8 t8Var = t8.SHA256;
        w7 w7Var = w7.UNCOMPRESSED;
        l9 l9Var = d3.a;
        ia iaVar = ia.TINK;
        t8 t8Var2 = t8Var;
        l9 l9Var2 = l9Var;
        byte[] bArr2 = bArr;
        f2878b = a(p8Var, t8Var2, w7Var, l9Var2, iaVar, bArr2);
        p8 p8Var2 = p8Var;
        a(p8Var2, t8Var2, w7.COMPRESSED, l9Var2, ia.RAW, bArr2);
        a(p8Var2, t8Var2, w7Var, d3.f2905b, iaVar, bArr2);
    }

    public static l9 a(p8 p8Var, t8 t8Var, w7 w7Var, l9 l9Var, ia iaVar, byte[] bArr) {
        b8 u = c8.u();
        n8 v = o8.v();
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        o8.y((o8) v.f3215i, p8Var);
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        ((o8) v.f3215i).zze = t8Var.a();
        um J = um.J(bArr, 0, bArr.length);
        if (v.f3216j) {
            v.a();
            v.f3216j = false;
        }
        ((o8) v.f3215i).zzf = J;
        o8 o8Var = (o8) v.c();
        y7 t = z7.t();
        if (t.f3216j) {
            t.a();
            t.f3216j = false;
        }
        z7.w((z7) t.f3215i, l9Var);
        z7 z7Var = (z7) t.c();
        e8 v2 = f8.v();
        if (v2.f3216j) {
            v2.a();
            v2.f3216j = false;
        }
        f8.y((f8) v2.f3215i, o8Var);
        if (v2.f3216j) {
            v2.a();
            v2.f3216j = false;
        }
        f8.z((f8) v2.f3215i, z7Var);
        if (v2.f3216j) {
            v2.a();
            v2.f3216j = false;
        }
        f8.A((f8) v2.f3215i, w7Var);
        f8 f8Var = (f8) v2.c();
        if (u.f3216j) {
            u.a();
            u.f3216j = false;
        }
        c8.w((c8) u.f3215i, f8Var);
        k9 v3 = l9.v();
        new u4();
        v3.f("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        v3.h(iaVar);
        v3.g(((c8) u.c()).n());
        return (l9) v3.c();
    }
}
