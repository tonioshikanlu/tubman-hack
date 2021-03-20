package b.h.a.m;

import android.content.Context;
import androidx.annotation.NonNull;
import b.h.a.m.v.w;
import java.security.MessageDigest;
import java.util.Collection;

public class n<T> implements t<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Collection<? extends t<T>> f583b;

    public n(@NonNull Collection<? extends t<T>> collection) {
        if (!collection.isEmpty()) {
            this.f583b = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @NonNull
    public w<T> a(@NonNull Context context, @NonNull w<T> wVar, int i2, int i3) {
        w<T> wVar2 = wVar;
        for (t a : this.f583b) {
            w<T> a2 = a.a(context, wVar2, i2, i3);
            if (wVar2 != null && !wVar2.equals(wVar) && !wVar2.equals(a2)) {
                wVar2.recycle();
            }
            wVar2 = a2;
        }
        return wVar2;
    }

    public void b(@NonNull MessageDigest messageDigest) {
        for (t b2 : this.f583b) {
            b2.b(messageDigest);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f583b.equals(((n) obj).f583b);
        }
        return false;
    }

    public int hashCode() {
        return this.f583b.hashCode();
    }
}
