package e.a.a.a.y0.b.d1.b;

import e.a.a.a.y0.d.a.d0.m;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.d;
import e.x.c.i;

public final class v extends d implements m {

    /* renamed from: b  reason: collision with root package name */
    public final Enum<?> f8306b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(d dVar, Enum<?> enumR) {
        super(dVar);
        i.e(enumR, "value");
        this.f8306b = enumR;
    }

    public d a() {
        return d.l(this.f8306b.name());
    }

    public a d() {
        Class<?> cls = this.f8306b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
            i.d(cls, "clazz.enclosingClass");
        }
        return b.b(cls);
    }
}
