package b.l.a.a.e.e;

import androidx.annotation.Nullable;
import b.l.a.a.e.e.l;
import java.util.Arrays;

public final class f extends l {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f2425b;
    public final long c;
    public final byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2426e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final o f2427g;

    public static final class b extends l.a {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f2428b;
        public Long c;
        public byte[] d;

        /* renamed from: e  reason: collision with root package name */
        public String f2429e;
        public Long f;

        /* renamed from: g  reason: collision with root package name */
        public o f2430g;
    }

    public f(long j2, Integer num, long j3, byte[] bArr, String str, long j4, o oVar, a aVar) {
        this.a = j2;
        this.f2425b = num;
        this.c = j3;
        this.d = bArr;
        this.f2426e = str;
        this.f = j4;
        this.f2427g = oVar;
    }

    @Nullable
    public Integer a() {
        return this.f2425b;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    @Nullable
    public o d() {
        return this.f2427g;
    }

    @Nullable
    public byte[] e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.b() && ((num = this.f2425b) != null ? num.equals(lVar.a()) : lVar.a() == null) && this.c == lVar.c()) {
            if (Arrays.equals(this.d, lVar instanceof f ? ((f) lVar).d : lVar.e()) && ((str = this.f2426e) != null ? str.equals(lVar.f()) : lVar.f() == null) && this.f == lVar.g()) {
                o oVar = this.f2427g;
                o d2 = lVar.d();
                if (oVar == null) {
                    if (d2 == null) {
                        return true;
                    }
                } else if (oVar.equals(d2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public String f() {
        return this.f2426e;
    }

    public long g() {
        return this.f;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2425b;
        int i3 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j3 = this.c;
        int hashCode2 = (((((i2 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.f2426e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j4 = this.f;
        int i4 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        o oVar = this.f2427g;
        if (oVar != null) {
            i3 = oVar.hashCode();
        }
        return i4 ^ i3;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("LogEvent{eventTimeMs=");
        y.append(this.a);
        y.append(", eventCode=");
        y.append(this.f2425b);
        y.append(", eventUptimeMs=");
        y.append(this.c);
        y.append(", sourceExtension=");
        y.append(Arrays.toString(this.d));
        y.append(", sourceExtensionJsonProto3=");
        y.append(this.f2426e);
        y.append(", timezoneOffsetSeconds=");
        y.append(this.f);
        y.append(", networkConnectionInfo=");
        y.append(this.f2427g);
        y.append("}");
        return y.toString();
    }
}
