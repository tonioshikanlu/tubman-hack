package b.j.a.c.h0.t;

import b.j.a.a.k;
import b.j.a.b.f;
import b.j.a.c.d;
import b.j.a.c.h0.i;
import b.j.a.c.n;
import b.j.a.c.y;

@b.j.a.c.z.a
public final class e extends r0<Object> implements i {

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2104j;

    public static final class a extends r0<Object> implements i {

        /* renamed from: j  reason: collision with root package name */
        public final boolean f2105j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class, false);
            this.f2105j = z;
        }

        public n<?> a(y yVar, d dVar) {
            k.d l2 = l(yVar, dVar, Boolean.class);
            return (l2 == null || l2.f1327i.d()) ? this : new e(this.f2105j);
        }

        public void f(Object obj, f fVar, y yVar) {
            fVar.x0(Boolean.FALSE.equals(obj) ^ true ? 1 : 0);
        }

        public final void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
            fVar.o0(Boolean.TRUE.equals(obj));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, false);
        this.f2104j = z;
    }

    public n<?> a(y yVar, d dVar) {
        k.d l2 = l(yVar, dVar, Boolean.class);
        return (l2 == null || !l2.f1327i.d()) ? this : new a(this.f2104j);
    }

    public void f(Object obj, f fVar, y yVar) {
        fVar.o0(Boolean.TRUE.equals(obj));
    }

    public final void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        fVar.o0(Boolean.TRUE.equals(obj));
    }
}
