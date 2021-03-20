package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import b.e.a.a.a;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.List;

public class PolystarContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final float POLYGON_MAGIC_NUMBER = 0.25f;
    private static final float POLYSTAR_MAGIC_NUMBER = 0.47829f;
    private final boolean hidden;
    @Nullable
    private final BaseKeyframeAnimation<?, Float> innerRadiusAnimation;
    @Nullable
    private final BaseKeyframeAnimation<?, Float> innerRoundednessAnimation;
    private boolean isPathValid;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<?, Float> outerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> outerRoundednessAnimation;
    private final Path path = new Path();
    private final BaseKeyframeAnimation<?, Float> pointsAnimation;
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, Float> rotationAnimation;
    private CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();
    private final PolystarShape.Type type;

    /* renamed from: com.airbnb.lottie.animation.content.PolystarContent$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        static {
            /*
                com.airbnb.lottie.model.content.PolystarShape.Type.values()
                r0 = 2
                int[] r1 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type = r1
                r2 = 1
                com.airbnb.lottie.model.content.PolystarShape$Type r3 = com.airbnb.lottie.model.content.PolystarShape.Type.STAR     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                int[] r1 = $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.content.PolystarShape$Type r3 = com.airbnb.lottie.model.content.PolystarShape.Type.POLYGON     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.PolystarContent.AnonymousClass1.<clinit>():void");
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable2, BaseLayer baseLayer, PolystarShape polystarShape) {
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation;
        this.lottieDrawable = lottieDrawable2;
        this.name = polystarShape.getName();
        PolystarShape.Type type2 = polystarShape.getType();
        this.type = type2;
        this.hidden = polystarShape.isHidden();
        BaseKeyframeAnimation<Float, Float> createAnimation = polystarShape.getPoints().createAnimation();
        this.pointsAnimation = createAnimation;
        BaseKeyframeAnimation<PointF, PointF> createAnimation2 = polystarShape.getPosition().createAnimation();
        this.positionAnimation = createAnimation2;
        BaseKeyframeAnimation<Float, Float> createAnimation3 = polystarShape.getRotation().createAnimation();
        this.rotationAnimation = createAnimation3;
        BaseKeyframeAnimation<Float, Float> createAnimation4 = polystarShape.getOuterRadius().createAnimation();
        this.outerRadiusAnimation = createAnimation4;
        BaseKeyframeAnimation<Float, Float> createAnimation5 = polystarShape.getOuterRoundedness().createAnimation();
        this.outerRoundednessAnimation = createAnimation5;
        PolystarShape.Type type3 = PolystarShape.Type.STAR;
        if (type2 == type3) {
            this.innerRadiusAnimation = polystarShape.getInnerRadius().createAnimation();
            baseKeyframeAnimation = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            baseKeyframeAnimation = null;
            this.innerRadiusAnimation = null;
        }
        this.innerRoundednessAnimation = baseKeyframeAnimation;
        baseLayer.addAnimation(createAnimation);
        baseLayer.addAnimation(createAnimation2);
        baseLayer.addAnimation(createAnimation3);
        baseLayer.addAnimation(createAnimation4);
        baseLayer.addAnimation(createAnimation5);
        if (type2 == type3) {
            baseLayer.addAnimation(this.innerRadiusAnimation);
            baseLayer.addAnimation(this.innerRoundednessAnimation);
        }
        createAnimation.addUpdateListener(this);
        createAnimation2.addUpdateListener(this);
        createAnimation3.addUpdateListener(this);
        createAnimation4.addUpdateListener(this);
        createAnimation5.addUpdateListener(this);
        if (type2 == type3) {
            this.innerRadiusAnimation.addUpdateListener(this);
            this.innerRoundednessAnimation.addUpdateListener(this);
        }
    }

    private void createPolygonPath() {
        double d;
        double d2;
        double d3;
        int i2;
        int floor = (int) Math.floor((double) this.pointsAnimation.getValue().floatValue());
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.rotationAnimation;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? ShadowDrawableWrapper.COS_45 : (double) baseKeyframeAnimation.getValue().floatValue()) - 90.0d);
        double d4 = (double) floor;
        float floatValue = this.outerRoundednessAnimation.getValue().floatValue() / 100.0f;
        float floatValue2 = this.outerRadiusAnimation.getValue().floatValue();
        double d5 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.path.moveTo(cos, sin);
        double d6 = (double) ((float) (6.283185307179586d / d4));
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i3 = 0;
        while (((double) i3) < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (Math.sin(d7) * d5);
            if (floatValue != 0.0f) {
                d3 = d5;
                i2 = i3;
                d2 = d7;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d = d6;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f = floatValue2 * floatValue * 0.25f;
                this.path.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d2 = d7;
                d3 = d5;
                d = d6;
                i2 = i3;
                this.path.lineTo(cos2, sin2);
            }
            d7 = d2 + d;
            i3 = i2 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d3;
            d6 = d;
        }
        PointF value = this.positionAnimation.getValue();
        this.path.offset(value.x, value.y);
        this.path.close();
    }

    private void createStarPath() {
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        double d2;
        float f11;
        float f12;
        float floatValue = this.pointsAnimation.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.rotationAnimation;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? ShadowDrawableWrapper.COS_45 : (double) baseKeyframeAnimation.getValue().floatValue()) - 90.0d);
        double d3 = (double) floatValue;
        float f13 = (float) (6.283185307179586d / d3);
        float f14 = f13 / 2.0f;
        float f15 = floatValue - ((float) ((int) floatValue));
        float f16 = 0.0f;
        int i3 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i3 != 0) {
            radians += (double) ((1.0f - f15) * f14);
        }
        float floatValue2 = this.outerRadiusAnimation.getValue().floatValue();
        float floatValue3 = this.innerRadiusAnimation.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.innerRoundednessAnimation;
        float floatValue4 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() / 100.0f : 0.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.outerRoundednessAnimation;
        if (baseKeyframeAnimation3 != null) {
            f16 = baseKeyframeAnimation3.getValue().floatValue() / 100.0f;
        }
        if (i3 != 0) {
            f2 = a.a(floatValue2, floatValue3, f15, floatValue3);
            double d4 = (double) f2;
            f = f16;
            i2 = i3;
            f4 = (float) (Math.cos(radians) * d4);
            f3 = (float) (d4 * Math.sin(radians));
            this.path.moveTo(f4, f3);
            d = radians + ((double) ((f13 * f15) / 2.0f));
        } else {
            f = f16;
            i2 = i3;
            double d5 = (double) floatValue2;
            float cos = (float) (Math.cos(radians) * d5);
            f3 = (float) (Math.sin(radians) * d5);
            this.path.moveTo(cos, f3);
            d = radians + ((double) f14);
            float f17 = cos;
            f2 = 0.0f;
            f4 = f17;
        }
        double ceil = Math.ceil(d3) * 2.0d;
        float f18 = floatValue2;
        float f19 = floatValue3;
        int i4 = 0;
        boolean z = false;
        while (true) {
            double d6 = (double) i4;
            if (d6 < ceil) {
                float f20 = z ? f18 : f19;
                int i5 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i5 == 0 || d6 != ceil - 2.0d) {
                    f5 = f13;
                    f6 = f14;
                } else {
                    f5 = f13;
                    f6 = (f13 * f15) / 2.0f;
                }
                if (i5 == 0 || d6 != ceil - 1.0d) {
                    f7 = f14;
                    f9 = f20;
                    f8 = f6;
                } else {
                    f8 = f6;
                    f7 = f14;
                    f9 = f2;
                }
                double d7 = (double) f9;
                double d8 = d6;
                float cos2 = (float) (Math.cos(d) * d7);
                float sin = (float) (d7 * Math.sin(d));
                if (floatValue4 == 0.0f && f == 0.0f) {
                    this.path.lineTo(cos2, sin);
                    d2 = d;
                    f12 = sin;
                    f10 = floatValue4;
                    f11 = f2;
                } else {
                    f10 = floatValue4;
                    d2 = d;
                    double atan2 = (double) ((float) (Math.atan2((double) f3, (double) f4) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    float sin2 = (float) Math.sin(atan2);
                    f11 = f2;
                    f12 = sin;
                    double atan22 = (double) ((float) (Math.atan2((double) sin, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin3 = (float) Math.sin(atan22);
                    float f21 = z ? f10 : f;
                    float f22 = z ? f : f10;
                    float f23 = z ? f19 : f18;
                    float f24 = z ? f18 : f19;
                    float f25 = f23 * f21 * POLYSTAR_MAGIC_NUMBER;
                    float f26 = cos3 * f25;
                    float f27 = f25 * sin2;
                    float f28 = f24 * f22 * POLYSTAR_MAGIC_NUMBER;
                    float f29 = cos4 * f28;
                    float f30 = f28 * sin3;
                    if (i2 != 0) {
                        if (i4 == 0) {
                            f26 *= f15;
                            f27 *= f15;
                        } else if (d8 == ceil - 1.0d) {
                            f29 *= f15;
                            f30 *= f15;
                        }
                    }
                    this.path.cubicTo(f4 - f26, f3 - f27, cos2 + f29, f12 + f30, cos2, f12);
                }
                d = d2 + ((double) f8);
                z = !z;
                i4++;
                floatValue4 = f10;
                f4 = cos2;
                f14 = f7;
                f13 = f5;
                f3 = f12;
                f2 = f11;
            } else {
                PointF value = this.positionAnimation.getValue();
                this.path.offset(value.x, value.y);
                this.path.close();
                return;
            }
        }
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t == LottieProperty.POLYSTAR_POINTS) {
            baseKeyframeAnimation = this.pointsAnimation;
        } else if (t == LottieProperty.POLYSTAR_ROTATION) {
            baseKeyframeAnimation = this.rotationAnimation;
        } else if (t == LottieProperty.POSITION) {
            baseKeyframeAnimation = this.positionAnimation;
        } else {
            if (t != LottieProperty.POLYSTAR_INNER_RADIUS || (baseKeyframeAnimation2 = this.innerRadiusAnimation) == null) {
                if (t == LottieProperty.POLYSTAR_OUTER_RADIUS) {
                    baseKeyframeAnimation = this.outerRadiusAnimation;
                } else if (t != LottieProperty.POLYSTAR_INNER_ROUNDEDNESS || (baseKeyframeAnimation2 = this.innerRoundednessAnimation) == null) {
                    if (t == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
                        baseKeyframeAnimation = this.outerRoundednessAnimation;
                    } else {
                        return;
                    }
                }
            }
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
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
            int ordinal = this.type.ordinal();
            if (ordinal == 0) {
                createStarPath();
            } else if (ordinal == 1) {
                createPolygonPath();
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
