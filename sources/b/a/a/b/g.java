package b.a.a.b;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.appfoundry.previewer.custom.DotIndicator;

public final class g extends ViewPager2.OnPageChangeCallback {
    public final /* synthetic */ DotIndicator a;

    public g(DotIndicator dotIndicator) {
        this.a = dotIndicator;
    }

    public void onPageSelected(int i2) {
        DotIndicator dotIndicator = this.a;
        int i3 = i2 % dotIndicator.x;
        ViewPager2 viewPager2 = dotIndicator.f7044h;
        if ((viewPager2 != null ? viewPager2.getAdapter() : null) != null) {
            DotIndicator dotIndicator2 = this.a;
            if (dotIndicator2.x > 0) {
                Animator animator = dotIndicator2.f7053q;
                if (animator != null && animator.isRunning()) {
                    Animator animator2 = this.a.f7053q;
                    if (animator2 != null) {
                        animator2.end();
                    }
                    Animator animator3 = this.a.f7053q;
                    if (animator3 != null) {
                        animator3.cancel();
                    }
                }
                Animator animator4 = this.a.f7052p;
                if (animator4 != null && animator4.isRunning()) {
                    Animator animator5 = this.a.f7052p;
                    if (animator5 != null) {
                        animator5.end();
                    }
                    Animator animator6 = this.a.f7052p;
                    if (animator6 != null) {
                        animator6.cancel();
                    }
                }
                DotIndicator dotIndicator3 = this.a;
                int i4 = dotIndicator3.w;
                if (i4 >= 0) {
                    View childAt = dotIndicator3.getChildAt(i4);
                    DotIndicator dotIndicator4 = this.a;
                    dotIndicator4.t = childAt;
                    if (childAt != null) {
                        childAt.setBackgroundResource(dotIndicator4.f7051o);
                        DotIndicator dotIndicator5 = this.a;
                        Animator animator7 = dotIndicator5.f7053q;
                        if (animator7 != null) {
                            animator7.setTarget(dotIndicator5.t);
                        }
                        Animator animator8 = this.a.f7053q;
                        if (animator8 != null) {
                            animator8.start();
                        }
                    }
                }
                DotIndicator dotIndicator6 = this.a;
                dotIndicator6.u = dotIndicator6.getChildAt(i3);
                DotIndicator dotIndicator7 = this.a;
                View view = dotIndicator7.u;
                if (view != null) {
                    view.setBackgroundResource(dotIndicator7.f7050n);
                    DotIndicator dotIndicator8 = this.a;
                    View view2 = dotIndicator8.u;
                    if (view2 != null) {
                        int i5 = dotIndicator8.v;
                        int[][] iArr = {new int[]{16842910}, new int[]{-16842910}, new int[]{-16842912}, new int[]{16842919}};
                        float alpha = ((float) Color.alpha(i5)) * 0.75f;
                        if (!Float.isNaN(alpha)) {
                            Color.argb(Math.round(alpha), Color.red(i5), Color.green(i5), Color.blue(i5));
                            view2.setBackgroundTintList(new ColorStateList(iArr, new int[]{i5, i5, i5, i5}));
                        } else {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                    }
                    DotIndicator dotIndicator9 = this.a;
                    Animator animator9 = dotIndicator9.f7052p;
                    if (animator9 != null) {
                        animator9.setTarget(dotIndicator9.u);
                    }
                    Animator animator10 = this.a.f7052p;
                    if (animator10 != null) {
                        animator10.start();
                    }
                }
                this.a.w = i3;
            }
        }
    }
}
