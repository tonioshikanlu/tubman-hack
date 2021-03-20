package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.h;
import e.a.a.a.y0.d.a.d0.v;
import e.a.a.a.y0.f.d;
import e.x.c.i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;

public final class r extends d implements h {

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f8304b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(d dVar, Class<?> cls) {
        super(dVar);
        i.e(cls, "klass");
        this.f8304b = cls;
    }

    public v e() {
        Class<?> cls = this.f8304b;
        i.e(cls, "type");
        if (cls.isPrimitive()) {
            return new c0(cls);
        }
        if ((cls instanceof GenericArrayType) || cls.isArray()) {
            return new h(cls);
        }
        return cls instanceof WildcardType ? new g0((WildcardType) cls) : new s(cls);
    }
}
