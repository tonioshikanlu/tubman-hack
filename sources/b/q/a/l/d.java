package b.q.a.l;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public class d extends StateListDrawable {

    /* renamed from: h  reason: collision with root package name */
    public int f6819h;

    public d(Drawable drawable, int i2) {
        this.f6819h = i2;
        addState(new int[]{16842913}, drawable);
        addState(new int[0], drawable);
    }

    public boolean isStateful() {
        return true;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i2 : iArr) {
            if (i2 == 16842913) {
                z = true;
            }
        }
        if (z) {
            setColorFilter(this.f6819h, PorterDuff.Mode.SRC_ATOP);
        } else {
            clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
