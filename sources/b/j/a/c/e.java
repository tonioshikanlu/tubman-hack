package b.j.a.c;

import b.e.a.a.a;
import b.j.a.a.i0;
import b.j.a.a.l0;
import b.j.a.c.e0.y;
import b.j.a.c.i0.c;
import b.j.a.c.i0.n;
import b.j.a.c.j0.g;
import b.j.a.c.j0.j;
import java.lang.reflect.Type;
import java.util.Objects;

public abstract class e {
    public String a(String str, String str2) {
        return str2 == null ? str : a.n(str, ": ", str2);
    }

    public final String b(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public String c(String str) {
        if (str == null) {
            return "[N/A]";
        }
        Object[] objArr = new Object[1];
        if (str.length() > 500) {
            str = str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
        }
        objArr[0] = str;
        return String.format("\"%s\"", objArr);
    }

    public i d(i iVar, Class<?> cls) {
        if (iVar.f2152h == cls) {
            return iVar;
        }
        return g().f1609i.f1589k.k(iVar, cls);
    }

    public i e(Type type) {
        if (type == null) {
            return null;
        }
        return h().b((c) null, type, n.f2185l);
    }

    public j<Object, Object> f(b.j.a.c.e0.a aVar, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj instanceof Class) {
            Class<j.a> cls = (Class) obj;
            if (cls == j.a.class || g.t(cls)) {
                return null;
            }
            if (j.class.isAssignableFrom(cls)) {
                b.j.a.c.a0.g<?> g2 = g();
                Objects.requireNonNull(g2.f1609i);
                return (j) g.h(cls, g2.b());
            }
            throw new IllegalStateException(a.e(cls, a.y("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(a.f(obj, a.y("AnnotationIntrospector returned Converter definition of type "), "; expected type Converter or Class<Converter> instead"));
    }

    public abstract b.j.a.c.a0.g<?> g();

    public abstract n h();

    public abstract k i(i iVar, String str, String str2);

    public i0<?> j(b.j.a.c.e0.a aVar, y yVar) {
        Class<? extends i0<?>> cls = yVar.f1958b;
        b.j.a.c.a0.g<?> g2 = g();
        Objects.requireNonNull(g2.f1609i);
        return ((i0) g.h(cls, g2.b())).b(yVar.d);
    }

    public l0 k(b.j.a.c.e0.a aVar, y yVar) {
        Class<? extends l0> cls = yVar.c;
        b.j.a.c.a0.g<?> g2 = g();
        Objects.requireNonNull(g2.f1609i);
        return (l0) g.h(cls, g2.b());
    }

    public abstract <T> T l(i iVar, String str);

    public <T> T m(Class<?> cls, String str) {
        return l(e(cls), str);
    }
}
