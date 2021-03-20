package n.m0.k;

import com.segment.analytics.integrations.BasePayload;
import e.x.c.i;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.c0;
import n.d0;
import n.m0.m.b;
import n.m0.m.c;
import o.e;

public class h {
    public static volatile h a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f10389b = Logger.getLogger(c0.class.getName());
    public static final a c;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final List<String> a(List<? extends d0> list) {
            i.e(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((d0) next) != d0.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(b.q.a.a.C(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((d0) it.next()).f10081h);
            }
            return arrayList2;
        }

        public final byte[] b(List<? extends d0> list) {
            i.e(list, "protocols");
            e eVar = new e();
            Iterator it = ((ArrayList) a(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                eVar.u0(str.length());
                eVar.y0(str);
            }
            return eVar.A();
        }

        public final boolean c() {
            return i.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: n.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: n.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: n.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: n.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: n.m0.k.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: n.m0.k.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (r0 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0120, code lost:
        if (java.lang.Integer.parseInt(r0) >= 9) goto L_0x0183;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0187  */
    static {
        /*
            n.m0.k.h$a r0 = new n.m0.k.h$a
            r1 = 0
            r0.<init>(r1)
            c = r0
            boolean r0 = r0.c()
            r2 = 0
            if (r0 == 0) goto L_0x0088
            n.m0.k.i.c r0 = n.m0.k.i.c.c
            java.util.Map<java.lang.String, java.lang.String> r0 = n.m0.k.i.c.f10391b
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r5 = n.m0.k.i.c.a
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = "logger"
            e.x.c.i.d(r4, r5)
            r4.setUseParentHandlers(r2)
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r5)
            if (r5 == 0) goto L_0x0051
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L_0x005d
        L_0x0051:
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)
            if (r3 == 0) goto L_0x005b
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L_0x005d
        L_0x005b:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L_0x005d:
            r4.setLevel(r3)
            n.m0.k.i.d r3 = n.m0.k.i.d.a
            r4.addHandler(r3)
            goto L_0x001b
        L_0x0066:
            n.m0.k.a r0 = n.m0.k.a.f
            boolean r0 = n.m0.k.a.f10377e
            if (r0 == 0) goto L_0x0072
            n.m0.k.a r0 = new n.m0.k.a
            r0.<init>()
            goto L_0x0073
        L_0x0072:
            r0 = r1
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            goto L_0x018c
        L_0x0077:
            n.m0.k.b$a r0 = n.m0.k.b.f10378g
            boolean r0 = n.m0.k.b.f
            if (r0 == 0) goto L_0x0082
            n.m0.k.b r1 = new n.m0.k.b
            r1.<init>()
        L_0x0082:
            e.x.c.i.c(r1)
        L_0x0085:
            r0 = r1
            goto L_0x018c
        L_0x0088:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r3 = "Security.getProviders()[0]"
            e.x.c.i.d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = e.x.c.i.a(r4, r0)
            if (r0 == 0) goto L_0x00b0
            n.m0.k.d$a r0 = n.m0.k.d.f
            boolean r0 = n.m0.k.d.f10382e
            if (r0 == 0) goto L_0x00ab
            n.m0.k.d r0 = new n.m0.k.d
            r0.<init>()
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            if (r0 == 0) goto L_0x00b0
            goto L_0x018c
        L_0x00b0:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            e.x.c.i.d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "BC"
            boolean r0 = e.x.c.i.a(r4, r0)
            if (r0 == 0) goto L_0x00d6
            n.m0.k.c$a r0 = n.m0.k.c.f
            boolean r0 = n.m0.k.c.f10381e
            if (r0 == 0) goto L_0x00d1
            n.m0.k.c r0 = new n.m0.k.c
            r0.<init>()
            goto L_0x00d2
        L_0x00d1:
            r0 = r1
        L_0x00d2:
            if (r0 == 0) goto L_0x00d6
            goto L_0x018c
        L_0x00d6:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            e.x.c.i.d(r0, r3)
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "OpenJSSE"
            boolean r0 = e.x.c.i.a(r3, r0)
            if (r0 == 0) goto L_0x00fc
            n.m0.k.g$a r0 = n.m0.k.g.f
            boolean r0 = n.m0.k.g.f10388e
            if (r0 == 0) goto L_0x00f7
            n.m0.k.g r0 = new n.m0.k.g
            r0.<init>()
            goto L_0x00f8
        L_0x00f7:
            r0 = r1
        L_0x00f8:
            if (r0 == 0) goto L_0x00fc
            goto L_0x018c
        L_0x00fc:
            n.m0.k.f$a r0 = n.m0.k.f.f10387e
            boolean r0 = n.m0.k.f.d
            if (r0 == 0) goto L_0x0108
            n.m0.k.f r0 = new n.m0.k.f
            r0.<init>()
            goto L_0x0109
        L_0x0108:
            r0 = r1
        L_0x0109:
            if (r0 == 0) goto L_0x010d
            goto L_0x018c
        L_0x010d:
            java.lang.String r0 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r0 = java.lang.System.getProperty(r0, r3)
            java.lang.String r3 = "jvmVersion"
            e.x.c.i.d(r0, r3)     // Catch:{ NumberFormatException -> 0x0123 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0123 }
            r3 = 9
            if (r0 < r3) goto L_0x0123
            goto L_0x0183
        L_0x0123:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            r3 = 1
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r10 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r11 = java.lang.Class.forName(r5, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6[r3] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r7 = r0.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r8 = r0.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r3[r2] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            n.m0.k.e r0 = new n.m0.k.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "putMethod"
            e.x.c.i.d(r7, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "getMethod"
            e.x.c.i.d(r8, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "removeMethod"
            e.x.c.i.d(r9, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "clientProviderClass"
            e.x.c.i.d(r10, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            java.lang.String r2 = "serverProviderClass"
            e.x.c.i.d(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0183 }
            r1 = r0
        L_0x0183:
            if (r1 == 0) goto L_0x0187
            goto L_0x0085
        L_0x0187:
            n.m0.k.h r0 = new n.m0.k.h
            r0.<init>()
        L_0x018c:
            a = r0
            java.lang.Class<n.c0> r0 = n.c0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f10389b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.k.h.<clinit>():void");
    }

    public static /* synthetic */ void j(h hVar, String str, int i2, Throwable th, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 4;
        }
        int i4 = i3 & 4;
        hVar.i(str, i2, (Throwable) null);
    }

    public void a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
    }

    public c b(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        return new n.m0.m.a(c(x509TrustManager));
    }

    public n.m0.m.e c(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        i.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        i.e(socket, "socket");
        i.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i2);
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return null;
    }

    public Object g(String str) {
        i.e(str, "closer");
        if (f10389b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean h(String str) {
        i.e(str, "hostname");
        return true;
    }

    public void i(String str, int i2, Throwable th) {
        i.e(str, "message");
        f10389b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void k(String str, Object obj) {
        i.e(str, "message");
        if (obj == null) {
            str = b.e.a.a.a.m(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext instance = SSLContext.getInstance("TLS");
        i.d(instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        try {
            SSLContext l2 = l();
            l2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = l2.getSocketFactory();
            i.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        i.d(instance, "factory");
        TrustManager[] trustManagers = instance.getTrustManagers();
        i.c(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder y = b.e.a.a.a.y("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        i.d(arrays, "java.util.Arrays.toString(this)");
        y.append(arrays);
        throw new IllegalStateException(y.toString().toString());
    }

    public X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            i.d(cls, "sslContextClass");
            Object s = n.m0.c.s(sSLSocketFactory, cls, BasePayload.CONTEXT_KEY);
            if (s != null) {
                return (X509TrustManager) n.m0.c.s(s, X509TrustManager.class, "trustManager");
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        i.d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
