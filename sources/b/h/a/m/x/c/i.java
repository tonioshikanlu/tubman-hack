package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import b.h.a.m.m;
import b.h.a.m.v.c0.d;
import java.security.MessageDigest;

public class i extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f855b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(m.a);

    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f855b);
    }

    public Bitmap c(@NonNull d dVar, @NonNull Bitmap bitmap, int i2, int i3) {
        float f;
        float f2;
        Paint paint = z.a;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i2) {
            f2 = ((float) i3) / ((float) bitmap.getHeight());
            f3 = (((float) i2) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i2) / ((float) bitmap.getWidth());
            f = (((float) i3) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap d = dVar.d(i2, i3, z.c(bitmap));
        d.setHasAlpha(bitmap.hasAlpha());
        z.a(bitmap, d, matrix);
        return d;
    }

    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    public int hashCode() {
        return -599754482;
    }
}
