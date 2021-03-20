package b.h.a.m.v.c0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

public class e implements d {
    public void a(int i2) {
    }

    public void b() {
    }

    @NonNull
    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @NonNull
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }
}
