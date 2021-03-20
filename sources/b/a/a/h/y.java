package b.a.a.h;

import android.animation.ValueAnimator;
import androidx.viewpager2.widget.ViewPager2;
import e.x.c.i;
import e.x.c.s;
import java.util.Objects;

public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewPager2 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f306b;

    public y(ViewPager2 viewPager2, s sVar) {
        this.a = viewPager2;
        this.f306b = sVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        i.d(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        this.a.fakeDragBy(-((float) (intValue - this.f306b.f7987h)));
        this.f306b.f7987h = intValue;
    }
}
