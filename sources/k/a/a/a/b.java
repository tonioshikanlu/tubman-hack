package k.a.a.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class b extends AnimatorListenerAdapter {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.a();
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
    }
}
