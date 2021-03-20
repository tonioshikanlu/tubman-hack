package b.l.d.v;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import b.l.a.c.c.p.g.a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class k0 implements ServiceConnection {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f5325b;
    public final ScheduledExecutorService c;
    public final Queue<g0> d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public i0 f5326e;
    @GuardedBy("this")
    public boolean f = false;

    public k0(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new a("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f5325b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0011:
            java.util.Queue<b.l.d.v.g0> r0 = r6.d     // Catch:{ all -> 0x00a9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0028:
            b.l.d.v.i0 r0 = r6.f5326e     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a9 }
        L_0x0041:
            java.util.Queue<b.l.d.v.g0> r0 = r6.d     // Catch:{ all -> 0x00a9 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00a9 }
            b.l.d.v.g0 r0 = (b.l.d.v.g0) r0     // Catch:{ all -> 0x00a9 }
            b.l.d.v.i0 r2 = r6.f5326e     // Catch:{ all -> 0x00a9 }
            r2.a(r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x0011
        L_0x004f:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "EnhancedIntentService"
            boolean r3 = r6.f     // Catch:{ all -> 0x00a9 }
            if (r3 != 0) goto L_0x0061
            r3 = r2
            goto L_0x0062
        L_0x0061:
            r3 = r1
        L_0x0062:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r5.<init>(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00a9 }
            r5.append(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00a9 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00a9 }
        L_0x0078:
            boolean r0 = r6.f     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a5
            r6.f = r2     // Catch:{ all -> 0x00a9 }
            b.l.a.c.c.o.a r0 = b.l.a.c.c.o.a.b()     // Catch:{ SecurityException -> 0x0098 }
            android.content.Context r2 = r6.a     // Catch:{ SecurityException -> 0x0098 }
            android.content.Intent r3 = r6.f5325b     // Catch:{ SecurityException -> 0x0098 }
            r4 = 65
            boolean r0 = r0.a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x0098 }
            if (r0 == 0) goto L_0x0090
            monitor-exit(r6)
            return
        L_0x0090:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x0098 }
            goto L_0x00a0
        L_0x0098:
            r0 = move-exception
            java.lang.String r2 = "EnhancedIntentService"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a0:
            r6.f = r1     // Catch:{ all -> 0x00a9 }
            r6.b()     // Catch:{ all -> 0x00a9 }
        L_0x00a5:
            monitor-exit(r6)
            return
        L_0x00a7:
            monitor-exit(r6)
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.k0.a():void");
    }

    @GuardedBy("this")
    public final void b() {
        while (!this.d.isEmpty()) {
            this.d.poll().a();
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        this.f = false;
        if (!(iBinder instanceof i0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("EnhancedIntentService", sb2.toString());
            b();
            return;
        }
        this.f5326e = (i0) iBinder;
        a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        a();
    }
}
