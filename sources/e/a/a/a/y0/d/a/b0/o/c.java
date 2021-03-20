package e.a.a.a.y0.d.a.b0.o;

import e.a.a.a.y0.d.a.d0.v;
import e.a.a.a.y0.d.a.d0.z;
import e.x.b.l;
import e.x.c.k;

public final class c extends k implements l<v, Boolean> {

    /* renamed from: h  reason: collision with root package name */
    public static final c f8461h = new c();

    public c() {
        super(1);
    }

    public final boolean a(v vVar) {
        if (!(vVar instanceof z)) {
            vVar = null;
        }
        z zVar = (z) vVar;
        return (zVar == null || zVar.t() == null || zVar.H()) ? false : true;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((v) obj));
    }
}
