package e.a.a.a.y0.b.d1.b;

import androidx.exifinterface.media.ExifInterface;
import e.a.e;
import e.b0.h;
import e.j;
import e.t.g;
import e.x.b.c;
import e.x.b.d;
import e.x.b.f;
import e.x.b.l;
import e.x.b.m;
import e.x.b.n;
import e.x.b.o;
import e.x.b.p;
import e.x.b.q;
import e.x.b.r;
import e.x.b.s;
import e.x.b.t;
import e.x.b.u;
import e.x.b.w;
import e.x.c.i;
import e.x.c.k;
import e.x.c.v;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class b {
    public static final List<e<? extends Object>> a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f8289b;
    public static final Map<Class<? extends Object>, Class<? extends Object>> c;
    public static final Map<Class<? extends Object<?>>, Integer> d;

    public static final class a extends k implements l<ParameterizedType, ParameterizedType> {

        /* renamed from: h  reason: collision with root package name */
        public static final a f8290h = new a();

        public a() {
            super(1);
        }

        public Object invoke(Object obj) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            i.e(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (!(ownerType instanceof ParameterizedType)) {
                ownerType = null;
            }
            return (ParameterizedType) ownerType;
        }
    }

    /* renamed from: e.a.a.a.y0.b.d1.b.b$b  reason: collision with other inner class name */
    public static final class C0169b extends k implements l<ParameterizedType, h<? extends Type>> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0169b f8291h = new C0169b();

        public C0169b() {
            super(1);
        }

        public Object invoke(Object obj) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            i.e(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            i.d(actualTypeArguments, "it.actualTypeArguments");
            return b.q.a.a.s(actualTypeArguments);
        }
    }

    static {
        int i2 = 0;
        List<e<? extends Object>> B = g.B(v.a(Boolean.TYPE), v.a(Byte.TYPE), v.a(Character.TYPE), v.a(Double.TYPE), v.a(Float.TYPE), v.a(Integer.TYPE), v.a(Long.TYPE), v.a(Short.TYPE));
        a = B;
        ArrayList arrayList = new ArrayList(b.q.a.a.C(B, 10));
        for (e eVar : B) {
            arrayList.add(new j(b.q.a.a.O0(eVar), b.q.a.a.P0(eVar)));
        }
        f8289b = g.X(arrayList);
        List<e<? extends Object>> list = a;
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(list, 10));
        for (e eVar2 : list) {
            arrayList2.add(new j(b.q.a.a.P0(eVar2), b.q.a.a.O0(eVar2)));
        }
        c = g.X(arrayList2);
        List B2 = g.B(e.x.b.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, e.x.b.v.class, w.class, e.x.b.b.class, c.class, d.class, e.x.b.e.class, f.class, e.x.b.g.class, e.x.b.h.class, e.x.b.i.class, e.x.b.j.class, e.x.b.k.class, m.class, n.class, o.class);
        ArrayList arrayList3 = new ArrayList(b.q.a.a.C(B2, 10));
        for (Object next : B2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList3.add(new j((Class) next, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                g.S();
                throw null;
            }
        }
        d = g.X(arrayList3);
    }

    public static final Class<?> a(Class<?> cls) {
        i.e(cls, "$this$createArrayType");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final e.a.a.a.y0.f.a b(Class<?> cls) {
        e.a.a.a.y0.f.a b2;
        i.e(cls, "$this$classId");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                i.d(simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    e.a.a.a.y0.f.a l2 = (declaringClass == null || (b2 = b(declaringClass)) == null) ? e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b(cls.getName())) : b2.d(e.a.a.a.y0.f.d.l(cls.getSimpleName()));
                    i.d(l2, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                    return l2;
                }
            }
            e.a.a.a.y0.f.b bVar = new e.a.a.a.y0.f.b(cls.getName());
            return new e.a.a.a.y0.f.a(bVar.e(), e.a.a.a.y0.f.b.k(bVar.g()), true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    public static final String c(Class<?> cls) {
        i.e(cls, "$this$desc");
        if (i.a(cls, Void.TYPE)) {
            return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
        }
        String name = a(cls).getName();
        i.d(name, "createArrayType().name");
        String substring = name.substring(1);
        i.d(substring, "(this as java.lang.String).substring(startIndex)");
        return e.c0.h.v(substring, '.', '/', false, 4);
    }

    public static final List<Type> d(Type type) {
        i.e(type, "$this$parameterizedTypeArguments");
        if (!(type instanceof ParameterizedType)) {
            return e.t.o.f7934h;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return e.b0.s.j(e.b0.s.e(e.a.a.a.y0.m.o1.c.B(type, a.f8290h), C0169b.f8291h));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        i.d(actualTypeArguments, "actualTypeArguments");
        return b.q.a.a.g3(actualTypeArguments);
    }

    public static final ClassLoader e(Class<?> cls) {
        i.e(cls, "$this$safeClassLoader");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        i.d(systemClassLoader, "ClassLoader.getSystemClassLoader()");
        return systemClassLoader;
    }
}
