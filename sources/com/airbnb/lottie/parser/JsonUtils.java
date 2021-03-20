package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import b.e.a.a.a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.List;

public class JsonUtils {
    private static final JsonReader.Options POINT_NAMES = JsonReader.Options.of("x", "y");

    /* renamed from: com.airbnb.lottie.parser.JsonUtils$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
        static {
            /*
                com.airbnb.lottie.parser.moshi.JsonReader.Token.values()
                r0 = 10
                int[] r0 = new int[r0]
                $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token = r0
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x000f }
                r1 = 6
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r1 = $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token     // Catch:{ NoSuchFieldError -> 0x0017 }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r2 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0017 }
                r2 = 0
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r1 = $SwitchMap$com$airbnb$lottie$parser$moshi$JsonReader$Token     // Catch:{ NoSuchFieldError -> 0x001e }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r2 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001e }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
            L_0x001e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.JsonUtils.AnonymousClass1.<clinit>():void");
        }
    }

    private JsonUtils() {
    }

    private static PointF jsonArrayToPoint(JsonReader jsonReader, float f) {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonReader.Token.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    private static PointF jsonNumbersToPoint(JsonReader jsonReader, float f) {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    private static PointF jsonObjectToPoint(JsonReader jsonReader, float f) {
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(POINT_NAMES);
            if (selectName == 0) {
                f2 = valueFromObject(jsonReader);
            } else if (selectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                f3 = valueFromObject(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f2 * f, f3 * f);
    }

    @ColorInt
    public static int jsonToColor(JsonReader jsonReader) {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    public static PointF jsonToPoint(JsonReader jsonReader, float f) {
        int ordinal = jsonReader.peek().ordinal();
        if (ordinal == 0) {
            return jsonArrayToPoint(jsonReader, f);
        }
        if (ordinal == 2) {
            return jsonObjectToPoint(jsonReader, f);
        }
        if (ordinal == 6) {
            return jsonNumbersToPoint(jsonReader, f);
        }
        StringBuilder y = a.y("Unknown point starts with ");
        y.append(jsonReader.peek());
        throw new IllegalArgumentException(y.toString());
    }

    public static List<PointF> jsonToPoints(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(jsonToPoint(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static float valueFromObject(JsonReader jsonReader) {
        JsonReader.Token peek = jsonReader.peek();
        int ordinal = peek.ordinal();
        if (ordinal == 0) {
            jsonReader.beginArray();
            float nextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return nextDouble;
        } else if (ordinal == 6) {
            return (float) jsonReader.nextDouble();
        } else {
            throw new IllegalArgumentException("Unknown value for token of type " + peek);
        }
    }
}
