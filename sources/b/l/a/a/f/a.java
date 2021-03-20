package b.l.a.a.f;

import androidx.annotation.Nullable;
import b.l.a.a.f.e;
import java.util.Map;
import java.util.Objects;

public final class a extends e {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f2466b;
    public final d c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2467e;
    public final Map<String, String> f;

    public static final class b extends e.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f2468b;
        public d c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Long f2469e;
        public Map<String, String> f;

        public e b() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = b.e.a.a.a.m(str, " encodedPayload");
            }
            if (this.d == null) {
                str = b.e.a.a.a.m(str, " eventMillis");
            }
            if (this.f2469e == null) {
                str = b.e.a.a.a.m(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = b.e.a.a.a.m(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.f2468b, this.c, this.d.longValue(), this.f2469e.longValue(), this.f, (C0053a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }

        public Map<String, String> c() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public e.a d(d dVar) {
            Objects.requireNonNull(dVar, "Null encodedPayload");
            this.c = dVar;
            return this;
        }

        public e.a e(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        public e.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        public e.a g(long j2) {
            this.f2469e = Long.valueOf(j2);
            return this;
        }
    }

    public a(String str, Integer num, d dVar, long j2, long j3, Map map, C0053a aVar) {
        this.a = str;
        this.f2466b = num;
        this.c = dVar;
        this.d = j2;
        this.f2467e = j3;
        this.f = map;
    }

    public Map<String, String> b() {
        return this.f;
    }

    @Nullable
    public Integer c() {
        return this.f2466b;
    }

    public d d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f2466b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof b.l.a.a.f.e
            r2 = 0
            if (r1 == 0) goto L_0x005b
            b.l.a.a.f.e r8 = (b.l.a.a.f.e) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f2466b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.c()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            b.l.a.a.f.d r1 = r7.c
            b.l.a.a.f.d r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.d
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f2467e
            long r5 = r8.h()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f
            java.util.Map r8 = r8.b()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.a.f.a.equals(java.lang.Object):boolean");
    }

    public String g() {
        return this.a;
    }

    public long h() {
        return this.f2467e;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f2466b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.d;
        long j3 = this.f2467e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("EventInternal{transportName=");
        y.append(this.a);
        y.append(", code=");
        y.append(this.f2466b);
        y.append(", encodedPayload=");
        y.append(this.c);
        y.append(", eventMillis=");
        y.append(this.d);
        y.append(", uptimeMillis=");
        y.append(this.f2467e);
        y.append(", autoMetadata=");
        y.append(this.f);
        y.append("}");
        return y.toString();
    }
}
