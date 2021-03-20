package e.a.a.a.y0.m;

import e.a.a.a.y0.m.l1.f;

public class a1 extends z0 {
    public final j1 a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f9646b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a1(d0 d0Var) {
        this(j1.INVARIANT, d0Var);
        if (d0Var != null) {
        } else {
            e(2);
            throw null;
        }
    }

    public a1(j1 j1Var, d0 d0Var) {
        if (j1Var == null) {
            e(0);
            throw null;
        } else if (d0Var != null) {
            this.a = j1Var;
            this.f9646b = d0Var;
        } else {
            e(1);
            throw null;
        }
    }

    public static /* synthetic */ void e(int i2) {
        String str = (i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 3 || i2 == 4) ? 2 : 3)];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "type";
        } else if (i2 == 3 || i2 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else if (i2 != 5) {
            objArr[0] = "projection";
        } else {
            objArr[0] = "kotlinTypeRefiner";
        }
        if (i2 == 3) {
            objArr[1] = "getProjectionKind";
        } else if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (!(i2 == 3 || i2 == 4)) {
            if (i2 != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        throw ((i2 == 3 || i2 == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public y0 a(f fVar) {
        return new a1(this.a, fVar.g(this.f9646b));
    }

    public j1 b() {
        j1 j1Var = this.a;
        if (j1Var != null) {
            return j1Var;
        }
        e(3);
        throw null;
    }

    public boolean c() {
        return false;
    }

    public d0 d() {
        d0 d0Var = this.f9646b;
        if (d0Var != null) {
            return d0Var;
        }
        e(4);
        throw null;
    }
}
