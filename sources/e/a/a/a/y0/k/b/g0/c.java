package e.a.a.a.y0.k.b.g0;

import b.q.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.i;
import e.a.a.a.y0.b.c1.r;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.e.d;
import e.a.a.a.y0.e.z.e;
import e.a.a.a.y0.e.z.f;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.k.b.g0.g;
import java.util.List;

public final class c extends i implements b {
    public g.a M;
    public final d N;
    public final e.a.a.a.y0.e.z.c O;
    public final e P;
    public final e.a.a.a.y0.e.z.g Q;
    public final f R;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e.a.a.a.y0.b.e eVar, j jVar, h hVar, boolean z, b.a aVar, d dVar, e.a.a.a.y0.e.z.c cVar, e eVar2, e.a.a.a.y0.e.z.g gVar, f fVar, m0 m0Var) {
        super(eVar, jVar, hVar, z, aVar, m0Var != null ? m0Var : m0.a);
        d dVar2 = dVar;
        e.a.a.a.y0.e.z.c cVar2 = cVar;
        e eVar3 = eVar2;
        e.a.a.a.y0.e.z.g gVar2 = gVar;
        e.a.a.a.y0.b.e eVar4 = eVar;
        e.x.c.i.e(eVar, "containingDeclaration");
        h hVar2 = hVar;
        e.x.c.i.e(hVar, "annotations");
        e.x.c.i.e(aVar, "kind");
        e.x.c.i.e(dVar2, "proto");
        e.x.c.i.e(cVar2, "nameResolver");
        e.x.c.i.e(eVar3, "typeTable");
        e.x.c.i.e(gVar2, "versionRequirementTable");
        this.N = dVar2;
        this.O = cVar2;
        this.P = eVar3;
        this.Q = gVar2;
        this.R = fVar;
        this.M = g.a.COMPATIBLE;
    }

    public e A0() {
        return this.P;
    }

    public f F() {
        return this.R;
    }

    public boolean J() {
        return false;
    }

    public /* bridge */ /* synthetic */ r K0(k kVar, s sVar, b.a aVar, e.a.a.a.y0.f.d dVar, h hVar, m0 m0Var) {
        return f1(kVar, sVar, aVar, hVar, m0Var);
    }

    public e.a.a.a.y0.e.z.g L0() {
        return this.Q;
    }

    public e.a.a.a.y0.e.z.c Q0() {
        return this.O;
    }

    public List<f> T0() {
        return a.l1(this);
    }

    public p X() {
        return this.N;
    }

    public /* bridge */ /* synthetic */ i b1(k kVar, s sVar, b.a aVar, e.a.a.a.y0.f.d dVar, h hVar, m0 m0Var) {
        return f1(kVar, sVar, aVar, hVar, m0Var);
    }

    public c f1(k kVar, s sVar, b.a aVar, h hVar, m0 m0Var) {
        k kVar2 = kVar;
        e.x.c.i.e(kVar2, "newOwner");
        b.a aVar2 = aVar;
        e.x.c.i.e(aVar2, "kind");
        h hVar2 = hVar;
        e.x.c.i.e(hVar2, "annotations");
        m0 m0Var2 = m0Var;
        e.x.c.i.e(m0Var2, "source");
        c cVar = new c((e.a.a.a.y0.b.e) kVar2, (j) sVar, hVar2, this.K, aVar2, this.N, this.O, this.P, this.Q, this.R, m0Var2);
        g.a aVar3 = this.M;
        e.x.c.i.e(aVar3, "<set-?>");
        cVar.M = aVar3;
        return cVar;
    }

    public boolean l() {
        return false;
    }

    public boolean r0() {
        return false;
    }

    public boolean t0() {
        return false;
    }
}
