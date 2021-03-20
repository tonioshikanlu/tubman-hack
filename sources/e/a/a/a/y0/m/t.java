package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.x.c.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class t extends b1 {

    /* renamed from: b  reason: collision with root package name */
    public final b1 f9754b;
    public final b1 c;

    public t(b1 b1Var, b1 b1Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9754b = b1Var;
        this.c = b1Var2;
    }

    public boolean a() {
        return this.f9754b.a() || this.c.a();
    }

    public boolean b() {
        return this.f9754b.b() || this.c.b();
    }

    public h d(h hVar) {
        i.e(hVar, "annotations");
        return this.c.d(this.f9754b.d(hVar));
    }

    public y0 e(d0 d0Var) {
        i.e(d0Var, "key");
        y0 e2 = this.f9754b.e(d0Var);
        return e2 != null ? e2 : this.c.e(d0Var);
    }

    public boolean f() {
        return false;
    }

    public d0 g(d0 d0Var, j1 j1Var) {
        i.e(d0Var, "topLevelType");
        i.e(j1Var, "position");
        return this.c.g(this.f9754b.g(d0Var, j1Var), j1Var);
    }
}
