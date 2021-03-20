package n.m0.k;

import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.d0;

public class f extends h {
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f10387e = new a((DefaultConstructorMarker) null);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1.intValue() >= 9) goto L_0x002c;
     */
    static {
        /*
            n.m0.k.f$a r0 = new n.m0.k.f$a
            r1 = 0
            r0.<init>(r1)
            f10387e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r1 = e.c0.h.K(r0)
        L_0x0014:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            r0 = r2
            goto L_0x002c
        L_0x0023:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
            r1.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0021 }
        L_0x002c:
            d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.k.f.<clinit>():void");
    }

    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        i.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((d0) next) != d0.HTTP_1_0) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(b.q.a.a.C(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((d0) it2.next()).f10081h);
        }
        i.d(sSLParameters, "sslParameters");
        Object[] array = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() != 0) {
                    return applicationProtocol;
                }
                if (applicationProtocol.equals("")) {
                    return null;
                }
                return applicationProtocol;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    public X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
