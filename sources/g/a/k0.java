package g.a;

import b.e.a.a.a;
import e.r;

public final class k0 extends e {

    /* renamed from: h  reason: collision with root package name */
    public final j0 f9958h;

    public k0(j0 j0Var) {
        this.f9958h = j0Var;
    }

    public void a(Throwable th) {
        this.f9958h.e();
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f9958h.e();
        return r.a;
    }

    public String toString() {
        StringBuilder y = a.y("DisposeOnCancel[");
        y.append(this.f9958h);
        y.append(']');
        return y.toString();
    }
}
