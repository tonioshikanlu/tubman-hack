package b.a.a.b.n;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import e.x.c.i;

public final class d implements ViewPager2.PageTransformer {
    public void transformPage(View view, float f) {
        i.e(view, "page");
        float height = (float) view.getHeight();
        float width = (float) view.getWidth();
        int i2 = (f > ((float) 0) ? 1 : (f == ((float) 0) ? 0 : -1));
        float f2 = 1.0f;
        if (i2 <= 0) {
            f2 = Math.abs(1.0f + f);
        }
        if (f2 < 0.5f) {
            f2 = 0.5f;
        }
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setPivotX(width * 0.5f);
        view.setPivotY(height * 0.5f);
        view.setTranslationX(i2 > 0 ? width * f : (-width) * f * 0.25f);
    }
}
