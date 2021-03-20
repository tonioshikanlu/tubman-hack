package b.a.a.b.l;

import android.view.animation.Animation;
import androidx.core.view.ViewCompat;
import b.a.a.a.h;
import com.appfoundry.previewer.BravoApp;
import e.x.c.i;

public final class a implements Animation.AnimationListener {
    public float a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f162b;

    /* renamed from: b.a.a.b.l.a$a  reason: collision with other inner class name */
    public static final class C0011a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a f163h;

        public C0011a(a aVar) {
            this.f163h = aVar;
        }

        public final void run() {
            if (!this.f163h.f162b.isDetached()) {
                ViewCompat.setTranslationZ(this.f163h.f162b.d(), this.f163h.a);
            }
        }
    }

    public a(h hVar) {
        this.f162b = hVar;
    }

    public void onAnimationEnd(Animation animation) {
        i.e(animation, "animation");
        if (!this.f162b.isDetached()) {
            this.f162b.d().postDelayed(new C0011a(this), (long) 10);
        }
        BravoApp.b bVar = BravoApp.Q;
        BravoApp.J = false;
    }

    public void onAnimationRepeat(Animation animation) {
        i.e(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        i.e(animation, "animation");
        if (!this.f162b.isDetached()) {
            this.a = ViewCompat.getTranslationZ(this.f162b.d());
            ViewCompat.setTranslationZ(this.f162b.d(), 100.0f);
        }
    }
}
