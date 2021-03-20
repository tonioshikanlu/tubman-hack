package b.l.a.c.f.e;

public final class en {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2949b;

    public en(Object obj, int i2) {
        this.a = obj;
        this.f2949b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof en)) {
            return false;
        }
        en enVar = (en) obj;
        return this.a == enVar.a && this.f2949b == enVar.f2949b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.f2949b;
    }
}
