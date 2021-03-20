package b.l.a.a.e.e;

import androidx.annotation.Nullable;
import java.util.List;

public final class g extends m {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2431b;
    public final k c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2432e;
    public final List<l> f;

    /* renamed from: g  reason: collision with root package name */
    public final p f2433g;

    public g(long j2, long j3, k kVar, Integer num, String str, List list, p pVar, a aVar) {
        this.a = j2;
        this.f2431b = j3;
        this.c = kVar;
        this.d = num;
        this.f2432e = str;
        this.f = list;
        this.f2433g = pVar;
    }

    @Nullable
    public k a() {
        return this.c;
    }

    @Nullable
    public List<l> b() {
        return this.f;
    }

    @Nullable
    public Integer c() {
        return this.d;
    }

    @Nullable
    public String d() {
        return this.f2432e;
    }

    @Nullable
    public p e() {
        return this.f2433g;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == mVar.f() && this.f2431b == mVar.g() && ((kVar = this.c) != null ? kVar.equals(mVar.a()) : mVar.a() == null) && ((num = this.d) != null ? num.equals(mVar.c()) : mVar.c() == null) && ((str = this.f2432e) != null ? str.equals(mVar.d()) : mVar.d() == null) && ((list = this.f) != null ? list.equals(mVar.b()) : mVar.b() == null)) {
            p pVar = this.f2433g;
            p e2 = mVar.e();
            if (pVar == null) {
                if (e2 == null) {
                    return true;
                }
            } else if (pVar.equals(e2)) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.a;
    }

    public long g() {
        return this.f2431b;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f2431b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        k kVar = this.c;
        int i3 = 0;
        int hashCode = (i2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2432e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f2433g;
        if (pVar != null) {
            i3 = pVar.hashCode();
        }
        return hashCode4 ^ i3;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("LogRequest{requestTimeMs=");
        y.append(this.a);
        y.append(", requestUptimeMs=");
        y.append(this.f2431b);
        y.append(", clientInfo=");
        y.append(this.c);
        y.append(", logSource=");
        y.append(this.d);
        y.append(", logSourceName=");
        y.append(this.f2432e);
        y.append(", logEvents=");
        y.append(this.f);
        y.append(", qosTier=");
        y.append(this.f2433g);
        y.append("}");
        return y.toString();
    }
}
