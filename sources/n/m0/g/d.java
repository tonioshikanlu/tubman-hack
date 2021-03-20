package n.m0.g;

import androidx.core.app.NotificationCompat;
import e.x.c.i;
import java.io.IOException;
import n.a;
import n.k0;
import n.m0.g.m;
import n.m0.j.b;
import n.u;
import n.z;

public final class d {
    public m.a a;

    /* renamed from: b  reason: collision with root package name */
    public m f10180b;
    public int c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f10181e;
    public k0 f;

    /* renamed from: g  reason: collision with root package name */
    public final j f10182g;

    /* renamed from: h  reason: collision with root package name */
    public final a f10183h;

    /* renamed from: i  reason: collision with root package name */
    public final e f10184i;

    /* renamed from: j  reason: collision with root package name */
    public final u f10185j;

    public d(j jVar, a aVar, e eVar, u uVar) {
        i.e(jVar, "connectionPool");
        i.e(aVar, "address");
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        i.e(uVar, "eventListener");
        this.f10182g = jVar;
        this.f10183h = aVar;
        this.f10184i = eVar;
        this.f10185j = uVar;
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fd A[SYNTHETIC] */
    public final n.m0.g.i a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r1 = r15
        L_0x0001:
            n.m0.g.e r0 = r1.f10184i
            boolean r0 = r0.t
            if (r0 != 0) goto L_0x0343
            n.m0.g.e r0 = r1.f10184i
            n.m0.g.i r2 = r0.f10192n
            r0 = 0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x005e
            monitor-enter(r2)
            boolean r5 = r2.f10208i     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0024
            n.k0 r5 = r2.f10216q     // Catch:{ all -> 0x005b }
            n.a r5 = r5.a     // Catch:{ all -> 0x005b }
            n.z r5 = r5.a     // Catch:{ all -> 0x005b }
            boolean r5 = r15.b(r5)     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r3
            goto L_0x002a
        L_0x0024:
            n.m0.g.e r5 = r1.f10184i     // Catch:{ all -> 0x005b }
            java.net.Socket r5 = r5.m()     // Catch:{ all -> 0x005b }
        L_0x002a:
            monitor-exit(r2)
            n.m0.g.e r6 = r1.f10184i
            n.m0.g.i r6 = r6.f10192n
            if (r6 == 0) goto L_0x0044
            if (r5 != 0) goto L_0x0034
            r0 = r4
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            goto L_0x02c9
        L_0x0038:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0044:
            if (r5 == 0) goto L_0x0049
            n.m0.c.e(r5)
        L_0x0049:
            n.u r5 = r1.f10185j
            n.m0.g.e r6 = r1.f10184i
            java.util.Objects.requireNonNull(r5)
            java.lang.String r5 = "call"
            e.x.c.i.e(r6, r5)
            java.lang.String r5 = "connection"
            e.x.c.i.e(r2, r5)
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x005e:
            r1.c = r0
            r1.d = r0
            r1.f10181e = r0
            n.m0.g.j r2 = r1.f10182g
            n.a r5 = r1.f10183h
            n.m0.g.e r6 = r1.f10184i
            boolean r2 = r2.a(r5, r6, r3, r0)
            if (r2 == 0) goto L_0x0072
            goto L_0x0262
        L_0x0072:
            n.k0 r2 = r1.f
            if (r2 == 0) goto L_0x007c
            e.x.c.i.c(r2)
            r1.f = r3
            goto L_0x0092
        L_0x007c:
            n.m0.g.m$a r2 = r1.a
            if (r2 == 0) goto L_0x0095
            e.x.c.i.c(r2)
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0095
            n.m0.g.m$a r0 = r1.a
            e.x.c.i.c(r0)
            n.k0 r2 = r0.b()
        L_0x0092:
            r5 = r3
            goto L_0x026f
        L_0x0095:
            n.m0.g.m r2 = r1.f10180b
            if (r2 != 0) goto L_0x00aa
            n.m0.g.m r2 = new n.m0.g.m
            n.a r5 = r1.f10183h
            n.m0.g.e r6 = r1.f10184i
            n.c0 r7 = r6.w
            n.m0.g.k r7 = r7.F
            n.u r8 = r1.f10185j
            r2.<init>(r5, r7, r6, r8)
            r1.f10180b = r2
        L_0x00aa:
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x033d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00b5:
            boolean r6 = r2.b()
            if (r6 == 0) goto L_0x0237
            boolean r6 = r2.b()
            java.lang.String r7 = "No route to "
            if (r6 == 0) goto L_0x0216
            java.util.List<? extends java.net.Proxy> r6 = r2.a
            int r8 = r2.f10222b
            int r9 = r8 + 1
            r2.f10222b = r9
            java.lang.Object r6 = r6.get(r8)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.c = r8
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L_0x012e
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto L_0x00e9
            goto L_0x012e
        L_0x00e9:
            java.net.SocketAddress r9 = r6.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L_0x0113
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = "$this$socketHost"
            e.x.c.i.e(r9, r10)
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 == 0) goto L_0x0105
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            goto L_0x010b
        L_0x0105:
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
        L_0x010b:
            e.x.c.i.d(r10, r11)
            int r9 = r9.getPort()
            goto L_0x0136
        L_0x0113:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.Class r2 = r9.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x012e:
            n.a r9 = r2.f10223e
            n.z r9 = r9.a
            java.lang.String r10 = r9.f10431e
            int r9 = r9.f
        L_0x0136:
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r9) goto L_0x01f4
            if (r11 < r9) goto L_0x01f4
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r7 != r11) goto L_0x014d
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r7)
            goto L_0x0197
        L_0x014d:
            n.u r7 = r2.f10225h
            n.f r11 = r2.f10224g
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = "call"
            e.x.c.i.e(r11, r7)
            java.lang.String r11 = "domainName"
            e.x.c.i.e(r10, r11)
            n.a r12 = r2.f10223e
            n.t r12 = r12.d
            java.util.List r12 = r12.a(r10)
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x01d6
            n.u r13 = r2.f10225h
            n.f r14 = r2.f10224g
            java.util.Objects.requireNonNull(r13)
            e.x.c.i.e(r14, r7)
            e.x.c.i.e(r10, r11)
            java.lang.String r7 = "inetAddressList"
            e.x.c.i.e(r12, r7)
            java.util.Iterator r7 = r12.iterator()
        L_0x0182:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0197
            java.lang.Object r10 = r7.next()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r10, r9)
            r8.add(r11)
            goto L_0x0182
        L_0x0197:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.c
            java.util.Iterator r7 = r7.iterator()
        L_0x019d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ce
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            n.k0 r9 = new n.k0
            n.a r10 = r2.f10223e
            r9.<init>(r10, r6, r8)
            n.m0.g.k r8 = r2.f
            monitor-enter(r8)
            java.lang.String r10 = "route"
            e.x.c.i.e(r9, r10)     // Catch:{ all -> 0x01cb }
            java.util.Set<n.k0> r10 = r8.a     // Catch:{ all -> 0x01cb }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01cb }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01c7
            java.util.List<n.k0> r8 = r2.d
            r8.add(r9)
            goto L_0x019d
        L_0x01c7:
            r5.add(r9)
            goto L_0x019d
        L_0x01cb:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01ce:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x00b5
            goto L_0x0237
        L_0x01d6:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            n.a r2 = r2.f10223e
            n.t r2 = r2.d
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x01f4:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0216:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r7)
            n.a r4 = r2.f10223e
            n.z r4 = r4.a
            java.lang.String r4 = r4.f10431e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0237:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0247
            java.util.List<n.k0> r6 = r2.d
            e.t.g.b(r5, r6)
            java.util.List<n.k0> r2 = r2.d
            r2.clear()
        L_0x0247:
            n.m0.g.m$a r2 = new n.m0.g.m$a
            r2.<init>(r5)
            r1.a = r2
            java.util.List<n.k0> r5 = r2.f10226b
            n.m0.g.e r6 = r1.f10184i
            boolean r6 = r6.t
            if (r6 != 0) goto L_0x0335
            n.m0.g.j r6 = r1.f10182g
            n.a r7 = r1.f10183h
            n.m0.g.e r8 = r1.f10184i
            boolean r0 = r6.a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x026b
        L_0x0262:
            n.m0.g.e r0 = r1.f10184i
            n.m0.g.i r0 = r0.f10192n
            e.x.c.i.c(r0)
        L_0x0269:
            r2 = r0
            goto L_0x02c2
        L_0x026b:
            n.k0 r2 = r2.b()
        L_0x026f:
            n.m0.g.i r14 = new n.m0.g.i
            n.m0.g.j r0 = r1.f10182g
            r14.<init>(r0, r2)
            n.m0.g.e r0 = r1.f10184i
            r0.v = r14
            n.m0.g.e r12 = r1.f10184i     // Catch:{ all -> 0x032f }
            n.u r13 = r1.f10185j     // Catch:{ all -> 0x032f }
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r6.c(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x032f }
            n.m0.g.e r0 = r1.f10184i
            r0.v = r3
            n.m0.g.e r0 = r1.f10184i
            n.c0 r0 = r0.w
            n.m0.g.k r3 = r0.F
            n.k0 r0 = r14.f10216q
            monitor-enter(r3)
            java.lang.String r6 = "route"
            e.x.c.i.e(r0, r6)     // Catch:{ all -> 0x032c }
            java.util.Set<n.k0> r6 = r3.a     // Catch:{ all -> 0x032c }
            r6.remove(r0)     // Catch:{ all -> 0x032c }
            monitor-exit(r3)
            n.m0.g.j r0 = r1.f10182g
            n.a r3 = r1.f10183h
            n.m0.g.e r6 = r1.f10184i
            boolean r0 = r0.a(r3, r6, r5, r4)
            if (r0 == 0) goto L_0x02cc
            n.m0.g.e r0 = r1.f10184i
            n.m0.g.i r0 = r0.f10192n
            e.x.c.i.c(r0)
            r1.f = r2
            java.net.Socket r2 = r14.c
            e.x.c.i.c(r2)
            n.m0.c.e(r2)
            goto L_0x0269
        L_0x02c2:
            n.u r0 = r1.f10185j
            n.m0.g.e r3 = r1.f10184i
            r0.a(r3, r2)
        L_0x02c9:
            r0 = r21
            goto L_0x02f7
        L_0x02cc:
            monitor-enter(r14)
            n.m0.g.j r0 = r1.f10182g     // Catch:{ all -> 0x0329 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0329 }
            java.lang.String r2 = "connection"
            e.x.c.i.e(r14, r2)     // Catch:{ all -> 0x0329 }
            byte[] r2 = n.m0.c.a     // Catch:{ all -> 0x0329 }
            java.util.concurrent.ConcurrentLinkedQueue<n.m0.g.i> r2 = r0.d     // Catch:{ all -> 0x0329 }
            r2.add(r14)     // Catch:{ all -> 0x0329 }
            n.m0.f.c r2 = r0.f10217b     // Catch:{ all -> 0x0329 }
            n.m0.g.j$a r0 = r0.c     // Catch:{ all -> 0x0329 }
            r5 = 0
            r2.c(r0, r5)     // Catch:{ all -> 0x0329 }
            n.m0.g.e r0 = r1.f10184i     // Catch:{ all -> 0x0329 }
            r0.b(r14)     // Catch:{ all -> 0x0329 }
            monitor-exit(r14)
            n.u r0 = r1.f10185j
            n.m0.g.e r2 = r1.f10184i
            r0.a(r2, r14)
            r0 = r21
            r2 = r14
        L_0x02f7:
            boolean r3 = r2.i(r0)
            if (r3 == 0) goto L_0x02fe
            return r2
        L_0x02fe:
            r2.l()
            n.k0 r2 = r1.f
            if (r2 == 0) goto L_0x0307
            goto L_0x0001
        L_0x0307:
            n.m0.g.m$a r2 = r1.a
            if (r2 == 0) goto L_0x0310
            boolean r2 = r2.a()
            goto L_0x0311
        L_0x0310:
            r2 = r4
        L_0x0311:
            if (r2 == 0) goto L_0x0315
            goto L_0x0001
        L_0x0315:
            n.m0.g.m r2 = r1.f10180b
            if (r2 == 0) goto L_0x031d
            boolean r4 = r2.a()
        L_0x031d:
            if (r4 == 0) goto L_0x0321
            goto L_0x0001
        L_0x0321:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x0329:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x032c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x032f:
            r0 = move-exception
            n.m0.g.e r2 = r1.f10184i
            r2.v = r3
            throw r0
        L_0x0335:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x033d:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0343:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.m0.g.d.a(int, int, int, int, boolean, boolean):n.m0.g.i");
    }

    public final boolean b(z zVar) {
        i.e(zVar, "url");
        z zVar2 = this.f10183h.a;
        return zVar.f == zVar2.f && i.a(zVar.f10431e, zVar2.f10431e);
    }

    public final void c(IOException iOException) {
        i.e(iOException, "e");
        this.f = null;
        if ((iOException instanceof n.m0.j.u) && ((n.m0.j.u) iOException).f10376h == b.REFUSED_STREAM) {
            this.c++;
        } else if (iOException instanceof n.m0.j.a) {
            this.d++;
        } else {
            this.f10181e++;
        }
    }
}
