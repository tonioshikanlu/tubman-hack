package b.h.a.m.x.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.p;
import b.h.a.m.r;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.w;
import b.h.a.m.x.e.b;
import b.h.a.m.x.e.e;

public class x implements r<Uri, Bitmap> {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final d f888b;

    public x(e eVar, d dVar) {
        this.a = eVar;
        this.f888b = dVar;
    }

    @Nullable
    public w a(@NonNull Object obj, int i2, int i3, @NonNull p pVar) {
        w c = this.a.c((Uri) obj);
        if (c == null) {
            return null;
        }
        return n.a(this.f888b, (Drawable) ((b) c).get(), i2, i3);
    }

    public boolean b(@NonNull Object obj, @NonNull p pVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
