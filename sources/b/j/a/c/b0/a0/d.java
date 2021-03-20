package b.j.a.c.b0.a0;

import b.j.a.b.i;
import b.j.a.c.c0.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.g0.k;
import b.j.a.c.g0.m;
import b.j.a.c.g0.o;
import b.j.a.c.g0.p;
import b.j.a.c.h;
import b.j.a.c.j0.v;
import b.j.a.c.l;
import java.util.Objects;

public abstract class d<T extends l> extends z<T> {

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f1644k;

    public d(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this.f1644k = bool;
    }

    public final l c0(i iVar, k kVar) {
        Object o0 = iVar.o0();
        if (o0 == null) {
            Objects.requireNonNull(kVar);
            return m.f2018h;
        } else if (o0.getClass() == byte[].class) {
            byte[] bArr = (byte[]) o0;
            Objects.requireNonNull(kVar);
            return bArr.length == 0 ? b.j.a.c.g0.d.f2003i : new b.j.a.c.g0.d(bArr);
        } else if (o0 instanceof v) {
            Objects.requireNonNull(kVar);
            return new p((v) o0);
        } else if (o0 instanceof l) {
            return (l) o0;
        } else {
            Objects.requireNonNull(kVar);
            return new p(o0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.c.l d0(b.j.a.b.i r3, b.j.a.c.g r4, b.j.a.c.g0.k r5) {
        /*
            r2 = this;
            b.j.a.b.i$b r0 = b.j.a.b.i.b.LONG
            int r4 = r4.f1994k
            int r1 = b.j.a.c.b0.a0.z.f1759i
            r1 = r1 & r4
            if (r1 == 0) goto L_0x001e
            b.j.a.c.h r1 = b.j.a.c.h.USE_BIG_INTEGER_FOR_INTS
            boolean r1 = r1.h(r4)
            if (r1 == 0) goto L_0x0014
            b.j.a.b.i$b r4 = b.j.a.b.i.b.BIG_INTEGER
            goto L_0x0022
        L_0x0014:
            b.j.a.c.h r1 = b.j.a.c.h.USE_LONG_FOR_INTS
            boolean r4 = r1.h(r4)
            if (r4 == 0) goto L_0x001e
            r4 = r0
            goto L_0x0022
        L_0x001e:
            b.j.a.b.i$b r4 = r3.s0()
        L_0x0022:
            b.j.a.b.i$b r1 = b.j.a.b.i.b.INT
            if (r4 != r1) goto L_0x0042
            int r3 = r3.q0()
            java.util.Objects.requireNonNull(r5)
            r4 = 10
            if (r3 > r4) goto L_0x003b
            r4 = -1
            if (r3 >= r4) goto L_0x0035
            goto L_0x003b
        L_0x0035:
            b.j.a.c.g0.j[] r5 = b.j.a.c.g0.j.f2013i
            int r3 = r3 - r4
            r3 = r5[r3]
            goto L_0x0041
        L_0x003b:
            b.j.a.c.g0.j r4 = new b.j.a.c.g0.j
            r4.<init>(r3)
            r3 = r4
        L_0x0041:
            return r3
        L_0x0042:
            if (r4 != r0) goto L_0x0051
            long r3 = r3.r0()
            java.util.Objects.requireNonNull(r5)
            b.j.a.c.g0.l r5 = new b.j.a.c.g0.l
            r5.<init>(r3)
            return r5
        L_0x0051:
            java.math.BigInteger r3 = r3.H()
            java.util.Objects.requireNonNull(r5)
            if (r3 != 0) goto L_0x005d
            b.j.a.c.g0.m r3 = b.j.a.c.g0.m.f2018h
            goto L_0x0063
        L_0x005d:
            b.j.a.c.g0.c r4 = new b.j.a.c.g0.c
            r4.<init>(r3)
            r3 = r4
        L_0x0063:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.d.d0(b.j.a.b.i, b.j.a.c.g, b.j.a.c.g0.k):b.j.a.c.l");
    }

    public void e0(g gVar, String str) {
        if (gVar.O(h.FAIL_ON_READING_DUP_TREE_KEY)) {
            String b2 = gVar.b("Duplicate field '%s' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled", str);
            throw new f(gVar.f1996m, b2, (Class<?>) l.class);
        }
    }

    public Object f(i iVar, g gVar, c cVar) {
        return cVar.b(iVar, gVar);
    }

    public final l f0(i iVar, g gVar, k kVar) {
        int k0 = iVar.k0();
        if (k0 != 2) {
            switch (k0) {
                case 5:
                    return i0(iVar, gVar, kVar);
                case 6:
                    return kVar.c(iVar.x0());
                case 7:
                    return d0(iVar, gVar, kVar);
                case 8:
                    i.b s0 = iVar.s0();
                    if (s0 != i.b.BIG_DECIMAL) {
                        if (gVar.O(h.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            if (iVar.Q0()) {
                                double n0 = iVar.n0();
                                Objects.requireNonNull(kVar);
                                return new b.j.a.c.g0.h(n0);
                            }
                        } else if (s0 == i.b.FLOAT) {
                            float p0 = iVar.p0();
                            Objects.requireNonNull(kVar);
                            return new b.j.a.c.g0.i(p0);
                        } else {
                            double n02 = iVar.n0();
                            Objects.requireNonNull(kVar);
                            return new b.j.a.c.g0.h(n02);
                        }
                    }
                    return kVar.b(iVar.m0());
                case 9:
                    return kVar.a(true);
                case 10:
                    return kVar.a(false);
                case 11:
                    Objects.requireNonNull(kVar);
                    return m.f2018h;
                case 12:
                    return c0(iVar, kVar);
                default:
                    gVar.G(this.f1761h, iVar);
                    throw null;
            }
        } else {
            Objects.requireNonNull(kVar);
            return new o(kVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r0.f2001i.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r0.y(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r1 = r6.a(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.c.g0.a g0(b.j.a.b.i r4, b.j.a.c.g r5, b.j.a.c.g0.k r6) {
        /*
            r3 = this;
            java.util.Objects.requireNonNull(r6)
            b.j.a.c.g0.a r0 = new b.j.a.c.g0.a
            r0.<init>(r6)
        L_0x0008:
            b.j.a.b.l r1 = r4.T0()
            int r1 = r1.f1441k
            switch(r1) {
                case 1: goto L_0x003a;
                case 2: goto L_0x0011;
                case 3: goto L_0x0035;
                case 4: goto L_0x0034;
                case 5: goto L_0x0011;
                case 6: goto L_0x002b;
                case 7: goto L_0x0026;
                case 8: goto L_0x0011;
                case 9: goto L_0x0020;
                case 10: goto L_0x001e;
                case 11: goto L_0x001b;
                case 12: goto L_0x0016;
                default: goto L_0x0011;
            }
        L_0x0011:
            b.j.a.c.l r1 = r3.f0(r4, r5, r6)
            goto L_0x0044
        L_0x0016:
            b.j.a.c.l r1 = r3.c0(r4, r6)
            goto L_0x003e
        L_0x001b:
            b.j.a.c.g0.m r1 = b.j.a.c.g0.m.f2018h
            goto L_0x003e
        L_0x001e:
            r1 = 0
            goto L_0x0021
        L_0x0020:
            r1 = 1
        L_0x0021:
            b.j.a.c.g0.e r1 = r6.a(r1)
            goto L_0x003e
        L_0x0026:
            b.j.a.c.l r1 = r3.d0(r4, r5, r6)
            goto L_0x0044
        L_0x002b:
            java.lang.String r1 = r4.x0()
            b.j.a.c.g0.q r1 = r6.c(r1)
            goto L_0x0044
        L_0x0034:
            return r0
        L_0x0035:
            b.j.a.c.g0.a r1 = r3.g0(r4, r5, r6)
            goto L_0x0044
        L_0x003a:
            b.j.a.c.g0.o r1 = r3.h0(r4, r5, r6)
        L_0x003e:
            java.util.List<b.j.a.c.l> r2 = r0.f2001i
            r2.add(r1)
            goto L_0x0008
        L_0x0044:
            r0.y(r1)
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.d.g0(b.j.a.b.i, b.j.a.c.g, b.j.a.c.g0.k):b.j.a.c.g0.a");
    }

    public final o h0(i iVar, g gVar, k kVar) {
        Object obj;
        Object obj2 = m.f2018h;
        Objects.requireNonNull(kVar);
        o oVar = new o(kVar);
        while (true) {
            String R0 = iVar.R0();
            if (R0 == null) {
                return oVar;
            }
            b.j.a.b.l T0 = iVar.T0();
            if (T0 == null) {
                T0 = b.j.a.b.l.NOT_AVAILABLE;
            }
            int i2 = T0.f1441k;
            if (i2 == 1) {
                obj = h0(iVar, gVar, kVar);
            } else if (i2 == 3) {
                obj = g0(iVar, gVar, kVar);
            } else if (i2 == 6) {
                obj = kVar.c(iVar.x0());
            } else if (i2 != 7) {
                switch (i2) {
                    case 9:
                        obj = kVar.a(true);
                        break;
                    case 10:
                        obj = kVar.a(false);
                        break;
                    case 11:
                        obj = obj2;
                        break;
                    case 12:
                        obj = c0(iVar, kVar);
                        break;
                    default:
                        obj = f0(iVar, gVar, kVar);
                        break;
                }
            } else {
                obj = d0(iVar, gVar, kVar);
            }
            if (obj == null) {
                oVar.v();
                obj = obj2;
            }
            if (oVar.f2019i.put(R0, obj) != null) {
                e0(gVar, R0);
            }
        }
    }

    public final o i0(i iVar, g gVar, k kVar) {
        Object obj;
        Object obj2 = m.f2018h;
        Objects.requireNonNull(kVar);
        o oVar = new o(kVar);
        String e0 = iVar.e0();
        while (e0 != null) {
            b.j.a.b.l T0 = iVar.T0();
            if (T0 == null) {
                T0 = b.j.a.b.l.NOT_AVAILABLE;
            }
            int i2 = T0.f1441k;
            if (i2 == 1) {
                obj = h0(iVar, gVar, kVar);
            } else if (i2 == 3) {
                obj = g0(iVar, gVar, kVar);
            } else if (i2 == 6) {
                obj = kVar.c(iVar.x0());
            } else if (i2 != 7) {
                switch (i2) {
                    case 9:
                        obj = kVar.a(true);
                        break;
                    case 10:
                        obj = kVar.a(false);
                        break;
                    case 11:
                        obj = obj2;
                        break;
                    case 12:
                        obj = c0(iVar, kVar);
                        break;
                    default:
                        obj = f0(iVar, gVar, kVar);
                        break;
                }
            } else {
                obj = d0(iVar, gVar, kVar);
            }
            if (obj == null) {
                oVar.v();
                obj = obj2;
            }
            if (oVar.f2019i.put(e0, obj) != null) {
                e0(gVar, e0);
            }
            e0 = iVar.R0();
        }
        return oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r6.f2001i.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r6.y(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r1 = r0.a(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.c.l j0(b.j.a.b.i r4, b.j.a.c.g r5, b.j.a.c.g0.a r6) {
        /*
            r3 = this;
            b.j.a.c.f r0 = r5.f1993j
            b.j.a.c.g0.k r0 = r0.u
        L_0x0004:
            b.j.a.b.l r1 = r4.T0()
            int r1 = r1.f1441k
            switch(r1) {
                case 1: goto L_0x0039;
                case 2: goto L_0x000d;
                case 3: goto L_0x0034;
                case 4: goto L_0x0033;
                case 5: goto L_0x000d;
                case 6: goto L_0x002a;
                case 7: goto L_0x0025;
                case 8: goto L_0x000d;
                case 9: goto L_0x001f;
                case 10: goto L_0x001d;
                case 11: goto L_0x0017;
                case 12: goto L_0x0012;
                default: goto L_0x000d;
            }
        L_0x000d:
            b.j.a.c.l r1 = r3.f0(r4, r5, r0)
            goto L_0x0043
        L_0x0012:
            b.j.a.c.l r1 = r3.c0(r4, r0)
            goto L_0x003d
        L_0x0017:
            java.util.Objects.requireNonNull(r0)
            b.j.a.c.g0.m r1 = b.j.a.c.g0.m.f2018h
            goto L_0x003d
        L_0x001d:
            r1 = 0
            goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            b.j.a.c.g0.e r1 = r0.a(r1)
            goto L_0x003d
        L_0x0025:
            b.j.a.c.l r1 = r3.d0(r4, r5, r0)
            goto L_0x0043
        L_0x002a:
            java.lang.String r1 = r4.x0()
            b.j.a.c.g0.q r1 = r0.c(r1)
            goto L_0x0043
        L_0x0033:
            return r6
        L_0x0034:
            b.j.a.c.g0.a r1 = r3.g0(r4, r5, r0)
            goto L_0x003d
        L_0x0039:
            b.j.a.c.g0.o r1 = r3.h0(r4, r5, r0)
        L_0x003d:
            java.util.List<b.j.a.c.l> r2 = r6.f2001i
            r2.add(r1)
            goto L_0x0004
        L_0x0043:
            r6.y(r1)
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.d.j0(b.j.a.b.i, b.j.a.c.g, b.j.a.c.g0.a):b.j.a.c.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r3 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r3 != r4) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        if (r3 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        r11.v();
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a1, code lost:
        r11.f2019i.put(r1, r3);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.j.a.c.l k0(b.j.a.b.i r9, b.j.a.c.g r10, b.j.a.c.g0.o r11) {
        /*
            r8 = this;
            b.j.a.c.g0.m r0 = b.j.a.c.g0.m.f2018h
            boolean r1 = r9.P0()
            if (r1 == 0) goto L_0x000b
            r2 = r8
            goto L_0x00a6
        L_0x000b:
            b.j.a.b.l r1 = b.j.a.b.l.FIELD_NAME
            boolean r1 = r9.L0(r1)
            if (r1 != 0) goto L_0x001a
            java.lang.Object r9 = r8.d(r9, r10)
            b.j.a.c.l r9 = (b.j.a.c.l) r9
            return r9
        L_0x001a:
            java.lang.String r1 = r9.e0()
            r2 = r8
        L_0x001f:
            if (r1 == 0) goto L_0x00ac
            b.j.a.b.l r3 = r9.T0()
            java.util.Map<java.lang.String, b.j.a.c.l> r4 = r11.f2019i
            java.lang.Object r4 = r4.get(r1)
            b.j.a.c.l r4 = (b.j.a.c.l) r4
            if (r4 == 0) goto L_0x004c
            boolean r5 = r4 instanceof b.j.a.c.g0.o
            if (r5 == 0) goto L_0x003f
            r3 = r4
            b.j.a.c.g0.o r3 = (b.j.a.c.g0.o) r3
            b.j.a.c.l r3 = r2.k0(r9, r10, r3)
            if (r3 == r4) goto L_0x00a6
            if (r3 != 0) goto L_0x00a1
            goto L_0x009d
        L_0x003f:
            boolean r5 = r4 instanceof b.j.a.c.g0.a
            if (r5 == 0) goto L_0x004c
            r3 = r4
            b.j.a.c.g0.a r3 = (b.j.a.c.g0.a) r3
            r2.j0(r9, r10, r3)
            if (r3 == r4) goto L_0x00a6
            goto L_0x00a1
        L_0x004c:
            if (r3 != 0) goto L_0x0050
            b.j.a.b.l r3 = b.j.a.b.l.NOT_AVAILABLE
        L_0x0050:
            b.j.a.c.f r5 = r10.f1993j
            b.j.a.c.g0.k r5 = r5.u
            int r3 = r3.f1441k
            r6 = 1
            if (r3 == r6) goto L_0x0092
            r7 = 3
            if (r3 == r7) goto L_0x008d
            r7 = 6
            if (r3 == r7) goto L_0x0084
            r7 = 7
            if (r3 == r7) goto L_0x007f
            switch(r3) {
                case 9: goto L_0x007a;
                case 10: goto L_0x0074;
                case 11: goto L_0x006f;
                case 12: goto L_0x006a;
                default: goto L_0x0065;
            }
        L_0x0065:
            b.j.a.c.l r3 = r2.f0(r9, r10, r5)
            goto L_0x0096
        L_0x006a:
            b.j.a.c.l r3 = r2.c0(r9, r5)
            goto L_0x0096
        L_0x006f:
            java.util.Objects.requireNonNull(r5)
            r3 = r0
            goto L_0x0096
        L_0x0074:
            r3 = 0
            b.j.a.c.g0.e r3 = r5.a(r3)
            goto L_0x0096
        L_0x007a:
            b.j.a.c.g0.e r3 = r5.a(r6)
            goto L_0x0096
        L_0x007f:
            b.j.a.c.l r3 = r2.d0(r9, r10, r5)
            goto L_0x0096
        L_0x0084:
            java.lang.String r3 = r9.x0()
            b.j.a.c.g0.q r3 = r5.c(r3)
            goto L_0x0096
        L_0x008d:
            b.j.a.c.g0.a r3 = r2.g0(r9, r10, r5)
            goto L_0x0096
        L_0x0092:
            b.j.a.c.g0.o r3 = r2.h0(r9, r10, r5)
        L_0x0096:
            if (r4 == 0) goto L_0x009b
            r2.e0(r10, r1)
        L_0x009b:
            if (r3 != 0) goto L_0x00a1
        L_0x009d:
            r11.v()
            r3 = r0
        L_0x00a1:
            java.util.Map<java.lang.String, b.j.a.c.l> r4 = r11.f2019i
            r4.put(r1, r3)
        L_0x00a6:
            java.lang.String r1 = r9.R0()
            goto L_0x001f
        L_0x00ac:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.a0.d.k0(b.j.a.b.i, b.j.a.c.g, b.j.a.c.g0.o):b.j.a.c.l");
    }

    public boolean m() {
        return true;
    }

    public Boolean n(b.j.a.c.f fVar) {
        return this.f1644k;
    }
}
