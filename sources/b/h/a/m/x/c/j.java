package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.m.m;
import b.h.a.m.v.c0.d;
import java.security.MessageDigest;

public class j extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f856b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(m.a);

    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f856b);
    }

    public Bitmap c(@NonNull d dVar, @NonNull Bitmap bitmap, int i2, int i3) {
        Paint paint = z.a;
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return z.b(dVar, bitmap, i2, i3);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    public int hashCode() {
        return -670243078;
    }
}
