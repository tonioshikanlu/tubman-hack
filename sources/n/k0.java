package n;

import b.e.a.a.a;
import e.x.c.i;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class k0 {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f10140b;
    public final InetSocketAddress c;

    public k0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        i.e(aVar, "address");
        i.e(proxy, "proxy");
        i.e(inetSocketAddress, "socketAddress");
        this.a = aVar;
        this.f10140b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.f != null && this.f10140b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return i.a(k0Var.a, this.a) && i.a(k0Var.f10140b, this.f10140b) && i.a(k0Var.c, this.c);
        }
    }

    public int hashCode() {
        int hashCode = this.f10140b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder y = a.y("Route{");
        y.append(this.c);
        y.append('}');
        return y.toString();
    }
}
