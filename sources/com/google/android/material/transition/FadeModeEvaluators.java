package com.google.android.material.transition;

import b.e.a.a.a;

public class FadeModeEvaluators {
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), 255);
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            float a = a.a(f3, f2, 0.35f, f2);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, a, f), TransitionUtils.lerp(0, 255, a, f3, f));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i2, boolean z) {
        if (i2 == 0) {
            return z ? IN : OUT;
        }
        if (i2 == 1) {
            return z ? OUT : IN;
        }
        if (i2 == 2) {
            return CROSS;
        }
        if (i2 == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException(a.g("Invalid fade mode: ", i2));
    }
}
