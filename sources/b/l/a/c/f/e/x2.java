package b.l.a.c.f.e;

import java.security.GeneralSecurityException;
import java.util.Set;

public final class x2 implements z2 {
    public final /* synthetic */ v2 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i2 f3395b;

    public x2(v2 v2Var, i2 i2Var) {
        this.a = v2Var;
        this.f3395b = i2Var;
    }

    public final d2<?> b() {
        v2 v2Var = this.a;
        return new u2(v2Var, this.f3395b, v2Var.c);
    }

    public final Class<?> c() {
        return this.a.getClass();
    }

    public final Set<Class<?>> d() {
        return this.a.f();
    }

    public final Class<?> e() {
        return this.f3395b.getClass();
    }

    public final <Q> d2<Q> f(Class<Q> cls) {
        try {
            return new u2(this.a, this.f3395b, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }
}
