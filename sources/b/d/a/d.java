package b.d.a;

import android.view.View;
import android.view.ViewTreeObserver;
import e.x.c.i;

public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f383h;

    public d(f fVar) {
        this.f383h = fVar;
    }

    public boolean onPreDraw() {
        if (this.f383h.e().getHeight() <= 0) {
            return true;
        }
        this.f383h.e().getViewTreeObserver().removeOnPreDrawListener(this);
        int height = this.f383h.e().getHeight();
        View view = this.f383h.f384h;
        if (view == null) {
            i.m("sheetTouchOutsideContainer");
            throw null;
        } else if (height != view.getHeight()) {
            return true;
        } else {
            this.f383h.f(0.0f);
            f fVar = this.f383h;
            if (!fVar.r) {
                return true;
            }
            fVar.e().setCornerRadius$lib_release(0.0f);
            return true;
        }
    }
}
