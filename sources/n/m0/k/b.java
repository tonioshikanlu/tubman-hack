package n.m0.k;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import e.x.c.i;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.d0;
import n.m0.k.i.f;
import n.m0.k.i.g;
import n.m0.k.i.h;
import n.m0.k.i.j;
import n.m0.k.i.k;
import n.m0.k.i.l;
import n.m0.m.c;
import n.m0.m.e;

public final class b extends h {
    public static final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f10378g = new a((DefaultConstructorMarker) null);
    public final List<k> d;

    /* renamed from: e  reason: collision with root package name */
    public final h f10379e;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: n.m0.k.b$b  reason: collision with other inner class name */
    public static final class C0236b implements e {
        public final X509TrustManager a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f10380b;

        public C0236b(X509TrustManager x509TrustManager, Method method) {
            i.e(x509TrustManager, "trustManager");
            i.e(method, "findByIssuerAndSignatureMethod");
            this.a = x509TrustManager;
            this.f10380b = method;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            i.e(x509Certificate, "cert");
            try {
                Object invoke = this.f10380b.invoke(this.a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0236b)) {
                return false;
            }
            C0236b bVar = (C0236b) obj;
            return i.a(this.a, bVar.a) && i.a(this.f10380b, bVar.f10380b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.a;
            int i2 = 0;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f10380b;
            if (method != null) {
                i2 = method.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder y = b.e.a.a.a.y("CustomTrustRootIndex(trustManager=");
            y.append(this.a);
            y.append(", findByIssuerAndSignatureMethod=");
            y.append(this.f10380b);
            y.append(")");
            return y.toString();
        }
    }

    static {
        boolean z = false;
        if (h.c.c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f = z;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        l.a aVar = l.f10397j;
        i.e("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt" + ".OpenSSLSocketFactoryImpl");
            Class<?> cls3 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            i.d(cls3, "paramsClass");
            lVar = new l(cls, cls2, cls3);
        } catch (Exception e2) {
            h.a.i("unable to load android socket classes", 5, e2);
            lVar = null;
        }
        kVarArr[0] = lVar;
        f.a aVar2 = f.f10392g;
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
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", new Class[0]);
            method = cls4.getMethod("open", new Class[]{String.class});
            method2 = cls4.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f10379e = new h(method3, method, method2);
    }

    public c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        i.e(x509TrustManager, "trustManager");
        i.e(x509TrustManager, "trustManager");
        n.m0.k.i.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new n.m0.k.i.b(x509TrustManager, x509TrustManagerExtensions);
        }
        return bVar != null ? bVar : super.b(x509TrustManager);
    }

    public e c(X509TrustManager x509TrustManager) {
        i.e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            i.d(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0236b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    public void d(SSLSocket sSLSocket, String str, List<d0> list) {
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

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        i.e(socket, "socket");
        i.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
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

    public Object g(String str) {
        i.e(str, "closer");
        h hVar = this.f10379e;
        Objects.requireNonNull(hVar);
        i.e(str, "closer");
        Method method = hVar.a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            Method method2 = hVar.f10395b;
            i.c(method2);
            method2.invoke(invoke, new Object[]{str});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean h(String str) {
        i.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public void k(String str, Object obj) {
        i.e(str, "message");
        h hVar = this.f10379e;
        Objects.requireNonNull(hVar);
        boolean z = false;
        if (obj != null) {
            try {
                Method method = hVar.c;
                i.c(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            h.j(this, str, 5, (Throwable) null, 4, (Object) null);
        }
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
