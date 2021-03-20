package g.a.a;

import g.a.h1;

public final class m {
    public static final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static final h1 f9916b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlinx.coroutines.internal.MainDispatcherFactory} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            java.lang.String r0 = e.a.a.a.y0.m.o1.c.l0(r0)
            if (r0 == 0) goto L_0x000d
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            a = r0
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            java.util.Iterator r1 = defpackage.a.b()     // Catch:{ all -> 0x006b }
            e.b0.h r1 = e.a.a.a.y0.m.o1.c.i(r1)     // Catch:{ all -> 0x006b }
            java.util.List r1 = e.b0.s.j(r1)     // Catch:{ all -> 0x006b }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x006b }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x006b }
            if (r3 != 0) goto L_0x002a
            r2 = 0
            goto L_0x0053
        L_0x002a:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x006b }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x006b }
            if (r4 != 0) goto L_0x0036
        L_0x0034:
            r2 = r3
            goto L_0x0053
        L_0x0036:
            r4 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch:{ all -> 0x006b }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x006b }
        L_0x003d:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x006b }
            r6 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r6 = (kotlinx.coroutines.internal.MainDispatcherFactory) r6     // Catch:{ all -> 0x006b }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x006b }
            if (r4 >= r6) goto L_0x004c
            r3 = r5
            r4 = r6
        L_0x004c:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x006b }
            if (r5 != 0) goto L_0x003d
            goto L_0x0034
        L_0x0053:
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0065
            g.a.h1 r1 = r2.createDispatcher(r1)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0065
            f9916b = r1
            return
        L_0x0060:
            r0 = move-exception
            r2.hintOnError()     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x0065:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006b }
            r1.<init>(r0)     // Catch:{ all -> 0x006b }
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.a.m.<clinit>():void");
    }
}
