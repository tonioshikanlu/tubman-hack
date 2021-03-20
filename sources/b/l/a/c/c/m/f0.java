package b.l.a.c.c.m;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import b.l.a.c.c.m.b;
import b.l.a.c.c.m.k;
import b.l.a.c.c.o.a;
import b.l.a.c.f.d.d;
import com.amplitude.api.Constants;
import java.util.HashMap;
import java.util.Objects;

public final class f0 extends k implements Handler.Callback {
    public final HashMap<k.a, h0> c = new HashMap<>();
    public final Context d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f2776e;
    public final a f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2777g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2778h;

    public f0(Context context) {
        this.d = context.getApplicationContext();
        this.f2776e = new d(context.getMainLooper(), this);
        this.f = a.b();
        this.f2777g = 5000;
        this.f2778h = Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
    }

    public final boolean b(k.a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        b.l.a.c.b.a.B(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            h0 h0Var = this.c.get(aVar);
            if (h0Var == null) {
                h0Var = new h0(this, aVar);
                aVar.a(this.d);
                h0Var.a.put(serviceConnection, serviceConnection);
                h0Var.a(str);
                this.c.put(aVar, h0Var);
            } else {
                this.f2776e.removeMessages(0, aVar);
                if (!h0Var.a.containsKey(serviceConnection)) {
                    f0 f0Var = h0Var.f2791g;
                    a aVar2 = f0Var.f;
                    h0Var.f2790e.a(f0Var.d);
                    h0Var.a.put(serviceConnection, serviceConnection);
                    int i2 = h0Var.f2789b;
                    if (i2 == 1) {
                        ((b.j) serviceConnection).onServiceConnected(h0Var.f, h0Var.d);
                    } else if (i2 == 2) {
                        h0Var.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = h0Var.c;
        }
        return z;
    }

    public final void c(k.a aVar, ServiceConnection serviceConnection, String str) {
        b.l.a.c.b.a.B(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            h0 h0Var = this.c.get(aVar);
            if (h0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (h0Var.a.containsKey(serviceConnection)) {
                a aVar2 = h0Var.f2791g.f;
                h0Var.a.remove(serviceConnection);
                if (h0Var.a.isEmpty()) {
                    this.f2776e.sendMessageDelayed(this.f2776e.obtainMessage(0, aVar), this.f2777g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.c) {
                k.a aVar = (k.a) message.obj;
                h0 h0Var = this.c.get(aVar);
                if (h0Var != null && h0Var.a.isEmpty()) {
                    if (h0Var.c) {
                        h0Var.f2791g.f2776e.removeMessages(1, h0Var.f2790e);
                        f0 f0Var = h0Var.f2791g;
                        a aVar2 = f0Var.f;
                        Context context = f0Var.d;
                        Objects.requireNonNull(aVar2);
                        context.unbindService(h0Var);
                        h0Var.c = false;
                        h0Var.f2789b = 2;
                    }
                    this.c.remove(aVar);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.c) {
                k.a aVar3 = (k.a) message.obj;
                h0 h0Var2 = this.c.get(aVar3);
                if (h0Var2 != null && h0Var2.f2789b == 3) {
                    String valueOf = String.valueOf(aVar3);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = h0Var2.f;
                    if (componentName == null) {
                        Objects.requireNonNull(aVar3);
                        componentName = null;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(aVar3.f2800b, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    h0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
