package b.p.b.a0.k;

import b.p.b.a0.f;
import b.p.b.b;
import b.p.b.g;
import b.p.b.n;
import b.p.b.o;
import b.p.b.t;
import b.p.b.w;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public final class j {
    public static final Comparator<String> a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final String f6655b = "OkHttp";
    public static final String c = b.e.a.a.a.m("OkHttp", "-Sent-Millis");
    public static final String d = b.e.a.a.a.m("OkHttp", "-Received-Millis");

    public static class a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    static {
        Objects.requireNonNull(f.a);
    }

    public static long a(n nVar) {
        String a2 = nVar.a("Content-Length");
        if (a2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static t c(b bVar, w wVar, Proxy proxy) {
        w wVar2 = wVar;
        Proxy proxy2 = proxy;
        int i2 = 0;
        if (wVar2.c == 407) {
            a aVar = (a) bVar;
            Objects.requireNonNull(aVar);
            List<g> b2 = wVar.b();
            t tVar = wVar2.a;
            o oVar = tVar.a;
            int size = b2.size();
            while (i2 < size) {
                g gVar = b2.get(i2);
                if ("Basic".equalsIgnoreCase(gVar.a)) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    String hostName = inetSocketAddress.getHostName();
                    InetAddress a2 = aVar.a(proxy2, oVar);
                    int port = inetSocketAddress.getPort();
                    String str = oVar.a;
                    String str2 = gVar.f6701b;
                    String str3 = gVar.a;
                    try {
                        PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, a2, port, str, str2, str3, new URL(oVar.f6728i), Authenticator.RequestorType.PROXY);
                        if (requestPasswordAuthentication != null) {
                            String e2 = b.l.f.x.a.g.e(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()));
                            t.b c2 = tVar.c();
                            c2.b("Proxy-Authorization", e2);
                            return c2.a();
                        }
                    } catch (MalformedURLException e3) {
                        throw new RuntimeException(e3);
                    }
                }
                i2++;
            }
        } else {
            a aVar2 = (a) bVar;
            Objects.requireNonNull(aVar2);
            List<g> b3 = wVar.b();
            t tVar2 = wVar2.a;
            o oVar2 = tVar2.a;
            int size2 = b3.size();
            while (i2 < size2) {
                g gVar2 = b3.get(i2);
                if ("Basic".equalsIgnoreCase(gVar2.a)) {
                    String str4 = oVar2.d;
                    InetAddress a3 = aVar2.a(proxy2, oVar2);
                    int i3 = oVar2.f6725e;
                    String str5 = oVar2.a;
                    String str6 = gVar2.f6701b;
                    String str7 = gVar2.a;
                    try {
                        PasswordAuthentication requestPasswordAuthentication2 = Authenticator.requestPasswordAuthentication(str4, a3, i3, str5, str6, str7, new URL(oVar2.f6728i), Authenticator.RequestorType.SERVER);
                        if (requestPasswordAuthentication2 != null) {
                            String e4 = b.l.f.x.a.g.e(requestPasswordAuthentication2.getUserName(), new String(requestPasswordAuthentication2.getPassword()));
                            t.b c3 = tVar2.c();
                            c3.b("Authorization", e4);
                            return c3.a();
                        }
                    } catch (MalformedURLException e5) {
                        throw new RuntimeException(e5);
                    }
                }
                i2++;
            }
        }
        return null;
    }

    public static Map<String, List<String>> d(n nVar, String str) {
        TreeMap treeMap = new TreeMap(a);
        int d2 = nVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            String b2 = nVar.b(i2);
            String e2 = nVar.e(i2);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(b2);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(e2);
            treeMap.put(b2, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }
}
