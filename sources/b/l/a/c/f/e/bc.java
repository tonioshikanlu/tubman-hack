package b.l.a.c.f.e;

public final class bc extends yb {
    public final ac a = new ac();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r1 = new java.util.Vector(2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Throwable r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            if (r6 == r5) goto L_0x0040
            b.l.a.c.f.e.ac r0 = r4.a
        L_0x0004:
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r1 = r0.f2842b
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L_0x0012
            java.util.concurrent.ConcurrentHashMap<b.l.a.c.f.e.zb, java.util.List<java.lang.Throwable>> r2 = r0.a
            r2.remove(r1)
            goto L_0x0004
        L_0x0012:
            b.l.a.c.f.e.zb r1 = new b.l.a.c.f.e.zb
            r2 = 0
            r1.<init>(r5, r2)
            java.util.concurrent.ConcurrentHashMap<b.l.a.c.f.e.zb, java.util.List<java.lang.Throwable>> r2 = r0.a
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0023
            goto L_0x003c
        L_0x0023:
            java.util.Vector r1 = new java.util.Vector
            r2 = 2
            r1.<init>(r2)
            java.util.concurrent.ConcurrentHashMap<b.l.a.c.f.e.zb, java.util.List<java.lang.Throwable>> r2 = r0.a
            b.l.a.c.f.e.zb r3 = new b.l.a.c.f.e.zb
            java.lang.ref.ReferenceQueue<java.lang.Throwable> r0 = r0.f2842b
            r3.<init>(r5, r0)
            java.lang.Object r5 = r2.putIfAbsent(r3, r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r1 = r5
        L_0x003c:
            r1.add(r6)
            return
        L_0x0040:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Self suppression is not allowed."
            r5.<init>(r0, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.bc.a(java.lang.Throwable, java.lang.Throwable):void");
    }
}
