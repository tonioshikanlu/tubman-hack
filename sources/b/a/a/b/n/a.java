package b.a.a.b.n;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import e.x.c.i;

public final class a implements ViewPager2.PageTransformer {
    public void transformPage(View view, float f) {
        i.e(view, "page");
        view.setTranslationX((-f) * ((float) view.getWidth()));
        view.setAlpha(((float) 1) - Math.abs(f));
    }
}
