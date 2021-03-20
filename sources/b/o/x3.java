package b.o;

import b.o.u3;

public abstract class x3 implements u3 {
    public u3.a a;

    /* renamed from: b  reason: collision with root package name */
    public Thread f6355b;
    public boolean c;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        r7 = b.e.a.a.a.y("Could not register with ");
        r7.append(b());
        r7.append(" due to an issue with your AndroidManifest.xml or with 'Google Play services'.");
        b.o.i2.a(r5, r7.toString(), r6);
        ((b.o.i2.d) r4.a).a((java.lang.String) null, -8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r5, java.lang.String r6, b.o.u3.a r7) {
        /*
            r4 = this;
            b.o.i2$k r5 = b.o.i2.k.ERROR
            r4.a = r7
            r0 = 0
            r1 = 1
            java.lang.Float.parseFloat(r6)     // Catch:{ all -> 0x000b }
            r2 = r1
            goto L_0x000c
        L_0x000b:
            r2 = r0
        L_0x000c:
            r3 = 0
            if (r2 != 0) goto L_0x001b
            java.lang.String r1 = "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard."
            b.o.i2.a(r5, r1, r3)
            r1 = -6
            b.o.i2$d r7 = (b.o.i2.d) r7
            r7.a(r3, r1)
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r0 == 0) goto L_0x0077
            boolean r7 = b.o.f2.n()     // Catch:{ all -> 0x0055 }
            if (r7 == 0) goto L_0x0044
            monitor-enter(r4)     // Catch:{ all -> 0x0055 }
            java.lang.Thread r7 = r4.f6355b     // Catch:{ all -> 0x0041 }
            if (r7 == 0) goto L_0x0030
            boolean r7 = r7.isAlive()     // Catch:{ all -> 0x0041 }
            if (r7 == 0) goto L_0x0030
            goto L_0x003f
        L_0x0030:
            java.lang.Thread r7 = new java.lang.Thread     // Catch:{ all -> 0x0041 }
            b.o.w3 r0 = new b.o.w3     // Catch:{ all -> 0x0041 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x0041 }
            r7.<init>(r0)     // Catch:{ all -> 0x0041 }
            r4.f6355b = r7     // Catch:{ all -> 0x0041 }
            r7.start()     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            goto L_0x0077
        L_0x0041:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            throw r6     // Catch:{ all -> 0x0055 }
        L_0x0044:
            b.l.f.x.a.g.l0()     // Catch:{ all -> 0x0055 }
            java.lang.String r6 = "'Google Play services' app not installed or disabled on the device."
            b.o.i2.a(r5, r6, r3)     // Catch:{ all -> 0x0055 }
            b.o.u3$a r6 = r4.a     // Catch:{ all -> 0x0055 }
            r7 = -7
            b.o.i2$d r6 = (b.o.i2.d) r6
            r6.a(r3, r7)     // Catch:{ all -> 0x0055 }
            goto L_0x0077
        L_0x0055:
            r6 = move-exception
            java.lang.String r7 = "Could not register with "
            java.lang.StringBuilder r7 = b.e.a.a.a.y(r7)
            java.lang.String r0 = r4.b()
            r7.append(r0)
            java.lang.String r0 = " due to an issue with your AndroidManifest.xml or with 'Google Play services'."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            b.o.i2.a(r5, r7, r6)
            b.o.u3$a r5 = r4.a
            r6 = -8
            b.o.i2$d r5 = (b.o.i2.d) r5
            r5.a(r3, r6)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.x3.a(android.content.Context, java.lang.String, b.o.u3$a):void");
    }

    public abstract String b();

    public abstract String c(String str);
}
