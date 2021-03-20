package b.l.a.c.c.m;

import android.app.Activity;
import android.content.Intent;

public final class x extends f {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Intent f2816h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f2817i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f2818j;

    public x(Intent intent, Activity activity, int i2) {
        this.f2816h = intent;
        this.f2817i = activity;
        this.f2818j = i2;
    }

    public final void a() {
        Intent intent = this.f2816h;
        if (intent != null) {
            this.f2817i.startActivityForResult(intent, this.f2818j);
        }
    }
}
