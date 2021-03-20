package b.j.a.c.b0.a0;

import b.j.a.c.b0.r;
import b.j.a.c.b0.u;
import b.j.a.c.b0.x;
import b.j.a.c.b0.z.p;
import b.j.a.c.f;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.j0.a;
import b.j.a.c.k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class g<T> extends z<T> {

    /* renamed from: k  reason: collision with root package name */
    public final i f1668k;

    /* renamed from: l  reason: collision with root package name */
    public final r f1669l;

    /* renamed from: m  reason: collision with root package name */
    public final Boolean f1670m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1671n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(b.j.a.c.b0.a0.g<?> r1, b.j.a.c.b0.r r2, java.lang.Boolean r3) {
        /*
            r0 = this;
            b.j.a.c.i r1 = r1.f1668k
            r0.<init>((b.j.a.c.i) r1)
            r0.f1668k = r1
            r0.f1669l = r2
            r0.f1670m = r3
            boolean r1 = b.j.a.c.b0.z.p.a(r2)
            r0.f1671n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.g.<init>(b.j.a.c.b0.a0.g, b.j.a.c.b0.r, java.lang.Boolean):void");
    }

    public g(i iVar, r rVar, Boolean bool) {
        super(iVar);
        this.f1668k = iVar;
        this.f1670m = bool;
        this.f1669l = rVar;
        this.f1671n = p.a(rVar);
    }

    public i Z() {
        return this.f1668k;
    }

    public abstract j<Object> c0();

    public x d0() {
        return null;
    }

    public <BOGUS> BOGUS e0(Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        b.j.a.c.j0.g.C(th);
        if (!(th instanceof IOException) || (th instanceof k)) {
            if (str == null) {
                str = "N/A";
            }
            throw k.h(th, obj, str);
        }
        throw ((IOException) th);
    }

    public u g(String str) {
        j<Object> c0 = c0();
        if (c0 != null) {
            return c0.g(str);
        }
        throw new IllegalArgumentException(String.format("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, getClass().getName()}));
    }

    public a h() {
        return a.DYNAMIC;
    }

    public Object i(b.j.a.c.g gVar) {
        x d0 = d0();
        if (d0 == null || !d0.i()) {
            i Z = Z();
            gVar.l(Z, String.format("Cannot create empty instance of %s, no default Creator", new Object[]{Z}));
            throw null;
        }
        try {
            return d0.u(gVar);
        } catch (IOException e2) {
            b.j.a.c.j0.g.B(gVar, e2);
            throw null;
        }
    }

    public Boolean n(f fVar) {
        return Boolean.TRUE;
    }
}
