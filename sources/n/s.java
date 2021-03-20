package n;

import b.q.a.a;
import e.x.c.i;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public final class s implements t {
    public List<InetAddress> a(String str) {
        i.e(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            i.d(allByName, "InetAddress.getAllByName(hostname)");
            return a.g3(allByName);
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException = new UnknownHostException(b.e.a.a.a.m("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }
}
