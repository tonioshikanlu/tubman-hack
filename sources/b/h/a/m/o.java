package b.h.a.m;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.util.Objects;

public final class o<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final b<Object> f584e = new a();
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f585b;
    public final String c;
    public volatile byte[] d;

    public class a implements b<Object> {
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public o(@NonNull String str, @Nullable T t, @NonNull b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
            this.a = t;
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f585b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    public static <T> o<T> a(@NonNull String str, @NonNull T t) {
        return new o<>(str, t, f584e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.c.equals(((o) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Option{key='");
        y.append(this.c);
        y.append('\'');
        y.append('}');
        return y.toString();
    }
}
