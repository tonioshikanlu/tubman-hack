package b.l.a.c.f.i;

import android.os.Bundle;

public final class t extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Long f3745l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f3746m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f3747n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Bundle f3748o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f3749p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ boolean f3750q;
    public final /* synthetic */ f0 r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(f0 f0Var, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(f0Var, true);
        this.r = f0Var;
        this.f3745l = l2;
        this.f3746m = str;
        this.f3747n = str2;
        this.f3748o = bundle;
        this.f3749p = z;
        this.f3750q = z2;
    }

    public final void a() {
        Long l2 = this.f3745l;
        this.r.f3550h.logEvent(this.f3746m, this.f3747n, this.f3748o, this.f3749p, this.f3750q, l2 == null ? this.f3776h : l2.longValue());
    }
}
