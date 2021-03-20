package com.airbnb.lottie;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class LottieResult<V> {
    @Nullable
    private final Throwable exception;
    @Nullable
    private final V value;

    public LottieResult(V v) {
        this.value = v;
        this.exception = null;
    }

    public LottieResult(Throwable th) {
        this.exception = th;
        this.value = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    @Nullable
    public Throwable getException() {
        return this.exception;
    }

    @Nullable
    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }
}
