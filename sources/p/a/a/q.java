package p.a.a;

public final class q {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final o f10533b;
    public volatile boolean c = true;

    public q(Object obj, o oVar) {
        this.a = obj;
        this.f10533b = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.f10533b.equals(qVar.f10533b);
    }

    public int hashCode() {
        return this.f10533b.f.hashCode() + this.a.hashCode();
    }
}
