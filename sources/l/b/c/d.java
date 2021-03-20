package l.b.c;

import l.b.c.m;

public final class d extends m {
    public final m.b a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8111b;
    public final long c;
    public final long d;

    public static final class b extends m.a {
        public m.b a;

        /* renamed from: b  reason: collision with root package name */
        public Long f8112b;
        public Long c;
        public Long d;

        public m a() {
            String str = this.a == null ? " type" : "";
            if (this.f8112b == null) {
                str = b.e.a.a.a.m(str, " messageId");
            }
            if (this.c == null) {
                str = b.e.a.a.a.m(str, " uncompressedMessageSize");
            }
            if (this.d == null) {
                str = b.e.a.a.a.m(str, " compressedMessageSize");
            }
            if (str.isEmpty()) {
                return new d(this.a, this.f8112b.longValue(), this.c.longValue(), this.d.longValue(), (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }

        public m.a b(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }
    }

    public d(m.b bVar, long j2, long j3, long j4, a aVar) {
        this.a = bVar;
        this.f8111b = j2;
        this.c = j3;
        this.d = j4;
    }

    public long b() {
        return this.d;
    }

    public long c() {
        return this.f8111b;
    }

    public m.b d() {
        return this.a;
    }

    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.d()) && this.f8111b == mVar.c() && this.c == mVar.e() && this.d == mVar.b();
    }

    public int hashCode() {
        long j2 = this.f8111b;
        long j3 = this.c;
        long j4 = this.d;
        return (int) (((long) (((int) (((long) (((int) (((long) ((this.a.hashCode() ^ 1000003) * 1000003)) ^ (j2 ^ (j2 >>> 32)))) * 1000003)) ^ (j3 ^ (j3 >>> 32)))) * 1000003)) ^ (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("MessageEvent{type=");
        y.append(this.a);
        y.append(", messageId=");
        y.append(this.f8111b);
        y.append(", uncompressedMessageSize=");
        y.append(this.c);
        y.append(", compressedMessageSize=");
        y.append(this.d);
        y.append("}");
        return y.toString();
    }
}
