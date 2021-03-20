package b.l.d.v;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final h f5322h;

    public i(h hVar) {
        this.f5322h = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r4 = java.lang.String.valueOf(r1);
        r6 = new java.lang.StringBuilder(r4.length() + 8);
        r6.append("Sending ");
        r6.append(r4);
        android.util.Log.d("MessengerIpcClient", r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r3 = r0.f.a;
        r4 = r0.f5318b;
        r5 = android.os.Message.obtain();
        r5.what = r1.c;
        r5.arg1 = r1.a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.c());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r0.c;
        r3 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0099, code lost:
        if (r3 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        r1 = r1.f5324b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        if (r1 == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        r1 = r1.f5331h;
        java.util.Objects.requireNonNull(r1);
        r1.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b7, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            b.l.d.v.h r0 = r8.f5322h
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.a     // Catch:{ all -> 0x00c0 }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            return
        L_0x000a:
            java.util.Queue<b.l.d.v.m<?>> r1 = r0.d     // Catch:{ all -> 0x00c0 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x0017
            r0.c()     // Catch:{ all -> 0x00c0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            return
        L_0x0017:
            java.util.Queue<b.l.d.v.m<?>> r1 = r0.d     // Catch:{ all -> 0x00c0 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00c0 }
            b.l.d.v.m r1 = (b.l.d.v.m) r1     // Catch:{ all -> 0x00c0 }
            android.util.SparseArray<b.l.d.v.m<?>> r3 = r0.f5319e     // Catch:{ all -> 0x00c0 }
            int r4 = r1.a     // Catch:{ all -> 0x00c0 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00c0 }
            b.l.d.v.f r3 = r0.f     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f5314b     // Catch:{ all -> 0x00c0 }
            b.l.d.v.l r4 = new b.l.d.v.l     // Catch:{ all -> 0x00c0 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00c0 }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00c0 }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r5 = r4.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r3, r4)
        L_0x0060:
            b.l.d.v.f r3 = r0.f
            android.content.Context r3 = r3.a
            android.os.Messenger r4 = r0.f5318b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.c
            r5.what = r6
            int r6 = r1.a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.c()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            b.l.d.v.k r1 = r0.c     // Catch:{ RemoteException -> 0x00b6 }
            android.os.Messenger r3 = r1.a     // Catch:{ RemoteException -> 0x00b6 }
            if (r3 == 0) goto L_0x00a0
            r3.send(r5)     // Catch:{ RemoteException -> 0x00b6 }
            goto L_0x0002
        L_0x00a0:
            b.l.d.v.o0 r1 = r1.f5324b     // Catch:{ RemoteException -> 0x00b6 }
            if (r1 == 0) goto L_0x00ae
            android.os.Messenger r1 = r1.f5331h     // Catch:{ RemoteException -> 0x00b6 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ RemoteException -> 0x00b6 }
            r1.send(r5)     // Catch:{ RemoteException -> 0x00b6 }
            goto L_0x0002
        L_0x00ae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00b6 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00b6 }
            throw r1     // Catch:{ RemoteException -> 0x00b6 }
        L_0x00b6:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0002
        L_0x00c0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.i.run():void");
    }
}
