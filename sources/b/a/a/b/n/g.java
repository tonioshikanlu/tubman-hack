package b.a.a.b.n;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import e.x.c.i;

public final class g implements ViewPager2.PageTransformer {
    public void transformPage(View view, float f) {
        float f2;
        i.e(view, "page");
        if (f >= ((float) -1) || f <= ((float) 1)) {
            float height = (float) view.getHeight();
            float width = (float) view.getWidth();
            float f3 = (float) 1;
            float max = Math.max(0.85f, f3 - Math.abs(f));
            float f4 = f3 - max;
            float f5 = (float) 2;
            float f6 = (height * f4) / f5;
            float f7 = (f4 * width) / f5;
            view.setPivotY(height * 0.5f);
            view.setPivotX(width * 0.5f);
            if (f < ((float) 0)) {
                f2 = f7 - (f6 / f5);
            } else {
                f2 = (f6 / f5) + (-f7);
            }
            view.setTranslationX(f2);
            view.setScaleX(max);
            view.setScaleY(max);
            view.setAlpha((((max - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
        }
    }
}
