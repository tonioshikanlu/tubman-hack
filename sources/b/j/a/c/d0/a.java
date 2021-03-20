package b.j.a.c.d0;

import b.j.a.c.e0.l;
import b.j.a.c.j;
import b.j.a.c.j0.g;
import b.j.a.c.n;
import b.j.a.c.t;
import java.util.logging.Logger;

public abstract class a {
    public static final a a;

    static {
        a aVar;
        try {
            aVar = (a) g.h(Class.forName("b.j.a.c.d0.b"), false);
        } catch (Throwable unused) {
            Logger.getLogger(a.class.getName()).warning("Unable to load JDK7 types (annotations, java.nio.file.Path): no Java7 support added");
            aVar = null;
        }
        a = aVar;
    }

    public abstract t a(l lVar);

    public abstract Boolean b(b.j.a.c.e0.a aVar);

    public abstract j<?> c(Class<?> cls);

    public abstract n<?> d(Class<?> cls);

    public abstract Boolean e(b.j.a.c.e0.a aVar);
}
