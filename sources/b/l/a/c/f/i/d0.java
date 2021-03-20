package b.l.a.c.f.i;

import android.app.Activity;
import b.l.a.c.d.d;

public final class d0 extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Activity f3516l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e0 f3517m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, Activity activity) {
        super(e0Var.f3525h, true);
        this.f3517m = e0Var;
        this.f3516l = activity;
    }

    public final void a() {
        this.f3517m.f3525h.f3550h.onActivityDestroyed(new d(this.f3516l), this.f3777i);
    }
}
