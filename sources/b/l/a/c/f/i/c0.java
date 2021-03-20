package b.l.a.c.f.i;

import android.app.Activity;
import b.l.a.c.d.d;

public final class c0 extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Activity f3504l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ r9 f3505m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ e0 f3506n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, Activity activity, r9 r9Var) {
        super(e0Var.f3525h, true);
        this.f3506n = e0Var;
        this.f3504l = activity;
        this.f3505m = r9Var;
    }

    public final void a() {
        this.f3506n.f3525h.f3550h.onActivitySaveInstanceState(new d(this.f3504l), this.f3505m, this.f3777i);
    }
}
