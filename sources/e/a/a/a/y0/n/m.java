package e.a.a.a.y0.n;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.k0;
import e.x.b.l;
import e.x.c.i;
import e.x.c.k;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class m implements b {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9799b;
    public final l<g, d0> c;

    public static final class a extends m {
        public static final a d = new a();

        /* renamed from: e.a.a.a.y0.n.m$a$a  reason: collision with other inner class name */
        public static final class C0228a extends k implements l<g, d0> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0228a f9800h = new C0228a();

            public C0228a() {
                super(1);
            }

            public Object invoke(Object obj) {
                g gVar = (g) obj;
                i.e(gVar, "$receiver");
                k0 u = gVar.u(e.a.a.a.y0.a.i.BOOLEAN);
                if (u != null) {
                    i.d(u, "booleanType");
                    return u;
                }
                g.a(65);
                throw null;
            }
        }

        public a() {
            super("Boolean", C0228a.f9800h, (DefaultConstructorMarker) null);
        }
    }

    public static final class b extends m {
        public static final b d = new b();

        public static final class a extends k implements l<g, d0> {

            /* renamed from: h  reason: collision with root package name */
            public static final a f9801h = new a();

            public a() {
                super(1);
            }

            public Object invoke(Object obj) {
                g gVar = (g) obj;
                i.e(gVar, "$receiver");
                k0 n2 = gVar.n();
                i.d(n2, "intType");
                return n2;
            }
        }

        public b() {
            super("Int", a.f9801h, (DefaultConstructorMarker) null);
        }
    }

    public static final class c extends m {
        public static final c d = new c();

        public static final class a extends k implements l<g, d0> {

            /* renamed from: h  reason: collision with root package name */
            public static final a f9802h = new a();

            public a() {
                super(1);
            }

            public Object invoke(Object obj) {
                g gVar = (g) obj;
                i.e(gVar, "$receiver");
                k0 y = gVar.y();
                i.d(y, "unitType");
                return y;
            }
        }

        public c() {
            super("Unit", a.f9802h, (DefaultConstructorMarker) null);
        }
    }

    public m(String str, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9799b = str;
        this.c = lVar;
        this.a = b.e.a.a.a.m("must return ", str);
    }

    public String a(s sVar) {
        i.e(sVar, "functionDescriptor");
        return e.a.a.a.y0.m.o1.c.J(this, sVar);
    }

    public boolean b(s sVar) {
        i.e(sVar, "functionDescriptor");
        return i.a(sVar.f(), this.c.invoke(e.a.a.a.y0.j.v.b.f(sVar)));
    }

    public String getDescription() {
        return this.a;
    }
}
