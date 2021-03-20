package b.l.a.c.c.m;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import b.l.a.c.c.m.k;
import b.l.a.c.c.o.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class h0 implements ServiceConnection {
    public final Map<ServiceConnection, ServiceConnection> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f2789b = 2;
    public boolean c;
    public IBinder d;

    /* renamed from: e  reason: collision with root package name */
    public final k.a f2790e;
    public ComponentName f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f0 f2791g;

    public h0(f0 f0Var, k.a aVar) {
        this.f2791g = f0Var;
        this.f2790e = aVar;
    }

    public final void a(String str) {
        this.f2789b = 3;
        f0 f0Var = this.f2791g;
        a aVar = f0Var.f;
        Context context = f0Var.d;
        boolean c2 = aVar.c(context, this.f2790e.a(context), this, this.f2790e.c);
        this.c = c2;
        if (c2) {
            Message obtainMessage = this.f2791g.f2776e.obtainMessage(1, this.f2790e);
            f0 f0Var2 = this.f2791g;
            f0Var2.f2776e.sendMessageDelayed(obtainMessage, f0Var2.f2778h);
            return;
        }
        this.f2789b = 2;
        try {
            f0 f0Var3 = this.f2791g;
            a aVar2 = f0Var3.f;
            Context context2 = f0Var3.d;
            Objects.requireNonNull(aVar2);
            context2.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2791g.c) {
            this.f2791g.f2776e.removeMessages(1, this.f2790e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection onServiceConnected : this.a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f2789b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2791g.c) {
            this.f2791g.f2776e.removeMessages(1, this.f2790e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f2789b = 2;
        }
    }
}
