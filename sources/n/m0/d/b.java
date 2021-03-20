package n.m0.d;

import e.t.g;
import e.x.c.i;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.Objects;
import n.c;
import n.t;
import n.z;

public final class b implements c {

    /* renamed from: b  reason: collision with root package name */
    public final t f10153b;

    public b(t tVar, int i2) {
        t tVar2 = (i2 & 1) != 0 ? t.a : null;
        i.e(tVar2, "defaultDns");
        this.f10153b = tVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n.e0 a(n.k0 r21, n.h0 r22) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r0 = "response"
            e.x.c.i.e(r3, r0)
            n.y r4 = r3.f10105m
            int r0 = r3.f10103k
            r5 = 1
            r6 = 401(0x191, float:5.62E-43)
            r7 = 0
            r8 = 407(0x197, float:5.7E-43)
            if (r0 == r6) goto L_0x001f
            if (r0 == r8) goto L_0x001c
            e.t.o r0 = e.t.o.f7934h
            goto L_0x0064
        L_0x001c:
            java.lang.String r0 = "Proxy-Authenticate"
            goto L_0x0021
        L_0x001f:
            java.lang.String r0 = "WWW-Authenticate"
        L_0x0021:
            r6 = r0
            o.h r0 = n.m0.h.e.a
            java.lang.String r0 = "$this$parseChallenges"
            e.x.c.i.e(r4, r0)
            java.lang.String r0 = "headerName"
            e.x.c.i.e(r6, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r4.size()
            r11 = r7
        L_0x0038:
            if (r11 >= r10) goto L_0x0063
            java.lang.String r0 = r4.e(r11)
            boolean r0 = e.c0.h.f(r6, r0, r5)
            if (r0 == 0) goto L_0x0060
            o.e r0 = new o.e
            r0.<init>()
            java.lang.String r12 = r4.p(r11)
            r0.y0(r12)
            n.m0.h.e.b(r0, r9)     // Catch:{ EOFException -> 0x0054 }
            goto L_0x0060
        L_0x0054:
            r0 = move-exception
            r12 = r0
            n.m0.k.h$a r0 = n.m0.k.h.c
            n.m0.k.h r0 = n.m0.k.h.a
            r13 = 5
            java.lang.String r14 = "Unable to parse challenge"
            r0.i(r14, r13, r12)
        L_0x0060:
            int r11 = r11 + 1
            goto L_0x0038
        L_0x0063:
            r0 = r9
        L_0x0064:
            n.e0 r4 = r3.f10100h
            n.z r6 = r4.f10092b
            int r3 = r3.f10103k
            if (r3 != r8) goto L_0x006d
            r7 = r5
        L_0x006d:
            if (r2 == 0) goto L_0x0074
            java.net.Proxy r3 = r2.f10140b
            if (r3 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY
        L_0x0076:
            java.util.Iterator r0 = r0.iterator()
        L_0x007a:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0222
            java.lang.Object r8 = r0.next()
            n.j r8 = (n.j) r8
            java.lang.String r9 = r8.f10125b
            java.lang.String r10 = "Basic"
            boolean r5 = e.c0.h.f(r10, r9, r5)
            if (r5 != 0) goto L_0x0092
            goto L_0x0218
        L_0x0092:
            if (r2 == 0) goto L_0x009d
            n.a r5 = r2.a
            if (r5 == 0) goto L_0x009d
            n.t r5 = r5.d
            if (r5 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            n.t r5 = r1.f10153b
        L_0x009f:
            java.lang.String r9 = "realm"
            java.lang.String r10 = "proxy"
            if (r7 == 0) goto L_0x00e6
            java.net.SocketAddress r11 = r3.address()
            java.lang.String r12 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            java.util.Objects.requireNonNull(r11, r12)
            java.net.InetSocketAddress r11 = (java.net.InetSocketAddress) r11
            java.lang.String r12 = r11.getHostName()
            e.x.c.i.d(r3, r10)
            java.net.InetAddress r13 = r1.b(r3, r6, r5)
            int r14 = r11.getPort()
            java.lang.String r15 = r6.f10430b
            java.util.Map<java.lang.String, java.lang.String> r5 = r8.a
            java.lang.Object r5 = r5.get(r9)
            r16 = r5
            java.lang.String r16 = (java.lang.String) r16
            java.lang.String r5 = r8.f10125b
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00df }
            java.lang.String r10 = r6.f10435j     // Catch:{ MalformedURLException -> 0x00df }
            r9.<init>(r10)     // Catch:{ MalformedURLException -> 0x00df }
            java.net.Authenticator$RequestorType r19 = java.net.Authenticator.RequestorType.PROXY
            r17 = r5
            r18 = r9
            java.net.PasswordAuthentication r5 = java.net.Authenticator.requestPasswordAuthentication(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x010d
        L_0x00df:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x00e6:
            java.lang.String r11 = r6.f10431e
            e.x.c.i.d(r3, r10)
            java.net.InetAddress r10 = r1.b(r3, r6, r5)
            int r5 = r6.f
            java.lang.String r12 = r6.f10430b
            java.util.Map<java.lang.String, java.lang.String> r13 = r8.a
            java.lang.Object r9 = r13.get(r9)
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = r8.f10125b
            java.net.URL r15 = new java.net.URL     // Catch:{ MalformedURLException -> 0x021b }
            java.lang.String r9 = r6.f10435j     // Catch:{ MalformedURLException -> 0x021b }
            r15.<init>(r9)     // Catch:{ MalformedURLException -> 0x021b }
            java.net.Authenticator$RequestorType r16 = java.net.Authenticator.RequestorType.SERVER
            r9 = r11
            r11 = r5
            java.net.PasswordAuthentication r5 = java.net.Authenticator.requestPasswordAuthentication(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x010d:
            if (r5 == 0) goto L_0x0218
            if (r7 == 0) goto L_0x0114
            java.lang.String r0 = "Proxy-Authorization"
            goto L_0x0116
        L_0x0114:
            java.lang.String r0 = "Authorization"
        L_0x0116:
            java.lang.String r2 = r5.getUserName()
            java.lang.String r3 = "auth.userName"
            e.x.c.i.d(r2, r3)
            char[] r3 = r5.getPassword()
            java.lang.String r5 = "auth.password"
            e.x.c.i.d(r3, r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.a
            java.lang.String r6 = "charset"
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0143
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ Exception -> 0x0143 }
            java.lang.String r7 = "Charset.forName(charset)"
            e.x.c.i.d(r3, r7)     // Catch:{ Exception -> 0x0143 }
            goto L_0x014a
        L_0x0143:
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r7 = "ISO_8859_1"
            e.x.c.i.d(r3, r7)
        L_0x014a:
            java.lang.String r7 = "username"
            e.x.c.i.e(r2, r7)
            java.lang.String r7 = "password"
            e.x.c.i.e(r5, r7)
            e.x.c.i.e(r3, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            r2 = 58
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = r7.toString()
            o.h$a r5 = o.h.f10456l
            java.lang.String r5 = "$this$encode"
            e.x.c.i.e(r2, r5)
            e.x.c.i.e(r3, r6)
            o.h r5 = new o.h
            byte[] r2 = r2.getBytes(r3)
            java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
            e.x.c.i.d(r2, r3)
            r5.<init>(r2)
            java.lang.String r2 = r5.d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Basic "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "request"
            e.x.c.i.e(r4, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            n.z r6 = r4.f10092b
            java.lang.String r7 = r4.c
            n.g0 r9 = r4.f10093e
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r4.f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01b6
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            goto L_0x01bc
        L_0x01b6:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r3 = r4.f
            java.util.Map r3 = e.t.g.b0(r3)
        L_0x01bc:
            n.y r4 = r4.d
            n.y$a r4 = r4.n()
            java.lang.String r5 = "name"
            e.x.c.i.e(r0, r5)
            java.lang.String r8 = "value"
            e.x.c.i.e(r2, r8)
            e.x.c.i.e(r0, r5)
            e.x.c.i.e(r2, r8)
            n.y$b r5 = n.y.f10426i
            r5.a(r0)
            r5.b(r2, r0)
            r4.c(r0)
            r4.a(r0, r2)
            if (r6 == 0) goto L_0x020c
            n.y r8 = r4.b()
            byte[] r0 = n.m0.c.a
            java.lang.String r0 = "$this$toImmutableMap"
            e.x.c.i.e(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x01f6
            e.t.p r0 = e.t.p.f7935h
            goto L_0x0204
        L_0x01f6:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r3)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            java.lang.String r2 = "Collections.unmodifiableMap(LinkedHashMap(this))"
            e.x.c.i.d(r0, r2)
        L_0x0204:
            r10 = r0
            n.e0 r0 = new n.e0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        L_0x020c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "url == null"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0218:
            r5 = 1
            goto L_0x007a
        L_0x021b:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0222:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.d.b.a(n.k0, n.h0):n.e0");
    }

    public final InetAddress b(Proxy proxy, z zVar, t tVar) {
        Proxy.Type type = proxy.type();
        if (type != null && a.a[type.ordinal()] == 1) {
            return (InetAddress) g.o(tVar.a(zVar.f10431e));
        }
        SocketAddress address = proxy.address();
        Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        i.d(address2, "(address() as InetSocketAddress).address");
        return address2;
    }
}
