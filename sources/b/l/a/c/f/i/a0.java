package b.l.a.c.f.i;

import android.app.Activity;
import b.l.a.c.d.d;

public final class a0 extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Activity f3482l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e0 f3483m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(e0 e0Var, Activity activity) {
        super(e0Var.f3525h, true);
        this.f3483m = e0Var;
        this.f3482l = activity;
    }

    public final void a() {
        this.f3483m.f3525h.f3550h.onActivityPaused(new d(this.f3482l), this.f3777i);
    }
}
