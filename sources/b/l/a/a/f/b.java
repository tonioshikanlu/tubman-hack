package b.l.a.a.f;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import b.l.a.a.f.h;
import java.util.Arrays;
import java.util.Objects;

public final class b extends h {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2470b;
    public final b.l.a.a.b c;

    /* renamed from: b.l.a.a.f.b$b  reason: collision with other inner class name */
    public static final class C0054b extends h.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f2471b;
        public b.l.a.a.b c;

        public h a() {
            String str = this.a == null ? " backendName" : "";
            if (this.c == null) {
                str = b.e.a.a.a.m(str, " priority");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.f2471b, this.c, (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }

        public h.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        public h.a c(b.l.a.a.b bVar) {
            Objects.requireNonNull(bVar, "Null priority");
            this.c = bVar;
            return this;
        }
    }

    public b(String str, byte[] bArr, b.l.a.a.b bVar, a aVar) {
        this.a = str;
        this.f2470b = bArr;
        this.c = bVar;
    }

    public String b() {
        return this.a;
    }

    @Nullable
    public byte[] c() {
        return this.f2470b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public b.l.a.a.b d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a.equals(hVar.b())) {
            if (Arrays.equals(this.f2470b, hVar instanceof b ? ((b) hVar).f2470b : hVar.c()) && this.c.equals(hVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2470b)) * 1000003) ^ this.c.hashCode();
    }
}
