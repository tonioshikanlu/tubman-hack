package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.f0;
import e.a.a.a.y0.b.l0;
import e.a.a.a.y0.d.a.b0.n.b;
import e.a.a.a.y0.d.a.d0.a0;
import e.a.a.a.y0.d.a.d0.g;
import e.a.a.a.y0.d.a.d0.t;
import e.a.a.a.y0.d.a.n;
import e.a.a.a.y0.d.b.k;
import e.a.a.a.y0.d.b.w.a;
import e.a.a.a.y0.j.y.d;
import e.a.a.a.y0.k.b.f;
import e.a.a.a.y0.k.b.h;
import e.a.a.a.y0.l.h;
import e.t.o;
import e.t.q;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j extends s {

    /* renamed from: n  reason: collision with root package name */
    public final e.a.a.a.y0.l.j<Set<String>> f8415n;

    /* renamed from: o  reason: collision with root package name */
    public final h<a, e> f8416o;

    /* renamed from: p  reason: collision with root package name */
    public final t f8417p;

    /* renamed from: q  reason: collision with root package name */
    public final i f8418q;

    public static final class a {
        public final e.a.a.a.y0.f.d a;

        /* renamed from: b  reason: collision with root package name */
        public final g f8419b;

        public a(e.a.a.a.y0.f.d dVar, g gVar) {
            i.e(dVar, "name");
            this.a = dVar;
            this.f8419b = gVar;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static abstract class b {

        public static final class a extends b {
            public final e a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e eVar) {
                super((DefaultConstructorMarker) null);
                i.e(eVar, "descriptor");
                this.a = eVar;
            }
        }

        /* renamed from: e.a.a.a.y0.d.a.b0.n.j$b$b  reason: collision with other inner class name */
        public static final class C0174b extends b {
            public static final C0174b a = new C0174b();

            public C0174b() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class c extends b {
            public static final c a = new c();

            public c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c extends k implements l<a, e> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ j f8420h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.y0.d.a.b0.h f8421i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar, e.a.a.a.y0.d.a.b0.h hVar) {
            super(1);
            this.f8420h = jVar;
            this.f8421i = hVar;
        }

        public Object invoke(Object obj) {
            k.a aVar;
            e eVar;
            a aVar2 = (a) obj;
            i.e(aVar2, "request");
            e.a.a.a.y0.f.a aVar3 = new e.a.a.a.y0.f.a(this.f8420h.f8418q.f8173l, aVar2.a);
            g gVar = aVar2.f8419b;
            if (gVar != null) {
                aVar = this.f8421i.c.c.a(gVar);
            } else {
                aVar = this.f8421i.c.c.c(aVar3);
            }
            e.a.a.a.y0.d.b.l lVar = null;
            e.a.a.a.y0.d.b.l a = aVar != null ? aVar.a() : null;
            e.a.a.a.y0.f.a g2 = a != null ? a.g() : null;
            if (g2 != null && (g2.k() || g2.c)) {
                return null;
            }
            j jVar = this.f8420h;
            Objects.requireNonNull(jVar);
            Object obj2 = b.C0174b.a;
            if (a != null) {
                if (a.a().a == a.C0184a.CLASS) {
                    e.a.a.a.y0.d.b.d dVar = jVar.f8431k.c.d;
                    Objects.requireNonNull(dVar);
                    i.e(a, "kotlinClass");
                    f f = dVar.f(a);
                    if (f != null) {
                        e.a.a.a.y0.k.b.j jVar2 = dVar.a;
                        if (jVar2 != null) {
                            e.a.a.a.y0.k.b.h hVar = jVar2.a;
                            e.a.a.a.y0.f.a g3 = a.g();
                            Objects.requireNonNull(hVar);
                            i.e(g3, "classId");
                            eVar = hVar.a.invoke(new h.a(g3, f));
                        } else {
                            i.m("components");
                            throw null;
                        }
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        obj2 = new b.a(eVar);
                    }
                } else {
                    obj2 = b.c.a;
                }
            }
            if (obj2 instanceof b.a) {
                return ((b.a) obj2).a;
            }
            if (obj2 instanceof b.c) {
                return null;
            }
            if (obj2 instanceof b.C0174b) {
                g gVar2 = aVar2.f8419b;
                if (gVar2 == null) {
                    n nVar = this.f8421i.c.f8346b;
                    if (aVar != null) {
                        if (!(aVar instanceof k.a.C0183a)) {
                            aVar = null;
                        }
                        k.a.C0183a aVar4 = (k.a.C0183a) aVar;
                    }
                    gVar2 = nVar.b(new n.a(aVar3, (byte[]) null, (g) null, 4));
                }
                if ((gVar2 != null ? gVar2.G() : null) == a0.BINARY) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Couldn't find kotlin binary class for light class created by kotlin binary file\n");
                    sb.append("JavaClass: ");
                    sb.append(gVar2);
                    sb.append(10);
                    sb.append("ClassId: ");
                    sb.append(aVar3);
                    sb.append(10);
                    sb.append("findKotlinClass(JavaClass) = ");
                    e.a.a.a.y0.d.b.k kVar = this.f8421i.c.c;
                    i.e(kVar, "$this$findKotlinClass");
                    i.e(gVar2, "javaClass");
                    k.a a2 = kVar.a(gVar2);
                    if (a2 != null) {
                        lVar = a2.a();
                    }
                    sb.append(lVar);
                    sb.append(10);
                    sb.append("findKotlinClass(ClassId) = ");
                    sb.append(b.q.a.a.n0(this.f8421i.c.c, aVar3));
                    sb.append(10);
                    throw new IllegalStateException(sb.toString());
                }
                e.a.a.a.y0.f.b e2 = gVar2 != null ? gVar2.e() : null;
                if (e2 == null || e2.d() || (!i.a(e2.e(), this.f8420h.f8418q.f8173l))) {
                    return null;
                }
                e eVar2 = new e(this.f8421i, this.f8420h.f8418q, gVar2, (e) null);
                this.f8421i.c.s.a(eVar2);
                return eVar2;
            }
            throw new e.h();
        }
    }

    public static final class d extends e.x.c.k implements e.x.b.a<Set<? extends String>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ j f8422h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.y0.d.a.b0.h f8423i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j jVar, e.a.a.a.y0.d.a.b0.h hVar) {
            super(0);
            this.f8422h = jVar;
            this.f8423i = hVar;
        }

        public Object e() {
            return this.f8423i.c.f8346b.c(this.f8422h.f8418q.f8173l);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(e.a.a.a.y0.d.a.b0.h hVar, t tVar, i iVar) {
        super(hVar);
        i.e(hVar, "c");
        i.e(tVar, "jPackage");
        i.e(iVar, "ownerDescriptor");
        this.f8417p = tVar;
        this.f8418q = iVar;
        this.f8415n = hVar.c.a.d(new d(this, hVar));
        this.f8416o = hVar.c.a.i(new c(this, hVar));
    }

    public e.a.a.a.y0.b.h b(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return u(dVar, (g) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<e.a.a.a.y0.b.k> c(e.a.a.a.y0.j.y.d r5, e.x.b.l<? super e.a.a.a.y0.f.d, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            e.x.c.i.e(r5, r0)
            java.lang.String r0 = "nameFilter"
            e.x.c.i.e(r6, r0)
            e.a.a.a.y0.j.y.d$a r0 = e.a.a.a.y0.j.y.d.u
            int r0 = e.a.a.a.y0.j.y.d.f9443k
            int r1 = e.a.a.a.y0.j.y.d.d
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L_0x001a
            e.t.o r5 = e.t.o.f7934h
            goto L_0x005d
        L_0x001a:
            e.a.a.a.y0.l.i<java.util.Collection<e.a.a.a.y0.b.k>> r5 = r4.f8425b
            java.lang.Object r5 = r5.e()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r5.next()
            r2 = r1
            e.a.a.a.y0.b.k r2 = (e.a.a.a.y0.b.k) r2
            boolean r3 = r2 instanceof e.a.a.a.y0.b.e
            if (r3 == 0) goto L_0x0055
            e.a.a.a.y0.b.e r2 = (e.a.a.a.y0.b.e) r2
            e.a.a.a.y0.f.d r2 = r2.getName()
            java.lang.String r3 = "it.name"
            e.x.c.i.d(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x002b
            r0.add(r1)
            goto L_0x002b
        L_0x005c:
            r5 = r0
        L_0x005d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.a.y0.d.a.b0.n.j.c(e.a.a.a.y0.j.y.d, e.x.b.l):java.util.Collection");
    }

    public Collection<f0> d(e.a.a.a.y0.f.d dVar, e.a.a.a.y0.c.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return o.f7934h;
    }

    public Set<e.a.a.a.y0.f.d> h(e.a.a.a.y0.j.y.d dVar, l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        d.a aVar = e.a.a.a.y0.j.y.d.u;
        if (!dVar.a(e.a.a.a.y0.j.y.d.d)) {
            return q.f7936h;
        }
        Set<String> set = (Set) this.f8415n.e();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String l2 : set) {
                hashSet.add(e.a.a.a.y0.f.d.l(l2));
            }
            return hashSet;
        }
        t tVar = this.f8417p;
        l<Object, Boolean> lVar2 = lVar;
        if (lVar == null) {
            lVar2 = e.a.a.a.y0.o.g.a;
        }
        Collection<g> D = tVar.D(lVar2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (g gVar : D) {
            e.a.a.a.y0.f.d name = gVar.G() == a0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Set<e.a.a.a.y0.f.d> i(e.a.a.a.y0.j.y.d dVar, l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        return q.f7936h;
    }

    public b j() {
        return b.a.a;
    }

    public void l(Collection<l0> collection, e.a.a.a.y0.f.d dVar) {
        i.e(collection, "result");
        i.e(dVar, "name");
    }

    public Set<e.a.a.a.y0.f.d> n(e.a.a.a.y0.j.y.d dVar, l<? super e.a.a.a.y0.f.d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        return q.f7936h;
    }

    public e.a.a.a.y0.b.k p() {
        return this.f8418q;
    }

    public final e u(e.a.a.a.y0.f.d dVar, g gVar) {
        e.a.a.a.y0.f.d dVar2 = e.a.a.a.y0.f.f.a;
        boolean z = true;
        if (dVar != null) {
            if (dVar.e().isEmpty() || dVar.f9211i) {
                z = false;
            }
            if (!z) {
                return null;
            }
            Set set = (Set) this.f8415n.e();
            if (gVar != null || set == null || set.contains(dVar.e())) {
                return this.f8416o.invoke(new a(dVar, gVar));
            }
            return null;
        }
        e.a.a.a.y0.f.f.a(1);
        throw null;
    }
}
