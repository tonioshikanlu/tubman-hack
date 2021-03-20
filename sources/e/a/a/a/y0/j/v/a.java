package e.a.a.a.y0.j.v;

import e.a.a.a.y0.b.e;
import e.a.a.a.y0.j.g;
import e.a.a.a.y0.j.y.d;
import e.a.a.a.y0.j.y.i;
import e.a.a.a.y0.m.d0;
import e.r;
import e.x.b.l;
import e.x.b.p;
import e.x.c.k;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class a extends k implements p<i, Boolean, r> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f9420h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f9421i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(e eVar, LinkedHashSet linkedHashSet) {
        super(2);
        this.f9420h = eVar;
        this.f9421i = linkedHashSet;
    }

    public final void a(i iVar, boolean z) {
        boolean z2;
        e.x.c.i.e(iVar, "scope");
        for (e.a.a.a.y0.b.k kVar : b.q.a.a.E0(iVar, d.f9448p, (l) null, 2, (Object) null)) {
            if (kVar instanceof e) {
                e eVar = (e) kVar;
                e eVar2 = this.f9420h;
                e.a.a.a.y0.f.d dVar = g.a;
                if (eVar == null) {
                    g.a(24);
                    throw null;
                } else if (eVar2 != null) {
                    Iterator<d0> it = eVar.p().h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (g.u(it.next(), eVar2.a())) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        this.f9421i.add(kVar);
                    }
                    if (z) {
                        i v0 = eVar.v0();
                        e.x.c.i.d(v0, "descriptor.unsubstitutedInnerClassesScope");
                        a(v0, z);
                    }
                } else {
                    g.a(25);
                    throw null;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((i) obj, ((Boolean) obj2).booleanValue());
        return r.a;
    }
}
