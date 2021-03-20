package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

public final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    private final LinearLayoutManager mLayoutManager;
    private ViewPager2.PageTransformer mPageTransformer;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    public ViewPager2.PageTransformer getPageTransformer() {
        return this.mPageTransformer;
    }

    public void onPageScrollStateChanged(int i2) {
    }

    public void onPageScrolled(int i2, float f, int i3) {
        if (this.mPageTransformer != null) {
            float f2 = -f;
            int i4 = 0;
            while (i4 < this.mLayoutManager.getChildCount()) {
                View childAt = this.mLayoutManager.getChildAt(i4);
                if (childAt != null) {
                    this.mPageTransformer.transformPage(childAt, ((float) (this.mLayoutManager.getPosition(childAt) - i2)) + f2);
                    i4++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i4), Integer.valueOf(this.mLayoutManager.getChildCount())}));
                }
            }
        }
    }

    public void onPageSelected(int i2) {
    }

    public void setPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        this.mPageTransformer = pageTransformer;
    }
}
