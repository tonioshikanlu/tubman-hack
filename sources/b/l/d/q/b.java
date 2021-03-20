package b.l.d.q;

import b.l.d.p.g;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;

public final /* synthetic */ class b implements g {
    public final CrashlyticsRegistrar a;

    public b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.a = crashlyticsRegistrar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: b.l.d.q.f.e.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: b.l.d.q.f.e.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: b.l.d.q.f.e.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: b.l.d.q.f.e.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: b.l.d.q.f.e.f} */
    /* JADX WARNING: type inference failed for: r4v42, types: [b.l.d.q.f.e.d, b.l.d.q.f.e.b] */
    /* JADX WARNING: type inference failed for: r7v7, types: [b.l.d.q.f.e.b, b.l.d.q.f.e.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0325 A[SYNTHETIC, Splitter:B:68:0x0325] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0415 A[Catch:{ Exception -> 0x0425 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(b.l.d.p.e r34) {
        /*
            r33 = this;
            r1 = r33
            r0 = r34
            com.google.firebase.crashlytics.CrashlyticsRegistrar r2 = r1.a
            java.util.Objects.requireNonNull(r2)
            java.lang.Class<b.l.d.d> r2 = b.l.d.d.class
            java.lang.Object r2 = r0.a(r2)
            b.l.d.d r2 = (b.l.d.d) r2
            java.lang.Class<b.l.d.q.f.a> r3 = b.l.d.q.f.a.class
            java.lang.Object r3 = r0.a(r3)
            b.l.d.q.f.a r3 = (b.l.d.q.f.a) r3
            java.lang.Class<b.l.d.n.a.a> r4 = b.l.d.n.a.a.class
            java.lang.Object r4 = r0.a(r4)
            b.l.d.n.a.a r4 = (b.l.d.n.a.a) r4
            java.lang.Class<b.l.d.x.e> r5 = b.l.d.x.e.class
            java.lang.Object r0 = r0.a(r5)
            b.l.d.x.e r0 = (b.l.d.x.e) r0
            b.l.d.q.f.b r11 = b.l.d.q.f.b.a
            java.lang.String r5 = "Initializing Firebase Crashlytics 17.3.1"
            r6 = 4
            boolean r6 = r11.a(r6)
            r12 = 0
            if (r6 == 0) goto L_0x003a
            java.lang.String r6 = "FirebaseCrashlytics"
            android.util.Log.i(r6, r5, r12)
        L_0x003a:
            r2.a()
            android.content.Context r14 = r2.a
            java.lang.String r5 = r14.getPackageName()
            b.l.d.q.f.g.f0 r13 = new b.l.d.q.f.g.f0
            r13.<init>(r14, r5, r0)
            b.l.d.q.f.g.b0 r0 = new b.l.d.q.f.g.b0
            r0.<init>(r2)
            if (r3 != 0) goto L_0x0054
            b.l.d.q.f.c r3 = new b.l.d.q.f.c
            r3.<init>()
        L_0x0054:
            r6 = r3
            if (r4 == 0) goto L_0x00a9
            java.lang.String r3 = "Firebase Analytics is available."
            r11.b(r3)
            b.l.d.q.f.e.e r3 = new b.l.d.q.f.e.e
            r3.<init>(r4)
            b.l.d.q.a r5 = new b.l.d.q.a
            r5.<init>()
            java.lang.String r7 = "clx"
            b.l.d.n.a.a$a r7 = r4.b(r7, r5)
            if (r7 != 0) goto L_0x0080
            java.lang.String r7 = "Could not register AnalyticsConnectorListener with Crashlytics origin."
            r11.b(r7)
            java.lang.String r7 = "crash"
            b.l.d.n.a.a$a r7 = r4.b(r7, r5)
            if (r7 == 0) goto L_0x0080
            java.lang.String r4 = "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."
            r11.f(r4)
        L_0x0080:
            if (r7 == 0) goto L_0x009c
            java.lang.String r4 = "Firebase Analytics listener registered successfully."
            r11.b(r4)
            b.l.d.q.f.e.d r4 = new b.l.d.q.f.e.d
            r4.<init>()
            b.l.d.q.f.e.c r7 = new b.l.d.q.f.e.c
            r8 = 500(0x1f4, float:7.0E-43)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r7.<init>(r3, r8, r9)
            r5.f5053b = r4
            r5.a = r7
            r8 = r4
            r9 = r7
            goto L_0x00ba
        L_0x009c:
            java.lang.String r4 = "Firebase Analytics listener registration failed."
            r11.b(r4)
            b.l.d.q.f.f.b r4 = new b.l.d.q.f.f.b
            r4.<init>()
            r9 = r3
            r8 = r4
            goto L_0x00ba
        L_0x00a9:
            java.lang.String r3 = "Firebase Analytics is unavailable."
            r11.b(r3)
            b.l.d.q.f.f.b r3 = new b.l.d.q.f.f.b
            r3.<init>()
            b.l.d.q.f.e.f r4 = new b.l.d.q.f.e.f
            r4.<init>()
            r8 = r3
            r9 = r4
        L_0x00ba:
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r10 = b.l.a.c.b.a.g(r3)
            b.l.d.q.f.g.v r15 = new b.l.d.q.f.g.v
            r3 = r15
            r4 = r2
            r5 = r13
            r7 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2.a()
            b.l.d.l r2 = r2.c
            java.lang.String r2 = r2.f4918b
            java.lang.String r5 = b.l.d.q.f.g.e.f(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Mapping file ID is: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r11.b(r3)
            b.l.d.q.f.o.a r10 = new b.l.d.q.f.o.a
            r10.<init>(r14)
            r3 = 6
            java.lang.String r7 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x0459 }
            java.lang.String r6 = r13.c()     // Catch:{ NameNotFoundException -> 0x0459 }
            android.content.pm.PackageManager r4 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0459 }
            r9 = 0
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r7, r9)     // Catch:{ NameNotFoundException -> 0x0459 }
            int r8 = r4.versionCode     // Catch:{ NameNotFoundException -> 0x0459 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ NameNotFoundException -> 0x0459 }
            java.lang.String r4 = r4.versionName     // Catch:{ NameNotFoundException -> 0x0459 }
            if (r4 != 0) goto L_0x010b
            java.lang.String r4 = "0.0"
        L_0x010b:
            r16 = r4
            b.l.d.q.f.g.a r12 = new b.l.d.q.f.g.a     // Catch:{ NameNotFoundException -> 0x0459 }
            r3 = r12
            r4 = r2
            r31 = r9
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ NameNotFoundException -> 0x0454 }
            java.lang.String r3 = "Installer package name is: "
            java.lang.StringBuilder r3 = b.e.a.a.a.y(r3)
            java.lang.String r4 = r12.c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r11.b(r3)
            java.lang.String r3 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r3 = b.l.a.c.b.a.g(r3)
            b.l.d.q.f.j.b r4 = new b.l.d.q.f.j.b
            r4.<init>()
            java.lang.String r5 = r12.f5057e
            java.lang.String r6 = r12.f
            java.lang.String r7 = r13.c()
            b.l.d.q.f.g.l0 r8 = new b.l.d.q.f.g.l0
            r8.<init>()
            b.l.d.q.f.m.g r9 = new b.l.d.q.f.m.g
            r9.<init>(r8)
            b.l.d.q.f.m.a r10 = new b.l.d.q.f.m.a
            r10.<init>(r14)
            java.util.Locale r1 = java.util.Locale.US
            r34 = r15
            r15 = 1
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r31] = r2
            r32 = r11
            java.lang.String r11 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r11 = java.lang.String.format(r1, r11, r15)
            b.l.d.q.f.m.k.a r15 = new b.l.d.q.f.m.k.a
            r15.<init>(r11, r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r11 = android.os.Build.MANUFACTURER
            java.lang.String r11 = r13.e(r11)
            r4[r31] = r11
            java.lang.String r11 = android.os.Build.MODEL
            java.lang.String r11 = r13.e(r11)
            r16 = 1
            r4[r16] = r11
            java.lang.String r11 = "%s/%s"
            java.lang.String r17 = java.lang.String.format(r1, r11, r4)
            java.lang.String r1 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r18 = r13.e(r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r19 = r13.e(r1)
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r4 = b.l.d.q.f.g.e.f(r14)
            r1[r31] = r4
            r1[r16] = r2
            r4 = 2
            r1[r4] = r6
            r4 = 3
            r1[r4] = r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r16 = r15
            r11 = r31
        L_0x01a3:
            r15 = 4
            if (r11 >= r15) goto L_0x01c9
            r15 = r1[r11]
            r20 = r1
            if (r15 == 0) goto L_0x01c0
            java.lang.String r1 = "-"
            r25 = r12
            java.lang.String r12 = ""
            java.lang.String r1 = r15.replace(r1, r12)
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r12)
            r4.add(r1)
            goto L_0x01c2
        L_0x01c0:
            r25 = r12
        L_0x01c2:
            int r11 = r11 + 1
            r1 = r20
            r12 = r25
            goto L_0x01a3
        L_0x01c9:
            r25 = r12
            java.util.Collections.sort(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x01d7:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x01e7
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            r1.append(r11)
            goto L_0x01d7
        L_0x01e7:
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x01f6
            java.lang.String r1 = b.l.d.q.f.g.e.m(r1)
            goto L_0x01f7
        L_0x01f6:
            r1 = 0
        L_0x01f7:
            r21 = r1
            if (r7 == 0) goto L_0x01fe
            b.l.d.q.f.g.c0 r1 = b.l.d.q.f.g.c0.APP_STORE
            goto L_0x0200
        L_0x01fe:
            b.l.d.q.f.g.c0 r1 = b.l.d.q.f.g.c0.DEVELOPER
        L_0x0200:
            int r1 = r1.f5069h
            b.l.d.q.f.m.j.f r4 = new b.l.d.q.f.m.j.f
            r7 = r34
            r11 = r16
            r15 = r4
            r16 = r2
            r20 = r13
            r22 = r6
            r23 = r5
            r24 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            b.l.d.q.f.m.e r1 = new b.l.d.q.f.m.e
            r13 = r1
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            b.l.d.q.f.m.c r0 = b.l.d.q.f.m.c.USE_CACHE
            android.content.Context r2 = r1.a
            android.content.SharedPreferences r2 = b.l.d.q.f.g.e.h(r2)
            java.lang.String r4 = "existing_instance_identifier"
            java.lang.String r5 = ""
            java.lang.String r2 = r2.getString(r4, r5)
            b.l.d.q.f.m.j.f r4 = r1.f5274b
            java.lang.String r4 = r4.f
            boolean r2 = r2.equals(r4)
            r2 = r2 ^ 1
            if (r2 != 0) goto L_0x0260
            b.l.d.q.f.m.j.e r0 = r1.a(r0)
            if (r0 == 0) goto L_0x0260
            java.util.concurrent.atomic.AtomicReference<b.l.d.q.f.m.j.d> r2 = r1.f5277h
            r2.set(r0)
            java.util.concurrent.atomic.AtomicReference<b.l.a.c.k.i<b.l.d.q.f.m.j.a>> r2 = r1.f5278i
            java.lang.Object r2 = r2.get()
            b.l.a.c.k.i r2 = (b.l.a.c.k.i) r2
            b.l.d.q.f.m.j.a r0 = r0.a
            r2.b(r0)
            r0 = 0
            b.l.a.c.k.h r0 = b.l.a.c.b.a.X(r0)
            goto L_0x02a5
        L_0x0260:
            b.l.d.q.f.m.c r0 = b.l.d.q.f.m.c.IGNORE_CACHE_EXPIRATION
            b.l.d.q.f.m.j.e r0 = r1.a(r0)
            if (r0 == 0) goto L_0x027a
            java.util.concurrent.atomic.AtomicReference<b.l.d.q.f.m.j.d> r2 = r1.f5277h
            r2.set(r0)
            java.util.concurrent.atomic.AtomicReference<b.l.a.c.k.i<b.l.d.q.f.m.j.a>> r2 = r1.f5278i
            java.lang.Object r2 = r2.get()
            b.l.a.c.k.i r2 = (b.l.a.c.k.i) r2
            b.l.d.q.f.m.j.a r0 = r0.a
            r2.b(r0)
        L_0x027a:
            b.l.d.q.f.g.b0 r0 = r1.f5276g
            b.l.a.c.k.i<java.lang.Void> r2 = r0.f5063g
            b.l.a.c.k.e0<TResult> r2 = r2.a
            java.lang.Object r4 = r0.c
            monitor-enter(r4)
            b.l.a.c.k.i<java.lang.Void> r0 = r0.d     // Catch:{ all -> 0x0451 }
            b.l.a.c.k.e0<TResult> r0 = r0.a     // Catch:{ all -> 0x0451 }
            monitor-exit(r4)     // Catch:{ all -> 0x0451 }
            java.util.concurrent.ExecutorService r4 = b.l.d.q.f.g.q0.a
            b.l.a.c.k.i r4 = new b.l.a.c.k.i
            r4.<init>()
            b.l.d.q.f.g.o0 r5 = new b.l.d.q.f.g.o0
            r5.<init>(r4)
            r2.f(r5)
            r0.f(r5)
            b.l.a.c.k.e0<TResult> r0 = r4.a
            b.l.d.q.f.m.d r2 = new b.l.d.q.f.m.d
            r2.<init>(r1)
            b.l.a.c.k.h r0 = r0.o(r3, r2)
        L_0x02a5:
            b.l.d.q.c r2 = new b.l.d.q.c
            r2.<init>()
            r0.g(r3, r2)
            android.content.Context r0 = r7.a
            java.lang.String r2 = "com.crashlytics.RequireBuildId"
            r4 = 1
            boolean r0 = b.l.d.q.f.g.e.d(r0, r2, r4)
            r2 = r25
            java.lang.String r4 = r2.f5056b
            java.lang.String r5 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            java.lang.String r6 = "FirebaseCrashlytics"
            if (r0 != 0) goto L_0x02c8
            java.lang.String r0 = "Configured not to require a build ID."
            r8 = r32
            r8.b(r0)
            goto L_0x02d0
        L_0x02c8:
            r8 = r32
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x02d2
        L_0x02d0:
            r9 = 1
            goto L_0x0323
        L_0x02d2:
            java.lang.String r0 = "."
            android.util.Log.e(r6, r0)
            java.lang.String r4 = ".     |  | "
            android.util.Log.e(r6, r4)
            java.lang.String r4 = ".     |  |"
            android.util.Log.e(r6, r4)
            android.util.Log.e(r6, r4)
            java.lang.String r9 = ".   \\ |  | /"
            android.util.Log.e(r6, r9)
            java.lang.String r9 = ".    \\    /"
            android.util.Log.e(r6, r9)
            java.lang.String r9 = ".     \\  /"
            android.util.Log.e(r6, r9)
            java.lang.String r9 = ".      \\/"
            android.util.Log.e(r6, r9)
            android.util.Log.e(r6, r0)
            android.util.Log.e(r6, r5)
            android.util.Log.e(r6, r0)
            java.lang.String r9 = ".      /\\"
            android.util.Log.e(r6, r9)
            java.lang.String r9 = ".     /  \\"
            android.util.Log.e(r6, r9)
            java.lang.String r9 = ".    /    \\"
            android.util.Log.e(r6, r9)
            java.lang.String r9 = ".   / |  | \\"
            android.util.Log.e(r6, r9)
            android.util.Log.e(r6, r4)
            android.util.Log.e(r6, r4)
            android.util.Log.e(r6, r4)
            android.util.Log.e(r6, r0)
            r9 = r31
        L_0x0323:
            if (r9 == 0) goto L_0x044b
            b.l.d.q.f.k.h r0 = new b.l.d.q.f.k.h     // Catch:{ Exception -> 0x0427 }
            android.content.Context r4 = r7.a     // Catch:{ Exception -> 0x0427 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.x r4 = new b.l.d.q.f.g.x     // Catch:{ Exception -> 0x0427 }
            java.lang.String r5 = "crash_marker"
            r4.<init>(r5, r0)     // Catch:{ Exception -> 0x0427 }
            r7.f5121e = r4     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.x r4 = new b.l.d.q.f.g.x     // Catch:{ Exception -> 0x0427 }
            java.lang.String r5 = "initialization_marker"
            r4.<init>(r5, r0)     // Catch:{ Exception -> 0x0427 }
            r7.d = r4     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.m0 r25 = new b.l.d.q.f.g.m0     // Catch:{ Exception -> 0x0427 }
            r25.<init>()     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.v$c r4 = new b.l.d.q.f.g.v$c     // Catch:{ Exception -> 0x0427 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.h.b r5 = new b.l.d.q.f.h.b     // Catch:{ Exception -> 0x0427 }
            android.content.Context r9 = r7.a     // Catch:{ Exception -> 0x0427 }
            r5.<init>(r9, r4)     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.n.a r9 = new b.l.d.q.f.n.a     // Catch:{ Exception -> 0x0427 }
            r10 = 1024(0x400, float:1.435E-42)
            r11 = 1
            b.l.d.q.f.n.d[] r11 = new b.l.d.q.f.n.d[r11]     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.n.c r12 = new b.l.d.q.f.n.c     // Catch:{ Exception -> 0x0427 }
            r13 = 10
            r12.<init>(r13)     // Catch:{ Exception -> 0x0427 }
            r11[r31] = r12     // Catch:{ Exception -> 0x0427 }
            r9.<init>(r10, r11)     // Catch:{ Exception -> 0x0427 }
            android.content.Context r10 = r7.a     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.f0 r11 = r7.f5122g     // Catch:{ Exception -> 0x0427 }
            r17 = r10
            r18 = r11
            r19 = r0
            r20 = r2
            r21 = r5
            r22 = r25
            r23 = r9
            r24 = r1
            b.l.d.q.f.g.k0 r28 = b.l.d.q.f.g.k0.a(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.q r9 = new b.l.d.q.f.g.q     // Catch:{ Exception -> 0x0427 }
            android.content.Context r10 = r7.a     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.f r11 = r7.f5126k     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.f0 r12 = r7.f5122g     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.b0 r13 = r7.f5120b     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.g.x r14 = r7.f5121e     // Catch:{ Exception -> 0x0427 }
            b.l.d.q.f.a r15 = r7.f5127l     // Catch:{ Exception -> 0x0427 }
            r34 = r3
            b.l.d.q.f.e.a r3 = r7.f5124i     // Catch:{ Exception -> 0x0425 }
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r0
            r23 = r14
            r24 = r2
            r26 = r5
            r27 = r4
            r29 = r15
            r30 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x0425 }
            r7.f = r9     // Catch:{ Exception -> 0x0425 }
            b.l.d.q.f.g.x r0 = r7.d     // Catch:{ Exception -> 0x0425 }
            java.io.File r0 = r0.b()     // Catch:{ Exception -> 0x0425 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0425 }
            b.l.d.q.f.g.f r2 = r7.f5126k     // Catch:{ Exception -> 0x0425 }
            b.l.d.q.f.g.w r3 = new b.l.d.q.f.g.w     // Catch:{ Exception -> 0x0425 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0425 }
            b.l.a.c.k.h r2 = r2.b(r3)     // Catch:{ Exception -> 0x0425 }
            java.lang.Object r2 = b.l.d.q.f.g.q0.a(r2)     // Catch:{ Exception -> 0x03c9 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x03c9 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0425 }
            r3.equals(r2)     // Catch:{ Exception -> 0x0425 }
        L_0x03c9:
            b.l.d.q.f.g.q r2 = r7.f     // Catch:{ Exception -> 0x0425 }
            java.lang.Thread$UncaughtExceptionHandler r3 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x0425 }
            b.l.d.q.f.g.f r4 = r2.d     // Catch:{ Exception -> 0x0425 }
            b.l.d.q.f.g.s r5 = new b.l.d.q.f.g.s     // Catch:{ Exception -> 0x0425 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0425 }
            r4.b(r5)     // Catch:{ Exception -> 0x0425 }
            b.l.d.q.f.g.k r4 = new b.l.d.q.f.g.k     // Catch:{ Exception -> 0x0425 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x0425 }
            b.l.d.q.f.g.a0 r5 = new b.l.d.q.f.g.a0     // Catch:{ Exception -> 0x0425 }
            r5.<init>(r4, r1, r3)     // Catch:{ Exception -> 0x0425 }
            r2.f5113n = r5     // Catch:{ Exception -> 0x0425 }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r5)     // Catch:{ Exception -> 0x0425 }
            if (r0 == 0) goto L_0x041e
            android.content.Context r0 = r7.a     // Catch:{ Exception -> 0x0425 }
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            int r2 = r0.checkCallingOrSelfPermission(r2)     // Catch:{ Exception -> 0x0425 }
            if (r2 != 0) goto L_0x03f6
            r9 = 1
            goto L_0x03f8
        L_0x03f6:
            r9 = r31
        L_0x03f8:
            if (r9 == 0) goto L_0x0412
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ Exception -> 0x0425 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x0425 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0425 }
            if (r0 == 0) goto L_0x040f
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ Exception -> 0x0425 }
            if (r0 == 0) goto L_0x040f
            goto L_0x0412
        L_0x040f:
            r9 = r31
            goto L_0x0413
        L_0x0412:
            r9 = 1
        L_0x0413:
            if (r9 == 0) goto L_0x041e
            java.lang.String r0 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r8.b(r0)     // Catch:{ Exception -> 0x0425 }
            r7.b(r1)     // Catch:{ Exception -> 0x0425 }
            goto L_0x0439
        L_0x041e:
            java.lang.String r0 = "Exception handling initialization successful"
            r8.b(r0)
            r9 = 1
            goto L_0x043b
        L_0x0425:
            r0 = move-exception
            goto L_0x042a
        L_0x0427:
            r0 = move-exception
            r34 = r3
        L_0x042a:
            r2 = 6
            boolean r2 = r8.a(r2)
            if (r2 == 0) goto L_0x0436
            java.lang.String r2 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r6, r2, r0)
        L_0x0436:
            r0 = 0
            r7.f = r0
        L_0x0439:
            r9 = r31
        L_0x043b:
            b.l.d.q.d r0 = new b.l.d.q.d
            r0.<init>(r9, r7, r1)
            r1 = r34
            b.l.a.c.b.a.i(r1, r0)
            b.l.d.q.e r0 = new b.l.d.q.e
            r0.<init>(r7)
            goto L_0x0469
        L_0x044b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0451:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0451 }
            throw r0
        L_0x0454:
            r0 = move-exception
            r8 = r11
            r3 = 6
            r12 = 0
            goto L_0x045b
        L_0x0459:
            r0 = move-exception
            r8 = r11
        L_0x045b:
            java.lang.String r1 = "Could not retrieve app info, initialization failed."
            boolean r2 = r8.a(r3)
            if (r2 == 0) goto L_0x0468
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.e(r2, r1, r0)
        L_0x0468:
            r0 = r12
        L_0x0469:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.b.a(b.l.d.p.e):java.lang.Object");
    }
}
