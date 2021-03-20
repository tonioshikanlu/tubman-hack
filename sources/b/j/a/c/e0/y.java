package b.j.a.c.e0;

import b.e.a.a.a;
import b.j.a.a.i0;
import b.j.a.a.l0;
import b.j.a.a.n0;
import b.j.a.c.j0.g;
import b.j.a.c.t;

public class y {
    public static final y f = new y(t.f2304l, Object.class, (Class<? extends i0<?>>) null, false, (Class<? extends l0>) null);
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<? extends i0<?>> f1958b;
    public final Class<? extends l0> c;
    public final Class<?> d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1959e;

    public y(t tVar, Class<?> cls, Class<? extends i0<?>> cls2, boolean z, Class<? extends l0> cls3) {
        this.a = tVar;
        this.d = cls;
        this.f1958b = cls2;
        this.f1959e = z;
        this.c = cls3 == null ? n0.class : cls3;
    }

    public String toString() {
        StringBuilder y = a.y("ObjectIdInfo: propName=");
        y.append(this.a);
        y.append(", scope=");
        y.append(g.y(this.d));
        y.append(", generatorType=");
        y.append(g.y(this.f1958b));
        y.append(", alwaysAsId=");
        y.append(this.f1959e);
        return y.toString();
    }
}
