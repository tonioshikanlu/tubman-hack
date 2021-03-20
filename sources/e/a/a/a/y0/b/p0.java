package e.a.a.a.y0.b;

import e.a.a.a.y0.m.d0;
import e.a.a.a.y0.m.v0;
import e.r;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;

public interface p0 {

    public static final class a implements p0 {
        public static final a a = new a();

        public Collection<d0> a(v0 v0Var, Collection<? extends d0> collection, l<? super v0, ? extends Iterable<? extends d0>> lVar, l<? super d0, r> lVar2) {
            i.e(v0Var, "currentTypeConstructor");
            i.e(collection, "superTypes");
            i.e(lVar, "neighbors");
            i.e(lVar2, "reportLoop");
            return collection;
        }
    }

    Collection<d0> a(v0 v0Var, Collection<? extends d0> collection, l<? super v0, ? extends Iterable<? extends d0>> lVar, l<? super d0, r> lVar2);
}
