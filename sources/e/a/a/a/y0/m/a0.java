package e.a.a.a.y0.m;

import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.r0;
import e.x.c.i;

public final class a0 extends b1 {

    /* renamed from: b  reason: collision with root package name */
    public final r0[] f9645b;
    public final y0[] c;
    public final boolean d;

    public a0(r0[] r0VarArr, y0[] y0VarArr, boolean z) {
        i.e(r0VarArr, "parameters");
        i.e(y0VarArr, "arguments");
        this.f9645b = r0VarArr;
        this.c = y0VarArr;
        this.d = z;
        int length = r0VarArr.length;
        int length2 = y0VarArr.length;
    }

    public boolean b() {
        return this.d;
    }

    public y0 e(d0 d0Var) {
        i.e(d0Var, "key");
        h d2 = d0Var.W0().d();
        if (!(d2 instanceof r0)) {
            d2 = null;
        }
        r0 r0Var = (r0) d2;
        if (r0Var != null) {
            int h2 = r0Var.h();
            r0[] r0VarArr = this.f9645b;
            if (h2 < r0VarArr.length && i.a(r0VarArr[h2].p(), r0Var.p())) {
                return this.c[h2];
            }
        }
        return null;
    }

    public boolean f() {
        return this.c.length == 0;
    }
}
