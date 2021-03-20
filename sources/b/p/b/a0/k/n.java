package b.p.b.a0.k;

import b.p.b.a;
import b.p.b.a0.g;
import b.p.b.l;
import b.p.b.o;
import b.p.b.y;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public final class n {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6663b;
    public Proxy c;
    public InetSocketAddress d;

    /* renamed from: e  reason: collision with root package name */
    public List<Proxy> f6664e = Collections.emptyList();
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public List<InetSocketAddress> f6665g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public int f6666h;

    /* renamed from: i  reason: collision with root package name */
    public final List<y> f6667i = new ArrayList();

    public n(a aVar, g gVar) {
        this.a = aVar;
        this.f6663b = gVar;
        o oVar = aVar.a;
        Proxy proxy = aVar.f6466h;
        if (proxy != null) {
            this.f6664e = Collections.singletonList(proxy);
        } else {
            this.f6664e = new ArrayList();
            List<Proxy> select = aVar.f6465g.select(oVar.r());
            if (select != null) {
                this.f6664e.addAll(select);
            }
            this.f6664e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f6664e.add(Proxy.NO_PROXY);
        }
        this.f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(b.p.b.y r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.net.Proxy r0 = r4.f6776b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L_0x001f
            b.p.b.a r0 = r3.a
            java.net.ProxySelector r1 = r0.f6465g
            if (r1 == 0) goto L_0x001f
            b.p.b.o r0 = r0.a
            java.net.URI r0 = r0.r()
            java.net.Proxy r2 = r4.f6776b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L_0x001f:
            b.p.b.a0.g r5 = r3.f6663b
            monitor-enter(r5)
            java.util.Set<b.p.b.y> r0 = r5.a     // Catch:{ all -> 0x0029 }
            r0.add(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r5)
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.p.b.a0.k.n.a(b.p.b.y, java.io.IOException):void");
    }

    public boolean b() {
        return c() || d() || (this.f6667i.isEmpty() ^ true);
    }

    public final boolean c() {
        return this.f6666h < this.f6665g.size();
    }

    public final boolean d() {
        return this.f < this.f6664e.size();
    }

    public y e() {
        boolean contains;
        String str;
        int i2;
        if (!c()) {
            if (!d()) {
                if (!this.f6667i.isEmpty()) {
                    return this.f6667i.remove(0);
                }
                throw new NoSuchElementException();
            } else if (d()) {
                List<Proxy> list = this.f6664e;
                int i3 = this.f;
                this.f = i3 + 1;
                Proxy proxy = list.get(i3);
                this.f6665g = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    o oVar = this.a.a;
                    str = oVar.d;
                    i2 = oVar.f6725e;
                } else {
                    SocketAddress address = proxy.address();
                    if (address instanceof InetSocketAddress) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        InetAddress address2 = inetSocketAddress.getAddress();
                        str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                        i2 = inetSocketAddress.getPort();
                    } else {
                        StringBuilder y = b.e.a.a.a.y("Proxy.address() is not an InetSocketAddress: ");
                        y.append(address.getClass());
                        throw new IllegalArgumentException(y.toString());
                    }
                }
                if (i2 < 1 || i2 > 65535) {
                    throw new SocketException("No route to " + str + ":" + i2 + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    this.f6665g.add(InetSocketAddress.createUnresolved(str, i2));
                } else {
                    Objects.requireNonNull((l.a) this.a.f6463b);
                    if (str != null) {
                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                        int size = asList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            this.f6665g.add(new InetSocketAddress((InetAddress) asList.get(i4), i2));
                        }
                    } else {
                        throw new UnknownHostException("hostname == null");
                    }
                }
                this.f6666h = 0;
                this.c = proxy;
            } else {
                StringBuilder y2 = b.e.a.a.a.y("No route to ");
                y2.append(this.a.a.d);
                y2.append("; exhausted proxy configurations: ");
                y2.append(this.f6664e);
                throw new SocketException(y2.toString());
            }
        }
        if (c()) {
            List<InetSocketAddress> list2 = this.f6665g;
            int i5 = this.f6666h;
            this.f6666h = i5 + 1;
            InetSocketAddress inetSocketAddress2 = list2.get(i5);
            this.d = inetSocketAddress2;
            y yVar = new y(this.a, this.c, inetSocketAddress2);
            g gVar = this.f6663b;
            synchronized (gVar) {
                contains = gVar.a.contains(yVar);
            }
            if (!contains) {
                return yVar;
            }
            this.f6667i.add(yVar);
            return e();
        }
        StringBuilder y3 = b.e.a.a.a.y("No route to ");
        y3.append(this.a.a.d);
        y3.append("; exhausted inet socket addresses: ");
        y3.append(this.f6665g);
        throw new SocketException(y3.toString());
    }
}
