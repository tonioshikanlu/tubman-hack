package b.l.d.x.n;

import androidx.annotation.Nullable;
import b.l.d.x.n.d;

public final class a extends d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5391b;
    public final String c;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f5392e;

    public a(String str, String str2, String str3, f fVar, d.a aVar, C0090a aVar2) {
        this.a = str;
        this.f5391b = str2;
        this.c = str3;
        this.d = fVar;
        this.f5392e = aVar;
    }

    @Nullable
    public f a() {
        return this.d;
    }

    @Nullable
    public String b() {
        return this.f5391b;
    }

    @Nullable
    public String c() {
        return this.c;
    }

    @Nullable
    public d.a d() {
        return this.f5392e;
    }

    @Nullable
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f5391b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        d.a aVar = this.f5392e;
                        d.a d2 = dVar.d();
                        if (aVar == null) {
                            if (d2 == null) {
                                return true;
                            }
                        } else if (aVar.equals(d2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f5391b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.a aVar = this.f5392e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("InstallationResponse{uri=");
        y.append(this.a);
        y.append(", fid=");
        y.append(this.f5391b);
        y.append(", refreshToken=");
        y.append(this.c);
        y.append(", authToken=");
        y.append(this.d);
        y.append(", responseCode=");
        y.append(this.f5392e);
        y.append("}");
        return y.toString();
    }
}
