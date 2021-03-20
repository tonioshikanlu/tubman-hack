package b.j.a.c.j0;

import b.j.a.b.f;
import b.j.a.b.j;
import b.j.a.c.i;
import b.j.a.c.k;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

public final class g {
    public static final Annotation[] a = new Annotation[0];

    /* renamed from: b  reason: collision with root package name */
    public static final a[] f2212b = new a[0];
    public static final Iterator<?> c = Collections.emptyIterator();

    public static final class a {
        public final Constructor<?> a;

        /* renamed from: b  reason: collision with root package name */
        public Annotation[][] f2213b;
        public int c = -1;

        public a(Constructor<?> constructor) {
            this.a = constructor;
        }

        public int a() {
            int i2 = this.c;
            if (i2 >= 0) {
                return i2;
            }
            int length = this.a.getParameterTypes().length;
            this.c = length;
            return length;
        }
    }

    public static class b {
        public static final b c = new b();
        public final Field a = a(EnumSet.class, "elementType", Class.class);

        /* renamed from: b  reason: collision with root package name */
        public final Field f2214b = a(EnumMap.class, "elementType", Class.class);

        public static Field a(Class<?> cls, String str, Class<?> cls2) {
            Field field;
            Annotation[] annotationArr = g.a;
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i2];
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    break;
                }
                i2++;
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }
    }

    public static Class<?> A(i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar.f2152h;
    }

    public static <T> T B(b.j.a.c.g gVar, IOException iOException) {
        if (iOException instanceof k) {
            throw ((k) iOException);
        }
        k kVar = new k(gVar.f1996m, iOException.getMessage());
        kVar.initCause(iOException);
        throw kVar;
    }

    public static Throwable C(Throwable th) {
        if (!(th instanceof Error)) {
            return th;
        }
        throw ((Error) th);
    }

    public static Throwable D(Throwable th) {
        if (!(th instanceof IOException)) {
            return th;
        }
        throw ((IOException) th);
    }

    public static Throwable E(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            return th;
        }
        throw ((RuntimeException) th);
    }

    public static void F(Throwable th, String str) {
        Throwable r = r(th);
        E(r);
        C(r);
        throw new IllegalArgumentException(str, r);
    }

    public static void G(Class<?> cls, Object obj, String str) {
        if (obj.getClass() != cls) {
            throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", new Object[]{obj.getClass().getName(), cls.getName(), str}));
        }
    }

    public static Class<?> H(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException(b.e.a.a.a.e(cls, b.e.a.a.a.y("Class "), " is not a primitive type"));
    }

    public static void a(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z) {
                if (!collection.contains(cls)) {
                    collection.add(cls);
                } else {
                    return;
                }
            }
            for (Class a2 : cls.getInterfaces()) {
                a(a2, cls2, collection, true);
            }
            a(cls.getSuperclass(), cls2, collection, true);
        }
    }

    public static void b(i iVar, Class<?> cls, Collection<i> collection, boolean z) {
        Class<?> cls2;
        if (iVar != null && (cls2 = iVar.f2152h) != cls && cls2 != Object.class) {
            if (z) {
                if (!collection.contains(iVar)) {
                    collection.add(iVar);
                } else {
                    return;
                }
            }
            for (i b2 : iVar.m()) {
                b(b2, cls, collection, true);
            }
            b(iVar.q(), cls, collection, true);
        }
    }

    public static String c(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    public static String d(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (cls.isEnum()) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return "primitive";
        }
        return null;
    }

    public static void e(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e2) {
                if (!accessibleObject.isAccessible()) {
                    Class<?> declaringClass = member.getDeclaringClass();
                    throw new IllegalArgumentException("Cannot access " + member + " (from class " + declaringClass.getName() + "; failed to set access: " + e2.getMessage());
                }
                return;
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static String f(Object obj) {
        return obj == null ? "[null]" : y(obj.getClass());
    }

    public static void g(f fVar, Closeable closeable, Exception exc) {
        if (fVar != null) {
            fVar.H(f.a.AUTO_CLOSE_JSON_CONTENT);
            try {
                fVar.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e3) {
                exc.addSuppressed(e3);
            }
        }
        D(exc);
        E(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T h(Class<T> cls, boolean z) {
        Constructor<T> k2 = k(cls, z);
        if (k2 != null) {
            try {
                return k2.newInstance(new Object[0]);
            } catch (Exception e2) {
                StringBuilder y = b.e.a.a.a.y("Failed to instantiate class ");
                y.append(cls.getName());
                y.append(", problem: ");
                y.append(e2.getMessage());
                F(e2, y.toString());
                throw null;
            }
        } else {
            throw new IllegalArgumentException(b.e.a.a.a.e(cls, b.e.a.a.a.y("Class "), " has no default (no arg) constructor"));
        }
    }

    public static String i(Throwable th) {
        return th instanceof j ? ((j) th).b() : th.getMessage();
    }

    public static Annotation[] j(Class<?> cls) {
        return w(cls) ? a : cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> k(Class<T> cls, boolean z) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z) {
                e(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e2) {
            StringBuilder y = b.e.a.a.a.y("Failed to find default constructor of class ");
            y.append(cls.getName());
            y.append(", problem: ");
            y.append(e2.getMessage());
            F(e2, y.toString());
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r1 = r1.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 != r2) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        r0.add(r1);
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Class<?>, code=java.lang.Class, for r1v0, types: [java.lang.Class<?>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.Class<?>> l(java.lang.Class r1, java.lang.Class<?> r2, boolean r3) {
        /*
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            if (r1 == 0) goto L_0x0019
            if (r1 == r2) goto L_0x0019
            if (r3 == 0) goto L_0x000c
            goto L_0x0015
        L_0x000c:
            java.lang.Class r1 = r1.getSuperclass()
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            r0.add(r1)
            goto L_0x000c
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a.c.j0.g.l(java.lang.Class, java.lang.Class, boolean):java.util.List");
    }

    public static Method[] m(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (ClassNotFoundException e3) {
                    e2.addSuppressed(e3);
                    throw e2;
                }
            } else {
                throw e2;
            }
        }
    }

    public static a[] n(Class<?> cls) {
        if (cls.isInterface() || w(cls)) {
            return f2212b;
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        a[] aVarArr = new a[length];
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2] = new a(declaredConstructors[i2]);
        }
        return aVarArr;
    }

    public static Class<?> o(Class<?> cls) {
        if (w(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Class<?> p(Class<?> cls) {
        try {
            if (!(!w(cls) && cls.getEnclosingMethod() != null) && !Modifier.isStatic(cls.getModifiers())) {
                return o(cls);
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public static String q(Class<?> cls) {
        Package packageR = cls.getPackage();
        if (packageR == null) {
            return null;
        }
        return packageR.getName();
    }

    public static Throwable r(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static boolean s(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean t(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == b.j.a.c.z.j.class;
    }

    public static boolean u(Object obj) {
        if (obj != null) {
            if (!(obj.getClass().getAnnotation(b.j.a.c.z.a.class) != null)) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(Class<?> cls) {
        return !Modifier.isStatic(cls.getModifiers()) && o(cls) != null;
    }

    public static boolean w(Class<?> cls) {
        return cls == Object.class || cls.isPrimitive();
    }

    public static boolean x(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith("net.sf.cglib.proxy.") || name.startsWith("org.hibernate.proxy.");
    }

    public static String y(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i2 = 0;
        while (cls.isArray()) {
            i2++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i2 > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append("[]");
                i2--;
            } while (i2 > 0);
            simpleName = sb.toString();
        }
        return c(simpleName);
    }

    public static Class<?> z(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }
}
