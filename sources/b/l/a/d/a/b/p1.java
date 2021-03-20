package b.l.a.d.a.b;

import android.content.Context;
import b.l.a.d.a.e.f;

public final class p1 {
    public static final f c = new f("PackageStateCache");
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public int f4597b = -1;

    public p1(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f4597b     // Catch:{ all -> 0x002a }
            r1 = -1
            if (r0 != r1) goto L_0x0026
            r0 = 0
            android.content.Context r1 = r4.a     // Catch:{ NameNotFoundException -> 0x001c }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.Context r2 = r4.a     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x001c }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x001c }
            r4.f4597b = r1     // Catch:{ NameNotFoundException -> 0x001c }
            goto L_0x0026
        L_0x001c:
            b.l.a.d.a.e.f r1 = c     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x002a }
            r3 = 6
            r1.b(r3, r2, r0)     // Catch:{ all -> 0x002a }
        L_0x0026:
            int r0 = r4.f4597b     // Catch:{ all -> 0x002a }
            monitor-exit(r4)
            return r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.d.a.b.p1.a():int");
    }
}
