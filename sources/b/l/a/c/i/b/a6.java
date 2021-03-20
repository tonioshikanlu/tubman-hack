package b.l.a.c.i.b;

import java.util.concurrent.atomic.AtomicReference;

public final class a6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3901h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f3902i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3903j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f3904k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ m6 f3905l;

    public a6(m6 m6Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f3905l = m6Var;
        this.f3901h = atomicReference;
        this.f3902i = str;
        this.f3903j = str2;
        this.f3904k = z;
    }

    public final void run() {
        b8 z = this.f3905l.a.z();
        AtomicReference atomicReference = this.f3901h;
        String str = this.f3902i;
        String str2 = this.f3903j;
        boolean z2 = this.f3904k;
        z.h();
        z.i();
        z.t(new t7(z, atomicReference, str, str2, z.v(false), z2));
    }
}
