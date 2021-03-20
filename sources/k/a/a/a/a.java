package k.a.a.a;

import android.app.Activity;
import android.view.ViewTreeObserver;
import k.a.a.a.c;

public class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f8086h;

    public a(c cVar) {
        this.f8086h = cVar;
    }

    public boolean onPreDraw() {
        Activity activity = this.f8086h.f8090g;
        if (activity == null) {
            return true;
        }
        activity.getWindow().getDecorView().getViewTreeObserver().removeOnPreDrawListener(this);
        this.f8086h.c = new c.a((a) null);
        this.f8086h.c.execute(new Void[0]);
        return true;
    }
}
