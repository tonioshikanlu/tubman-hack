package e.a.a.a.y0.d.a;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.d.a.a0.f;
import e.a.a.a.y0.d.b.h;
import e.a.a.a.y0.j.h;
import e.j;
import e.t.g;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class q implements h {
    public static final boolean c(a aVar, a aVar2) {
        i.e(aVar, "superDescriptor");
        i.e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof f) || !(aVar instanceof s)) {
            return false;
        }
        f fVar = (f) aVar2;
        fVar.n().size();
        s sVar = (s) aVar;
        sVar.n().size();
        l0 d1 = fVar.j0();
        i.d(d1, "subDescriptor.original");
        List<w0> n2 = d1.n();
        i.d(n2, "subDescriptor.original.valueParameters");
        s a = sVar.a();
        i.d(a, "superDescriptor.original");
        List<w0> n3 = a.n();
        i.d(n3, "superDescriptor.original.valueParameters");
        Iterator it = ((ArrayList) g.f0(n2, n3)).iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            w0 w0Var = (w0) jVar.f7906h;
            w0 w0Var2 = (w0) jVar.f7907i;
            i.d(w0Var, "subParameter");
            boolean z = d((s) aVar2, w0Var) instanceof h.c;
            i.d(w0Var2, "superParameter");
            if (z != (d(sVar, w0Var2) instanceof h.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final e.a.a.a.y0.d.b.h d(e.a.a.a.y0.b.s r6, e.a.a.a.y0.b.w0 r7) {
        /*
            java.lang.String r0 = "f"
            e.x.c.i.e(r6, r0)
            java.util.List r0 = r6.n()
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L_0x00e0
            java.lang.String r0 = "$this$isFromJavaOrBuiltins"
            e.x.c.i.e(r6, r0)
            java.lang.String r0 = "$this$isFromJava"
            e.x.c.i.e(r6, r0)
            e.a.a.a.y0.b.b r0 = e.a.a.a.y0.j.v.b.m(r6)
            e.a.a.a.y0.b.k r0 = r0.b()
            boolean r0 = r0 instanceof e.a.a.a.y0.d.a.a0.d
            if (r0 != 0) goto L_0x0031
            boolean r0 = e.a.a.a.y0.a.g.B(r6)
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = r3
            goto L_0x0032
        L_0x0031:
            r0 = r2
        L_0x0032:
            if (r0 != 0) goto L_0x00e0
            e.a.a.a.y0.f.d r0 = r6.getName()
            java.lang.String r0 = r0.e()
            java.lang.String r4 = "remove"
            boolean r0 = e.x.c.i.a(r0, r4)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0047
            goto L_0x00e0
        L_0x0047:
            e.a.a.a.y0.b.s r0 = r6.a()
            java.lang.String r4 = "f.original"
            e.x.c.i.d(r0, r4)
            java.util.List r0 = r0.n()
            java.lang.String r4 = "f.original.valueParameters"
            e.x.c.i.d(r0, r4)
            java.lang.Object r0 = e.t.g.O(r0)
            java.lang.String r4 = "f.original.valueParameters.single()"
            e.x.c.i.d(r0, r4)
            e.a.a.a.y0.b.w0 r0 = (e.a.a.a.y0.b.w0) r0
            e.a.a.a.y0.m.d0 r0 = r0.d()
            java.lang.String r4 = "f.original.valueParameters.single().type"
            e.x.c.i.d(r0, r4)
            e.a.a.a.y0.d.b.h r0 = b.q.a.a.s2(r0)
            boolean r4 = r0 instanceof e.a.a.a.y0.d.b.h.c
            if (r4 != 0) goto L_0x0076
            r0 = r1
        L_0x0076:
            e.a.a.a.y0.d.b.h$c r0 = (e.a.a.a.y0.d.b.h.c) r0
            if (r0 == 0) goto L_0x007d
            e.a.a.a.y0.j.w.c r0 = r0.a
            goto L_0x007e
        L_0x007d:
            r0 = r1
        L_0x007e:
            e.a.a.a.y0.j.w.c r4 = e.a.a.a.y0.j.w.c.INT
            if (r0 == r4) goto L_0x0083
            goto L_0x00e0
        L_0x0083:
            e.a.a.a.y0.b.s r0 = e.a.a.a.y0.d.a.e.a(r6)
            if (r0 == 0) goto L_0x00e0
            e.a.a.a.y0.b.s r4 = r0.a()
            java.lang.String r5 = "overridden.original"
            e.x.c.i.d(r4, r5)
            java.util.List r4 = r4.n()
            java.lang.String r5 = "overridden.original.valueParameters"
            e.x.c.i.d(r4, r5)
            java.lang.Object r4 = e.t.g.O(r4)
            java.lang.String r5 = "overridden.original.valueParameters.single()"
            e.x.c.i.d(r4, r5)
            e.a.a.a.y0.b.w0 r4 = (e.a.a.a.y0.b.w0) r4
            e.a.a.a.y0.m.d0 r4 = r4.d()
            java.lang.String r5 = "overridden.original.valueParameters.single().type"
            e.x.c.i.d(r4, r5)
            e.a.a.a.y0.d.b.h r4 = b.q.a.a.s2(r4)
            e.a.a.a.y0.b.k r0 = r0.b()
            java.lang.String r5 = "overridden.containingDeclaration"
            e.x.c.i.d(r0, r5)
            e.a.a.a.y0.f.c r0 = e.a.a.a.y0.j.v.b.i(r0)
            e.a.a.a.y0.a.g$d r5 = e.a.a.a.y0.a.g.f7647k
            e.a.a.a.y0.f.b r5 = r5.Q
            e.a.a.a.y0.f.c r5 = r5.j()
            boolean r0 = e.x.c.i.a(r0, r5)
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r4 instanceof e.a.a.a.y0.d.b.h.b
            if (r0 == 0) goto L_0x00e0
            e.a.a.a.y0.d.b.h$b r4 = (e.a.a.a.y0.d.b.h.b) r4
            java.lang.String r0 = r4.a
            java.lang.String r4 = "java/lang/Object"
            boolean r0 = e.x.c.i.a(r0, r4)
            if (r0 == 0) goto L_0x00e0
            r0 = r2
            goto L_0x00e1
        L_0x00e0:
            r0 = r3
        L_0x00e1:
            java.lang.String r4 = "valueParameterDescriptor.type"
            if (r0 != 0) goto L_0x0149
            java.util.List r0 = r6.n()
            int r0 = r0.size()
            if (r0 == r2) goto L_0x00f0
            goto L_0x013e
        L_0x00f0:
            e.a.a.a.y0.b.k r0 = r6.b()
            boolean r5 = r0 instanceof e.a.a.a.y0.b.e
            if (r5 != 0) goto L_0x00f9
            r0 = r1
        L_0x00f9:
            e.a.a.a.y0.b.e r0 = (e.a.a.a.y0.b.e) r0
            if (r0 == 0) goto L_0x013e
            java.util.List r6 = r6.n()
            java.lang.String r5 = "f.valueParameters"
            e.x.c.i.d(r6, r5)
            java.lang.Object r6 = e.t.g.O(r6)
            java.lang.String r5 = "f.valueParameters.single()"
            e.x.c.i.d(r6, r5)
            e.a.a.a.y0.b.w0 r6 = (e.a.a.a.y0.b.w0) r6
            e.a.a.a.y0.m.d0 r6 = r6.d()
            e.a.a.a.y0.m.v0 r6 = r6.W0()
            e.a.a.a.y0.b.h r6 = r6.d()
            boolean r5 = r6 instanceof e.a.a.a.y0.b.e
            if (r5 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r1 = r6
        L_0x0123:
            e.a.a.a.y0.b.e r1 = (e.a.a.a.y0.b.e) r1
            if (r1 == 0) goto L_0x013e
            boolean r6 = e.a.a.a.y0.a.g.I(r0)
            if (r6 == 0) goto L_0x013c
            e.a.a.a.y0.f.b r6 = e.a.a.a.y0.j.v.b.h(r0)
            e.a.a.a.y0.f.b r0 = e.a.a.a.y0.j.v.b.h(r1)
            boolean r6 = e.x.c.i.a(r6, r0)
            if (r6 == 0) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r2 = r3
        L_0x013d:
            r3 = r2
        L_0x013e:
            if (r3 == 0) goto L_0x0141
            goto L_0x0149
        L_0x0141:
            e.a.a.a.y0.m.d0 r6 = r7.d()
            e.x.c.i.d(r6, r4)
            goto L_0x0154
        L_0x0149:
            e.a.a.a.y0.m.d0 r6 = r7.d()
            e.x.c.i.d(r6, r4)
            e.a.a.a.y0.m.d0 r6 = e.a.a.a.y0.m.o1.c.U(r6)
        L_0x0154:
            e.a.a.a.y0.d.b.h r6 = b.q.a.a.s2(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.q.d(e.a.a.a.y0.b.s, e.a.a.a.y0.b.w0):e.a.a.a.y0.d.b.h");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        if (e.x.c.i.a(r1, b.q.a.a.H(r3, false, false, 2)) != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (e.a.a.a.y0.d.a.d.d.contains(r1) == false) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e.a.a.a.y0.j.h.b a(e.a.a.a.y0.b.a r9, e.a.a.a.y0.b.a r10, e.a.a.a.y0.b.e r11) {
        /*
            r8 = this;
            e.a.a.a.y0.j.h$b r0 = e.a.a.a.y0.j.h.b.INCOMPATIBLE
            java.lang.String r1 = "superDescriptor"
            e.x.c.i.e(r9, r1)
            java.lang.String r1 = "subDescriptor"
            e.x.c.i.e(r10, r1)
            boolean r1 = r9 instanceof e.a.a.a.y0.b.b
            r2 = 0
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r10 instanceof e.a.a.a.y0.b.s
            if (r1 == 0) goto L_0x00b4
            boolean r1 = e.a.a.a.y0.a.g.B(r10)
            if (r1 == 0) goto L_0x001d
            goto L_0x00b4
        L_0x001d:
            e.a.a.a.y0.d.a.e r1 = e.a.a.a.y0.d.a.e.f8485g
            r3 = r10
            e.a.a.a.y0.b.s r3 = (e.a.a.a.y0.b.s) r3
            e.a.a.a.y0.f.d r4 = r3.getName()
            java.lang.String r5 = "subDescriptor.name"
            e.x.c.i.d(r4, r5)
            boolean r1 = r1.b(r4)
            if (r1 != 0) goto L_0x0049
            e.a.a.a.y0.d.a.d r1 = e.a.a.a.y0.d.a.d.f
            e.a.a.a.y0.f.d r1 = r3.getName()
            e.x.c.i.d(r1, r5)
            java.lang.String r4 = "$this$sameAsRenamedInJvmBuiltin"
            e.x.c.i.e(r1, r4)
            java.util.List<e.a.a.a.y0.f.d> r4 = e.a.a.a.y0.d.a.d.d
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0049
            goto L_0x00b4
        L_0x0049:
            r1 = r9
            e.a.a.a.y0.b.b r1 = (e.a.a.a.y0.b.b) r1
            e.a.a.a.y0.b.b r1 = b.q.a.a.a1(r1)
            boolean r4 = r3.q0()
            boolean r5 = r9 instanceof e.a.a.a.y0.b.s
            if (r5 != 0) goto L_0x005a
            r6 = 0
            goto L_0x005b
        L_0x005a:
            r6 = r9
        L_0x005b:
            e.a.a.a.y0.b.s r6 = (e.a.a.a.y0.b.s) r6
            r7 = 1
            if (r6 == 0) goto L_0x0069
            boolean r6 = r6.q0()
            if (r4 == r6) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r4 = r2
            goto L_0x006a
        L_0x0069:
            r4 = r7
        L_0x006a:
            if (r4 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x00b3
            boolean r4 = r3.q0()
            if (r4 != 0) goto L_0x0075
            goto L_0x00b3
        L_0x0075:
            boolean r4 = r11 instanceof e.a.a.a.y0.d.a.a0.d
            if (r4 == 0) goto L_0x00b4
            e.a.a.a.y0.b.s r4 = r3.G()
            if (r4 == 0) goto L_0x0080
            goto L_0x00b4
        L_0x0080:
            if (r1 == 0) goto L_0x00b4
            boolean r11 = b.q.a.a.q1(r11, r1)
            if (r11 == 0) goto L_0x0089
            goto L_0x00b4
        L_0x0089:
            boolean r11 = r1 instanceof e.a.a.a.y0.b.s
            if (r11 == 0) goto L_0x00b3
            if (r5 == 0) goto L_0x00b3
            e.a.a.a.y0.b.s r1 = (e.a.a.a.y0.b.s) r1
            e.a.a.a.y0.b.s r11 = e.a.a.a.y0.d.a.e.a(r1)
            if (r11 == 0) goto L_0x00b3
            r11 = 2
            java.lang.String r1 = b.q.a.a.H(r3, r2, r2, r11)
            r3 = r9
            e.a.a.a.y0.b.s r3 = (e.a.a.a.y0.b.s) r3
            e.a.a.a.y0.b.s r3 = r3.a()
            java.lang.String r4 = "superDescriptor.original"
            e.x.c.i.d(r3, r4)
            java.lang.String r11 = b.q.a.a.H(r3, r2, r2, r11)
            boolean r11 = e.x.c.i.a(r1, r11)
            if (r11 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r2 = r7
        L_0x00b4:
            if (r2 == 0) goto L_0x00b7
            return r0
        L_0x00b7:
            boolean r9 = c(r9, r10)
            if (r9 == 0) goto L_0x00be
            return r0
        L_0x00be:
            e.a.a.a.y0.j.h$b r9 = e.a.a.a.y0.j.h.b.UNKNOWN
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.q.a(e.a.a.a.y0.b.a, e.a.a.a.y0.b.a, e.a.a.a.y0.b.e):e.a.a.a.y0.j.h$b");
    }

    public h.a b() {
        return h.a.CONFLICTS_ONLY;
    }
}
