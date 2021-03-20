package b.p.b;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

public final class y {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f6776b;
    public final InetSocketAddress c;

    public y(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.a = aVar;
        this.f6776b = proxy;
        this.c = inetSocketAddress;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a.equals(yVar.a) && this.f6776b.equals(yVar.f6776b) && this.c.equals(yVar.c);
    }

    public int hashCode() {
        int hashCode = this.f6776b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }
}
