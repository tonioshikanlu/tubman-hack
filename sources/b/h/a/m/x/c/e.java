package b.h.a.m.x.c;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.s;
import b.h.a.m.v.w;
import b.h.a.s.j;
import java.util.Objects;

public class e implements w<Bitmap>, s {

    /* renamed from: h  reason: collision with root package name */
    public final Bitmap f853h;

    /* renamed from: i  reason: collision with root package name */
    public final d f854i;

    public e(@NonNull Bitmap bitmap, @NonNull d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f853h = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.f854i = dVar;
    }

    @Nullable
    public static e c(@Nullable Bitmap bitmap, @NonNull d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    public int a() {
        return j.d(this.f853h);
    }

    @NonNull
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @NonNull
    public Object get() {
        return this.f853h;
    }

    public void initialize() {
        this.f853h.prepareToDraw();
    }

    public void recycle() {
        this.f854i.e(this.f853h);
    }
}
