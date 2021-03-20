package b.l.a.c.i.b;

import java.util.concurrent.atomic.AtomicReference;

public final class z5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4391h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4392i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f4393j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ m6 f4394k;

    public z5(m6 m6Var, AtomicReference atomicReference, String str, String str2) {
        this.f4394k = m6Var;
        this.f4391h = atomicReference;
        this.f4392i = str;
        this.f4393j = str2;
    }

    public final void run() {
        b8 z = this.f4394k.a.z();
        AtomicReference atomicReference = this.f4391h;
        String str = this.f4392i;
        String str2 = this.f4393j;
        z.h();
        z.i();
        z.t(new r7(z, atomicReference, str, str2, z.v(false)));
    }
}
