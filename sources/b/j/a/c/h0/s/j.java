package b.j.a.c.h0.s;

import b.j.a.a.i0;
import b.j.a.b.o;
import b.j.a.c.i;
import b.j.a.c.n;
import b.j.a.c.t;

public final class j {
    public final i a;

    /* renamed from: b  reason: collision with root package name */
    public final o f2062b;
    public final i0<?> c;
    public final n<Object> d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2063e;

    public j(i iVar, o oVar, i0<?> i0Var, n<?> nVar, boolean z) {
        this.a = iVar;
        this.f2062b = oVar;
        this.c = i0Var;
        this.d = nVar;
        this.f2063e = z;
    }

    public static j a(i iVar, t tVar, i0<?> i0Var, boolean z) {
        b.j.a.b.s.i iVar2 = null;
        String str = tVar == null ? null : tVar.f2305h;
        if (str != null) {
            iVar2 = new b.j.a.b.s.i(str);
        }
        return new j(iVar, iVar2, i0Var, (n<?>) null, z);
    }
}
