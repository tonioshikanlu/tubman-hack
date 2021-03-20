package b.j.a.c.b0.a0;

import b.j.a.c.b0.i;
import b.j.a.c.b0.r;
import b.j.a.c.b0.s;
import b.j.a.c.b0.x;
import b.j.a.c.b0.z.u;
import b.j.a.c.d;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.i0.f;
import b.j.a.c.o;
import b.j.a.c.p;
import java.io.IOException;
import java.util.EnumMap;

public class j extends g<EnumMap<?, ?>> implements i, s {

    /* renamed from: o  reason: collision with root package name */
    public final Class<?> f1683o;

    /* renamed from: p  reason: collision with root package name */
    public o f1684p;

    /* renamed from: q  reason: collision with root package name */
    public b.j.a.c.j<Object> f1685q;
    public final c r;
    public final x s;
    public b.j.a.c.j<Object> t;
    public u u;

    public j(j jVar, o oVar, b.j.a.c.j<?> jVar2, c cVar, r rVar) {
        super((g<?>) jVar, rVar, jVar.f1670m);
        this.f1683o = jVar.f1683o;
        this.f1684p = oVar;
        this.f1685q = jVar2;
        this.r = cVar;
        this.s = jVar.s;
        this.t = jVar.t;
        this.u = jVar.u;
    }

    public j(b.j.a.c.i iVar, x xVar, o oVar, b.j.a.c.j<?> jVar, c cVar, r rVar) {
        super(iVar, (r) null, (Boolean) null);
        this.f1683o = ((f) iVar).f2163q.f2152h;
        this.f1684p = null;
        this.f1685q = jVar;
        this.r = cVar;
        this.s = xVar;
    }

    public b.j.a.c.j<?> a(g gVar, d dVar) {
        o oVar = this.f1684p;
        if (oVar == null) {
            oVar = gVar.t(this.f1668k.n(), dVar);
        }
        o oVar2 = oVar;
        b.j.a.c.j jVar = this.f1685q;
        b.j.a.c.i k2 = this.f1668k.k();
        b.j.a.c.j q2 = jVar == null ? gVar.q(k2, dVar) : gVar.F(jVar, dVar, k2);
        c cVar = this.r;
        if (cVar != null) {
            cVar = cVar.f(dVar);
        }
        c cVar2 = cVar;
        r W = W(gVar, dVar, q2);
        return (oVar2 == this.f1684p && W == this.f1669l && q2 == this.f1685q && cVar2 == this.r) ? this : new j(this, oVar2, q2, cVar2, W);
    }

    public void b(g gVar) {
        b.j.a.c.i x;
        x xVar = this.s;
        if (xVar != null) {
            if (xVar.j()) {
                x = this.s.A(gVar.f1993j);
                if (x == null) {
                    b.j.a.c.i iVar = this.f1668k;
                    gVar.l(iVar, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{iVar, this.s.getClass().getName()}));
                    throw null;
                }
            } else if (this.s.h()) {
                x = this.s.x(gVar.f1993j);
                if (x == null) {
                    b.j.a.c.i iVar2 = this.f1668k;
                    gVar.l(iVar2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{iVar2, this.s.getClass().getName()}));
                    throw null;
                }
            } else if (this.s.f()) {
                this.u = u.b(gVar, this.s, this.s.B(gVar.f1993j), gVar.P(p.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                return;
            } else {
                return;
            }
            this.t = gVar.q(x, (d) null);
        }
    }

