package b.o.v4;

import b.o.j1;
import b.o.r2;
import b.o.y2;
import b.o.z1;

public class c {
    public final j1 a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6332b;
    public final r2 c;
    public d d;

    public c(j1 j1Var, r2 r2Var, y2 y2Var, z1 z1Var) {
        this.a = j1Var;
        this.c = r2Var;
        this.f6332b = new a(j1Var, y2Var, z1Var);
    }

    public final void a() {
        this.d = this.f6332b.b() ? new g(this.a, this.f6332b, new h(this.c)) : new e(this.a, this.f6332b, new f(this.c));
    }

    public d b() {
        if (this.d == null) {
            a();
        } else if ((this.f6332b.b() || !(this.d instanceof e)) && (!this.f6332b.b() || !(this.d instanceof g))) {
            a();
        }
        return this.d;
    }
}
