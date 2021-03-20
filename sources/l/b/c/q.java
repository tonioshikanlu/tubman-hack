package l.b.c;

import b.e.a.a.a;

public final class q implements Comparable<q> {

    /* renamed from: i  reason: collision with root package name */
    public static final q f8129i = new q(0);

    /* renamed from: h  reason: collision with root package name */
    public final long f8130h;

    public q(long j2) {
        this.f8130h = j2;
    }

    public int compareTo(Object obj) {
        int i2 = (this.f8130h > ((q) obj).f8130h ? 1 : (this.f8130h == ((q) obj).f8130h ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return this.f8130h == ((q) obj).f8130h;
    }

    public int hashCode() {
        long j2 = this.f8130h;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        StringBuilder y = a.y("SpanId{spanId=");
        char[] cArr = new char[16];
        h.b(this.f8130h, cArr, 0);
        y.append(new String(cArr));
        y.append("}");
        return y.toString();
    }
}
