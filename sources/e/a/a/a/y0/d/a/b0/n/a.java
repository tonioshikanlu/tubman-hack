package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.a.d0.n;
import e.a.a.a.y0.d.a.d0.p;
import e.a.a.a.y0.d.a.d0.q;
import e.a.a.a.y0.f.d;
import e.b0.e;
import e.b0.h;
import e.b0.s;
import e.t.o;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a implements b {
    public final l<q, Boolean> a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, List<q>> f8372b;
    public final Map<d, n> c;
    public final g d;

    /* renamed from: e  reason: collision with root package name */
    public final l<p, Boolean> f8373e;

    /* renamed from: e.a.a.a.y0.d.a.b0.n.a$a  reason: collision with other inner class name */
    public static final class C0171a extends k implements l<q, Boolean> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a f8374h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0171a(a aVar) {
            super(1);
            this.f8374h = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
            if (r5 != false) goto L_0x008e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                e.a.a.a.y0.d.a.d0.q r5 = (e.a.a.a.y0.d.a.d0.q) r5
                java.lang.String r0 = "m"
                e.x.c.i.e(r5, r0)
                e.a.a.a.y0.d.a.b0.n.a r0 = r4.f8374h
                e.x.b.l<e.a.a.a.y0.d.a.d0.p, java.lang.Boolean> r0 = r0.f8373e
                java.lang.Object r0 = r0.invoke(r5)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x008e
                e.a.a.a.y0.d.a.d0.g r0 = r5.N()
                boolean r0 = r0.F()
                if (r0 == 0) goto L_0x008a
                e.a.a.a.y0.f.d r0 = r5.getName()
                java.lang.String r0 = r0.e()
                java.lang.String r3 = "toString"
                boolean r3 = r0.equals(r3)
                if (r3 != 0) goto L_0x007e
                java.lang.String r3 = "hashCode"
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L_0x003c
                goto L_0x007e
            L_0x003c:
                java.lang.String r3 = "equals"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x007c
                java.util.List r5 = r5.n()
                int r0 = r5.size()
                if (r0 != r1) goto L_0x007c
                java.lang.Object r5 = r5.get(r2)
                e.a.a.a.y0.d.a.d0.y r5 = (e.a.a.a.y0.d.a.d0.y) r5
                e.a.a.a.y0.d.a.d0.v r5 = r5.d()
                boolean r0 = r5 instanceof e.a.a.a.y0.d.a.d0.j
                if (r0 == 0) goto L_0x007c
                e.a.a.a.y0.d.a.d0.j r5 = (e.a.a.a.y0.d.a.d0.j) r5
                e.a.a.a.y0.d.a.d0.i r5 = r5.b()
                boolean r0 = r5 instanceof e.a.a.a.y0.d.a.d0.g
                if (r0 == 0) goto L_0x007c
                e.a.a.a.y0.d.a.d0.g r5 = (e.a.a.a.y0.d.a.d0.g) r5
                e.a.a.a.y0.f.b r5 = r5.e()
                if (r5 == 0) goto L_0x007c
                java.lang.String r5 = r5.b()
                java.lang.String r0 = "java.lang.Object"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x007c
                r5 = r1
                goto L_0x0086
            L_0x007c:
                r5 = r2
                goto L_0x0086
            L_0x007e:
                java.util.List r5 = r5.n()
                boolean r5 = r5.isEmpty()
            L_0x0086:
                if (r5 == 0) goto L_0x008a
                r5 = r1
                goto L_0x008b
            L_0x008a:
                r5 = r2
            L_0x008b:
                if (r5 != 0) goto L_0x008e
                goto L_0x008f
            L_0x008e:
                r1 = r2
            L_0x008f:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.b0.n.a.C0171a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public a(g gVar, l<? super p, Boolean> lVar) {
        i.e(gVar, "jClass");
        i.e(lVar, "memberFilter");
        this.d = gVar;
        this.f8373e = lVar;
        C0171a aVar = new C0171a(this);
        this.a = aVar;
        h<T> c2 = s.c(e.t.g.d(gVar.K()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e.a aVar2 = new e.a((e) c2);
        while (aVar2.hasNext()) {
            Object next = aVar2.next();
            d name = ((q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f8372b = linkedHashMap;
        h<T> c3 = s.c(e.t.g.d(this.d.w()), this.f8373e);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        e.a aVar3 = new e.a((e) c3);
        while (aVar3.hasNext()) {
            Object next2 = aVar3.next();
            linkedHashMap2.put(((n) next2).getName(), next2);
        }
        this.c = linkedHashMap2;
    }

    public Set<d> a() {
        h<T> c2 = s.c(e.t.g.d(this.d.K()), this.a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a aVar = new e.a((e) c2);
        while (aVar.hasNext()) {
            linkedHashSet.add(((q) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    public n b(d dVar) {
        i.e(dVar, "name");
        return this.c.get(dVar);
    }

    public Set<d> c() {
        h<T> c2 = s.c(e.t.g.d(this.d.w()), this.f8373e);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e.a aVar = new e.a((e) c2);
        while (aVar.hasNext()) {
            linkedHashSet.add(((n) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    public Collection<q> d(d dVar) {
        i.e(dVar, "name");
        List list = this.f8372b.get(dVar);
        return list != null ? list : o.f7934h;
    }
}
