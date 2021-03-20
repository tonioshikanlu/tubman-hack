package b.j.a.c.h0.t;

import b.e.a.a.a;
import b.j.a.b.f;
import b.j.a.b.l;
import b.j.a.b.v.b;
import b.j.a.c.y;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class q extends r0<InetSocketAddress> {
    public q() {
        super(InetSocketAddress.class);
    }

    public /* bridge */ /* synthetic */ void f(Object obj, f fVar, y yVar) {
        q((InetSocketAddress) obj, fVar);
    }

    public void g(Object obj, f fVar, y yVar, b.j.a.c.f0.f fVar2) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        b d = fVar2.d(inetSocketAddress, l.VALUE_STRING);
        d.f1539b = InetSocketAddress.class;
        b e2 = fVar2.e(fVar, d);
        q(inetSocketAddress, fVar);
        fVar2.f(fVar, e2);
    }

    public void q(InetSocketAddress inetSocketAddress, f fVar) {
        String str;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    StringBuilder y = a.y("[");
                    y.append(hostName.substring(1));
                    y.append("]");
                    str = y.toString();
                } else {
                    str = hostName.substring(1);
                }
                hostName = str;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        StringBuilder B = a.B(hostName, ":");
        B.append(inetSocketAddress.getPort());
        fVar.Q0(B.toString());
    }
}
