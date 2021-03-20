package e.a.a.a.y0.i;

import e.a.a.a.y0.b.w0;
import e.a.a.a.y0.i.b;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.y0;
import e.r;
import e.t.q;

public abstract class c {
    public static final c a = k.a(f.f9323h);

    /* renamed from: b  reason: collision with root package name */
    public static final c f9317b = k.a(e.f9322h);

    public static final class a extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f9318h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.j(false);
            iVar.g(q.f7936h);
            return r.a;
        }
    }

    public static final class b extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final b f9319h = new b();

        public b() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.j(false);
            iVar.g(q.f7936h);
            iVar.p(true);
            return r.a;
        }
    }

    /* renamed from: e.a.a.a.y0.i.c$c  reason: collision with other inner class name */
    public static final class C0209c extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0209c f9320h = new C0209c();

        public C0209c() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.j(false);
            return r.a;
        }
    }

    public static final class d extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f9321h = new d();

        public d() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.g(q.f7936h);
            iVar.n(b.C0208b.a);
            iVar.h(o.ONLY_NON_SYNTHESIZED);
            return r.a;
        }
    }

    public static final class e extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final e f9322h = new e();

        public e() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.a(true);
            iVar.n(b.a.a);
            iVar.g(h.x);
            return r.a;
        }
    }

    public static final class f extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final f f9323h = new f();

        public f() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.g(h.w);
            return r.a;
        }
    }

    public static final class g extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final g f9324h = new g();

        public g() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.g(h.x);
            return r.a;
        }
    }

    public static final class h extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final h f9325h = new h();

        public h() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.d(q.f9373i);
            iVar.g(h.x);
            return r.a;
        }
    }

    public static final class i extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final i f9326h = new i();

        public i() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.j(false);
            iVar.g(q.f7936h);
            iVar.n(b.C0208b.a);
            iVar.o(true);
            iVar.h(o.NONE);
            iVar.c(true);
            iVar.b(true);
            iVar.p(true);
            iVar.f(true);
            return r.a;
        }
    }

    public static final class j extends e.x.c.k implements e.x.b.l<i, r> {

        /* renamed from: h  reason: collision with root package name */
        public static final j f9327h = new j();

        public j() {
            super(1);
        }

        public Object invoke(Object obj) {
            i iVar = (i) obj;
            e.x.c.i.e(iVar, "$receiver");
            iVar.n(b.C0208b.a);
            iVar.h(o.ONLY_NON_SYNTHESIZED);
            return r.a;
        }
    }

    public static final class k {
        public static final c a(e.x.b.l<? super i, r> lVar) {
            e.x.c.i.e(lVar, "changeOptions");
            j jVar = new j();
            lVar.invoke(jVar);
            jVar.a = true;
            return new d(jVar);
        }
    }

    public interface l {

        public static final class a implements l {
            public static final a a = new a();

            public void a(w0 w0Var, int i2, int i3, StringBuilder sb) {
                e.x.c.i.e(w0Var, "parameter");
                e.x.c.i.e(sb, "builder");
            }

            public void b(int i2, StringBuilder sb) {
                e.x.c.i.e(sb, "builder");
                sb.append("(");
            }

            public void c(int i2, StringBuilder sb) {
                e.x.c.i.e(sb, "builder");
                sb.append(")");
            }

            public void d(w0 w0Var, int i2, int i3, StringBuilder sb) {
                e.x.c.i.e(w0Var, "parameter");
                e.x.c.i.e(sb, "builder");
                if (i2 != i3 - 1) {
                    sb.append(", ");
                }
            }
        }

        void a(w0 w0Var, int i2, int i3, StringBuilder sb);

        void b(int i2, StringBuilder sb);

        void c(int i2, StringBuilder sb);

        void d(w0 w0Var, int i2, int i3, StringBuilder sb);
    }

    static {
        k.a(C0209c.f9320h);
        k.a(a.f9318h);
        k.a(b.f9319h);
        k.a(d.f9321h);
        k.a(i.f9326h);
        k.a(g.f9324h);
        k.a(j.f9327h);
        k.a(h.f9325h);
    }

    public static /* synthetic */ String s(c cVar, e.a.a.a.y0.b.a1.c cVar2, e.a.a.a.y0.b.a1.e eVar, int i2, Object obj) {
        int i3 = i2 & 2;
        return cVar.r(cVar2, (e.a.a.a.y0.b.a1.e) null);
    }

    public abstract String q(e.a.a.a.y0.b.k kVar);

    public abstract String r(e.a.a.a.y0.b.a1.c cVar, e.a.a.a.y0.b.a1.e eVar);

    public abstract String t(String str, String str2, e.a.a.a.y0.a.g gVar);

    public abstract String u(e.a.a.a.y0.f.c cVar);

    public abstract String v(e.a.a.a.y0.f.d dVar, boolean z);

    public abstract String w(d0 d0Var);

    public abstract String x(y0 y0Var);
}
