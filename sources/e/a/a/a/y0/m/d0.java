package e.a.a.a.y0.m;

import com.segment.analytics.integrations.BasePayload;
import e.a.a.a.y0.b.a1.a;
import e.a.a.a.y0.m.l1.f;
import e.a.a.a.y0.m.l1.o;
import e.a.a.a.y0.m.n1.g;
import e.x.c.i;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class d0 implements a, g {

    /* renamed from: h  reason: collision with root package name */
    public int f9650h;

    public d0() {
    }

    public d0(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract List<y0> V0();

    public abstract v0 W0();

    public abstract boolean X0();

    public abstract d0 Y0(f fVar);

    public abstract i1 Z0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (X0() == d0Var.X0()) {
            i1 Z0 = Z0();
            i1 Z02 = d0Var.Z0();
            i.e(Z0, "a");
            i.e(Z02, "b");
            o oVar = o.a;
            i.e(oVar, BasePayload.CONTEXT_KEY);
            i.e(Z0, "a");
            i.e(Z02, "b");
            if (d.b(oVar, Z0, Z02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3 = this.f9650h;
        if (i3 != 0) {
            return i3;
        }
        if (b.q.a.a.I1(this)) {
            i2 = super.hashCode();
        } else {
            int hashCode = V0().hashCode();
            i2 = (X0() ? 1 : 0) + ((hashCode + (W0().hashCode() * 31)) * 31);
        }
        this.f9650h = i2;
        return i2;
    }

    public abstract e.a.a.a.y0.j.y.i z();
}
