package b.l.a.c.c.o;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f2820e = new Object();
    public static volatile a f;
    public final List<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f2821b;
    public final List<String> c;
    public final List<String> d;

    public a() {
        List<String> list = Collections.EMPTY_LIST;
        this.a = list;
        this.f2821b = list;
        this.c = list;
        this.d = list;
    }

    public static a b() {
        if (f == null) {
            synchronized (f2820e) {
                if (f == null) {
                    f = new a();
                }
            }
        }
        return f;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        context.getClass().getName();
        return c(context, intent, serviceConnection, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(android.content.Context r4, android.content.Intent r5, android.content.ServiceConnection r6, int r7) {
        /*
            r3 = this;
            android.content.ComponentName r0 = r5.getComponent()
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0028
        L_0x0009:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            r2.equals(r0)
            b.l.a.c.c.q.a r2 = b.l.a.c.c.q.b.a(r4)     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.Context r2 = r2.a     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0007 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x0007 }
            r2 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0007
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x0032
            java.lang.String r4 = "ConnectionTracker"
            java.lang.String r5 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r4, r5)
            return r1
        L_0x0032:
            boolean r4 = r4.bindService(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.c.o.a.c(android.content.Context, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }
}
