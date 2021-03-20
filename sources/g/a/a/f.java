package g.a.a;

import b.e.a.a.a;
import e.a.a.a.y0.m.o1.c;
import e.r;
import e.v.j.a.d;
import e.x.b.l;
import e.x.c.i;
import g.a.g;
import g.a.h;
import g.a.h0;
import g.a.m0;
import g.a.p1;
import g.a.s;
import g.a.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class f<T> extends h0<T> implements d, e.v.d<T> {

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9901p = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: k  reason: collision with root package name */
    public Object f9902k = g.a;

    /* renamed from: l  reason: collision with root package name */
    public final d f9903l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f9904m;

    /* renamed from: n  reason: collision with root package name */
    public final x f9905n;

    /* renamed from: o  reason: collision with root package name */
    public final e.v.d<T> f9906o;

    public f(x xVar, e.v.d<? super T> dVar) {
        super(-1);
        this.f9905n = xVar;
        this.f9906o = dVar;
        this.f9903l = (d) (!(dVar instanceof d) ? null : dVar);
        Object fold = getContext().fold(0, a.f9895b);
        i.c(fold);
        this.f9904m = fold;
        this._reusableCancellableContinuation = null;
    }

    public void a(Object obj, Throwable th) {
        if (obj instanceof s) {
            ((s) obj).f9981b.invoke(th);
        }
    }

    public e.v.d<T> b() {
        return this;
    }

    public void c(Object obj) {
        e.v.f context;
        Object b2;
        e.v.f context2 = this.f9906o.getContext();
        Object s0 = c.s0(obj, (l<? super Throwable, r>) null);
        if (this.f9905n.n0(context2)) {
            this.f9902k = s0;
            this.f9954j = 0;
            this.f9905n.m0(context2, this);
            return;
        }
        p1 p1Var = p1.f9975b;
        m0 a = p1.a();
        if (a.s0()) {
            this.f9902k = s0;
            this.f9954j = 0;
            a.q0(this);
            return;
        }
        a.r0(true);
        try {
            context = getContext();
            b2 = a.b(context, this.f9904m);
            this.f9906o.c(obj);
            a.a(context, b2);
            do {
            } while (a.t0());
        } catch (Throwable th) {
            try {
                f(th, (Throwable) null);
            } catch (Throwable th2) {
                a.o0(true);
                throw th2;
            }
        }
        a.o0(true);
    }

    public Object g() {
        Object obj = this.f9902k;
        this.f9902k = g.a;
        return obj;
    }

    public e.v.f getContext() {
        return this.f9906o.getContext();
    }

    public final Throwable h(g<?> gVar) {
        q qVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            qVar = g.f9907b;
            if (obj != qVar) {
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (f9901p.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f9901p.compareAndSet(this, qVar, gVar));
        return null;
    }

    public final h<?> i() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof h)) {
            obj = null;
        }
        return (h) obj;
    }

    public final boolean j(h<?> hVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        if (obj instanceof h) {
            return obj == hVar;
        }
        return true;
    }

    public final boolean k(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            q qVar = g.f9907b;
            if (i.a(obj, qVar)) {
                if (f9901p.compareAndSet(this, qVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f9901p.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        StringBuilder y = a.y("DispatchedContinuation[");
        y.append(this.f9905n);
        y.append(", ");
        y.append(c.p0(this.f9906o));
        y.append(']');
        return y.toString();
    }
}
