package b.l.d.x;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final d f5358h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5359i;

    public c(d dVar, boolean z) {
        this.f5358h = dVar;
        this.f5359i = z;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    public void run() {
        /*
            r13 = this;
            b.l.d.x.d r0 = r13.f5358h
            boolean r1 = r13.f5359i
            java.lang.Object r2 = b.l.d.x.d.f5360m
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r2 = b.l.d.x.d.f5360m
            monitor-enter(r2)
            b.l.d.d r3 = r0.a     // Catch:{ all -> 0x010c }
            r3.a()     // Catch:{ all -> 0x010c }
            android.content.Context r3 = r3.a     // Catch:{ all -> 0x010c }
            java.lang.String r4 = "generatefid.lock"
            b.l.d.x.a r3 = b.l.d.x.a.a(r3, r4)     // Catch:{ all -> 0x010c }
            b.l.d.x.m.c r4 = r0.c     // Catch:{ all -> 0x0105 }
            b.l.d.x.m.d r4 = r4.b()     // Catch:{ all -> 0x0105 }
            if (r3 == 0) goto L_0x0024
            r3.b()     // Catch:{ all -> 0x010c }
        L_0x0024:
            monitor-exit(r2)     // Catch:{ all -> 0x010c }
            boolean r3 = r4.h()     // Catch:{ f -> 0x0100 }
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L_0x006b
            b.l.d.x.m.c$a r3 = r4.f()     // Catch:{ f -> 0x0100 }
            b.l.d.x.m.c$a r7 = b.l.d.x.m.c.a.f5387j     // Catch:{ f -> 0x0100 }
            if (r3 != r7) goto L_0x0037
            r3 = r5
            goto L_0x0038
        L_0x0037:
            r3 = r6
        L_0x0038:
            if (r3 == 0) goto L_0x003b
            goto L_0x006b
        L_0x003b:
            if (r1 != 0) goto L_0x0066
            b.l.d.x.k r1 = r0.d     // Catch:{ f -> 0x0100 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ f -> 0x0100 }
            java.lang.String r3 = r4.a()     // Catch:{ f -> 0x0100 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ f -> 0x0100 }
            if (r3 == 0) goto L_0x004d
            goto L_0x0061
        L_0x004d:
            long r7 = r4.g()     // Catch:{ f -> 0x0100 }
            long r9 = r4.b()     // Catch:{ f -> 0x0100 }
            long r9 = r9 + r7
            long r7 = r1.b()     // Catch:{ f -> 0x0100 }
            long r11 = b.l.d.x.k.f5375b     // Catch:{ f -> 0x0100 }
            long r7 = r7 + r11
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
        L_0x0061:
            r1 = r5
            goto L_0x0064
        L_0x0063:
            r1 = r6
        L_0x0064:
            if (r1 == 0) goto L_0x0104
        L_0x0066:
            b.l.d.x.m.d r1 = r0.a(r4)     // Catch:{ f -> 0x0100 }
            goto L_0x006f
        L_0x006b:
            b.l.d.x.m.d r1 = r0.g(r4)     // Catch:{ f -> 0x0100 }
        L_0x006f:
            monitor-enter(r2)
            b.l.d.d r3 = r0.a     // Catch:{ all -> 0x00fd }
            r3.a()     // Catch:{ all -> 0x00fd }
            android.content.Context r3 = r3.a     // Catch:{ all -> 0x00fd }
            java.lang.String r7 = "generatefid.lock"
            b.l.d.x.a r3 = b.l.d.x.a.a(r3, r7)     // Catch:{ all -> 0x00fd }
            b.l.d.x.m.c r7 = r0.c     // Catch:{ all -> 0x00f6 }
            r7.a(r1)     // Catch:{ all -> 0x00f6 }
            if (r3 == 0) goto L_0x0087
            r3.b()     // Catch:{ all -> 0x00fd }
        L_0x0087:
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            monitor-enter(r0)
            java.util.Set<b.l.d.x.l.a> r2 = r0.f5368k     // Catch:{ all -> 0x00f3 }
            int r2 = r2.size()     // Catch:{ all -> 0x00f3 }
            if (r2 == 0) goto L_0x00b9
            java.lang.String r2 = r4.c()     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = r1.c()     // Catch:{ all -> 0x00f3 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00f3 }
            if (r2 != 0) goto L_0x00b9
            java.util.Set<b.l.d.x.l.a> r2 = r0.f5368k     // Catch:{ all -> 0x00f3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00f3 }
        L_0x00a5:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00f3 }
            if (r3 == 0) goto L_0x00b9
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00f3 }
            b.l.d.x.l.a r3 = (b.l.d.x.l.a) r3     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = r1.c()     // Catch:{ all -> 0x00f3 }
            r3.a(r4)     // Catch:{ all -> 0x00f3 }
            goto L_0x00a5
        L_0x00b9:
            monitor-exit(r0)
            b.l.d.x.m.c$a r2 = r1.f()
            b.l.d.x.m.c$a r3 = b.l.d.x.m.c.a.f5388k
            if (r2 != r3) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r5 = r6
        L_0x00c4:
            if (r5 == 0) goto L_0x00d3
            r2 = r1
            b.l.d.x.m.a r2 = (b.l.d.x.m.a) r2
            java.lang.String r2 = r2.f5376b
            monitor-enter(r0)
            r0.f5367j = r2     // Catch:{ all -> 0x00d0 }
            monitor-exit(r0)
            goto L_0x00d3
        L_0x00d0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d3:
            boolean r2 = r1.h()
            if (r2 == 0) goto L_0x00e1
            b.l.d.x.f r1 = new b.l.d.x.f
            b.l.d.x.f$a r2 = b.l.d.x.f.a.BAD_CONFIG
            r1.<init>(r2)
            goto L_0x0101
        L_0x00e1:
            boolean r2 = r1.i()
            if (r2 == 0) goto L_0x00ef
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            goto L_0x0101
        L_0x00ef:
            r0.i(r1)
            goto L_0x0104
        L_0x00f3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00f6:
            r0 = move-exception
            if (r3 == 0) goto L_0x00fc
            r3.b()     // Catch:{ all -> 0x00fd }
        L_0x00fc:
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            throw r0
        L_0x0100:
            r1 = move-exception
        L_0x0101:
            r0.h(r1)
        L_0x0104:
            return
        L_0x0105:
            r0 = move-exception
            if (r3 == 0) goto L_0x010b
            r3.b()     // Catch:{ all -> 0x010c }
        L_0x010b:
            throw r0     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x010c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.x.c.run():void");
    }
}
