package b.l.a.d.a.b;

import b.l.a.d.a.c.c;
import b.l.a.d.a.e.c0;
import java.util.concurrent.Executor;

public final class n1 {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<n2> f4584b;
    public final v0 c;
    public final c0<Executor> d;

    /* renamed from: e  reason: collision with root package name */
    public final k0 f4585e;
    public final c f;

    public n1(t tVar, c0<n2> c0Var, v0 v0Var, c0<Executor> c0Var2, k0 k0Var, c cVar) {
        this.a = tVar;
        this.f4584b = c0Var;
        this.c = v0Var;
        this.d = c0Var2;
        this.f4585e = k0Var;
        this.f = cVar;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(b.l.a.d.a.b.k1 r10) {
        /*
            r9 = this;
            b.l.a.d.a.b.t r0 = r9.a
            java.lang.String r1 = r10.f4647b
            int r2 = r10.c
            long r3 = r10.d
            java.io.File r0 = r0.m(r1, r2, r3)
            b.l.a.d.a.b.t r1 = r9.a
            java.lang.String r2 = r10.f4647b
            int r3 = r10.c
            long r4 = r10.d
            java.util.Objects.requireNonNull(r1)
            java.io.File r6 = new java.io.File
            java.io.File r7 = new java.io.File
            java.io.File r1 = r1.e(r2, r3, r4)
            java.lang.String r2 = "_slices"
            r7.<init>(r1, r2)
            java.lang.String r1 = "_metadata"
            r6.<init>(r7, r1)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 == 0) goto L_0x010e
            boolean r1 = r6.exists()
            if (r1 == 0) goto L_0x010e
            b.l.a.d.a.b.t r1 = r9.a
            java.lang.String r3 = r10.f4647b
            int r4 = r10.c
            long r7 = r10.d
            java.io.File r1 = r1.j(r3, r4, r7)
            r1.mkdirs()
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L_0x0104
            b.l.a.d.a.b.t r0 = r9.a
            java.lang.String r1 = r10.f4647b
            int r3 = r10.c
            long r4 = r10.d
            java.io.File r7 = new java.io.File
            java.io.File r0 = r0.j(r1, r3, r4)
            java.lang.String r1 = "merge.tmp"
            r7.<init>(r0, r1)
            r7.delete()
            b.l.a.d.a.b.t r0 = r9.a
            java.lang.String r1 = r10.f4647b
            int r3 = r10.c
            long r4 = r10.d
            java.util.Objects.requireNonNull(r0)
            java.io.File r7 = new java.io.File
            java.io.File r0 = r0.j(r1, r3, r4)
            java.lang.String r1 = "_metadata"
            r7.<init>(r0, r1)
            r7.mkdirs()
            boolean r0 = r6.renameTo(r7)
            if (r0 == 0) goto L_0x00fa
            b.l.a.d.a.c.c r0 = r9.f
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f4655b     // Catch:{ all -> 0x00f7 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x00f7 }
            if (r1 != 0) goto L_0x009a
            monitor-enter(r0)     // Catch:{ all -> 0x00f7 }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.a     // Catch:{ all -> 0x0097 }
            java.lang.String r3 = "assetOnlyUpdates"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0097 }
            r1.put(r3, r4)     // Catch:{ all -> 0x0097 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f7 }
            goto L_0x009a
        L_0x0097:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f7 }
            throw r10     // Catch:{ all -> 0x00f7 }
        L_0x009a:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.a     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = "assetOnlyUpdates"
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x00f7 }
            boolean r3 = r1 instanceof java.lang.Boolean     // Catch:{ all -> 0x00f7 }
            if (r3 != 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00f7 }
            boolean r2 = r1.booleanValue()     // Catch:{ all -> 0x00f7 }
        L_0x00ad:
            monitor-exit(r0)
            b.l.a.d.a.e.c0<java.util.concurrent.Executor> r0 = r9.d
            java.lang.Object r0 = r0.a()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r2 == 0) goto L_0x00c1
            b.l.a.d.a.b.l1 r1 = new b.l.a.d.a.b.l1
            r1.<init>(r9, r10)
            r0.execute(r1)
            goto L_0x00ce
        L_0x00c1:
            b.l.a.d.a.b.t r1 = r9.a
            r1.getClass()
            b.l.a.d.a.b.m1 r2 = new b.l.a.d.a.b.m1
            r2.<init>(r1)
            r0.execute(r2)
        L_0x00ce:
            b.l.a.d.a.b.v0 r0 = r9.c
            java.lang.String r5 = r10.f4647b
            int r6 = r10.c
            long r7 = r10.d
            b.l.a.d.a.b.n0 r1 = new b.l.a.d.a.b.n0
            r3 = r1
            r4 = r0
            r3.<init>(r4, r5, r6, r7)
            r0.b(r1)
            b.l.a.d.a.b.k0 r0 = r9.f4585e
            java.lang.String r1 = r10.f4647b
            r0.a(r1)
            b.l.a.d.a.e.c0<b.l.a.d.a.b.n2> r0 = r9.f4584b
            java.lang.Object r0 = r0.a()
            b.l.a.d.a.b.n2 r0 = (b.l.a.d.a.b.n2) r0
            int r1 = r10.a
            java.lang.String r10 = r10.f4647b
            r0.a(r1, r10)
            return
        L_0x00f7:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x00fa:
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0
            java.lang.String r1 = "Cannot move metadata files to final location."
            int r10 = r10.a
            r0.<init>((java.lang.String) r1, (int) r10)
            throw r0
        L_0x0104:
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0
            java.lang.String r1 = "Cannot move merged pack files to final location."
            int r10 = r10.a
            r0.<init>((java.lang.String) r1, (int) r10)
            throw r0
        L_0x010e:
            b.l.a.d.a.b.g0 r0 = new b.l.a.d.a.b.g0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r10.f4647b
            r1[r2] = r3
            java.lang.String r2 = "Cannot find pack files to move for pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r10 = r10.a
            r0.<init>((java.lang.String) r1, (int) r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.d.a.b.n1.a(b.l.a.d.a.b.k1):void");
    }
}
