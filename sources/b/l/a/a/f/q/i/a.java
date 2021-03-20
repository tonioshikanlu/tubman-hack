package b.l.a.a.f.q.i;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final long f2542b;
    public final int c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2543e;
    public final int f;

    public a(long j2, int i2, int i3, long j3, int i4, C0057a aVar) {
        this.f2542b = j2;
        this.c = i2;
        this.d = i3;
        this.f2543e = j3;
        this.f = i4;
    }

    public int a() {
        return this.d;
    }

    public long b() {
        return this.f2543e;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.f;
    }

    public long e() {
        return this.f2542b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2542b == dVar.e() && this.c == dVar.c() && this.d == dVar.a() && this.f2543e == dVar.b() && this.f == dVar.d();
    }

    public int hashCode() {
        long j2 = this.f2542b;
        long j3 = this.f2543e;
        return ((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f;
    }

    public String toString() {
        StringBuilder y = b.e.a.a.a.y("EventStoreConfig{maxStorageSizeInBytes=");
        y.append(this.f2542b);
        y.append(", loadBatchSize=");
        y.append(this.c);
        y.append(", criticalSectionEnterTimeoutMs=");
        y.append(this.d);
        y.append(", eventCleanUpAge=");
        y.append(this.f2543e);
        y.append(", maxBlobByteSizePerRow=");
        return b.e.a.a.a.o(y, this.f, "}");
    }
}
