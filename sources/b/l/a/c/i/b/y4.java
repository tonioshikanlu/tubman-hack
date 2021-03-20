package b.l.a.c.i.b;

import java.util.concurrent.Callable;

public final class y4 implements Callable<byte[]> {
    public final /* synthetic */ s a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f4379b;
    public final /* synthetic */ e5 c;

    public y4(e5 e5Var, s sVar, String str) {
        this.c = e5Var;
        this.a = sVar;
        this.f4379b = str;
    }

    public final Object call() {
        this.c.a.n();
        d9 d9Var = this.c.a;
        d9.I(d9Var.f3977h);
        d9Var.f3977h.h();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
