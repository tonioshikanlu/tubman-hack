package e.a.a.a.y0.d.a;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.c;
import e.a.a.a.y0.f.d;
import e.j;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class g {
    public static final Map<b, d> a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<d, List<d>> f8570b;
    public static final Set<b> c;
    public static final Set<d> d;

    /* renamed from: e  reason: collision with root package name */
    public static final g f8571e = new g();

    public static final class a extends k implements l<e.a.a.a.y0.b.b, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f8572h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            e.a.a.a.y0.b.b bVar = (e.a.a.a.y0.b.b) obj;
            i.e(bVar, "it");
            return Boolean.valueOf(g.f8571e.b(bVar));
        }
    }

    static {
        g.d dVar = e.a.a.a.y0.a.g.f7647k;
        c cVar = dVar.f7665q;
        i.d(cVar, "BUILTIN_NAMES._enum");
        c cVar2 = dVar.f7665q;
        i.d(cVar2, "BUILTIN_NAMES._enum");
        b bVar = dVar.I;
        i.d(bVar, "BUILTIN_NAMES.collection");
        b bVar2 = dVar.M;
        i.d(bVar2, "BUILTIN_NAMES.map");
        c cVar3 = dVar.f7654e;
        i.d(cVar3, "BUILTIN_NAMES.charSequence");
        b bVar3 = dVar.M;
        i.d(bVar3, "BUILTIN_NAMES.map");
        b bVar4 = dVar.M;
        i.d(bVar4, "BUILTIN_NAMES.map");
        b bVar5 = dVar.M;
        i.d(bVar5, "BUILTIN_NAMES.map");
        Map<b, d> E = e.t.g.E(new j(b.q.a.a.f(cVar, "name"), d.l("name")), new j(b.q.a.a.f(cVar2, "ordinal"), d.l("ordinal")), new j(b.q.a.a.e(bVar, "size"), d.l("size")), new j(b.q.a.a.e(bVar2, "size"), d.l("size")), new j(b.q.a.a.f(cVar3, "length"), d.l("length")), new j(b.q.a.a.e(bVar3, "keys"), d.l("keySet")), new j(b.q.a.a.e(bVar4, "values"), d.l("values")), new j(b.q.a.a.e(bVar5, "entries"), d.l("entrySet")));
        a = E;
        Set<Map.Entry<b, d>> entrySet = E.entrySet();
        ArrayList<j> arrayList = new ArrayList<>(b.q.a.a.C(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new j(((b) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (j jVar : arrayList) {
            B b2 = jVar.f7907i;
            i.d(b2, "it.second");
            d dVar2 = (d) b2;
            Object obj = linkedHashMap.get(dVar2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dVar2, obj);
            }
            ((List) obj).add((d) jVar.f7906h);
        }
        f8570b = linkedHashMap;
        Set<b> keySet = a.keySet();
        c = keySet;
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(keySet, 10));
        for (b g2 : keySet) {
            arrayList2.add(g2.g());
        }
        d = e.t.g.d0(arrayList2);
    }

    public final String a(e.a.a.a.y0.b.b bVar) {
        d dVar;
        i.e(bVar, "$this$getBuiltinSpecialPropertyGetterName");
        e.a.a.a.y0.a.g.B(bVar);
        e.a.a.a.y0.b.b c2 = e.a.a.a.y0.j.v.b.c(e.a.a.a.y0.j.v.b.m(bVar), false, a.f8572h, 1);
        if (c2 == null || (dVar = a.get(e.a.a.a.y0.j.v.b.h(c2))) == null) {
            return null;
        }
        return dVar.e();
    }

    public final boolean b(e.a.a.a.y0.b.b bVar) {
        i.e(bVar, "callableMemberDescriptor");
        if (!d.contains(bVar.getName())) {
            return false;
        }
        if (e.t.g.e(c, e.a.a.a.y0.j.v.b.d(bVar)) && bVar.n().isEmpty()) {
            return true;
        }
        if (!e.a.a.a.y0.a.g.B(bVar)) {
            return false;
        }
        Collection<? extends e.a.a.a.y0.b.b> g2 = bVar.g();
        i.d(g2, "overriddenDescriptors");
        if (g2.isEmpty()) {
            return false;
        }
        for (e.a.a.a.y0.b.b bVar2 : g2) {
            g gVar = f8571e;
            i.d(bVar2, "it");
            if (gVar.b(bVar2)) {
                return true;
            }
        }
        return false;
    }
}
