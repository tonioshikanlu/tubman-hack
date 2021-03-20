package e.a.a.a.y0.j;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.b;
import e.a.a.a.y0.b.c1.i;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.j;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.y0;
import e.a.a.a.y0.b.z0;
import e.a.a.a.y0.f.d;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class f extends i {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(e eVar, m0 m0Var) {
        super(eVar, (j) null, h.a.a, true, b.a.DECLARATION, m0Var);
        z0 z0Var;
        if (eVar == null) {
            c0(0);
            throw null;
        } else if (m0Var != null) {
            Objects.requireNonNull(h.f7785e);
            List emptyList = Collections.emptyList();
            d dVar = g.a;
            e.a.a.a.y0.b.f i2 = eVar.i();
            if (i2 == e.a.a.a.y0.b.f.ENUM_CLASS || i2.d() || g.v(eVar)) {
                z0Var = y0.a;
                if (z0Var == null) {
                    g.a(47);
                    throw null;
                }
            } else if (g.n(eVar)) {
                z0Var = y0.f7855k;
                if (z0Var == null) {
                    g.a(48);
                    throw null;
                }
            } else {
                z0Var = y0.f7850e;
                if (z0Var == null) {
                    g.a(49);
                    throw null;
                }
            }
            d1(emptyList, z0Var);
        } else {
            c0(1);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        Object[] objArr = new Object[3];
        if (i2 != 1) {
            objArr[0] = "containingClass";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
