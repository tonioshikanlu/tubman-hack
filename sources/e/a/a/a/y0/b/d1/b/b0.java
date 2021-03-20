package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.a;
import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.a.d0.t;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;

public final class b0 extends u implements t {
    public final b a;

    public b0(b bVar) {
        i.e(bVar, "fqName");
        this.a = bVar;
    }

    public Collection<g> D(l<? super d, Boolean> lVar) {
        i.e(lVar, "nameFilter");
        return o.f7934h;
    }

    public b e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && i.a(this.a, ((b0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public a i(b bVar) {
        i.e(bVar, "fqName");
        return null;
    }

    public /* bridge */ /* synthetic */ Collection k() {
        return o.f7934h;
    }

    public Collection<t> q() {
        return o.f7934h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        b.e.a.a.a.I(b0.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    public boolean u() {
        return false;
    }
}
