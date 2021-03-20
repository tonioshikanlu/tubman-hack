package e.a.a.a.y0.a.p;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.a.o.b;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.a.a.a.y0.f.f;
import e.c0.h;
import e.x.c.i;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class c {
    public static final String a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f7712b;
    public static final String c;
    public static final String d;

    /* renamed from: e  reason: collision with root package name */
    public static final e.a.a.a.y0.f.a f7713e;
    public static final b f;

    /* renamed from: g  reason: collision with root package name */
    public static final e.a.a.a.y0.f.a f7714g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.a> f7715h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.a> f7716i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<e.a.a.a.y0.f.c, b> f7717j = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap<e.a.a.a.y0.f.c, b> f7718k = new HashMap<>();

    /* renamed from: l  reason: collision with root package name */
    public static final List<a> f7719l;

    /* renamed from: m  reason: collision with root package name */
    public static final c f7720m;

    public static final class a {
        public final e.a.a.a.y0.f.a a;

        /* renamed from: b  reason: collision with root package name */
        public final e.a.a.a.y0.f.a f7721b;
        public final e.a.a.a.y0.f.a c;

        public a(e.a.a.a.y0.f.a aVar, e.a.a.a.y0.f.a aVar2, e.a.a.a.y0.f.a aVar3) {
            i.e(aVar, "javaClass");
            i.e(aVar2, "kotlinReadOnly");
            i.e(aVar3, "kotlinMutable");
            this.a = aVar;
            this.f7721b = aVar2;
            this.c = aVar3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.f7721b, aVar.f7721b) && i.a(this.c, aVar.c);
        }

        public int hashCode() {
            e.a.a.a.y0.f.a aVar = this.a;
            int i2 = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            e.a.a.a.y0.f.a aVar2 = this.f7721b;
            int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            e.a.a.a.y0.f.a aVar3 = this.c;
            if (aVar3 != null) {
                i2 = aVar3.hashCode();
            }
            return hashCode2 + i2;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("PlatformMutabilityMapping(javaClass=");
            y.append(this.a);
            y.append(", kotlinReadOnly=");
            y.append(this.f7721b);
            y.append(", kotlinMutable=");
            y.append(this.c);
            y.append(")");
            return y.toString();
        }
    }

    static {
        c cVar = new c();
        f7720m = cVar;
        StringBuilder sb = new StringBuilder();
        b.c cVar2 = b.c.Function;
        sb.append(cVar2.f7707h.toString());
        sb.append(".");
        sb.append(cVar2.f7708i);
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        b.c cVar3 = b.c.KFunction;
        sb2.append(cVar3.f7707h.toString());
        sb2.append(".");
        sb2.append(cVar3.f7708i);
        f7712b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        b.c cVar4 = b.c.SuspendFunction;
        sb3.append(cVar4.f7707h.toString());
        sb3.append(".");
        sb3.append(cVar4.f7708i);
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        b.c cVar5 = b.c.KSuspendFunction;
        sb4.append(cVar5.f7707h.toString());
        sb4.append(".");
        sb4.append(cVar5.f7708i);
        d = sb4.toString();
        e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b("kotlin.jvm.functions.FunctionN"));
        i.d(l2, "ClassId.topLevel(FqName(…vm.functions.FunctionN\"))");
        f7713e = l2;
        e.a.a.a.y0.f.b b2 = l2.b();
        i.d(b2, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f = b2;
        e.a.a.a.y0.f.a l3 = e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b("kotlin.reflect.KFunction"));
        i.d(l3, "ClassId.topLevel(FqName(…tlin.reflect.KFunction\"))");
        f7714g = l3;
        g.d dVar = g.f7647k;
        e.a.a.a.y0.f.a l4 = e.a.a.a.y0.f.a.l(dVar.H);
        i.d(l4, "ClassId.topLevel(FQ_NAMES.iterable)");
        e.a.a.a.y0.f.b bVar = dVar.P;
        i.d(bVar, "FQ_NAMES.mutableIterable");
        e.a.a.a.y0.f.b h2 = l4.h();
        e.a.a.a.y0.f.b h3 = l4.h();
        i.d(h3, "kotlinReadOnly.packageFqName");
        e.a.a.a.y0.f.b b3 = b.q.a.a.b3(bVar, h3);
        e.a.a.a.y0.f.a aVar = new e.a.a.a.y0.f.a(h2, b3, false);
        e.a.a.a.y0.f.a l5 = e.a.a.a.y0.f.a.l(dVar.G);
        i.d(l5, "ClassId.topLevel(FQ_NAMES.iterator)");
        e.a.a.a.y0.f.b bVar2 = dVar.O;
        i.d(bVar2, "FQ_NAMES.mutableIterator");
        e.a.a.a.y0.f.b h4 = l5.h();
        e.a.a.a.y0.f.b h5 = l5.h();
        i.d(h5, "kotlinReadOnly.packageFqName");
        e.a.a.a.y0.f.a aVar2 = new e.a.a.a.y0.f.a(h4, b.q.a.a.b3(bVar2, h5), false);
        e.a.a.a.y0.f.a l6 = e.a.a.a.y0.f.a.l(dVar.I);
        i.d(l6, "ClassId.topLevel(FQ_NAMES.collection)");
        e.a.a.a.y0.f.b bVar3 = dVar.Q;
        i.d(bVar3, "FQ_NAMES.mutableCollection");
        e.a.a.a.y0.f.b h6 = l6.h();
        e.a.a.a.y0.f.b h7 = l6.h();
        i.d(h7, "kotlinReadOnly.packageFqName");
        e.a.a.a.y0.f.a aVar3 = new e.a.a.a.y0.f.a(h6, b.q.a.a.b3(bVar3, h7), false);
        e.a.a.a.y0.f.a l7 = e.a.a.a.y0.f.a.l(dVar.J);
        i.d(l7, "ClassId.topLevel(FQ_NAMES.list)");
        e.a.a.a.y0.f.b bVar4 = dVar.R;
        i.d(bVar4, "FQ_NAMES.mutableList");
        e.a.a.a.y0.f.b h8 = l7.h();
        e.a.a.a.y0.f.b h9 = l7.h();
        i.d(h9, "kotlinReadOnly.packageFqName");
        e.a.a.a.y0.f.a aVar4 = new e.a.a.a.y0.f.a(h8, b.q.a.a.b3(bVar4, h9), false);
        e.a.a.a.y0.f.a l8 = e.a.a.a.y0.f.a.l(dVar.L);
        i.d(l8, "ClassId.topLevel(FQ_NAMES.set)");
        e.a.a.a.y0.f.b bVar5 = dVar.T;
        i.d(bVar5, "FQ_NAMES.mutableSet");
        e.a.a.a.y0.f.b h10 = l8.h();
        e.a.a.a.y0.f.b h11 = l8.h();
        i.d(h11, "kotlinReadOnly.packageFqName");
        e.a.a.a.y0.f.a aVar5 = new e.a.a.a.y0.f.a(h10, b.q.a.a.b3(bVar5, h11), false);
        e.a.a.a.y0.f.a l9 = e.a.a.a.y0.f.a.l(dVar.K);
        i.d(l9, "ClassId.topLevel(FQ_NAMES.listIterator)");
        e.a.a.a.y0.f.b bVar6 = dVar.S;
        i.d(bVar6, "FQ_NAMES.mutableListIterator");
        e.a.a.a.y0.f.b h12 = l9.h();
        e.a.a.a.y0.f.b h13 = l9.h();
        i.d(h13, "kotlinReadOnly.packageFqName");
        e.a.a.a.y0.f.a aVar6 = new e.a.a.a.y0.f.a(h12, b.q.a.a.b3(bVar6, h13), false);
        e.a.a.a.y0.f.a l10 = e.a.a.a.y0.f.a.l(dVar.M);
        i.d(l10, "ClassId.topLevel(FQ_NAMES.map)");
        e.a.a.a.y0.f.b bVar7 = dVar.U;
        i.d(bVar7, "FQ_NAMES.mutableMap");
        e.a.a.a.y0.f.b h14 = l10.h();
        e.a.a.a.y0.f.b h15 = l10.h();
        i.d(h15, "kotlinReadOnly.packageFqName");
        e.a.a.a.y0.f.a aVar7 = new e.a.a.a.y0.f.a(h14, b.q.a.a.b3(bVar7, h15), false);
        e.a.a.a.y0.f.a d2 = e.a.a.a.y0.f.a.l(dVar.M).d(dVar.N.g());
        i.d(d2, "ClassId.topLevel(FQ_NAME…MES.mapEntry.shortName())");
        e.a.a.a.y0.f.b bVar8 = dVar.V;
        i.d(bVar8, "FQ_NAMES.mutableMapEntry");
        e.a.a.a.y0.f.b h16 = d2.h();
        e.a.a.a.y0.f.b h17 = d2.h();
        i.d(h17, "kotlinReadOnly.packageFqName");
        List<a> B = e.t.g.B(new a(cVar.d(Iterable.class), l4, aVar), new a(cVar.d(Iterator.class), l5, aVar2), new a(cVar.d(Collection.class), l6, aVar3), new a(cVar.d(List.class), l7, aVar4), new a(cVar.d(Set.class), l8, aVar5), new a(cVar.d(ListIterator.class), l9, aVar6), new a(cVar.d(Map.class), l10, aVar7), new a(cVar.d(Map.Entry.class), d2, new e.a.a.a.y0.f.a(h16, b.q.a.a.b3(bVar8, h17), false)));
        f7719l = B;
        e.a.a.a.y0.f.c cVar6 = dVar.a;
        i.d(cVar6, "FQ_NAMES.any");
        cVar.c(Object.class, cVar6);
        e.a.a.a.y0.f.c cVar7 = dVar.f;
        i.d(cVar7, "FQ_NAMES.string");
        cVar.c(String.class, cVar7);
        e.a.a.a.y0.f.c cVar8 = dVar.f7654e;
        i.d(cVar8, "FQ_NAMES.charSequence");
        cVar.c(CharSequence.class, cVar8);
        e.a.a.a.y0.f.b bVar9 = dVar.r;
        i.d(bVar9, "FQ_NAMES.throwable");
        e.a.a.a.y0.f.a d3 = cVar.d(Throwable.class);
        e.a.a.a.y0.f.a l11 = e.a.a.a.y0.f.a.l(bVar9);
        i.d(l11, "ClassId.topLevel(kotlinFqName)");
        cVar.a(d3, l11);
        e.a.a.a.y0.f.c cVar9 = dVar.c;
        i.d(cVar9, "FQ_NAMES.cloneable");
        cVar.c(Cloneable.class, cVar9);
        e.a.a.a.y0.f.c cVar10 = dVar.f7664p;
        i.d(cVar10, "FQ_NAMES.number");
        cVar.c(Number.class, cVar10);
        e.a.a.a.y0.f.b bVar10 = dVar.s;
        i.d(bVar10, "FQ_NAMES.comparable");
        e.a.a.a.y0.f.a d4 = cVar.d(Comparable.class);
        e.a.a.a.y0.f.a l12 = e.a.a.a.y0.f.a.l(bVar10);
        i.d(l12, "ClassId.topLevel(kotlinFqName)");
        cVar.a(d4, l12);
        e.a.a.a.y0.f.c cVar11 = dVar.f7665q;
        i.d(cVar11, "FQ_NAMES._enum");
        cVar.c(Enum.class, cVar11);
        e.a.a.a.y0.f.b bVar11 = dVar.y;
        i.d(bVar11, "FQ_NAMES.annotation");
        e.a.a.a.y0.f.a d5 = cVar.d(Annotation.class);
        e.a.a.a.y0.f.a l13 = e.a.a.a.y0.f.a.l(bVar11);
        i.d(l13, "ClassId.topLevel(kotlinFqName)");
        cVar.a(d5, l13);
        for (a next : B) {
            e.a.a.a.y0.f.a aVar8 = next.a;
            e.a.a.a.y0.f.a aVar9 = next.f7721b;
            e.a.a.a.y0.f.a aVar10 = next.c;
            cVar.a(aVar8, aVar9);
            e.a.a.a.y0.f.b b4 = aVar10.b();
            i.d(b4, "mutableClassId.asSingleFqName()");
            HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.a> hashMap = f7716i;
            e.a.a.a.y0.f.c j2 = b4.j();
            i.d(j2, "kotlinFqNameUnsafe.toUnsafe()");
            hashMap.put(j2, aVar8);
            e.a.a.a.y0.f.b b5 = aVar9.b();
            i.d(b5, "readOnlyClassId.asSingleFqName()");
            e.a.a.a.y0.f.b b6 = aVar10.b();
            i.d(b6, "mutableClassId.asSingleFqName()");
            HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.b> hashMap2 = f7717j;
            e.a.a.a.y0.f.c j3 = aVar10.b().j();
            i.d(j3, "mutableClassId.asSingleFqName().toUnsafe()");
            hashMap2.put(j3, b5);
            HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.b> hashMap3 = f7718k;
            e.a.a.a.y0.f.c j4 = b5.j();
            i.d(j4, "readOnlyFqName.toUnsafe()");
            hashMap3.put(j4, b6);
        }
        e.a.a.a.y0.j.w.c[] values = e.a.a.a.y0.j.w.c.values();
        for (int i2 = 0; i2 < 8; i2++) {
            e.a.a.a.y0.j.w.c cVar12 = values[i2];
            e.a.a.a.y0.f.a l14 = e.a.a.a.y0.f.a.l(cVar12.m());
            i.d(l14, "ClassId.topLevel(jvmType.wrapperFqName)");
            e.a.a.a.y0.f.a l15 = e.a.a.a.y0.f.a.l(g.t(cVar12.l()));
            i.d(l15, "ClassId.topLevel(KotlinB…e(jvmType.primitiveType))");
            cVar.a(l14, l15);
        }
        e.a.a.a.y0.a.c cVar13 = e.a.a.a.y0.a.c.f7640b;
        Set<T> unmodifiableSet = Collections.unmodifiableSet(e.a.a.a.y0.a.c.a);
        i.d(unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        for (T t : unmodifiableSet) {
            StringBuilder y = b.e.a.a.a.y("kotlin.jvm.internal.");
            y.append(t.j().e());
            y.append("CompanionObject");
            e.a.a.a.y0.f.a l16 = e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b(y.toString()));
            i.d(l16, "ClassId.topLevel(FqName(…g() + \"CompanionObject\"))");
            e.a.a.a.y0.f.a d6 = t.d(f.f9212b);
            i.d(d6, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar.a(l16, d6);
        }
        for (int i3 = 0; i3 < 23; i3++) {
            e.a.a.a.y0.f.a l17 = e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b(b.e.a.a.a.g("kotlin.jvm.functions.Function", i3)));
            i.d(l17, "ClassId.topLevel(FqName(…m.functions.Function$i\"))");
            e.a.a.a.y0.f.a aVar11 = new e.a.a.a.y0.f.a(g.f, d.l(g.m(i3)));
            i.d(aVar11, "KotlinBuiltIns.getFunctionClassId(i)");
            cVar.a(l17, aVar11);
            cVar.b(new e.a.a.a.y0.f.b(f7712b + i3), f7714g);
        }
        for (int i4 = 0; i4 < 22; i4++) {
            b.c cVar14 = b.c.KSuspendFunction;
            cVar.b(new e.a.a.a.y0.f.b(b.e.a.a.a.g(cVar14.f7707h.toString() + "." + cVar14.f7708i, i4)), f7714g);
        }
        e.a.a.a.y0.f.b i5 = g.f7647k.f7653b.i();
        i.d(i5, "FQ_NAMES.nothing.toSafe()");
        e.a.a.a.y0.f.a d7 = cVar.d(Void.class);
        HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.a> hashMap4 = f7716i;
        e.a.a.a.y0.f.c j5 = i5.j();
        i.d(j5, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap4.put(j5, d7);
    }

    public static e k(c cVar, e.a.a.a.y0.f.b bVar, g gVar, Integer num, int i2) {
        int i3 = i2 & 4;
        Objects.requireNonNull(cVar);
        i.e(bVar, "fqName");
        i.e(gVar, "builtIns");
        e.a.a.a.y0.f.a j2 = cVar.j(bVar);
        if (j2 != null) {
            return gVar.i(j2.b());
        }
        return null;
    }

    public final void a(e.a.a.a.y0.f.a aVar, e.a.a.a.y0.f.a aVar2) {
        HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.a> hashMap = f7715h;
        e.a.a.a.y0.f.c j2 = aVar.b().j();
        i.d(j2, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(j2, aVar2);
        e.a.a.a.y0.f.b b2 = aVar2.b();
        i.d(b2, "kotlinClassId.asSingleFqName()");
        HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.a> hashMap2 = f7716i;
        e.a.a.a.y0.f.c j3 = b2.j();
        i.d(j3, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap2.put(j3, aVar);
    }

    public final void b(e.a.a.a.y0.f.b bVar, e.a.a.a.y0.f.a aVar) {
        HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.a> hashMap = f7716i;
        e.a.a.a.y0.f.c j2 = bVar.j();
        i.d(j2, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(j2, aVar);
    }

    public final void c(Class<?> cls, e.a.a.a.y0.f.c cVar) {
        e.a.a.a.y0.f.b i2 = cVar.i();
        i.d(i2, "kotlinFqName.toSafe()");
        e.a.a.a.y0.f.a d2 = d(cls);
        e.a.a.a.y0.f.a l2 = e.a.a.a.y0.f.a.l(i2);
        i.d(l2, "ClassId.topLevel(kotlinFqName)");
        a(d2, l2);
    }

    public final e.a.a.a.y0.f.a d(Class<?> cls) {
        e.a.a.a.y0.f.a aVar;
        String str;
        if (!cls.isPrimitive()) {
            boolean isArray = cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            aVar = e.a.a.a.y0.f.a.l(new e.a.a.a.y0.f.b(cls.getCanonicalName()));
            str = "ClassId.topLevel(FqName(clazz.canonicalName))";
        } else {
            aVar = d(declaringClass).d(d.l(cls.getSimpleName()));
            str = "classId(outer).createNes…tifier(clazz.simpleName))";
        }
        i.d(aVar, str);
        return aVar;
    }

    public final e e(e eVar) {
        i.e(eVar, "readOnly");
        return f(eVar, f7718k, "read-only");
    }

    public final e f(e eVar, Map<e.a.a.a.y0.f.c, e.a.a.a.y0.f.b> map, String str) {
        e.a.a.a.y0.f.b bVar = map.get(e.a.a.a.y0.j.g.g(eVar));
        if (bVar != null) {
            e i2 = e.a.a.a.y0.j.v.b.f(eVar).i(bVar);
            i.d(i2, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return i2;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + str + " collection");
    }

    public final boolean g(e.a.a.a.y0.f.c cVar, String str) {
        String b2 = cVar.b();
        i.d(b2, "kotlinFqName.asString()");
        String E = h.E(b2, str, "");
        if (E.length() > 0) {
            i.e(E, "$this$startsWith");
            if (!(E.length() > 0 && e.a.a.a.y0.m.o1.c.y(E.charAt(0), '0', false))) {
                Integer K = h.K(E);
                if (K == null || K.intValue() < 23) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean h(e eVar) {
        i.e(eVar, "mutable");
        e.a.a.a.y0.f.c g2 = e.a.a.a.y0.j.g.g(eVar);
        HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.b> hashMap = f7717j;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return hashMap.containsKey(g2);
    }

    public final boolean i(e eVar) {
        i.e(eVar, "readOnly");
        e.a.a.a.y0.f.c g2 = e.a.a.a.y0.j.g.g(eVar);
        HashMap<e.a.a.a.y0.f.c, e.a.a.a.y0.f.b> hashMap = f7718k;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return hashMap.containsKey(g2);
    }

    public final e.a.a.a.y0.f.a j(e.a.a.a.y0.f.b bVar) {
        i.e(bVar, "fqName");
        return f7715h.get(bVar.j());
    }

    public final e.a.a.a.y0.f.a l(e.a.a.a.y0.f.c cVar) {
        i.e(cVar, "kotlinFqName");
        return (!g(cVar, a) && !g(cVar, c)) ? (!g(cVar, f7712b) && !g(cVar, d)) ? f7716i.get(cVar) : f7714g : f7713e;
    }
}
