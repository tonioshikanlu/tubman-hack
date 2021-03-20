package e.a.a.a.y0.j;

import e.a.a.a.y0.b.a;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.r0;
import e.t.g;
import e.x.b.p;
import e.x.c.i;
import java.util.Collection;

public final class e {
    public static final e a = new e();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
        if (r6.c() == r4) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(e.a.a.a.y0.b.k r6, e.a.a.a.y0.b.k r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e.a.a.a.y0.b.e
            if (r0 == 0) goto L_0x001a
            boolean r0 = r7 instanceof e.a.a.a.y0.b.e
            if (r0 == 0) goto L_0x001a
            e.a.a.a.y0.b.e r6 = (e.a.a.a.y0.b.e) r6
            e.a.a.a.y0.b.e r7 = (e.a.a.a.y0.b.e) r7
            e.a.a.a.y0.m.v0 r6 = r6.p()
            e.a.a.a.y0.m.v0 r7 = r7.p()
            boolean r6 = e.x.c.i.a(r6, r7)
            goto L_0x0102
        L_0x001a:
            boolean r0 = r6 instanceof e.a.a.a.y0.b.r0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r7 instanceof e.a.a.a.y0.b.r0
            if (r0 == 0) goto L_0x002e
            e.a.a.a.y0.b.r0 r6 = (e.a.a.a.y0.b.r0) r6
            e.a.a.a.y0.b.r0 r7 = (e.a.a.a.y0.b.r0) r7
            e.a.a.a.y0.j.d r9 = e.a.a.a.y0.j.d.f9378h
            boolean r6 = r5.b(r6, r7, r8, r9)
            goto L_0x0102
        L_0x002e:
            boolean r0 = r6 instanceof e.a.a.a.y0.b.a
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r7 instanceof e.a.a.a.y0.b.a
            if (r0 == 0) goto L_0x00ea
            e.a.a.a.y0.b.a r6 = (e.a.a.a.y0.b.a) r6
            e.a.a.a.y0.b.a r7 = (e.a.a.a.y0.b.a) r7
            e.a.a.a.y0.m.l1.f$a r0 = e.a.a.a.y0.m.l1.f.a.a
            r1 = 0
            java.lang.String r2 = "a"
            e.x.c.i.e(r6, r2)
            java.lang.String r2 = "b"
            e.x.c.i.e(r7, r2)
            java.lang.String r2 = "kotlinTypeRefiner"
            e.x.c.i.e(r0, r2)
            boolean r2 = e.x.c.i.a(r6, r7)
            r3 = 1
            if (r2 == 0) goto L_0x0055
            goto L_0x00e6
        L_0x0055:
            e.a.a.a.y0.f.d r2 = r6.getName()
            e.a.a.a.y0.f.d r4 = r7.getName()
            boolean r2 = e.x.c.i.a(r2, r4)
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0066
            goto L_0x00e8
        L_0x0066:
            if (r9 == 0) goto L_0x0081
            boolean r9 = r6 instanceof e.a.a.a.y0.b.u
            if (r9 == 0) goto L_0x0081
            boolean r9 = r7 instanceof e.a.a.a.y0.b.u
            if (r9 == 0) goto L_0x0081
            r9 = r6
            e.a.a.a.y0.b.u r9 = (e.a.a.a.y0.b.u) r9
            boolean r9 = r9.m0()
            r2 = r7
            e.a.a.a.y0.b.u r2 = (e.a.a.a.y0.b.u) r2
            boolean r2 = r2.m0()
            if (r9 == r2) goto L_0x0081
            goto L_0x00e8
        L_0x0081:
            e.a.a.a.y0.b.k r9 = r6.b()
            e.a.a.a.y0.b.k r2 = r7.b()
            boolean r9 = e.x.c.i.a(r9, r2)
            if (r9 == 0) goto L_0x00a2
            if (r8 != 0) goto L_0x0092
            goto L_0x00e8
        L_0x0092:
            e.a.a.a.y0.b.m0 r9 = r5.d(r6)
            e.a.a.a.y0.b.m0 r2 = r5.d(r7)
            boolean r9 = e.x.c.i.a(r9, r2)
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x00a2
            goto L_0x00e8
        L_0x00a2:
            boolean r9 = e.a.a.a.y0.j.g.t(r6)
            if (r9 != 0) goto L_0x00e8
            boolean r9 = e.a.a.a.y0.j.g.t(r7)
            if (r9 == 0) goto L_0x00af
            goto L_0x00e8
        L_0x00af:
            e.a.a.a.y0.j.a r9 = e.a.a.a.y0.j.a.f9375h
            boolean r9 = r5.c(r6, r7, r9, r8)
            if (r9 != 0) goto L_0x00b8
            goto L_0x00e8
        L_0x00b8:
            e.a.a.a.y0.j.c r9 = new e.a.a.a.y0.j.c
            r9.<init>(r8, r6, r7)
            e.a.a.a.y0.j.l r8 = new e.a.a.a.y0.j.l
            r8.<init>(r9, r0)
            java.lang.String r9 = "OverridingUtil.create(ko…= a && y == b }\n        }"
            e.x.c.i.d(r8, r9)
            r9 = 0
            e.a.a.a.y0.j.l$d r0 = r8.m(r6, r7, r9, r3)
            java.lang.String r2 = "overridingUtil.isOverrid… null, !ignoreReturnType)"
            e.x.c.i.d(r0, r2)
            e.a.a.a.y0.j.l$d$a r0 = r0.c()
            e.a.a.a.y0.j.l$d$a r4 = e.a.a.a.y0.j.l.d.a.OVERRIDABLE
            if (r0 != r4) goto L_0x00e8
            e.a.a.a.y0.j.l$d r6 = r8.m(r7, r6, r9, r3)
            e.x.c.i.d(r6, r2)
            e.a.a.a.y0.j.l$d$a r6 = r6.c()
            if (r6 != r4) goto L_0x00e8
        L_0x00e6:
            r6 = r3
            goto L_0x0102
        L_0x00e8:
            r6 = r1
            goto L_0x0102
        L_0x00ea:
            boolean r8 = r6 instanceof e.a.a.a.y0.b.y
            if (r8 == 0) goto L_0x00fe
            boolean r8 = r7 instanceof e.a.a.a.y0.b.y
            if (r8 == 0) goto L_0x00fe
            e.a.a.a.y0.b.y r6 = (e.a.a.a.y0.b.y) r6
            e.a.a.a.y0.f.b r6 = r6.e()
            e.a.a.a.y0.b.y r7 = (e.a.a.a.y0.b.y) r7
            e.a.a.a.y0.f.b r7 = r7.e()
        L_0x00fe:
            boolean r6 = e.x.c.i.a(r6, r7)
        L_0x0102:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.j.e.a(e.a.a.a.y0.b.k, e.a.a.a.y0.b.k, boolean, boolean):boolean");
    }

    public final boolean b(r0 r0Var, r0 r0Var2, boolean z, p<? super k, ? super k, Boolean> pVar) {
        if (i.a(r0Var, r0Var2)) {
            return true;
        }
        if (!i.a(r0Var.b(), r0Var2.b()) && c(r0Var, r0Var2, pVar, z)) {
            return r0Var.h() == r0Var2.h();
        }
        return false;
    }

    public final boolean c(k kVar, k kVar2, p<? super k, ? super k, Boolean> pVar, boolean z) {
        k b2 = kVar.b();
        k b3 = kVar2.b();
        if ((b2 instanceof b) || (b3 instanceof b)) {
            return pVar.invoke(b2, b3).booleanValue();
        }
        return a(b2, b3, z, true);
    }

    public final m0 d(a aVar) {
        while (aVar instanceof b) {
            b bVar = (b) aVar;
            if (bVar.i() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends b> g2 = bVar.g();
            i.d(g2, "overriddenDescriptors");
            aVar = (b) g.P(g2);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.w();
    }
}
