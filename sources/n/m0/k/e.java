package n.m0.k;

import e.x.c.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import n.d0;

public final class e extends h {
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f10383e;
    public final Method f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f10384g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f10385h;

    public static final class a implements InvocationHandler {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public String f10386b;
        public final List<String> c;

        public a(List<String> list) {
            i.e(list, "protocols");
            this.c = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            i.e(obj, "proxy");
            i.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (i.a(name, "supports") && i.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!i.a(name, "unsupported") || !i.a(Void.TYPE, returnType)) {
                if (i.a(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.c;
                    }
                }
                if ((i.a(name, "selectProtocol") || i.a(name, "select")) && i.a(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i2 = 0;
                        while (true) {
                            Object obj3 = list.get(i2);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.c.contains(str)) {
                                if (i2 == size) {
                                    break;
                                }
                                i2++;
                            } else {
                                this.f10386b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.c.get(0);
                    this.f10386b = str2;
                    return str2;
                } else if ((!i.a(name, "protocolSelected") && !i.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.f10386b = (String) obj4;
                    return null;
                }
            } else {
                this.a = true;
                return null;
            }
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        i.e(method, "putMethod");
        i.e(method2, "getMethod");
        i.e(method3, "removeMethod");
        i.e(cls, "clientProviderClass");
        i.e(cls2, "serverProviderClass");
        this.d = method;
        this.f10383e = method2;
        this.f = method3;
        this.f10384g = cls;
        this.f10385h = cls2;
    }

    public void a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        try {
            this.f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends d0> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        i.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((d0) next) == d0.HTTP_1_0) {
                z = false;
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
        try {
            this.d.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f10384g, this.f10385h}, new a(arrayList2))});
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f10383e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z = aVar.a;
                if (!z && aVar.f10386b == null) {
                    h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return aVar.f10386b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
