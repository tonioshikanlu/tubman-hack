package l.b.c;

import l.b.c.n;

@Deprecated
public final class e extends n {
    public final n.a a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8113b;
    public final long c;
    public final long d;

    public e(l.b.a.a aVar, n.a aVar2, long j2, long j3, long j4, a aVar3) {
        this.a = aVar2;
        this.f8113b = j2;
        this.c = j3;
        this.d = j4;
    }

    public long a() {
        return this.d;
    }

    public void b() {
    }

    public long c() {
        return this.f8113b;
    }

    public n.a d() {
        return this.a;
    }

    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        nVar.b();
        return this.a.equals(nVar.d()) && this.f8113b == nVar.c() && this.c == nVar.e() && this.d == nVar.a();
    }

    public int hashCode() {
        long j2 = this.f8113b;
        long j3 = this.c;
        long j4 = this.d;
        return (int) (((long) (((int) (((long) (((int) (((long) ((-721379959 ^ this.a.hashCode()) * 1000003)) ^ (j2 ^ (j2 >>> 32)))) * 1000003)) ^ (j3 ^ (j3 >>> 32)))) * 1000003)) ^ (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "NetworkEvent{kernelTimestamp=" + null + ", type=" + this.a + ", messageId=" + this.f8113b + ", uncompressedMessageSize=" + this.c + ", compressedMessageSize=" + this.d + "}";
    }
}
