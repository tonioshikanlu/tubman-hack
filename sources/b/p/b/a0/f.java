package b.p.b.a0;

import b.p.b.s;
import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.e;

public class f {
    public static final f a;

    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f6474b;
        public final e<Socket> c;
        public final e<Socket> d;

        /* renamed from: e  reason: collision with root package name */
        public final e<Socket> f6475e;
        public final e<Socket> f;

        public a(Class<?> cls, e<Socket> eVar, e<Socket> eVar2, Method method, Method method2, e<Socket> eVar3, e<Socket> eVar4) {
            this.f6474b = cls;
            this.c = eVar;
            this.d = eVar2;
            this.f6475e = eVar3;
            this.f = eVar4;
        }

        public void b(SSLSocket sSLSocket, String str, List<s> list) {
            if (str != null) {
                this.c.c(sSLSocket, Boolean.TRUE);
                this.d.c(sSLSocket, str);
            }
            e<Socket> eVar = this.f;
            if (eVar != null) {
                if (eVar.a(sSLSocket.getClass()) != null) {
                    Object[] objArr = new Object[1];
                    e eVar2 = new e();
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        s sVar = list.get(i2);
                        if (sVar != s.HTTP_1_0) {
                            eVar2.u0(sVar.f6755h.length());
                            eVar2.y0(sVar.f6755h);
                        }
                    }
                    objArr[0] = eVar2.A();
                    this.f.d(sSLSocket, objArr);
                }
            }
        }

        public void c(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
            try {
                socket.connect(inetSocketAddress, i2);
            } catch (AssertionError e2) {
                if (i.k(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            } catch (SecurityException e3) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e3);
                throw iOException;
            }
        }

        public String d(SSLSocket sSLSocket) {
            byte[] bArr;
            e<Socket> eVar = this.f6475e;
            if (eVar == null) {
                return null;
            }
            if ((eVar.a(sSLSocket.getClass()) != null) && (bArr = (byte[]) this.f6475e.d(sSLSocket, new Object[0])) != null) {
                return new String(bArr, i.c);
            }
            return null;
        }

        public X509TrustManager f(SSLSocketFactory sSLSocketFactory) {
            Object e2 = f.e(sSLSocketFactory, this.f6474b, "sslParameters");
            if (e2 == null) {
                try {
                    e2 = f.e(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            }
            X509TrustManager x509TrustManager = (X509TrustManager) f.e(e2, X509TrustManager.class, "x509TrustManager");
            return x509TrustManager != null ? x509TrustManager : (X509TrustManager) f.e(e2, X509TrustManager.class, "trustManager");
        }

        public b.p.b.a0.m.f g(X509TrustManager x509TrustManager) {
            b.p.b.a0.m.a aVar;
            try {
                Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
                declaredMethod.setAccessible(true);
                aVar = new b.p.b.a0.m.a(x509TrustManager, declaredMethod);
            } catch (NoSuchMethodException unused) {
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
            return new b.p.b.a0.m.e(x509TrustManager.getAcceptedIssuers());
        }
    }

    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f6476b;

        public b(Class<?> cls) {
            this.f6476b = cls;
        }

        public X509TrustManager f(SSLSocketFactory sSLSocketFactory) {
            Object e2 = f.e(sSLSocketFactory, this.f6476b, BasePayload.CONTEXT_KEY);
            if (e2 == null) {
                return null;
            }
            return (X509TrustManager) f.e(e2, X509TrustManager.class, "trustManager");
        }
    }

    public static class c extends b {
        public final Method c;
        public final Method d;

        /* renamed from: e  reason: collision with root package name */
        public final Method f6477e;
        public final Class<?> f;

        /* renamed from: g  reason: collision with root package name */
        public final Class<?> f6478g;

        public c(Class<?> cls, Method method, Method method2, Method method3, Class<?> cls2, Class<?> cls3) {
            super(cls);
            this.c = method;
            this.d = method2;
            this.f6477e = method3;
            this.f = cls2;
            this.f6478g = cls3;
        }

        public void a(SSLSocket sSLSocket) {
            try {
                this.f6477e.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        public void b(SSLSocket sSLSocket, String str, List<s> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                s sVar = list.get(i2);
                if (sVar != s.HTTP_1_0) {
                    arrayList.add(sVar.f6755h);
                }
            }
            try {
                this.c.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f, this.f6478g}, new d(arrayList))});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }

        public String d(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.d.invoke((Object) null, new Object[]{sSLSocket}));
                boolean z = dVar.f6479b;
                if (!z && dVar.c == null) {
                    b.a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return dVar.c;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    public static class d implements InvocationHandler {
        public final List<String> a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6479b;
        public String c;

        public d(List<String> list) {
            this.a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = i.f6481b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f6479b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            obj2 = this.a.get(0);
                            break;
                        } else if (this.a.contains(list.get(i2))) {
                            obj2 = list.get(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                    String str = (String) obj2;
                    this.c = str;
                    return str;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: b.p.b.a0.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: b.p.b.a0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: b.p.b.a0.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: b.p.b.a0.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: b.p.b.a0.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: b.p.b.a0.f$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: b.p.b.a0.f$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: b.p.b.a0.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: b.p.b.a0.e} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:35|34|36|37|38|39|40|41|42|43) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c9 */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x000c }
        L_0x000a:
            r5 = r3
            goto L_0x0013
        L_0x000c:
            java.lang.String r3 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x007c }
            goto L_0x000a
        L_0x0013:
            b.p.b.a0.e r6 = new b.p.b.a0.e     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.String r3 = "setUseSessionTickets"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007c }
            r4[r2] = r7     // Catch:{ ClassNotFoundException -> 0x007c }
            r7 = 0
            r6.<init>(r7, r3, r4)     // Catch:{ ClassNotFoundException -> 0x007c }
            b.p.b.a0.e r3 = new b.p.b.a0.e     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.String r4 = "setHostname"
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r2] = r9     // Catch:{ ClassNotFoundException -> 0x007c }
            r3.<init>(r7, r4, r8)     // Catch:{ ClassNotFoundException -> 0x007c }
            java.lang.String r4 = "android.net.TrafficStats"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0070 }
            java.lang.String r8 = "tagSocket"
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0070 }
            java.lang.Class<java.net.Socket> r10 = java.net.Socket.class
            r9[r2] = r10     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0070 }
            java.lang.reflect.Method r8 = r4.getMethod(r8, r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0070 }
            java.lang.String r9 = "untagSocket"
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.Class<java.net.Socket> r11 = java.net.Socket.class
            r10[r2] = r11     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006e }
            java.lang.String r9 = "android.net.Network"
            java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006b }
            b.p.b.a0.e r9 = new b.p.b.a0.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006b }
            java.lang.String r10 = "getAlpnSelectedProtocol"
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006b }
            r9.<init>(r0, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006b }
            b.p.b.a0.e r10 = new b.p.b.a0.e     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            java.lang.String r11 = "setAlpnProtocols"
            java.lang.Class[] r12 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            r12[r2] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            r10.<init>(r7, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            r11 = r10
            goto L_0x0068
        L_0x0067:
            r11 = r7
        L_0x0068:
            r10 = r9
            r9 = r4
            goto L_0x0074
        L_0x006b:
            r9 = r4
            r10 = r7
            goto L_0x0073
        L_0x006e:
            r9 = r7
            goto L_0x0072
        L_0x0070:
            r8 = r7
            r9 = r8
        L_0x0072:
            r10 = r9
        L_0x0073:
            r11 = r10
        L_0x0074:
            b.p.b.a0.f$a r0 = new b.p.b.a0.f$a     // Catch:{ ClassNotFoundException -> 0x007c }
            r4 = r0
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException -> 0x007c }
            goto L_0x00d5
        L_0x007c:
            java.lang.String r0 = "sun.security.ssl.SSLContextImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00d0 }
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r8 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r9 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r5 = "put"
            r6 = 2
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            r6[r1] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.reflect.Method r5 = r3.getMethod(r5, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r4 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r6[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.reflect.Method r6 = r3.getMethod(r4, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.Class<javax.net.ssl.SSLSocket> r7 = javax.net.ssl.SSLSocket.class
            r1[r2] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            java.lang.reflect.Method r7 = r3.getMethod(r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            b.p.b.a0.f$c r1 = new b.p.b.a0.f$c     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            r3 = r1
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00c9 }
            goto L_0x00ce
        L_0x00c9:
            b.p.b.a0.f$b r1 = new b.p.b.a0.f$b     // Catch:{ ClassNotFoundException -> 0x00d0 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x00d0 }
        L_0x00ce:
            r0 = r1
            goto L_0x00d5
        L_0x00d0:
            b.p.b.a0.f r0 = new b.p.b.a0.f
            r0.<init>()
        L_0x00d5:
            a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.f.<clinit>():void");
    }

    public static <T> T e(Object obj, Class<T> cls, String str) {
        Object e2;
        Class<Object> cls2 = Object.class;
        Class cls3 = obj.getClass();
        while (cls3 != cls2) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    if (cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                }
                return null;
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }
        if (str.equals("delegate") || (e2 = e(obj, cls2, "delegate")) == null) {
            return null;
        }
        return e(e2, cls, str);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void b(SSLSocket sSLSocket, String str, List<s> list) {
    }

    public void c(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public X509TrustManager f(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    public b.p.b.a0.m.f g(X509TrustManager x509TrustManager) {
        return new b.p.b.a0.m.e(x509TrustManager.getAcceptedIssuers());
    }
}
