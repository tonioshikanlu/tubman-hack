package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

public interface ValueParser<V> {
    V parse(JsonReader jsonReader, float f);
}
