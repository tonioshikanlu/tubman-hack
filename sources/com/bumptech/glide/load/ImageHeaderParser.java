package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import b.h.a.m.v.c0.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: h  reason: collision with root package name */
        public final boolean f7193h;

        /* access modifiers changed from: public */
        ImageType(boolean z) {
            this.f7193h = z;
        }

        public boolean hasAlpha() {
            return this.f7193h;
        }
    }

    @NonNull
    ImageType a(@NonNull ByteBuffer byteBuffer);

    int b(@NonNull InputStream inputStream, @NonNull b bVar);

    @NonNull
    ImageType c(@NonNull InputStream inputStream);
}
