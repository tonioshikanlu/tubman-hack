package i.a.a;

import java.lang.Thread;

public final class a implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        r5 = r5.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r14, java.lang.Throwable r15) {
        /*
            r13 = this;
            i.a.a.e.a r0 = i.a.a.c.f8043b
            boolean r0 = r0.f8046i
            if (r0 == 0) goto L_0x0216
            java.lang.String r0 = "CustomActivityOnCrash"
            java.lang.String r1 = "App has crashed, executing CustomActivityOnCrash's UncaughtExceptionHandler"
            android.util.Log.e(r0, r1, r15)
            android.app.Application r1 = i.a.a.c.a
            java.lang.String r2 = "custom_activity_on_crash"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            r4 = -1
            java.lang.String r6 = "last_crash_timestamp"
            long r4 = r1.getLong(r6, r4)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            long r7 = r1.getTime()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r9 = 1
            if (r1 > 0) goto L_0x0038
            long r7 = r7 - r4
            i.a.a.e.a r1 = i.a.a.c.f8043b
            int r1 = r1.f8051n
            long r4 = (long) r1
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0038
            r1 = r9
            goto L_0x0039
        L_0x0038:
            r1 = r3
        L_0x0039:
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = "App already crashed recently, not starting custom error activity because we could enter a restart loop. Are you sure that your app does not crash directly on init?"
            android.util.Log.e(r0, r1, r15)
            java.lang.Thread$UncaughtExceptionHandler r0 = r13.a
            if (r0 == 0) goto L_0x0200
            r0.uncaughtException(r14, r15)
            return
        L_0x0048:
            android.app.Application r1 = i.a.a.c.a
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            long r4 = r4.getTime()
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putLong(r6, r4)
            r1.commit()
            i.a.a.e.a r1 = i.a.a.c.f8043b
            java.lang.Class<? extends android.app.Activity> r1 = r1.f8053p
            r2 = 0
            r4 = 64
            if (r1 != 0) goto L_0x00aa
            android.app.Application r1 = i.a.a.c.a
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "cat.ereza.customactivityoncrash.ERROR"
            android.content.Intent r5 = r5.setAction(r6)
            java.lang.String r6 = r1.getPackageName()
            android.content.Intent r5 = r5.setPackage(r6)
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.List r1 = r1.queryIntentActivities(r5, r4)
            if (r1 == 0) goto L_0x00a5
            int r5 = r1.size()
            if (r5 <= 0) goto L_0x00a5
            java.lang.Object r1 = r1.get(r3)
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo     // Catch:{ ClassNotFoundException -> 0x009f }
            java.lang.String r1 = r1.name     // Catch:{ ClassNotFoundException -> 0x009f }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x009f }
            goto L_0x00a6
        L_0x009f:
            r1 = move-exception
            java.lang.String r5 = "Failed when resolving the error activity class via intent filter, stack trace follows!"
            android.util.Log.e(r0, r5, r1)
        L_0x00a5:
            r1 = r2
        L_0x00a6:
            if (r1 != 0) goto L_0x00aa
            java.lang.Class<cat.ereza.customactivityoncrash.activity.DefaultErrorActivity> r1 = cat.ereza.customactivityoncrash.activity.DefaultErrorActivity.class
        L_0x00aa:
            r5 = r15
        L_0x00ab:
            java.lang.StackTraceElement[] r6 = r5.getStackTrace()
            int r7 = r6.length
            r8 = r3
        L_0x00b1:
            if (r8 >= r7) goto L_0x00e0
            r10 = r6[r8]
            java.lang.String r11 = r10.getClassName()
            java.lang.String r12 = "android.app.ActivityThread"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00cd
            java.lang.String r11 = r10.getMethodName()
            java.lang.String r12 = "handleBindApplication"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00db
        L_0x00cd:
            java.lang.String r10 = r10.getClassName()
            java.lang.String r11 = r1.getName()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00dd
        L_0x00db:
            r5 = r9
            goto L_0x00e7
        L_0x00dd:
            int r8 = r8 + 1
            goto L_0x00b1
        L_0x00e0:
            java.lang.Throwable r5 = r5.getCause()
            if (r5 != 0) goto L_0x00ab
            r5 = r3
        L_0x00e7:
            if (r5 == 0) goto L_0x00f6
            java.lang.String r1 = "Your application class or your error activity have crashed, the custom activity will not be launched!"
            android.util.Log.e(r0, r1)
            java.lang.Thread$UncaughtExceptionHandler r0 = r13.a
            if (r0 == 0) goto L_0x0200
            r0.uncaughtException(r14, r15)
            return
        L_0x00f6:
            i.a.a.e.a r5 = i.a.a.c.f8043b
            int r5 = r5.f8045h
            if (r5 == r9) goto L_0x0110
            boolean r5 = i.a.a.c.f8044e
            if (r5 != 0) goto L_0x0101
            goto L_0x0110
        L_0x0101:
            i.a.a.e.a r0 = i.a.a.c.f8043b
            int r0 = r0.f8045h
            r1 = 2
            if (r0 != r1) goto L_0x0200
            java.lang.Thread$UncaughtExceptionHandler r0 = r13.a
            if (r0 == 0) goto L_0x0200
            r0.uncaughtException(r14, r15)
            return
        L_0x0110:
            android.content.Intent r14 = new android.content.Intent
            android.app.Application r5 = i.a.a.c.a
            r14.<init>(r5, r1)
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r1)
            r15.printStackTrace(r5)
            java.lang.String r15 = r1.toString()
            int r1 = r15.length()
            r5 = 131071(0x1ffff, float:1.8367E-40)
            if (r1 <= r5) goto L_0x0149
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r5 = 131047(0x1ffe7, float:1.83636E-40)
            java.lang.String r15 = r15.substring(r3, r5)
            r1.append(r15)
            java.lang.String r15 = " [stack trace too large]"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
        L_0x0149:
            java.lang.String r1 = "cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"
            r14.putExtra(r1, r15)
            i.a.a.e.a r15 = i.a.a.c.f8043b
            boolean r15 = r15.f8050m
            if (r15 == 0) goto L_0x0174
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
        L_0x0159:
            java.util.Deque<java.lang.String> r1 = i.a.a.c.c
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x016b
            java.lang.Object r1 = r1.poll()
            java.lang.String r1 = (java.lang.String) r1
            r15.append(r1)
            goto L_0x0159
        L_0x016b:
            java.lang.String r15 = r15.toString()
            java.lang.String r1 = "cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG"
            r14.putExtra(r1, r15)
        L_0x0174:
            i.a.a.e.a r15 = i.a.a.c.f8043b
            boolean r1 = r15.f8048k
            if (r1 == 0) goto L_0x01e5
            java.lang.Class<? extends android.app.Activity> r1 = r15.f8054q
            if (r1 != 0) goto L_0x01e5
            android.app.Application r1 = i.a.a.c.a
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "cat.ereza.customactivityoncrash.RESTART"
            android.content.Intent r5 = r5.setAction(r6)
            java.lang.String r6 = r1.getPackageName()
            android.content.Intent r5 = r5.setPackage(r6)
            android.content.pm.PackageManager r6 = r1.getPackageManager()
            java.util.List r4 = r6.queryIntentActivities(r5, r4)
            if (r4 == 0) goto L_0x01b8
            int r5 = r4.size()
            if (r5 <= 0) goto L_0x01b8
            java.lang.Object r3 = r4.get(r3)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r3 = r3.activityInfo     // Catch:{ ClassNotFoundException -> 0x01b2 }
            java.lang.String r3 = r3.name     // Catch:{ ClassNotFoundException -> 0x01b2 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x01b2 }
            goto L_0x01b9
        L_0x01b2:
            r3 = move-exception
            java.lang.String r4 = "Failed when resolving the restart activity class via intent filter, stack trace follows!"
            android.util.Log.e(r0, r4, r3)
        L_0x01b8:
            r3 = r2
        L_0x01b9:
            if (r3 != 0) goto L_0x01e3
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            java.lang.String r1 = r1.getPackageName()
            android.content.Intent r1 = r3.getLaunchIntentForPackage(r1)
            if (r1 == 0) goto L_0x01e2
            android.content.ComponentName r3 = r1.getComponent()
            if (r3 == 0) goto L_0x01e2
            android.content.ComponentName r1 = r1.getComponent()     // Catch:{ ClassNotFoundException -> 0x01dc }
            java.lang.String r1 = r1.getClassName()     // Catch:{ ClassNotFoundException -> 0x01dc }
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x01dc }
            goto L_0x01e2
        L_0x01dc:
            r1 = move-exception
            java.lang.String r3 = "Failed when resolving the restart activity class via getLaunchIntentForPackage, stack trace follows!"
            android.util.Log.e(r0, r3, r1)
        L_0x01e2:
            r3 = r2
        L_0x01e3:
            r15.f8054q = r3
        L_0x01e5:
            i.a.a.e.a r15 = i.a.a.c.f8043b
            java.lang.String r0 = "cat.ereza.customactivityoncrash.EXTRA_CONFIG"
            r14.putExtra(r0, r15)
            r15 = 268468224(0x10008000, float:2.5342157E-29)
            r14.setFlags(r15)
            i.a.a.e.a r15 = i.a.a.c.f8043b
            i.a.a.c$a r15 = r15.r
            if (r15 == 0) goto L_0x01fb
            r15.p()
        L_0x01fb:
            android.app.Application r15 = i.a.a.c.a
            r15.startActivity(r14)
        L_0x0200:
            java.lang.ref.WeakReference<android.app.Activity> r14 = i.a.a.c.d
            java.lang.Object r14 = r14.get()
            android.app.Activity r14 = (android.app.Activity) r14
            if (r14 == 0) goto L_0x0212
            r14.finish()
            java.lang.ref.WeakReference<android.app.Activity> r14 = i.a.a.c.d
            r14.clear()
        L_0x0212:
            i.a.a.c.d()
            goto L_0x021d
        L_0x0216:
            java.lang.Thread$UncaughtExceptionHandler r0 = r13.a
            if (r0 == 0) goto L_0x021d
            r0.uncaughtException(r14, r15)
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.a.a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
