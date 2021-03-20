package b.o;

import android.animation.ValueAnimator;
import android.view.View;

public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    public s2(View view) {
        this.a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
