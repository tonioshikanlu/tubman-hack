package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

public class PathParser implements ValueParser<PointF> {
    public static final PathParser INSTANCE = new PathParser();

    private PathParser() {
    }

    public PointF parse(JsonReader jsonReader, float f) {
        return JsonUtils.jsonToPoint(jsonReader, f);
    }
}
