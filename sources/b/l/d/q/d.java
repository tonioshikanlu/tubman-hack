package b.l.d.q;

import b.l.a.c.k.i;
import b.l.d.q.f.g.p0;
import b.l.d.q.f.g.q0;
import b.l.d.q.f.g.u;
import b.l.d.q.f.g.v;
import b.l.d.q.f.m.e;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class d implements Callable<Void> {
    public final /* synthetic */ boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f5054b;
    public final /* synthetic */ e c;

    public d(boolean z, v vVar, e eVar) {
        this.a = z;
        this.f5054b = vVar;
        this.c = eVar;
    }

    public Object call() {
        if (!this.a) {
            return null;
        }
        v vVar = this.f5054b;
        e eVar = this.c;
        ExecutorService executorService = vVar.f5125j;
        u uVar = new u(vVar, eVar);
        ExecutorService executorService2 = q0.a;
        executorService.execute(new p0(uVar, new i()));
        return null;
    }
}
