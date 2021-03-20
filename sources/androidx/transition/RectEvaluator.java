package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    public RectEvaluator() {
    }

    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i2 = rect.left;
        int i3 = i2 + ((int) (((float) (rect2.left - i2)) * f));
        int i4 = rect.top;
        int i5 = i4 + ((int) (((float) (rect2.top - i4)) * f));
        int i6 = rect.right;
        int i7 = i6 + ((int) (((float) (rect2.right - i6)) * f));
        int i8 = rect.bottom;
        int i9 = i8 + ((int) (((float) (rect2.bottom - i8)) * f));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i3, i5, i7, i9);
        }
        rect3.set(i3, i5, i7, i9);
        return this.mRect;
    }
}
