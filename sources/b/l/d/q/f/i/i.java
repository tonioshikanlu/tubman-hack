package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import b.l.d.q.f.i.v;

public final class i extends v.d.c {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5226b;
    public final int c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5227e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5228g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5229h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5230i;

    public static final class b extends v.d.c.a {
        public Integer a;

        /* renamed from: b  reason: collision with root package name */
        public String f5231b;
        public Integer c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Long f5232e;
        public Boolean f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f5233g;

        /* renamed from: h  reason: collision with root package name */
        public String f5234h;

        /* renamed from: i  reason: collision with root package name */
        public String f5235i;

        public v.d.c a() {
            String str = this.a == null ? " arch" : "";
            if (this.f5231b == null) {
                str = b.e.a.a.a.m(str, " model");
            }
            if (this.c == null) {
                str = b.e.a.a.a.m(str, " cores");
            }
            if (this.d == null) {
                str = b.e.a.a.a.m(str, " ram");
            }
            if (this.f5232e == null) {
                str = b.e.a.a.a.m(str, " diskSpace");
            }
            if (this.f == null) {
                str = b.e.a.a.a.m(str, " simulator");
            }
            if (this.f5233g == null) {
                str = b.e.a.a.a.m(str, " state");
            }
            if (this.f5234h == null) {
                str = b.e.a.a.a.m(str, " manufacturer");
            }
            if (this.f5235i == null) {
                str = b.e.a.a.a.m(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new i(this.a.intValue(), this.f5231b, this.c.intValue(), this.d.longValue(), this.f5232e.longValue(), this.f.booleanValue(), this.f5233g.intValue(), this.f5234h, this.f5235i, (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }
    }

    public i(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3, a aVar) {
        this.a = i2;
        this.f5226b = str;
        this.c = i3;
        this.d = j2;
        this.f5227e = j3;
        this.f = z;
        this.f5228g = i4;
        this.f5229h = str2;
        this.f5230i = str3;
    }

    @NonNull
    public int a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public long c() {
        return this.f5227e;
    }

    @NonNull
    public String d() {
        return this.f5229h;
    }

    @NonNull
    public String e() {
        return this.f5226b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.c)) {
            return false;
        }
        v.d.c cVar = (v.d.c) obj;
        return this.a == cVar.a() && this.f5226b.equals(cVar.e()) && this.c == cVar.b() && this.d == cVar.g() && this.f5227e == cVar.c() && this.f == cVar.i() && this.f5228g == cVar.h() && this.f5229h.equals(cVar.d()) && this.f5230i.equals(cVar.f());
    }

    @NonNull
    public String f() {
        return this.f5230i;
    }

    public long g() {
        return this.d;
    }

    public int h() {
        return this.f5228g;
    }

    public int hashCode() {
        long j2 = this.d;
        long j3 = this.f5227e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.f5226b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f5228g) * 1000003) ^ this.f5229h.hashCode()) * 1000003) ^ this.f5230i.hashCode();
    }

    public boolean i() {
        return this.f;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Device{arch=");
        y.append(this.a);
        y.append(", model=");
        y.append(this.f5226b);
        y.append(", cores=");
        y.append(this.c);
        y.append(", ram=");
        y.append(this.d);
        y.append(", diskSpace=");
        y.append(this.f5227e);
        y.append(", simulator=");
        y.append(this.f);
        y.append(", state=");
        y.append(this.f5228g);
        y.append(", manufacturer=");
        y.append(this.f5229h);
        y.append(", modelClass=");
        return b.e.a.a.a.q(y, this.f5230i, "}");
    }
}
