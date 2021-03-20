package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

public class RectangleContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, PathContent {
    private final BaseKeyframeAnimation<?, Float> cornerRadiusAnimation;
    private final boolean hidden;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final Path path = new Path();
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final RectF rect = new RectF();
    private final BaseKeyframeAnimation<?, PointF> sizeAnimation;
    private CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();

    public RectangleContent(LottieDrawable lottieDrawable2, BaseLayer baseLayer, RectangleShape rectangleShape) {
        this.name = rectangleShape.getName();
        this.hidden = rectangleShape.isHidden();
        this.lottieDrawable = lottieDrawable2;
        BaseKeyframeAnimation<PointF, PointF> createAnimation = rectangleShape.getPosition().createAnimation();
        this.positionAnimation = createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = rectangleShape.getSize().createAnimation();
        this.sizeAnimation = createAnimation2;
        BaseKeyframeAnimation<Float, Float> createAnimation3 = rectangleShape.getCornerRadius().createAnimation();
        this.cornerRadiusAnimation = createAnimation3;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation baseKeyframeAnimation;
        if (t == LottieProperty.RECTANGLE_SIZE) {
            baseKeyframeAnimation = this.sizeAnimation;
        } else if (t == LottieProperty.POSITION) {
            baseKeyframeAnimation = this.positionAnimation;
        } else if (t == LottieProperty.CORNER_RADIUS) {
            baseKeyframeAnimation = this.cornerRadiusAnimation;
        } else {
            return;
        }
        baseKeyframeAnimation.setValueCallback(lottieValueCallback);
    }

    public String getName() {
        return this.name;
    }

    public Path getPath() {
        if (this.isPathValid) {
            return this.path;
        }
        this.path.reset();
        if (!this.hidden) {
            PointF value = this.sizeAnimation.getValue();
            float f = value.x / 2.0f;
            float f2 = value.y / 2.0f;
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.cornerRadiusAnimation;
            float floatValue = baseKeyframeAnimation == null ? 0.0f : ((FloatKeyframeAnimation) baseKeyframeAnimation).getFloatValue();
            float min = Math.min(f, f2);
            if (floatValue > min) {
                floatValue = min;
            }
            PointF value2 = this.positionAnimation.getValue();
            this.path.moveTo(value2.x + f, (value2.y - f2) + floatValue);
            this.path.lineTo(value2.x + f, (value2.y + f2) - floatValue);
            int i2 = (floatValue > 0.0f ? 1 : (floatValue == 0.0f ? 0 : -1));
            if (i2 > 0) {
                RectF rectF = this.rect;
                float f3 = value2.x;
                float f4 = floatValue * 2.0f;
                float f5 = value2.y;
                rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
                this.path.arcTo(this.rect, 0.0f, 90.0f, false);
            }
            this.path.lineTo((value2.x - f) + floatValue, value2.y + f2);
            if (i2 > 0) {
                RectF rectF2 = this.rect;
                float f6 = value2.x;
                float f7 = value2.y;
                float f8 = floatValue * 2.0f;
                rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
                this.path.arcTo(this.rect, 90.0f, 90.0f, false);
            }
            this.path.lineTo(value2.x - f, (value2.y - f2) + floatValue);
            if (i2 > 0) {
                RectF rectF3 = this.rect;
                float f9 = value2.x;
                float f10 = value2.y;
                float f11 = floatValue * 2.0f;
                rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
                this.path.arcTo(this.rect, 180.0f, 90.0f, false);
            }
            this.path.lineTo((value2.x + f) - floatValue, value2.y - f2);
            if (i2 > 0) {
                RectF rectF4 = this.rect;
                float f12 = value2.x;
                float f13 = floatValue * 2.0f;
                float f14 = value2.y;
                rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
                this.path.arcTo(this.rect, 270.0f, 90.0f, false);
            }
            this.path.close();
            this.trimPaths.apply(this.path);
        }
        this.isPathValid = true;
        return this.path;
    }

    public void onValueChanged() {
        invalidate();
    }

    public void resolveKeyPath(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i2, list, keyPath2, this);
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Content content = list.get(i2);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(trimPathContent);
                    trimPathContent.addListener(this);
                }
            }
        }
    }
}
