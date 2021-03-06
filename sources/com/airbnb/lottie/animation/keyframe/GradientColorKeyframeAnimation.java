package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {
    private final GradientColor gradientColor;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        int i2 = 0;
        GradientColor gradientColor2 = (GradientColor) list.get(0).startValue;
        i2 = gradientColor2 != null ? gradientColor2.getSize() : i2;
        this.gradientColor = new GradientColor(new float[i2], new int[i2]);
    }

    public GradientColor getValue(Keyframe<GradientColor> keyframe, float f) {
        this.gradientColor.lerp((GradientColor) keyframe.startValue, (GradientColor) keyframe.endValue, f);
        return this.gradientColor;
    }
}
