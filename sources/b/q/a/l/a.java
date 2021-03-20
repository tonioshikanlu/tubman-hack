package b.q.a.l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class a extends Drawable {
    public final Paint a = new Paint(2);

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f6811b;
    public int c = 255;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f6812e;

    public a(Bitmap bitmap) {
        this.f6811b = bitmap;
        if (bitmap != null) {
            this.d = bitmap.getWidth();
            this.f6812e = this.f6811b.getHeight();
            return;
        }
        this.f6812e = 0;
        this.d = 0;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f6811b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f6811b, (Rect) null, getBounds(), this.a);
        }
    }

    public int getAlpha() {
        return this.c;
    }

    public int getIntrinsicHeight() {
        return this.f6812e;
    }

    public int getIntrinsicWidth() {
        return this.d;
    }

    public int getMinimumHeight() {
        return this.f6812e;
    }

    public int getMinimumWidth() {
        return this.d;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        this.c = i2;
        this.a.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setFilterBitmap(boolean z) {
        this.a.setFilterBitmap(z);
    }
}
