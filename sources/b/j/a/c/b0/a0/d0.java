package b.j.a.c.b0.a0;

import b.j.a.c.b0.u;
import b.j.a.c.b0.x;
import b.j.a.c.e0.l;
import b.j.a.c.e0.m;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.k;
import b.j.a.c.z.a;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

@a
public class d0 extends x implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final String f1645h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f1646i;

    /* renamed from: j  reason: collision with root package name */
    public m f1647j;

    /* renamed from: k  reason: collision with root package name */
    public m f1648k;

    /* renamed from: l  reason: collision with root package name */
    public u[] f1649l;

    /* renamed from: m  reason: collision with root package name */
    public i f1650m;

    /* renamed from: n  reason: collision with root package name */
    public m f1651n;

    /* renamed from: o  reason: collision with root package name */
    public u[] f1652o;

    /* renamed from: p  reason: collision with root package name */
    public i f1653p;

    /* renamed from: q  reason: collision with root package name */
    public m f1654q;
    public u[] r;
    public m s;
    public m t;
    public m u;
    public m v;
    public m w;

    public d0(i iVar) {
        this.f1645h = iVar == null ? "UNKNOWN TYPE" : iVar.toString();
        this.f1646i = iVar == null ? Object.class : iVar.f2152h;
    }

    public i A(f fVar) {
        return this.f1650m;
    }

    public u[] B(f fVar) {
        return this.f1649l;
    }

    public l D() {
        return null;
    }

    public Class<?> E() {
        return this.f1646i;
    }

    public final Object F(m mVar, u[] uVarArr, g gVar, Object obj) {
        if (mVar == null) {
            StringBuilder y = b.e.a.a.a.y("No delegate constructor for ");
            y.append(this.f1645h);
            throw new IllegalStateException(y.toString());
        } else if (uVarArr == null) {
            try {
                return mVar.q(obj);
            } catch (Throwable th) {
                throw G(gVar, th);
            }
        } else {
            int length = uVarArr.length;
            Object[] objArr = new Object[length];
            int i2 = 0;
            while (i2 < length) {
                u uVar = uVarArr[i2];
                if (uVar == null) {
                    objArr[i2] = obj;
                    i2++;
                } else {
                    gVar.r(uVar.q(), uVar, (Object) null);
                    throw null;
                }
            }
            return mVar.o(objArr);
        }
    }

    public k G(g gVar, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        if (th instanceof k) {
            return (k) th;
        }
        return gVar.N(this.f1646i, th);
    }

    public boolean b() {
        return this.w != null;
    }

    public boolean c() {
        return this.v != null;
    }

    public boolean d() {
        return this.t != null;
    }

    public boolean e() {
        return this.u != null;
    }

    public boolean f() {
        return this.f1648k != null;
    }

    public boolean g() {
        return this.s != null;
    }

    public boolean h() {
        return this.f1653p != null;
    }

    public boolean i() {
        return this.f1647j != null;
    }

    public boolean j() {
        return this.f1650m != null;
    }

    public boolean k() {
        if (!i() && !j() && !h() && !f() && !g() && !d()) {
            if (!(this.u != null) && !c() && !b()) {
                return false;
            }
        }
        return true;
    }

    public Object l(g gVar, boolean z) {
        if (this.w != null) {
            Boolean valueOf = Boolean.valueOf(z);
            try {
                return this.w.q(valueOf);
            } catch (Throwable th) {
                gVar.B(this.w.h(), valueOf, G(gVar, th));
                throw null;
            }
        } else {
            super.l(gVar, z);
            throw null;
        }
    }

    public Object m(g gVar, double d) {
        if (this.v != null) {
            Double valueOf = Double.valueOf(d);
            try {
                return this.v.q(valueOf);
            } catch (Throwable th) {
                gVar.B(this.v.h(), valueOf, G(gVar, th));
                throw null;
            }
        } else {
            super.m(gVar, d);
            throw null;
        }
    }

    public Object n(g gVar, int i2) {
        if (this.t != null) {
            Integer valueOf = Integer.valueOf(i2);
            try {
                return this.t.q(valueOf);
            } catch (Throwable th) {
                gVar.B(this.t.h(), valueOf, G(gVar, th));
                throw null;
            }
        } else if (this.u != null) {
            Long valueOf2 = Long.valueOf((long) i2);
            try {
                return this.u.q(valueOf2);
            } catch (Throwable th2) {
                gVar.B(this.u.h(), valueOf2, G(gVar, th2));
                throw null;
            }
        } else {
            super.n(gVar, i2);
            throw null;
        }
    }

    public Object o(g gVar, long j2) {
        if (this.u != null) {
            Long valueOf = Long.valueOf(j2);
            try {
                return this.u.q(valueOf);
            } catch (Throwable th) {
                gVar.B(this.u.h(), valueOf, G(gVar, th));
                throw null;
            }
        } else {
            super.o(gVar, j2);
            throw null;
        }
    }

    public Object q(g gVar, Object[] objArr) {
        m mVar = this.f1648k;
        if (mVar != null) {
            try {
                return mVar.o(objArr);
            } catch (Exception e2) {
                gVar.B(this.f1646i, objArr, G(gVar, e2));
                throw null;
            }
        } else {
            super.q(gVar, objArr);
            throw null;
        }
    }

    public Object r(g gVar, String str) {
        m mVar = this.s;
        if (mVar == null) {
            return a(gVar, str);
        }
        try {
            return mVar.q(str);
        } catch (Throwable th) {
            gVar.B(this.s.h(), str, G(gVar, th));
            throw null;
        }
    }

    public Object t(g gVar, Object obj) {
        m mVar = this.f1654q;
        return (mVar != null || this.f1651n == null) ? F(mVar, this.r, gVar, obj) : v(gVar, obj);
    }

    public Object u(g gVar) {
        m mVar = this.f1647j;
        if (mVar != null) {
            try {
                return mVar.n();
            } catch (Exception e2) {
                gVar.B(this.f1646i, (Object) null, G(gVar, e2));
                throw null;
            }
        } else {
            super.u(gVar);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f1654q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object v(b.j.a.c.g r3, java.lang.Object r4) {
        /*
            r2 = this;
            b.j.a.c.e0.m r0 = r2.f1651n
            if (r0 != 0) goto L_0x000f
            b.j.a.c.e0.m r1 = r2.f1654q
            if (r1 == 0) goto L_0x000f
            b.j.a.c.b0.u[] r0 = r2.r
            java.lang.Object r3 = r2.F(r1, r0, r3, r4)
            return r3
        L_0x000f:
            b.j.a.c.b0.u[] r1 = r2.f1652o
            java.lang.Object r3 = r2.F(r0, r1, r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.d0.v(b.j.a.c.g, java.lang.Object):java.lang.Object");
    }

    public m w() {
        return this.f1654q;
    }

    public i x(f fVar) {
        return this.f1653p;
    }

    public m y() {
        return this.f1647j;
    }

    public m z() {
        return this.f1651n;
    }
}
