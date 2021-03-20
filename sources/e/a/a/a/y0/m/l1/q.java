package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.v0;

public class q {
    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
            default:
                objArr[0] = "a";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i2) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean b(v0 v0Var, v0 v0Var2) {
        if (v0Var == null) {
            a(3);
            throw null;
        } else if (v0Var2 != null) {
            return v0Var.equals(v0Var2);
        } else {
            a(4);
            throw null;
        }
    }

    public boolean c(d0 d0Var, d0 d0Var2, r rVar) {
        if (d0Var == null) {
            a(0);
            throw null;
        } else if (d0Var2 != null) {
            return rVar.c(d0Var, d0Var2);
        } else {
            a(1);
            throw null;
        }
    }

    public boolean d(d0 d0Var, d0 d0Var2, r rVar) {
        if (d0Var == null) {
            a(5);
            throw null;
        } else if (d0Var2 != null) {
            return rVar.i(d0Var, d0Var2);
        } else {
            a(6);
            throw null;
        }
    }
}
