package b.d.a;

import android.app.Dialog;
import android.view.View;
import com.andrefrsousa.superbottomsheet.CornerRadiusFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e.x.c.i;
import java.util.Objects;

public final class e extends BottomSheetBehavior.BottomSheetCallback {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    public void onSlide(View view, float f) {
        float f2;
        i.e(view, "bottomSheet");
        f fVar = this.a;
        Objects.requireNonNull(fVar);
        i.e(view, "bottomSheet");
        if (fVar.r) {
            int height = view.getHeight();
            View view2 = fVar.f384h;
            if (view2 == null) {
                i.m("sheetTouchOutsideContainer");
                throw null;
            } else if (height != view2.getHeight()) {
                fVar.r = false;
            } else if (Float.isNaN(f) || f <= ((float) 0)) {
                CornerRadiusFrameLayout cornerRadiusFrameLayout = fVar.f385i;
                if (cornerRadiusFrameLayout != null) {
                    cornerRadiusFrameLayout.setCornerRadius$lib_release(fVar.f389m);
                } else {
                    i.m("sheetContainer");
                    throw null;
                }
            } else if (fVar.r) {
                float f3 = fVar.f389m;
                float f4 = f3 - (f * f3);
                CornerRadiusFrameLayout cornerRadiusFrameLayout2 = fVar.f385i;
                if (cornerRadiusFrameLayout2 != null) {
                    cornerRadiusFrameLayout2.setCornerRadius$lib_release(f4);
                } else {
                    i.m("sheetContainer");
                    throw null;
                }
            }
        }
        f fVar2 = this.a;
        Objects.requireNonNull(fVar2);
        i.e(view, "bottomSheet");
        if (fVar2.s) {
            int height2 = view.getHeight();
            View view3 = fVar2.f384h;
            if (view3 == null) {
                i.m("sheetTouchOutsideContainer");
                throw null;
            } else if (height2 != view3.getHeight()) {
                fVar2.s = false;
            } else {
                if (Float.isNaN(f) || f <= ((float) 0)) {
                    f2 = 1.0f;
                } else {
                    float f5 = (float) 1;
                    f2 = f5 - (f * f5);
                }
                fVar2.f(f2);
            }
        }
    }

    public void onStateChanged(View view, int i2) {
        i.e(view, "bottomSheet");
        if (i2 == 5) {
            this.a.f(1.0f);
            Dialog dialog = this.a.getDialog();
            if (dialog != null) {
                dialog.cancel();
            }
        }
    }
}
