package e.a.a.a.y0.j.y;

import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.o.l;
import e.t.g;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class n extends a {
    public static final /* synthetic */ int c = 0;

    /* renamed from: b  reason: collision with root package name */
    public final i f9466b;

    public static final class a {
        public static final i a(String str, Collection<? extends d0> collection) {
            i.e(str, "message");
            i.e(collection, "types");
            ArrayList arrayList = new ArrayList(b.q.a.a.C(collection, 10));
            for (d0 z : collection) {
                arrayList.add(z.z());
            }
            l<i> T = e.a.a.a.y0.m.o1.c.T(arrayList);
            i i2 = b.i(str, T);
            if (T.f9824h <= 1) {
                return i2;
            }
            return new n(str, i2, (DefaultConstructorMarker) null);
        }
    }

    public static final class b extends k implements e.x.b.l<e.a.a.a.y0.b.a, e.a.a.a.y0.b.a> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f9467h = new b();

        public b() {
            super(1);
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.b.a aVar = (e.a.a.a.y0.b.a) obj;
            i.e(aVar, "$receiver");
            return aVar;
        }
    }

    public static final class c extends k implements e.x.b.l<l0, e.a.a.a.y0.b.a> {

        /* renamed from: h  reason: collision with root package name */
        public static final c f9468h = new c();

        public c() {
            super(1);
        }

        public Object invoke(Object obj) {
            l0 l0Var = (l0) obj;
            i.e(l0Var, "$receiver");
            return l0Var;
        }
    }

    public static final class d extends k implements e.x.b.l<f0, e.a.a.a.y0.b.a> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f9469h = new d();

        public d() {
            super(1);
        }

        public Object invoke(Object obj) {
            f0 f0Var = (f0) obj;
            i.e(f0Var, "$receiver");
            return f0Var;
        }
    }

    public n(String str, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9466b = iVar;
    }

    public Collection<l0> a(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return b.q.a.a.Q2(super.a(dVar, bVar), c.f9468h);
    }

    public Collection<e.a.a.a.y0.b.k> c(d dVar, e.x.b.l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        Collection<e.a.a.a.y0.b.k> c2 = super.c(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : c2) {
            if (((e.a.a.a.y0.b.k) next) instanceof e.a.a.a.y0.b.a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        List list = arrayList;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return g.I(b.q.a.a.Q2(list, b.f9467h), arrayList2);
    }

    public Collection<f0> d(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return b.q.a.a.Q2(super.d(dVar, bVar), d.f9469h);
    }

    public i i() {
        return this.f9466b;
    }
}
