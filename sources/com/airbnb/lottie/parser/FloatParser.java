package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

public class FloatParser implements ValueParser<Float> {
    public static final FloatParser INSTANCE = new FloatParser();

    private FloatParser() {
    }

    public Float parse(JsonReader jsonReader, float f) {
        return Float.valueOf(JsonUtils.valueFromObject(jsonReader) * f);
    }
}
