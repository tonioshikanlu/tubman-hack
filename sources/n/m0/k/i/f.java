package n.m0.k.i;

import e.a.a.a.y0.m.o1.c;
import e.x.c.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n.d0;
import n.m0.k.b;
import n.m0.k.h;
import n.m0.k.i.j;

public class f implements k {
    public static final j.a f = new e("com.google.android.gms.org.conscrypt");

    /* renamed from: g  reason: collision with root package name */
    public static final a f10392g;
    public final Method a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f10393b;
    public final Method c;
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<? super SSLSocket> f10394e;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f10392g = aVar;
        Objects.requireNonNull(aVar);
        i.e("com.google.android.gms.org.conscrypt", "packageName");
    }

    public f(Class<? super SSLSocket> cls) {
        i.e(cls, "sslSocketClass");
        this.f10394e = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        i.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.a = declaredMethod;
        this.f10393b = cls.getMethod("setHostname", new Class[]{String.class});
        this.c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.d = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public boolean a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        return this.f10394e.isInstance(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.c.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            i.d(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e2) {
            if (i.a(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError(e4);
        }
    }

    public X509TrustManager c(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        c.t0(sSLSocketFactory);
        return null;
    }

    public boolean d(SSLSocketFactory sSLSocketFactory) {
        i.e(sSLSocketFactory, "sslSocketFactory");
        c.V(sSLSocketFactory);
        return false;
    }

    public boolean e() {
        b.a aVar = b.f10378g;
        return b.f;
    }

    public void f(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.a.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f10393b.invoke(sSLSocket, new Object[]{str});
                }
                this.d.invoke(sSLSocket, new Object[]{h.c.b(list)});
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
