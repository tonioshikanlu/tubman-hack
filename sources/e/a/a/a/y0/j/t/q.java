package e.a.a.a.y0.j.t;

import b.q.a.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.r0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.e0;
import e.a.a.a.y0.m.k0;
import e.a.a.a.y0.m.v0;
import e.f;
import e.t.g;
import e.t.o;
import e.x.c.i;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class q implements v0 {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final w f9418b;
    public final Set<d0> c;
    public final k0 d = e0.d(h.a.a, this, false);

    /* renamed from: e  reason: collision with root package name */
    public final f f9419e = a.h2(new o(this));

    public q(long j2, w wVar, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        Objects.requireNonNull(h.f7785e);
        this.a = j2;
        this.f9418b = wVar;
        this.c = set;
    }

    public v0 a(e.a.a.a.y0.m.l1.f fVar) {
        i.e(fVar, "kotlinTypeRefiner");
        return this;
    }

    public boolean b() {
        return false;
    }

    public e.a.a.a.y0.b.h d() {
        return null;
    }

    public final boolean e(v0 v0Var) {
        i.e(v0Var, "constructor");
        Set<d0> set = this.c;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (d0 W0 : set) {
                if (i.a(W0.W0(), v0Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<r0> g() {
        return o.f7934h;
    }

    public Collection<d0> h() {
        return (List) this.f9419e.getValue();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("IntegerLiteralType");
        StringBuilder v = b.e.a.a.a.v('[');
        v.append(g.x(this.c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, p.f9417h, 30));
        v.append(']');
        y.append(v.toString());
        return y.toString();
    }

    public e.a.a.a.y0.a.g v() {
        return this.f9418b.v();
    }
}
