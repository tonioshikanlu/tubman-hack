package b.j.a.c.j0;

import b.j.a.a.r;
import b.j.a.c.a0.g;
import b.j.a.c.b;
import b.j.a.c.e0.f;
import b.j.a.c.e0.h;
import b.j.a.c.e0.l;
import b.j.a.c.e0.r;
import b.j.a.c.i;
import b.j.a.c.i0.n;
import b.j.a.c.s;
import b.j.a.c.t;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

public class x extends r {

    /* renamed from: i  reason: collision with root package name */
    public final b f2240i;

    /* renamed from: j  reason: collision with root package name */
    public final h f2241j;

    /* renamed from: k  reason: collision with root package name */
    public final s f2242k;

    /* renamed from: l  reason: collision with root package name */
    public final t f2243l;

    /* renamed from: m  reason: collision with root package name */
    public final r.b f2244m;

    public x(b bVar, h hVar, t tVar, s sVar, r.b bVar2) {
        this.f2240i = bVar;
        this.f2241j = hVar;
        this.f2243l = tVar;
        this.f2242k = sVar == null ? s.f2293p : sVar;
        this.f2244m = bVar2;
    }

    public static x M(g<?> gVar, h hVar, t tVar, s sVar, r.a aVar) {
        r.b bVar;
        r.a aVar2;
        if (aVar == null || aVar == (aVar2 = r.a.USE_DEFAULTS)) {
            bVar = b.j.a.c.e0.r.f1946h;
        } else {
            bVar = aVar != aVar2 ? new r.b(aVar, (r.a) null, (Class<?>) null, (Class<?>) null) : r.b.f1352l;
        }
        return new x(gVar.e(), hVar, tVar, sVar, bVar);
    }

    public h A() {
        return this.f2241j;
    }

    public i B() {
        h hVar = this.f2241j;
        return hVar == null ? n.o() : hVar.f();
    }

    public Class<?> C() {
        h hVar = this.f2241j;
        return hVar == null ? Object.class : hVar.e();
    }

    public b.j.a.c.e0.i D() {
        h hVar = this.f2241j;
        if (!(hVar instanceof b.j.a.c.e0.i) || ((b.j.a.c.e0.i) hVar).t() != 1) {
            return null;
        }
        return (b.j.a.c.e0.i) this.f2241j;
    }

    public t E() {
        b bVar = this.f2240i;
        if (!(bVar == null || this.f2241j == null)) {
            Objects.requireNonNull(bVar);
        }
        return null;
    }

    public boolean F() {
        return this.f2241j instanceof l;
    }

    public boolean G() {
        return this.f2241j instanceof f;
    }

    public boolean H(t tVar) {
        return this.f2243l.equals(tVar);
    }

    public boolean I() {
        return D() != null;
    }

    public boolean J() {
        return false;
    }

    public boolean K() {
        return false;
    }

    public String getName() {
        return this.f2243l.f2305h;
    }

    public t h() {
        return this.f2243l;
    }

    public s l() {
        return this.f2242k;
    }

    public r.b r() {
        return this.f2244m;
    }

    public l w() {
        h hVar = this.f2241j;
        if (hVar instanceof l) {
            return (l) hVar;
        }
        return null;
    }

    public Iterator<l> x() {
        h hVar = this.f2241j;
        l lVar = hVar instanceof l ? (l) hVar : null;
        if (lVar == null) {
            return g.c;
        }
        return Collections.singleton(lVar).iterator();
    }

    public f y() {
        h hVar = this.f2241j;
        if (hVar instanceof f) {
            return (f) hVar;
        }
        return null;
    }

    public b.j.a.c.e0.i z() {
        h hVar = this.f2241j;
        if (!(hVar instanceof b.j.a.c.e0.i) || ((b.j.a.c.e0.i) hVar).t() != 0) {
            return null;
        }
        return (b.j.a.c.e0.i) this.f2241j;
    }
}
