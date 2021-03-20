package b.h.a.m.x.h;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.p;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.w;
import b.h.a.m.x.c.e;

public final class c implements e<Drawable, byte[]> {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final e<Bitmap, byte[]> f930b;
    public final e<b.h.a.m.x.g.c, byte[]> c;

    public c(@NonNull d dVar, @NonNull e<Bitmap, byte[]> eVar, @NonNull e<b.h.a.m.x.g.c, byte[]> eVar2) {
        this.a = dVar;
        this.f930b = eVar;
        this.c = eVar2;
    }

    @Nullable
    public w<byte[]> a(@NonNull w<Drawable> wVar, @NonNull p pVar) {
        Drawable drawable = wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f930b.a(e.c(((BitmapDrawable) drawable).getBitmap(), this.a), pVar);
        }
        if (drawable instanceof b.h.a.m.x.g.c) {
            return this.c.a(wVar, pVar);
        }
        return null;
    }
}
