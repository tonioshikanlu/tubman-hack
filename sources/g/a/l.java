package g.a;

import b.e.a.a.a;
import e.r;
import java.util.Objects;
import java.util.concurrent.CancellationException;

public final class l extends a1<d1> implements k {

    /* renamed from: l  reason: collision with root package name */
    public final m f9959l;

    public l(d1 d1Var, m mVar) {
        super(d1Var);
        this.f9959l = mVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return r.a;
    }

    public boolean l(Throwable th) {
        d1 d1Var = (d1) this.f9930k;
        Objects.requireNonNull(d1Var);
        if (th instanceof CancellationException) {
            return true;
        }
        return d1Var.g(th) && d1Var.m();
    }

    public void n(Throwable th) {
        this.f9959l.Y((l1) this.f9930k);
    }

    public String toString() {
        StringBuilder y = a.y("ChildHandle[");
        y.append(this.f9959l);
        y.append(']');
        return y.toString();
    }
}
