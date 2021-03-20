package com.karumi.dexter;

import com.karumi.dexter.listener.DexterError;

public final class DexterException extends IllegalStateException {
    public final DexterError error;

    public DexterException(String str, DexterError dexterError) {
        super(str);
        this.error = dexterError;
    }
}
