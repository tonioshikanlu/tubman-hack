package b.a.a.b.l;

import android.view.View;
import android.view.animation.Animation;
import androidx.core.view.ViewCompat;
import b.a.a.a.h;
import e.x.c.i;

public final class b implements Animation.AnimationListener {
    public float a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f164b;

    public static final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ b f165h;

        public a(b bVar) {
            this.f165h = bVar;
        }

        public final void run() {
            if (this.f165h.f164b.getView() != null && !this.f165h.f164b.isDetached()) {
                View view = this.f165h.f164b.getView();
                i.c(view);
                ViewCompat.setTranslationZ(view, this.f165h.a);
            }
        }
    }

    public b(h hVar) {
        this.f164b = hVar;
    }

    public void onAnimationEnd(Animation animation) {
        i.e(animation, "animation");
        if (this.f164b.getView() != null && !this.f164b.isDetached()) {
            View view = this.f164b.getView();
            i.c(view);
            view.postDelayed(new a(this), (long) 10);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        i.e(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        i.e(animation, "animation");
        if (this.f164b.getView() != null && !this.f164b.isDetached()) {
            View view = this.f164b.getView();
            i.c(view);
            this.a = ViewCompat.getTranslationZ(view);
            View view2 = this.f164b.getView();
            i.c(view2);
            ViewCompat.setTranslationZ(view2, 100.0f);
        }
    }
}
