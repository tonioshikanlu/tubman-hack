package com.airbnb.lottie.model.content;

import b.e.a.a.a;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;

public class GradientColor {
    private final int[] colors;
    private final float[] positions;

    public GradientColor(float[] fArr, int[] iArr) {
        this.positions = fArr;
        this.colors = iArr;
    }

    public int[] getColors() {
        return this.colors;
    }

    public float[] getPositions() {
        return this.positions;
    }

    public int getSize() {
        return this.colors.length;
    }

    public void lerp(GradientColor gradientColor, GradientColor gradientColor2, float f) {
        if (gradientColor.colors.length == gradientColor2.colors.length) {
            for (int i2 = 0; i2 < gradientColor.colors.length; i2++) {
                this.positions[i2] = MiscUtils.lerp(gradientColor.positions[i2], gradientColor2.positions[i2], f);
                this.colors[i2] = GammaEvaluator.evaluate(f, gradientColor.colors[i2], gradientColor2.colors[i2]);
            }
            return;
        }
        StringBuilder y = a.y("Cannot interpolate between gradients. Lengths vary (");
        y.append(gradientColor.colors.length);
        y.append(" vs ");
        throw new IllegalArgumentException(a.o(y, gradientColor2.colors.length, ")"));
    }
}
