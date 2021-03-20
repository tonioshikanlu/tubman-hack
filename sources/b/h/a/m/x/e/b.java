package b.h.a.m.x.e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import b.h.a.m.v.s;
import b.h.a.m.v.w;
import b.h.a.m.x.g.c;
import java.util.Objects;

public abstract class b<T extends Drawable> implements w<T>, s {

    /* renamed from: h  reason: collision with root package name */
    public final T f893h;

    public b(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f893h = t;
    }

    @NonNull
    public Object get() {
        Drawable.ConstantState constantState = this.f893h.getConstantState();
        return constantState == null ? this.f893h : constantState.newDrawable();
    }

    public void initialize() {
        Bitmap b2;
        T t = this.f893h;
        if (t instanceof BitmapDrawable) {
            b2 = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof c) {
            b2 = ((c) t).b();
        } else {
            return;
        }
        b2.prepareToDraw();
    }
}
