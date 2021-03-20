package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.utils.MiscUtils;

public class LottieRelativePointValueCallback extends LottieValueCallback<PointF> {
    private final PointF point = new PointF();

    public LottieRelativePointValueCallback() {
    }

    public LottieRelativePointValueCallback(@NonNull PointF pointF) {
        super(pointF);
    }

    public PointF getOffset(LottieFrameInfo<PointF> lottieFrameInfo) {
        T t = this.value;
        if (t != null) {
            return (PointF) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    public final PointF getValue(LottieFrameInfo<PointF> lottieFrameInfo) {
        this.point.set(MiscUtils.lerp(lottieFrameInfo.getStartValue().x, lottieFrameInfo.getEndValue().x, lottieFrameInfo.getInterpolatedKeyframeProgress()), MiscUtils.lerp(lottieFrameInfo.getStartValue().y, lottieFrameInfo.getEndValue().y, lottieFrameInfo.getInterpolatedKeyframeProgress()));
        PointF offset = getOffset(lottieFrameInfo);
        this.point.offset(offset.x, offset.y);
        return this.point;
    }
}
