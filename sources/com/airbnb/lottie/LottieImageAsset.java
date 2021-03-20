package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

public class LottieImageAsset {
    @Nullable
    private Bitmap bitmap;
    private final String dirName;
    private final String fileName;
    private final int height;
    private final String id;
    private final int width;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieImageAsset(int i2, int i3, String str, String str2, String str3) {
        this.width = i2;
        this.height = i3;
        this.id = str;
        this.fileName = str2;
        this.dirName = str3;
    }

    @Nullable
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public String getDirName() {
        return this.dirName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBitmap(@Nullable Bitmap bitmap2) {
        this.bitmap = bitmap2;
    }
}
