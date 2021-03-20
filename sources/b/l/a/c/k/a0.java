package b.l.a.c.k;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class a0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f4418h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ z f4419i;

    public a0(z zVar, h hVar) {
        this.f4419i = zVar;
        this.f4418h = hVar;
    }

    public final void run() {
        try {
            h<TContinuationResult> a = this.f4419i.f4449b.a(this.f4418h.j());
            if (a == null) {
                z zVar = this.f4419i;
                zVar.c.p(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f4426b;
            a.e(executor, this.f4419i);
            a.d(executor, this.f4419i);
            a.a(executor, this.f4419i);
        } catch (f e2) {
            if (e2.getCause() instanceof Exception) {
                this.f4419i.c.p((Exception) e2.getCause());
                return;
            }
            this.f4419i.c.p(e2);
        } catch (CancellationException unused) {
            this.f4419i.c.r();
        } catch (Exception e3) {
            this.f4419i.c.p(e3);
        }
    }
}
