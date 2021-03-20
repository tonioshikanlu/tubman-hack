package b.l.d.v;

import android.os.Handler;

public final /* synthetic */ class g implements Handler.Callback {
    public final h a;

    public g(h hVar) {
        this.a = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        r6 = r6.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (r6.getBoolean("unsupported", false) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        r2.b(new b.l.d.v.p(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        r2.d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            b.l.d.v.h r0 = r5.a
            java.util.Objects.requireNonNull(r0)
            int r1 = r6.arg1
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x0028
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Received response to request: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            android.util.Log.d(r2, r3)
        L_0x0028:
            monitor-enter(r0)
            android.util.SparseArray<b.l.d.v.m<?>> r2 = r0.f5319e     // Catch:{ all -> 0x0074 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0074 }
            b.l.d.v.m r2 = (b.l.d.v.m) r2     // Catch:{ all -> 0x0074 }
            if (r2 != 0) goto L_0x004d
            java.lang.String r6 = "MessengerIpcClient"
            r2 = 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r3.<init>(r2)     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "Received response for unknown request: "
            r3.append(r2)     // Catch:{ all -> 0x0074 }
            r3.append(r1)     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0074 }
            android.util.Log.w(r6, r1)     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x004d:
            android.util.SparseArray<b.l.d.v.m<?>> r3 = r0.f5319e     // Catch:{ all -> 0x0074 }
            r3.remove(r1)     // Catch:{ all -> 0x0074 }
            r0.c()     // Catch:{ all -> 0x0074 }
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            android.os.Bundle r6 = r6.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r6.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x006f
            b.l.d.v.p r6 = new b.l.d.v.p
            r0 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            r6.<init>(r0, r1)
            r2.b(r6)
            goto L_0x0072
        L_0x006f:
            r2.d(r6)
        L_0x0072:
            r6 = 1
            return r6
        L_0x0074:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.g.handleMessage(android.os.Message):boolean");
    }
}
