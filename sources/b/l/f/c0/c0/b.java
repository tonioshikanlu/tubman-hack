package b.l.f.c0.c0;

public class b {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5595b;

    public b(int i2, int i3) {
        this.a = i2;
        this.f5595b = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.f5595b == bVar.f5595b;
    }

    public final int hashCode() {
        return this.a ^ this.f5595b;
    }

    public final String toString() {
        return this.a + "(" + this.f5595b + ')';
    }
}
