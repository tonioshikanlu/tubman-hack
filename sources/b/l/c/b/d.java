package b.l.c.b;

import java.util.Iterator;

public class d extends i<E> {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f4841k;

    public d(e eVar) {
        this.f4841k = eVar;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [b.l.c.b.o, b.l.c.b.b0] */
    public Iterator<E> iterator() {
        ? t = this.f4841k.t();
        return new u(t, t.entrySet().iterator());
    }
}
