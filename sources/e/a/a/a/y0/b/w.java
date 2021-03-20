package e.a.a.a.y0.b;

import e.a.a.a.y0.a.g;
import e.a.a.a.y0.f.b;
import e.a.a.a.y0.f.d;
import e.x.b.l;
import e.x.c.i;
import java.util.Collection;
import java.util.List;

public interface w extends k {

    public static final class a<T> {
        public final String a;

        public a(String str) {
            i.e(str, "name");
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    <T> T E0(a<T> aVar);

    boolean I(w wVar);

    List<w> i0();

    b0 o0(b bVar);

    g v();

    Collection<b> y(b bVar, l<? super d, Boolean> lVar);
}
