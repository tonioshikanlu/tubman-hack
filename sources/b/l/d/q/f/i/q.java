package b.l.d.q.f.i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.d.q.f.i.v;

public final class q extends v.d.C0082d.a.b.C0086d.C0087a {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5246b;
    public final String c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5247e;

    public static final class b extends v.d.C0082d.a.b.C0086d.C0087a.C0088a {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public String f5248b;
        public String c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f5249e;

        public v.d.C0082d.a.b.C0086d.C0087a a() {
            String str = this.a == null ? " pc" : "";
            if (this.f5248b == null) {
                str = b.e.a.a.a.m(str, " symbol");
            }
            if (this.d == null) {
                str = b.e.a.a.a.m(str, " offset");
            }
            if (this.f5249e == null) {
                str = b.e.a.a.a.m(str, " importance");
            }
            if (str.isEmpty()) {
                return new q(this.a.longValue(), this.f5248b, this.c, this.d.longValue(), this.f5249e.intValue(), (a) null);
            }
            throw new IllegalStateException(b.e.a.a.a.m("Missing required properties:", str));
        }
    }

    public q(long j2, String str, String str2, long j3, int i2, a aVar) {
        this.a = j2;
        this.f5246b = str;
        this.c = str2;
        this.d = j3;
        this.f5247e = i2;
    }

    @Nullable
    public String a() {
        return this.c;
    }

    public int b() {
        return this.f5247e;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.a;
    }

    @NonNull
    public String e() {
        return this.f5246b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof b.l.d.q.f.i.v.d.C0082d.a.b.C0086d.C0087a
            r2 = 0
            if (r1 == 0) goto L_0x004b
            b.l.d.q.f.i.v$d$d$a$b$d$a r8 = (b.l.d.q.f.i.v.d.C0082d.a.b.C0086d.C0087a) r8
            long r3 = r7.a
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f5246b
            java.lang.String r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.a()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.d
            long r5 = r8.c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f5247e
            int r8 = r8.b()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.i.q.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f5246b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f5247e;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("Frame{pc=");
        y.append(this.a);
        y.append(", symbol=");
        y.append(this.f5246b);
        y.append(", file=");
        y.append(this.c);
        y.append(", offset=");
        y.append(this.d);
        y.append(", importance=");
        return b.e.a.a.a.o(y, this.f5247e, "}");
    }
}
