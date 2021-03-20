package g.a;

import b.q.a.a;
import e.a.a.a.y0.m.o1.c;
import e.h;
import e.r;
import e.v.d;
import e.v.f;
import e.x.b.l;
import e.x.b.p;
import e.x.c.i;
import e.x.c.y;

public abstract class b<T> extends d1 implements y0, d<T>, z {

    /* renamed from: i  reason: collision with root package name */
    public final f f9924i;

    /* renamed from: j  reason: collision with root package name */
    public final f f9925j;

    public b(f fVar, boolean z) {
        super(z);
        this.f9925j = fVar;
        this.f9924i = fVar.plus(this);
    }

    public final void B(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            Throwable th = rVar.a;
            rVar.a();
        }
    }

    public final void C() {
        L();
    }

    public void J(Object obj) {
        f(obj);
    }

    public final void K() {
        t((y0) this.f9925j.get(y0.f10039g));
    }

    public void L() {
    }

    public final <R> void M(a0 a0Var, R r, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        f fVar;
        Object b2;
        K();
        int ordinal = a0Var.ordinal();
        if (ordinal == 0) {
            c.i0(pVar, r, this, (l) null, 4);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                i.e(pVar, "$this$startCoroutine");
                i.e(this, "completion");
                a.A1(a.T(pVar, r, this)).c(r.a);
            } else if (ordinal == 3) {
                i.e(this, "completion");
                try {
                    fVar = this.f9924i;
                    b2 = g.a.a.a.b(fVar, (Object) null);
                    if (pVar != null) {
                        y.b(pVar, 2);
                        obj = pVar.invoke(r, this);
                        g.a.a.a.a(fVar, b2);
                        if (obj == e.v.i.a.COROUTINE_SUSPENDED) {
                            return;
                        }
                        c(obj);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                } catch (Throwable th) {
                    obj = a.Z(th);
                }
            } else {
                throw new h();
            }
        }
    }

    public f a() {
        return this.f9924i;
    }

    public boolean b() {
        return super.b();
    }

    public final void c(Object obj) {
        Object v = v(c.s0(obj, (l<? super Throwable, r>) null));
        if (v != e1.f9944b) {
            J(v);
        }
    }

    public final f getContext() {
        return this.f9924i;
    }

    public String i() {
        return getClass().getSimpleName() + " was cancelled";
    }

    public final void s(Throwable th) {
        c.H(this.f9924i, th);
    }

    public String x() {
        boolean z = v.a;
        return super.x();
    }
}
