package b.h.a.m.x.e;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

public final class d extends b<Drawable> {
    public d(Drawable drawable) {
        super(drawable);
    }

    public int a() {
        return Math.max(1, this.f893h.getIntrinsicHeight() * this.f893h.getIntrinsicWidth() * 4);
    }

    @NonNull
    public Class<Drawable> b() {
        return this.f893h.getClass();
    }

    public void recycle() {
    }
}
