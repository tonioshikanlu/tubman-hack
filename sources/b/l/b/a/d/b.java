package b.l.b.a.d;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public final class b {
    public final Map<String, a> a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Field, a> f4778b = new a();
    public final Object c;

    public static class a {
        public final Class<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<Object> f4779b = new ArrayList<>();

        public a(Class<?> cls) {
            this.a = cls;
        }
    }

    public b(Object obj) {
        this.c = obj;
    }

    public void a(Field field, Class<?> cls, Object obj) {
        a aVar = this.f4778b.get(field);
        if (aVar == null) {
            aVar = new a(cls);
            this.f4778b.put(field, aVar);
        }
        b.l.a.c.b.a.q(cls == aVar.a);
        aVar.f4779b.add(obj);
    }

    public void b() {
        for (Map.Entry next : this.a.entrySet()) {
            Object key = next.getKey();
            a aVar = (a) next.getValue();
            ((Map) this.c).put(key, l.o(aVar.f4779b, aVar.a));
        }
        for (Map.Entry next2 : this.f4778b.entrySet()) {
            Object obj = this.c;
            a aVar2 = (a) next2.getValue();
            j.e((Field) next2.getKey(), obj, l.o(aVar2.f4779b, aVar2.a));
        }
    }
}
