package b.l.a.c.i.b;

import android.os.Bundle;

public final class v6 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ t6 f4314h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ t6 f4315i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f4316j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f4317k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ b7 f4318l;

    public v6(b7 b7Var, t6 t6Var, t6 t6Var2, long j2, boolean z) {
        this.f4318l = b7Var;
        this.f4314h = t6Var;
        this.f4315i = t6Var2;
        this.f4316j = j2;
        this.f4317k = z;
    }

    public final void run() {
        this.f4318l.m(this.f4314h, this.f4315i, this.f4316j, this.f4317k, (Bundle) null);
    }
}
