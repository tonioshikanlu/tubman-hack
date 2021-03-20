package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import b.e.a.a.a;

@RequiresApi(21)
public class FitModeEvaluators {
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() {
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float lerp = TransitionUtils.lerp(f5, f7, f2, f3, f, true);
            float f8 = lerp / f5;
            float f9 = lerp / f7;
            return new FitModeResult(f8, f9, f4 * f8, lerp, f6 * f9, lerp);
        }

        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    };
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() {
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f;
        }

        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float lerp = TransitionUtils.lerp(f4, f6, f2, f3, f, true);
            float f8 = lerp / f4;
            float f9 = lerp / f6;
            return new FitModeResult(f8, f9, lerp, f5 * f8, lerp, f7 * f9);
        }

        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    };

    private FitModeEvaluators() {
    }

    public static FitModeEvaluator get(int i2, boolean z, RectF rectF, RectF rectF2) {
        if (i2 == 0) {
            return shouldAutoFitToWidth(z, rectF, rectF2) ? WIDTH : HEIGHT;
        }
        if (i2 == 1) {
            return WIDTH;
        }
        if (i2 == 2) {
            return HEIGHT;
        }
        throw new IllegalArgumentException(a.g("Invalid fit mode: ", i2));
    }

    private static boolean shouldAutoFitToWidth(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f >= height) {
                return true;
            }
        } else if (f2 >= height2) {
            return true;
        }
        return false;
    }
}
