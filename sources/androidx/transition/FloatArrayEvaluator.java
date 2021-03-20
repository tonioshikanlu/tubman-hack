package androidx.transition;

import android.animation.TypeEvaluator;
import b.e.a.a.a;

public class FloatArrayEvaluator implements TypeEvaluator<float[]> {
    private float[] mArray;

    public FloatArrayEvaluator(float[] fArr) {
        this.mArray = fArr;
    }

    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.mArray;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i2 = 0; i2 < fArr3.length; i2++) {
            float f2 = fArr[i2];
            fArr3[i2] = a.a(fArr2[i2], f2, f, f2);
        }
        return fArr3;
    }
}
