package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import java.util.Set;

public final class w2 implements z2 {
    public final /* synthetic */ i2 a;

    public w2(i2 i2Var) {
        this.a = i2Var;
    }

    public final d2<?> b() {
        i2 i2Var = this.a;
        return new e2(i2Var, i2Var.c);
    }

    public final Class<?> c() {
        return this.a.getClass();
    }

    public final Set<Class<?>> d() {
        return this.a.f();
    }

    public final Class<?> e() {
        return null;
    }

    public final <Q> d2<Q> f(Class<Q> cls) {
        try {
            return new e2(this.a, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }
}
