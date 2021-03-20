package e.a.a.a.y0.d.a.b0.n;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.c1.c0;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.d.a.b0.h;
import e.a.a.a.y0.d.a.d0.t;
import e.a.a.a.y0.d.a.d0.x;
import e.a.a.a.y0.d.b.m;
import e.a.a.a.y0.d.b.p;
import e.a.l;
import e.j;
import e.t.g;
import e.t.o;
import e.x.c.k;
import e.x.c.q;
import e.x.c.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class i extends c0 {
    public static final /* synthetic */ l[] s;

    /* renamed from: m  reason: collision with root package name */
    public final h f8407m;

    /* renamed from: n  reason: collision with root package name */
    public final e.a.a.a.y0.l.i f8408n;

    /* renamed from: o  reason: collision with root package name */
    public final c f8409o;

    /* renamed from: p  reason: collision with root package name */
    public final e.a.a.a.y0.l.i<List<e.a.a.a.y0.f.b>> f8410p;

    /* renamed from: q  reason: collision with root package name */
    public final e.a.a.a.y0.b.a1.h f8411q;
    public final t r;

    public static final class a extends k implements e.x.b.a<Map<String, ? extends e.a.a.a.y0.d.b.l>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i f8412h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(0);
            this.f8412h = iVar;
        }

        public Object e() {
            i iVar = this.f8412h;
            p pVar = iVar.f8407m.c.f8353l;
            String b2 = iVar.f8173l.b();
            e.x.c.i.d(b2, "fqName.asString()");
            List<String> a = pVar.a(b2);
            ArrayList arrayList = new ArrayList();
            for (String str : a) {
                e.a.a.a.y0.j.w.b d = e.a.a.a.y0.j.w.b.d(str);
                e.x.c.i.d(d, "JvmClassName.byInternalName(partName)");
                e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b(d.a.replace('/', '.')));
                e.x.c.i.d(l2, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
                e.a.a.a.y0.d.b.l n0 = b.q.a.a.n0(this.f8412h.f8407m.c.c, l2);
                j jVar = n0 != null ? new j(str, n0) : null;
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return g.X(arrayList);
        }
    }

    public static final class b extends k implements e.x.b.a<HashMap<e.a.a.a.y0.j.w.b, e.a.a.a.y0.j.w.b>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i f8413h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i iVar) {
            super(0);
            this.f8413h = iVar;
        }

        public Object e() {
            String a;
            HashMap hashMap = new HashMap();
            for (Map.Entry next : this.f8413h.w0().entrySet()) {
                e.a.a.a.y0.j.w.b d = e.a.a.a.y0.j.w.b.d((String) next.getKey());
                e.x.c.i.d(d, "JvmClassName.byInternalName(partInternalName)");
                e.a.a.a.y0.d.b.w.a a2 = ((e.a.a.a.y0.d.b.l) next.getValue()).a();
                int ordinal = a2.a.ordinal();
                if (ordinal == 2) {
                    hashMap.put(d, d);
                } else if (ordinal == 5 && (a = a2.a()) != null) {
                    e.a.a.a.y0.j.w.b d2 = e.a.a.a.y0.j.w.b.d(a);
                    e.x.c.i.d(d2, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                    hashMap.put(d, d2);
                }
            }
            return hashMap;
        }
    }

    public static final class c extends k implements e.x.b.a<List<? extends e.a.a.a.y0.f.b>> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ i f8414h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i iVar) {
            super(0);
            this.f8414h = iVar;
        }

        public Object e() {
            Collection<t> q2 = this.f8414h.r.q();
            ArrayList arrayList = new ArrayList(b.q.a.a.C(q2, 10));
            for (t e2 : q2) {
                arrayList.add(e2.e());
            }
            return arrayList;
        }
    }

    static {
        Class<i> cls = i.class;
        s = new l[]{v.c(new q(v.a(cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), v.c(new q(v.a(cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h hVar, t tVar) {
        super(hVar.c.f8356o, tVar.e());
        e.a.a.a.y0.b.a1.h hVar2;
        e.x.c.i.e(hVar, "outerContext");
        e.x.c.i.e(tVar, "jPackage");
        this.r = tVar;
        h y = b.q.a.a.y(hVar, this, (x) null, 0, 6);
        this.f8407m = y;
        this.f8408n = y.c.a.a(new a(this));
        this.f8409o = new c(y, tVar, this);
        this.f8410p = y.c.a.g(new c(this), o.f7934h);
        if (y.c.f8358q.f8325b) {
            Objects.requireNonNull(e.a.a.a.y0.b.a1.h.f7785e);
            hVar2 = h.a.a;
        } else {
            hVar2 = b.q.a.a.H2(y, tVar);
        }
        this.f8411q = hVar2;
        y.c.a.a(new b(this));
    }

    public e.a.a.a.y0.b.a1.h k() {
        return this.f8411q;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Lazy Java package fragment: ");
        y.append(this.f8173l);
        return y.toString();
    }

    public m0 w() {
        return new m(this);
    }

    public final Map<String, e.a.a.a.y0.d.b.l> w0() {
        return (Map) b.q.a.a.j1(this.f8408n, s[0]);
    }

    public e.a.a.a.y0.j.y.i z() {
        return this.f8409o;
    }
}
