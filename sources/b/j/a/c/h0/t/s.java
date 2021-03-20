package b.j.a.c.h0.t;

import b.j.a.a.c0;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.d;
import b.j.a.c.e0.h;
import b.j.a.c.f0.f;
import b.j.a.c.h0.i;
import b.j.a.c.j0.g;
import b.j.a.c.n;
import b.j.a.c.p;
import b.j.a.c.y;

@b.j.a.c.z.a
public class s extends s0<Object> implements i {

    /* renamed from: j  reason: collision with root package name */
    public final h f2131j;

    /* renamed from: k  reason: collision with root package name */
    public final n<Object> f2132k;

    /* renamed from: l  reason: collision with root package name */
    public final d f2133l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2134m;

    public static class a extends f {
        public final f a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f2135b;

        public a(f fVar, Object obj) {
            this.a = fVar;
            this.f2135b = obj;
        }

        public f a(d dVar) {
            throw new UnsupportedOperationException();
        }

        public String b() {
            return this.a.b();
        }

        public c0.a c() {
            return this.a.c();
        }

        public b e(b.j.a.b.f fVar, b bVar) {
            bVar.a = this.f2135b;
            return this.a.e(fVar, bVar);
        }

        public b f(b.j.a.b.f fVar, b bVar) {
            return this.a.f(fVar, bVar);
        }
    }

    public s(h hVar, n<?> nVar) {
        super(hVar.f());
        this.f2131j = hVar;
        this.f2132k = nVar;
        this.f2133l = null;
        this.f2134m = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(b.j.a.c.h0.t.s r2, b.j.a.c.d r3, b.j.a.c.n<?> r4, boolean r5) {
        /*
            r1 = this;
            java.lang.Class<T> r0 = r2.f2137h
            if (r0 != 0) goto L_0x0006
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L_0x0006:
            r1.<init>(r0)
            b.j.a.c.e0.h r2 = r2.f2131j
            r1.f2131j = r2
            r1.f2132k = r4
            r1.f2133l = r3
            r1.f2134m = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.h0.t.s.<init>(b.j.a.c.h0.t.s, b.j.a.c.d, b.j.a.c.n, boolean):void");
    }

    public n<?> a(y yVar, d dVar) {
        n<Object> nVar = this.f2132k;
        if (nVar == null) {
            b.j.a.c.i f = this.f2131j.f();
            if (!yVar.J(p.USE_STATIC_TYPING) && !f.D()) {
                return this;
            }
            n<Object> w = yVar.w(f, dVar);
            Class<?> cls = f.f2152h;
            boolean z = false;
            if (!cls.isPrimitive() ? cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class : cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE) {
                z = g.u(w);
            }
            return (this.f2133l == dVar && this.f2132k == w && z == this.f2134m) ? this : new s(this, dVar, w, z);
        }
        n<?> F = yVar.F(nVar, dVar);
        boolean z2 = this.f2134m;
        return (this.f2133l == dVar && this.f2132k == F && z2 == z2) ? this : new s(this, dVar, F, z2);
    }

    public void f(Object obj, b.j.a.b.f fVar, y yVar) {
        try {
            Object k2 = this.f2131j.k(obj);
            if (k2 == null) {
                yVar.t(fVar);
                return;
            }
            n<Object> nVar = this.f2132k;
            if (nVar == null) {
                nVar = yVar.x(k2.getClass(), true, this.f2133l);
            }
            nVar.f(k2, fVar, yVar);
        } catch (Exception e2) {
            o(yVar, e2, obj, this.f2131j.d() + "()");
            throw null;
        }
    }

    public void g(Object obj, b.j.a.b.f fVar, y yVar, f fVar2) {
        try {
            Object k2 = this.f2131j.k(obj);
            if (k2 == null) {
                yVar.t(fVar);
                return;
            }
            n<Object> nVar = this.f2132k;
            if (nVar == null) {
                nVar = yVar.A(k2.getClass(), this.f2133l);
            } else if (this.f2134m) {
                b e2 = fVar2.e(fVar, fVar2.d(obj, l.VALUE_STRING));
                nVar.f(k2, fVar, yVar);
                fVar2.f(fVar, e2);
                return;
            }
            nVar.g(k2, fVar, yVar, new a(fVar2, obj));
        } catch (Exception e3) {
            o(yVar, e3, obj, this.f2131j.d() + "()");
            throw null;
        }
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("(@JsonValue serializer for method ");
        y.append(this.f2131j.h());
        y.append("#");
        y.append(this.f2131j.d());
        y.append(")");
        return y.toString();
    }
}
