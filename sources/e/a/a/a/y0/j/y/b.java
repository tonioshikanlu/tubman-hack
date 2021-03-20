package e.a.a.a.y0.j.y;

import b.q.a.a;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.m.o1.c;
import e.a.a.a.y0.o.l;
import e.t.g;
import e.t.o;
import e.t.q;
import e.x.c.i;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b implements i {

    /* renamed from: b  reason: collision with root package name */
    public final String f9436b;
    public final i[] c;

    public b(String str, i[] iVarArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9436b = str;
        this.c = iVarArr;
    }

    public static final i h(String str, Iterable<? extends i> iterable) {
        i.e(str, "debugName");
        i.e(iterable, "scopes");
        l lVar = new l();
        for (i iVar : iterable) {
            if (iVar != i.b.f9460b) {
                if (iVar instanceof b) {
                    i[] iVarArr = ((b) iVar).c;
                    e.x.c.i.e(lVar, "$this$addAll");
                    e.x.c.i.e(iVarArr, "elements");
                    lVar.addAll(g.c(iVarArr));
                } else {
                    lVar.add(iVar);
                }
            }
        }
        return i(str, lVar);
    }

    public static final i i(String str, List<? extends i> list) {
        e.x.c.i.e(str, "debugName");
        e.x.c.i.e(list, "scopes");
        l lVar = (l) list;
        int i2 = lVar.f9824h;
        if (i2 == 0) {
            return i.b.f9460b;
        }
        if (i2 == 1) {
            return (i) lVar.get(0);
        }
        Object[] array = lVar.toArray(new i[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new b(str, (i[]) array, (DefaultConstructorMarker) null);
    }

    public Collection<l0> a(d dVar, e.a.a.a.y0.c.a.b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        if (length == 0) {
            return o.f7934h;
        }
        if (length == 1) {
            return iVarArr[0].a(dVar, bVar);
        }
        Collection<l0> collection = null;
        for (i a : iVarArr) {
            collection = c.s(collection, a.a(dVar, bVar));
        }
        return collection != null ? collection : q.f7936h;
    }

    public h b(d dVar, e.a.a.a.y0.c.a.b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        h hVar = null;
        for (i b2 : this.c) {
            h b3 = b2.b(dVar, bVar);
            if (b3 != null) {
                if (!(b3 instanceof e.a.a.a.y0.b.i) || !((e.a.a.a.y0.b.i) b3).m0()) {
                    return b3;
                }
                if (hVar == null) {
                    hVar = b3;
                }
            }
        }
        return hVar;
    }

    public Collection<k> c(d dVar, e.x.b.l<? super d, Boolean> lVar) {
        e.x.c.i.e(dVar, "kindFilter");
        e.x.c.i.e(lVar, "nameFilter");
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        if (length == 0) {
            return o.f7934h;
        }
        if (length == 1) {
            return iVarArr[0].c(dVar, lVar);
        }
        Collection<k> collection = null;
        for (i c2 : iVarArr) {
            collection = c.s(collection, c2.c(dVar, lVar));
        }
        return collection != null ? collection : q.f7936h;
    }

    public Collection<f0> d(d dVar, e.a.a.a.y0.c.a.b bVar) {
        e.x.c.i.e(dVar, "name");
        e.x.c.i.e(bVar, "location");
        i[] iVarArr = this.c;
        int length = iVarArr.length;
        if (length == 0) {
            return o.f7934h;
        }
        if (length == 1) {
            return iVarArr[0].d(dVar, bVar);
        }
        Collection<f0> collection = null;
        for (i d : iVarArr) {
            collection = c.s(collection, d.d(dVar, bVar));
        }
        return collection != null ? collection : q.f7936h;
    }

    public Set<d> e() {
        i[] iVarArr = this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i e2 : iVarArr) {
            g.b(linkedHashSet, e2.e());
        }
        return linkedHashSet;
    }

    public Set<d> f() {
        i[] iVarArr = this.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (i f : iVarArr) {
            g.b(linkedHashSet, f.f());
        }
        return linkedHashSet;
    }

    public Set<d> g() {
        return a.r0(a.r(this.c));
    }

    public String toString() {
        return this.f9436b;
    }
}
