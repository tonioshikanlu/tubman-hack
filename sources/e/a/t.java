package e.a;

import e.x.b.l;
import e.x.c.h;
import e.x.c.i;

public final /* synthetic */ class t extends h implements l<Class<? extends Object>, Class<?>> {

    /* renamed from: q  reason: collision with root package name */
    public static final t f7878q = new t();

    public t() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    public Object invoke(Object obj) {
        Class cls = (Class) obj;
        i.e(cls, "p1");
        return cls.getComponentType();
    }
}
