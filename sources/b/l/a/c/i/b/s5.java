package b.l.a.c.i.b;

import android.os.Bundle;

public final class s5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f4255h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f4256i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f4257j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Bundle f4258k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f4259l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f4260m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ boolean f4261n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ String f4262o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ m6 f4263p;

    public s5(m6 m6Var, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f4263p = m6Var;
        this.f4255h = str;
        this.f4256i = str2;
        this.f4257j = j2;
        this.f4258k = bundle;
        this.f4259l = z;
        this.f4260m = z2;
        this.f4261n = z3;
        this.f4262o = str3;
    }

    public final void run() {
        this.f4263p.C(this.f4255h, this.f4256i, this.f4257j, this.f4258k, this.f4259l, this.f4260m, this.f4261n, this.f4262o);
    }
}
