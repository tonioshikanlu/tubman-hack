package g.a;

import b.e.a.a.a;
import e.a.a.a.y0.m.o1.c;
import e.r;
import e.x.b.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class w0 extends a1<y0> {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10035m = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_invoked");
    private volatile int _invoked = 0;

    /* renamed from: l  reason: collision with root package name */
    public final l<Throwable, r> f10036l;

    public w0(y0 y0Var, l<? super Throwable, r> lVar) {
        super(y0Var);
        this.f10036l = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return r.a;
    }

    public void n(Throwable th) {
        if (f10035m.compareAndSet(this, 0, 1)) {
            this.f10036l.invoke(th);
        }
    }

    public String toString() {
        StringBuilder y = a.y("InvokeOnCancelling[");
        y.append(w0.class.getSimpleName());
        y.append('@');
        y.append(c.F(this));
        y.append(']');
        return y.toString();
    }
}
