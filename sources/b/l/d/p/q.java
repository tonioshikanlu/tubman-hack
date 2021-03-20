package b.l.d.p;

public class q {
    public final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5045b;

    public q(Class cls, boolean z, o oVar) {
        this.a = cls;
        this.f5045b = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.a.equals(this.a) && qVar.f5045b == this.f5045b;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f5045b).hashCode();
    }
}
