package b.j.a.c.b0.a0;

import b.j.a.c.b0.i;
import b.j.a.c.b0.u;
import b.j.a.c.b0.x;
import b.j.a.c.b0.z.r;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.j;
import b.j.a.c.k;
import b.j.a.c.p;
import java.io.IOException;

public class l extends z<Object> implements i {

    /* renamed from: k  reason: collision with root package name */
    public final b.j.a.c.i f1700k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1701l;

    /* renamed from: m  reason: collision with root package name */
    public final b.j.a.c.e0.i f1702m;

    /* renamed from: n  reason: collision with root package name */
    public final j<?> f1703n;

    /* renamed from: o  reason: collision with root package name */
    public final x f1704o;

    /* renamed from: p  reason: collision with root package name */
    public final u[] f1705p;

    /* renamed from: q  reason: collision with root package name */
    public transient b.j.a.c.b0.z.u f1706q;

    public l(l lVar, j<?> jVar) {
        super(lVar.f1761h);
        this.f1700k = lVar.f1700k;
        this.f1702m = lVar.f1702m;
        this.f1701l = lVar.f1701l;
        this.f1704o = lVar.f1704o;
        this.f1705p = lVar.f1705p;
        this.f1703n = jVar;
    }

    public l(Class<?> cls, b.j.a.c.e0.i iVar) {
        super(cls);
        this.f1702m = iVar;
        this.f1701l = false;
        this.f1700k = null;
        this.f1703n = null;
        this.f1704o = null;
        this.f1705p = null;
    }

    public l(Class<?> cls, b.j.a.c.e0.i iVar, b.j.a.c.i iVar2, x xVar, u[] uVarArr) {
        super(cls);
        this.f1702m = iVar;
        boolean z = true;
        this.f1701l = true;
        this.f1700k = iVar2.f2152h != String.class ? false : z ? null : iVar2;
        this.f1703n = null;
        this.f1704o = xVar;
        this.f1705p = uVarArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f1700k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j<?> a(b.j.a.c.g r3, b.j.a.c.d r4) {
        /*
            r2 = this;
            b.j.a.c.j<?> r0 = r2.f1703n
            if (r0 != 0) goto L_0x0016
            b.j.a.c.i r0 = r2.f1700k
            if (r0 == 0) goto L_0x0016
            b.j.a.c.b0.u[] r1 = r2.f1705p
            if (r1 != 0) goto L_0x0016
            b.j.a.c.b0.a0.l r1 = new b.j.a.c.b0.a0.l
            b.j.a.c.j r3 = r3.q(r0, r4)
            r1.<init>((b.j.a.c.b0.a0.l) r2, (b.j.a.c.j<?>) r3)
            return r1
        L_0x0016:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.l.a(b.j.a.c.g, b.j.a.c.d):b.j.a.c.j");
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        Object obj;
        j<?> jVar = this.f1703n;
        boolean z = true;
        if (jVar != null) {
            obj = jVar.d(iVar, gVar);
        } else if (this.f1701l) {
            b.j.a.b.l g0 = iVar.g0();
            if (g0 == b.j.a.b.l.VALUE_STRING || g0 == b.j.a.b.l.FIELD_NAME) {
                obj = iVar.x0();
            } else if (this.f1705p == null || !iVar.P0()) {
                obj = iVar.H0();
            } else {
                if (this.f1706q == null) {
                    this.f1706q = b.j.a.c.b0.z.u.b(gVar, this.f1704o, this.f1705p, gVar.P(p.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                iVar.T0();
                b.j.a.c.b0.z.u uVar = this.f1706q;
                b.j.a.c.b0.z.x xVar = new b.j.a.c.b0.z.x(iVar, gVar, uVar.a, (r) null);
                b.j.a.b.l g02 = iVar.g0();
                while (g02 == b.j.a.b.l.FIELD_NAME) {
                    String e0 = iVar.e0();
                    iVar.T0();
                    u c = uVar.c(e0);
                    if (c != null) {
                        try {
                            xVar.b(c, c.c(iVar, gVar));
                        } catch (Exception e2) {
                            Class<?> cls = this.f1761h;
                            String str = c.f1796k.f2305h;
                            Throwable r = b.j.a.c.j0.g.r(e2);
                            b.j.a.c.j0.g.C(r);
                            if (gVar != null && !gVar.O(h.WRAP_EXCEPTIONS)) {
                                z = false;
                            }
                            if (r instanceof IOException) {
                                if (!z || !(r instanceof b.j.a.b.j)) {
                                    throw ((IOException) r);
                                }
                            } else if (!z) {
                                b.j.a.c.j0.g.E(r);
                            }
                            throw k.h(r, cls, str);
                        }
                    } else {
                        xVar.d(e0);
                    }
                    g02 = iVar.T0();
                }
                return uVar.a(gVar, xVar);
            }
        } else {
            iVar.a1();
            try {
                return this.f1702m.f1913k.invoke((Object) null, new Object[0]);
            } catch (Exception e3) {
                Throwable r2 = b.j.a.c.j0.g.r(e3);
                b.j.a.c.j0.g.D(r2);
                gVar.B(this.f1761h, (Object) null, r2);
                throw null;
            }
        }
        try {
            return this.f1702m.f1913k.invoke(this.f1761h, new Object[]{obj});
        } catch (Exception e4) {
            Throwable r3 = b.j.a.c.j0.g.r(e4);
            b.j.a.c.j0.g.D(r3);
            if (gVar.O(h.READ_UNKNOWN_ENUM_VALUES_AS_NULL) && (r3 instanceof IllegalArgumentException)) {
                return null;
            }
            gVar.B(this.f1761h, obj, r3);
            throw null;
        }
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return this.f1703n == null ? d(iVar, gVar) : cVar.b(iVar, gVar);
    }

    public boolean m() {
        return true;
    }

    public Boolean n(f fVar) {
        return Boolean.FALSE;
    }
}
