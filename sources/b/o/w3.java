package b.o;

public class w3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f6343h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ x3 f6344i;

    public w3(x3 x3Var, String str) {
        this.f6344i = x3Var;
        this.f6343h = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ca A[LOOP:0: B:1:0x0002->B:27:0x00ca, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            r2 = 5
            if (r1 >= r2) goto L_0x00d3
            b.o.x3 r3 = r12.f6344i
            java.lang.String r4 = r12.f6343h
            java.util.Objects.requireNonNull(r3)
            java.lang.String r5 = " Token"
            b.o.i2$k r6 = b.o.i2.k.INFO
            b.o.i2$k r7 = b.o.i2.k.ERROR
            r8 = 0
            r9 = 1
            java.lang.String r4 = r3.c(r4)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            r10.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            java.lang.String r11 = "Device registered, push token = "
            r10.append(r11)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            r10.append(r4)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            b.o.i2.a(r6, r10, r8)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            b.o.u3$a r10 = r3.a     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            b.o.i2$d r10 = (b.o.i2.d) r10
            r10.a(r4, r9)     // Catch:{ IOException -> 0x0052, all -> 0x0035 }
            goto L_0x00c7
        L_0x0035:
            r2 = move-exception
            java.lang.String r4 = "Unknown error getting "
            java.lang.StringBuilder r4 = b.e.a.a.a.y(r4)
            java.lang.String r6 = r3.b()
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            b.o.i2.a(r7, r4, r2)
            b.o.u3$a r2 = r3.a
            r3 = -12
            goto L_0x007e
        L_0x0052:
            r4 = move-exception
            java.lang.String r10 = r4.getMessage()
            java.lang.String r11 = "SERVICE_NOT_AVAILABLE"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0084
            java.lang.String r2 = "Error Getting "
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            java.lang.String r6 = r3.b()
            r2.append(r6)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            b.o.i2.a(r7, r2, r4)
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x00c7
            b.o.u3$a r2 = r3.a
            r3 = -11
        L_0x007e:
            b.o.i2$d r2 = (b.o.i2.d) r2
            r2.a(r8, r3)
            goto L_0x00c7
        L_0x0084:
            r5 = 4
            if (r1 < r5) goto L_0x00a3
            java.lang.String r5 = "Retry count of "
            java.lang.String r6 = " exceed! Could not get a "
            java.lang.StringBuilder r2 = b.e.a.a.a.z(r5, r2, r6)
            java.lang.String r3 = r3.b()
            r2.append(r3)
            java.lang.String r3 = " Token."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            b.o.i2.a(r7, r2, r4)
            goto L_0x00c6
        L_0x00a3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "'Google Play services' returned SERVICE_NOT_AVAILABLE error. Current retry count: "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            b.o.i2.a(r6, r2, r4)
            r2 = 2
            if (r1 != r2) goto L_0x00c6
            b.o.u3$a r2 = r3.a
            r4 = -9
            b.o.i2$d r2 = (b.o.i2.d) r2
            r2.a(r8, r4)
            r3.c = r9
            goto L_0x00c7
        L_0x00c6:
            r9 = r0
        L_0x00c7:
            if (r9 == 0) goto L_0x00ca
            return
        L_0x00ca:
            int r1 = r1 + 1
            int r2 = r1 * 10000
            b.o.f2.v(r2)
            goto L_0x0002
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.o.w3.run():void");
    }
}
