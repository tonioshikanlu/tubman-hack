package b.j.a.c.b0;

import b.e.a.a.a;
import b.j.a.b.l;
import b.j.a.c.b0.z.r;
import b.j.a.c.b0.z.u;
import b.j.a.c.b0.z.w;
import b.j.a.c.b0.z.x;
import b.j.a.c.c;
import b.j.a.c.e0.i;
import b.j.a.c.f;
import b.j.a.c.g;
import b.j.a.c.j;
import b.j.a.c.j0.z;
import java.util.Map;
import java.util.Set;

public class h extends d {
    public final i E;
    public final b.j.a.c.i F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(e eVar, c cVar, b.j.a.c.i iVar, b.j.a.c.b0.z.c cVar2, Map<String, u> map, Set<String> set, boolean z, boolean z2) {
        super(eVar, cVar, cVar2, map, set, z, z2);
        this.F = iVar;
        this.E = eVar.f1783l;
        if (this.C != null) {
            StringBuilder y = a.y("Cannot use Object Id with Builder-based deserialization (type ");
            y.append(cVar.a);
            y.append(")");
            throw new IllegalArgumentException(y.toString());
        }
    }

    public h(h hVar, b.j.a.c.b0.z.c cVar) {
        super((d) hVar, cVar);
        this.E = hVar.E;
        this.F = hVar.F;
    }

    public h(h hVar, r rVar) {
        super((d) hVar, rVar);
        this.E = hVar.E;
        this.F = hVar.F;
    }

    public h(h hVar, b.j.a.c.j0.r rVar) {
        super((d) hVar, rVar);
        this.E = hVar.E;
        this.F = hVar.F;
    }

    public h(h hVar, Set<String> set) {
        super((d) hVar, set);
        this.E = hVar.E;
        this.F = hVar.F;
    }

    public Object A0(b.j.a.b.i iVar, g gVar, Object obj) {
        Class<?> cls = this.x ? gVar.f1995l : null;
        b.j.a.c.b0.z.g gVar2 = new b.j.a.c.b0.z.g(this.B);
        l g0 = iVar.g0();
        while (g0 == l.FIELD_NAME) {
            String e0 = iVar.e0();
            l T0 = iVar.T0();
            u v = this.s.v(e0);
            if (v != null) {
                if (T0.f1445o) {
                    gVar2.f(iVar, gVar, e0, obj);
                }
                if (cls == null || v.F(cls)) {
                    try {
                        obj = v.g(iVar, gVar, obj);
                    } catch (Exception e2) {
                        x0(e2, obj, e0, gVar);
                        throw null;
                    }
                } else {
                    iVar.a1();
                }
            } else {
                Set<String> set = this.v;
                if (set != null && set.contains(e0)) {
                    p0(iVar, gVar, obj, e0);
                } else if (!gVar2.e(iVar, gVar, e0, obj)) {
                    t tVar = this.u;
                    if (tVar != null) {
                        try {
                            tVar.b(iVar, gVar, obj, e0);
                        } catch (Exception e3) {
                            x0(e3, obj, e0, gVar);
                            throw null;
                        }
                    } else {
                        b0(iVar, gVar, obj, e0);
                    }
                }
            }
            g0 = iVar.T0();
        }
        gVar2.d(iVar, gVar, obj);
        return obj;
    }

    public Object B0(b.j.a.b.i iVar, g gVar, Object obj, z zVar) {
        Class<?> cls = this.x ? gVar.f1995l : null;
        l g0 = iVar.g0();
        while (true) {
            l lVar = l.FIELD_NAME;
            if (g0 == lVar) {
                String e0 = iVar.e0();
                u v = this.s.v(e0);
                iVar.T0();
                if (v == null) {
                    Set<String> set = this.v;
                    if (set == null || !set.contains(e0)) {
                        zVar.v.o(e0);
                        zVar.V0(lVar, e0);
                        zVar.g1(iVar);
                        t tVar = this.u;
                        if (tVar != null) {
                            tVar.b(iVar, gVar, obj, e0);
                        }
                    } else {
                        p0(iVar, gVar, obj, e0);
                    }
                } else if (cls == null || v.F(cls)) {
                    try {
                        obj = v.g(iVar, gVar, obj);
                    } catch (Exception e2) {
                        x0(e2, obj, e0, gVar);
                        throw null;
                    }
                } else {
                    iVar.a1();
                }
                g0 = iVar.T0();
            } else {
                zVar.r0();
                this.A.a(gVar, obj, zVar);
                return obj;
            }
        }
    }

