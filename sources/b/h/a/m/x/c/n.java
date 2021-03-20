package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.c0.e;
import b.h.a.m.v.w;
import java.util.concurrent.locks.Lock;

public final class n {
    public static final d a = new a();

    public class a extends e {
        public void e(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    @Nullable
    public static w<Bitmap> a(d dVar, Drawable drawable, int i2, int i3) {
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i2 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                }
                z = true;
            } else if (i3 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                if (current.getIntrinsicWidth() > 0) {
                    i2 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i3 = current.getIntrinsicHeight();
                }
                Lock lock = z.d;
                lock.lock();
                Bitmap d = dVar.d(i2, i3, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(d);
                    current.setBounds(0, 0, i2, i3);
                    current.draw(canvas);
                    canvas.setBitmap((Bitmap) null);
                    lock.unlock();
                    bitmap = d;
                    z = true;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } else {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                }
                z = true;
            }
            sb.append(str);
            Log.w("DrawableToBitmap", sb.toString());
            z = true;
        }
        if (!z) {
            dVar = a;
        }
        return e.c(bitmap, dVar);
    }
}
