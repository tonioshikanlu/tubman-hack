package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

public class FillContent implements DrawingContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private final BaseKeyframeAnimation<Integer, Integer> colorAnimation;
    @Nullable
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> colorFilterAnimation;
    private final boolean hidden;
    private final BaseLayer layer;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<Integer, Integer> opacityAnimation;
    private final Paint paint = new LPaint(1);
    private final Path path;
    private final List<PathContent> paths = new ArrayList();

    public FillContent(LottieDrawable lottieDrawable2, BaseLayer baseLayer, ShapeFill shapeFill) {
        Path path2 = new Path();
        this.path = path2;
        this.layer = baseLayer;
        this.name = shapeFill.getName();
        this.hidden = shapeFill.isHidden();
        this.lottieDrawable = lottieDrawable2;
        if (shapeFill.getColor() == null || shapeFill.getOpacity() == null) {
            this.colorAnimation = null;
            this.opacityAnimation = null;
            return;
        }
        path2.setFillType(shapeFill.getFillType());
        BaseKeyframeAnimation<Integer, Integer> createAnimation = shapeFill.getColor().createAnimation();
        this.colorAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        BaseKeyframeAnimation<Integer, Integer> createAnimation2 = shapeFill.getOpacity().createAnimation();
        this.opacityAnimation = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
    }

    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation;
        if (t == LottieProperty.COLOR) {
            baseKeyframeAnimation = this.colorAnimation;
        } else if (t == LottieProperty.OPACITY) {
            baseKeyframeAnimation = this.opacityAnimation;
        } else if (t == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation2 = this.colorFilterAnimation;
            if (baseKeyframeAnimation2 != null) {
                this.layer.removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.colorFilterAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorFilterAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.colorFilterAnimation);
            return;
        } else {
            return;
        }
        baseKeyframeAnimation.setValueCallback(lottieValueCallback);
    }

    public void draw(Canvas canvas, Matrix matrix, int i2) {
        if (!this.hidden) {
            L.beginSection("FillContent#draw");
            this.paint.setColor(((ColorKeyframeAnimation) this.colorAnimation).getIntValue());
            this.paint.setAlpha(MiscUtils.clamp((int) ((((((float) i2) / 255.0f) * ((float) this.opacityAnimation.getValue().intValue())) / 100.0f) * 255.0f), 0, 255));
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
            if (baseKeyframeAnimation != null) {
                this.paint.setColorFilter(baseKeyframeAnimation.getValue());
            }
            this.path.reset();
            for (int i3 = 0; i3 < this.paths.size(); i3++) {
                this.path.addPath(this.paths.get(i3).getPath(), matrix);
            }
            canvas.drawPath(this.path, this.paint);
            L.endSection("FillContent#draw");
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.path.reset();
        for (int i2 = 0; i2 < this.paths.size(); i2++) {
            this.path.addPath(this.paths.get(i2).getPath(), matrix);
        }
        this.path.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public String getName() {
        return this.name;
    }

    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    public void resolveKeyPath(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i2, list, keyPath2, this);
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Content content = list2.get(i2);
            if (content instanceof PathContent) {
                this.paths.add((PathContent) content);
            }
        }
    }
}
