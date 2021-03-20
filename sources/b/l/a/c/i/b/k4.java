package b.l.a.c.i.b;

public final class k4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m5 f4097h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ l4 f4098i;

    public k4(l4 l4Var, m5 m5Var) {
        this.f4098i = l4Var;
        this.f4097h = m5Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x045b, code lost:
        if (android.text.TextUtils.isEmpty(r1.f3943l) == false) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0300, code lost:
        if (android.text.TextUtils.isEmpty(r1.f3943l) == false) goto L_0x0302;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            b.l.a.c.i.b.l4 r0 = r13.f4098i
            b.l.a.c.i.b.m5 r1 = r13.f4097h
            b.l.a.c.i.b.i4 r2 = r0.d()
            r2.h()
            b.l.a.c.i.b.f r2 = r0.f4114g
            b.l.a.c.i.b.l4 r2 = r2.a
            b.l.a.c.i.b.y9 r2 = r2.f
            b.l.a.c.i.b.m r2 = new b.l.a.c.i.b.m
            r2.<init>(r0)
            r2.m()
            r0.v = r2
            b.l.a.c.i.b.c3 r2 = new b.l.a.c.i.b.c3
            long r3 = r1.f
            r2.<init>(r0, r3)
            r2.j()
            r0.w = r2
            b.l.a.c.i.b.e3 r1 = new b.l.a.c.i.b.e3
            r1.<init>(r0)
            r1.j()
            r0.t = r1
            b.l.a.c.i.b.b8 r1 = new b.l.a.c.i.b.b8
            r1.<init>(r0)
            r1.j()
            r0.u = r1
            b.l.a.c.i.b.k9 r1 = r0.f4119l
            r1.n()
            b.l.a.c.i.b.x3 r1 = r0.f4115h
            r1.n()
            b.l.a.c.i.b.b4 r1 = new b.l.a.c.i.b.b4
            r1.<init>(r0)
            r0.x = r1
            b.l.a.c.i.b.c3 r1 = r0.w
            boolean r3 = r1.f3887b
            if (r3 != 0) goto L_0x04d5
            r1.l()
            b.l.a.c.i.b.l4 r3 = r1.a
            java.util.concurrent.atomic.AtomicInteger r3 = r3.G
            r3.incrementAndGet()
            r3 = 1
            r1.f3887b = r3
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f4094l
            b.l.a.c.i.b.f r4 = r0.f4114g
            r4.n()
            r4 = 39000(0x9858, double:1.92686E-319)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "App measurement initialized, version"
            r1.b(r5, r4)
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f4094l
            java.lang.String r4 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r1.a(r4)
            java.lang.String r1 = r2.m()
            java.lang.String r2 = r0.f4112b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00c2
            b.l.a.c.i.b.k9 r2 = r0.t()
            boolean r2 = r2.H(r1)
            if (r2 == 0) goto L_0x00a3
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f4094l
            java.lang.String r2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r1.a(r2)
            goto L_0x00c2
        L_0x00a3:
            b.l.a.c.i.b.k3 r2 = r0.a()
            b.l.a.c.i.b.i3 r2 = r2.f4094l
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            int r5 = r1.length()
            if (r5 == 0) goto L_0x00ba
            java.lang.String r1 = r4.concat(r1)
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x00bf:
            r2.a(r1)
        L_0x00c2:
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f4095m
            java.lang.String r2 = "Debug-level message logging enabled"
            r1.a(r2)
            int r1 = r0.F
            java.util.concurrent.atomic.AtomicInteger r2 = r0.G
            int r2 = r2.get()
            if (r1 == r2) goto L_0x00f2
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            int r2 = r0.F
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.G
            int r4 = r4.get()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Not all components initialized"
            r1.c(r5, r2, r4)
        L_0x00f2:
            r0.y = r3
            b.l.a.c.i.b.l4 r0 = r13.f4098i
            b.l.a.c.i.b.m5 r1 = r13.f4097h
            b.l.a.c.f.i.zb r1 = r1.f4144g
            b.l.a.c.i.b.g r2 = b.l.a.c.i.b.g.c
            b.l.a.c.i.b.i4 r3 = r0.d()
            r3.h()
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.f r3 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r4 = b.l.a.c.i.b.x2.w0
            r5 = 0
            boolean r3 = r3.r(r5, r4)
            if (r3 == 0) goto L_0x01f1
            b.l.a.c.i.b.x3 r3 = r0.q()
            b.l.a.c.i.b.g r3 = r3.s()
            b.l.a.c.i.b.x3 r6 = r0.q()
            b.l.a.c.i.b.l4 r7 = r6.a
            r6.h()
            android.content.SharedPreferences r6 = r6.o()
            r7 = 100
            java.lang.String r8 = "consent_source"
            int r6 = r6.getInt(r8, r7)
            b.l.a.c.i.b.f r8 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r9 = b.l.a.c.i.b.x2.x0
            boolean r8 = r8.r(r5, r9)
            r10 = 40
            if (r8 == 0) goto L_0x01c4
            b.l.a.c.i.b.f r8 = r0.f4114g
            b.l.a.c.i.b.l4 r11 = r8.a
            b.l.a.c.f.i.t8.b()
            boolean r11 = r8.r(r5, r9)
            if (r11 != 0) goto L_0x0149
            r8 = r5
            goto L_0x014f
        L_0x0149:
            java.lang.String r11 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r8 = r8.t(r11)
        L_0x014f:
            b.l.a.c.i.b.f r11 = r0.f4114g
            b.l.a.c.i.b.l4 r12 = r11.a
            b.l.a.c.f.i.t8.b()
            boolean r9 = r11.r(r5, r9)
            if (r9 != 0) goto L_0x015e
            r9 = r5
            goto L_0x0164
        L_0x015e:
            java.lang.String r9 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r9 = r11.t(r9)
        L_0x0164:
            r11 = 20
            if (r8 != 0) goto L_0x016a
            if (r9 == 0) goto L_0x017b
        L_0x016a:
            b.l.a.c.i.b.x3 r12 = r0.q()
            boolean r12 = r12.r(r11)
            if (r12 == 0) goto L_0x017b
            b.l.a.c.i.b.g r1 = new b.l.a.c.i.b.g
            r1.<init>(r8, r9)
            r7 = r11
            goto L_0x01b8
        L_0x017b:
            b.l.a.c.i.b.c3 r8 = r0.b()
            java.lang.String r8 = r8.n()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0199
            r8 = 30
            if (r6 == r8) goto L_0x018f
            if (r6 != r10) goto L_0x0199
        L_0x018f:
            b.l.a.c.i.b.m6 r1 = r0.s()
            long r8 = r0.H
            r1.y(r2, r11, r8)
            goto L_0x01b7
        L_0x0199:
            if (r1 == 0) goto L_0x01b7
            android.os.Bundle r6 = r1.f3851n
            if (r6 == 0) goto L_0x01b7
            b.l.a.c.i.b.x3 r6 = r0.q()
            boolean r6 = r6.r(r10)
            if (r6 == 0) goto L_0x01b7
            android.os.Bundle r1 = r1.f3851n
            b.l.a.c.i.b.g r1 = b.l.a.c.i.b.g.a(r1)
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x01b7
            r7 = r10
            goto L_0x01b8
        L_0x01b7:
            r1 = r5
        L_0x01b8:
            if (r1 == 0) goto L_0x01ea
            b.l.a.c.i.b.m6 r2 = r0.s()
            long r8 = r0.H
            r2.y(r1, r7, r8)
            goto L_0x01e9
        L_0x01c4:
            if (r1 == 0) goto L_0x01ea
            android.os.Bundle r6 = r1.f3851n
            if (r6 == 0) goto L_0x01ea
            b.l.a.c.i.b.x3 r6 = r0.q()
            boolean r6 = r6.r(r10)
            if (r6 == 0) goto L_0x01ea
            android.os.Bundle r1 = r1.f3851n
            b.l.a.c.i.b.g r1 = b.l.a.c.i.b.g.a(r1)
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x01ea
            b.l.a.c.i.b.m6 r2 = r0.s()
            long r6 = r0.H
            r2.y(r1, r10, r6)
        L_0x01e9:
            r3 = r1
        L_0x01ea:
            b.l.a.c.i.b.m6 r1 = r0.s()
            r1.z(r3)
        L_0x01f1:
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.u3 r1 = r1.f4353e
            long r1 = r1.a()
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0215
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.u3 r1 = r1.f4353e
            b.l.a.c.c.p.b r2 = r0.f4121n
            b.l.a.c.c.p.c r2 = (b.l.a.c.c.p.c) r2
            java.util.Objects.requireNonNull(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.b(r2)
        L_0x0215:
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.u3 r1 = r1.f4357j
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r1 = r1.longValue()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0247
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f4096n
            long r2 = r0.H
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Persisting first open"
            r1.b(r3, r2)
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.u3 r1 = r1.f4357j
            long r2 = r0.H
            r1.b(r2)
        L_0x0247:
            b.l.a.c.i.b.m6 r1 = r0.s()
            b.l.a.c.i.b.r9 r1 = r1.f4156n
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0264
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x0264
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.i.b.x3 r1 = r1.q()
            b.l.a.c.i.b.w3 r1 = r1.z
            r1.b(r5)
        L_0x0264:
            boolean r1 = r0.l()
            if (r1 != 0) goto L_0x02e5
            boolean r1 = r0.j()
            if (r1 == 0) goto L_0x04c3
            b.l.a.c.i.b.k9 r1 = r0.t()
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r1 = r1.E(r2)
            if (r1 != 0) goto L_0x0287
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = "App is missing INTERNET permission"
            r1.a(r2)
        L_0x0287:
            b.l.a.c.i.b.k9 r1 = r0.t()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r1.E(r2)
            if (r1 != 0) goto L_0x029e
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            r1.a(r2)
        L_0x029e:
            android.content.Context r1 = r0.a
            b.l.a.c.c.q.a r1 = b.l.a.c.c.q.b.a(r1)
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x02d8
            b.l.a.c.i.b.f r1 = r0.f4114g
            boolean r1 = r1.z()
            if (r1 != 0) goto L_0x02d8
            android.content.Context r1 = r0.a
            boolean r1 = b.l.a.c.i.b.d4.a(r1)
            if (r1 != 0) goto L_0x02c5
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            r1.a(r2)
        L_0x02c5:
            android.content.Context r1 = r0.a
            boolean r1 = b.l.a.c.i.b.k9.D(r1)
            if (r1 != 0) goto L_0x02d8
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = "AppMeasurementService not registered/enabled"
            r1.a(r2)
        L_0x02d8:
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r2 = "Uploading is not possible. App measurement disabled"
            r1.a(r2)
            goto L_0x04c3
        L_0x02e5:
            b.l.a.c.i.b.c3 r1 = r0.b()
            java.lang.String r1 = r1.n()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0302
            b.l.a.c.i.b.c3 r1 = r0.b()
            r1.i()
            java.lang.String r1 = r1.f3943l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03c8
        L_0x0302:
            b.l.a.c.i.b.k9 r1 = r0.t()
            b.l.a.c.i.b.c3 r2 = r0.b()
            java.lang.String r2 = r2.n()
            b.l.a.c.i.b.x3 r3 = r0.q()
            r3.h()
            android.content.SharedPreferences r3 = r3.o()
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r3 = r3.getString(r6, r5)
            b.l.a.c.i.b.c3 r7 = r0.b()
            r7.i()
            java.lang.String r7 = r7.f3943l
            b.l.a.c.i.b.x3 r8 = r0.q()
            r8.h()
            android.content.SharedPreferences r8 = r8.o()
            java.lang.String r9 = "admob_app_id"
            java.lang.String r8 = r8.getString(r9, r5)
            boolean r1 = r1.p(r2, r3, r7, r8)
            if (r1 == 0) goto L_0x038d
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f4094l
            java.lang.String r2 = "Rechecking which service to use due to a GMP App Id change"
            r1.a(r2)
            b.l.a.c.i.b.x3 r1 = r0.q()
            r1.h()
            java.lang.Boolean r2 = r1.q()
            android.content.SharedPreferences r3 = r1.o()
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r3.clear()
            r3.apply()
            if (r2 == 0) goto L_0x0368
            r1.p(r2)
        L_0x0368:
            b.l.a.c.i.b.e3 r1 = r0.v()
            r1.l()
            b.l.a.c.i.b.b8 r1 = r0.u
            r1.o()
            b.l.a.c.i.b.b8 r1 = r0.u
            r1.l()
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.u3 r1 = r1.f4357j
            long r2 = r0.H
            r1.b(r2)
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.w3 r1 = r1.f4359l
            r1.b(r5)
        L_0x038d:
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.c3 r2 = r0.b()
            java.lang.String r2 = r2.n()
            r1.h()
            android.content.SharedPreferences r1 = r1.o()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r6, r2)
            r1.apply()
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.c3 r2 = r0.b()
            r2.i()
            java.lang.String r2 = r2.f3943l
            r1.h()
            android.content.SharedPreferences r1 = r1.o()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r9, r2)
            r1.apply()
        L_0x03c8:
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.f r1 = r0.f4114g
            boolean r1 = r1.r(r5, r4)
            if (r1 == 0) goto L_0x03ea
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.g r1 = r1.s()
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x03ea
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.w3 r1 = r1.f4359l
            r1.b(r5)
        L_0x03ea:
            b.l.a.c.i.b.m6 r1 = r0.s()
            b.l.a.c.i.b.x3 r2 = r0.q()
            b.l.a.c.i.b.w3 r2 = r2.f4359l
            java.lang.String r2 = r2.a()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = r1.f4149g
            r1.set(r2)
            b.l.a.c.f.i.c9.b()
            b.l.a.c.i.b.f r1 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r2 = b.l.a.c.i.b.x2.o0
            boolean r1 = r1.r(r5, r2)
            if (r1 == 0) goto L_0x0440
            b.l.a.c.i.b.k9 r1 = r0.t()
            b.l.a.c.i.b.l4 r1 = r1.a     // Catch:{ ClassNotFoundException -> 0x041c }
            android.content.Context r1 = r1.a     // Catch:{ ClassNotFoundException -> 0x041c }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x041c }
            java.lang.String r2 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x041c }
            goto L_0x0440
        L_0x041c:
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.w3 r1 = r1.y
            java.lang.String r1 = r1.a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0440
            b.l.a.c.i.b.k3 r1 = r0.a()
            b.l.a.c.i.b.i3 r1 = r1.f4091i
            java.lang.String r2 = "Remote config removed with active feature rollouts"
            r1.a(r2)
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.w3 r1 = r1.y
            r1.b(r5)
        L_0x0440:
            b.l.a.c.i.b.c3 r1 = r0.b()
            java.lang.String r1 = r1.n()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x045d
            b.l.a.c.i.b.c3 r1 = r0.b()
            r1.i()
            java.lang.String r1 = r1.f3943l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x04c3
        L_0x045d:
            boolean r1 = r0.j()
            b.l.a.c.i.b.x3 r2 = r0.q()
            android.content.SharedPreferences r2 = r2.c
            r3 = 0
            if (r2 != 0) goto L_0x046c
            r2 = r3
            goto L_0x0472
        L_0x046c:
            java.lang.String r4 = "deferred_analytics_collection"
            boolean r2 = r2.contains(r4)
        L_0x0472:
            if (r2 != 0) goto L_0x0485
            b.l.a.c.i.b.f r2 = r0.f4114g
            boolean r2 = r2.u()
            if (r2 != 0) goto L_0x0485
            b.l.a.c.i.b.x3 r2 = r0.q()
            r4 = r1 ^ 1
            r2.t(r4)
        L_0x0485:
            if (r1 == 0) goto L_0x048e
            b.l.a.c.i.b.m6 r1 = r0.s()
            r1.o()
        L_0x048e:
            b.l.a.c.i.b.q8 r1 = r0.r()
            b.l.a.c.i.b.p8 r1 = r1.d
            r1.a()
            b.l.a.c.i.b.b8 r1 = r0.z()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.z(r2)
            b.l.a.c.i.b.b8 r1 = r0.z()
            b.l.a.c.i.b.x3 r2 = r0.q()
            b.l.a.c.i.b.t3 r2 = r2.B
            android.os.Bundle r2 = r2.a()
            r1.h()
            r1.i()
            b.l.a.c.i.b.p9 r3 = r1.v(r3)
            b.l.a.c.i.b.j7 r4 = new b.l.a.c.i.b.j7
            r4.<init>(r1, r3, r2)
            r1.t(r4)
        L_0x04c3:
            b.l.a.c.i.b.x3 r1 = r0.q()
            b.l.a.c.i.b.s3 r1 = r1.s
            b.l.a.c.i.b.f r0 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r2 = b.l.a.c.i.b.x2.X
            boolean r0 = r0.r(r5, r2)
            r1.b(r0)
            return
        L_0x04d5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.k4.run():void");
    }
}
