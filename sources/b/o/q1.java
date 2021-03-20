package b.o;

import b.o.v4.a;
import b.o.v4.d;
import b.o.v4.j.b;

public class q1 implements t2 {
    public final /* synthetic */ b a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r1 f6240b;

    public q1(r1 r1Var, b bVar) {
        this.f6240b = r1Var;
        this.a = bVar;
    }

    public void a(String str) {
        d b2 = this.f6240b.f6266b.b();
        b bVar = this.a;
        a aVar = b2.f6333b;
        synchronized (aVar) {
            y2 y2Var = aVar.f6331b;
            ((z2) y2Var).b("outcome", "timestamp = ?", new String[]{String.valueOf(bVar.d)});
        }
    }

    public void b(int i2, String str, Throwable th) {
    }
}
