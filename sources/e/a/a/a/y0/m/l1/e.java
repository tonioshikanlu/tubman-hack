package e.a.a.a.y0.m.l1;

import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.l1.d;
import e.a.a.a.y0.m.v0;

public class e implements d {
    public final r c;

    public static class a extends q {
        public final /* synthetic */ d.a a;

        public a(d.a aVar) {
            this.a = aVar;
        }

        public static /* synthetic */ void a(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "constructor1";
            } else {
                objArr[0] = "constructor2";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl$1";
            objArr[2] = "assertEqualTypeConstructors";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean b(v0 v0Var, v0 v0Var2) {
            if (v0Var == null) {
                a(0);
                throw null;
            } else if (v0Var2 != null) {
                return v0Var.equals(v0Var2) || this.a.a(v0Var, v0Var2);
            } else {
                a(1);
                throw null;
            }
        }
    }

    public e(r rVar) {
        this.c = rVar;
    }

    public static /* synthetic */ void e(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "procedure";
        } else if (i2 == 2) {
            objArr[0] = "subtype";
        } else if (i2 == 3) {
            objArr[0] = "supertype";
        } else if (i2 == 4) {
            objArr[0] = "a";
        } else if (i2 != 5) {
            objArr[0] = "equalityAxioms";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl";
        if (i2 == 1) {
            objArr[2] = "<init>";
        } else if (i2 == 2 || i2 == 3) {
            objArr[2] = "isSubtypeOf";
        } else if (i2 == 4 || i2 == 5) {
            objArr[2] = "equalTypes";
        } else {
            objArr[2] = "withAxioms";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static d f(d.a aVar) {
        if (aVar != null) {
            return new e(new r(new a(aVar)));
        }
        e(0);
        throw null;
    }

    public boolean b(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            e(4);
            throw null;
        } else if (d0Var2 != null) {
            return this.c.c(d0Var, d0Var2);
        } else {
            e(5);
            throw null;
        }
    }

    public boolean d(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            e(2);
            throw null;
        } else if (d0Var2 != null) {
            return this.c.i(d0Var, d0Var2);
        } else {
            e(3);
            throw null;
        }
    }
}
