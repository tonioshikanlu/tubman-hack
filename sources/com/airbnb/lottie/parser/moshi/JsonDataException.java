package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;

public final class JsonDataException extends RuntimeException {
    public JsonDataException(@Nullable String str) {
        super(str);
    }
}
