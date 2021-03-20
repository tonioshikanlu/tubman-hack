package e.a.a.a.y0.d.b;

import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.b.x;
import e.a.a.a.y0.d.b.l;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.t.f;
import e.a.a.a.y0.j.t.g;
import e.a.a.a.y0.j.t.h;
import e.a.a.a.y0.j.t.k;
import e.a.a.a.y0.j.t.l;
import e.a.a.a.y0.j.t.t;
import e.a.a.a.y0.k.b.e;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.d0;
import e.x.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class c extends a<e.a.a.a.y0.b.a1.c, g<?>> {
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public final w f8634e;
    public final x f;

    public static final class a implements l.a {
        public final HashMap<d, g<?>> a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f8635b;
        public final /* synthetic */ e.a.a.a.y0.b.e c;
        public final /* synthetic */ List d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ m0 f8636e;

        /* renamed from: e.a.a.a.y0.d.b.c$a$a  reason: collision with other inner class name */
        public static final class C0182a implements l.a {
            public final /* synthetic */ l.a a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a f8637b;
            public final /* synthetic */ l.a c;
            public final /* synthetic */ d d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ ArrayList f8638e;

            public C0182a(a aVar, l.a aVar2, d dVar, ArrayList arrayList) {
                this.f8637b = aVar;
                this.c = aVar2;
                this.d = dVar;
                this.f8638e = arrayList;
                this.a = aVar2;
            }

            public void a() {
                this.c.a();
                this.f8637b.a.put(this.d, new e.a.a.a.y0.j.t.a((e.a.a.a.y0.b.a1.c) e.t.g.O(this.f8638e)));
            }

            public void b(d dVar, f fVar) {
                i.e(dVar, "name");
                i.e(fVar, "value");
                this.a.b(dVar, fVar);
            }

            public l.a c(d dVar, e.a.a.a.y0.f.a aVar) {
                i.e(dVar, "name");
                i.e(aVar, "classId");
                return this.a.c(dVar, aVar);
            }

            public void d(d dVar, Object obj) {
                this.a.d(dVar, obj);
            }

            public void e(d dVar, e.a.a.a.y0.f.a aVar, d dVar2) {
                i.e(dVar, "name");
                i.e(aVar, "enumClassId");
                i.e(dVar2, "enumEntryName");
                this.a.e(dVar, aVar, dVar2);
            }

            public l.b f(d dVar) {
                i.e(dVar, "name");
                return this.a.f(dVar);
            }
        }

        public static final class b implements l.b {
            public final ArrayList<g<?>> a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a f8639b;
            public final /* synthetic */ d c;

            public b(a aVar, d dVar) {
                this.f8639b = aVar;
                this.c = dVar;
            }

            public void a() {
                w0 u0 = b.q.a.a.u0(this.c, this.f8639b.c);
                if (u0 != null) {
                    HashMap<d, g<?>> hashMap = this.f8639b.a;
                    d dVar = this.c;
                    List<T> r = e.a.a.a.y0.m.o1.c.r(this.a);
                    d0 d = u0.d();
                    i.d(d, "parameter.type");
                    i.e(r, "value");
                    i.e(d, "type");
                    hashMap.put(dVar, new e.a.a.a.y0.j.t.b(r, new h(d)));
                }
            }

            public void b(f fVar) {
                i.e(fVar, "value");
                this.a.add(new t(fVar));
            }

            public void c(Object obj) {
                this.a.add(this.f8639b.g(this.c, obj));
            }

            public void d(e.a.a.a.y0.f.a aVar, d dVar) {
                i.e(aVar, "enumClassId");
                i.e(dVar, "enumEntryName");
                this.a.add(new k(aVar, dVar));
            }
        }

        public a(c cVar, e.a.a.a.y0.b.e eVar, List list, m0 m0Var) {
            this.f8635b = cVar;
            this.c = eVar;
            this.d = list;
            this.f8636e = m0Var;
        }

        public void a() {
            this.d.add(new e.a.a.a.y0.b.a1.d(this.c.s(), this.a, this.f8636e));
        }

        public void b(d dVar, f fVar) {
            i.e(dVar, "name");
            i.e(fVar, "value");
            this.a.put(dVar, new t(fVar));
        }

        public l.a c(d dVar, e.a.a.a.y0.f.a aVar) {
            i.e(dVar, "name");
            i.e(aVar, "classId");
            ArrayList arrayList = new ArrayList();
            c cVar = this.f8635b;
            m0 m0Var = m0.a;
            i.d(m0Var, "SourceElement.NO_SOURCE");
            l.a s = cVar.s(aVar, m0Var, arrayList);
            i.c(s);
            return new C0182a(this, s, dVar, arrayList);
        }

        public void d(d dVar, Object obj) {
            if (dVar != null) {
                this.a.put(dVar, g(dVar, obj));
            }
        }

        public void e(d dVar, e.a.a.a.y0.f.a aVar, d dVar2) {
            i.e(dVar, "name");
            i.e(aVar, "enumClassId");
            i.e(dVar2, "enumEntryName");
            this.a.put(dVar, new k(aVar, dVar2));
        }

        public l.b f(d dVar) {
            i.e(dVar, "name");
            return new b(this, dVar);
        }

        public final g<?> g(d dVar, Object obj) {
            g<?> b2 = e.a.a.a.y0.j.t.i.b(obj);
            if (b2 != null) {
                return b2;
            }
            String str = "Unsupported annotation argument: " + dVar;
            i.e(str, "message");
            return new l.a(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(w wVar, x xVar, m mVar, k kVar) {
        super(mVar, kVar);
        i.e(wVar, "module");
        i.e(xVar, "notFoundClasses");
        i.e(mVar, "storageManager");
        i.e(kVar, "kotlinClassFinder");
        this.f8634e = wVar;
        this.f = xVar;
        this.d = new e(wVar, xVar);
    }

    public l.a s(e.a.a.a.y0.f.a aVar, m0 m0Var, List<e.a.a.a.y0.b.a1.c> list) {
        i.e(aVar, "annotationClassId");
        i.e(m0Var, "source");
        i.e(list, "result");
        return new a(this, b.q.a.a.o0(this.f8634e, aVar, this.f), list, m0Var);
    }
}
