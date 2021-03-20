package b.a.a.b.n;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import e.x.c.i;

public final class f implements ViewPager2.PageTransformer {
    public void transformPage(View view, float f) {
        i.e(view, "page");
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY((float) view.getHeight());
        view.setRotation(f * 18.75f);
    }
}
