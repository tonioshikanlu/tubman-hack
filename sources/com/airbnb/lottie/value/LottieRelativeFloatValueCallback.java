package com.airbnb.lottie.value;

import androidx.annotation.NonNull;
import com.airbnb.lottie.utils.MiscUtils;

public class LottieRelativeFloatValueCallback extends LottieValueCallback<Float> {
    public LottieRelativeFloatValueCallback() {
    }

    public LottieRelativeFloatValueCallback(@NonNull Float f) {
        super(f);
    }

    public Float getOffset(LottieFrameInfo<Float> lottieFrameInfo) {
        T t = this.value;
        if (t != null) {
            return (Float) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    public Float getValue(LottieFrameInfo<Float> lottieFrameInfo) {
        return Float.valueOf(getOffset(lottieFrameInfo).floatValue() + MiscUtils.lerp(lottieFrameInfo.getStartValue().floatValue(), lottieFrameInfo.getEndValue().floatValue(), lottieFrameInfo.getInterpolatedKeyframeProgress()));
    }
}
