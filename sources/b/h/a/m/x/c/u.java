package b.h.a.m.x.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.v.s;
import b.h.a.m.v.w;
import java.util.Objects;

public final class u implements w<BitmapDrawable>, s {

    /* renamed from: h  reason: collision with root package name */
    public final Resources f880h;

    /* renamed from: i  reason: collision with root package name */
    public final w<Bitmap> f881i;

    public u(@NonNull Resources resources, @NonNull w<Bitmap> wVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f880h = resources;
        this.f881i = wVar;
    }

    @Nullable
    public static w<BitmapDrawable> c(@NonNull Resources resources, @Nullable w<Bitmap> wVar) {
        if (wVar == null) {
            return null;
        }
        return new u(resources, wVar);
    }

    public int a() {
        return this.f881i.a();
    }

    @NonNull
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @NonNull
    public Object get() {
        return new BitmapDrawable(this.f880h, this.f881i.get());
    }

    public void initialize() {
        w<Bitmap> wVar = this.f881i;
        if (wVar instanceof s) {
            ((s) wVar).initialize();
        }
    }

    public void recycle() {
        this.f881i.recycle();
    }
}
