package b.h.a.m.w;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.m.m;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

public class g implements m {

    /* renamed from: b  reason: collision with root package name */
    public final h f800b;
    @Nullable
    public final URL c;
    @Nullable
    public final String d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f801e;
    @Nullable
    public URL f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f802g;

    /* renamed from: h  reason: collision with root package name */
    public int f803h;

    public g(String str) {
        h hVar = h.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            Objects.requireNonNull(hVar, "Argument must not be null");
            this.f800b = hVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public void b(@NonNull MessageDigest messageDigest) {
        if (this.f802g == null) {
            this.f802g = c().getBytes(m.a);
        }
        messageDigest.update(this.f802g);
    }

    public String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.f801e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f801e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.f801e);
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f800b.equals(gVar.f800b);
    }

    public int hashCode() {
        if (this.f803h == 0) {
            int hashCode = c().hashCode();
            this.f803h = hashCode;
            this.f803h = this.f800b.hashCode() + (hashCode * 31);
        }
        return this.f803h;
    }

    public String toString() {
        return c();
    }

    public g(URL url) {
        h hVar = h.a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.f800b = hVar;
    }
}
