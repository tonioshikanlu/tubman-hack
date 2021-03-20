package b.l.a.c.f.i;

import android.app.Activity;
import b.l.a.c.d.d;

public final class z extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Activity f3825l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e0 f3826m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, Activity activity) {
        super(e0Var.f3525h, true);
        this.f3826m = e0Var;
        this.f3825l = activity;
    }

    public final void a() {
        this.f3826m.f3525h.f3550h.onActivityResumed(new d(this.f3825l), this.f3777i);
    }
}
