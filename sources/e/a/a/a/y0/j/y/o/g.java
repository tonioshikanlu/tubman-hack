package e.a.a.a.y0.j.y.o;

import b.e.a.a.a;
import e.a.a.a.y0.m.d0;

public class g extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d0 d0Var) {
        super(d0Var, (d) null);
        if (d0Var == null) {
            b(0);
            throw null;
        } else if (d0Var != null) {
        } else {
            b(1);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i2 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        StringBuilder y = a.y("{Transient} : ");
        y.append(d());
        return y.toString();
    }
}
