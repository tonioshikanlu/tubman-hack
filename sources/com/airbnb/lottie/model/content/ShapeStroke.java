package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.StrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

public class ShapeStroke implements ContentModel {
    private final LineCapType capType;
    private final AnimatableColorValue color;
    private final boolean hidden;
    private final LineJoinType joinType;
    private final List<AnimatableFloatValue> lineDashPattern;
    private final float miterLimit;
    private final String name;
    @Nullable
    private final AnimatableFloatValue offset;
    private final AnimatableIntegerValue opacity;
    private final AnimatableFloatValue width;

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType;
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|7|8|9|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0026 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
        static {
            /*
                com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
                r0 = 3
                int[] r1 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType = r1
                r2 = 1
                r3 = 2
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.BEVEL     // Catch:{ NoSuchFieldError -> 0x000e }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 0
                int[] r4 = $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType     // Catch:{ NoSuchFieldError -> 0x0015 }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r5 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.MITER     // Catch:{ NoSuchFieldError -> 0x0015 }
                r4[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r4 = $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineJoinType     // Catch:{ NoSuchFieldError -> 0x001b }
                com.airbnb.lottie.model.content.ShapeStroke$LineJoinType r5 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.ROUND     // Catch:{ NoSuchFieldError -> 0x001b }
                r4[r2] = r0     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
                int[] r4 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType = r4
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r5 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.BUTT     // Catch:{ NoSuchFieldError -> 0x0026 }
                r4[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r1 = $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType     // Catch:{ NoSuchFieldError -> 0x002c }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r4 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.ROUND     // Catch:{ NoSuchFieldError -> 0x002c }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x002c }
            L_0x002c:
                int[] r1 = $SwitchMap$com$airbnb$lottie$model$content$ShapeStroke$LineCapType     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.airbnb.lottie.model.content.ShapeStroke$LineCapType r2 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0032 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.content.ShapeStroke.AnonymousClass1.<clinit>():void");
        }
    }

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int ordinal = ordinal();
            return ordinal != 0 ? ordinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return Paint.Join.MITER;
            }
            if (ordinal == 1) {
                return Paint.Join.ROUND;
            }
            if (ordinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public ShapeStroke(String str, @Nullable AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableColorValue animatableColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.name = str;
        this.offset = animatableFloatValue;
        this.lineDashPattern = list;
        this.color = animatableColorValue;
        this.opacity = animatableIntegerValue;
        this.width = animatableFloatValue2;
        this.capType = lineCapType;
        this.joinType = lineJoinType;
        this.miterLimit = f;
        this.hidden = z;
    }

    public LineCapType getCapType() {
        return this.capType;
    }

    public AnimatableColorValue getColor() {
        return this.color;
    }

    public AnimatableFloatValue getDashOffset() {
        return this.offset;
    }

    public LineJoinType getJoinType() {
        return this.joinType;
    }

    public List<AnimatableFloatValue> getLineDashPattern() {
        return this.lineDashPattern;
    }

    public float getMiterLimit() {
        return this.miterLimit;
    }

    public String getName() {
        return this.name;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.opacity;
    }

    public AnimatableFloatValue getWidth() {
        return this.width;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new StrokeContent(lottieDrawable, baseLayer, this);
    }
}
