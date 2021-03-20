package e.y;

import e.a.l;
import e.x.c.i;

public abstract class a<V> implements b<Object, V> {
    public V a;

    public a(V v) {
        this.a = v;
    }

    public void a(Object obj, l<?> lVar, V v) {
        i.e(lVar, "property");
        if (c(lVar, this.a, v)) {
            this.a = v;
            i.e(lVar, "property");
        }
    }

    public V b(Object obj, l<?> lVar) {
        i.e(lVar, "property");
        return this.a;
    }

    public boolean c(l<?> lVar, V v, V v2) {
        i.e(lVar, "property");
        return true;
    }
}
