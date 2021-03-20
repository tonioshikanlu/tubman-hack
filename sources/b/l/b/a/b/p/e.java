package b.l.b.a.b.p;

import b.l.a.c.b.a;
import b.l.b.a.b.k;
import com.google.api.client.http.HttpTransport;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HttpsURLConnection;

public final class e extends HttpTransport {
    public static final String[] d;
    public final a c;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        d = strArr;
        Arrays.sort(strArr);
    }

    public e() {
        this.c = System.getProperty("com.google.api.client.should_use_proxy") != null ? new b(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))))) : new b();
    }

    public k a(String str, String str2) {
        a.p(Arrays.binarySearch(d, str) >= 0, "HTTP method %s not supported", str);
        HttpURLConnection a = this.c.a(new URL(str2));
        a.setRequestMethod(str);
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
        }
        return new c(a);
    }
}
