package b.l.a.c.f.e;

import java.security.GeneralSecurityException;

public final class d5 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2906b;
    public d7 c;
    public f6 d;

    /* renamed from: e  reason: collision with root package name */
    public int f2907e;
    public o7 f;

    public d5(l9 l9Var) {
        String s = l9Var.s();
        this.a = s;
        if (s.equals(c3.f2876b)) {
            try {
                g7 t = g7.t(l9Var.t(), fn.a());
                this.c = (d7) a3.d(l9Var);
                this.f2906b = t.s();
            } catch (l e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (s.equals(c3.a)) {
            try {
                i6 u = i6.u(l9Var.t(), fn.a());
                this.d = (f6) a3.d(l9Var);
                this.f2907e = u.s().t();
                this.f2906b = this.f2907e + u.t().t();
            } catch (l e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else if (s.equals(o4.a)) {
            try {
                q7 t2 = q7.t(l9Var.t(), fn.a());
                this.f = (o7) a3.d(l9Var);
                this.f2906b = t2.s();
            } catch (l e4) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e4);
            }
        } else {
            String valueOf = String.valueOf(s);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }
}
