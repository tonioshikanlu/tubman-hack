package e.a.a.a.y0.a.o;

import b.q.a.a;
import e.a.a.a.y0.b.s;
import e.a.a.a.y0.j.y.e;
import e.a.a.a.y0.l.m;
import e.t.o;
import e.x.c.i;
import java.util.List;
import java.util.Objects;

public final class c extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(m mVar, b bVar) {
        super(mVar, bVar);
        i.e(mVar, "storageManager");
        i.e(bVar, "containingClass");
    }

    public List<s> h() {
        boolean z;
        b bVar;
        e.a.a.a.y0.b.e eVar = this.c;
        Objects.requireNonNull(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int ordinal = ((b) eVar).f7698q.ordinal();
        if (ordinal != 0) {
            z = true;
            if (ordinal != 1) {
                return o.f7934h;
            }
            bVar = (b) this.c;
        } else {
            bVar = (b) this.c;
            z = false;
        }
        return a.l2(d.g1(bVar, z));
    }
}
