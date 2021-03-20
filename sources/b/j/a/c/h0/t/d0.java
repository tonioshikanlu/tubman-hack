package b.j.a.c.h0.t;

import b.j.a.c.d;
import b.j.a.c.f0.f;
import b.j.a.c.h0.h;
import b.j.a.c.h0.i;
import b.j.a.c.h0.s.l;
import b.j.a.c.n;
import b.j.a.c.x;
import b.j.a.c.y;
import b.j.a.c.z.a;

@a
public class d0 extends a<Object[]> implements i {

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2099l;

    /* renamed from: m  reason: collision with root package name */
    public final b.j.a.c.i f2100m;

    /* renamed from: n  reason: collision with root package name */
    public final f f2101n;

    /* renamed from: o  reason: collision with root package name */
    public n<Object> f2102o;

    /* renamed from: p  reason: collision with root package name */
    public l f2103p = l.b.f2067b;

    public d0(d0 d0Var, d dVar, f fVar, n<?> nVar, Boolean bool) {
        super(d0Var, dVar, bool);
        this.f2100m = d0Var.f2100m;
        this.f2101n = fVar;
        this.f2099l = d0Var.f2099l;
        this.f2102o = nVar;
    }

    public d0(b.j.a.c.i iVar, boolean z, f fVar, n<Object> nVar) {
        super(Object[].class);
        this.f2100m = iVar;
        this.f2099l = z;
        this.f2101n = fVar;
        this.f2102o = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        r1 = r7.f2100m;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b.j.a.c.n<?> a(b.j.a.c.y r8, b.j.a.c.d r9) {
        /*
            r7 = this;
            b.j.a.c.f0.f r0 = r7.f2101n
            if (r0 == 0) goto L_0x0008
            b.j.a.c.f0.f r0 = r0.a(r9)
        L_0x0008:
            r4 = r0
            r0 = 0
            if (r9 == 0) goto L_0x0021
            b.j.a.c.e0.h r1 = r9.e()
            b.j.a.c.b r2 = r8.B()
            if (r1 == 0) goto L_0x0021
            java.lang.Object r2 = r2.d(r1)
            if (r2 == 0) goto L_0x0021
            b.j.a.c.n r1 = r8.N(r1, r2)
            goto L_0x0022
        L_0x0021:
            r1 = r0
        L_0x0022:
            java.lang.Class<T> r2 = r7.f2137h
            b.j.a.a.k$d r2 = r7.l(r8, r9, r2)
            if (r2 == 0) goto L_0x0030
            b.j.a.a.k$a r0 = b.j.a.a.k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r0 = r2.b(r0)
        L_0x0030:
            r6 = r0
            if (r1 != 0) goto L_0x0035
            b.j.a.c.n<java.lang.Object> r1 = r7.f2102o
        L_0x0035:
            b.j.a.c.n r0 = r7.k(r8, r9, r1)
            if (r0 != 0) goto L_0x0051
            b.j.a.c.i r1 = r7.f2100m
            if (r1 == 0) goto L_0x0051
            boolean r2 = r7.f2099l
            if (r2 == 0) goto L_0x0051
            boolean r1 = r1.F()
            if (r1 != 0) goto L_0x0051
            b.j.a.c.i r0 = r7.f2100m
            b.j.a.c.n r8 = r8.z(r0, r9)
            r5 = r8
            goto L_0x0052
        L_0x0051:
            r5 = r0
        L_0x0052:
            b.j.a.c.d r8 = r7.f2081j
            if (r8 != r9) goto L_0x0064
            b.j.a.c.n<java.lang.Object> r8 = r7.f2102o
            if (r5 != r8) goto L_0x0064
            b.j.a.c.f0.f r8 = r7.f2101n
            if (r8 != r4) goto L_0x0064
            java.lang.Boolean r8 = r7.f2082k
            if (r8 != r6) goto L_0x0064
            r8 = r7
            goto L_0x006c
        L_0x0064:
            b.j.a.c.h0.t.d0 r8 = new b.j.a.c.h0.t.d0
            r1 = r8
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x006c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.d0.a(b.j.a.c.y, b.j.a.c.d):b.j.a.c.n");
    }

    public boolean d(y yVar, Object obj) {
        return ((Object[]) obj).length == 0;
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length != 1 || ((this.f2082k != null || !yVar.K(x.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this.f2082k != Boolean.TRUE)) {
            fVar.M0(length);
            u(objArr, fVar, yVar);
            fVar.q0();
            return;
        }
        u(objArr, fVar, yVar);
    }

    public h<?> q(f fVar) {
        return new d0(this.f2100m, this.f2099l, fVar, this.f2102o);
    }

    public n<?> t(d dVar, Boolean bool) {
        return new d0(this, dVar, this.f2101n, this.f2102o, bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0046, code lost:
        r7 = r11.A(r6, r8.f2081j);
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(java.lang.Object[] r9, b.j.a.b.f r10, b.j.a.c.y r11) {
        /*
            r8 = this;
            int r0 = r9.length
            if (r0 != 0) goto L_0x0004
            return
        L_0x0004:
            b.j.a.c.n<java.lang.Object> r1 = r8.f2102o
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002a
            int r0 = r9.length
            b.j.a.c.f0.f r4 = r8.f2101n
            r5 = r3
        L_0x000e:
            if (r2 >= r0) goto L_0x0029
            r5 = r9[r2]     // Catch:{ Exception -> 0x0024 }
            if (r5 != 0) goto L_0x0018
            r11.t(r10)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0021
        L_0x0018:
            if (r4 != 0) goto L_0x001e
            r1.f(r5, r10, r11)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0021
        L_0x001e:
            r1.g(r5, r10, r11, r4)     // Catch:{ Exception -> 0x0024 }
        L_0x0021:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0024:
            r9 = move-exception
            r8.n(r11, r9, r5, r2)
            throw r3
        L_0x0029:
            return
        L_0x002a:
            b.j.a.c.f0.f r1 = r8.f2101n
            if (r1 == 0) goto L_0x0063
            int r0 = r9.length
            b.j.a.c.h0.s.l r4 = r8.f2103p     // Catch:{ Exception -> 0x005d }
            r5 = r3
        L_0x0032:
            if (r2 >= r0) goto L_0x005c
            r5 = r9[r2]     // Catch:{ Exception -> 0x005a }
            if (r5 != 0) goto L_0x003c
            r11.t(r10)     // Catch:{ Exception -> 0x005a }
            goto L_0x0057
        L_0x003c:
            java.lang.Class r6 = r5.getClass()     // Catch:{ Exception -> 0x005a }
            b.j.a.c.n r7 = r4.c(r6)     // Catch:{ Exception -> 0x005a }
            if (r7 != 0) goto L_0x0054
            b.j.a.c.d r7 = r8.f2081j     // Catch:{ Exception -> 0x005a }
            b.j.a.c.n r7 = r11.A(r6, r7)     // Catch:{ Exception -> 0x005a }
            b.j.a.c.h0.s.l r6 = r4.b(r6, r7)     // Catch:{ Exception -> 0x005a }
            if (r4 == r6) goto L_0x0054
            r8.f2103p = r6     // Catch:{ Exception -> 0x005a }
        L_0x0054:
            r7.g(r5, r10, r11, r1)     // Catch:{ Exception -> 0x005a }
        L_0x0057:
            int r2 = r2 + 1
            goto L_0x0032
        L_0x005a:
            r9 = move-exception
            goto L_0x005f
        L_0x005c:
            return
        L_0x005d:
            r9 = move-exception
            r5 = r3
        L_0x005f:
            r8.n(r11, r9, r5, r2)
            throw r3
        L_0x0063:
            b.j.a.c.h0.s.l r1 = r8.f2103p     // Catch:{ Exception -> 0x00ae }
            r4 = r3
        L_0x0066:
            if (r2 >= r0) goto L_0x00ad
            r4 = r9[r2]     // Catch:{ Exception -> 0x00ab }
            if (r4 != 0) goto L_0x0070
            r11.t(r10)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00a8
        L_0x0070:
            java.lang.Class r5 = r4.getClass()     // Catch:{ Exception -> 0x00ab }
            b.j.a.c.n r6 = r1.c(r5)     // Catch:{ Exception -> 0x00ab }
            if (r6 != 0) goto L_0x00a5
            b.j.a.c.i r6 = r8.f2100m     // Catch:{ Exception -> 0x00ab }
            boolean r6 = r6.t()     // Catch:{ Exception -> 0x00ab }
            if (r6 == 0) goto L_0x0097
            b.j.a.c.i r6 = r8.f2100m     // Catch:{ Exception -> 0x00ab }
            b.j.a.c.i r5 = r11.d(r6, r5)     // Catch:{ Exception -> 0x00ab }
            b.j.a.c.d r6 = r8.f2081j     // Catch:{ Exception -> 0x00ab }
            b.j.a.c.h0.s.l$d r5 = r1.a(r5, r11, r6)     // Catch:{ Exception -> 0x00ab }
            b.j.a.c.h0.s.l r6 = r5.f2069b     // Catch:{ Exception -> 0x00ab }
            if (r1 == r6) goto L_0x0094
            r8.f2103p = r6     // Catch:{ Exception -> 0x00ab }
        L_0x0094:
            b.j.a.c.n<java.lang.Object> r6 = r5.a     // Catch:{ Exception -> 0x00ab }
            goto L_0x00a5
        L_0x0097:
            b.j.a.c.d r6 = r8.f2081j     // Catch:{ Exception -> 0x00ab }
            b.j.a.c.n r6 = r11.A(r5, r6)     // Catch:{ Exception -> 0x00ab }
            b.j.a.c.h0.s.l r5 = r1.b(r5, r6)     // Catch:{ Exception -> 0x00ab }
            if (r1 == r5) goto L_0x00a5
            r8.f2103p = r5     // Catch:{ Exception -> 0x00ab }
        L_0x00a5:
            r6.f(r4, r10, r11)     // Catch:{ Exception -> 0x00ab }
        L_0x00a8:
            int r2 = r2 + 1
            goto L_0x0066
        L_0x00ab:
            r9 = move-exception
            goto L_0x00b0
        L_0x00ad:
            return
        L_0x00ae:
            r9 = move-exception
            r4 = r3
        L_0x00b0:
            r8.n(r11, r9, r4, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.d0.u(java.lang.Object[], b.j.a.b.f, b.j.a.c.y):void");
    }
}
