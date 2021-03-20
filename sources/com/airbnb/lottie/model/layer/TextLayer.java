package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextLayer extends BaseLayer {
    private final LongSparseArray<String> codePointCache = new LongSparseArray<>();
    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> colorAnimation;
    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> colorCallbackAnimation;
    private final LottieComposition composition;
    private final Map<FontCharacter, List<ContentGroup>> contentsForCharacter = new HashMap();
    private final Paint fillPaint = new Paint(1) {
        {
            setStyle(Paint.Style.FILL);
        }
    };
    private final LottieDrawable lottieDrawable;
    private final Matrix matrix = new Matrix();
    private final RectF rectF = new RectF();
    private final StringBuilder stringBuilder = new StringBuilder(2);
    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> strokeColorAnimation;
    @Nullable
    private BaseKeyframeAnimation<Integer, Integer> strokeColorCallbackAnimation;
    private final Paint strokePaint = new Paint(1) {
        {
            setStyle(Paint.Style.STROKE);
        }
    };
    @Nullable
    private BaseKeyframeAnimation<Float, Float> strokeWidthAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> strokeWidthCallbackAnimation;
    private final TextKeyframeAnimation textAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> textSizeAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> textSizeCallbackAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> trackingAnimation;
    @Nullable
    private BaseKeyframeAnimation<Float, Float> trackingCallbackAnimation;

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
        static {
            /*
                com.airbnb.lottie.model.DocumentData.Justification.values()
                r0 = 3
                int[] r1 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification = r1
                r2 = 1
                com.airbnb.lottie.model.DocumentData$Justification r3 = com.airbnb.lottie.model.DocumentData.Justification.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r3 = $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification     // Catch:{ NoSuchFieldError -> 0x0015 }
                com.airbnb.lottie.model.DocumentData$Justification r4 = com.airbnb.lottie.model.DocumentData.Justification.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                int[] r2 = $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification     // Catch:{ NoSuchFieldError -> 0x001b }
                com.airbnb.lottie.model.DocumentData$Justification r3 = com.airbnb.lottie.model.DocumentData.Justification.CENTER     // Catch:{ NoSuchFieldError -> 0x001b }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.TextLayer.AnonymousClass3.<clinit>():void");
        }
    }

    public TextLayer(LottieDrawable lottieDrawable2, Layer layer) {
        super(lottieDrawable2, layer);
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableColorValue animatableColorValue;
        AnimatableColorValue animatableColorValue2;
        this.lottieDrawable = lottieDrawable2;
        this.composition = layer.getComposition();
        TextKeyframeAnimation createAnimation = layer.getText().createAnimation();
        this.textAnimation = createAnimation;
        createAnimation.addUpdateListener(this);
        addAnimation(createAnimation);
        AnimatableTextProperties textProperties = layer.getTextProperties();
        if (!(textProperties == null || (animatableColorValue2 = textProperties.color) == null)) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation2 = animatableColorValue2.createAnimation();
            this.colorAnimation = createAnimation2;
            createAnimation2.addUpdateListener(this);
            addAnimation(this.colorAnimation);
        }
        if (!(textProperties == null || (animatableColorValue = textProperties.stroke) == null)) {
            BaseKeyframeAnimation<Integer, Integer> createAnimation3 = animatableColorValue.createAnimation();
            this.strokeColorAnimation = createAnimation3;
            createAnimation3.addUpdateListener(this);
            addAnimation(this.strokeColorAnimation);
        }
        if (!(textProperties == null || (animatableFloatValue2 = textProperties.strokeWidth) == null)) {
            BaseKeyframeAnimation<Float, Float> createAnimation4 = animatableFloatValue2.createAnimation();
            this.strokeWidthAnimation = createAnimation4;
            createAnimation4.addUpdateListener(this);
            addAnimation(this.strokeWidthAnimation);
        }
        if (textProperties != null && (animatableFloatValue = textProperties.tracking) != null) {
            BaseKeyframeAnimation<Float, Float> createAnimation5 = animatableFloatValue.createAnimation();
            this.trackingAnimation = createAnimation5;
            createAnimation5.addUpdateListener(this);
            addAnimation(this.trackingAnimation);
        }
    }

    private void applyJustification(DocumentData.Justification justification, Canvas canvas, float f) {
        float f2;
        int ordinal = justification.ordinal();
        if (ordinal == 1) {
            f2 = -f;
        } else if (ordinal == 2) {
            f2 = (-f) / 2.0f;
        } else {
            return;
        }
        canvas.translate(f2, 0.0f);
    }

    private String codePointToString(String str, int i2) {
        int codePointAt = str.codePointAt(i2);
        int charCount = Character.charCount(codePointAt) + i2;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!isModifier(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j2 = (long) codePointAt;
        if (this.codePointCache.containsKey(j2)) {
            return this.codePointCache.get(j2);
        }
        this.stringBuilder.setLength(0);
        while (i2 < charCount) {
            int codePointAt3 = str.codePointAt(i2);
            this.stringBuilder.appendCodePoint(codePointAt3);
            i2 += Character.charCount(codePointAt3);
        }
        String sb = this.stringBuilder.toString();
        this.codePointCache.put(j2, sb);
        return sb;
    }

    private void drawCharacter(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    private void drawCharacterAsGlyph(FontCharacter fontCharacter, Matrix matrix2, float f, DocumentData documentData, Canvas canvas) {
        Paint paint;
        List<ContentGroup> contentsForCharacter2 = getContentsForCharacter(fontCharacter);
        for (int i2 = 0; i2 < contentsForCharacter2.size(); i2++) {
            Path path = contentsForCharacter2.get(i2).getPath();
            path.computeBounds(this.rectF, false);
            this.matrix.set(matrix2);
            this.matrix.preTranslate(0.0f, Utils.dpScale() * (-documentData.baselineShift));
            this.matrix.preScale(f, f);
            path.transform(this.matrix);
            if (documentData.strokeOverFill) {
                drawGlyph(path, this.fillPaint, canvas);
                paint = this.strokePaint;
            } else {
                drawGlyph(path, this.strokePaint, canvas);
                paint = this.fillPaint;
            }
            drawGlyph(path, paint, canvas);
        }
    }

    private void drawCharacterFromFont(String str, DocumentData documentData, Canvas canvas) {
        Paint paint;
        if (documentData.strokeOverFill) {
            drawCharacter(str, this.fillPaint, canvas);
            paint = this.strokePaint;
        } else {
            drawCharacter(str, this.strokePaint, canvas);
            paint = this.fillPaint;
        }
        drawCharacter(str, paint, canvas);
    }

    private void drawFontTextLine(String str, DocumentData documentData, Canvas canvas, float f) {
        int i2 = 0;
        while (i2 < str.length()) {
            String codePointToString = codePointToString(str, i2);
            i2 += codePointToString.length();
            drawCharacterFromFont(codePointToString, documentData, canvas);
            canvas.translate(this.fillPaint.measureText(codePointToString) + f, 0.0f);
        }
    }

    private void drawGlyph(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private void drawGlyphTextLine(String str, DocumentData documentData, Matrix matrix2, Font font, Canvas canvas, float f, float f2) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            FontCharacter fontCharacter = this.composition.getCharacters().get(FontCharacter.hashFor(str.charAt(i2), font.getFamily(), font.getStyle()));
            if (fontCharacter != null) {
                drawCharacterAsGlyph(fontCharacter, matrix2, f2, documentData, canvas);
                float dpScale = Utils.dpScale() * ((float) fontCharacter.getWidth()) * f2 * f;
                float f3 = ((float) documentData.tracking) / 10.0f;
                BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation = this.trackingCallbackAnimation;
                if (!(baseKeyframeAnimation == null && (baseKeyframeAnimation = this.trackingAnimation) == null)) {
                    f3 += baseKeyframeAnimation.getValue().floatValue();
                }
                canvas.translate((f3 * f) + dpScale, 0.0f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r0 = r8.textSizeAnimation;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void drawTextGlyphs(com.airbnb.lottie.model.DocumentData r18, android.graphics.Matrix r19, com.airbnb.lottie.model.Font r20, android.graphics.Canvas r21) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r21
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r0 = r8.textSizeCallbackAnimation
            if (r0 == 0) goto L_0x0015
        L_0x000a:
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x001c
        L_0x0015:
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r0 = r8.textSizeAnimation
            if (r0 == 0) goto L_0x001a
            goto L_0x000a
        L_0x001a:
            float r0 = r9.size
        L_0x001c:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r11 = r0 / r1
            float r12 = com.airbnb.lottie.utils.Utils.getScale(r19)
            java.lang.String r0 = r9.text
            float r1 = r9.lineHeight
            float r2 = com.airbnb.lottie.utils.Utils.dpScale()
            float r13 = r2 * r1
            java.util.List r14 = r8.getTextLines(r0)
            int r15 = r14.size()
            r0 = 0
            r7 = r0
        L_0x0038:
            if (r7 >= r15) goto L_0x0074
            java.lang.Object r0 = r14.get(r7)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r6 = r20
            float r0 = r8.getTextLineWidthForGlyphs(r1, r6, r11, r12)
            r21.save()
            com.airbnb.lottie.model.DocumentData$Justification r2 = r9.justification
            r8.applyJustification(r2, r10, r0)
            int r0 = r15 + -1
            float r0 = (float) r0
            float r0 = r0 * r13
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r2 = (float) r7
            float r2 = r2 * r13
            float r2 = r2 - r0
            r0 = 0
            r10.translate(r0, r2)
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r12
            r16 = r7
            r7 = r11
            r0.drawGlyphTextLine(r1, r2, r3, r4, r5, r6, r7)
            r21.restore()
            int r7 = r16 + 1
            goto L_0x0038
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.TextLayer.drawTextGlyphs(com.airbnb.lottie.model.DocumentData, android.graphics.Matrix, com.airbnb.lottie.model.Font, android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r8 = r6.textSizeAnimation;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void drawTextWithFont(com.airbnb.lottie.model.DocumentData r7, com.airbnb.lottie.model.Font r8, android.graphics.Matrix r9, android.graphics.Canvas r10) {
        /*
            r6 = this;
            com.airbnb.lottie.utils.Utils.getScale(r9)
            com.airbnb.lottie.LottieDrawable r9 = r6.lottieDrawable
            java.lang.String r0 = r8.getFamily()
            java.lang.String r8 = r8.getStyle()
            android.graphics.Typeface r8 = r9.getTypeface(r0, r8)
            if (r8 != 0) goto L_0x0014
            return
        L_0x0014:
            java.lang.String r9 = r7.text
            com.airbnb.lottie.LottieDrawable r0 = r6.lottieDrawable
            com.airbnb.lottie.TextDelegate r0 = r0.getTextDelegate()
            if (r0 == 0) goto L_0x0022
            java.lang.String r9 = r0.getTextInternal(r9)
        L_0x0022:
            android.graphics.Paint r0 = r6.fillPaint
            r0.setTypeface(r8)
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r8 = r6.textSizeCallbackAnimation
            if (r8 == 0) goto L_0x0036
        L_0x002b:
            java.lang.Object r8 = r8.getValue()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x003d
        L_0x0036:
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r8 = r6.textSizeAnimation
            if (r8 == 0) goto L_0x003b
            goto L_0x002b
        L_0x003b:
            float r8 = r7.size
        L_0x003d:
            android.graphics.Paint r0 = r6.fillPaint
            float r1 = com.airbnb.lottie.utils.Utils.dpScale()
            float r1 = r1 * r8
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.strokePaint
            android.graphics.Paint r1 = r6.fillPaint
            android.graphics.Typeface r1 = r1.getTypeface()
            r0.setTypeface(r1)
            android.graphics.Paint r0 = r6.strokePaint
            android.graphics.Paint r1 = r6.fillPaint
            float r1 = r1.getTextSize()
            r0.setTextSize(r1)
            float r0 = r7.lineHeight
            float r1 = com.airbnb.lottie.utils.Utils.dpScale()
            float r1 = r1 * r0
            int r0 = r7.tracking
            float r0 = (float) r0
            r2 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r2
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r2 = r6.trackingCallbackAnimation
            if (r2 == 0) goto L_0x007a
        L_0x006e:
            java.lang.Object r2 = r2.getValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r0 = r0 + r2
            goto L_0x007f
        L_0x007a:
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r2 = r6.trackingAnimation
            if (r2 == 0) goto L_0x007f
            goto L_0x006e
        L_0x007f:
            float r2 = com.airbnb.lottie.utils.Utils.dpScale()
            float r2 = r2 * r0
            float r2 = r2 * r8
            r8 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r8
            java.util.List r8 = r6.getTextLines(r9)
            int r9 = r8.size()
            r0 = 0
        L_0x0091:
            if (r0 >= r9) goto L_0x00c7
            java.lang.Object r3 = r8.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            android.graphics.Paint r4 = r6.strokePaint
            float r4 = r4.measureText(r3)
            int r5 = r3.length()
            int r5 = r5 + -1
            float r5 = (float) r5
            float r5 = r5 * r2
            float r5 = r5 + r4
            r10.save()
            com.airbnb.lottie.model.DocumentData$Justification r4 = r7.justification
            r6.applyJustification(r4, r10, r5)
            int r4 = r9 + -1
            float r4 = (float) r4
            float r4 = r4 * r1
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r5 = (float) r0
            float r5 = r5 * r1
            float r5 = r5 - r4
            r4 = 0
            r10.translate(r4, r5)
            r6.drawFontTextLine(r3, r7, r10, r2)
            r10.restore()
            int r0 = r0 + 1
            goto L_0x0091
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.TextLayer.drawTextWithFont(com.airbnb.lottie.model.DocumentData, com.airbnb.lottie.model.Font, android.graphics.Matrix, android.graphics.Canvas):void");
    }

    private List<ContentGroup> getContentsForCharacter(FontCharacter fontCharacter) {
        if (this.contentsForCharacter.containsKey(fontCharacter)) {
            return this.contentsForCharacter.get(fontCharacter);
        }
        List<ShapeGroup> shapes = fontCharacter.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ContentGroup(this.lottieDrawable, this, shapes.get(i2)));
        }
        this.contentsForCharacter.put(fontCharacter, arrayList);
        return arrayList;
    }

    private float getTextLineWidthForGlyphs(String str, Font font, float f, float f2) {
        float f3 = 0.0f;
        for (int i2 = 0; i2 < str.length(); i2++) {
            FontCharacter fontCharacter = this.composition.getCharacters().get(FontCharacter.hashFor(str.charAt(i2), font.getFamily(), font.getStyle()));
            if (fontCharacter != null) {
                f3 = (float) ((fontCharacter.getWidth() * ((double) f) * ((double) Utils.dpScale()) * ((double) f2)) + ((double) f3));
            }
        }
        return f3;
    }

    private List<String> getTextLines(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private boolean isModifier(int i2) {
        return Character.getType(i2) == 16 || Character.getType(i2) == 27 || Character.getType(i2) == 6 || Character.getType(i2) == 28 || Character.getType(i2) == 19;
    }

    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation baseKeyframeAnimation;
        super.addValueCallback(t, lottieValueCallback);
        if (t == LottieProperty.COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.colorCallbackAnimation;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorCallbackAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            baseKeyframeAnimation = this.colorCallbackAnimation;
        } else if (t == LottieProperty.STROKE_COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation3 = this.strokeColorCallbackAnimation;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.strokeColorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeColorCallbackAnimation = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            baseKeyframeAnimation = this.strokeColorCallbackAnimation;
        } else if (t == LottieProperty.STROKE_WIDTH) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.strokeWidthCallbackAnimation;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.strokeWidthCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeWidthCallbackAnimation = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            baseKeyframeAnimation = this.strokeWidthCallbackAnimation;
        } else if (t == LottieProperty.TEXT_TRACKING) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.trackingCallbackAnimation;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.trackingCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.trackingCallbackAnimation = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            baseKeyframeAnimation = this.trackingCallbackAnimation;
        } else if (t == LottieProperty.TEXT_SIZE) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.textSizeCallbackAnimation;
            if (baseKeyframeAnimation6 != null) {
                removeAnimation(baseKeyframeAnimation6);
            }
            if (lottieValueCallback == null) {
                this.textSizeCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.textSizeCallbackAnimation = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            baseKeyframeAnimation = this.textSizeCallbackAnimation;
        } else {
            return;
        }
        addAnimation(baseKeyframeAnimation);
    }

    public void drawLayer(Canvas canvas, Matrix matrix2, int i2) {
        canvas.save();
        if (!this.lottieDrawable.useTextGlyphs()) {
            canvas.concat(matrix2);
        }
        DocumentData documentData = (DocumentData) this.textAnimation.getValue();
        Font font = this.composition.getFonts().get(documentData.fontName);
        if (font == null) {
            canvas.restore();
            return;
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
        if (baseKeyframeAnimation == null && (baseKeyframeAnimation = this.colorAnimation) == null) {
            this.fillPaint.setColor(documentData.color);
        } else {
            this.fillPaint.setColor(baseKeyframeAnimation.getValue().intValue());
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
        if (baseKeyframeAnimation2 == null && (baseKeyframeAnimation2 = this.strokeColorAnimation) == null) {
            this.strokePaint.setColor(documentData.strokeColor);
        } else {
            this.strokePaint.setColor(baseKeyframeAnimation2.getValue().intValue());
        }
        int intValue = ((this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue()) * 255) / 100;
        this.fillPaint.setAlpha(intValue);
        this.strokePaint.setAlpha(intValue);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
        if (baseKeyframeAnimation3 == null && (baseKeyframeAnimation3 = this.strokeWidthAnimation) == null) {
            this.strokePaint.setStrokeWidth(Utils.dpScale() * documentData.strokeWidth * Utils.getScale(matrix2));
        } else {
            this.strokePaint.setStrokeWidth(baseKeyframeAnimation3.getValue().floatValue());
        }
        if (this.lottieDrawable.useTextGlyphs()) {
            drawTextGlyphs(documentData, matrix2, font, canvas);
        } else {
            drawTextWithFont(documentData, font, matrix2, canvas);
        }
        canvas.restore();
    }

    public void getBounds(RectF rectF2, Matrix matrix2, boolean z) {
        super.getBounds(rectF2, matrix2, z);
        rectF2.set(0.0f, 0.0f, (float) this.composition.getBounds().width(), (float) this.composition.getBounds().height());
    }
}
