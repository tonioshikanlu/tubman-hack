package b.l.a.c.i.b;

import androidx.annotation.GuardedBy;

public final class w2<V> {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f4325g = new Object();
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final v2<V> f4326b;
    public final V c;
    public final V d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4327e = new Object();
    @GuardedBy("cachingLock")
    public volatile V f = null;

    public /* synthetic */ w2(String str, Object obj, Object obj2, v2 v2Var) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.f4326b = v2Var;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0041 */
    public final V a(V r5) {
        /*
            r4 = this;
            java.lang.Object r0 = f4325g
            java.lang.Object r1 = r4.f4327e
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            if (r5 == 0) goto L_0x0009
            return r5
        L_0x0009:
            b.l.a.c.i.b.y9 r5 = b.l.a.c.b.a.f2580h
            if (r5 == 0) goto L_0x0066
            monitor-enter(r0)
            boolean r5 = b.l.a.c.i.b.y9.a()     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x001f
            V r5 = r4.f     // Catch:{ all -> 0x0063 }
            if (r5 != 0) goto L_0x001b
            V r5 = r4.c     // Catch:{ all -> 0x0063 }
            goto L_0x001d
        L_0x001b:
            V r5 = r4.f     // Catch:{ all -> 0x0063 }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return r5
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            java.util.List<b.l.a.c.i.b.w2<?>> r5 = b.l.a.c.i.b.x2.a     // Catch:{ SecurityException -> 0x0051 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ SecurityException -> 0x0051 }
        L_0x0026:
            boolean r1 = r5.hasNext()     // Catch:{ SecurityException -> 0x0051 }
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r5.next()     // Catch:{ SecurityException -> 0x0051 }
            b.l.a.c.i.b.w2 r1 = (b.l.a.c.i.b.w2) r1     // Catch:{ SecurityException -> 0x0051 }
            boolean r2 = b.l.a.c.i.b.y9.a()     // Catch:{ SecurityException -> 0x0051 }
            if (r2 != 0) goto L_0x0049
            r2 = 0
            b.l.a.c.i.b.v2<V> r3 = r1.f4326b     // Catch:{ IllegalStateException -> 0x0041 }
            if (r3 == 0) goto L_0x0041
            java.lang.Object r2 = r3.a()     // Catch:{ IllegalStateException -> 0x0041 }
        L_0x0041:
            monitor-enter(r0)     // Catch:{ SecurityException -> 0x0051 }
            r1.f = r2     // Catch:{ all -> 0x0046 }
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x0026
        L_0x0046:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r5     // Catch:{ SecurityException -> 0x0051 }
        L_0x0049:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0051 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r5.<init>(r0)     // Catch:{ SecurityException -> 0x0051 }
            throw r5     // Catch:{ SecurityException -> 0x0051 }
        L_0x0051:
            b.l.a.c.i.b.v2<V> r5 = r4.f4326b
            if (r5 != 0) goto L_0x0058
            V r5 = r4.c
            return r5
        L_0x0058:
            java.lang.Object r5 = r5.a()     // Catch:{ SecurityException -> 0x0060, IllegalStateException -> 0x005d }
            return r5
        L_0x005d:
            V r5 = r4.c
            return r5
        L_0x0060:
            V r5 = r4.c
            return r5
        L_0x0063:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r5
        L_0x0066:
            V r5 = r4.c
            return r5
        L_0x0069:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.w2.a(java.lang.Object):java.lang.Object");
    }
}
