package p.a.a;

public final class k {
    public j a;

    /* renamed from: b  reason: collision with root package name */
    public j f10525b;

    public synchronized void a(j jVar) {
        j jVar2 = this.f10525b;
        if (jVar2 != null) {
            jVar2.c = jVar;
            this.f10525b = jVar;
        } else if (this.a == null) {
            this.f10525b = jVar;
            this.a = jVar;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }

    public synchronized j b() {
        j jVar;
        jVar = this.a;
        if (jVar != null) {
            j jVar2 = jVar.c;
            this.a = jVar2;
            if (jVar2 == null) {
                this.f10525b = null;
            }
        }
        return jVar;
    }
}
