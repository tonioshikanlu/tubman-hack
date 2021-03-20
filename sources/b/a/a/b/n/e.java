package b.a.a.b.n;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import e.x.c.i;

public final class e implements ViewPager2.PageTransformer {
    public void transformPage(View view, float f) {
        double d;
        int i2;
        i.e(view, "page");
        double d2 = 0.5d;
        if (f < ((float) -1)) {
            i2 = (int) (((double) view.getWidth()) * 0.5d * ((double) -1));
        } else {
            if (f <= ((float) 1)) {
                d = ((double) view.getWidth()) * 0.5d;
                d2 = (double) f;
            } else {
                d = (double) view.getWidth();
            }
            i2 = (int) (d * d2);
        }
        view.setScrollX(i2);
    }
}
