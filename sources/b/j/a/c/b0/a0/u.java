package b.j.a.c.b0.a0;

import b.j.a.a.k;
import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.b0.r;
import b.j.a.c.d;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.j;
import b.j.a.c.j0.t;
import b.j.a.c.z.a;
import java.lang.reflect.Array;

@a
public class u extends g<Object[]> implements i {
    public static final Object[] s = new Object[0];

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1743o;

    /* renamed from: p  reason: collision with root package name */
    public final Class<?> f1744p;

    /* renamed from: q  reason: collision with root package name */
    public j<Object> f1745q;
    public final c r;

    public u(u uVar, j<Object> jVar, c cVar, r rVar, Boolean bool) {
        super((g<?>) uVar, rVar, bool);
        this.f1744p = uVar.f1744p;
        this.f1743o = uVar.f1743o;
        this.f1745q = jVar;
        this.r = cVar;
    }

    public u(b.j.a.c.i iVar, j<Object> jVar, c cVar) {
        super(iVar, (r) null, (Boolean) null);
        Class<?> cls = ((b.j.a.c.i0.a) iVar).f2157q.f2152h;
        this.f1744p = cls;
        this.f1743o = cls == Object.class;
        this.f1745q = jVar;
        this.r = cVar;
    }

    public j<?> a(g gVar, d dVar) {
        j jVar = this.f1745q;
        Class<?> cls = this.f1668k.f2152h;
        k.a aVar = k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        k.d Y = Y(gVar, dVar, cls);
        Boolean b2 = Y != null ? Y.b(aVar) : null;
        j X = X(gVar, dVar, jVar);
        b.j.a.c.i k2 = this.f1668k.k();
        j q2 = X == null ? gVar.q(k2, dVar) : gVar.F(X, dVar, k2);
        c cVar = this.r;
        if (cVar != null) {
            cVar = cVar.f(dVar);
        }
        c cVar2 = cVar;
        r W = W(gVar, dVar, q2);
        return (b2 == this.f1670m && W == this.f1669l && q2 == this.f1745q && cVar2 == this.r) ? this : new u(this, q2, cVar2, W, b2);
    }

    public j<Object> c0() {
        return this.f1745q;
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        Object obj;
        if (!iVar.O0()) {
            return f0(iVar, gVar);
        }
        t R = gVar.R();
        Object[] g2 = R.g();
        c cVar = this.r;
        int i2 = 0;
        while (true) {
            try {
                l T0 = iVar.T0();
                if (T0 == l.END_ARRAY) {
                    break;
                }
                if (T0 != l.VALUE_NULL) {
                    obj = cVar == null ? this.f1745q.d(iVar, gVar) : this.f1745q.f(iVar, gVar, cVar);
                } else if (!this.f1671n) {
                    obj = this.f1669l.c(gVar);
                }
                if (i2 >= g2.length) {
                    g2 = R.c(g2);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                try {
                    g2[i2] = obj;
                    i2 = i3;
                } catch (Exception e2) {
                    e = e2;
                    i2 = i3;
                    throw b.j.a.c.k.g(e, g2, R.c + i2);
                }
            } catch (Exception e3) {
                e = e3;
                throw b.j.a.c.k.g(e, g2, R.c + i2);
            }
        }
        Object[] e4 = this.f1743o ? R.e(g2, i2) : R.f(g2, i2, this.f1744p);
        gVar.c0(R);
        return e4;
    }

    public Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        Object obj2;
        Object[] objArr = (Object[]) obj;
        if (!iVar.O0()) {
            Object[] f0 = f0(iVar, gVar);
            if (f0 == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[(f0.length + length)];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(f0, 0, objArr2, length, f0.length);
            return objArr2;
        }
        t R = gVar.R();
        int length2 = objArr.length;
        Object[] h2 = R.h(objArr, length2);
        c cVar = this.r;
        while (true) {
            try {
                l T0 = iVar.T0();
                if (T0 == l.END_ARRAY) {
                    break;
                }
                if (T0 != l.VALUE_NULL) {
                    obj2 = cVar == null ? this.f1745q.d(iVar, gVar) : this.f1745q.f(iVar, gVar, cVar);
                } else if (!this.f1671n) {
                    obj2 = this.f1669l.c(gVar);
                }
                if (length2 >= h2.length) {
                    h2 = R.c(h2);
                    length2 = 0;
                }
                int i2 = length2 + 1;
                try {
                    h2[length2] = obj2;
                    length2 = i2;
                } catch (Exception e2) {
                    e = e2;
                    length2 = i2;
                    throw b.j.a.c.k.g(e, h2, R.c + length2);
                }
            } catch (Exception e3) {
                e = e3;
                throw b.j.a.c.k.g(e, h2, R.c + length2);
            }
        }
        Object[] e4 = this.f1743o ? R.e(h2, length2) : R.f(h2, length2, this.f1744p);
        gVar.c0(R);
        return e4;
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return (Object[]) cVar.c(iVar, gVar);
    }

    public Object[] f0(b.j.a.b.i iVar, g gVar) {
        Object obj;
        l lVar = l.VALUE_STRING;
        if (iVar.L0(lVar) && gVar.O(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && iVar.x0().length() == 0) {
            return null;
        }
        Boolean bool = this.f1670m;
        if (bool == Boolean.TRUE || (bool == null && gVar.O(h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (iVar.g0() != l.VALUE_NULL) {
                c cVar = this.r;
                obj = cVar == null ? this.f1745q.d(iVar, gVar) : this.f1745q.f(iVar, gVar, cVar);
            } else if (this.f1671n) {
                return s;
            } else {
                obj = this.f1669l.c(gVar);
            }
            Object[] objArr = this.f1743o ? new Object[1] : (Object[]) Array.newInstance(this.f1744p, 1);
            objArr[0] = obj;
            return objArr;
        } else if (iVar.g0() == lVar && this.f1744p == Byte.class) {
            byte[] N = iVar.N(gVar.z());
            Byte[] bArr = new Byte[N.length];
            int length = N.length;
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = Byte.valueOf(N[i2]);
            }
            return bArr;
        } else {
            gVar.G(this.f1668k.f2152h, iVar);
            throw null;
        }
    }

    public b.j.a.c.j0.a h() {
        return b.j.a.c.j0.a.CONSTANT;
    }

    public Object i(g gVar) {
        return s;
    }

    public boolean m() {
        return this.f1745q == null && this.r == null;
    }
}
