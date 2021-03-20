package b.d.a;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.x.c.i;

public final class b extends BottomSheetBehavior.BottomSheetCallback {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public void onSlide(View view, float f) {
        i.e(view, "bottomSheet");
    }

    public void onStateChanged(View view, int i2) {
        i.e(view, "bottomSheet");
        if (i2 == 5) {
            this.a.cancel();
        }
    }
}
