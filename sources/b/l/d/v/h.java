package b.l.d.v;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import b.l.a.c.f.f.a;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public final class h implements ServiceConnection {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f5318b = new Messenger(new a(Looper.getMainLooper(), new g(this)));
    public k c;
    public final Queue<m<?>> d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<m<?>> f5319e = new SparseArray<>();
    public final /* synthetic */ f f;

    public h(f fVar, e eVar) {
        this.f = fVar;
    }

    public final synchronized void a(int i2, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i3 = this.a;
        if (i3 == 0) {
            throw new IllegalStateException();
        } else if (i3 == 1 || i3 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            b.l.a.c.c.o.a b2 = b.l.a.c.c.o.a.b();
            Context context = this.f.a;
            Objects.requireNonNull(b2);
            context.unbindService(this);
            p pVar = new p(i2, str);
            for (m b3 : this.d) {
                b3.b(pVar);
            }
            this.d.clear();
            for (int i4 = 0; i4 < this.f5319e.size(); i4++) {
                this.f5319e.valueAt(i4).b(pVar);
            }
            this.f5319e.clear();
        } else if (i3 == 3) {
            this.a = 4;
        } else if (i3 != 4) {
            int i5 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i5);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(b.l.d.v.m r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.a     // Catch:{ all -> 0x00a6 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x0043
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a6 }
            int r0 = r5.a     // Catch:{ all -> 0x00a6 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x00a6 }
            r2.append(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00a6 }
            r6.<init>(r0)     // Catch:{ all -> 0x00a6 }
            throw r6     // Catch:{ all -> 0x00a6 }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<b.l.d.v.m<?>> r0 = r5.d     // Catch:{ all -> 0x00a6 }
            r0.add(r6)     // Catch:{ all -> 0x00a6 }
            b.l.d.v.f r6 = r5.f     // Catch:{ all -> 0x00a6 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f5314b     // Catch:{ all -> 0x00a6 }
            b.l.d.v.i r0 = new b.l.d.v.i     // Catch:{ all -> 0x00a6 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a6 }
            r6.execute(r0)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r5)
            return r3
        L_0x0043:
            java.util.Queue<b.l.d.v.m<?>> r0 = r5.d     // Catch:{ all -> 0x00a6 }
            r0.add(r6)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r5)
            return r3
        L_0x004a:
            java.util.Queue<b.l.d.v.m<?>> r0 = r5.d     // Catch:{ all -> 0x00a6 }
            r0.add(r6)     // Catch:{ all -> 0x00a6 }
            int r6 = r5.a     // Catch:{ all -> 0x00a6 }
            if (r6 != 0) goto L_0x0055
            r6 = r3
            goto L_0x0056
        L_0x0055:
            r6 = r2
        L_0x0056:
            b.l.a.c.b.a.F(r6)     // Catch:{ all -> 0x00a6 }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x00a6 }
        L_0x0068:
            r5.a = r3     // Catch:{ all -> 0x00a6 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x00a6 }
            b.l.a.c.c.o.a r0 = b.l.a.c.c.o.a.b()     // Catch:{ all -> 0x00a6 }
            b.l.d.v.f r1 = r5.f     // Catch:{ all -> 0x00a6 }
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x00a6 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x00a6 }
            r4.getName()     // Catch:{ all -> 0x00a6 }
            boolean r6 = r0.c(r1, r6, r5, r3)     // Catch:{ all -> 0x00a6 }
            if (r6 != 0) goto L_0x0094
            java.lang.String r6 = "Unable to bind to service"
            r5.a(r2, r6)     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x0094:
            b.l.d.v.f r6 = r5.f     // Catch:{ all -> 0x00a6 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f5314b     // Catch:{ all -> 0x00a6 }
            b.l.d.v.j r0 = new b.l.d.v.j     // Catch:{ all -> 0x00a6 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a6 }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a6 }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r5)
            return r3
        L_0x00a6:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.d.v.h.b(b.l.d.v.m):boolean");
    }

    public final synchronized void c() {
        if (this.a == 2 && this.d.isEmpty() && this.f5319e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            b.l.a.c.c.o.a b2 = b.l.a.c.c.o.a.b();
            Context context = this.f.a;
            Objects.requireNonNull(b2);
            context.unbindService(this);
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.c = new k(iBinder);
            this.a = 2;
            this.f.f5314b.execute(new i(this));
        } catch (RemoteException e2) {
            a(0, e2.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        a(2, "Service disconnected");
    }
}
