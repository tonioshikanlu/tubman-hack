package b.l.a.c.f.i;

import android.app.Activity;
import b.l.a.c.d.d;

public final class b0 extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Activity f3493l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e0 f3494m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, Activity activity) {
        super(e0Var.f3525h, true);
        this.f3494m = e0Var;
        this.f3493l = activity;
    }

    public final void a() {
        this.f3494m.f3525h.f3550h.onActivityStopped(new d(this.f3493l), this.f3777i);
    }
}
