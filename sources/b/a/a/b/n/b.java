package b.a.a.b.n;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import e.x.c.i;

public final class b implements ViewPager2.PageTransformer {
    public void transformPage(View view, float f) {
        i.e(view, "page");
        view.setCameraDistance((float) (view.getWidth() * 20));
        float f2 = 0.0f;
        if (f < 0.0f) {
            f2 = (float) view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
