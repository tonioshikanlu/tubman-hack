package e.a.a.a;

import e.a.a.a.e;
import e.a.a.a.y0.b.g0;
import e.a.a.a.y0.b.h0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.e.a0.b.e;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.j.w.c;
import e.x.c.i;

public final class t0 {
    public static final a a;

    /* renamed from: b  reason: collision with root package name */
    public static final t0 f7583b = null;

    static {
        a l2 = a.l(new b("java.lang.Void"));
        i.d(l2, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        a = l2;
    }

    public static final e.a.a.a.y0.a.i a(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        c e2 = c.e(cls.getSimpleName());
        i.d(e2, "JvmPrimitiveType.get(simpleName)");
        return e2.l();
    }

    public static final e.C0130e b(s sVar) {
        String T0 = b.q.a.a.T0(sVar);
        if (T0 == null) {
            T0 = sVar instanceof g0 ? e.a.a.a.y0.d.a.s.b(e.a.a.a.y0.j.v.b.m(sVar).getName().e()) : sVar instanceof h0 ? e.a.a.a.y0.d.a.s.c(e.a.a.a.y0.j.v.b.m(sVar).getName().e()) : sVar.getName().e();
            i.d(T0, "when (descriptor) {\n    …name.asString()\n        }");
        }
        return new e.C0130e(new e.b(T0, b.q.a.a.H(sVar, false, false, 1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: e.a.a.a.e$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.f c(e.a.a.a.y0.b.f0 r7) {
        /*
            java.lang.String r0 = "possiblyOverriddenProperty"
            e.x.c.i.e(r7, r0)
            e.a.a.a.y0.b.b r7 = e.a.a.a.y0.j.g.z(r7)
            java.lang.String r0 = "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)"
            e.x.c.i.d(r7, r0)
            e.a.a.a.y0.b.f0 r7 = (e.a.a.a.y0.b.f0) r7
            e.a.a.a.y0.b.f0 r1 = r7.a()
            java.lang.String r7 = "DescriptorUtils.unwrapFa…rriddenProperty).original"
            e.x.c.i.d(r1, r7)
            boolean r7 = r1 instanceof e.a.a.a.y0.k.b.g0.j
            r0 = 0
            if (r7 == 0) goto L_0x003d
            r7 = r1
            e.a.a.a.y0.k.b.g0.j r7 = (e.a.a.a.y0.k.b.g0.j) r7
            e.a.a.a.y0.e.n r2 = r7.H
            e.a.a.a.y0.h.h$f<e.a.a.a.y0.e.n, e.a.a.a.y0.e.a0.a$d> r3 = e.a.a.a.y0.e.a0.a.d
            java.lang.String r4 = "JvmProtoBuf.propertySignature"
            e.x.c.i.d(r3, r4)
            java.lang.Object r3 = b.q.a.a.I0(r2, r3)
            e.a.a.a.y0.e.a0.a$d r3 = (e.a.a.a.y0.e.a0.a.d) r3
            if (r3 == 0) goto L_0x00be
            e.a.a.a.f$c r6 = new e.a.a.a.f$c
            e.a.a.a.y0.e.z.c r4 = r7.I
            e.a.a.a.y0.e.z.e r5 = r7.J
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x003d:
            boolean r7 = r1 instanceof e.a.a.a.y0.d.a.a0.g
            if (r7 == 0) goto L_0x00be
            r7 = r1
            e.a.a.a.y0.d.a.a0.g r7 = (e.a.a.a.y0.d.a.a0.g) r7
            e.a.a.a.y0.b.m0 r7 = r7.w()
            boolean r2 = r7 instanceof e.a.a.a.y0.d.a.c0.a
            if (r2 != 0) goto L_0x004d
            r7 = r0
        L_0x004d:
            e.a.a.a.y0.d.a.c0.a r7 = (e.a.a.a.y0.d.a.c0.a) r7
            if (r7 == 0) goto L_0x0056
            e.a.a.a.y0.d.a.d0.l r7 = r7.b()
            goto L_0x0057
        L_0x0056:
            r7 = r0
        L_0x0057:
            boolean r2 = r7 instanceof e.a.a.a.y0.b.d1.b.w
            if (r2 == 0) goto L_0x0065
            e.a.a.a.f$a r0 = new e.a.a.a.f$a
            e.a.a.a.y0.b.d1.b.w r7 = (e.a.a.a.y0.b.d1.b.w) r7
            java.lang.reflect.Field r7 = r7.a
            r0.<init>(r7)
            goto L_0x0099
        L_0x0065:
            boolean r2 = r7 instanceof e.a.a.a.y0.b.d1.b.z
            if (r2 == 0) goto L_0x009a
            e.a.a.a.f$b r2 = new e.a.a.a.f$b
            e.a.a.a.y0.b.d1.b.z r7 = (e.a.a.a.y0.b.d1.b.z) r7
            java.lang.reflect.Method r7 = r7.a
            e.a.a.a.y0.b.h0 r1 = r1.m()
            if (r1 == 0) goto L_0x007a
            e.a.a.a.y0.b.m0 r1 = r1.w()
            goto L_0x007b
        L_0x007a:
            r1 = r0
        L_0x007b:
            boolean r3 = r1 instanceof e.a.a.a.y0.d.a.c0.a
            if (r3 != 0) goto L_0x0080
            r1 = r0
        L_0x0080:
            e.a.a.a.y0.d.a.c0.a r1 = (e.a.a.a.y0.d.a.c0.a) r1
            if (r1 == 0) goto L_0x0089
            e.a.a.a.y0.d.a.d0.l r1 = r1.b()
            goto L_0x008a
        L_0x0089:
            r1 = r0
        L_0x008a:
            boolean r3 = r1 instanceof e.a.a.a.y0.b.d1.b.z
            if (r3 != 0) goto L_0x008f
            r1 = r0
        L_0x008f:
            e.a.a.a.y0.b.d1.b.z r1 = (e.a.a.a.y0.b.d1.b.z) r1
            if (r1 == 0) goto L_0x0095
            java.lang.reflect.Method r0 = r1.a
        L_0x0095:
            r2.<init>(r7, r0)
            r0 = r2
        L_0x0099:
            return r0
        L_0x009a:
            e.a.a.a.l0 r0 = new e.a.a.a.l0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " (source = "
            r2.append(r1)
            r2.append(r7)
            r7 = 41
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            throw r0
        L_0x00be:
            e.a.a.a.y0.b.g0 r7 = r1.j()
            e.x.c.i.c(r7)
            e.a.a.a.e$e r7 = b(r7)
            e.a.a.a.y0.b.h0 r1 = r1.m()
            if (r1 == 0) goto L_0x00d3
            e.a.a.a.e$e r0 = b(r1)
        L_0x00d3:
            e.a.a.a.f$d r1 = new e.a.a.a.f$d
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.t0.c(e.a.a.a.y0.b.f0):e.a.a.a.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0164, code lost:
        if (r0.n().isEmpty() != false) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.e d(e.a.a.a.y0.b.s r7) {
        /*
            java.lang.String r0 = "possiblySubstitutedFunction"
            e.x.c.i.e(r7, r0)
            e.a.a.a.y0.b.b r0 = e.a.a.a.y0.j.g.z(r7)
            java.lang.String r1 = "DescriptorUtils.unwrapFa…siblySubstitutedFunction)"
            e.x.c.i.d(r0, r1)
            e.a.a.a.y0.b.s r0 = (e.a.a.a.y0.b.s) r0
            e.a.a.a.y0.b.s r0 = r0.a()
            java.lang.String r1 = "DescriptorUtils.unwrapFa…titutedFunction).original"
            e.x.c.i.d(r0, r1)
            boolean r1 = r0 instanceof e.a.a.a.y0.k.b.g0.b
            if (r1 == 0) goto L_0x0077
            r1 = r0
            e.a.a.a.y0.k.b.g0.b r1 = (e.a.a.a.y0.k.b.g0.b) r1
            e.a.a.a.y0.h.p r2 = r1.X()
            boolean r3 = r2 instanceof e.a.a.a.y0.e.i
            if (r3 == 0) goto L_0x0041
            e.a.a.a.y0.e.a0.b.h r3 = e.a.a.a.y0.e.a0.b.h.f8770b
            r4 = r2
            e.a.a.a.y0.e.i r4 = (e.a.a.a.y0.e.i) r4
            e.a.a.a.y0.e.z.c r5 = r1.Q0()
            e.a.a.a.y0.e.z.e r6 = r1.A0()
            e.a.a.a.y0.e.a0.b.e$b r3 = r3.c(r4, r5, r6)
            if (r3 == 0) goto L_0x0041
            e.a.a.a.e$e r7 = new e.a.a.a.e$e
            r7.<init>(r3)
            return r7
        L_0x0041:
            boolean r3 = r2 instanceof e.a.a.a.y0.e.d
            if (r3 == 0) goto L_0x0072
            e.a.a.a.y0.e.a0.b.h r3 = e.a.a.a.y0.e.a0.b.h.f8770b
            e.a.a.a.y0.e.d r2 = (e.a.a.a.y0.e.d) r2
            e.a.a.a.y0.e.z.c r4 = r1.Q0()
            e.a.a.a.y0.e.z.e r1 = r1.A0()
            e.a.a.a.y0.e.a0.b.e$b r1 = r3.a(r2, r4, r1)
            if (r1 == 0) goto L_0x0072
            e.a.a.a.y0.b.k r7 = r7.b()
            java.lang.String r0 = "possiblySubstitutedFunction.containingDeclaration"
            e.x.c.i.d(r7, r0)
            boolean r7 = b.q.a.a.M1(r7)
            if (r7 == 0) goto L_0x006c
            e.a.a.a.e$e r7 = new e.a.a.a.e$e
            r7.<init>(r1)
            goto L_0x0071
        L_0x006c:
            e.a.a.a.e$d r7 = new e.a.a.a.e$d
            r7.<init>(r1)
        L_0x0071:
            return r7
        L_0x0072:
            e.a.a.a.e$e r7 = b(r0)
            return r7
        L_0x0077:
            boolean r7 = r0 instanceof e.a.a.a.y0.d.a.a0.f
            r1 = 0
            if (r7 == 0) goto L_0x00bd
            r7 = r0
            e.a.a.a.y0.d.a.a0.f r7 = (e.a.a.a.y0.d.a.a0.f) r7
            e.a.a.a.y0.b.m0 r7 = r7.w()
            boolean r2 = r7 instanceof e.a.a.a.y0.d.a.c0.a
            if (r2 != 0) goto L_0x0088
            r7 = r1
        L_0x0088:
            e.a.a.a.y0.d.a.c0.a r7 = (e.a.a.a.y0.d.a.c0.a) r7
            if (r7 == 0) goto L_0x0091
            e.a.a.a.y0.d.a.d0.l r7 = r7.b()
            goto L_0x0092
        L_0x0091:
            r7 = r1
        L_0x0092:
            boolean r2 = r7 instanceof e.a.a.a.y0.b.d1.b.z
            if (r2 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r1 = r7
        L_0x0098:
            e.a.a.a.y0.b.d1.b.z r1 = (e.a.a.a.y0.b.d1.b.z) r1
            if (r1 == 0) goto L_0x00a6
            java.lang.reflect.Method r7 = r1.a
            if (r7 == 0) goto L_0x00a6
            e.a.a.a.e$c r0 = new e.a.a.a.e$c
            r0.<init>(r7)
            return r0
        L_0x00a6:
            e.a.a.a.l0 r7 = new e.a.a.a.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x00bd:
            boolean r7 = r0 instanceof e.a.a.a.y0.d.a.a0.c
            r2 = 41
            java.lang.String r3 = " ("
            if (r7 == 0) goto L_0x011d
            r7 = r0
            e.a.a.a.y0.d.a.a0.c r7 = (e.a.a.a.y0.d.a.a0.c) r7
            e.a.a.a.y0.b.m0 r7 = r7.w()
            boolean r4 = r7 instanceof e.a.a.a.y0.d.a.c0.a
            if (r4 != 0) goto L_0x00d1
            r7 = r1
        L_0x00d1:
            e.a.a.a.y0.d.a.c0.a r7 = (e.a.a.a.y0.d.a.c0.a) r7
            if (r7 == 0) goto L_0x00d9
            e.a.a.a.y0.d.a.d0.l r1 = r7.b()
        L_0x00d9:
            boolean r7 = r1 instanceof e.a.a.a.y0.b.d1.b.t
            if (r7 == 0) goto L_0x00e7
            e.a.a.a.e$b r7 = new e.a.a.a.e$b
            e.a.a.a.y0.b.d1.b.t r1 = (e.a.a.a.y0.b.d1.b.t) r1
            java.lang.reflect.Constructor<?> r0 = r1.a
            r7.<init>(r0)
            goto L_0x00fc
        L_0x00e7:
            boolean r7 = r1 instanceof e.a.a.a.y0.b.d1.b.q
            if (r7 == 0) goto L_0x00fd
            r7 = r1
            e.a.a.a.y0.b.d1.b.q r7 = (e.a.a.a.y0.b.d1.b.q) r7
            boolean r4 = r7.E()
            if (r4 == 0) goto L_0x00fd
            e.a.a.a.e$a r0 = new e.a.a.a.e$a
            java.lang.Class<?> r7 = r7.a
            r0.<init>(r7)
            r7 = r0
        L_0x00fc:
            return r7
        L_0x00fd:
            e.a.a.a.l0 r7 = new e.a.a.a.l0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r7.<init>(r0)
            throw r7
        L_0x011d:
            e.a.a.a.y0.f.d r7 = r0.getName()
            e.a.a.a.y0.f.d r1 = e.a.a.a.y0.j.g.f9379b
            boolean r7 = r7.equals(r1)
            r1 = 0
            r4 = 1
            if (r7 == 0) goto L_0x0133
            boolean r7 = b.q.a.a.G1(r0)
            if (r7 == 0) goto L_0x0133
            r7 = r4
            goto L_0x0134
        L_0x0133:
            r7 = r1
        L_0x0134:
            if (r7 != 0) goto L_0x0166
            e.a.a.a.y0.f.d r7 = r0.getName()
            e.a.a.a.y0.f.d r5 = e.a.a.a.y0.j.g.a
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x014a
            boolean r7 = b.q.a.a.G1(r0)
            if (r7 == 0) goto L_0x014a
            r7 = r4
            goto L_0x014b
        L_0x014a:
            r7 = r1
        L_0x014b:
            if (r7 == 0) goto L_0x014e
            goto L_0x0166
        L_0x014e:
            e.a.a.a.y0.f.d r7 = r0.getName()
            e.a.a.a.y0.a.p.a r5 = e.a.a.a.y0.a.p.a.f
            e.a.a.a.y0.f.d r5 = e.a.a.a.y0.a.p.a.f7709e
            boolean r7 = e.x.c.i.a(r7, r5)
            if (r7 == 0) goto L_0x0167
            java.util.List r7 = r0.n()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0167
        L_0x0166:
            r1 = r4
        L_0x0167:
            if (r1 == 0) goto L_0x016e
            e.a.a.a.e$e r7 = b(r0)
            return r7
        L_0x016e:
            e.a.a.a.l0 r7 = new e.a.a.a.l0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unknown origin of "
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.t0.d(e.a.a.a.y0.b.s):e.a.a.a.e");
    }
}
