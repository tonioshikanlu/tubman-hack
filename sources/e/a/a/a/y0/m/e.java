package e.a.a.a.y0.m;

import b.e.a.a.a;
import e.a.a.a.y0.m.l1.b;
import e.a.a.a.y0.m.n1.g;
import e.a.a.a.y0.m.n1.h;
import e.x.b.q;
import e.x.c.i;
import e.x.c.k;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public final class e extends k implements q<h, h, Boolean, Boolean> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f9656h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(3);
        this.f9656h = gVar;
    }

    public final boolean a(h hVar, h hVar2, boolean z) {
        boolean z2;
        i.e(hVar, "integerLiteralType");
        i.e(hVar2, "type");
        b bVar = (b) this.f9656h;
        Objects.requireNonNull(bVar);
        i.e(hVar, "$this$possibleIntegerTypes");
        i.e(hVar, "$this$possibleIntegerTypes");
        e.a.a.a.y0.m.n1.k d = bVar.d(hVar);
        if (d instanceof e.a.a.a.y0.j.t.q) {
            Set<d0> set = ((e.a.a.a.y0.j.t.q) d).c;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (g gVar : set) {
                    if (i.a(this.f9656h.o(gVar), ((b) this.f9656h).d(hVar2)) || (z && f.f(f.a, this.f9656h, hVar2, gVar, false, 8))) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException(a.t(hVar, a.D("ClassicTypeSystemContext couldn't handle: ", hVar, ", ")).toString());
    }

    public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(a((h) obj, (h) obj2, ((Boolean) obj3).booleanValue()));
    }
}
