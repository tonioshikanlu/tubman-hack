package b.l.d.x.m;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.x.m.c;
import b.l.d.x.m.d;
import java.util.Objects;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f5376b;
    public final c.a c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5377e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f5378g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5379h;

    public static final class b extends d.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f5380b;
        public String c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public Long f5381e;
        public Long f;

        /* renamed from: g  reason: collision with root package name */
        public String f5382g;

        public b() {
        }

        public b(d dVar, C0089a aVar) {
            a aVar2 = (a) dVar;
            this.a = aVar2.f5376b;
            this.f5380b = aVar2.c;
            this.c = aVar2.d;
            this.d = aVar2.f5377e;
            this.f5381e = Long.valueOf(aVar2.f);
            this.f = Long.valueOf(aVar2.f5378g);
            this.f5382g = aVar2.f5379h;
        }

        public d a() {
            String str = this.f5380b == null ? " registrationStatus" : "";
            if (this.f5381e == null) {
                str = b.e.a.a.a.m(str, " expiresInSecs");
            }
            if (this.f == null) {
                str = b.e.a.a.a.m(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f5380b, this.c, this.d, this.f5381e.longValue(), this.f.longValue(), this.f5382g, (C0089a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }

        public d.a b(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f5380b = aVar;
            return this;
        }

        public d.a c(long j2) {
            this.f5381e = Long.valueOf(j2);
            return this;
        }

        public d.a d(long j2) {
            this.f = Long.valueOf(j2);
            return this;
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4, C0089a aVar2) {
        this.f5376b = str;
        this.c = aVar;
        this.d = str2;
        this.f5377e = str3;
        this.f = j2;
        this.f5378g = j3;
        this.f5379h = str4;
    }

    @Nullable
    public String a() {
        return this.d;
    }

    public long b() {
        return this.f;
    }

    @Nullable
    public String c() {
        return this.f5376b;
    }

    @Nullable
    public String d() {
        return this.f5379h;
    }

    @Nullable
    public String e() {
        return this.f5377e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f5376b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (this.c.equals(dVar.f()) && ((str = this.d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f5377e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f == dVar.b() && this.f5378g == dVar.g()) {
                String str4 = this.f5379h;
                String d2 = dVar.d();
                if (str4 == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (str4.equals(d2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    public c.a f() {
        return this.c;
    }

    public long g() {
        return this.f5378g;
    }

    public int hashCode() {
        String str = this.f5376b;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5377e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j2 = this.f;
        long j3 = this.f5378g;
        int i3 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f5379h;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i3 ^ i2;
    }

    public d.a j() {
        return new b(this, (C0089a) null);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("PersistedInstallationEntry{firebaseInstallationId=");
        y.append(this.f5376b);
        y.append(", registrationStatus=");
        y.append(this.c);
        y.append(", authToken=");
        y.append(this.d);
        y.append(", refreshToken=");
        y.append(this.f5377e);
        y.append(", expiresInSecs=");
        y.append(this.f);
        y.append(", tokenCreationEpochInSecs=");
        y.append(this.f5378g);
        y.append(", fisError=");
        return b.e.a.a.a.q(y, this.f5379h, "}");
    }
}
