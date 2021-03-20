package e.t;

import e.x.b.a;
import e.x.c.k;
import java.util.Iterator;

public final class m extends k implements a<Iterator<? extends T>> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Iterable f7932h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(Iterable iterable) {
        super(0);
        this.f7932h = iterable;
    }

    public Object e() {
        return this.f7932h.iterator();
    }
}
