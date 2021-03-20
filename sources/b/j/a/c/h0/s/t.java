package b.j.a.c.h0.s;

import b.j.a.a.i0;
import b.j.a.b.e;
import b.j.a.b.f;
import b.j.a.b.o;
import b.j.a.c.y;

public final class t {
    public final i0<?> a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2080b;
    public boolean c = false;

    public t(i0<?> i0Var) {
        this.a = i0Var;
    }

    public void a(f fVar, y yVar, j jVar) {
        this.c = true;
        if (fVar.q()) {
            fVar.E0(String.valueOf(this.f2080b));
            return;
        }
        o oVar = jVar.f2062b;
        if (oVar != null) {
            fVar.s0(oVar);
            jVar.d.f(this.f2080b, fVar, yVar);
        }
    }

    public boolean b(f fVar, y yVar, j jVar) {
        if (this.f2080b == null) {
            return false;
        }
        if (!this.c && !jVar.f2063e) {
            return false;
        }
        if (!fVar.q()) {
            jVar.d.f(this.f2080b, fVar, yVar);
            return true;
        }
        String.valueOf(this.f2080b);
        throw new e("No native support for writing Object Ids", fVar);
    }
}
