package b.l.d.q.f.g;

import java.util.concurrent.Callable;

public class r implements Callable<Void> {
    public final /* synthetic */ long a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5118b;
    public final /* synthetic */ q c;

    public r(q qVar, long j2, String str) {
        this.c = qVar;
        this.a = j2;
        this.f5118b = str;
    }

    public Object call() {
        a0 a0Var = this.c.f5113n;
        if (a0Var != null && a0Var.d.get()) {
            return null;
        }
        this.c.f5108i.c.c(this.a, this.f5118b);
        return null;
    }
}
