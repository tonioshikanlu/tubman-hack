package b.l.a.c.f.i;

import android.app.Activity;
import b.l.a.c.d.d;

public final class y extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Activity f3811l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e0 f3812m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(e0 e0Var, Activity activity) {
        super(e0Var.f3525h, true);
        this.f3812m = e0Var;
        this.f3811l = activity;
    }

    public final void a() {
        this.f3812m.f3525h.f3550h.onActivityStarted(new d(this.f3811l), this.f3777i);
    }
}
