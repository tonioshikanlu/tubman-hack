package b.l.d.q.f.i;

import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class r extends v.d.C0082d.b {
    public final Double a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5250b;
    public final boolean c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5251e;
    public final long f;

    public static final class b extends v.d.C0082d.b.a {
        public Double a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f5252b;
        public Boolean c;
        public Integer d;

        /* renamed from: e  reason: collision with root package name */
        public Long f5253e;
        public Long f;

        public v.d.C0082d.b a() {
            String str = this.f5252b == null ? " batteryVelocity" : "";
            if (this.c == null) {
                str = b.e.a.a.a.m(str, " proximityOn");
            }
            if (this.d == null) {
                str = b.e.a.a.a.m(str, " orientation");
            }
            if (this.f5253e == null) {
                str = b.e.a.a.a.m(str, " ramUsed");
            }
            if (this.f == null) {
                str = b.e.a.a.a.m(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new r(this.a, this.f5252b.intValue(), this.c.booleanValue(), this.d.intValue(), this.f5253e.longValue(), this.f.longValue(), (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }
    }

    public r(Double d2, int i2, boolean z, int i3, long j2, long j3, a aVar) {
        this.a = d2;
        this.f5250b = i2;
        this.c = z;
        this.d = i3;
        this.f5251e = j2;
        this.f = j3;
    }

    @Nullable
    public Double a() {
        return this.a;
    }

    public int b() {
        return this.f5250b;
    }

    public long c() {
        return this.f;
    }

    public int d() {
        return this.d;
    }

    public long e() {
        return this.f5251e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0082d.b)) {
            return false;
        }
        v.d.C0082d.b bVar = (v.d.C0082d.b) obj;
        Double d2 = this.a;
        if (d2 != null ? d2.equals(bVar.a()) : bVar.a() == null) {
            if (this.f5250b == bVar.b() && this.c == bVar.f() && this.d == bVar.d() && this.f5251e == bVar.e() && this.f == bVar.c()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.c;
    }

    public int hashCode() {
        Double d2 = this.a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.f5250b) * 1000003;
        int i2 = this.c ? 1231 : 1237;
        long j2 = this.f5251e;
        long j3 = this.f;
        return ((((((hashCode ^ i2) * 1000003) ^ this.d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Device{batteryLevel=");
        y.append(this.a);
        y.append(", batteryVelocity=");
        y.append(this.f5250b);
        y.append(", proximityOn=");
        y.append(this.c);
        y.append(", orientation=");
        y.append(this.d);
        y.append(", ramUsed=");
        y.append(this.f5251e);
        y.append(", diskUsed=");
        y.append(this.f);
        y.append("}");
        return y.toString();
    }
}
