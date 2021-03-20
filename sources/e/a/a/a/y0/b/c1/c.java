package e.a.a.a.y0.b.c1;

import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.p0;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.l.m;
import e.a.a.a.y0.m.j1;
import java.util.Objects;

public abstract class c extends g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(m mVar, k kVar, d dVar, j1 j1Var, boolean z, int i2, m0 m0Var, p0 p0Var) {
        super(mVar, kVar, h.a.a, dVar, j1Var, z, i2, m0Var, p0Var);
        if (mVar == null) {
            c0(0);
            throw null;
        } else if (kVar == null) {
            c0(1);
            throw null;
        } else if (dVar == null) {
            c0(2);
            throw null;
        } else if (p0Var != null) {
            Objects.requireNonNull(h.f7785e);
        } else {
            c0(5);
            throw null;
        }
    }

    public static /* synthetic */ void c0(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i2 == 2) {
            objArr[0] = "name";
        } else if (i2 == 3) {
            objArr[0] = "variance";
        } else if (i2 == 4) {
            objArr[0] = "source";
        } else if (i2 != 5) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "supertypeLoopChecker";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = this.f8197m ? "reified " : str;
        if (u() != j1.INVARIANT) {
            str = u() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
