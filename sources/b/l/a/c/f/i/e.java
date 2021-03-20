package b.l.a.c.f.i;

import android.app.Activity;
import b.l.a.c.d.d;

public final class e extends v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Activity f3521l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f3522m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f3523n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ f0 f3524o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f0 f0Var, Activity activity, String str, String str2) {
        super(f0Var, true);
        this.f3524o = f0Var;
        this.f3521l = activity;
        this.f3522m = str;
        this.f3523n = str2;
    }

    public final void a() {
        this.f3524o.f3550h.setCurrentScreen(new d(this.f3521l), this.f3522m, this.f3523n, this.f3776h);
    }
}
