package e.x.c;

import e.a.e;
import e.t.g;
import e.x.b.b;
import e.x.b.c;
import e.x.b.f;
import e.x.b.h;
import e.x.b.i;
import e.x.b.j;
import e.x.b.k;
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
import e.x.b.v;
import e.x.b.w;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class d implements e<Object>, c {

    /* renamed from: i  reason: collision with root package name */
    public static final Map<Class<? extends Object<?>>, Integer> f7978i;

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, String> f7979j;

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap<String, String> f7980k;

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<String, String> f7981l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f7982m = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f7983h;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = 0;
        List B = g.B(e.x.b.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, c.class, e.x.b.d.class, e.x.b.e.class, f.class, e.x.b.g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(b.q.a.a.C(B, 10));
        for (Object next : B) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new e.j((Class) next, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                g.S();
                throw null;
            }
        }
        f7978i = g.X(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f7979j = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f7980k = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        i.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            i.d(str, "kotlinName");
            sb.append(e.c0.h.H(str, '.', (String) null, 2));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            hashMap3.put(sb2, str + ".Companion");
        }
        for (Map.Entry next2 : f7978i.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f7981l = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.q.a.a.q2(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), e.c0.h.H((String) entry.getValue(), '.', (String) null, 2));
        }
    }

    public d(Class<?> cls) {
        i.e(cls, "jClass");
        this.f7983h = cls;
    }

    public boolean c() {
        throw new e.x.a();
    }

    public Class<?> e() {
        return this.f7983h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && i.a(b.q.a.a.O0(this), b.q.a.a.O0((e) obj));
    }

    public int hashCode() {
        return b.q.a.a.O0(this).hashCode();
    }

    public List<Annotation> k() {
        throw new e.x.a();
    }

    public boolean t() {
        throw new e.x.a();
    }

    public String toString() {
        return this.f7983h.toString() + " (Kotlin reflection is not available)";
    }

    public String v() {
        String str;
        Class<?> cls = this.f7983h;
        i.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = f7981l.get(componentType.getName())) != null) {
                str2 = b.e.a.a.a.m(str, "Array");
            }
            if (str2 != null) {
                return str2;
            }
            return "kotlin.Array";
        }
        String str3 = f7981l.get(cls.getName());
        return str3 != null ? str3 : cls.getCanonicalName();
    }

    public boolean w() {
        throw new e.x.a();
    }

    public Object y() {
        throw new e.x.a();
    }
}
