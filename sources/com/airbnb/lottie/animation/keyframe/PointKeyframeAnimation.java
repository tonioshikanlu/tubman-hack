package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import b.e.a.a.a;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {
    private final PointF point = new PointF();

    public PointKeyframeAnimation(List<Keyframe<PointF>> list) {
        super(list);
    }

    public PointF getValue(Keyframe<PointF> keyframe, float f) {
        T t;
        T t2 = keyframe.startValue;
        if (t2 == null || (t = keyframe.endValue) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        if (lottieValueCallback != null) {
            PointF pointF3 = (PointF) lottieValueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), pointF, pointF2, f, getLinearCurrentKeyframeProgress(), getProgress());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.point;
        float f2 = pointF.x;
        float a = a.a(pointF2.x, f2, f, f2);
        float f3 = pointF.y;
        pointF4.set(a, ((pointF2.y - f3) * f) + f3);
        return this.point;
    }
}
