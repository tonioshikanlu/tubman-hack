package b.j.a.c.b0.z;

import b.j.a.c.a0.g;
import b.j.a.c.b;
import b.j.a.c.b0.u;
import b.j.a.c.c;
import b.j.a.c.e0.l;
import b.j.a.c.e0.m;
import b.j.a.c.e0.o;
import b.j.a.c.f;
import b.j.a.c.i;
import b.j.a.c.p;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class e {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f1819j = {"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1820b;
    public final boolean c;
    public final m[] d = new m[9];

    /* renamed from: e  reason: collision with root package name */
    public int f1821e = 0;
    public boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public u[] f1822g;

    /* renamed from: h  reason: collision with root package name */
    public u[] f1823h;

    /* renamed from: i  reason: collision with root package name */
    public u[] f1824i;

    public static final class a extends m implements Serializable {

        /* renamed from: k  reason: collision with root package name */
        public final m f1825k;

        /* renamed from: l  reason: collision with root package name */
        public final int f1826l;

        public a(m mVar, int i2) {
            super(mVar, (o[]) null);
            this.f1825k = mVar;
            this.f1826l = i2;
        }

        public AnnotatedElement b() {
            return this.f1825k.b();
        }

        public String d() {
            return this.f1825k.d();
        }

        public Class<?> e() {
            return this.f1825k.e();
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        public i f() {
            return this.f1825k.f();
        }

        public Class<?> h() {
            return this.f1825k.h();
        }

        public int hashCode() {
            return this.f1825k.hashCode();
        }

        public Member j() {
            return this.f1825k.j();
        }

        public Object k(Object obj) {
            throw new UnsupportedOperationException();
        }

        public b.j.a.c.e0.a m(o oVar) {
            throw new UnsupportedOperationException();
        }

        public Object n() {
            return w();
        }

        public Object o(Object[] objArr) {
            return w();
        }

        public Object q(Object obj) {
            return w();
        }

        public int t() {
            return this.f1825k.t();
        }

        public String toString() {
            return this.f1825k.toString();
        }

        public i u(int i2) {
            return this.f1825k.u(i2);
        }

        public Class<?> v(int i2) {
            return this.f1825k.v(i2);
        }

        public final Object w() {
            int i2 = this.f1826l;
            if (i2 == 1) {
                return new ArrayList();
            }
            if (i2 == 2) {
                return new HashMap();
            }
            if (i2 == 3) {
                return new LinkedHashMap();
            }
            StringBuilder y = b.e.a.a.a.y("Unknown type ");
            y.append(this.f1826l);
            throw new IllegalStateException(y.toString());
        }
    }

    public e(c cVar, g<?> gVar) {
        this.a = cVar;
        this.f1820b = gVar.b();
        this.c = gVar.o(p.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final i a(b.j.a.c.g gVar, m mVar, u[] uVarArr) {
        if (!this.f || mVar == null) {
            return null;
        }
        int i2 = 0;
        if (uVarArr != null) {
            int length = uVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (uVarArr[i3] == null) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        f fVar = gVar.f1993j;
        i u = mVar.u(i2);
        b e2 = fVar.e();
        if (e2 == null) {
            return u;
        }
        l r = mVar.r(i2);
        Object j2 = e2.j(r);
        return j2 != null ? u.R(gVar.o(r, j2)) : e2.n0(fVar, r, u);
    }

    public boolean b(m mVar) {
        return mVar.h().isEnum() && "valueOf".equals(mVar.d());
    }

    public void c(m mVar, boolean z, u[] uVarArr, int i2) {
        if (mVar.u(i2).y()) {
            if (f(mVar, 8, z)) {
                this.f1823h = uVarArr;
            }
        } else if (f(mVar, 6, z)) {
            this.f1822g = uVarArr;
        }
    }

    public void d(m mVar, boolean z, u[] uVarArr) {
        Integer num;
        if (f(mVar, 7, z)) {
            if (uVarArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = uVarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    String str = uVarArr[i2].f1796k.f2305h;
                    if ((!str.isEmpty() || uVarArr[i2].q() == null) && (num = (Integer) hashMap.put(str, Integer.valueOf(i2))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{str, num, Integer.valueOf(i2), b.j.a.c.j0.g.y(this.a.a.f2152h)}));
                    }
                }
            }
            this.f1824i = uVarArr;
        }
    }

    public void e(m mVar) {
        m[] mVarArr = this.d;
        if (this.f1820b) {
            b.j.a.c.j0.g.e((Member) mVar.b(), this.c);
        }
        mVarArr[0] = mVar;
    }

    public boolean f(m mVar, int i2, boolean z) {
        boolean z2;
        int i3 = 1 << i2;
        this.f = true;
        m mVar2 = this.d[i2];
        if (mVar2 != null) {
            if ((this.f1821e & i3) == 0) {
                z2 = !z;
            } else if (!z) {
                return false;
            } else {
                z2 = true;
            }
            if (z2 && mVar2.getClass() == mVar.getClass()) {
                Class<?> v = mVar2.v(0);
                Class<?> v2 = mVar.v(0);
                if (v == v2) {
                    if (b(mVar)) {
                        return false;
                    }
                    if (!b(mVar2)) {
                        Object[] objArr = new Object[4];
                        objArr[0] = f1819j[i2];
                        objArr[1] = z ? "explicitly marked" : "implicitly discovered";
                        objArr[2] = mVar2;
                        objArr[3] = mVar;
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
                    }
                } else if (v2.isAssignableFrom(v)) {
                    return false;
                }
            }
        }
        if (z) {
            this.f1821e |= i3;
        }
        m[] mVarArr = this.d;
        if (mVar != null && this.f1820b) {
            b.j.a.c.j0.g.e((Member) mVar.b(), this.c);
        }
        mVarArr[i2] = mVar;
        return true;
    }
}
