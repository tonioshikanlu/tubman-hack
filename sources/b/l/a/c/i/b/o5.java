package b.l.a.c.i.b;

public final /* synthetic */ class o5 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final m6 f4195h;

    public o5(m6 m6Var) {
        this.f4195h = m6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            b.l.a.c.i.b.m6 r0 = r15.f4195h
            r0.h()
            b.l.a.c.i.b.l4 r1 = r0.a
            b.l.a.c.i.b.x3 r1 = r1.q()
            b.l.a.c.i.b.s3 r1 = r1.w
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x01e3
            b.l.a.c.i.b.l4 r1 = r0.a
            b.l.a.c.i.b.x3 r1 = r1.q()
            b.l.a.c.i.b.u3 r1 = r1.x
            long r1 = r1.a()
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.i.b.x3 r3 = r3.q()
            b.l.a.c.i.b.u3 r3 = r3.x
            r4 = 1
            long r4 = r4 + r1
            r3.b(r4)
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.i.b.f r4 = r3.f4114g
            r4 = 5
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r2 = 1
            if (r1 < 0) goto L_0x004f
            b.l.a.c.i.b.k3 r1 = r3.a()
            b.l.a.c.i.b.i3 r1 = r1.f4091i
            java.lang.String r3 = "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."
            r1.a(r3)
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.x3 r0 = r0.q()
            b.l.a.c.i.b.s3 r0 = r0.w
            r0.b(r2)
            return
        L_0x004f:
            b.l.a.c.i.b.i4 r0 = r3.d()
            r0.h()
            b.l.a.c.i.b.q6 r0 = r3.w()
            b.l.a.c.i.b.l4.o(r0)
            b.l.a.c.i.b.c3 r0 = r3.b()
            java.lang.String r0 = r0.m()
            b.l.a.c.i.b.x3 r1 = r3.q()
            r1.h()
            b.l.a.c.i.b.l4 r4 = r1.a
            b.l.a.c.c.p.b r4 = r4.f4121n
            b.l.a.c.c.p.c r4 = (b.l.a.c.c.p.c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r6 = r1.f4360m
            r7 = 0
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0093
            long r9 = r1.f4362o
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x0087
            goto L_0x0093
        L_0x0087:
            android.util.Pair r4 = new android.util.Pair
            boolean r1 = r1.f4361n
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.<init>(r6, r1)
            goto L_0x00e0
        L_0x0093:
            b.l.a.c.i.b.l4 r6 = r1.a
            b.l.a.c.i.b.f r6 = r6.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r9 = b.l.a.c.i.b.x2.f4340b
            long r9 = r6.o(r0, r9)
            long r9 = r9 + r4
            r1.f4362o = r9
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r2)
            b.l.a.c.i.b.l4 r4 = r1.a     // Catch:{ Exception -> 0x00c0 }
            android.content.Context r4 = r4.a     // Catch:{ Exception -> 0x00c0 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r4)     // Catch:{ Exception -> 0x00c0 }
            if (r4 == 0) goto L_0x00b9
            java.lang.String r5 = r4.getId()     // Catch:{ Exception -> 0x00c0 }
            r1.f4360m = r5     // Catch:{ Exception -> 0x00c0 }
            boolean r4 = r4.isLimitAdTrackingEnabled()     // Catch:{ Exception -> 0x00c0 }
            r1.f4361n = r4     // Catch:{ Exception -> 0x00c0 }
        L_0x00b9:
            java.lang.String r4 = r1.f4360m     // Catch:{ Exception -> 0x00c0 }
            if (r4 != 0) goto L_0x00d0
            r1.f4360m = r8     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00d0
        L_0x00c0:
            r4 = move-exception
            b.l.a.c.i.b.l4 r5 = r1.a
            b.l.a.c.i.b.k3 r5 = r5.a()
            b.l.a.c.i.b.i3 r5 = r5.f4095m
            java.lang.String r6 = "Unable to get advertising id"
            r5.b(r6, r4)
            r1.f4360m = r8
        L_0x00d0:
            com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(r7)
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r5 = r1.f4360m
            boolean r1 = r1.f4361n
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.<init>(r5, r1)
        L_0x00e0:
            b.l.a.c.i.b.f r1 = r3.f4114g
            boolean r1 = r1.v()
            if (r1 == 0) goto L_0x01d7
            java.lang.Object r1 = r4.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01d7
            java.lang.Object r1 = r4.first
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00fe
            goto L_0x01d7
        L_0x00fe:
            b.l.a.c.i.b.q6 r1 = r3.w()
            r1.l()
            b.l.a.c.i.b.l4 r1 = r1.a
            android.content.Context r1 = r1.a
            java.lang.String r5 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r5)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r5 = 0
            if (r1 == 0) goto L_0x0119
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0119 }
            goto L_0x011a
        L_0x0119:
            r1 = r5
        L_0x011a:
            if (r1 == 0) goto L_0x01ce
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L_0x01ce
            b.l.a.c.i.b.k9 r1 = r3.t()
            b.l.a.c.i.b.c3 r6 = r3.b()
            b.l.a.c.i.b.l4 r6 = r6.a
            b.l.a.c.i.b.f r6 = r6.f4114g
            r6.n()
            java.lang.Object r4 = r4.first
            java.lang.String r4 = (java.lang.String) r4
            b.l.a.c.i.b.x3 r6 = r3.q()
            b.l.a.c.i.b.u3 r6 = r6.x
            long r9 = r6.a()
            r11 = -1
            long r9 = r9 + r11
            java.util.Objects.requireNonNull(r1)
            b.l.a.c.b.a.x(r4)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            b.l.a.c.b.a.x(r0)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r13 = 39000(0x9858, double:1.92686E-319)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r12[r7] = r13     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            int r13 = r1.M()     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r12[r2] = r13     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            java.lang.String r13 = "v%s.%s"
            java.lang.String r12 = java.lang.String.format(r13, r12)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r6[r7] = r12     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r6[r2] = r4     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r6[r11] = r0     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r2 = 3
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r6[r2] = r4     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            java.lang.String r2 = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s"
            java.lang.String r2 = java.lang.String.format(r2, r6)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            b.l.a.c.i.b.l4 r4 = r1.a     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            b.l.a.c.i.b.f r4 = r4.f4114g     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            java.lang.String r6 = "debug.deferred.deeplink"
            java.lang.String r4 = r4.j(r6, r8)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            boolean r4 = r0.equals(r4)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            if (r4 == 0) goto L_0x0193
            java.lang.String r4 = "&ddl_test=1"
            java.lang.String r2 = r2.concat(r4)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
        L_0x0193:
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r4.<init>(r2)     // Catch:{ MalformedURLException -> 0x019c, IllegalArgumentException -> 0x019a }
            r5 = r4
            goto L_0x01ae
        L_0x019a:
            r2 = move-exception
            goto L_0x019d
        L_0x019c:
            r2 = move-exception
        L_0x019d:
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = r2.getMessage()
            java.lang.String r4 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r1.b(r4, r2)
        L_0x01ae:
            if (r5 == 0) goto L_0x01e2
            b.l.a.c.i.b.q6 r1 = r3.w()
            b.l.a.c.i.b.j4 r2 = new b.l.a.c.i.b.j4
            r2.<init>(r3)
            r1.h()
            r1.l()
            b.l.a.c.i.b.l4 r3 = r1.a
            b.l.a.c.i.b.i4 r3 = r3.d()
            b.l.a.c.i.b.p6 r4 = new b.l.a.c.i.b.p6
            r4.<init>(r1, r0, r5, r2)
            r3.t(r4)
            goto L_0x01e2
        L_0x01ce:
            b.l.a.c.i.b.k3 r0 = r3.a()
            b.l.a.c.i.b.i3 r0 = r0.f4091i
            java.lang.String r1 = "Network is not available for Deferred Deep Link request. Skipping"
            goto L_0x01df
        L_0x01d7:
            b.l.a.c.i.b.k3 r0 = r3.a()
            b.l.a.c.i.b.i3 r0 = r0.f4095m
            java.lang.String r1 = "ADID unavailable to retrieve Deferred Deep Link. Skipping"
        L_0x01df:
            r0.a(r1)
        L_0x01e2:
            return
        L_0x01e3:
            b.l.a.c.i.b.l4 r0 = r0.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4095m
            java.lang.String r1 = "Deferred Deep Link already retrieved. Not fetching again."
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.o5.run():void");
    }
}
