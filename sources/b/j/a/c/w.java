package b.j.a.c;

import b.j.a.b.n;
import b.j.a.b.w.e;
import b.j.a.c.a0.a;
import b.j.a.c.a0.d;
import b.j.a.c.a0.g;
import b.j.a.c.a0.h;
import b.j.a.c.e0.f0;
import b.j.a.c.e0.p;
import b.j.a.c.e0.q;
import b.j.a.c.f0.b;
import java.io.Serializable;

public final class w extends h<x, w> implements Serializable {
    public static final n z = new e();
    public final n t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;

    public w(a aVar, b bVar, f0 f0Var, b.j.a.c.j0.w wVar, d dVar) {
        super(aVar, bVar, f0Var, wVar, dVar);
        this.u = g.c(x.class);
        this.t = z;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
    }

    public w(w wVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(wVar, i2);
        this.u = i3;
        this.t = wVar.t;
        this.v = i4;
        this.w = i5;
        this.x = i6;
        this.y = i7;
    }

    public h q(int i2) {
        return new w(this, i2, this.u, this.v, this.w, this.x, this.y);
    }

    public <T extends c> T v(i iVar) {
        q qVar = (q) this.f1609i.f1586h;
        T b2 = qVar.b(iVar);
        if (b2 == null) {
            b2 = qVar.a(this, iVar);
            if (b2 == null) {
                b2 = new p(qVar.d(this, iVar, this, true, "set"));
            }
            qVar.f1945h.c(iVar, b2);
        }
        return b2;
    }

    public final boolean w(x xVar) {
        return (xVar.f2319i & this.u) != 0;
    }
}
