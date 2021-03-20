package l.b.c;

import b.e.a.a.a;

public final class t implements Comparable<t> {

    /* renamed from: j  reason: collision with root package name */
    public static final t f8148j = new t(0, 0);

    /* renamed from: h  reason: collision with root package name */
    public final long f8149h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8150i;

    public t(long j2, long j3) {
        this.f8149h = j2;
        this.f8150i = j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r8 < 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0 < 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            l.b.c.t r8 = (l.b.c.t) r8
            long r0 = r7.f8149h
            long r2 = r8.f8149h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = -1
            r2 = 1
            if (r0 != 0) goto L_0x0019
            long r3 = r7.f8150i
            long r5 = r8.f8150i
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0016
            r8 = 0
            goto L_0x001e
        L_0x0016:
            if (r8 >= 0) goto L_0x001c
            goto L_0x001d
        L_0x0019:
            if (r0 >= 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            r8 = r1
        L_0x001e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.b.c.t.compareTo(java.lang.Object):int");
    }

    public String d() {
        char[] cArr = new char[32];
        h.b(this.f8149h, cArr, 0);
        h.b(this.f8150i, cArr, 16);
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f8149h == tVar.f8149h && this.f8150i == tVar.f8150i;
    }

    public int hashCode() {
        long j2 = this.f8149h;
        long j3 = this.f8150i;
        return ((((int) (j2 ^ (j2 >>> 32))) + 31) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        StringBuilder y = a.y("TraceId{traceId=");
        y.append(d());
        y.append("}");
        return y.toString();
    }
}
