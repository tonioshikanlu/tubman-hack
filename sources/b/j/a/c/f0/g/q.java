package b.j.a.c.f0.g;

import b.j.a.c.a0.g;
import b.j.a.c.e;
import b.j.a.c.e0.p;
import b.j.a.c.i;
import b.j.a.c.i0.c;
import b.j.a.c.i0.n;
import java.util.Map;
import java.util.TreeSet;

public class q extends p {
    public final g<?> c;
    public final Map<String, String> d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, i> f1989e;

    public q(g<?> gVar, i iVar, Map<String, String> map, Map<String, i> map2) {
        super(iVar, gVar.f1609i.f1589k);
        this.c = gVar;
        this.d = map;
        this.f1989e = map2;
    }

    public static String g(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }

    public String a(Object obj, Class<?> cls) {
        return obj == null ? h(cls) : h(obj.getClass());
    }

    public String c(Object obj) {
        return h(obj.getClass());
    }

    public String d() {
        return new TreeSet(this.f1989e.keySet()).toString();
    }

    public i f(e eVar, String str) {
        return this.f1989e.get(str);
    }

    public String h(Class<?> cls) {
        String str;
        if (cls == null) {
            return null;
        }
        Class<?> cls2 = this.a.b((c) null, cls, n.f2185l).f2152h;
        String name = cls2.getName();
        synchronized (this.d) {
            str = this.d.get(name);
            if (str == null) {
                if (this.c.n()) {
                    str = this.c.e().X(((p) this.c.m(cls2)).f1937e);
                }
                if (str == null) {
                    str = g(cls2);
                }
                this.d.put(name, str);
            }
        }
        return str;
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", new Object[]{q.class.getName(), this.f1989e});
    }
}
