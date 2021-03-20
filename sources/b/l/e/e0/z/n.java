package b.l.e.e0.z;

import b.l.e.b0;
import b.l.e.e0.z.j;
import b.l.e.g0.a;
import b.l.e.g0.c;
import b.l.e.k;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class n<T> extends b0<T> {
    public final k a;

    /* renamed from: b  reason: collision with root package name */
    public final b0<T> f5491b;
    public final Type c;

    public n(k kVar, b0<T> b0Var, Type type) {
        this.a = kVar;
        this.f5491b = b0Var;
        this.c = type;
    }

    public T a(a aVar) {
        return this.f5491b.a(aVar);
    }

    public void b(c cVar, T t) {
        b0<T> b0Var = this.f5491b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            b0Var = this.a.e(new b.l.e.f0.a(type));
            if (b0Var instanceof j.a) {
                b0<T> b0Var2 = this.f5491b;
                if (!(b0Var2 instanceof j.a)) {
                    b0Var = b0Var2;
                }
            }
        }
        b0Var.b(cVar, t);
    }
}
