package b.j.a.c.d0;

import b.j.a.c.e0.a;
import b.j.a.c.e0.l;
import b.j.a.c.e0.m;
import b.j.a.c.j;
import b.j.a.c.n;
import b.j.a.c.t;
import java.beans.ConstructorProperties;
import java.beans.Transient;
import java.nio.file.Path;

public class b extends a {
    public b() {
        Class<Transient> cls = Transient.class;
        Class<ConstructorProperties> cls2 = ConstructorProperties.class;
    }

    public t a(l lVar) {
        ConstructorProperties c;
        m mVar = lVar.f1923j;
        if (mVar == null || (c = mVar.c(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] value = c.value();
        int i2 = lVar.f1925l;
        if (i2 < value.length) {
            return t.a(value[i2]);
        }
        return null;
    }

    public Boolean b(a aVar) {
        Transient c = aVar.c(Transient.class);
        if (c != null) {
            return Boolean.valueOf(c.value());
        }
        return null;
    }

    public j<?> c(Class<?> cls) {
        if (cls == Path.class) {
            return new c();
        }
        return null;
    }

    public n<?> d(Class<?> cls) {
        if (Path.class.isAssignableFrom(cls)) {
            return new d();
        }
        return null;
    }

    public Boolean e(a aVar) {
        if (aVar.c(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
