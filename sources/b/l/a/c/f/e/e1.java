package b.l.a.c.f.e;

import java.util.Arrays;

public final class e1 extends c1<d1, d1> {
    public final boolean a(wm wmVar) {
        return false;
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, int i2, long j2) {
        ((d1) obj).c(i2 << 3, Long.valueOf(j2));
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, int i2, int i3) {
        ((d1) obj).c((i2 << 3) | 5, Integer.valueOf(i3));
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, int i2, long j2) {
        ((d1) obj).c((i2 << 3) | 1, Long.valueOf(j2));
    }

    public final /* bridge */ /* synthetic */ void e(Object obj, int i2, um umVar) {
        ((d1) obj).c((i2 << 3) | 2, umVar);
    }

    public final /* bridge */ /* synthetic */ void f(Object obj, int i2, Object obj2) {
        ((d1) obj).c((i2 << 3) | 3, obj2);
    }

    public final /* bridge */ /* synthetic */ Object g() {
        return d1.a();
    }

    public final Object h(Object obj) {
        ((d1) obj).f2904e = false;
        return obj;
    }

    public final /* bridge */ /* synthetic */ void i(Object obj, Object obj2) {
        ((e) obj).zzc = (d1) obj2;
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        return ((e) obj).zzc;
    }

    public final /* bridge */ /* synthetic */ Object k(Object obj) {
        e eVar = (e) obj;
        d1 d1Var = eVar.zzc;
        if (d1Var != d1.f) {
            return d1Var;
        }
        d1 a = d1.a();
        eVar.zzc = a;
        return a;
    }

    public final /* bridge */ /* synthetic */ void l(Object obj, Object obj2) {
        ((e) obj).zzc = (d1) obj2;
    }

    public final void m(Object obj) {
        ((e) obj).zzc.f2904e = false;
    }

    public final Object o(Object obj, Object obj2) {
        d1 d1Var = (d1) obj2;
        if (d1Var.equals(d1.f)) {
            return obj;
        }
        d1 d1Var2 = (d1) obj;
        int i2 = d1Var2.a + d1Var.a;
        int[] copyOf = Arrays.copyOf(d1Var2.f2903b, i2);
        System.arraycopy(d1Var.f2903b, 0, copyOf, d1Var2.a, d1Var.a);
        Object[] copyOf2 = Arrays.copyOf(d1Var2.c, i2);
        System.arraycopy(d1Var.c, 0, copyOf2, d1Var2.a, d1Var.a);
        return new d1(i2, copyOf, copyOf2, true);
    }

    public final int p(Object obj) {
        d1 d1Var = (d1) obj;
        int i2 = d1Var.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < d1Var.a; i4++) {
            int i5 = d1Var.f2903b[i4];
            int B = bn.B(1);
            int B2 = bn.B(2);
            int b2 = bn.b(i5 >>> 3);
            int B3 = bn.B(3);
            int l2 = ((um) d1Var.c[i4]).l();
            i3 += bn.b(l2) + l2 + B3 + B2 + b2 + B + B;
        }
        d1Var.d = i3;
        return i3;
    }

    public final /* bridge */ /* synthetic */ int q(Object obj) {
        return ((d1) obj).b();
    }

    public final /* bridge */ /* synthetic */ void r(Object obj, cn cnVar) {
        ((d1) obj).d(cnVar);
    }
}
