package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.Nullable;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Collections;

public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {
    private final LottieFrameInfo<A> frameInfo;
    private final A valueCallbackValue;

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback) {
        this(lottieValueCallback, (Object) null);
    }

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback, @Nullable A a) {
        super(Collections.emptyList());
        this.frameInfo = new LottieFrameInfo<>();
        setValueCallback(lottieValueCallback);
        this.valueCallbackValue = a;
    }

    public float getEndProgress() {
        return 1.0f;
    }

    public A getValue() {
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        A a = this.valueCallbackValue;
        return lottieValueCallback.getValueInternal(0.0f, 0.0f, a, a, getProgress(), getProgress(), getProgress());
    }

    public A getValue(Keyframe<K> keyframe, float f) {
        return getValue();
    }

    public void notifyListeners() {
        if (this.valueCallback != null) {
            super.notifyListeners();
        }
    }

    public void setProgress(float f) {
        this.progress = f;
    }
}
