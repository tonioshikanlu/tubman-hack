package e.a.a.a.y0.j.y.o;

import e.a.a.a.y0.m.d0;

public abstract class a implements d {
    public final d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9470b;

    public a(d0 d0Var, d dVar) {
        if (d0Var != null) {
            this.a = d0Var;
            this.f9470b = dVar == null ? this : dVar;
            return;
        }
        b(0);
        throw null;
    }

    public static /* synthetic */ void b(int i2) {
        String str = (i2 == 1 || i2 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 2) ? 2 : 3)];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i2 == 1) {
            objArr[1] = "getType";
        } else if (i2 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i2 == 1 || i2 == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public d0 d() {
        d0 d0Var = this.a;
        if (d0Var != null) {
            return d0Var;
        }
        b(1);
        throw null;
    }
}
