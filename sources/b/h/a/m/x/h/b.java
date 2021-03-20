package b.h.a.m.x.h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.p;
import b.h.a.m.v.w;
import b.h.a.m.x.c.u;

public class b implements e<Bitmap, BitmapDrawable> {
    public final Resources a;

    public b(@NonNull Resources resources) {
        this.a = resources;
    }

    @Nullable
    public w<BitmapDrawable> a(@NonNull w<Bitmap> wVar, @NonNull p pVar) {
        return u.c(this.a, wVar);
    }
}
