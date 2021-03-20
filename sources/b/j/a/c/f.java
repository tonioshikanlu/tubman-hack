package b.j.a.c;

import b.j.a.c.a0.a;
import b.j.a.c.a0.d;
import b.j.a.c.a0.g;
import b.j.a.c.a0.h;
import b.j.a.c.b0.m;
import b.j.a.c.e0.f0;
import b.j.a.c.e0.p;
import b.j.a.c.e0.q;
import b.j.a.c.f0.b;
import b.j.a.c.g0.k;
import b.j.a.c.j0.n;
import b.j.a.c.j0.w;
import java.io.Serializable;

public final class f extends h<h, f> implements Serializable {
    public final n<m> t;
    public final k u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public f(a aVar, b bVar, f0 f0Var, w wVar, d dVar) {
        super(aVar, bVar, f0Var, wVar, dVar);
        this.v = g.c(h.class);
        this.u = k.f2016i;
        this.t = null;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public f(f fVar, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(fVar, i2);
        this.v = i3;
        this.u = fVar.u;
        this.t = fVar.t;
        this.w = i4;
        this.x = i5;
        this.y = i6;
        this.z = i7;
    }

    public h q(int i2) {
        return new f(this, i2, this.v, this.w, this.x, this.y, this.z);
    }

    public <T extends c> T v(i iVar) {
        q qVar = (q) this.f1609i.f1586h;
        T b2 = qVar.b(iVar);
        if (b2 == null) {
            b2 = qVar.a(this, iVar);
            if (b2 == null) {
                b2 = new p(qVar.d(this, iVar, this, false, "set"));
            }
            qVar.f1945h.c(iVar, b2);
        }
        return b2;
    }

    public <T extends c> T w(i iVar) {
        q qVar = (q) this.f1609i.f1586h;
        T b2 = qVar.b(iVar);
        if (b2 != null) {
            return b2;
        }
        T a = qVar.a(this, iVar);
        return a == null ? new p(qVar.d(this, iVar, this, false, "set")) : a;
    }

    public final boolean x(h hVar) {
        return (hVar.f2032i & this.v) != 0;
    }
}
