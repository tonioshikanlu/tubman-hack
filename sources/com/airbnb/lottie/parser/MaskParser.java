package com.airbnb.lottie.parser;

public class MaskParser {
    private MaskParser() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r1.equals("s") == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.airbnb.lottie.model.content.Mask parse(com.airbnb.lottie.parser.moshi.JsonReader r11, com.airbnb.lottie.LottieComposition r12) {
        /*
            r11.beginObject()
            r0 = 0
            r1 = 0
            r4 = r0
            r2 = r1
            r3 = r2
        L_0x0008:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x00d1
            java.lang.String r5 = r11.nextName()
            r5.hashCode()
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = -1
            switch(r6) {
                case 111: goto L_0x0043;
                case 3588: goto L_0x0038;
                case 104433: goto L_0x002d;
                case 3357091: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r6 = r10
            goto L_0x004d
        L_0x0022:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r6 = r7
            goto L_0x004d
        L_0x002d:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0036:
            r6 = r8
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0041
            goto L_0x0020
        L_0x0041:
            r6 = r9
            goto L_0x004d
        L_0x0043:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x004c
            goto L_0x0020
        L_0x004c:
            r6 = r0
        L_0x004d:
            switch(r6) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00bf;
                case 3: goto L_0x0054;
                default: goto L_0x0050;
            }
        L_0x0050:
            r11.skipValue()
            goto L_0x0008
        L_0x0054:
            java.lang.String r1 = r11.nextString()
            r1.hashCode()
            int r6 = r1.hashCode()
            switch(r6) {
                case 97: goto L_0x0083;
                case 105: goto L_0x0078;
                case 110: goto L_0x006d;
                case 115: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r7 = r10
            goto L_0x008d
        L_0x0064:
            java.lang.String r6 = "s"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x008d
            goto L_0x0062
        L_0x006d:
            java.lang.String r6 = "n"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0076
            goto L_0x0062
        L_0x0076:
            r7 = r8
            goto L_0x008d
        L_0x0078:
            java.lang.String r6 = "i"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0081
            goto L_0x0062
        L_0x0081:
            r7 = r9
            goto L_0x008d
        L_0x0083:
            java.lang.String r6 = "a"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x008c
            goto L_0x0062
        L_0x008c:
            r7 = r0
        L_0x008d:
            switch(r7) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00ae;
                case 3: goto L_0x00aa;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Unknown mask mode "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.airbnb.lottie.utils.Logger.warning(r1)
            goto L_0x00bb
        L_0x00aa:
            com.airbnb.lottie.model.content.Mask$MaskMode r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00ae:
            com.airbnb.lottie.model.content.Mask$MaskMode r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE
            goto L_0x0008
        L_0x00b2:
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r12.addWarning(r1)
            com.airbnb.lottie.model.content.Mask$MaskMode r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00bb:
            com.airbnb.lottie.model.content.Mask$MaskMode r1 = com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD
            goto L_0x0008
        L_0x00bf:
            boolean r4 = r11.nextBoolean()
            goto L_0x0008
        L_0x00c5:
            com.airbnb.lottie.model.animatable.AnimatableShapeValue r2 = com.airbnb.lottie.parser.AnimatableValueParser.parseShapeData(r11, r12)
            goto L_0x0008
        L_0x00cb:
            com.airbnb.lottie.model.animatable.AnimatableIntegerValue r3 = com.airbnb.lottie.parser.AnimatableValueParser.parseInteger(r11, r12)
            goto L_0x0008
        L_0x00d1:
            r11.endObject()
            com.airbnb.lottie.model.content.Mask r11 = new com.airbnb.lottie.model.content.Mask
            r11.<init>(r1, r2, r3, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.MaskParser.parse(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.model.content.Mask");
    }
}
