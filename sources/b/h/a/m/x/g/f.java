package b.h.a.m.x.g;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import b.h.a.c;
import b.h.a.m.t;
import b.h.a.m.v.w;
import b.h.a.m.x.c.e;
import java.security.MessageDigest;
import java.util.Objects;

public class f implements t<c> {

    /* renamed from: b  reason: collision with root package name */
    public final t<Bitmap> f909b;

    public f(t<Bitmap> tVar) {
        Objects.requireNonNull(tVar, "Argument must not be null");
        this.f909b = tVar;
    }

    @NonNull
    public w<c> a(@NonNull Context context, @NonNull w<c> wVar, int i2, int i3) {
        c cVar = wVar.get();
        e eVar = new e(cVar.b(), c.b(context).f467h);
        w<Bitmap> a = this.f909b.a(context, eVar, i2, i3);
        if (!eVar.equals(a)) {
            eVar.recycle();
        }
        t<Bitmap> tVar = this.f909b;
        cVar.f899h.a.c(tVar, a.get());
        return wVar;
    }

    public void b(@NonNull MessageDigest messageDigest) {
        this.f909b.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f909b.equals(((f) obj).f909b);
        }
        return false;
    }

    public int hashCode() {
        return this.f909b.hashCode();
    }
}
