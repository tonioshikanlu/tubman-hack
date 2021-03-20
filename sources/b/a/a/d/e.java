package b.a.a.d;

import android.widget.RelativeLayout;
import b.a.a.h.o;

public final class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f215h;

    public e(RelativeLayout relativeLayout) {
        this.f215h = relativeLayout;
    }

    public final void run() {
        RelativeLayout relativeLayout = this.f215h;
        if (relativeLayout != null) {
            o.e(relativeLayout);
        }
    }
}
