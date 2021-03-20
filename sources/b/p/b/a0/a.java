package b.p.b.a0;

import b.p.b.j;
import b.p.b.r;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

public final class a {
    public final List<j> a;

    /* renamed from: b  reason: collision with root package name */
    public int f6470b = 0;
    public boolean c;
    public boolean d;

    public a(List<j> list) {
        this.a = list;
    }

    public j a(SSLSocket sSLSocket) {
        j jVar;
        boolean z;
        int i2 = this.f6470b;
        int size = this.a.size();
        while (true) {
            if (i2 >= size) {
                jVar = null;
                break;
            }
            jVar = this.a.get(i2);
            if (jVar.a(sSLSocket)) {
                this.f6470b = i2 + 1;
                break;
            }
            i2++;
        }
        if (jVar != null) {
            int i3 = this.f6470b;
            while (true) {
                if (i3 >= this.a.size()) {
                    z = false;
                    break;
                } else if (this.a.get(i3).a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.c = z;
            b bVar = b.f6471b;
            boolean z2 = this.d;
            Objects.requireNonNull((r.a) bVar);
            Class<String> cls = String.class;
            String[] strArr = jVar.c;
            String[] enabledCipherSuites = strArr != null ? (String[]) i.j(cls, strArr, sSLSocket.getEnabledCipherSuites()) : sSLSocket.getEnabledCipherSuites();
            String[] strArr2 = jVar.d;
            String[] enabledProtocols = strArr2 != null ? (String[]) i.j(cls, strArr2, sSLSocket.getEnabledProtocols()) : sSLSocket.getEnabledProtocols();
            if (z2) {
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                byte[] bArr = i.a;
                if (Arrays.asList(supportedCipherSuites).contains("TLS_FALLBACK_SCSV")) {
                    int length = enabledCipherSuites.length + 1;
                    String[] strArr3 = new String[length];
                    System.arraycopy(enabledCipherSuites, 0, strArr3, 0, enabledCipherSuites.length);
                    strArr3[length - 1] = "TLS_FALLBACK_SCSV";
                    enabledCipherSuites = strArr3;
                }
            }
            j.b bVar2 = new j.b(jVar);
            bVar2.b(enabledCipherSuites);
            bVar2.d(enabledProtocols);
            j a2 = bVar2.a();
            String[] strArr4 = a2.d;
            if (strArr4 != null) {
                sSLSocket.setEnabledProtocols(strArr4);
            }
            String[] strArr5 = a2.c;
            if (strArr5 != null) {
                sSLSocket.setEnabledCipherSuites(strArr5);
            }
            return jVar;
        }
        StringBuilder y = b.e.a.a.a.y("Unable to find acceptable protocols. isFallback=");
        y.append(this.d);
        y.append(", modes=");
        y.append(this.a);
        y.append(", supported protocols=");
        y.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(y.toString());
    }
}
