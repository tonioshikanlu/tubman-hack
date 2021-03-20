package e.a.a.a.y0.k.b.g0;

import b.q.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.i0;
import e.a.a.a.y0.b.c1.r;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.e.i;
import e.a.a.a.y0.e.z.c;
import e.a.a.a.y0.e.z.e;
import e.a.a.a.y0.e.z.f;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.k.b.g0.g;
import java.util.List;

public final class k extends i0 implements b {
    public g.a K;
    public final i L;
    public final c M;
    public final e N;
    public final e.a.a.a.y0.e.z.g O;
    public final f P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(e.a.a.a.y0.b.k kVar, l0 l0Var, h hVar, d dVar, b.a aVar, i iVar, c cVar, e eVar, e.a.a.a.y0.e.z.g gVar, f fVar, m0 m0Var) {
        super(kVar, l0Var, hVar, dVar, aVar, m0Var != null ? m0Var : m0.a);
        i iVar2 = iVar;
        c cVar2 = cVar;
        e eVar2 = eVar;
        e.a.a.a.y0.e.z.g gVar2 = gVar;
        e.a.a.a.y0.b.k kVar2 = kVar;
        e.x.c.i.e(kVar, "containingDeclaration");
        h hVar2 = hVar;
        e.x.c.i.e(hVar, "annotations");
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(aVar, "kind");
        e.x.c.i.e(iVar2, "proto");
        e.x.c.i.e(cVar2, "nameResolver");
        e.x.c.i.e(eVar2, "typeTable");
        e.x.c.i.e(gVar2, "versionRequirementTable");
        this.L = iVar2;
        this.M = cVar2;
        this.N = eVar2;
        this.O = gVar2;
        this.P = fVar;
        this.K = g.a.COMPATIBLE;
    }

    public e A0() {
        return this.N;
    }

    public f F() {
        return this.P;
    }

    public r K0(e.a.a.a.y0.b.k kVar, s sVar, b.a aVar, d dVar, h hVar, m0 m0Var) {
        d dVar2;
        e.a.a.a.y0.b.k kVar2 = kVar;
        e.x.c.i.e(kVar, "newOwner");
        e.x.c.i.e(aVar, "kind");
        e.x.c.i.e(hVar, "annotations");
        e.x.c.i.e(m0Var, "source");
        l0 l0Var = (l0) sVar;
        if (dVar != null) {
            dVar2 = dVar;
        } else {
            d name = getName();
            e.x.c.i.d(name, "name");
            dVar2 = name;
        }
        k kVar3 = new k(kVar, l0Var, hVar, dVar2, aVar, this.L, this.M, this.N, this.O, this.P, m0Var);
        kVar3.K = this.K;
        return kVar3;
    }

    public e.a.a.a.y0.e.z.g L0() {
        return this.O;
    }

    public c Q0() {
        return this.M;
    }

    public List<f> T0() {
        return a.l1(this);
    }

    public p X() {
        return this.L;
    }
}
