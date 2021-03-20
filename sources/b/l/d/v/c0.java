package b.l.d.v;

import android.content.Intent;

public final class c0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Intent f5305h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Intent f5306i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e0 f5307j;

    public c0(e0 e0Var, Intent intent, Intent intent2) {
        this.f5307j = e0Var;
        this.f5305h = intent;
        this.f5306i = intent2;
    }

    public final void run() {
        this.f5307j.c(this.f5305h);
        this.f5307j.a(this.f5306i);
    }
}
