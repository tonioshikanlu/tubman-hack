package b.l.a.c.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import b.l.a.c.c.q.b;
import java.util.concurrent.atomic.AtomicBoolean;

public class i {
    public static boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2602b = false;
    public static final AtomicBoolean c = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!f2602b) {
            try {
                PackageInfo packageInfo = b.a(context).a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                j.a(context);
                if (packageInfo == null || j.d(packageInfo, false) || !j.d(packageInfo, true)) {
                    a = false;
                } else {
                    a = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } catch (Throwable th) {
                f2602b = true;
                throw th;
            }
            f2602b = true;
        }
        return a || !"user".equals(Build.TYPE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0101  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x000b }
            r1 = 2131755062(0x7f100036, float:1.9140993E38)
            r0.getString(r1)     // Catch:{ all -> 0x000b }
            goto L_0x0012
        L_0x000b:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0012:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = r9.getPackageName()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0096
            java.util.concurrent.atomic.AtomicBoolean r0 = d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0096
            java.lang.Object r0 = b.l.a.c.c.m.p0.a
            monitor-enter(r0)
            boolean r2 = b.l.a.c.c.m.p0.f2803b     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x002f
            goto L_0x005a
        L_0x002f:
            b.l.a.c.c.m.p0.f2803b = r1     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = r9.getPackageName()     // Catch:{ all -> 0x0093 }
            b.l.a.c.c.q.a r3 = b.l.a.c.c.q.b.a(r9)     // Catch:{ all -> 0x0093 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.a(r2, r4)     // Catch:{ NameNotFoundException -> 0x0052 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0052 }
            if (r2 != 0) goto L_0x0044
            goto L_0x005a
        L_0x0044:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0052 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0052 }
            b.l.a.c.c.m.p0.c = r2     // Catch:{ NameNotFoundException -> 0x0052 }
            goto L_0x005a
        L_0x0052:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0093 }
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            int r0 = b.l.a.c.c.m.p0.c
            if (r0 == 0) goto L_0x008b
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x0065
            goto L_0x0096
        L_0x0065:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r10 = 320(0x140, float:4.48E-43)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            java.lang.String r10 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = " but found "
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r9.<init>(r10)
            throw r9
        L_0x008b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r9.<init>(r10)
            throw r9
        L_0x0093:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0093 }
            throw r9
        L_0x0096:
            boolean r0 = b.l.a.c.b.a.i0(r9)
            r2 = 0
            if (r0 != 0) goto L_0x00cd
            java.lang.Boolean r0 = b.l.a.c.b.a.c
            if (r0 != 0) goto L_0x00c3
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x00bc
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r0 = r2
            goto L_0x00bd
        L_0x00bc:
            r0 = r1
        L_0x00bd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            b.l.a.c.b.a.c = r0
        L_0x00c3:
            java.lang.Boolean r0 = b.l.a.c.b.a.c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00cd
            r0 = r1
            goto L_0x00ce
        L_0x00cd:
            r0 = r2
        L_0x00ce:
            java.lang.String r3 = "com.google.android.gms"
            if (r10 < 0) goto L_0x00d4
            r4 = r1
            goto L_0x00d5
        L_0x00d4:
            r4 = r2
        L_0x00d5:
            b.l.a.c.b.a.j(r4)
            android.content.pm.PackageManager r4 = r9.getPackageManager()
            r5 = 0
            r6 = 9
            java.lang.String r7 = "GooglePlayServicesUtil"
            if (r0 == 0) goto L_0x00ef
            java.lang.String r5 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r5 = r4.getPackageInfo(r5, r8)     // Catch:{ NameNotFoundException -> 0x00ec }
            goto L_0x00ef
        L_0x00ec:
            java.lang.String r9 = "Google Play Store is missing."
            goto L_0x0119
        L_0x00ef:
            r8 = 64
            android.content.pm.PackageInfo r8 = r4.getPackageInfo(r3, r8)     // Catch:{ NameNotFoundException -> 0x0155 }
            b.l.a.c.c.j.a(r9)
            boolean r9 = b.l.a.c.c.j.d(r8, r1)
            if (r9 != 0) goto L_0x0101
            java.lang.String r9 = "Google Play services signature invalid."
            goto L_0x0119
        L_0x0101:
            if (r0 == 0) goto L_0x011e
            boolean r9 = b.l.a.c.c.j.d(r5, r1)
            if (r9 == 0) goto L_0x0117
            android.content.pm.Signature[] r9 = r5.signatures
            r9 = r9[r2]
            android.content.pm.Signature[] r0 = r8.signatures
            r0 = r0[r2]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x011e
        L_0x0117:
            java.lang.String r9 = "Google Play Store signature invalid."
        L_0x0119:
            android.util.Log.w(r7, r9)
            r1 = r6
            goto L_0x015a
        L_0x011e:
            int r9 = r8.versionCode
            r0 = -1
            if (r9 != r0) goto L_0x0125
            r5 = r0
            goto L_0x0127
        L_0x0125:
            int r5 = r9 / 1000
        L_0x0127:
            if (r10 != r0) goto L_0x012a
            goto L_0x012c
        L_0x012a:
            int r0 = r10 / 1000
        L_0x012c:
            if (r5 >= r0) goto L_0x013d
            r0 = 77
            java.lang.String r1 = "Google Play services out of date.  Requires "
            java.lang.String r2 = " but found "
            java.lang.String r9 = b.e.a.a.a.R(r0, r1, r10, r2, r9)
            android.util.Log.w(r7, r9)
            r1 = 2
            goto L_0x015a
        L_0x013d:
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 != 0) goto L_0x014d
            android.content.pm.ApplicationInfo r9 = r4.getApplicationInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x0146 }
            goto L_0x014d
        L_0x0146:
            r9 = move-exception
            java.lang.String r10 = "Google Play services missing when getting application info."
            android.util.Log.wtf(r7, r10, r9)
            goto L_0x015a
        L_0x014d:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x0153
            r1 = 3
            goto L_0x015a
        L_0x0153:
            r1 = r2
            goto L_0x015a
        L_0x0155:
            java.lang.String r9 = "Google Play services is missing."
            android.util.Log.w(r7, r9)
        L_0x015a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.i.b(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean c(Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return d(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0068 }
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch:{ Exception -> 0x0068 }
            java.util.List r2 = r2.getAllSessions()     // Catch:{ Exception -> 0x0068 }
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0017
            return r4
        L_0x002f:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = r2.getApplicationInfo(r6, r3)     // Catch:{  }
            if (r0 == 0) goto L_0x003e
            boolean r5 = r6.enabled     // Catch:{  }
            return r5
        L_0x003e:
            boolean r6 = r6.enabled     // Catch:{  }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "user"
            java.lang.Object r6 = r5.getSystemService(r6)     // Catch:{  }
            android.os.UserManager r6 = (android.os.UserManager) r6     // Catch:{  }
            java.lang.String r5 = r5.getPackageName()     // Catch:{  }
            android.os.Bundle r5 = r6.getApplicationRestrictions(r5)     // Catch:{  }
            if (r5 == 0) goto L_0x0064
            java.lang.String r6 = "restricted_profile"
            java.lang.String r5 = r5.getString(r6)     // Catch:{  }
            java.lang.String r6 = "true"
            boolean r5 = r6.equals(r5)     // Catch:{  }
            if (r5 == 0) goto L_0x0064
            r5 = r4
            goto L_0x0065
        L_0x0064:
            r5 = r1
        L_0x0065:
            if (r5 != 0) goto L_0x0068
            return r4
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.i.d(android.content.Context, java.lang.String):boolean");
    }
}
