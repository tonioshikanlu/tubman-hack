package b.o;

import android.content.Context;

public final class m0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f6199h;

    public m0(Context context) {
        this.f6199h = context;
    }

    public void run() {
        Thread.currentThread().setPriority(10);
        n0.b(this.f6199h);
    }
}
