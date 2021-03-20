package b.l.c.b;

import b.l.c.b.o;
import java.util.Iterator;
import java.util.Objects;

public class h extends s<E> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f4866h;

    public h(i iVar) {
        this.f4866h = iVar;
    }

    public o<E> d() {
        return this.f4866h;
    }

    public Iterator<o.a<E>> iterator() {
        g0 g0Var = (g0) ((d) this.f4866h).f4841k;
        Objects.requireNonNull(g0Var);
        return new h0(g0Var);
    }

    public int size() {
        return ((d) this.f4866h).f4841k.entrySet().size();
    }
}
