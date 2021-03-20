package b.l.a.c.f.i;

import java.util.Arrays;

public final class p7 extends n7<o7, o7> {
    public final /* bridge */ /* synthetic */ void a(Object obj, int i2, long j2) {
        ((o7) obj).c(i2 << 3, Long.valueOf(j2));
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return o7.a();
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ((p5) obj).zzc = (o7) obj2;
    }

    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        return ((p5) obj).zzc;
    }

    public final void e(Object obj) {
        ((p5) obj).zzc.f3676e = false;
    }

    public final Object f(Object obj, Object obj2) {
        o7 o7Var = (o7) obj2;
        if (o7Var.equals(o7.f)) {
            return obj;
        }
        o7 o7Var2 = (o7) obj;
        int i2 = o7Var2.a + o7Var.a;
        int[] copyOf = Arrays.copyOf(o7Var2.f3675b, i2);
        System.arraycopy(o7Var.f3675b, 0, copyOf, o7Var2.a, o7Var.a);
        Object[] copyOf2 = Arrays.copyOf(o7Var2.c, i2);
        System.arraycopy(o7Var.c, 0, copyOf2, o7Var2.a, o7Var.a);
        return new o7(i2, copyOf, copyOf2, true);
    }

    public final int g(Object obj) {
        o7 o7Var = (o7) obj;
        int i2 = o7Var.d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < o7Var.a; i4++) {
            int i5 = o7Var.f3675b[i4];
            int u = y4.u(8);
            int u2 = y4.u(16);
            int u3 = y4.u(i5 >>> 3);
            int u4 = y4.u(24);
            int l2 = ((t4) o7Var.c[i4]).l();
            i3 += y4.u(l2) + l2 + u4 + u2 + u3 + u + u;
        }
        o7Var.d = i3;
        return i3;
    }

    public final /* bridge */ /* synthetic */ int h(Object obj) {
        return ((o7) obj).b();
    }

    public final /* bridge */ /* synthetic */ void i(Object obj, z4 z4Var) {
        ((o7) obj).d(z4Var);
    }
}
