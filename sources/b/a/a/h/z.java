package b.a.a.h;

import android.animation.Animator;
import androidx.viewpager2.widget.ViewPager2;

public final class z implements Animator.AnimatorListener {
    public final /* synthetic */ ViewPager2 a;

    public z(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endFakeDrag();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.a.beginFakeDrag();
    }
}
