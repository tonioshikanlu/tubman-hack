package b.j.a.c.b0;

import b.e.a.a.a;
import b.j.a.c.e0.h;
import b.j.a.c.e0.l;
import b.j.a.c.f;
import b.j.a.c.f0.c;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.j0.b;
import b.j.a.c.s;
import b.j.a.c.t;

public class k extends u {
    public boolean A;
    public final l w;
    public final Object x;
    public u y;
    public final int z;

    public k(k kVar, j<?> jVar, r rVar) {
        super(kVar, jVar, rVar);
        this.w = kVar.w;
        this.x = kVar.x;
        this.y = kVar.y;
        this.z = kVar.z;
        this.A = kVar.A;
    }

    public k(k kVar, t tVar) {
        super(kVar, tVar);
        this.w = kVar.w;
        this.x = kVar.x;
        this.y = kVar.y;
        this.z = kVar.z;
        this.A = kVar.A;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(t tVar, i iVar, t tVar2, c cVar, b bVar, l lVar, int i2, Object obj, s sVar) {
        super(tVar, iVar, tVar2, cVar, bVar, sVar);
        this.w = lVar;
        this.z = i2;
        this.x = obj;
        this.y = null;
    }

    public void A() {
        this.A = true;
    }

    public void B(Object obj, Object obj2) {
        K();
        this.y.B(obj, obj2);
    }

    public Object D(Object obj, Object obj2) {
        K();
        return this.y.D(obj, obj2);
    }

    public u G(t tVar) {
        return new k(this, tVar);
    }

    public u H(r rVar) {
        return new k(this, this.f1800o, rVar);
    }

    public u J(j<?> jVar) {
        return this.f1800o == jVar ? this : new k(this, jVar, this.f1802q);
    }

    public final void K() {
        if (this.y == null) {
            throw new b.j.a.c.c0.b((b.j.a.b.i) null, a.q(a.y("No fallback setter/field defined for creator property '"), this.f1796k.f2305h, "'"), this.f1797l);
        }
    }

    public h e() {
        return this.w;
    }

    public void f(b.j.a.b.i iVar, g gVar, Object obj) {
        K();
        this.y.B(obj, c(iVar, gVar));
    }

    public Object g(b.j.a.b.i iVar, g gVar, Object obj) {
        K();
        return this.y.D(obj, c(iVar, gVar));
    }

    public void k(f fVar) {
        u uVar = this.y;
        if (uVar != null) {
            uVar.k(fVar);
        }
    }

    public int n() {
        return this.z;
    }

    public Object q() {
        return this.x;
    }

    public String toString() {
        StringBuilder y2 = a.y("[creator property, name '");
        y2.append(this.f1796k.f2305h);
        y2.append("'; inject id '");
        y2.append(this.x);
        y2.append("']");
        return y2.toString();
    }

    public boolean z() {
        return this.A;
    }
}
