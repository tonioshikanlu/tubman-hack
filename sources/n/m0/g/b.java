package n.m0.g;

import e.u.a;
import e.x.c.i;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import n.k;
import n.m0.c;
import n.n;

public final class b {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10166b;
    public boolean c;
    public final List<n> d;

    public b(List<n> list) {
        i.e(list, "connectionSpecs");
        this.d = list;
    }

    public final n a(SSLSocket sSLSocket) {
        n nVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        i.e(sSLSocket, "sslSocket");
        int i2 = this.a;
        int size = this.d.size();
        while (true) {
            if (i2 >= size) {
                nVar = null;
                break;
            }
            nVar = this.d.get(i2);
            if (nVar.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (nVar != null) {
            int i3 = this.a;
            int size2 = this.d.size();
            while (true) {
                if (i3 >= size2) {
                    z = false;
                    break;
                } else if (this.d.get(i3).b(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.f10166b = z;
            boolean z2 = this.c;
            i.e(sSLSocket, "sslSocket");
            if (nVar.c != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                i.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                String[] strArr3 = nVar.c;
                k.b bVar = k.t;
                Comparator<String> comparator = k.f10127b;
                strArr = c.p(enabledCipherSuites, strArr3, k.f10127b);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (nVar.d != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                i.d(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = c.p(enabledProtocols, nVar.d, a.f7942h);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            i.d(supportedCipherSuites, "supportedCipherSuites");
            k.b bVar2 = k.t;
            Comparator<String> comparator2 = k.f10127b;
            Comparator<String> comparator3 = k.f10127b;
            byte[] bArr = c.a;
            i.e(supportedCipherSuites, "$this$indexOf");
            i.e("TLS_FALLBACK_SCSV", "value");
            i.e(comparator3, "comparator");
            int length = supportedCipherSuites.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                }
                if (((k.a) comparator3).compare(supportedCipherSuites[i4], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i4++;
            }
            if (z2 && i4 != -1) {
                i.d(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i4];
                i.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
                i.e(strArr, "$this$concat");
                i.e(str, "value");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                i.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[b.q.a.a.V0(strArr)] = str;
            }
            n.a aVar = new n.a(nVar);
            i.d(strArr, "cipherSuitesIntersection");
            aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
            i.d(strArr2, "tlsVersionsIntersection");
            aVar.e((String[]) Arrays.copyOf(strArr2, strArr2.length));
            n a2 = aVar.a();
            if (a2.c() != null) {
                sSLSocket.setEnabledProtocols(a2.d);
            }
            if (a2.a() != null) {
                sSLSocket.setEnabledCipherSuites(a2.c);
            }
            return nVar;
        }
        StringBuilder y = b.e.a.a.a.y("Unable to find acceptable protocols. isFallback=");
        y.append(this.c);
        y.append(',');
        y.append(" modes=");
        y.append(this.d);
        y.append(',');
        y.append(" supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        i.c(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        i.d(arrays, "java.util.Arrays.toString(this)");
        y.append(arrays);
        throw new UnknownServiceException(y.toString());
    }
}
