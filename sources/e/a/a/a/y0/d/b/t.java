package e.a.a.a.y0.d.b;

import b.e.a.a.a;
import e.a.a.a.y0.b.e;
import e.a.a.a.y0.m.d0;
import e.t.g;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;

public final class t implements s<h> {
    public static final t a = new t();

    public String a(e eVar) {
        i.e(eVar, "classDescriptor");
        return null;
    }

    public d0 b(d0 d0Var) {
        i.e(d0Var, "kotlinType");
        i.e(d0Var, "kotlinType");
        return null;
    }

    public boolean c() {
        return true;
    }

    public Object d(e eVar) {
        i.e(eVar, "classDescriptor");
        return null;
    }

    public String e(e eVar) {
        i.e(eVar, "classDescriptor");
        i.e(eVar, "classDescriptor");
        return null;
    }

    public void f(d0 d0Var, e eVar) {
        i.e(d0Var, "kotlinType");
        i.e(eVar, "descriptor");
    }

    public d0 g(Collection<? extends d0> collection) {
        i.e(collection, "types");
        StringBuilder y = a.y("There should be no intersection type in existing descriptors, but found: ");
        y.append(g.x(collection, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63));
        throw new AssertionError(y.toString());
    }
}
