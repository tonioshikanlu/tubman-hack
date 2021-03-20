package b.j.a.c.e0;

import b.e.a.a.a;
import b.j.a.a.k;
import b.j.a.a.r;
import b.j.a.c.a0.g;
import b.j.a.c.b;
import b.j.a.c.c;
import b.j.a.c.i;
import b.j.a.c.j0.j;
import b.j.a.c.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class p extends c {

    /* renamed from: j  reason: collision with root package name */
    public static final Class<?>[] f1935j = new Class[0];

    /* renamed from: b  reason: collision with root package name */
    public final z f1936b;
    public final g<?> c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1937e;
    public Class<?>[] f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1938g;

    /* renamed from: h  reason: collision with root package name */
    public List<r> f1939h;

    /* renamed from: i  reason: collision with root package name */
    public y f1940i;

    public p(g<?> gVar, i iVar, b bVar, List<r> list) {
        super(iVar);
        this.f1936b = null;
        this.c = gVar;
        if (gVar == null) {
            this.d = null;
        } else {
            this.d = gVar.e();
        }
        this.f1937e = bVar;
        this.f1939h = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(b.j.a.c.e0.z r3) {
        /*
            r2 = this;
            b.j.a.c.i r0 = r3.d
            b.j.a.c.e0.b r1 = r3.f1961e
            r2.<init>(r0)
            r2.f1936b = r3
            b.j.a.c.a0.g<?> r0 = r3.a
            r2.c = r0
            if (r0 != 0) goto L_0x0011
            r0 = 0
            goto L_0x0015
        L_0x0011:
            b.j.a.c.b r0 = r0.e()
        L_0x0015:
            r2.d = r0
            r2.f1937e = r1
            b.j.a.c.b r0 = r3.f1962g
            b.j.a.c.e0.b r1 = r3.f1961e
            b.j.a.c.e0.y r0 = r0.z(r1)
            if (r0 == 0) goto L_0x002b
            b.j.a.c.b r1 = r3.f1962g
            b.j.a.c.e0.b r3 = r3.f1961e
            b.j.a.c.e0.y r0 = r1.A(r3, r0)
        L_0x002b:
            r2.f1940i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.e0.p.<init>(b.j.a.c.e0.z):void");
    }

    public static p i(g<?> gVar, i iVar, b bVar) {
        return new p(gVar, iVar, bVar, Collections.emptyList());
    }

    public Class<?>[] a() {
        if (!this.f1938g) {
            this.f1938g = true;
            b bVar = this.d;
            Class<?>[] b0 = bVar == null ? null : bVar.b0(this.f1937e);
            if (b0 == null && !this.c.o(b.j.a.c.p.DEFAULT_VIEW_INCLUSION)) {
                b0 = f1935j;
            }
            this.f = b0;
        }
        return this.f;
    }

    public k.d b(k.d dVar) {
        k.d dVar2;
        b bVar = this.d;
        if (bVar == null || (dVar2 = bVar.m(this.f1937e)) == null) {
            dVar2 = null;
        }
        k.d h2 = this.c.h(this.f1937e.f1887i);
        if (h2 != null) {
            return dVar2 == null ? h2 : dVar2.f(h2);
        }
        return dVar2;
    }

    public h c() {
        z zVar = this.f1936b;
        if (zVar == null) {
            return null;
        }
        if (!zVar.f1965j) {
            zVar.g();
        }
        LinkedList<h> linkedList = zVar.f1971p;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return zVar.f1971p.get(0);
        }
        zVar.h("Multiple 'as-value' properties defined (%s vs %s)", zVar.f1971p.get(0), zVar.f1971p.get(1));
        throw null;
    }

    public i d(String str, Class<?>[] clsArr) {
        Map<w, i> map = this.f1937e.h().f1922h;
        if (map == null) {
            return null;
        }
        return map.get(new w(str, clsArr));
    }

    public r.b e(r.b bVar) {
        r.b K;
        b bVar2 = this.d;
        return (bVar2 == null || (K = bVar2.K(this.f1937e)) == null) ? bVar : bVar == null ? K : bVar.a(K);
    }

    public List<i> f() {
        List<i> k2 = this.f1937e.k();
        if (k2.isEmpty()) {
            return k2;
        }
        ArrayList arrayList = null;
        for (i next : k2) {
            if (k(next)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public j<Object, Object> g(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof Class) {
            Class<j.a> cls = (Class) obj;
            if (cls == j.a.class || b.j.a.c.j0.g.t(cls)) {
                return null;
            }
            if (j.class.isAssignableFrom(cls)) {
                Objects.requireNonNull(this.c.f1609i);
                return (j) b.j.a.c.j0.g.h(cls, this.c.b());
            }
            throw new IllegalStateException(a.e(cls, a.y("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(a.f(obj, a.y("AnnotationIntrospector returned Converter definition of type "), "; expected type Converter or Class<Converter> instead"));
    }

    public List<r> h() {
        if (this.f1939h == null) {
            z zVar = this.f1936b;
            if (!zVar.f1965j) {
                zVar.g();
            }
            this.f1939h = new ArrayList(zVar.f1966k.values());
        }
        return this.f1939h;
    }

    public boolean j(t tVar) {
        r rVar;
        Iterator<r> it = h().iterator();
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = it.next();
            if (rVar.H(tVar)) {
                break;
            }
        }
        return rVar != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r5 = r5.v(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(b.j.a.c.e0.i r5) {
        /*
            r4 = this;
            java.lang.Class r0 = r5.w()
            b.j.a.c.i r1 = r4.a
            java.lang.Class<?> r1 = r1.f2152h
            boolean r0 = r1.isAssignableFrom(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            b.j.a.c.b r0 = r4.d
            b.j.a.c.a0.g<?> r2 = r4.c
            b.j.a.a.h$a r0 = r0.e(r2, r5)
            r2 = 1
            if (r0 == 0) goto L_0x0020
            b.j.a.a.h$a r3 = b.j.a.a.h.a.DISABLED
            if (r0 == r3) goto L_0x0020
            return r2
        L_0x0020:
            java.lang.String r0 = r5.d()
            java.lang.String r3 = "valueOf"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0033
            int r3 = r5.t()
            if (r3 != r2) goto L_0x0033
            return r2
        L_0x0033:
            java.lang.String r3 = "fromString"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0052
            int r0 = r5.t()
            if (r0 != r2) goto L_0x0052
            java.lang.Class r5 = r5.v(r1)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 == r0) goto L_0x0051
            java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
            boolean r5 = r0.isAssignableFrom(r5)
            if (r5 == 0) goto L_0x0052
        L_0x0051:
            return r2
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.e0.p.k(b.j.a.c.e0.i):boolean");
    }
}
