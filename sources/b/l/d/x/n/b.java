package b.l.d.x.n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.x.n.f;

public final class b extends f {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5393b;
    public final f.b c;

    /* renamed from: b.l.d.x.n.b$b  reason: collision with other inner class name */
    public static final class C0091b extends f.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public Long f5394b;
        public f.b c;

        public f a() {
            String str = this.f5394b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.a, this.f5394b.longValue(), this.c, (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }

        public f.a b(long j2) {
            this.f5394b = Long.valueOf(j2);
            return this;
        }
    }

    public b(String str, long j2, f.b bVar, a aVar) {
        this.a = str;
        this.f5393b = j2;
        this.c = bVar;
    }

    @Nullable
    public f.b b() {
        return this.c;
    }

    @Nullable
    public String c() {
        return this.a;
    }

    @NonNull
    public long d() {
        return this.f5393b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f5393b == fVar.d()) {
                f.b bVar = this.c;
                f.b b2 = fVar.b();
                if (bVar == null) {
                    if (b2 == null) {
                        return true;
                    }
                } else if (bVar.equals(b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f5393b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        f.b bVar = this.c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("TokenResult{token=");
        y.append(this.a);
        y.append(", tokenExpirationTimestamp=");
        y.append(this.f5393b);
        y.append(", responseCode=");
        y.append(this.c);
        y.append("}");
        return y.toString();
    }
}
