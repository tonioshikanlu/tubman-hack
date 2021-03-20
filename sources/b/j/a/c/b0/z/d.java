package b.j.a.c.b0.z;

import b.j.a.a.b;
import b.j.a.c.b;
import b.j.a.c.e0.l;
import b.j.a.c.e0.m;
import b.j.a.c.e0.r;
import b.j.a.c.t;

public final class d {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1817b;
    public final int c;
    public final a[] d;

    public static final class a {
        public final l a;

        /* renamed from: b  reason: collision with root package name */
        public final r f1818b;
        public final b.a c;

        public a(l lVar, r rVar, b.a aVar) {
            this.a = lVar;
            this.f1818b = rVar;
            this.c = aVar;
        }
    }

    public d(b.j.a.c.b bVar, m mVar, a[] aVarArr, int i2) {
        this.a = bVar;
        this.f1817b = mVar;
        this.d = aVarArr;
        this.c = i2;
    }

    public static d a(b.j.a.c.b bVar, m mVar, r[] rVarArr) {
        int t = mVar.t();
        a[] aVarArr = new a[t];
        for (int i2 = 0; i2 < t; i2++) {
            l r = mVar.r(i2);
            aVarArr[i2] = new a(r, rVarArr == null ? null : rVarArr[i2], bVar.o(r));
        }
        return new d(bVar, mVar, aVarArr, t);
    }

    public t b(int i2) {
        String n2 = this.a.n(this.d[i2].a);
        if (n2 == null || n2.isEmpty()) {
            return null;
        }
        return t.a(n2);
    }

    public b.a c(int i2) {
        return this.d[i2].c;
    }

    public t d(int i2) {
        r rVar = this.d[i2].f1818b;
        if (rVar != null) {
            return rVar.h();
        }
        return null;
    }

    public l e(int i2) {
        return this.d[i2].a;
    }

    public r f(int i2) {
        return this.d[i2].f1818b;
    }

    public String toString() {
        return this.f1817b.toString();
    }
}
