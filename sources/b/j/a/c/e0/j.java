package b.j.a.c.e0;

import b.j.a.c.b;
import b.j.a.c.e0.n;
import b.j.a.c.e0.s;
import b.j.a.c.j0.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class j extends t {
    public final s.a d;

    public static final class a {
        public g0 a;

        /* renamed from: b  reason: collision with root package name */
        public Method f1921b;
        public n c;

        public a(g0 g0Var, Method method, n nVar) {
            this.a = g0Var;
            this.f1921b = method;
            this.c = nVar;
        }
    }

    public j(b bVar, s.a aVar) {
        super(bVar);
        this.d = bVar == null ? null : aVar;
    }

    public final void f(g0 g0Var, Class<?> cls, Map<w, a> map, Class<?> cls2) {
        if (cls2 != null) {
            g(g0Var, cls, map, cls2);
        }
        if (cls != null) {
            for (Method method : g.m(cls)) {
                if (h(method)) {
                    w wVar = new w(method);
                    a aVar = map.get(wVar);
                    if (aVar == null) {
                        map.put(wVar, new a(g0Var, method, this.a == null ? n.a.c : c(method.getDeclaredAnnotations())));
                    } else {
                        if (this.a != null) {
                            aVar.c = d(aVar.c, method.getDeclaredAnnotations());
                        }
                        Method method2 = aVar.f1921b;
                        if (method2 == null) {
                            aVar.f1921b = method;
                        } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                            aVar.f1921b = method;
                            aVar.a = g0Var;
                        }
                    }
                }
            }
        }
    }

    public void g(g0 g0Var, Class<?> cls, Map<w, a> map, Class<?> cls2) {
        List<Class> list;
        if (this.a != null) {
            Annotation[] annotationArr = g.a;
            if (cls2 == cls || cls2 == Object.class) {
                list = Collections.emptyList();
            } else {
                list = new ArrayList<>(8);
                g.a(cls2, cls, list, true);
            }
            for (Class declaredMethods : list) {
                for (Method method : declaredMethods.getDeclaredMethods()) {
                    if (h(method)) {
                        w wVar = new w(method);
                        a aVar = map.get(wVar);
                        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                        if (aVar == null) {
                            map.put(wVar, new a(g0Var, (Method) null, c(declaredAnnotations)));
                        } else {
                            aVar.c = d(aVar.c, declaredAnnotations);
                        }
                    }
                }
            }
        }
    }

    public final boolean h(Method method) {
        return !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic() && !method.isBridge() && method.getParameterTypes().length <= 2;
    }
}
