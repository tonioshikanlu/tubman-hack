package b.l.b.a.d;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class e {
    public static final ConcurrentMap<Class<?>, e> d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentMap<Class<?>, e> f4782e = new ConcurrentHashMap();
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final IdentityHashMap<String, j> f4783b = new IdentityHashMap<>();
    public final List<String> c;

    public class a implements Comparator<String> {
        public a(e eVar) {
        }

        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (b.l.a.c.b.a.U(str, str2)) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    public e(Class<?> cls, boolean z) {
        Field field;
        this.a = z;
        b.l.a.c.b.a.o(!z || !cls.isEnum(), "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new a(this));
        for (Field field2 : cls.getDeclaredFields()) {
            j d2 = j.d(field2);
            if (d2 != null) {
                String str = d2.d;
                str = z ? str.toLowerCase(Locale.US).intern() : str;
                j jVar = this.f4783b.get(str);
                boolean z2 = jVar == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = str;
                objArr[2] = field2;
                if (jVar == null) {
                    field = null;
                } else {
                    field = jVar.f4812b;
                }
                objArr[3] = field;
                b.l.a.c.b.a.p(z2, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.f4783b.put(str, d2);
                treeSet.add(str);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            e c2 = c(superclass, z);
            treeSet.addAll(c2.c);
            for (Map.Entry next : c2.f4783b.entrySet()) {
                String str2 = (String) next.getKey();
                if (!this.f4783b.containsKey(str2)) {
                    this.f4783b.put(str2, next.getValue());
                }
            }
        }
        this.c = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static e b(Class<?> cls) {
        return c(cls, false);
    }

    public static e c(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, e> concurrentMap = z ? f4782e : d;
        e eVar = (e) concurrentMap.get(cls);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(cls, z);
        e putIfAbsent = concurrentMap.putIfAbsent(cls, eVar2);
        return putIfAbsent == null ? eVar2 : putIfAbsent;
    }

    public j a(String str) {
        if (str != null) {
            if (this.a) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.f4783b.get(str);
    }
}
