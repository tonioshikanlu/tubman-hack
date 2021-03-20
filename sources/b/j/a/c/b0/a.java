package b.j.a.c.b0;

import b.j.a.c.b0.x;
import b.j.a.c.b0.z.r;
import b.j.a.c.b0.z.y;
import b.j.a.c.c;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.j;
import java.io.Serializable;
import java.util.Map;

public class a extends j<Object> implements i, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final i f1623h;

    /* renamed from: i  reason: collision with root package name */
    public final r f1624i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, u> f1625j;

    /* renamed from: k  reason: collision with root package name */
    public transient Map<String, u> f1626k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1627l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f1628m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1629n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1630o;

    public a(a aVar, r rVar, Map<String, u> map) {
        this.f1623h = aVar.f1623h;
        this.f1625j = aVar.f1625j;
        this.f1627l = aVar.f1627l;
        this.f1628m = aVar.f1628m;
        this.f1629n = aVar.f1629n;
        this.f1630o = aVar.f1630o;
        this.f1624i = rVar;
        this.f1626k = null;
    }

    public a(c cVar) {
        i iVar = cVar.a;
        this.f1623h = iVar;
        this.f1624i = null;
        this.f1625j = null;
        Class<?> cls = iVar.f2152h;
        this.f1627l = cls.isAssignableFrom(String.class);
        boolean z = false;
        this.f1628m = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.f1629n = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        this.f1630o = (cls == Double.TYPE || cls.isAssignableFrom(Double.class)) ? true : z;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [b.j.a.c.b0.z.v] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.j<?> a(b.j.a.c.g r12, b.j.a.c.d r13) {
        /*
            r11 = this;
            b.j.a.c.b r0 = r12.x()
            r1 = 0
            if (r13 == 0) goto L_0x0088
            if (r0 == 0) goto L_0x0088
            b.j.a.c.e0.h r13 = r13.e()
            if (r13 == 0) goto L_0x0088
            b.j.a.c.e0.y r2 = r0.z(r13)
            if (r2 == 0) goto L_0x0088
            b.j.a.a.l0 r3 = r12.k(r13, r2)
            b.j.a.c.e0.y r0 = r0.A(r13, r2)
            java.lang.Class<? extends b.j.a.a.i0<?>> r2 = r0.f1958b
            java.lang.Class<b.j.a.a.k0> r4 = b.j.a.a.k0.class
            r5 = 0
            if (r2 != r4) goto L_0x005c
            b.j.a.c.t r13 = r0.a
            java.util.Map<java.lang.String, b.j.a.c.b0.u> r2 = r11.f1626k
            if (r2 != 0) goto L_0x002c
            r2 = r1
            goto L_0x0034
        L_0x002c:
            java.lang.String r4 = r13.f2305h
            java.lang.Object r2 = r2.get(r4)
            b.j.a.c.b0.u r2 = (b.j.a.c.b0.u) r2
        L_0x0034:
            if (r2 == 0) goto L_0x0042
            b.j.a.c.i r13 = r2.f1797l
            b.j.a.c.b0.z.v r4 = new b.j.a.c.b0.z.v
            java.lang.Class<?> r5 = r0.d
            r4.<init>(r5)
            r5 = r13
            r9 = r2
            goto L_0x0076
        L_0x0042:
            b.j.a.c.i r0 = r11.f1623h
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class<?> r3 = r0.f2152h
            java.lang.String r3 = r3.getName()
            r2[r5] = r3
            r3 = 1
            r2[r3] = r13
            java.lang.String r13 = "Invalid Object Id definition for %s: cannot find property with name '%s'"
            java.lang.String r13 = java.lang.String.format(r13, r2)
            r12.l(r0, r13)
            throw r1
        L_0x005c:
            b.j.a.a.l0 r3 = r12.k(r13, r0)
            b.j.a.c.i r2 = r12.n(r2)
            b.j.a.c.i0.n r4 = r12.h()
            java.lang.Class<b.j.a.a.i0> r6 = b.j.a.a.i0.class
            b.j.a.c.i[] r2 = r4.m(r2, r6)
            r2 = r2[r5]
            b.j.a.a.i0 r4 = r12.j(r13, r0)
            r9 = r1
            r5 = r2
        L_0x0076:
            r10 = r3
            r7 = r4
            b.j.a.c.j r8 = r12.w(r5)
            b.j.a.c.t r6 = r0.a
            b.j.a.c.b0.z.r r12 = b.j.a.c.b0.z.r.a(r5, r6, r7, r8, r9, r10)
            b.j.a.c.b0.a r13 = new b.j.a.c.b0.a
            r13.<init>(r11, r12, r1)
            return r13
        L_0x0088:
            java.util.Map<java.lang.String, b.j.a.c.b0.u> r12 = r11.f1626k
            if (r12 != 0) goto L_0x008d
            return r11
        L_0x008d:
            b.j.a.c.b0.a r12 = new b.j.a.c.b0.a
            b.j.a.c.b0.z.r r13 = r11.f1624i
            r12.<init>(r11, r13, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a.a(b.j.a.c.g, b.j.a.c.d):b.j.a.c.j");
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        g gVar2 = gVar;
        gVar2.D(this.f1623h.f2152h, new x.a(this.f1623h), iVar, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(b.j.a.b.i r3, b.j.a.c.g r4, b.j.a.c.f0.c r5) {
        /*
            r2 = this;
            b.j.a.c.b0.z.r r0 = r2.f1624i
            if (r0 == 0) goto L_0x0024
            b.j.a.b.l r0 = r3.g0()
            if (r0 == 0) goto L_0x0024
            boolean r1 = r0.f1445o
            if (r1 == 0) goto L_0x0013
            java.lang.Object r3 = r2.q(r3, r4)
            return r3
        L_0x0013:
            b.j.a.b.l r1 = b.j.a.b.l.START_OBJECT
            if (r0 != r1) goto L_0x001b
            b.j.a.b.l r0 = r3.T0()
        L_0x001b:
            b.j.a.b.l r1 = b.j.a.b.l.FIELD_NAME
            if (r0 != r1) goto L_0x0024
            b.j.a.c.b0.z.r r0 = r2.f1624i
            r0.b()
        L_0x0024:
            int r0 = r3.k0()
            switch(r0) {
                case 6: goto L_0x0054;
                case 7: goto L_0x0047;
                case 8: goto L_0x003a;
                case 9: goto L_0x0033;
                case 10: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x005d
        L_0x002c:
            boolean r0 = r2.f1628m
            if (r0 == 0) goto L_0x005d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x005e
        L_0x0033:
            boolean r0 = r2.f1628m
            if (r0 == 0) goto L_0x005d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x005e
        L_0x003a:
            boolean r0 = r2.f1630o
            if (r0 == 0) goto L_0x005d
            double r0 = r3.n0()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x005e
        L_0x0047:
            boolean r0 = r2.f1629n
            if (r0 == 0) goto L_0x005d
            int r0 = r3.q0()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x005e
        L_0x0054:
            boolean r0 = r2.f1627l
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r3.x0()
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            if (r0 == 0) goto L_0x0061
            return r0
        L_0x0061:
            java.lang.Object r3 = r5.d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a.f(b.j.a.b.i, b.j.a.c.g, b.j.a.c.f0.c):java.lang.Object");
    }

    public u g(String str) {
        Map<String, u> map = this.f1625j;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public r k() {
        return this.f1624i;
    }

    public Class<?> l() {
        return this.f1623h.f2152h;
    }

    public boolean m() {
        return true;
    }

    public Boolean n(f fVar) {
        return null;
    }

    public Object q(b.j.a.b.i iVar, g gVar) {
        Object d = this.f1624i.f1846l.d(iVar, gVar);
        r rVar = this.f1624i;
        y v = gVar.v(d, rVar.f1844j, rVar.f1845k);
        Object c = v.d.c(v.f1855b);
        v.a = c;
        if (c != null) {
            return c;
        }
        throw new v(iVar, "Could not resolve Object Id [" + d + "] -- unresolved forward-reference?", iVar.Y(), v);
    }

    public a(e eVar, c cVar, Map<String, u> map, Map<String, u> map2) {
        i iVar = cVar.a;
        this.f1623h = iVar;
        this.f1624i = eVar.f1780i;
        this.f1625j = map;
        this.f1626k = map2;
        Class<?> cls = iVar.f2152h;
        this.f1627l = cls.isAssignableFrom(String.class);
        boolean z = false;
        this.f1628m = cls == Boolean.TYPE || cls.isAssignableFrom(Boolean.class);
        this.f1629n = cls == Integer.TYPE || cls.isAssignableFrom(Integer.class);
        this.f1630o = (cls == Double.TYPE || cls.isAssignableFrom(Double.class)) ? true : z;
    }
}
