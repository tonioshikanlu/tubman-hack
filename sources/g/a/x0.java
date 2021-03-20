package g.a;

import b.e.a.a.a;
import e.a.a.a.y0.m.o1.c;
import e.r;
import e.x.b.l;

public final class x0 extends c1<y0> {

    /* renamed from: l  reason: collision with root package name */
    public final l<Throwable, r> f10038l;

    public x0(y0 y0Var, l<? super Throwable, r> lVar) {
        super(y0Var);
        this.f10038l = lVar;
    }

    public Object invoke(Object obj) {
        this.f10038l.invoke((Throwable) obj);
        return r.a;
    }

    public void n(Throwable th) {
        this.f10038l.invoke(th);
    }

    public String toString() {
        StringBuilder y = a.y("InvokeOnCompletion[");
        y.append(x0.class.getSimpleName());
        y.append('@');
        y.append(c.F(this));
        y.append(']');
        return y.toString();
    }
}
