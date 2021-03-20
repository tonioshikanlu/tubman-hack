package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class b extends v {

    /* renamed from: b  reason: collision with root package name */
    public final String f5197b;
    public final String c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5198e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5199g;

    /* renamed from: h  reason: collision with root package name */
    public final v.d f5200h;

    /* renamed from: i  reason: collision with root package name */
    public final v.c f5201i;

    /* renamed from: b.l.d.q.f.i.b$b  reason: collision with other inner class name */
    public static final class C0080b extends v.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f5202b;
        public Integer c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public String f5203e;
        public String f;

        /* renamed from: g  reason: collision with root package name */
        public v.d f5204g;

        /* renamed from: h  reason: collision with root package name */
        public v.c f5205h;

        public C0080b() {
        }

        public C0080b(v vVar, a aVar) {
            b bVar = (b) vVar;
            this.a = bVar.f5197b;
            this.f5202b = bVar.c;
            this.c = Integer.valueOf(bVar.d);
            this.d = bVar.f5198e;
            this.f5203e = bVar.f;
            this.f = bVar.f5199g;
            this.f5204g = bVar.f5200h;
            this.f5205h = bVar.f5201i;
        }

        public v a() {
            String str = this.a == null ? " sdkVersion" : "";
            if (this.f5202b == null) {
                str = b.e.a.a.a.m(str, " gmpAppId");
            }
            if (this.c == null) {
                str = b.e.a.a.a.m(str, " platform");
            }
            if (this.d == null) {
                str = b.e.a.a.a.m(str, " installationUuid");
            }
            if (this.f5203e == null) {
                str = b.e.a.a.a.m(str, " buildVersion");
            }
            if (this.f == null) {
                str = b.e.a.a.a.m(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.f5202b, this.c.intValue(), this.d, this.f5203e, this.f, this.f5204g, this.f5205h, (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }
    }

    public b(String str, String str2, int i2, String str3, String str4, String str5, v.d dVar, v.c cVar, a aVar) {
        this.f5197b = str;
        this.c = str2;
        this.d = i2;
        this.f5198e = str3;
        this.f = str4;
        this.f5199g = str5;
        this.f5200h = dVar;
        this.f5201i = cVar;
    }

    @NonNull
    public String a() {
        return this.f;
    }

    @NonNull
    public String b() {
        return this.f5199g;
    }

    @NonNull
    public String c() {
        return this.c;
    }

    @NonNull
    public String d() {
        return this.f5198e;
    }

    @Nullable
    public v.c e() {
        return this.f5201i;
    }

    public boolean equals(Object obj) {
        v.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f5197b.equals(vVar.g()) && this.c.equals(vVar.c()) && this.d == vVar.f() && this.f5198e.equals(vVar.d()) && this.f.equals(vVar.a()) && this.f5199g.equals(vVar.b()) && ((dVar = this.f5200h) != null ? dVar.equals(vVar.h()) : vVar.h() == null)) {
            v.c cVar = this.f5201i;
            v.c e2 = vVar.e();
            if (cVar == null) {
                if (e2 == null) {
                    return true;
                }
            } else if (cVar.equals(e2)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    @NonNull
    public String g() {
        return this.f5197b;
    }

    @Nullable
    public v.d h() {
        return this.f5200h;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f5197b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f5198e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.f5199g.hashCode()) * 1000003;
        v.d dVar = this.f5200h;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        v.c cVar = this.f5201i;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode2 ^ i2;
    }

    public v.a i() {
        return new C0080b(this, (a) null);
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("CrashlyticsReport{sdkVersion=");
        y.append(this.f5197b);
        y.append(", gmpAppId=");
        y.append(this.c);
        y.append(", platform=");
        y.append(this.d);
        y.append(", installationUuid=");
        y.append(this.f5198e);
        y.append(", buildVersion=");
        y.append(this.f);
        y.append(", displayVersion=");
        y.append(this.f5199g);
        y.append(", session=");
        y.append(this.f5200h);
        y.append(", ndkPayload=");
        y.append(this.f5201i);
        y.append("}");
        return y.toString();
    }
}
