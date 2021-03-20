package e.a.a.a.y0.m;

import com.segment.analytics.integrations.BasePayload;
import e.a.a.a.y0.m.n1.h;
import e.a.a.a.y0.m.n1.j;
import e.a.a.a.y0.m.n1.k;
import e.a.a.a.y0.m.n1.m;
import e.a.a.a.y0.o.m;
import e.x.c.i;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class g implements m {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9672b;
    public ArrayDeque<h> c;
    public Set<h> d;

    public static abstract class a {

        /* renamed from: e.a.a.a.y0.m.g$a$a  reason: collision with other inner class name */
        public static abstract class C0223a extends a {
            public C0223a() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            public b() {
                super((DefaultConstructorMarker) null);
            }

            public h a(g gVar, e.a.a.a.y0.m.n1.g gVar2) {
                i.e(gVar, BasePayload.CONTEXT_KEY);
                i.e(gVar2, "type");
                return gVar.n(gVar2);
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            public c() {
                super((DefaultConstructorMarker) null);
            }

            public h a(g gVar, e.a.a.a.y0.m.n1.g gVar2) {
                i.e(gVar, BasePayload.CONTEXT_KEY);
                i.e(gVar2, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends a {
            public static final d a = new d();

            public d() {
                super((DefaultConstructorMarker) null);
            }

            public h a(g gVar, e.a.a.a.y0.m.n1.g gVar2) {
                i.e(gVar, BasePayload.CONTEXT_KEY);
                i.e(gVar2, "type");
                return gVar.e(gVar2);
            }
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public abstract h a(g gVar, e.a.a.a.y0.m.n1.g gVar2);
    }

    public Boolean C(e.a.a.a.y0.m.n1.g gVar, e.a.a.a.y0.m.n1.g gVar2) {
        i.e(gVar, "subType");
        i.e(gVar2, "superType");
        return null;
    }

    public abstract boolean D(k kVar, k kVar2);

    public final void E() {
        ArrayDeque<h> arrayDeque = this.c;
        i.c(arrayDeque);
        arrayDeque.clear();
        Set<h> set = this.d;
        i.c(set);
        set.clear();
        this.f9672b = false;
    }

    public abstract List<h> F(h hVar, k kVar);

    public abstract j G(e.a.a.a.y0.m.n1.i iVar, int i2);

    public abstract j H(h hVar, int i2);

    public abstract boolean I(e.a.a.a.y0.m.n1.g gVar);

    public final void J() {
        this.f9672b = true;
        if (this.c == null) {
            this.c = new ArrayDeque<>(4);
        }
        if (this.d == null) {
            this.d = m.b.a();
        }
    }

    public abstract boolean K(h hVar);

    public abstract boolean L(e.a.a.a.y0.m.n1.g gVar);

    public abstract boolean M(e.a.a.a.y0.m.n1.g gVar);

    public abstract boolean N();

    public abstract boolean O(h hVar);

    public abstract e.a.a.a.y0.m.n1.g P(e.a.a.a.y0.m.n1.g gVar);

    public abstract e.a.a.a.y0.m.n1.g Q(e.a.a.a.y0.m.n1.g gVar);

    public abstract a R(h hVar);

    public abstract h e(e.a.a.a.y0.m.n1.g gVar);

    public abstract h n(e.a.a.a.y0.m.n1.g gVar);

    public abstract k o(e.a.a.a.y0.m.n1.g gVar);
}
