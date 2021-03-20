package b.l.a.c.i.b;

import android.os.RemoteException;
import b.l.a.c.f.i.t8;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class f7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4004h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p9 f4005i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b8 f4006j;

    public f7(b8 b8Var, AtomicReference atomicReference, p9 p9Var) {
        this.f4006j = b8Var;
        this.f4004h = atomicReference;
        this.f4005i = p9Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f4004h) {
            try {
                t8.b();
                if (!this.f4006j.a.f4114g.r((String) null, x2.w0) || this.f4006j.a.q().s().e()) {
                    b8 b8Var = this.f4006j;
                    a3 a3Var = b8Var.d;
                    if (a3Var == null) {
                        b8Var.a.a().f.a("Failed to get app instance id");
                        this.f4004h.notify();
                        return;
                    }
                    Objects.requireNonNull(this.f4005i, "null reference");
                    this.f4004h.set(a3Var.Q(this.f4005i));
                    String str = (String) this.f4004h.get();
                    if (str != null) {
                        this.f4006j.a.s().f4149g.set(str);
                        this.f4006j.a.q().f4359l.b(str);
                    }
                    this.f4006j.s();
                    atomicReference = this.f4004h;
                    atomicReference.notify();
                    return;
                }
                this.f4006j.a.a().f4093k.a("Analytics storage consent denied; will not get app instance id");
                this.f4006j.a.s().f4149g.set((Object) null);
                this.f4006j.a.q().f4359l.b((String) null);
                this.f4004h.set((Object) null);
                this.f4004h.notify();
            } catch (RemoteException e2) {
                try {
                    this.f4006j.a.a().f.b("Failed to get app instance id", e2);
                    atomicReference = this.f4004h;
                } catch (Throwable th) {
                    this.f4004h.notify();
                    throw th;
                }
            }
        }
    }
}
