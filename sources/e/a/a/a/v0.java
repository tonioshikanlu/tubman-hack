package e.a.a.a;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import e.a.a.a.y0.b.a1.a;
import e.a.a.a.y0.b.a1.h;
import e.a.a.a.y0.b.d1.a.j;
import e.a.a.a.y0.b.d1.b.q;
import e.a.a.a.y0.b.d1.b.u;
import e.a.a.a.y0.b.i0;
import e.a.a.a.y0.b.k;
import e.a.a.a.y0.b.m0;
import e.a.a.a.y0.b.w;
import e.a.a.a.y0.e.n;
import e.a.a.a.y0.e.s;
import e.a.a.a.y0.e.z.e;
import e.a.a.a.y0.e.z.g;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.h.p;
import e.a.a.a.y0.j.t.t;
import e.a.a.a.y0.k.b.c0;
import e.a.a.a.y0.k.b.g0.f;
import e.a.a.a.y0.k.b.l;
import e.a.a.a.y0.k.b.v;
import e.a.c;
import e.x.c.g;
import e.x.c.i;
import e.x.c.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class v0 {
    public static final b a = new b("kotlin.jvm.JvmStatic");

    public static final g<?> a(Object obj) {
        g<?> gVar = (g) (!(obj instanceof g) ? null : obj);
        if (gVar == null) {
            gVar = b(obj);
        }
        return gVar != null ? gVar : c(obj);
    }

    public static final b b(Object obj) {
        c cVar = null;
        b bVar = (b) (!(obj instanceof b) ? null : obj);
        if (bVar != null) {
            return bVar;
        }
        if (!(obj instanceof g)) {
            obj = null;
        }
        g gVar = (g) obj;
        c e2 = gVar != null ? gVar.e() : null;
        if (e2 instanceof b) {
            cVar = e2;
        }
        return (b) cVar;
    }

    public static final c0<?> c(Object obj) {
        c cVar = null;
        c0<?> c0Var = (c0) (!(obj instanceof c0) ? null : obj);
        if (c0Var != null) {
            return c0Var;
        }
        if (!(obj instanceof r)) {
            obj = null;
        }
        r rVar = (r) obj;
        c e2 = rVar != null ? rVar.e() : null;
        if (e2 instanceof c0) {
            cVar = e2;
        }
        return (c0) cVar;
    }

    public static final List<Annotation> d(a aVar) {
        i.e(aVar, "$this$computeAnnotations");
        h<e.a.a.a.y0.b.a1.c> k2 = aVar.k();
        ArrayList arrayList = new ArrayList();
        for (e.a.a.a.y0.b.a1.c cVar : k2) {
            m0 w = cVar.w();
            Annotation annotation = null;
            if (w instanceof e.a.a.a.y0.b.d1.a.b) {
                annotation = ((e.a.a.a.y0.b.d1.a.b) w).f8282b;
            } else if (w instanceof j.a) {
                u uVar = ((j.a) w).f8287b;
                if (!(uVar instanceof e.a.a.a.y0.b.d1.b.c)) {
                    uVar = null;
                }
                e.a.a.a.y0.b.d1.b.c cVar2 = (e.a.a.a.y0.b.d1.b.c) uVar;
                if (cVar2 != null) {
                    annotation = cVar2.a;
                }
            } else {
                annotation = i(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        i.e(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (i.a(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (i.a(type, Character.TYPE)) {
            return Character.valueOf((char) 0);
        }
        if (i.a(type, Byte.TYPE)) {
            return Byte.valueOf((byte) 0);
        }
        if (i.a(type, Short.TYPE)) {
            return Short.valueOf((short) 0);
        }
        if (i.a(type, Integer.TYPE)) {
            return 0;
        }
        if (i.a(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (i.a(type, Long.TYPE)) {
            return 0L;
        }
        if (i.a(type, Double.TYPE)) {
            return Double.valueOf(ShadowDrawableWrapper.COS_45);
        }
        if (i.a(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final <M extends p, D extends e.a.a.a.y0.b.a> D f(Class<?> cls, M m2, e.a.a.a.y0.e.z.c cVar, e eVar, e.a.a.a.y0.e.z.a aVar, e.x.b.p<? super v, ? super M, ? extends D> pVar) {
        List<s> list;
        M m3 = m2;
        e.x.b.p<? super v, ? super M, ? extends D> pVar2 = pVar;
        Class<?> cls2 = cls;
        i.e(cls, "moduleAnchor");
        i.e(m2, "proto");
        i.e(cVar, "nameResolver");
        i.e(eVar, "typeTable");
        i.e(aVar, "metadataVersion");
        i.e(pVar2, "createDescriptor");
        e.a.a.a.y0.b.d1.a.i a2 = m0.a(cls);
        if (m3 instanceof e.a.a.a.y0.e.i) {
            list = ((e.a.a.a.y0.e.i) m3).f8932p;
        } else if (m3 instanceof n) {
            list = ((n) m3).f8989p;
        } else {
            throw new IllegalStateException(("Unsupported message: " + m2).toString());
        }
        List<s> list2 = list;
        e.a.a.a.y0.k.b.j jVar = a2.a;
        w wVar = jVar.c;
        g.a aVar2 = e.a.a.a.y0.e.z.g.c;
        e.a.a.a.y0.e.z.g gVar = e.a.a.a.y0.e.z.g.f9204b;
        e.a.a.a.y0.e.z.g gVar2 = e.a.a.a.y0.e.z.g.f9204b;
        i.d(list2, "typeParameters");
        return (e.a.a.a.y0.b.a) pVar2.invoke(new v(new l(jVar, cVar, wVar, eVar, gVar2, aVar, (f) null, (c0) null, list2)), m2);
    }

    public static final i0 g(e.a.a.a.y0.b.a aVar) {
        i.e(aVar, "$this$instanceReceiverParameter");
        if (aVar.K() == null) {
            return null;
        }
        k b2 = aVar.b();
        Objects.requireNonNull(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((e.a.a.a.y0.b.e) b2).U0();
    }

    public static final Class<?> h(ClassLoader classLoader, e.a.a.a.y0.f.a aVar, int i2) {
        e.a.a.a.y0.a.p.c cVar = e.a.a.a.y0.a.p.c.f7720m;
        e.a.a.a.y0.f.c j2 = aVar.b().j();
        i.d(j2, "kotlinClassId.asSingleFqName().toUnsafe()");
        e.a.a.a.y0.f.a l2 = cVar.l(j2);
        if (l2 != null) {
            aVar = l2;
        }
        String b2 = aVar.h().b();
        i.d(b2, "javaClassId.packageFqName.asString()");
        String b3 = aVar.i().b();
        i.d(b3, "javaClassId.relativeClassName.asString()");
        if (i.a(b2, "kotlin")) {
            switch (b3.hashCode()) {
                case -901856463:
                    if (b3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str = b2 + '.' + e.c0.h.v(b3, '.', '$', false, 4);
        if (i2 > 0) {
            str = e.c0.h.u("[", i2) + 'L' + str + ';';
        }
        return b.q.a.a.l3(classLoader, str);
    }

    public static final Annotation i(e.a.a.a.y0.b.a1.c cVar) {
        e.a.a.a.y0.b.e e2 = e.a.a.a.y0.j.v.b.e(cVar);
        Class<?> j2 = e2 != null ? j(e2) : null;
        if (!(j2 instanceof Class)) {
            j2 = null;
        }
        if (j2 == null) {
            return null;
        }
        Set<Map.Entry<d, e.a.a.a.y0.j.t.g<?>>> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            d dVar = (d) entry.getKey();
            ClassLoader classLoader = j2.getClassLoader();
            i.d(classLoader, "annotationClass.classLoader");
            Object k2 = k((e.a.a.a.y0.j.t.g) entry.getValue(), classLoader);
            e.j jVar = k2 != null ? new e.j(dVar.e(), k2) : null;
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        Map X = e.t.g.X(arrayList);
        Set<String> keySet = X.keySet();
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(keySet, 10));
        for (String declaredMethod : keySet) {
            arrayList2.add(j2.getDeclaredMethod(declaredMethod, new Class[0]));
        }
        return (Annotation) b.q.a.a.R(j2, X, arrayList2);
    }

    public static final Class<?> j(e.a.a.a.y0.b.e eVar) {
        i.e(eVar, "$this$toJavaClass");
        m0 w = eVar.w();
        i.d(w, "source");
        if (w instanceof e.a.a.a.y0.d.b.n) {
            e.a.a.a.y0.d.b.l lVar = ((e.a.a.a.y0.d.b.n) w).f8647b;
            Objects.requireNonNull(lVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((e.a.a.a.y0.b.d1.a.e) lVar).a;
        } else if (w instanceof j.a) {
            u uVar = ((j.a) w).f8287b;
            Objects.requireNonNull(uVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((q) uVar).a;
        } else {
            e.a.a.a.y0.f.a g2 = e.a.a.a.y0.j.v.b.g(eVar);
            if (g2 != null) {
                return h(e.a.a.a.y0.b.d1.b.b.e(eVar.getClass()), g2, 0);
            }
            return null;
        }
    }

    public static final Object k(e.a.a.a.y0.j.t.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof e.a.a.a.y0.j.t.a) {
            return i((e.a.a.a.y0.b.a1.c) ((e.a.a.a.y0.j.t.a) gVar).a);
        }
        if (gVar instanceof e.a.a.a.y0.j.t.b) {
            Iterable<e.a.a.a.y0.j.t.g> iterable = (Iterable) ((e.a.a.a.y0.j.t.b) gVar).a;
            ArrayList arrayList = new ArrayList(b.q.a.a.C(iterable, 10));
            for (e.a.a.a.y0.j.t.g k2 : iterable) {
                arrayList.add(k(k2, classLoader));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return array;
        } else if (gVar instanceof e.a.a.a.y0.j.t.k) {
            e.j jVar = (e.j) ((e.a.a.a.y0.j.t.k) gVar).a;
            d dVar = (d) jVar.f7907i;
            Class<?> h2 = h(classLoader, (e.a.a.a.y0.f.a) jVar.f7906h, 0);
            if (h2 != null) {
                return Enum.valueOf(h2, dVar.e());
            }
            return null;
        } else if (gVar instanceof t) {
            t.a aVar = (t.a) ((t) gVar).a;
            if (aVar instanceof t.a.b) {
                e.a.a.a.y0.j.t.f fVar = ((t.a.b) aVar).a;
                return h(classLoader, fVar.a, fVar.f9411b);
            } else if (aVar instanceof t.a.C0211a) {
                e.a.a.a.y0.b.h d = ((t.a.C0211a) aVar).a.W0().d();
                if (!(d instanceof e.a.a.a.y0.b.e)) {
                    d = null;
                }
                e.a.a.a.y0.b.e eVar = (e.a.a.a.y0.b.e) d;
                if (eVar != null) {
                    return j(eVar);
                }
                return null;
            } else {
                throw new e.h();
            }
        } else if (!(gVar instanceof e.a.a.a.y0.j.t.l) && !(gVar instanceof e.a.a.a.y0.j.t.v)) {
            return gVar.b();
        } else {
            return null;
        }
    }
}
