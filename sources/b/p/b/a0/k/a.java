package b.p.b.a0.k;

import b.p.b.b;
import b.p.b.o;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class a implements b {
    public static final b a = new a();

    public final InetAddress a(Proxy proxy, o oVar) {
        if (proxy == null || proxy.type() == Proxy.Type.DIRECT) {
            return InetAddress.getByName(oVar.d);
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }
}
