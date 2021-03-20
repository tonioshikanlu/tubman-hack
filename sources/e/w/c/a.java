package e.w.c;

import e.x.c.i;

public class a extends e.w.a {
    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, "exception");
        th.addSuppressed(th2);
    }
}