    public final Object C0(b.j.a.b.i iVar, g gVar, Object obj, Class<?> cls) {
        l g0 = iVar.g0();
        while (g0 == l.FIELD_NAME) {
            String e0 = iVar.e0();
            iVar.T0();
            u v = this.s.v(e0);
            if (v == null) {
                s0(iVar, gVar, obj, e0);
            } else if (!v.F(cls)) {
                iVar.a1();
            } else {
                try {
                    obj = v.g(iVar, gVar, obj);
                } catch (Exception e2) {
                    x0(e2, obj, e0, gVar);
                    throw null;
                }
            }
            g0 = iVar.T0();
        }
        return obj;
    }

    public Object D0(g gVar, Object obj) {
        i iVar = this.E;
        if (iVar == null) {
            return obj;
        }
        try {
            return iVar.f1913k.invoke(obj, (Object[]) null);
        } catch (Exception e2) {
            y0(e2, gVar);
            throw null;
        }
    }

    public Object d(b.j.a.b.i iVar, g gVar) {
        Object i0;
        if (iVar.P0()) {
            iVar.T0();
            if (this.r) {
                Object u = this.f1771m.u(gVar);
                while (iVar.g0() == l.FIELD_NAME) {
                    String e0 = iVar.e0();
                    iVar.T0();
                    u v = this.s.v(e0);
                    if (v != null) {
                        try {
                            u = v.g(iVar, gVar, u);
                        } catch (Exception e2) {
                            x0(e2, u, e0, gVar);
                            throw null;
                        }
                    } else {
                        s0(iVar, gVar, u, e0);
                    }
                    iVar.T0();
                }
                return D0(gVar, u);
            }
        } else {
            switch (iVar.k0()) {
                case 2:
                case 5:
                    break;
                case 3:
                    i0 = i0(iVar, gVar);
                    break;
                case 6:
                    i0 = o0(iVar, gVar);
                    break;
                case 7:
                    i0 = l0(iVar, gVar);
                    break;
                case 8:
                    i0 = k0(iVar, gVar);
                    break;
                case 9:
                case 10:
                    i0 = j0(iVar, gVar);
                    break;
                case 12:
                    return iVar.o0();
                default:
                    gVar.G(this.f1769k.f2152h, iVar);
                    throw null;
            }
        }
        i0 = z0(iVar, gVar);
        return D0(gVar, i0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d0(b.j.a.b.i r10, b.j.a.c.g r11) {
        /*
            r9 = this;
            b.j.a.c.b0.z.u r0 = r9.f1774p
            b.j.a.c.b0.z.r r1 = r9.C
            b.j.a.c.b0.z.x r2 = new b.j.a.c.b0.z.x
            int r3 = r0.a
            r2.<init>(r10, r11, r3, r1)
            boolean r1 = r9.x
            r3 = 0
            if (r1 == 0) goto L_0x0013
            java.lang.Class<?> r1 = r11.f1995l
            goto L_0x0014
        L_0x0013:
            r1 = r3
        L_0x0014:
            b.j.a.b.l r4 = r10.g0()
            r5 = r3
        L_0x0019:
            b.j.a.b.l r6 = b.j.a.b.l.FIELD_NAME
            if (r4 != r6) goto L_0x0127
            java.lang.String r4 = r10.e0()
            r10.T0()
            b.j.a.c.b0.u r7 = r0.c(r4)
            if (r7 == 0) goto L_0x00d4
            if (r1 == 0) goto L_0x0037
            boolean r6 = r7.F(r1)
            if (r6 != 0) goto L_0x0037
            r10.a1()
            goto L_0x0121
        L_0x0037:
            java.lang.Object r6 = r7.c(r10, r11)
            boolean r6 = r2.b(r7, r6)
            if (r6 == 0) goto L_0x0121
            r10.T0()
            java.lang.Object r0 = r0.a(r11, r2)     // Catch:{ Exception -> 0x00cb }
            java.lang.Class r1 = r0.getClass()
            b.j.a.c.i r2 = r9.f1769k
            java.lang.Class<?> r2 = r2.f2152h
            if (r1 == r2) goto L_0x0057
            java.lang.Object r10 = r9.q0(r10, r11, r0, r5)
            return r10
        L_0x0057:
            if (r5 == 0) goto L_0x005c
            r9.r0(r11, r0, r5)
        L_0x005c:
            b.j.a.c.b0.z.c0[] r1 = r9.t
            if (r1 == 0) goto L_0x0063
            r9.t0(r11, r0)
        L_0x0063:
            b.j.a.c.b0.z.b0 r1 = r9.A
            if (r1 == 0) goto L_0x007f
            b.j.a.b.l r1 = b.j.a.b.l.START_OBJECT
            boolean r1 = r10.L0(r1)
            if (r1 == 0) goto L_0x0072
            r10.T0()
        L_0x0072:
            b.j.a.c.j0.z r1 = new b.j.a.c.j0.z
            r1.<init>((b.j.a.b.i) r10, (b.j.a.c.g) r11)
            r1.N0()
            java.lang.Object r10 = r9.B0(r10, r11, r0, r1)
            goto L_0x00ca
        L_0x007f:
            b.j.a.c.b0.z.g r1 = r9.B
            if (r1 == 0) goto L_0x0088
            java.lang.Object r10 = r9.A0(r10, r11, r0)
            goto L_0x00ca
        L_0x0088:
            boolean r1 = r9.x
            if (r1 == 0) goto L_0x0095
            java.lang.Class<?> r1 = r11.f1995l
            if (r1 == 0) goto L_0x0095
            java.lang.Object r10 = r9.C0(r10, r11, r0, r1)
            goto L_0x00ca
        L_0x0095:
            b.j.a.b.l r1 = r10.g0()
            b.j.a.b.l r2 = b.j.a.b.l.START_OBJECT
            if (r1 != r2) goto L_0x009f
            r2 = r9
            goto L_0x00c4
        L_0x009f:
            r2 = r9
        L_0x00a0:
            b.j.a.b.l r4 = b.j.a.b.l.FIELD_NAME
            if (r1 != r4) goto L_0x00c9
            java.lang.String r1 = r10.e0()
            r10.T0()
            b.j.a.c.b0.z.c r4 = r2.s
            b.j.a.c.b0.u r4 = r4.v(r1)
            if (r4 == 0) goto L_0x00bd
            java.lang.Object r0 = r4.g(r10, r11, r0)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00c4
        L_0x00b8:
            r10 = move-exception
            r2.x0(r10, r0, r1, r11)
            throw r3
        L_0x00bd:
            b.j.a.c.i r4 = r2.f1769k
            java.lang.Class<?> r4 = r4.f2152h
            r2.s0(r10, r11, r4, r1)
        L_0x00c4:
            b.j.a.b.l r1 = r10.T0()
            goto L_0x00a0
        L_0x00c9:
            r10 = r0
        L_0x00ca:
            return r10
        L_0x00cb:
            r10 = move-exception
            b.j.a.c.i r0 = r9.f1769k
            java.lang.Class<?> r0 = r0.f2152h
            r9.x0(r10, r0, r4, r11)
            throw r3
        L_0x00d4:
            boolean r7 = r2.d(r4)
            if (r7 == 0) goto L_0x00db
            goto L_0x0121
        L_0x00db:
            b.j.a.c.b0.z.c r7 = r9.s
            b.j.a.c.b0.u r7 = r7.v(r4)
            if (r7 == 0) goto L_0x00f1
            java.lang.Object r4 = r7.c(r10, r11)
            b.j.a.c.b0.z.w$c r6 = new b.j.a.c.b0.z.w$c
            b.j.a.c.b0.z.w r8 = r2.f1853h
            r6.<init>(r8, r4, r7)
            r2.f1853h = r6
            goto L_0x0121
        L_0x00f1:
            java.util.Set<java.lang.String> r7 = r9.v
            if (r7 == 0) goto L_0x0103
            boolean r7 = r7.contains(r4)
            if (r7 == 0) goto L_0x0103
            b.j.a.c.i r6 = r9.f1769k
            java.lang.Class<?> r6 = r6.f2152h
            r9.p0(r10, r11, r6, r4)
            goto L_0x0121
        L_0x0103:
            b.j.a.c.b0.t r7 = r9.u
            if (r7 == 0) goto L_0x010f
            java.lang.Object r6 = r7.a(r10, r11)
            r2.c(r7, r4, r6)
            goto L_0x0121
        L_0x010f:
            if (r5 != 0) goto L_0x0116
            b.j.a.c.j0.z r5 = new b.j.a.c.j0.z
            r5.<init>((b.j.a.b.i) r10, (b.j.a.c.g) r11)
        L_0x0116:
            b.j.a.b.t.e r7 = r5.v
            r7.o(r4)
            r5.V0(r6, r4)
            r5.g1(r10)
        L_0x0121:
            b.j.a.b.l r4 = r10.T0()
            goto L_0x0019
        L_0x0127:
            java.lang.Object r10 = r0.a(r11, r2)     // Catch:{ Exception -> 0x0140 }
            if (r5 == 0) goto L_0x013f
            java.lang.Class r0 = r10.getClass()
            b.j.a.c.i r1 = r9.f1769k
            java.lang.Class<?> r1 = r1.f2152h
            if (r0 == r1) goto L_0x013c
            java.lang.Object r10 = r9.q0(r3, r11, r10, r5)
            return r10
        L_0x013c:
            r9.r0(r11, r10, r5)
        L_0x013f:
            return r10
        L_0x0140:
            r10 = move-exception
            r9.y0(r10, r11)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.h.d0(b.j.a.b.i, b.j.a.c.g):java.lang.Object");
    }

    public Object e(b.j.a.b.i iVar, g gVar, Object obj) {
        b.j.a.c.i iVar2 = this.F;
        Class<?> cls = this.f1769k.f2152h;
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            gVar.l(iVar2, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", new Object[]{iVar2, cls.getName()}));
            throw null;
        }
        gVar.l(iVar2, String.format("Deserialization of %s by passing existing instance (of %s) not supported", new Object[]{iVar2, cls2.getName()}));
        throw null;
    }

    public d h0() {
        return new b.j.a.c.b0.z.a(this, this.F, this.s.f1813m, this.E);
    }

    public Boolean n(f fVar) {
        return Boolean.FALSE;
    }

    public j<Object> o(b.j.a.c.j0.r rVar) {
        return new h(this, rVar);
    }

    public d u0(b.j.a.c.b0.z.c cVar) {
        return new h(this, cVar);
    }

    public d v0(Set<String> set) {
        return new h(this, set);
    }

    public d w0(r rVar) {
        return new h(this, rVar);
    }

    public Object z0(b.j.a.b.i iVar, g gVar) {
        Class<?> cls;
        if (!this.f1775q) {
            Object u = this.f1771m.u(gVar);
            if (this.t != null) {
                t0(gVar, u);
            }
            if (this.x && (cls = gVar.f1995l) != null) {
                return C0(iVar, gVar, u, cls);
            }
            while (iVar.g0() == l.FIELD_NAME) {
                String e0 = iVar.e0();
                iVar.T0();
                u v = this.s.v(e0);
                if (v != null) {
                    try {
                        u = v.g(iVar, gVar, u);
                    } catch (Exception e2) {
                        x0(e2, u, e0, gVar);
                        throw null;
                    }
                } else {
                    s0(iVar, gVar, u, e0);
                }
                iVar.T0();
            }
            return u;
        } else if (this.A != null) {
            j<Object> jVar = this.f1772n;
            if (jVar != null) {
                return this.f1771m.v(gVar, jVar.d(iVar, gVar));
            }
            u uVar = this.f1774p;
            if (uVar != null) {
                x xVar = new x(iVar, gVar, uVar.a, this.C);
                z zVar = new z(iVar, gVar);
                zVar.N0();
                l g0 = iVar.g0();
                while (true) {
                    l lVar = l.FIELD_NAME;
                    if (g0 == lVar) {
                        String e02 = iVar.e0();
                        iVar.T0();
                        u c = uVar.c(e02);
                        if (c != null) {
                            if (xVar.b(c, c.c(iVar, gVar))) {
                                iVar.T0();
                                try {
                                    Object a = uVar.a(gVar, xVar);
                                    return a.getClass() != this.f1769k.f2152h ? q0(iVar, gVar, a, zVar) : B0(iVar, gVar, a, zVar);
                                } catch (Exception e3) {
                                    x0(e3, this.f1769k.f2152h, e02, gVar);
                                    throw null;
                                }
                            }
                        } else if (!xVar.d(e02)) {
                            u v2 = this.s.v(e02);
                            if (v2 != null) {
                                xVar.f1853h = new w.c(xVar.f1853h, v2.c(iVar, gVar), v2);
                            } else {
                                Set<String> set = this.v;
                                if (set == null || !set.contains(e02)) {
                                    zVar.v.o(e02);
                                    zVar.V0(lVar, e02);
                                    zVar.g1(iVar);
                                    t tVar = this.u;
                                    if (tVar != null) {
                                        xVar.c(tVar, e02, tVar.a(iVar, gVar));
                                    }
                                } else {
                                    p0(iVar, gVar, this.f1769k.f2152h, e02);
                                }
                            }
                        }
                        g0 = iVar.T0();
                    } else {
                        zVar.r0();
                        try {
                            Object a2 = uVar.a(gVar, xVar);
                            this.A.a(gVar, a2, zVar);
                            return a2;
                        } catch (Exception e4) {
                            y0(e4, gVar);
                            throw null;
                        }
                    }
                }
            } else {
                z zVar2 = new z(iVar, gVar);
                zVar2.N0();
                Object u2 = this.f1771m.u(gVar);
                if (this.t != null) {
                    t0(gVar, u2);
                }
                Class<?> cls2 = this.x ? gVar.f1995l : null;
                while (true) {
                    l g02 = iVar.g0();
                    l lVar2 = l.FIELD_NAME;
                    if (g02 == lVar2) {
                        String e03 = iVar.e0();
                        iVar.T0();
                        u v3 = this.s.v(e03);
                        if (v3 == null) {
                            Set<String> set2 = this.v;
                            if (set2 == null || !set2.contains(e03)) {
                                zVar2.v.o(e03);
                                zVar2.V0(lVar2, e03);
                                zVar2.g1(iVar);
                                t tVar2 = this.u;
                                if (tVar2 != null) {
                                    try {
                                        tVar2.b(iVar, gVar, u2, e03);
                                    } catch (Exception e5) {
                                        x0(e5, u2, e03, gVar);
                                        throw null;
                                    }
                                }
                            } else {
                                p0(iVar, gVar, u2, e03);
                            }
                        } else if (cls2 == null || v3.F(cls2)) {
                            try {
                                u2 = v3.g(iVar, gVar, u2);
                            } catch (Exception e6) {
                                x0(e6, u2, e03, gVar);
                                throw null;
                            }
                        } else {
                            iVar.a1();
                        }
                        iVar.T0();
                    } else {
                        zVar2.r0();
                        this.A.a(gVar, u2, zVar2);
                        return u2;
                    }
                }
            }
        } else if (this.B == null) {
            return n0(iVar, gVar);
        } else {
            if (this.f1774p == null) {
                return A0(iVar, gVar, this.f1771m.u(gVar));
            }
            b.j.a.c.i iVar2 = this.F;
            gVar.l(iVar2, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", new Object[]{iVar2}));
            throw null;
        }
    }
}
