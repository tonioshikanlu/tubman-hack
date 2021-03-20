package com.onesignal.shortcutbadger.impl;

import b.o.w4.a;
import java.util.Collections;
import java.util.List;

public class OPPOHomeBader implements a {
    public static int a = -1;

    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063  */
    @android.annotation.TargetApi(11)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r5, android.content.ComponentName r6, int r7) {
        /*
            r4 = this;
            if (r7 != 0) goto L_0x0003
            r7 = -1
        L_0x0003:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.oppo.unsettledevent"
            r0.<init>(r1)
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r1 = "pakeageName"
            r0.putExtra(r1, r6)
            java.lang.String r6 = "number"
            r0.putExtra(r6, r7)
            java.lang.String r6 = "upgradeNumber"
            r0.putExtra(r6, r7)
            boolean r6 = b.l.f.x.a.g.g(r5, r0)
            if (r6 == 0) goto L_0x0028
            r5.sendBroadcast(r0)
            goto L_0x00bd
        L_0x0028:
            int r6 = a
            r1 = 0
            if (r6 < 0) goto L_0x002e
            goto L_0x0089
        L_0x002e:
            java.lang.String r6 = "com.color.os.ColorBuild"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r6 = r1
        L_0x0036:
            java.lang.String r2 = "getColorOSVERSION"
            if (r6 == 0) goto L_0x0058
            boolean r3 = r4.c(r2)     // Catch:{ Exception -> 0x0060 }
            if (r3 != 0) goto L_0x0058
            java.lang.reflect.Method r6 = r4.d(r6, r2, r1)     // Catch:{ Exception -> 0x0060 }
            if (r6 == 0) goto L_0x0058
            r2 = 1
            r6.setAccessible(r2)     // Catch:{ Exception -> 0x0060 }
            java.lang.Object r6 = r6.invoke(r1, r1)     // Catch:{ IllegalAccessException -> 0x0054, InvocationTargetException -> 0x004f }
            goto L_0x0059
        L_0x004f:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ Exception -> 0x0060 }
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ Exception -> 0x0060 }
        L_0x0058:
            r6 = r1
        L_0x0059:
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x0060 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x0060 }
            goto L_0x0061
        L_0x0060:
            r6 = 0
        L_0x0061:
            if (r6 != 0) goto L_0x0087
            java.lang.String r2 = "ro.build.version.opporom"
            java.lang.String r2 = r4.e(r2)     // Catch:{ Exception -> 0x0087 }
            java.lang.String r3 = "V1.4"
            boolean r3 = r2.startsWith(r3)     // Catch:{ Exception -> 0x0087 }
            if (r3 == 0) goto L_0x0073
            r6 = 3
            goto L_0x0089
        L_0x0073:
            java.lang.String r3 = "V2.0"
            boolean r3 = r2.startsWith(r3)     // Catch:{ Exception -> 0x0087 }
            if (r3 == 0) goto L_0x007d
            r6 = 4
            goto L_0x0089
        L_0x007d:
            java.lang.String r3 = "V2.1"
            boolean r2 = r2.startsWith(r3)     // Catch:{ Exception -> 0x0087 }
            if (r2 == 0) goto L_0x0087
            r6 = 5
            goto L_0x0089
        L_0x0087:
            a = r6
        L_0x0089:
            r2 = 6
            if (r6 != r2) goto L_0x00bd
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x00a6 }
            r6.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "app_badge_count"
            r6.putInt(r2, r7)     // Catch:{ all -> 0x00a6 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x00a6 }
            java.lang.String r7 = "content://com.android.badge/badge"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "setAppBadgeCount"
            r5.call(r7, r2, r1, r6)     // Catch:{ all -> 0x00a6 }
            goto L_0x00bd
        L_0x00a6:
            b.o.w4.b r5 = new b.o.w4.b
            java.lang.String r6 = "unable to resolve intent: "
            java.lang.StringBuilder r6 = b.e.a.a.a.y(r6)
            java.lang.String r7 = r0.toString()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.shortcutbadger.impl.OPPOHomeBader.b(android.content.Context, android.content.ComponentName, int):void");
    }

    public final boolean c(Object obj) {
        return obj == null || obj.toString().equals("") || obj.toString().trim().equals("null");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3.getSuperclass() != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return d(r3.getSuperclass(), r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        return r3.getMethod(r4, r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method d(java.lang.Class r3, java.lang.String r4, java.lang.Class[] r5) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0028
            boolean r1 = r2.c(r4)
            if (r1 == 0) goto L_0x000a
            goto L_0x0028
        L_0x000a:
            r3.getMethods()     // Catch:{ Exception -> 0x0015 }
            r3.getDeclaredMethods()     // Catch:{ Exception -> 0x0015 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0015 }
            return r3
        L_0x0015:
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ Exception -> 0x001a }
            return r3
        L_0x001a:
            java.lang.Class r1 = r3.getSuperclass()
            if (r1 == 0) goto L_0x0028
            java.lang.Class r3 = r3.getSuperclass()
            java.lang.reflect.Method r0 = r2.d(r3, r4, r5)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.shortcutbadger.impl.OPPOHomeBader.d(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b A[SYNTHETIC, Splitter:B:13:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[SYNTHETIC, Splitter:B:21:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            r2.<init>()     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            r2.append(r5)     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.lang.String r5 = r2.toString()     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.lang.Process r5 = r1.exec(r5)     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            r5 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r5)     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.lang.String r5 = r1.readLine()     // Catch:{ IOException -> 0x0040, all -> 0x0035 }
            r1.close()     // Catch:{ IOException -> 0x0040, all -> 0x0035 }
            r1.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            return r5
        L_0x0035:
            r5 = move-exception
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r5 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            throw r5
        L_0x003f:
            r1 = r0
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.shortcutbadger.impl.OPPOHomeBader.e(java.lang.String):java.lang.String");
    }
}
