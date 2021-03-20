package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

public class IntegerParser implements ValueParser<Integer> {
    public static final IntegerParser INSTANCE = new IntegerParser();

    private IntegerParser() {
    }

    public Integer parse(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(JsonUtils.valueFromObject(jsonReader) * f));
    }
}
