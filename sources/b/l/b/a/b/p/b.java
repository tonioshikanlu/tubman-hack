package b.l.b.a.b.p;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public class b implements a {
    public final Proxy a;

    public b() {
        this.a = null;
    }

    public b(Proxy proxy) {
        this.a = proxy;
    }

    public HttpURLConnection a(URL url) {
        Proxy proxy = this.a;
        return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
    }
}
