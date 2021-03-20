package e.x.c;

public final class o implements c {

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f7986h;

    public o(Class<?> cls, String str) {
        i.e(cls, "jClass");
        i.e(str, "moduleName");
        this.f7986h = cls;
    }

    public Class<?> e() {
        return this.f7986h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && i.a(this.f7986h, ((o) obj).f7986h);
    }

    public int hashCode() {
        return this.f7986h.hashCode();
    }

    public String toString() {
        return this.f7986h.toString() + " (Kotlin reflection is not available)";
    }
}
