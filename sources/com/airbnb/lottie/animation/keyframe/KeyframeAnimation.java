package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.value.Keyframe;
import java.util.List;

public abstract class KeyframeAnimation<T> extends BaseKeyframeAnimation<T, T> {
    public KeyframeAnimation(List<? extends Keyframe<T>> list) {
        super(list);
    }
}
