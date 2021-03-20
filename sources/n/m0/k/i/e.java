package n.m0.k.i;

import b.e.a.a.a;
import e.c0.h;
import e.x.c.i;
import javax.net.ssl.SSLSocket;
import n.m0.k.i.f;
import n.m0.k.i.j;

public final class e implements j.a {
    public final /* synthetic */ String a;

    public e(String str) {
        this.a = str;
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        i.d(name, "sslSocket.javaClass.name");
        return h.C(name, a.p(new StringBuilder(), this.a, '.'), false, 2);
    }

    public k b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        f.a aVar = f.f10392g;
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (cls2 != null && (!i.a(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        i.c(cls2);
        return new f(cls2);
    }
}
