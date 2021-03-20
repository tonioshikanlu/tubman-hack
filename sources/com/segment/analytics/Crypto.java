package com.segment.analytics;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class Crypto {
    public static Crypto none() {
        return new Crypto() {
            public InputStream decrypt(InputStream inputStream) {
                return inputStream;
            }

            public OutputStream encrypt(OutputStream outputStream) {
                return outputStream;
            }
        };
    }

    public abstract InputStream decrypt(InputStream inputStream);

    public abstract OutputStream encrypt(OutputStream outputStream);
}
