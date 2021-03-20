package b.g.a.k;

import b.l.e.a0;
import b.l.e.b0;
import b.l.e.c0;
import b.l.e.g0.c;
import b.l.e.k;
import b.l.e.u;
import java.lang.reflect.Field;

public class b implements c0 {

    public class a extends b0<T> {
        public final /* synthetic */ b0 a;

        public a(b bVar, b0 b0Var) {
            this.a = b0Var;
        }

        public T a(b.l.e.g0.a aVar) {
            T a2 = this.a.a(aVar);
            for (Field field : a2.getClass().getDeclaredFields()) {
                if (field.getAnnotation(a.class) != null) {
                    try {
                        field.setAccessible(true);
                        if (field.get(a2) == null) {
                            throw new u(String.format("Missing required attribute %s", new Object[]{field.getName()}));
                        }
                    } catch (IllegalAccessException unused) {
                        throw new u(String.format("Missing required attribute %s", new Object[]{field.getName()}));
                    }
                }
            }
            return a2;
        }

        public void b(c cVar, T t) {
            this.a.b(cVar, t);
        }
    }

    public <T> b0<T> a(k kVar, b.l.e.f0.a<T> aVar) {
        return new a0(new a(this, kVar.g(this, aVar)));
    }
}
