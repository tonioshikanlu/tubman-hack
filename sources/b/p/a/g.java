package b.p.a;

import b.p.a.l;
import b.p.a.q;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class g<T> extends l<T> {
    public static final l.a d = new a();
    public final f<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final b<?>[] f6381b;
    public final q.a c;

    public class a implements l.a {
        public l<?> a(Type type, Set<? extends Annotation> set, x xVar) {
            f fVar;
            Class<Object> cls = Object.class;
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> B = b.l.f.x.a.g.B(type);
            if (B.isInterface() || B.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (b.p.a.z.b.e(B)) {
                b(type, List.class);
                b(type, Set.class);
                b(type, Map.class);
                b(type, Collection.class);
                String str = "Platform " + B;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(b.e.a.a.a.m(str, " requires explicit JsonAdapter to be registered"));
            } else if (B.isAnonymousClass()) {
                throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("Cannot serialize anonymous class ")));
            } else if (B.isLocalClass()) {
                throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("Cannot serialize local class ")));
            } else if (B.getEnclosingClass() != null && !Modifier.isStatic(B.getModifiers())) {
                throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("Cannot serialize non-static nested class ")));
            } else if (!Modifier.isAbstract(B.getModifiers())) {
                Class<? extends Annotation> cls2 = b.p.a.z.b.d;
                int i2 = 0;
                if (!(cls2 != null && B.isAnnotationPresent(cls2))) {
                    try {
                        Constructor<?> declaredConstructor = B.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        fVar = new b(declaredConstructor, B);
                    } catch (NoSuchMethodException unused) {
                        try {
                            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls3.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            fVar = new c(cls3.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null), B);
                        } catch (IllegalAccessException unused2) {
                            throw new AssertionError();
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                            try {
                                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                                declaredMethod.setAccessible(true);
                                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{cls})).intValue();
                                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                                declaredMethod2.setAccessible(true);
                                fVar = new d(declaredMethod2, B, intValue);
                            } catch (IllegalAccessException unused4) {
                                throw new AssertionError();
                            } catch (InvocationTargetException e2) {
                                b.p.a.z.b.j(e2);
                                throw null;
                            } catch (NoSuchMethodException unused5) {
                                try {
                                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                                    declaredMethod3.setAccessible(true);
                                    fVar = new e(declaredMethod3, B);
                                } catch (Exception unused6) {
                                    throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("cannot construct instances of ")));
                                }
                            }
                        }
                    }
                    TreeMap treeMap = new TreeMap();
                    while (type != cls) {
                        Class<?> B2 = b.l.f.x.a.g.B(type);
                        boolean e3 = b.p.a.z.b.e(B2);
                        Field[] declaredFields = B2.getDeclaredFields();
                        int length = declaredFields.length;
                        int i3 = i2;
                        while (i2 < length) {
                            Field field = declaredFields[i2];
                            int modifiers = field.getModifiers();
                            if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !e3)) {
                                i3 = 1;
                            }
                            if (i3 != 0) {
                                Type h2 = b.p.a.z.b.h(type, B2, field.getGenericType());
                                Set<? extends Annotation> f = b.p.a.z.b.f(field.getAnnotations());
                                String name = field.getName();
                                l<T> d = xVar.d(h2, f, name);
                                field.setAccessible(true);
                                k kVar = (k) field.getAnnotation(k.class);
                                if (kVar != null) {
                                    name = kVar.name();
                                }
                                b bVar = new b(name, field, d);
                                b bVar2 = (b) treeMap.put(name, bVar);
                                if (bVar2 != null) {
                                    StringBuilder y = b.e.a.a.a.y("Conflicting fields:\n    ");
                                    y.append(bVar2.f6382b);
                                    y.append("\n    ");
                                    y.append(bVar.f6382b);
                                    throw new IllegalArgumentException(y.toString());
                                }
                            }
                            i2++;
                            i3 = 0;
                        }
                        Class<?> B3 = b.l.f.x.a.g.B(type);
                        type = b.p.a.z.b.h(type, B3, B3.getGenericSuperclass());
                        i2 = 0;
                    }
                    return new g(fVar, treeMap).c();
                }
                throw new IllegalArgumentException(b.e.a.a.a.e(B, b.e.a.a.a.y("Cannot serialize Kotlin type "), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact."));
            } else {
                throw new IllegalArgumentException(b.e.a.a.a.d(B, b.e.a.a.a.y("Cannot serialize abstract class ")));
            }
        }

        public final void b(Type type, Class<?> cls) {
            Class<?> B = b.l.f.x.a.g.B(type);
            if (cls.isAssignableFrom(B)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + B.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }
    }

    public static class b<T> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final Field f6382b;
        public final l<T> c;

        public b(String str, Field field, l<T> lVar) {
            this.a = str;
            this.f6382b = field;
            this.c = lVar;
        }
    }

    public g(f<T> fVar, Map<String, b<?>> map) {
        this.a = fVar;
        this.f6381b = (b[]) map.values().toArray(new b[map.size()]);
        this.c = q.a.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    public T a(q qVar) {
        try {
            T a2 = this.a.a();
            try {
                qVar.e();
                while (qVar.N()) {
                    int m0 = qVar.m0(this.c);
                    if (m0 == -1) {
                        qVar.n0();
                        qVar.o0();
                    } else {
                        b<?> bVar = this.f6381b[m0];
                        bVar.f6382b.set(a2, bVar.c.a(qVar));
                    }
                }
                qVar.z();
                return a2;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            b.p.a.z.b.j(e3);
            throw null;
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public void e(u uVar, T t) {
        try {
            uVar.e();
            for (b<?> bVar : this.f6381b) {
                uVar.O(bVar.a);
                bVar.c.e(uVar, bVar.f6382b.get(t));
            }
            uVar.H();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("JsonAdapter(");
        y.append(this.a);
        y.append(")");
        return y.toString();
    }
}
