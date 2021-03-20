package e.a.a.a.z0;

public final class c<V> {
    public static final c<Object> f = new c<>();
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final V f9841b;
    public final c<V> c;
    public final c<V> d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9842e;

    public c() {
        this.f9842e = 0;
        this.a = 0;
        this.f9841b = null;
        this.c = null;
        this.d = null;
    }

    public c(long j2, V v, c<V> cVar, c<V> cVar2) {
        this.a = j2;
        this.f9841b = v;
        this.c = cVar;
        this.d = cVar2;
        this.f9842e = cVar.f9842e + 1 + cVar2.f9842e;
    }

    public V a(long j2) {
        c<V> cVar;
        if (this.f9842e == 0) {
            return null;
        }
        long j3 = this.a;
        if (j2 < j3) {
            cVar = this.c;
        } else if (j2 <= j3) {
            return this.f9841b;
        } else {
            cVar = this.d;
        }
        return cVar.a(j2 - j3);
    }

    public c<V> b(long j2, V v) {
        if (this.f9842e == 0) {
            return new c(j2, v, this, this);
        }
        long j3 = this.a;
        if (j2 < j3) {
            return c(this.c.b(j2 - j3, v), this.d);
        }
        if (j2 > j3) {
            return c(this.c, this.d.b(j2 - j3, v));
        }
        if (v == this.f9841b) {
            return this;
        }
        return new c(j2, v, this.c, this.d);
    }

    public final c<V> c(c<V> cVar, c<V> cVar2) {
        c<V> cVar3 = cVar;
        c<V> cVar4 = cVar2;
        if (cVar3 == this.c && cVar4 == this.d) {
            return this;
        }
        long j2 = this.a;
        V v = this.f9841b;
        int i2 = cVar3.f9842e;
        int i3 = cVar4.f9842e;
        if (i2 + i3 > 1) {
            if (i2 >= i3 * 5) {
                c<V> cVar5 = cVar3.c;
                c<V> cVar6 = cVar3.d;
                if (cVar6.f9842e < cVar5.f9842e * 2) {
                    long j3 = cVar3.a;
                    return new c(j3 + j2, cVar3.f9841b, cVar5, new c(-j3, v, cVar6.d(cVar6.a + j3), cVar2));
                }
                c<V> cVar7 = cVar6.c;
                c<V> cVar8 = cVar6.d;
                long j4 = cVar6.a;
                long j5 = cVar3.a + j4 + j2;
                V v2 = cVar6.f9841b;
                c cVar9 = new c(-j4, cVar3.f9841b, cVar5, cVar7.d(cVar7.a + j4));
                long j6 = cVar3.a;
                long j7 = cVar6.a;
                return new c<>(j5, v2, cVar9, new c((-j6) - j7, v, cVar8.d(cVar8.a + j7 + j6), cVar2));
            } else if (i3 >= i2 * 5) {
                c<V> cVar10 = cVar4.c;
                c<V> cVar11 = cVar4.d;
                if (cVar10.f9842e < cVar11.f9842e * 2) {
                    long j8 = cVar4.a;
                    c<V> cVar12 = cVar;
                    return new c<>(j8 + j2, cVar4.f9841b, new c(-j8, v, cVar12, cVar10.d(cVar10.a + j8)), cVar11);
                }
                c<V> cVar13 = cVar10.c;
                c<V> cVar14 = cVar10.d;
                long j9 = cVar10.a;
                long j10 = cVar4.a;
                long j11 = j9 + j10 + j2;
                V v3 = cVar10.f9841b;
                c cVar15 = new c((-j10) - j9, v, cVar, cVar13.d(cVar13.a + j9 + j10));
                long j12 = cVar10.a;
                return new c<>(j11, v3, cVar15, new c(-j12, cVar4.f9841b, cVar14.d(cVar14.a + j12), cVar11));
            }
        }
        return new c(j2, v, cVar, cVar2);
    }

    public final c<V> d(long j2) {
        if (this.f9842e == 0 || j2 == this.a) {
            return this;
        }
        return new c(j2, this.f9841b, this.c, this.d);
    }
}
