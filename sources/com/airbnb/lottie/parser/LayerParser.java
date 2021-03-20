package com.airbnb.lottie.parser;

import android.graphics.Rect;
import b.g.a.e.f.h;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.Collections;
import java.util.List;

public class LayerParser {
    private static final JsonReader.Options EFFECTS_NAMES = JsonReader.Options.of("nm");
    private static final JsonReader.Options NAMES = JsonReader.Options.of("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", h.f414g, "ip", "op", "tm", "cl", "hd");
    private static final JsonReader.Options TEXT_NAMES = JsonReader.Options.of("d", "a");

    /* renamed from: com.airbnb.lottie.parser.LayerParser$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer.MatteType.values()
                r0 = 6
                int[] r0 = new int[r0]
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = r0
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.LUMA     // Catch:{ NoSuchFieldError -> 0x000e }
                r1 = 3
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                int[] r0 = $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType     // Catch:{ NoSuchFieldError -> 0x0016 }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.LUMA_INVERTED     // Catch:{ NoSuchFieldError -> 0x0016 }
                r1 = 4
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.LayerParser.AnonymousClass1.<clinit>():void");
        }
    }

    private LayerParser() {
    }

    public static Layer parse(LottieComposition lottieComposition) {
        Rect bounds = lottieComposition.getBounds();
        List emptyList = Collections.emptyList();
        Layer.LayerType layerType = Layer.LayerType.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        AnimatableTransform animatableTransform = r4;
        AnimatableTransform animatableTransform2 = new AnimatableTransform();
        return new Layer(emptyList, lottieComposition, "__container", -1, layerType, -1, (String) null, emptyList2, animatableTransform, 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), (AnimatableTextFrame) null, (AnimatableTextProperties) null, Collections.emptyList(), Layer.MatteType.NONE, (AnimatableFloatValue) null, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015b, code lost:
        r38.endArray();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.model.layer.Layer parse(com.airbnb.lottie.parser.moshi.JsonReader r38, com.airbnb.lottie.LottieComposition r39) {
        /*
            r0 = r38
            r7 = r39
            com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.NONE
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r38.beginObject()
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r2)
            r3 = 0
            r4 = 0
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            java.lang.String r5 = "UNSET"
            r13 = 0
            r15 = -1
            r31 = r1
            r25 = r2
            r22 = r3
            r23 = r22
            r24 = r23
            r27 = r24
            r28 = r27
            r33 = r28
            r17 = r4
            r20 = r17
            r21 = r20
            r29 = r21
            r30 = r29
            r32 = r30
            r1 = r11
            r2 = r1
            r26 = r2
            r18 = r15
            r15 = r13
            r14 = r32
            r13 = r5
        L_0x004c:
            boolean r4 = r38.hasNext()
            if (r4 == 0) goto L_0x01f8
            com.airbnb.lottie.parser.moshi.JsonReader$Options r4 = NAMES
            int r4 = r0.selectName(r4)
            r5 = 1
            r6 = 6
            switch(r4) {
                case 0: goto L_0x01f2;
                case 1: goto L_0x01ea;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01d4;
                case 4: goto L_0x01cb;
                case 5: goto L_0x01bc;
                case 6: goto L_0x01ad;
                case 7: goto L_0x01a3;
                case 8: goto L_0x019d;
                case 9: goto L_0x0160;
                case 10: goto L_0x0143;
                case 11: goto L_0x0130;
                case 12: goto L_0x00ef;
                case 13: goto L_0x00ab;
                case 14: goto L_0x00a3;
                case 15: goto L_0x009b;
                case 16: goto L_0x008d;
                case 17: goto L_0x007f;
                case 18: goto L_0x0079;
                case 19: goto L_0x0073;
                case 20: goto L_0x006e;
                case 21: goto L_0x0069;
                case 22: goto L_0x0064;
                default: goto L_0x005d;
            }
        L_0x005d:
            r38.skipName()
            r38.skipValue()
            goto L_0x004c
        L_0x0064:
            boolean r33 = r38.nextBoolean()
            goto L_0x004c
        L_0x0069:
            java.lang.String r14 = r38.nextString()
            goto L_0x004c
        L_0x006e:
            com.airbnb.lottie.model.animatable.AnimatableFloatValue r32 = com.airbnb.lottie.parser.AnimatableValueParser.parseFloat(r0, r7, r3)
            goto L_0x004c
        L_0x0073:
            double r4 = r38.nextDouble()
            float r2 = (float) r4
            goto L_0x004c
        L_0x0079:
            double r4 = r38.nextDouble()
            float r1 = (float) r4
            goto L_0x004c
        L_0x007f:
            int r4 = r38.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.utils.Utils.dpScale()
            float r5 = r5 * r4
            int r4 = (int) r5
            r28 = r4
            goto L_0x004c
        L_0x008d:
            int r4 = r38.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.utils.Utils.dpScale()
            float r5 = r5 * r4
            int r4 = (int) r5
            r27 = r4
            goto L_0x004c
        L_0x009b:
            double r4 = r38.nextDouble()
            float r4 = (float) r4
            r26 = r4
            goto L_0x004c
        L_0x00a3:
            double r4 = r38.nextDouble()
            float r4 = (float) r4
            r25 = r4
            goto L_0x004c
        L_0x00ab:
            r38.beginArray()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x00b3:
            boolean r5 = r38.hasNext()
            if (r5 == 0) goto L_0x00dd
            r38.beginObject()
        L_0x00bc:
            boolean r5 = r38.hasNext()
            if (r5 == 0) goto L_0x00d9
            com.airbnb.lottie.parser.moshi.JsonReader$Options r5 = EFFECTS_NAMES
            int r5 = r0.selectName(r5)
            if (r5 == 0) goto L_0x00d1
            r38.skipName()
            r38.skipValue()
            goto L_0x00bc
        L_0x00d1:
            java.lang.String r5 = r38.nextString()
            r4.add(r5)
            goto L_0x00bc
        L_0x00d9:
            r38.endObject()
            goto L_0x00b3
        L_0x00dd:
            r38.endArray()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r5.append(r6)
            r5.append(r4)
            goto L_0x0176
        L_0x00ef:
            r38.beginObject()
        L_0x00f2:
            boolean r4 = r38.hasNext()
            if (r4 == 0) goto L_0x012b
            com.airbnb.lottie.parser.moshi.JsonReader$Options r4 = TEXT_NAMES
            int r4 = r0.selectName(r4)
            if (r4 == 0) goto L_0x0126
            if (r4 == r5) goto L_0x0109
            r38.skipName()
            r38.skipValue()
            goto L_0x00f2
        L_0x0109:
            r38.beginArray()
            boolean r4 = r38.hasNext()
            if (r4 == 0) goto L_0x0118
            com.airbnb.lottie.model.animatable.AnimatableTextProperties r4 = com.airbnb.lottie.parser.AnimatableTextPropertiesParser.parse(r38, r39)
            r30 = r4
        L_0x0118:
            boolean r4 = r38.hasNext()
            if (r4 == 0) goto L_0x0122
            r38.skipValue()
            goto L_0x0118
        L_0x0122:
            r38.endArray()
            goto L_0x00f2
        L_0x0126:
            com.airbnb.lottie.model.animatable.AnimatableTextFrame r29 = com.airbnb.lottie.parser.AnimatableValueParser.parseDocumentData(r38, r39)
            goto L_0x00f2
        L_0x012b:
            r38.endObject()
            goto L_0x004c
        L_0x0130:
            r38.beginArray()
        L_0x0133:
            boolean r4 = r38.hasNext()
            if (r4 == 0) goto L_0x015b
            com.airbnb.lottie.model.content.ContentModel r4 = com.airbnb.lottie.parser.ContentModelParser.parse(r38, r39)
            if (r4 == 0) goto L_0x0133
            r8.add(r4)
            goto L_0x0133
        L_0x0143:
            r38.beginArray()
        L_0x0146:
            boolean r4 = r38.hasNext()
            if (r4 == 0) goto L_0x0154
            com.airbnb.lottie.model.content.Mask r4 = com.airbnb.lottie.parser.MaskParser.parse(r38, r39)
            r10.add(r4)
            goto L_0x0146
        L_0x0154:
            int r4 = r10.size()
            r7.incrementMatteOrMaskCount(r4)
        L_0x015b:
            r38.endArray()
            goto L_0x004c
        L_0x0160:
            int r4 = r38.nextInt()
            com.airbnb.lottie.model.layer.Layer.MatteType.values()
            if (r4 < r6) goto L_0x017f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unsupported matte type: "
            r5.append(r6)
            r5.append(r4)
        L_0x0176:
            java.lang.String r4 = r5.toString()
            r7.addWarning(r4)
            goto L_0x004c
        L_0x017f:
            com.airbnb.lottie.model.layer.Layer$MatteType[] r6 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
            r31 = r6[r4]
            int r4 = r31.ordinal()
            r6 = 3
            if (r4 == r6) goto L_0x0193
            r6 = 4
            if (r4 == r6) goto L_0x0190
            goto L_0x0198
        L_0x0190:
            java.lang.String r4 = "Unsupported matte type: Luma Inverted"
            goto L_0x0195
        L_0x0193:
            java.lang.String r4 = "Unsupported matte type: Luma"
        L_0x0195:
            r7.addWarning(r4)
        L_0x0198:
            r7.incrementMatteOrMaskCount(r5)
            goto L_0x004c
        L_0x019d:
            com.airbnb.lottie.model.animatable.AnimatableTransform r21 = com.airbnb.lottie.parser.AnimatableTransformParser.parse(r38, r39)
            goto L_0x004c
        L_0x01a3:
            java.lang.String r4 = r38.nextString()
            int r24 = android.graphics.Color.parseColor(r4)
            goto L_0x004c
        L_0x01ad:
            int r4 = r38.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.utils.Utils.dpScale()
            float r5 = r5 * r4
            int r4 = (int) r5
            r23 = r4
            goto L_0x004c
        L_0x01bc:
            int r4 = r38.nextInt()
            float r4 = (float) r4
            float r5 = com.airbnb.lottie.utils.Utils.dpScale()
            float r5 = r5 * r4
            int r4 = (int) r5
            r22 = r4
            goto L_0x004c
        L_0x01cb:
            int r4 = r38.nextInt()
            long r4 = (long) r4
            r18 = r4
            goto L_0x004c
        L_0x01d4:
            int r4 = r38.nextInt()
            com.airbnb.lottie.model.layer.Layer$LayerType r17 = com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN
            if (r4 >= r6) goto L_0x004c
            com.airbnb.lottie.model.layer.Layer$LayerType[] r5 = com.airbnb.lottie.model.layer.Layer.LayerType.values()
            r17 = r5[r4]
            goto L_0x004c
        L_0x01e4:
            java.lang.String r20 = r38.nextString()
            goto L_0x004c
        L_0x01ea:
            int r4 = r38.nextInt()
            long r4 = (long) r4
            r15 = r4
            goto L_0x004c
        L_0x01f2:
            java.lang.String r13 = r38.nextString()
            goto L_0x004c
        L_0x01f8:
            r38.endObject()
            float r34 = r1 / r25
            float r35 = r2 / r25
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = (r34 > r11 ? 1 : (r34 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0226
            com.airbnb.lottie.value.Keyframe r5 = new com.airbnb.lottie.value.Keyframe
            r4 = 0
            r36 = 0
            java.lang.Float r37 = java.lang.Float.valueOf(r34)
            r0 = r5
            r1 = r39
            r2 = r12
            r3 = r12
            r11 = r5
            r5 = r36
            r36 = r10
            r10 = r6
            r6 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.add(r11)
            r0 = 0
            goto L_0x022a
        L_0x0226:
            r36 = r10
            r10 = r6
            r0 = r11
        L_0x022a:
            int r0 = (r35 > r0 ? 1 : (r35 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x022f
            goto L_0x0235
        L_0x022f:
            float r0 = r39.getEndFrame()
            r35 = r0
        L_0x0235:
            com.airbnb.lottie.value.Keyframe r11 = new com.airbnb.lottie.value.Keyframe
            r4 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r35)
            r0 = r11
            r1 = r39
            r2 = r9
            r3 = r9
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.add(r11)
            com.airbnb.lottie.value.Keyframe r9 = new com.airbnb.lottie.value.Keyframe
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r9
            r2 = r12
            r3 = r12
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.add(r9)
            java.lang.String r0 = ".ai"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x026d
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0272
        L_0x026d:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.addWarning(r0)
        L_0x0272:
            com.airbnb.lottie.model.layer.Layer r34 = new com.airbnb.lottie.model.layer.Layer
            r0 = r34
            r1 = r8
            r2 = r39
            r3 = r13
            r4 = r15
            r6 = r17
            r7 = r18
            r9 = r20
            r35 = r10
            r10 = r36
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r15 = r25
            r16 = r26
            r17 = r27
            r18 = r28
            r19 = r29
            r20 = r30
            r21 = r35
            r22 = r31
            r23 = r32
            r24 = r33
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.LayerParser.parse(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.model.layer.Layer");
    }
}
