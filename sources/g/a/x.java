package g.a;

import e.a.a.a.y0.m.o1.c;
import e.v.b;
import e.v.d;
import e.v.e;
import e.v.f;
import e.v.h;
import e.x.c.i;
import g.a.a.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class x extends e.v.a implements e {

    /* renamed from: h  reason: collision with root package name */
    public static final a f10037h = new a((DefaultConstructorMarker) null);

    public static final class a extends b<e, x> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(DefaultConstructorMarker defaultConstructorMarker) {
            super(e.a.a, w.f10034h);
            int i2 = e.d;
        }
    }

    public x() {
        super(e.a.a);
    }

    public void e(d<?> dVar) {
        h<?> i2 = ((f) dVar).i();
        if (i2 != null) {
            j0 j0Var = (j0) i2._parentHandle;
            if (j0Var != null) {
                j0Var.e();
            }
            i2._parentHandle = j1.f9957h;
        }
    }

    public <E extends f.a> E get(f.b<E> bVar) {
        i.e(bVar, "key");
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            f.b<?> key = getKey();
            i.e(key, "key");
            if (!(key == bVar2 || bVar2.a == key)) {
                return null;
            }
            i.e(this, "element");
            E e2 = (f.a) bVar2.f7944b.invoke(this);
            if (!(e2 instanceof f.a)) {
                return null;
            }
            return e2;
        } else if (e.a.a == bVar) {
            return this;
        } else {
            return null;
        }
    }

    public abstract void m0(e.v.f fVar, Runnable runnable);

    public e.v.f minusKey(f.b<?> bVar) {
        h hVar = h.f7949h;
        i.e(bVar, "key");
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            f.b<?> key = getKey();
            i.e(key, "key");
            if (key == bVar2 || bVar2.a == key) {
                i.e(this, "element");
                if (((f.a) bVar2.f7944b.invoke(this)) != null) {
                    return hVar;
                }
            }
        } else if (e.a.a == bVar) {
            return hVar;
        }
        return this;
    }

    public boolean n0(e.v.f fVar) {
        return true;
    }

    public final <T> d<T> q(d<? super T> dVar) {
        return new g.a.a.f(this, dVar);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + c.F(this);
    }
}
