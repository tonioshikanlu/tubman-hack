package b.j.a.c.b0.z;

import b.j.a.c.i;
import b.j.a.c.i0.n;
import b.j.a.c.j0.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class k {
    public static final Class<?> a = Arrays.asList(new Object[]{null, null}).getClass();

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f1832b;
    public static final Class<?> c;
    public static final Class<?> d;

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?> f1833e;
    public static final Class<?> f;

    /* renamed from: g  reason: collision with root package name */
    public static final Class<?> f1834g;

    public static class b implements j<Object, Object> {
        public final i a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1835b;

        public b(int i2, i iVar, a aVar) {
            this.a = iVar;
            this.f1835b = i2;
        }

        public Object a(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f1835b) {
                case 1:
                    Set set = (Set) obj;
                    d(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    d(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    d(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                default:
                    return obj;
            }
        }

        public i b(n nVar) {
            return this.a;
        }

        public i c(n nVar) {
            return this.a;
        }

        public final void d(int i2) {
            if (i2 != 1) {
                throw new IllegalArgumentException(b.e.a.a.a.h("Can not deserialize Singleton container from ", i2, " entries"));
            }
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        Set singleton = Collections.singleton(bool);
        f1832b = singleton.getClass();
        f1833e = Collections.unmodifiableSet(singleton).getClass();
        List singletonList = Collections.singletonList(bool);
        c = singletonList.getClass();
        f = Collections.unmodifiableList(singletonList).getClass();
        Map singletonMap = Collections.singletonMap("a", "b");
        d = singletonMap.getClass();
        f1834g = Collections.unmodifiableMap(singletonMap).getClass();
    }
}
