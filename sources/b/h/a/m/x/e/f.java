package b.h.a.m.x.e;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;

public class f implements r<Drawable, Drawable> {
    @Nullable
    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ boolean b(@NonNull Object obj, @NonNull p pVar) {
        Drawable drawable = (Drawable) obj;
        return true;
    }
}
