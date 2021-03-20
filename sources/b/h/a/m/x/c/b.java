package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import b.h.a.m.c;
import b.h.a.m.p;
import b.h.a.m.s;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.w;
import java.io.File;

public class b implements s<BitmapDrawable> {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final s<Bitmap> f847b;

    public b(d dVar, s<Bitmap> sVar) {
        this.a = dVar;
        this.f847b = sVar;
    }

    public boolean a(@NonNull Object obj, @NonNull File file, @NonNull p pVar) {
        return this.f847b.a(new e(((BitmapDrawable) ((w) obj).get()).getBitmap(), this.a), file, pVar);
    }

    @NonNull
    public c b(@NonNull p pVar) {
        return this.f847b.b(pVar);
    }
}
