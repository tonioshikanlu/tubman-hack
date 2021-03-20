package b.l.a.c.f.i;

import b.e.a.a.a;

public final class s3<T> extends r3<T> {

    /* renamed from: h  reason: collision with root package name */
    public final T f3716h;

    public s3(T t) {
        this.f3716h = t;
    }

    public final boolean a() {
        return true;
    }

    public final T b() {
        return this.f3716h;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s3) {
            return this.f3716h.equals(((s3) obj).f3716h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3716h.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3716h);
        return a.r(new StringBuilder(valueOf.length() + 13), "Optional.of(", valueOf, ")");
    }
}
