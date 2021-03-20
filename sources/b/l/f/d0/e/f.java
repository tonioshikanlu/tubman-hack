package b.l.f.d0.e;

import b.l.f.s;

public final class f {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final g[] f5675b;
    public c c;
    public final int d;

    public f(a aVar, c cVar) {
        this.a = aVar;
        int i2 = aVar.a;
        this.d = i2;
        this.c = cVar;
        this.f5675b = new g[(i2 + 2)];
    }

    public static int b(int i2, int i3, d dVar) {
        if (dVar.a()) {
            return i3;
        }
        if (!(i2 != -1 && dVar.c == (i2 % 3) * 3)) {
            return i3 + 1;
        }
        dVar.f5666e = i2;
        return 0;
    }

    public final void a(g gVar) {
        s sVar;
        s sVar2;
        if (gVar != null) {
            h hVar = (h) gVar;
            a aVar = this.a;
            d[] dVarArr = hVar.f5676b;
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.b();
                }
            }
            hVar.d(dVarArr, aVar);
            c cVar = hVar.a;
            boolean z = hVar.c;
            if (z) {
                sVar = cVar.f5660b;
            } else {
                sVar = cVar.d;
            }
            if (z) {
                sVar2 = cVar.c;
            } else {
                sVar2 = cVar.f5661e;
            }
            int b2 = hVar.b((int) sVar.f5775b);
            int b3 = hVar.b((int) sVar2.f5775b);
            int i2 = -1;
            int i3 = 0;
            int i4 = 1;
            while (b2 < b3) {
                if (dVarArr[b2] != null) {
                    d dVar2 = dVarArr[b2];
                    int i5 = dVar2.f5666e;
                    int i6 = i5 - i2;
                    if (i6 == 0) {
                        i3++;
                    } else {
                        if (i6 == 1) {
                            i4 = Math.max(i4, i3);
                        } else if (i6 < 0 || i5 >= aVar.f5659e || i6 > b2) {
                            dVarArr[b2] = null;
                        } else {
                            if (i4 > 2) {
                                i6 *= i4 - 2;
                            }
                            boolean z2 = i6 >= b2;
                            for (int i7 = 1; i7 <= i6 && !z2; i7++) {
                                z2 = dVarArr[b2 - i7] != null;
                            }
                            if (z2) {
                                dVarArr[b2] = null;
                            }
                        }
                        i2 = dVar2.f5666e;
                        i3 = 1;
                    }
                }
                b2++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            b.l.f.d0.e.g[] r0 = r10.f5675b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = r1
        L_0x0013:
            b.l.f.d0.e.d[] r5 = r2.f5676b     // Catch:{ all -> 0x0074 }
            int r5 = r5.length     // Catch:{ all -> 0x0074 }
            if (r4 >= r5) goto L_0x006c
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0074 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0074 }
            r6[r1] = r7     // Catch:{ all -> 0x0074 }
            r0.format(r5, r6)     // Catch:{ all -> 0x0074 }
            r5 = r1
        L_0x0026:
            int r6 = r10.d     // Catch:{ all -> 0x0074 }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x0062
            b.l.f.d0.e.g[] r6 = r10.f5675b     // Catch:{ all -> 0x0074 }
            r8 = r6[r5]     // Catch:{ all -> 0x0074 }
            java.lang.String r9 = "    |   "
            if (r8 != 0) goto L_0x003a
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0074 }
            r0.format(r9, r6)     // Catch:{ all -> 0x0074 }
            goto L_0x005f
        L_0x003a:
            r6 = r6[r5]     // Catch:{ all -> 0x0074 }
            b.l.f.d0.e.d[] r6 = r6.f5676b     // Catch:{ all -> 0x0074 }
            r6 = r6[r4]     // Catch:{ all -> 0x0074 }
            if (r6 != 0) goto L_0x0048
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0074 }
            r0.format(r9, r6)     // Catch:{ all -> 0x0074 }
            goto L_0x005f
        L_0x0048:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0074 }
            int r9 = r6.f5666e     // Catch:{ all -> 0x0074 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0074 }
            r7[r1] = r9     // Catch:{ all -> 0x0074 }
            int r6 = r6.d     // Catch:{ all -> 0x0074 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0074 }
            r7[r3] = r6     // Catch:{ all -> 0x0074 }
            r0.format(r8, r7)     // Catch:{ all -> 0x0074 }
        L_0x005f:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x0062:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0074 }
            r0.format(r5, r6)     // Catch:{ all -> 0x0074 }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x006c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0074 }
            r0.close()
            return r1
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x007f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.f.d0.e.f.toString():java.lang.String");
    }
}
