package b.l.a.c.c;

import java.util.concurrent.Callable;

public final class e0 extends c0 {

    /* renamed from: e  reason: collision with root package name */
    public final Callable<String> f2598e;

    public e0(Callable callable, f0 f0Var) {
        super(false, (String) null, (Throwable) null);
        this.f2598e = callable;
    }

    public final String a() {
        try {
            return this.f2598e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
