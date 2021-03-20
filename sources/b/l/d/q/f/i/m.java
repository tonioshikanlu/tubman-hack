package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class m extends v.d.C0082d.a.b.C0084a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5241b;
    public final String c;
    public final String d;

    public m(long j2, long j3, String str, String str2, a aVar) {
        this.a = j2;
        this.f5241b = j3;
        this.c = str;
        this.d = str2;
    }

    @NonNull
    public long a() {
        return this.a;
    }

    @NonNull
    public String b() {
        return this.c;
    }

    public long c() {
        return this.f5241b;
    }

    @Nullable
    public String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.C0082d.a.b.C0084a)) {
            return false;
        }
        v.d.C0082d.a.b.C0084a aVar = (v.d.C0082d.a.b.C0084a) obj;
        if (this.a == aVar.a() && this.f5241b == aVar.c() && this.c.equals(aVar.b())) {
            String str = this.d;
            String d2 = aVar.d();
            if (str == null) {
                if (d2 == null) {
                    return true;
                }
            } else if (str.equals(d2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f5241b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("BinaryImage{baseAddress=");
        y.append(this.a);
        y.append(", size=");
        y.append(this.f5241b);
        y.append(", name=");
        y.append(this.c);
        y.append(", uuid=");
        return b.e.a.a.a.q(y, this.d, "}");
    }
}
