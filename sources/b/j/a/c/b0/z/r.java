package b.j.a.c.b0.z;

import b.j.a.a.i0;
import b.j.a.a.l0;
import b.j.a.c.b0.u;
import b.j.a.c.g;
import b.j.a.c.i;
import b.j.a.c.j;
import b.j.a.c.t;
import java.io.Serializable;
import java.util.Objects;

public class r implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public final i f1842h;

    /* renamed from: i  reason: collision with root package name */
    public final t f1843i;

    /* renamed from: j  reason: collision with root package name */
    public final i0<?> f1844j;

    /* renamed from: k  reason: collision with root package name */
    public final l0 f1845k;

    /* renamed from: l  reason: collision with root package name */
    public final j<Object> f1846l;

    /* renamed from: m  reason: collision with root package name */
    public final u f1847m;

    public r(i iVar, t tVar, i0<?> i0Var, j<?> jVar, u uVar, l0 l0Var) {
        this.f1842h = iVar;
        this.f1843i = tVar;
        this.f1844j = i0Var;
        this.f1845k = l0Var;
        this.f1846l = jVar;
        this.f1847m = uVar;
    }

    public static r a(i iVar, t tVar, i0<?> i0Var, j<?> jVar, u uVar, l0 l0Var) {
        return new r(iVar, tVar, i0Var, jVar, uVar, l0Var);
    }

    public boolean b() {
        Objects.requireNonNull(this.f1844j);
        return false;
    }

    public Object c(b.j.a.b.i iVar, g gVar) {
        return this.f1846l.d(iVar, gVar);
    }
}
