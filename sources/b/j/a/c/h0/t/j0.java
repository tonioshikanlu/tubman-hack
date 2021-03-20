package b.j.a.c.h0.t;

import b.j.a.c.d;
import b.j.a.c.h0.i;
import b.j.a.c.n;
import b.j.a.c.y;
import java.util.Collection;

public abstract class j0<T extends Collection<?>> extends s0<T> implements i {

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f2116j;

    public j0(j0<?> j0Var, Boolean bool) {
        super((s0<?>) j0Var);
        this.f2116j = bool;
    }

    public j0(Class<?> cls) {
        super(cls, false);
        this.f2116j = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r6, b.j.a.c.d r7) {
        /*
            r5 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            if (r7 == 0) goto L_0x001a
            b.j.a.c.b r2 = r6.B()
            b.j.a.c.e0.h r3 = r7.e()
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r2.d(r3)
            if (r2 == 0) goto L_0x001a
            b.j.a.c.n r2 = r6.N(r3, r2)
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            java.lang.Class<T> r3 = r5.f2137h
            b.j.a.a.k$d r3 = r5.l(r6, r7, r3)
            if (r3 == 0) goto L_0x002a
            b.j.a.a.k$a r4 = b.j.a.a.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r3 = r3.b(r4)
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            b.j.a.c.n r2 = r5.k(r6, r7, r2)
            if (r2 != 0) goto L_0x0035
            b.j.a.c.n r2 = r6.A(r0, r7)
        L_0x0035:
            boolean r4 = b.j.a.c.j0.g.u(r2)
            if (r4 == 0) goto L_0x0045
            java.lang.Boolean r6 = r5.f2116j
            if (r3 != r6) goto L_0x0040
            return r5
        L_0x0040:
            b.j.a.c.n r6 = r5.q(r7, r3)
            return r6
        L_0x0045:
            b.j.a.c.h0.t.j r7 = new b.j.a.c.h0.t.j
            b.j.a.c.i r6 = r6.e(r0)
            r0 = 1
            r7.<init>(r6, r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.j0.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public boolean d(y yVar, Object obj) {
        Collection collection = (Collection) obj;
        return collection == null || collection.size() == 0;
    }

    public abstract n<?> q(d dVar, Boolean bool);
}
