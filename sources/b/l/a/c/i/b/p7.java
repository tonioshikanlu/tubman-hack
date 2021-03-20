package b.l.a.c.i.b;

import java.util.Objects;

public final class p7 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p9 f4214h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f4215i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s f4216j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b8 f4217k;

    public p7(b8 b8Var, p9 p9Var, boolean z, s sVar, String str) {
        this.f4217k = b8Var;
        this.f4214h = p9Var;
        this.f4215i = z;
        this.f4216j = sVar;
    }

    public final void run() {
        b8 b8Var = this.f4217k;
        a3 a3Var = b8Var.d;
        if (a3Var == null) {
            b8Var.a.a().f.a("Discarding data. Failed to send event to service");
            return;
        }
        Objects.requireNonNull(this.f4214h, "null reference");
        this.f4217k.x(a3Var, this.f4215i ? null : this.f4216j, this.f4214h);
        this.f4217k.s();
    }
}
