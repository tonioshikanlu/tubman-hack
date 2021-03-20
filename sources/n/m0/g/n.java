package n.m0.g;

import e.x.b.a;
import e.x.c.k;
import java.net.Proxy;
import java.net.URI;
import java.util.List;
import n.m0.c;
import n.z;

public final class n extends k implements a<List<? extends Proxy>> {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m f10227h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Proxy f10228i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z f10229j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(m mVar, Proxy proxy, z zVar) {
        super(0);
        this.f10227h = mVar;
        this.f10228i = proxy;
        this.f10229j = zVar;
    }

    /* renamed from: a */
    public final List<Proxy> e() {
        Proxy proxy = this.f10228i;
        if (proxy != null) {
            return b.q.a.a.l2(proxy);
        }
        URI j2 = this.f10229j.j();
        if (j2.getHost() == null) {
            return c.l(Proxy.NO_PROXY);
        }
        List<Proxy> select = this.f10227h.f10223e.f10047k.select(j2);
        if (!(select == null || select.isEmpty())) {
            return c.y(select);
        }
        return c.l(Proxy.NO_PROXY);
    }
}
