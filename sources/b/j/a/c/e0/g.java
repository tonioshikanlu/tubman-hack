package b.j.a.c.e0;

import b.j.a.c.b;
import b.j.a.c.e0.g0;
import b.j.a.c.e0.n;
import b.j.a.c.e0.s;
import b.j.a.c.i;
import b.j.a.c.i0.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.Map;

public class g extends t {
    public final n d;

    /* renamed from: e  reason: collision with root package name */
    public final s.a f1904e;

    public static final class a {
        public final g0 a;

        /* renamed from: b  reason: collision with root package name */
        public final Field f1905b;
        public n c = n.a.c;

        public a(g0 g0Var, Field field) {
            this.a = g0Var;
            this.f1905b = field;
        }
    }

    public g(b bVar, b.j.a.c.i0.n nVar, s.a aVar) {
        super(bVar);
        this.d = nVar;
        this.f1904e = bVar == null ? null : aVar;
    }

    public final Map<String, a> f(g0 g0Var, i iVar, Map<String, a> map) {
        Class<?> a2;
        a aVar;
        i q2 = iVar.q();
        if (q2 == null) {
            return map;
        }
        Class<?> cls = iVar.f2152h;
        Map<String, a> f = f(new g0.a(this.d, q2.j()), q2, map);
        Annotation[] annotationArr = b.j.a.c.j0.g.a;
        for (Field field : cls.getDeclaredFields()) {
            if (g(field)) {
                if (f == null) {
                    f = new LinkedHashMap<>();
                }
                a aVar2 = new a(g0Var, field);
                if (this.a != null) {
                    aVar2.c = b(aVar2.c, field.getDeclaredAnnotations());
                }
                f.put(field.getName(), aVar2);
            }
        }
        s.a aVar3 = this.f1904e;
        if (!(aVar3 == null || (a2 = aVar3.a(cls)) == null)) {
            for (Class<?> declaredFields : b.j.a.c.j0.g.l(a2, cls, true)) {
                for (Field field2 : declaredFields.getDeclaredFields()) {
                    if (g(field2) && (aVar = f.get(field2.getName())) != null) {
                        aVar.c = b(aVar.c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return f;
    }

    public final boolean g(Field field) {
        return !field.isSynthetic() && !Modifier.isStatic(field.getModifiers());
    }
}
