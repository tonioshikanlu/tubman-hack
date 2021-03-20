package l.a;

import java.util.logging.Level;
import java.util.logging.Logger;
import l.a.b;

public final class d extends b.f {
    public static final Logger a = Logger.getLogger(d.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<b> f8109b = new ThreadLocal<>();

    public b a() {
        b bVar = f8109b.get();
        return bVar == null ? b.f8099n : bVar;
    }

    public void b(b bVar, b bVar2) {
        ThreadLocal<b> threadLocal;
        if (a() != bVar) {
            a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (bVar2 != b.f8099n) {
            threadLocal = f8109b;
        } else {
            threadLocal = f8109b;
            bVar2 = null;
        }
        threadLocal.set(bVar2);
    }

    public b c(b bVar) {
        b a2 = a();
        f8109b.set(bVar);
        return a2;
    }
}
