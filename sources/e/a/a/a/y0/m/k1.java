package e.a.a.a.y0.m;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.j.y.i;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class k1 extends d0 {
    public k1() {
        super((DefaultConstructorMarker) null);
    }

    public List<y0> V0() {
        return a1().V0();
    }

    public v0 W0() {
        return a1().W0();
    }

    public boolean X0() {
        return a1().X0();
    }

    public final i1 Z0() {
        d0 a1 = a1();
        while (a1 instanceof k1) {
            a1 = ((k1) a1).a1();
        }
        Objects.requireNonNull(a1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (i1) a1;
    }

    public abstract d0 a1();

    public boolean b1() {
        return true;
    }

    public h k() {
        return a1().k();
    }

    public String toString() {
        return b1() ? a1().toString() : "<Not computed yet>";
    }

    public i z() {
        return a1().z();
    }
}
