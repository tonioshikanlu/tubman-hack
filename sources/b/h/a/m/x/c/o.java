package b.h.a.m.x.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import b.h.a.c;
import b.h.a.m.t;
import b.h.a.m.v.c0.d;
import b.h.a.m.v.w;
import java.security.MessageDigest;

public class o implements t<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final t<Bitmap> f873b;
    public final boolean c;

    public o(t<Bitmap> tVar, boolean z) {
        this.f873b = tVar;
        this.c = z;
    }

    @NonNull
    public w<Drawable> a(@NonNull Context context, @NonNull w<Drawable> wVar, int i2, int i3) {
        d dVar = c.b(context).f467h;
        Drawable drawable = wVar.get();
        w<Bitmap> a = n.a(dVar, drawable, i2, i3);
        if (a != null) {
            w<Bitmap> a2 = this.f873b.a(context, a, i2, i3);
            if (!a2.equals(a)) {
                return u.c(context.getResources(), a2);
            }
            a2.recycle();
            return wVar;
        } else if (!this.c) {
            return wVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public void b(@NonNull MessageDigest messageDigest) {
        this.f873b.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f873b.equals(((o) obj).f873b);
        }
        return false;
    }

    public int hashCode() {
        return this.f873b.hashCode();
    }
}
