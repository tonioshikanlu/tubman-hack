package e.a.a.a.y0.b.d1.a;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.b.d1.b.b;
import e.a.a.a.y0.d.b.l;
import e.a.a.a.y0.f.a;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.j.t.f;
import e.a.e;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

public final class c {
    public static final f a(Class<?> cls) {
        f fVar;
        int i2 = 0;
        while (cls.isArray()) {
            i2++;
            cls = cls.getComponentType();
            i.d(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            a b2 = b.b(cls);
            e.a.a.a.y0.a.p.c cVar = e.a.a.a.y0.a.p.c.f7720m;
            e.a.a.a.y0.f.b b3 = b2.b();
            i.d(b3, "javaClassId.asSingleFqName()");
            a j2 = cVar.j(b3);
            if (j2 != null) {
                b2 = j2;
            }
            return new f(b2, i2);
        } else if (i.a(cls, Void.TYPE)) {
            a l2 = a.l(g.f7647k.d.i());
            i.d(l2, "ClassId.topLevel(KotlinB…s.FQ_NAMES.unit.toSafe())");
            return new f(l2, i2);
        } else {
            e.a.a.a.y0.j.w.c e2 = e.a.a.a.y0.j.w.c.e(cls.getName());
            i.d(e2, "JvmPrimitiveType.get(currentClass.name)");
            e.a.a.a.y0.a.i l3 = e2.l();
            i.d(l3, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
            if (i2 > 0) {
                e.a.a.a.y0.f.b bVar = l3.f7678k;
                if (bVar == null) {
                    bVar = g.f.c(l3.f7676i);
                    l3.f7678k = bVar;
                }
                a l4 = a.l(bVar);
                i.d(l4, "ClassId.topLevel(primitiveType.arrayTypeFqName)");
                int i3 = i2 - 1;
                return fVar;
            }
            e.a.a.a.y0.f.b bVar2 = l3.f7677j;
            if (bVar2 == null) {
                bVar2 = g.f.c(l3.f7675h);
                l3.f7677j = bVar2;
            }
            a l5 = a.l(bVar2);
            i.d(l5, "ClassId.topLevel(primitiveType.typeFqName)");
            fVar = new f(l5, i2);
            return fVar;
        }
    }

    public static final void b(l.c cVar, Annotation annotation) {
        Class L0 = b.q.a.a.L0(b.q.a.a.t0(annotation));
        l.a a = cVar.a(b.b(L0), new b(annotation));
        if (a != null) {
            c(a, annotation, L0);
        }
    }

    public static final void c(l.a aVar, Annotation annotation, Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                i.c(invoke);
                i.d(method, "method");
                d l2 = d.l(method.getName());
                i.d(l2, "Name.identifier(method.name)");
                Class<?> cls2 = invoke.getClass();
                if (i.a(cls2, Class.class)) {
                    aVar.b(l2, a((Class) invoke));
                } else if (g.a.contains(cls2)) {
                    aVar.d(l2, invoke);
                } else {
                    List<e<? extends Object>> list = b.a;
                    i.e(cls2, "$this$isEnumClassOrSpecializedEnumEntryClass");
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                            i.d(cls2, "clazz.enclosingClass");
                        }
                        a b2 = b.b(cls2);
                        d l3 = d.l(((Enum) invoke).name());
                        i.d(l3, "Name.identifier((value as Enum<*>).name)");
                        aVar.e(l2, b2, l3);
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class[] interfaces = cls2.getInterfaces();
                        i.d(interfaces, "clazz.interfaces");
                        Class cls3 = (Class) b.q.a.a.U2(interfaces);
                        l.a c = aVar.c(l2, b.b(cls3));
                        if (c != null) {
                            i.d(cls3, "annotationClass");
                            c(c, (Annotation) invoke, cls3);
                        }
                    } else if (cls2.isArray()) {
                        l.b f = aVar.f(l2);
                        if (f != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                a b3 = b.b(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    d l4 = d.l(((Enum) obj).name());
                                    i.d(l4, "Name.identifier((element as Enum<*>).name)");
                                    f.d(b3, l4);
                                }
                            } else {
                                Object[] objArr = (Object[]) invoke;
                                if (i.a(componentType, Class.class)) {
                                    for (Object obj2 : objArr) {
                                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                        f.b(a((Class) obj2));
                                    }
                                } else {
                                    for (Object c2 : objArr) {
                                        f.c(c2);
                                    }
                                }
                            }
                            f.a();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}
