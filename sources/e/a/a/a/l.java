package e.a.a.a;

import e.a.a.a.a;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.b.h;
import e.a.a.a.y0.m.d0;
import e.x.b.a;
import e.x.c.i;
import e.x.c.k;
import java.lang.reflect.Type;

public final class l extends k implements a<Type> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d0 f7558h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a.C0125a.j f7559i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(d0 d0Var, a.C0125a.j jVar) {
        super(0);
        this.f7558h = d0Var;
        this.f7559i = jVar;
    }

    public Object e() {
        Type type;
        h d = this.f7558h.W0().d();
        if (d instanceof e) {
            Class<?> j2 = v0.j((e) d);
            if (j2 != null) {
                if (i.a(a.this.f7451k.getSuperclass(), j2)) {
                    type = a.this.f7451k.getGenericSuperclass();
                } else {
                    Class[] interfaces = a.this.f7451k.getInterfaces();
                    i.d(interfaces, "jClass.interfaces");
                    int y1 = b.q.a.a.y1(interfaces, j2);
                    if (y1 >= 0) {
                        type = a.this.f7451k.getGenericInterfaces()[y1];
                    } else {
                        StringBuilder y = b.e.a.a.a.y("No superclass of ");
                        y.append(this.f7559i.f7475h);
                        y.append(" in Java reflection for ");
                        y.append(d);
                        throw new l0(y.toString());
                    }
                }
                i.d(type, "if (jClass.superclass ==…ex]\n                    }");
                return type;
            }
            StringBuilder y2 = b.e.a.a.a.y("Unsupported superclass of ");
            y2.append(this.f7559i.f7475h);
            y2.append(": ");
            y2.append(d);
            throw new l0(y2.toString());
        }
        throw new l0("Supertype not a class: " + d);
    }
}
