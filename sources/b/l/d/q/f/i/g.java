package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class g extends v.d.a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5223b;
    public final String c;
    public final v.d.a.C0081a d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f5224e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5225g;

    public g(String str, String str2, String str3, v.d.a.C0081a aVar, String str4, String str5, String str6, a aVar2) {
        this.a = str;
        this.f5223b = str2;
        this.c = str3;
        this.f5224e = str4;
        this.f = str5;
        this.f5225g = str6;
    }

    @Nullable
    public String a() {
        return this.f;
    }

    @Nullable
    public String b() {
        return this.f5225g;
    }

    @Nullable
    public String c() {
        return this.c;
    }

    @NonNull
    public String d() {
        return this.a;
    }

    @Nullable
    public String e() {
        return this.f5224e;
    }

    public boolean equals(Object obj) {
        String str;
        v.d.a.C0081a aVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.a)) {
            return false;
        }
        v.d.a aVar2 = (v.d.a) obj;
        if (this.a.equals(aVar2.d()) && this.f5223b.equals(aVar2.g()) && ((str = this.c) != null ? str.equals(aVar2.c()) : aVar2.c() == null) && ((aVar = this.d) != null ? aVar.equals(aVar2.f()) : aVar2.f() == null) && ((str2 = this.f5224e) != null ? str2.equals(aVar2.e()) : aVar2.e() == null) && ((str3 = this.f) != null ? str3.equals(aVar2.a()) : aVar2.a() == null)) {
            String str4 = this.f5225g;
            String b2 = aVar2.b();
            if (str4 == null) {
                if (b2 == null) {
                    return true;
                }
            } else if (str4.equals(b2)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public v.d.a.C0081a f() {
        return this.d;
    }

    @NonNull
    public String g() {
        return this.f5223b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f5223b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        v.d.a.C0081a aVar = this.d;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str2 = this.f5224e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f5225g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Application{identifier=");
        y.append(this.a);
        y.append(", version=");
        y.append(this.f5223b);
        y.append(", displayVersion=");
        y.append(this.c);
        y.append(", organization=");
        y.append(this.d);
        y.append(", installationUuid=");
        y.append(this.f5224e);
        y.append(", developmentPlatform=");
        y.append(this.f);
        y.append(", developmentPlatformVersion=");
        return b.e.a.a.a.q(y, this.f5225g, "}");
    }
}
