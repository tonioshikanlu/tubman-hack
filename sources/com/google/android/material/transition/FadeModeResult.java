package com.google.android.material.transition;

public class FadeModeResult {
    public final int endAlpha;
    public final boolean endOnTop;
    public final int startAlpha;

    private FadeModeResult(int i2, int i3, boolean z) {
        this.startAlpha = i2;
        this.endAlpha = i3;
        this.endOnTop = z;
    }

    public static FadeModeResult endOnTop(int i2, int i3) {
        return new FadeModeResult(i2, i3, true);
    }

    public static FadeModeResult startOnTop(int i2, int i3) {
        return new FadeModeResult(i2, i3, false);
    }
}
