package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

public abstract class KeyPositionBase extends Key {
    public static final float SELECTION_SLOPE = 20.0f;
    public int mCurveFit = Key.UNSET;

    public abstract void calcPosition(int i2, int i3, float f, float f2, float f3, float f4);

    public void getAttributeNames(HashSet<String> hashSet) {
    }

    public abstract float getPositionX();

    public abstract float getPositionY();

    public abstract boolean intersects(int i2, int i3, RectF rectF, RectF rectF2, float f, float f2);

    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr);
}