    public b.j.a.c.j<Object> c0() {
        return this.f1685q;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(b.j.a.b.i r9, b.j.a.c.g r10) {
        /*
            r8 = this;
            b.j.a.c.b0.z.u r0 = r8.u
            r1 = 0
            if (r0 == 0) goto L_0x00ce
            b.j.a.c.b0.z.x r2 = new b.j.a.c.b0.z.x
            int r3 = r0.a
            r2.<init>(r9, r10, r3, r1)
            boolean r3 = r9.P0()
            if (r3 == 0) goto L_0x0015
            r4 = r8
            goto L_0x00ae
        L_0x0015:
            b.j.a.b.l r3 = b.j.a.b.l.FIELD_NAME
            boolean r3 = r9.L0(r3)
            if (r3 == 0) goto L_0x0023
            java.lang.String r3 = r9.e0()
            r4 = r8
            goto L_0x0025
        L_0x0023:
            r4 = r8
            r3 = r1
        L_0x0025:
            if (r3 == 0) goto L_0x00bd
            b.j.a.b.l r5 = r9.T0()
            java.util.HashMap<java.lang.String, b.j.a.c.b0.u> r6 = r0.c
            java.lang.Object r6 = r6.get(r3)
            b.j.a.c.b0.u r6 = (b.j.a.c.b0.u) r6
            if (r6 == 0) goto L_0x0057
            java.lang.Object r5 = r6.c(r9, r10)
            boolean r5 = r2.b(r6, r5)
            if (r5 == 0) goto L_0x00ae
            r9.T0()
            java.lang.Object r0 = r0.a(r10, r2)     // Catch:{ Exception -> 0x004e }
            java.util.EnumMap r0 = (java.util.EnumMap) r0     // Catch:{ Exception -> 0x004e }
            r4.g0(r9, r10, r0)
            r1 = r0
            goto L_0x010a
        L_0x004e:
            r9 = move-exception
            b.j.a.c.i r10 = r4.f1668k
            java.lang.Class<?> r10 = r10.f2152h
            r4.e0(r9, r10, r3)
            throw r1
        L_0x0057:
            b.j.a.c.o r6 = r4.f1684p
            java.lang.Object r6 = r6.a(r3, r10)
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto L_0x0084
            b.j.a.c.h r5 = b.j.a.c.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r5 = r10.O(r5)
            if (r5 == 0) goto L_0x0070
            r9.T0()
            r9.a1()
            goto L_0x00ae
        L_0x0070:
            java.lang.Class<?> r9 = r4.f1683o
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            b.j.a.c.i r4 = r4.f1668k
            b.j.a.c.i r4 = r4.n()
            r0[r2] = r4
            java.lang.String r2 = "value not one of declared Enum instance names for %s"
            r10.L(r9, r3, r2, r0)
            throw r1
        L_0x0084:
            b.j.a.b.l r7 = b.j.a.b.l.VALUE_NULL     // Catch:{ Exception -> 0x00b4 }
            if (r5 != r7) goto L_0x0094
            boolean r5 = r4.f1671n     // Catch:{ Exception -> 0x00b4 }
            if (r5 == 0) goto L_0x008d
            goto L_0x00ae
        L_0x008d:
            b.j.a.c.b0.r r5 = r4.f1669l     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r3 = r5.c(r10)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00a5
        L_0x0094:
            b.j.a.c.f0.c r5 = r4.r     // Catch:{ Exception -> 0x00b4 }
            if (r5 != 0) goto L_0x009f
            b.j.a.c.j<java.lang.Object> r5 = r4.f1685q     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r3 = r5.d(r9, r10)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00a5
        L_0x009f:
            b.j.a.c.j<java.lang.Object> r7 = r4.f1685q     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r3 = r7.f(r9, r10, r5)     // Catch:{ Exception -> 0x00b4 }
        L_0x00a5:
            b.j.a.c.b0.z.w$b r5 = new b.j.a.c.b0.z.w$b
            b.j.a.c.b0.z.w r7 = r2.f1853h
            r5.<init>(r7, r3, r6)
            r2.f1853h = r5
        L_0x00ae:
            java.lang.String r3 = r9.R0()
            goto L_0x0025
        L_0x00b4:
            r9 = move-exception
            b.j.a.c.i r10 = r4.f1668k
            java.lang.Class<?> r10 = r10.f2152h
            r4.e0(r9, r10, r3)
            throw r1
        L_0x00bd:
            java.lang.Object r9 = r0.a(r10, r2)     // Catch:{ Exception -> 0x00c5 }
            java.util.EnumMap r9 = (java.util.EnumMap) r9     // Catch:{ Exception -> 0x00c5 }
            r1 = r9
            goto L_0x010a
        L_0x00c5:
            r9 = move-exception
            b.j.a.c.i r10 = r4.f1668k
            java.lang.Class<?> r10 = r10.f2152h
            r4.e0(r9, r10, r3)
            throw r1
        L_0x00ce:
            b.j.a.c.j<java.lang.Object> r0 = r8.t
            if (r0 == 0) goto L_0x00dd
            b.j.a.c.b0.x r1 = r8.s
            java.lang.Object r9 = r0.d(r9, r10)
            java.lang.Object r9 = r1.v(r10, r9)
            goto L_0x00fb
        L_0x00dd:
            b.j.a.b.l r0 = r9.g0()
            b.j.a.b.l r2 = b.j.a.b.l.START_OBJECT
            if (r0 == r2) goto L_0x0103
            b.j.a.b.l r2 = b.j.a.b.l.FIELD_NAME
            if (r0 == r2) goto L_0x0103
            b.j.a.b.l r2 = b.j.a.b.l.END_OBJECT
            if (r0 == r2) goto L_0x0103
            b.j.a.b.l r2 = b.j.a.b.l.VALUE_STRING
            if (r0 != r2) goto L_0x00ff
            b.j.a.c.b0.x r0 = r8.s
            java.lang.String r9 = r9.x0()
            java.lang.Object r9 = r0.r(r10, r9)
        L_0x00fb:
            r1 = r9
            java.util.EnumMap r1 = (java.util.EnumMap) r1
            goto L_0x010a
        L_0x00ff:
            r8.w(r9, r10)
            goto L_0x010a
        L_0x0103:
            java.util.EnumMap r1 = r8.f0(r10)
            r8.g0(r9, r10, r1)
        L_0x010a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.j.d(b.j.a.b.i, b.j.a.c.g):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        EnumMap enumMap = (EnumMap) obj;
        g0(iVar, gVar, enumMap);
        return enumMap;
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.d(iVar, gVar);
    }

    public EnumMap<?, ?> f0(g gVar) {
        x xVar = this.s;
        if (xVar == null) {
            return new EnumMap<>(this.f1683o);
        }
        try {
            if (xVar.i()) {
                return (EnumMap) this.s.u(gVar);
            }
            gVar.D(this.f1761h, (x) null, (b.j.a.b.i) null, "no default constructor found", new Object[0]);
            throw null;
        } catch (IOException e2) {
            b.j.a.c.j0.g.B(gVar, e2);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.EnumMap<?, ?> g0(b.j.a.b.i r9, b.j.a.c.g r10, java.util.EnumMap r11) {
        /*
            r8 = this;
            r9.Y0(r11)
            b.j.a.c.j<java.lang.Object> r0 = r8.f1685q
            b.j.a.c.f0.c r1 = r8.r
            boolean r2 = r9.P0()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0014
        L_0x000f:
            java.lang.String r2 = r9.R0()
            goto L_0x002b
        L_0x0014:
            b.j.a.b.l r2 = r9.g0()
            b.j.a.b.l r5 = b.j.a.b.l.FIELD_NAME
            if (r2 == r5) goto L_0x0027
            b.j.a.b.l r9 = b.j.a.b.l.END_OBJECT
            if (r2 != r9) goto L_0x0021
            return r11
        L_0x0021:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r10.b0(r8, r5, r4, r9)
            throw r4
        L_0x0027:
            java.lang.String r2 = r9.e0()
        L_0x002b:
            if (r2 == 0) goto L_0x007e
            b.j.a.c.o r5 = r8.f1684p
            java.lang.Object r5 = r5.a(r2, r10)
            java.lang.Enum r5 = (java.lang.Enum) r5
            b.j.a.b.l r6 = r9.T0()
            if (r5 != 0) goto L_0x005a
            b.j.a.c.h r5 = b.j.a.c.h.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r5 = r10.O(r5)
            if (r5 == 0) goto L_0x0047
            r9.a1()
            goto L_0x000f
        L_0x0047:
            java.lang.Class<?> r9 = r8.f1683o
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]
            b.j.a.c.i r0 = r8.f1668k
            b.j.a.c.i r0 = r0.n()
            r11[r3] = r0
            java.lang.String r0 = "value not one of declared Enum instance names for %s"
            r10.L(r9, r2, r0, r11)
            throw r4
        L_0x005a:
            b.j.a.b.l r7 = b.j.a.b.l.VALUE_NULL     // Catch:{ Exception -> 0x0079 }
            if (r6 != r7) goto L_0x006a
            boolean r6 = r8.f1671n     // Catch:{ Exception -> 0x0079 }
            if (r6 == 0) goto L_0x0063
            goto L_0x000f
        L_0x0063:
            b.j.a.c.b0.r r6 = r8.f1669l     // Catch:{ Exception -> 0x0079 }
            java.lang.Object r2 = r6.c(r10)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0075
        L_0x006a:
            if (r1 != 0) goto L_0x0071
            java.lang.Object r2 = r0.d(r9, r10)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0075
        L_0x0071:
            java.lang.Object r2 = r0.f(r9, r10, r1)     // Catch:{ Exception -> 0x0079 }
        L_0x0075:
            r11.put(r5, r2)
            goto L_0x000f
        L_0x0079:
            r9 = move-exception
            r8.e0(r9, r11, r2)
            throw r4
        L_0x007e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.j.g0(b.j.a.b.i, b.j.a.c.g, java.util.EnumMap):java.util.EnumMap");
    }

    public Object i(g gVar) {
        return f0(gVar);
    }

    public boolean m() {
        return this.f1685q == null && this.f1684p == null && this.r == null;
    }
}
