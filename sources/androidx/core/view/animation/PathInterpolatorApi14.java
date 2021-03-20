package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import b.e.a.a.a;

public class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;
    private final float[] mX;
    private final float[] mY;

    public PathInterpolatorApi14(float f, float f2) {
        this(createQuad(f, f2));
    }

    public PathInterpolatorApi14(float f, float f2, float f3, float f4) {
        this(createCubic(f, f2, f3, f4));
    }

    public PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i2 = ((int) (length / 0.002f)) + 1;
        this.mX = new float[i2];
        this.mY = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((((float) i3) * length) / ((float) (i2 - 1)), fArr, (float[]) null);
            this.mX[i3] = fArr[0];
            this.mY[i3] = fArr[1];
        }
    }

    private static Path createCubic(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.mX.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f < this.mX[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.mX;
        float f2 = fArr[length] - fArr[i2];
        if (f2 == 0.0f) {
            return this.mY[i2];
        }
        float[] fArr2 = this.mY;
        float f3 = fArr2[i2];
        return a.a(fArr2[length], f3, (f - fArr[i2]) / f2, f3);
    }
}
