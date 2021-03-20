package n.m0.k;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import e.x.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n.d0;
import n.m0.k.i.b;
import n.m0.k.i.f;
import n.m0.k.i.g;
import n.m0.k.i.j;
import n.m0.k.i.k;
import n.m0.m.c;

public final class a extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f10377e = (h.c.c() && Build.VERSION.SDK_INT >= 29);
    public static final a f = null;
    public final List<k> d;

    public a() {
        k[] kVarArr = new k[4];
        kVarArr[0] = i.a("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new n.m0.k.i.a() : null;
        f.a aVar = f.f10392g;
        kVarArr[1] = new j(f.f);
        kVarArr[2] = new j(n.m0.k.i.i.a);
        kVarArr[3] = new j(g.a);
        List D = e.t.g.D(kVarArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) D).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((k) next).e()) {
                arrayList.add(next);
            }
        }
        this.d = arrayList;
    }

    public c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        i.e(x509TrustManager, "trustManager");
        i.e(x509TrustManager, "trustManager");
        b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : super.b(x509TrustManager);
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        T t;
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            kVar.f(sSLSocket, str, list);
        }
    }

    public String f(SSLSocket sSLSocket) {
        T t;
        i.e(sSLSocket, "sslSocket");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            return kVar.b(sSLSocket);
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public boolean h(String str) {
        i.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        T t;
        i.e(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((k) t).d(sSLSocketFactory)) {
                break;
            }
        }
        k kVar = (k) t;
        if (kVar != null) {
            return kVar.c(sSLSocketFactory);
        }
        return null;
    }
}
