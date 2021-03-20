package b.h.a.m.x.c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import b.h.a.m.m;
import b.h.a.m.v.c0.d;
import java.security.MessageDigest;

public class q extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f874b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(m.a);

    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f874b);
    }

    public Bitmap c(@NonNull d dVar, @NonNull Bitmap bitmap, int i2, int i3) {
        return z.b(dVar, bitmap, i2, i3);
    }

    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    public int hashCode() {
        return 1572326941;
    }
}
