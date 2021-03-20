package b.j.a.c.b0.a0;

import b.j.a.a.k;
import b.j.a.b.l;
import b.j.a.c.b0.i;
import b.j.a.c.b0.r;
import b.j.a.c.b0.z.p;
import b.j.a.c.d;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.h;
import b.j.a.c.j;
import b.j.a.c.j0.t;
import b.j.a.c.z.a;

@a
public final class e0 extends z<String[]> implements i {

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f1655o = new String[0];

    /* renamed from: p  reason: collision with root package name */
    public static final e0 f1656p = new e0();

    /* renamed from: k  reason: collision with root package name */
    public j<String> f1657k;

    /* renamed from: l  reason: collision with root package name */
    public final r f1658l;

    /* renamed from: m  reason: collision with root package name */
    public final Boolean f1659m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1660n;

    public e0() {
        super((Class<?>) String[].class);
        this.f1657k = null;
        this.f1658l = null;
        this.f1659m = null;
        this.f1660n = p.a((r) null);
    }

    public e0(j<?> jVar, r rVar, Boolean bool) {
        super((Class<?>) String[].class);
        this.f1657k = jVar;
        this.f1658l = rVar;
        this.f1659m = bool;
        this.f1660n = p.a(rVar);
    }

    public j<?> a(g gVar, d dVar) {
        j X = X(gVar, dVar, this.f1657k);
        b.j.a.c.i n2 = gVar.n(String.class);
        j q2 = X == null ? gVar.q(n2, dVar) : gVar.F(X, dVar, n2);
        k.a aVar = k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        k.d Y = Y(gVar, dVar, String[].class);
        Boolean b2 = Y != null ? Y.b(aVar) : null;
        r W = W(gVar, dVar, q2);
        if (q2 != null && b.j.a.c.j0.g.u(q2)) {
            q2 = null;
        }
        return (this.f1657k == q2 && this.f1659m == b2 && this.f1658l == W) ? this : new e0(q2, W, b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[Catch:{ Exception -> 0x0055 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] c0(b.j.a.b.i r8, b.j.a.c.g r9, java.lang.String[] r10) {
        /*
            r7 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            b.j.a.c.j0.t r1 = r9.R()
            r2 = 0
            if (r10 != 0) goto L_0x000f
            java.lang.Object[] r10 = r1.g()
            r3 = r2
            goto L_0x0014
        L_0x000f:
            int r3 = r10.length
            java.lang.Object[] r10 = r1.h(r10, r3)
        L_0x0014:
            b.j.a.c.j<java.lang.String> r4 = r7.f1657k
        L_0x0016:
            java.lang.String r5 = r8.S0()     // Catch:{ Exception -> 0x0055 }
            if (r5 != 0) goto L_0x003e
            b.j.a.b.l r5 = r8.g0()     // Catch:{ Exception -> 0x0055 }
            b.j.a.b.l r6 = b.j.a.b.l.END_ARRAY     // Catch:{ Exception -> 0x0055 }
            if (r5 != r6) goto L_0x002e
            java.lang.Object[] r8 = r1.f(r10, r3, r0)
            java.lang.String[] r8 = (java.lang.String[]) r8
            r9.c0(r1)
            return r8
        L_0x002e:
            b.j.a.b.l r6 = b.j.a.b.l.VALUE_NULL     // Catch:{ Exception -> 0x0055 }
            if (r5 != r6) goto L_0x003e
            boolean r5 = r7.f1660n     // Catch:{ Exception -> 0x0055 }
            if (r5 == 0) goto L_0x0037
            goto L_0x0016
        L_0x0037:
            b.j.a.c.b0.r r5 = r7.f1658l     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r5 = r5.c(r9)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0042
        L_0x003e:
            java.lang.Object r5 = r4.d(r8, r9)     // Catch:{ Exception -> 0x0055 }
        L_0x0042:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0055 }
            int r6 = r10.length     // Catch:{ Exception -> 0x0055 }
            if (r3 < r6) goto L_0x004c
            java.lang.Object[] r10 = r1.c(r10)     // Catch:{ Exception -> 0x0055 }
            r3 = r2
        L_0x004c:
            int r6 = r3 + 1
            r10[r3] = r5     // Catch:{ Exception -> 0x0052 }
            r3 = r6
            goto L_0x0016
        L_0x0052:
            r8 = move-exception
            r3 = r6
            goto L_0x0056
        L_0x0055:
            r8 = move-exception
        L_0x0056:
            b.j.a.c.k r8 = b.j.a.c.k.g(r8, r0, r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.e0.c0(b.j.a.b.i, b.j.a.c.g, java.lang.String[]):java.lang.String[]");
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        if (!iVar.O0()) {
            return d0(iVar, gVar);
        }
        if (this.f1657k != null) {
            return c0(iVar, gVar, (String[]) null);
        }
        t R = gVar.R();
        Object[] g2 = R.g();
        int i2 = 0;
        while (true) {
            try {
                String S0 = iVar.S0();
                if (S0 == null) {
                    l g0 = iVar.g0();
                    if (g0 == l.END_ARRAY) {
                        String[] strArr = (String[]) R.f(g2, i2, String.class);
                        gVar.c0(R);
                        return strArr;
                    } else if (g0 != l.VALUE_NULL) {
                        S0 = O(iVar, gVar);
                    } else if (!this.f1660n) {
                        S0 = (String) this.f1658l.c(gVar);
                    }
                }
                if (i2 >= g2.length) {
                    g2 = R.c(g2);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                try {
                    g2[i2] = S0;
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
    }

    public final String[] d0(b.j.a.b.i iVar, g gVar) {
        Boolean bool = this.f1659m;
        if (bool == Boolean.TRUE || (bool == null && gVar.O(h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return new String[]{iVar.L0(l.VALUE_NULL) ? (String) this.f1658l.c(gVar) : O(iVar, gVar)};
        } else if (iVar.L0(l.VALUE_STRING) && gVar.O(h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && iVar.x0().length() == 0) {
            return null;
        } else {
            gVar.G(this.f1761h, iVar);
            throw null;
        }
    }

    public Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        String[] strArr = (String[]) obj;
        if (!iVar.O0()) {
            String[] d0 = d0(iVar, gVar);
            if (d0 == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[(d0.length + length)];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(d0, 0, strArr2, length, d0.length);
            return strArr2;
        } else if (this.f1657k != null) {
            return c0(iVar, gVar, strArr);
        } else {
            t R = gVar.R();
            int length2 = strArr.length;
            Object[] h2 = R.h(strArr, length2);
            while (true) {
                try {
                    String S0 = iVar.S0();
                    if (S0 == null) {
                        l g0 = iVar.g0();
                        if (g0 == l.END_ARRAY) {
                            String[] strArr3 = (String[]) R.f(h2, length2, String.class);
                            gVar.c0(R);
                            return strArr3;
                        } else if (g0 != l.VALUE_NULL) {
                            S0 = O(iVar, gVar);
                        } else if (this.f1660n) {
                            return f1655o;
                        } else {
                            S0 = (String) this.f1658l.c(gVar);
                        }
                    }
                    if (length2 >= h2.length) {
                        h2 = R.c(h2);
                        length2 = 0;
                    }
                    int i2 = length2 + 1;
                    try {
                        h2[length2] = S0;
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
        }
    }

    public Object f(b.j.a.b.i iVar, g gVar, c cVar) {
        return cVar.c(iVar, gVar);
    }

    public b.j.a.c.j0.a h() {
        return b.j.a.c.j0.a.CONSTANT;
    }

    public Object i(g gVar) {
        return f1655o;
    }

    public Boolean n(f fVar) {
        return Boolean.TRUE;
    }
}
