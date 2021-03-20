package b.a.a.d;

import android.widget.RelativeLayout;
import b.a.a.h.o;

public final class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f214h;

    public d(RelativeLayout relativeLayout) {
        this.f214h = relativeLayout;
    }

    public final void run() {
        RelativeLayout relativeLayout = this.f214h;
        if (relativeLayout != null) {
            o.e(relativeLayout);
        }
    }
}
