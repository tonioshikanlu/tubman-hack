package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

public class ContentModelParser {
    private static JsonReader.Options NAMES = JsonReader.Options.of("ty", "d");

    private ContentModelParser() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (r2.equals("gf") == false) goto L_0x0034;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.model.content.ContentModel parse(com.airbnb.lottie.parser.moshi.JsonReader r7, com.airbnb.lottie.LottieComposition r8) {
        /*
            r7.beginObject()
            r0 = 2
            r1 = r0
        L_0x0005:
            boolean r2 = r7.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0028
            com.airbnb.lottie.parser.moshi.JsonReader$Options r2 = NAMES
            int r2 = r7.selectName(r2)
            if (r2 == 0) goto L_0x0023
            if (r2 == r3) goto L_0x001e
            r7.skipName()
            r7.skipValue()
            goto L_0x0005
        L_0x001e:
            int r1 = r7.nextInt()
            goto L_0x0005
        L_0x0023:
            java.lang.String r2 = r7.nextString()
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            if (r2 != 0) goto L_0x002c
            return r4
        L_0x002c:
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case 3239: goto L_0x00c4;
                case 3270: goto L_0x00b8;
                case 3295: goto L_0x00ae;
                case 3307: goto L_0x00a3;
                case 3308: goto L_0x0098;
                case 3488: goto L_0x008d;
                case 3633: goto L_0x0082;
                case 3646: goto L_0x0077;
                case 3669: goto L_0x006b;
                case 3679: goto L_0x005e;
                case 3681: goto L_0x0051;
                case 3705: goto L_0x0044;
                case 3710: goto L_0x0037;
                default: goto L_0x0034;
            }
        L_0x0034:
            r0 = r5
            goto L_0x00cf
        L_0x0037:
            java.lang.String r0 = "tr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0040
            goto L_0x0034
        L_0x0040:
            r0 = 12
            goto L_0x00cf
        L_0x0044:
            java.lang.String r0 = "tm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0034
        L_0x004d:
            r0 = 11
            goto L_0x00cf
        L_0x0051:
            java.lang.String r0 = "st"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x005a
            goto L_0x0034
        L_0x005a:
            r0 = 10
            goto L_0x00cf
        L_0x005e:
            java.lang.String r0 = "sr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0067
            goto L_0x0034
        L_0x0067:
            r0 = 9
            goto L_0x00cf
        L_0x006b:
            java.lang.String r0 = "sh"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0074
            goto L_0x0034
        L_0x0074:
            r0 = 8
            goto L_0x00cf
        L_0x0077:
            java.lang.String r0 = "rp"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0080
            goto L_0x0034
        L_0x0080:
            r0 = 7
            goto L_0x00cf
        L_0x0082:
            java.lang.String r0 = "rc"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x008b
            goto L_0x0034
        L_0x008b:
            r0 = 6
            goto L_0x00cf
        L_0x008d:
            java.lang.String r0 = "mm"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0096
            goto L_0x0034
        L_0x0096:
            r0 = 5
            goto L_0x00cf
        L_0x0098:
            java.lang.String r0 = "gs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a1
            goto L_0x0034
        L_0x00a1:
            r0 = 4
            goto L_0x00cf
        L_0x00a3:
            java.lang.String r0 = "gr"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ac
            goto L_0x0034
        L_0x00ac:
            r0 = 3
            goto L_0x00cf
        L_0x00ae:
            java.lang.String r3 = "gf"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00cf
            goto L_0x0034
        L_0x00b8:
            java.lang.String r0 = "fl"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00c2
            goto L_0x0034
        L_0x00c2:
            r0 = r3
            goto L_0x00cf
        L_0x00c4:
            java.lang.String r0 = "el"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ce
            goto L_0x0034
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            switch(r0) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0123;
                case 2: goto L_0x011e;
                case 3: goto L_0x0119;
                case 4: goto L_0x0114;
                case 5: goto L_0x010a;
                case 6: goto L_0x0105;
                case 7: goto L_0x0100;
                case 8: goto L_0x00fb;
                case 9: goto L_0x00f6;
                case 10: goto L_0x00f1;
                case 11: goto L_0x00ec;
                case 12: goto L_0x00e7;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unknown shape type "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.airbnb.lottie.utils.Logger.warning(r8)
            goto L_0x012c
        L_0x00e7:
            com.airbnb.lottie.model.animatable.AnimatableTransform r4 = com.airbnb.lottie.parser.AnimatableTransformParser.parse(r7, r8)
            goto L_0x012c
        L_0x00ec:
            com.airbnb.lottie.model.content.ShapeTrimPath r4 = com.airbnb.lottie.parser.ShapeTrimPathParser.parse(r7, r8)
            goto L_0x012c
        L_0x00f1:
            com.airbnb.lottie.model.content.ShapeStroke r4 = com.airbnb.lottie.parser.ShapeStrokeParser.parse(r7, r8)
            goto L_0x012c
        L_0x00f6:
            com.airbnb.lottie.model.content.PolystarShape r4 = com.airbnb.lottie.parser.PolystarShapeParser.parse(r7, r8)
            goto L_0x012c
        L_0x00fb:
            com.airbnb.lottie.model.content.ShapePath r4 = com.airbnb.lottie.parser.ShapePathParser.parse(r7, r8)
            goto L_0x012c
        L_0x0100:
            com.airbnb.lottie.model.content.Repeater r4 = com.airbnb.lottie.parser.RepeaterParser.parse(r7, r8)
            goto L_0x012c
        L_0x0105:
            com.airbnb.lottie.model.content.RectangleShape r4 = com.airbnb.lottie.parser.RectangleShapeParser.parse(r7, r8)
            goto L_0x012c
        L_0x010a:
            com.airbnb.lottie.model.content.MergePaths r4 = com.airbnb.lottie.parser.MergePathsParser.parse(r7)
            java.lang.String r0 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r8.addWarning(r0)
            goto L_0x012c
        L_0x0114:
            com.airbnb.lottie.model.content.GradientStroke r4 = com.airbnb.lottie.parser.GradientStrokeParser.parse(r7, r8)
            goto L_0x012c
        L_0x0119:
            com.airbnb.lottie.model.content.ShapeGroup r4 = com.airbnb.lottie.parser.ShapeGroupParser.parse(r7, r8)
            goto L_0x012c
        L_0x011e:
            com.airbnb.lottie.model.content.GradientFill r4 = com.airbnb.lottie.parser.GradientFillParser.parse(r7, r8)
            goto L_0x012c
        L_0x0123:
            com.airbnb.lottie.model.content.ShapeFill r4 = com.airbnb.lottie.parser.ShapeFillParser.parse(r7, r8)
            goto L_0x012c
        L_0x0128:
            com.airbnb.lottie.model.content.CircleShape r4 = com.airbnb.lottie.parser.CircleShapeParser.parse(r7, r8, r1)
        L_0x012c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0136
            r7.skipValue()
            goto L_0x012c
        L_0x0136:
            r7.endObject()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.ContentModelParser.parse(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.model.content.ContentModel");
    }
}
