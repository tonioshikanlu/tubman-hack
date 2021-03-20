package b.l.d.q.f.g;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import b.l.a.c.k.i;
import b.l.d.d;
import b.l.d.q.f.b;

public class b0 {
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final d f5061b;
    public final Object c = new Object();
    public i<Void> d = new i<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f5062e = false;
    @Nullable
    public Boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final i<Void> f5063g = new i<>();

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b0(b.l.d.d r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.c = r0
            b.l.a.c.k.i r0 = new b.l.a.c.k.i
            r0.<init>()
            r6.d = r0
            r0 = 0
            r6.f5062e = r0
            b.l.a.c.k.i r1 = new b.l.a.c.k.i
            r1.<init>()
            r6.f5063g = r1
            r7.a()
            android.content.Context r1 = r7.a
            r6.f5061b = r7
            android.content.SharedPreferences r7 = b.l.d.q.f.g.e.h(r1)
            r6.a = r7
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003d
            r6.f5062e = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x003e
        L_0x003d:
            r7 = r5
        L_0x003e:
            if (r7 != 0) goto L_0x008d
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0069 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r1 == 0) goto L_0x007a
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            boolean r2 = r2.containsKey(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            if (r2 == 0) goto L_0x007a
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0069 }
            boolean r7 = r1.getBoolean(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ NameNotFoundException -> 0x0069 }
            goto L_0x007b
        L_0x0069:
            r7 = move-exception
            b.l.d.q.f.b r1 = b.l.d.q.f.b.a
            r2 = 3
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Unable to get PackageManager. Falling through"
            android.util.Log.d(r1, r2, r7)
        L_0x007a:
            r7 = r5
        L_0x007b:
            if (r7 != 0) goto L_0x0081
            r6.f5062e = r0
            r7 = r5
            goto L_0x008d
        L_0x0081:
            r6.f5062e = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x008d:
            r6.f = r7
            java.lang.Object r7 = r6.c
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x009d
            b.l.a.c.k.i<java.lang.Void> r0 = r6.d     // Catch:{ all -> 0x009f }
            r0.b(r5)     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r7)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x009f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.q.f.g.b0.<init>(b.l.d.d):void");
    }

    public synchronized boolean a() {
        boolean booleanValue;
        Boolean bool = this.f;
        booleanValue = bool != null ? bool.booleanValue() : this.f5061b.h();
        b.a.b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{booleanValue ? "ENABLED" : "DISABLED", this.f == null ? "global Firebase setting" : this.f5062e ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
        return booleanValue;
    }
}
