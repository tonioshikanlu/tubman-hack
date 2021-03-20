package b.h.a.m.x.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.w;

public class a<DataType> implements r<DataType, BitmapDrawable> {
    public final r<DataType, Bitmap> a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f845b;

    public a(@NonNull Resources resources, @NonNull r<DataType, Bitmap> rVar) {
        this.f845b = resources;
        this.a = rVar;
    }

    public w<BitmapDrawable> a(@NonNull DataType datatype, int i2, int i3, @NonNull p pVar) {
        return u.c(this.f845b, this.a.a(datatype, i2, i3, pVar));
    }

    public boolean b(@NonNull DataType datatype, @NonNull p pVar) {
        return this.a.b(datatype, pVar);
    }
}
