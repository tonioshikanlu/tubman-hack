package b.l.a.c.i.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import b.l.a.c.b.a;
import b.l.a.c.c.m.b;
import java.util.Objects;

public final class a8 implements ServiceConnection, b.a, b.C0060b {
    public volatile boolean a;

    /* renamed from: b  reason: collision with root package name */
    public volatile g3 f3907b;
    public final /* synthetic */ b8 c;

    public a8(b8 b8Var) {
        this.c = b8Var;
    }

    @MainThread
    public final void g(int i2) {
        a.v("MeasurementServiceConnection.onConnectionSuspended");
        this.c.a.a().f4095m.a("Service connection suspended");
        this.c.a.d().q(new x7(this));
    }

    @MainThread
    public final void k(Bundle bundle) {
        a.v("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Objects.requireNonNull(this.f3907b, "null reference");
                this.c.a.d().q(new w7(this, (a3) this.f3907b.B()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f3907b = null;
                this.a = false;
            }
        }
    }

    @MainThread
    public final void n(@NonNull b.l.a.c.c.b bVar) {
        a.v("MeasurementServiceConnection.onConnectionFailed");
        l4 l4Var = this.c.a;
        k3 k3Var = l4Var.f4116i;
        k3 k3Var2 = (k3Var == null || !k3Var.k()) ? null : l4Var.f4116i;
        if (k3Var2 != null) {
            k3Var2.f4091i.b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.a = false;
            this.f3907b = null;
        }
        this.c.a.d().q(new y7(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.c.a.a().f.a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    @androidx.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            b.l.a.c.b.a.v(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.a = r4     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.b8 r4 = r3.c     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.l4 r4 = r4.a     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.k3 r4 = r4.a()     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.i3 r4 = r4.f     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0098
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0060 }
            boolean r2 = r1 instanceof b.l.a.c.i.b.a3     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x003a
            b.l.a.c.i.b.a3 r1 = (b.l.a.c.i.b.a3) r1     // Catch:{ RemoteException -> 0x0060 }
        L_0x0038:
            r0 = r1
            goto L_0x0040
        L_0x003a:
            b.l.a.c.i.b.y2 r1 = new b.l.a.c.i.b.y2     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0038
        L_0x0040:
            b.l.a.c.i.b.b8 r5 = r3.c     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.i.b.l4 r5 = r5.a     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.i.b.i3 r5 = r5.f4096n     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0050:
            b.l.a.c.i.b.b8 r5 = r3.c     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.i.b.l4 r5 = r5.a     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ RemoteException -> 0x0060 }
            b.l.a.c.i.b.i3 r5 = r5.f     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0060:
            b.l.a.c.i.b.b8 r5 = r3.c     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.l4 r5 = r5.a     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.i3 r5 = r5.f     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006f:
            if (r0 != 0) goto L_0x0086
            r3.a = r4     // Catch:{ all -> 0x001c }
            b.l.a.c.c.o.a r4 = b.l.a.c.c.o.a.b()     // Catch:{ IllegalArgumentException -> 0x0096 }
            b.l.a.c.i.b.b8 r5 = r3.c     // Catch:{ IllegalArgumentException -> 0x0096 }
            b.l.a.c.i.b.l4 r0 = r5.a     // Catch:{ IllegalArgumentException -> 0x0096 }
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x0096 }
            b.l.a.c.i.b.a8 r5 = r5.c     // Catch:{ IllegalArgumentException -> 0x0096 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ IllegalArgumentException -> 0x0096 }
            r0.unbindService(r5)     // Catch:{ IllegalArgumentException -> 0x0096 }
            goto L_0x0096
        L_0x0086:
            b.l.a.c.i.b.b8 r4 = r3.c     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.l4 r4 = r4.a     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.i4 r4 = r4.d()     // Catch:{ all -> 0x001c }
            b.l.a.c.i.b.u7 r5 = new b.l.a.c.i.b.u7     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.q(r5)     // Catch:{ all -> 0x001c }
        L_0x0096:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0098:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.a8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        a.v("MeasurementServiceConnection.onServiceDisconnected");
        this.c.a.a().f4095m.a("Service disconnected");
        this.c.a.d().q(new v7(this, componentName));
    }
}
