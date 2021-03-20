package b.j.a.c.b0.z;

import b.j.a.b.l;
import b.j.a.c.b0.u;
import b.j.a.c.f0.c;
import b.j.a.c.h;
import b.j.a.c.i;
import b.j.a.c.j0.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class g {
    public final i a;

    /* renamed from: b  reason: collision with root package name */
    public final b[] f1828b;
    public final Map<String, Object> c;
    public final String[] d;

    /* renamed from: e  reason: collision with root package name */
    public final z[] f1829e;

    public static class a {
        public final i a;

        /* renamed from: b  reason: collision with root package name */
        public final List<b> f1830b = new ArrayList();
        public final Map<String, Object> c = new HashMap();

        public a(i iVar) {
            this.a = iVar;
        }

        public final void a(String str, Integer num) {
            Object obj = this.c.get(str);
            if (obj == null) {
                this.c.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this.c.put(str, linkedList);
            }
        }
    }

    public static final class b {
        public final u a;

        /* renamed from: b  reason: collision with root package name */
        public final c f1831b;
        public final String c;
        public u d;

        public b(u uVar, c cVar) {
            this.a = uVar;
            this.f1831b = cVar;
            this.c = cVar.h();
        }

        public String a() {
            Class<?> g2 = this.f1831b.g();
            if (g2 == null) {
                return null;
            }
            return this.f1831b.i().a((Object) null, g2);
        }
    }

    public g(g gVar) {
        this.a = gVar.a;
        b[] bVarArr = gVar.f1828b;
        this.f1828b = bVarArr;
        this.c = gVar.c;
        int length = bVarArr.length;
        this.d = new String[length];
        this.f1829e = new z[length];
    }

    public g(i iVar, b[] bVarArr, Map<String, Object> map, String[] strArr, z[] zVarArr) {
        this.a = iVar;
        this.f1828b = bVarArr;
        this.c = map;
        this.d = null;
        this.f1829e = null;
    }

    public final void a(b.j.a.b.i iVar, b.j.a.c.g gVar, Object obj, int i2, String str) {
        b.j.a.b.i e1 = this.f1829e[i2].e1(iVar);
        if (e1.T0() == l.VALUE_NULL) {
            this.f1828b[i2].a.B(obj, (Object) null);
            return;
        }
        z zVar = new z(iVar, gVar);
        zVar.L0();
        zVar.Q0(str);
        zVar.g1(e1);
        zVar.q0();
        b.j.a.b.i e12 = zVar.e1(iVar);
        e12.T0();
        this.f1828b[i2].a.f(e12, gVar, obj);
    }

    public final boolean b(b.j.a.b.i iVar, b.j.a.c.g gVar, String str, Object obj, String str2, int i2) {
        boolean z = false;
        if (!str.equals(this.f1828b[i2].c)) {
            return false;
        }
        if (!(obj == null || this.f1829e[i2] == null)) {
            z = true;
        }
        if (z) {
            a(iVar, gVar, obj, i2, str2);
            this.f1829e[i2] = null;
        } else {
            this.d[i2] = str2;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.String} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(b.j.a.b.i r12, b.j.a.c.g r13, b.j.a.c.b0.z.x r14, b.j.a.c.b0.z.u r15) {
        /*
            r11 = this;
            b.j.a.c.b0.z.g$b[] r0 = r11.f1828b
            int r0 = r0.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L_0x0007:
            if (r3 >= r0) goto L_0x00d0
            java.lang.String[] r4 = r11.d
            r4 = r4[r3]
            b.j.a.c.b0.z.g$b[] r5 = r11.f1828b
            r6 = r5[r3]
            r7 = 1
            r8 = 0
            if (r4 != 0) goto L_0x003d
            b.j.a.c.j0.z[] r4 = r11.f1829e
            r4 = r4[r3]
            if (r4 != 0) goto L_0x001d
            goto L_0x00b3
        L_0x001d:
            b.j.a.c.f0.c r4 = r6.f1831b
            java.lang.Class r4 = r4.g()
            if (r4 == 0) goto L_0x0027
            r4 = r7
            goto L_0x0028
        L_0x0027:
            r4 = r2
        L_0x0028:
            if (r4 == 0) goto L_0x002f
            java.lang.String r4 = r6.a()
            goto L_0x0043
        L_0x002f:
            b.j.a.c.i r12 = r11.a
            java.lang.Object[] r14 = new java.lang.Object[r7]
            java.lang.String r15 = r6.c
            r14[r2] = r15
            java.lang.String r15 = "Missing external type id property '%s'"
            r13.X(r12, r15, r14)
            throw r8
        L_0x003d:
            b.j.a.c.j0.z[] r9 = r11.f1829e
            r9 = r9[r3]
            if (r9 == 0) goto L_0x00b7
        L_0x0043:
            b.j.a.c.j0.z[] r5 = r11.f1829e
            r5 = r5[r3]
            b.j.a.b.i r5 = r5.e1(r12)
            b.j.a.b.l r9 = r5.T0()
            b.j.a.b.l r10 = b.j.a.b.l.VALUE_NULL
            if (r9 != r10) goto L_0x0054
            goto L_0x0076
        L_0x0054:
            b.j.a.c.j0.z r8 = new b.j.a.c.j0.z
            r8.<init>((b.j.a.b.i) r12, (b.j.a.c.g) r13)
            r8.L0()
            r8.Q0(r4)
            r8.g1(r5)
            r8.q0()
            b.j.a.b.i r5 = r8.e1(r12)
            r5.T0()
            b.j.a.c.b0.z.g$b[] r8 = r11.f1828b
            r8 = r8[r3]
            b.j.a.c.b0.u r8 = r8.a
            java.lang.Object r8 = r8.c(r5, r13)
        L_0x0076:
            r1[r3] = r8
            b.j.a.c.b0.u r5 = r6.a
            int r8 = r5.n()
            if (r8 < 0) goto L_0x00b3
            r8 = r1[r3]
            r14.b(r5, r8)
            b.j.a.c.b0.u r5 = r6.d
            if (r5 == 0) goto L_0x00b3
            int r6 = r5.n()
            if (r6 < 0) goto L_0x00b3
            b.j.a.c.i r6 = r5.f1797l
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class<?> r6 = r6.f2152h
            if (r6 != r8) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r7 = r2
        L_0x0099:
            if (r7 == 0) goto L_0x009c
            goto L_0x00b0
        L_0x009c:
            b.j.a.c.j0.z r6 = new b.j.a.c.j0.z
            r6.<init>((b.j.a.b.i) r12, (b.j.a.c.g) r13)
            r6.Q0(r4)
            b.j.a.c.j r4 = r5.u()
            b.j.a.b.i r6 = r6.f1()
            java.lang.Object r4 = r4.d(r6, r13)
        L_0x00b0:
            r14.b(r5, r4)
        L_0x00b3:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x00b7:
            b.j.a.c.b0.u r12 = r6.a
            b.j.a.c.i r14 = r11.a
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            b.j.a.c.t r12 = r12.f1796k
            java.lang.String r12 = r12.f2305h
            r15[r2] = r12
            r12 = r5[r3]
            java.lang.String r12 = r12.c
            r15[r7] = r12
            java.lang.String r12 = "Missing property '%s' for external type id '%s'"
            r13.X(r14, r12, r15)
            throw r8
        L_0x00d0:
            java.lang.Object r12 = r15.a(r13, r14)
        L_0x00d4:
            if (r2 >= r0) goto L_0x00ea
            b.j.a.c.b0.z.g$b[] r13 = r11.f1828b
            r13 = r13[r2]
            b.j.a.c.b0.u r13 = r13.a
            int r14 = r13.n()
            if (r14 >= 0) goto L_0x00e7
            r14 = r1[r2]
            r13.B(r12, r14)
        L_0x00e7:
            int r2 = r2 + 1
            goto L_0x00d4
        L_0x00ea:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.z.g.c(b.j.a.b.i, b.j.a.c.g, b.j.a.c.b0.z.x, b.j.a.c.b0.z.u):java.lang.Object");
    }

    public Object d(b.j.a.b.i iVar, b.j.a.c.g gVar, Object obj) {
        int length = this.f1828b.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = this.d[i2];
            z[] zVarArr = this.f1829e;
            if (str == null) {
                z zVar = zVarArr[i2];
                if (zVar == null) {
                    continue;
                } else if (zVar.f2262p.k(0).f1445o) {
                    b.j.a.b.i e1 = zVar.e1(iVar);
                    e1.T0();
                    u uVar = this.f1828b[i2].a;
                    Object a2 = c.a(e1, gVar, uVar.f1797l);
                    if (a2 != null) {
                        uVar.B(obj, a2);
                    } else {
                        if (this.f1828b[i2].f1831b.g() != null) {
                            str = this.f1828b[i2].a();
                        } else {
                            gVar.Z(obj.getClass(), "Missing external type id property '%s'", this.f1828b[i2].c);
                            throw null;
                        }
                    }
                }
            } else if (zVarArr[i2] == null) {
                u uVar2 = this.f1828b[i2].a;
                Boolean bool = uVar2.f1948h.f2295h;
                if (!(bool != null && bool.booleanValue()) && !gVar.O(h.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                    return obj;
                }
                gVar.Z(obj.getClass(), "Missing property '%s' for external type id '%s'", uVar2.f1796k.f2305h, this.f1828b[i2].c);
                throw null;
            }
            a(iVar, gVar, obj, i2, str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        if (r10.f1829e[r0] != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        if (r10.d[r0] != null) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(b.j.a.b.i r11, b.j.a.c.g r12, java.lang.String r13, java.lang.Object r14) {
        /*
            r10 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.c
            java.lang.Object r0 = r0.get(r13)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r2 = r0 instanceof java.util.List
            r3 = 1
            if (r2 == 0) goto L_0x0075
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
            java.lang.Object r0 = r14.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            b.j.a.c.b0.z.g$b[] r1 = r10.f1828b
            int r2 = r0.intValue()
            r1 = r1[r2]
            java.lang.String r1 = r1.c
            boolean r13 = r13.equals(r1)
            if (r13 == 0) goto L_0x004f
            java.lang.String r12 = r11.x0()
            r11.a1()
            java.lang.String[] r11 = r10.d
            int r13 = r0.intValue()
            r11[r13] = r12
        L_0x003a:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0074
            java.lang.String[] r11 = r10.d
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11[r13] = r12
            goto L_0x003a
        L_0x004f:
            b.j.a.c.j0.z r13 = new b.j.a.c.j0.z
            r13.<init>((b.j.a.b.i) r11, (b.j.a.c.g) r12)
            r13.g1(r11)
            b.j.a.c.j0.z[] r11 = r10.f1829e
            int r12 = r0.intValue()
            r11[r12] = r13
        L_0x005f:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0074
            b.j.a.c.j0.z[] r11 = r10.f1829e
            java.lang.Object r12 = r14.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11[r12] = r13
            goto L_0x005f
        L_0x0074:
            return r3
        L_0x0075:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            b.j.a.c.b0.z.g$b[] r2 = r10.f1828b
            r2 = r2[r0]
            java.lang.String r2 = r2.c
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L_0x009b
            java.lang.String[] r13 = r10.d
            java.lang.String r2 = r11.x0()
            r13[r0] = r2
            r11.a1()
            if (r14 == 0) goto L_0x00b0
            b.j.a.c.j0.z[] r13 = r10.f1829e
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00b0
            goto L_0x00af
        L_0x009b:
            b.j.a.c.j0.z r13 = new b.j.a.c.j0.z
            r13.<init>((b.j.a.b.i) r11, (b.j.a.c.g) r12)
            r13.g1(r11)
            b.j.a.c.j0.z[] r2 = r10.f1829e
            r2[r0] = r13
            if (r14 == 0) goto L_0x00b0
            java.lang.String[] r13 = r10.d
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00b0
        L_0x00af:
            r1 = r3
        L_0x00b0:
            if (r1 == 0) goto L_0x00c5
            java.lang.String[] r13 = r10.d
            r9 = r13[r0]
            r1 = 0
            r13[r0] = r1
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r0
            r4.a(r5, r6, r7, r8, r9)
            b.j.a.c.j0.z[] r11 = r10.f1829e
            r11[r0] = r1
        L_0x00c5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.b0.z.g.e(b.j.a.b.i, b.j.a.c.g, java.lang.String, java.lang.Object):boolean");
    }

    public boolean f(b.j.a.b.i iVar, b.j.a.c.g gVar, String str, Object obj) {
        Object obj2 = this.c.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String x0 = iVar.x0();
        if (obj2 instanceof List) {
            for (Integer intValue : (List) obj2) {
                if (b(iVar, gVar, str, obj, x0, intValue.intValue())) {
                    z = true;
                }
            }
            return z;
        }
        return b(iVar, gVar, str, obj, x0, ((Integer) obj2).intValue());
    }
}
