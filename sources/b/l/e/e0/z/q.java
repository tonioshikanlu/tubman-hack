package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.c0;
import b.l.e.f0.a;
import b.l.e.k;

public class q implements c0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Class f5508h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b0 f5509i;

    public q(Class cls, b0 b0Var) {
        this.f5508h = cls;
        this.f5509i = b0Var;
    }

    public <T> b0<T> a(k kVar, a<T> aVar) {
        if (aVar.a == this.f5508h) {
            return this.f5509i;
        }
        return null;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Factory[type=");
        b.e.a.a.a.I(this.f5508h, y, ",adapter=");
        y.append(this.f5509i);
        y.append("]");
        return y.toString();
    }
}
