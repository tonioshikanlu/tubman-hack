package b.l.a.c.i.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.MainThread;
import b.l.a.c.f.i.h3;
import b.l.a.c.f.i.l2;
import b.l.a.c.f.i.m1;

public final class z3 implements ServiceConnection {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b4 f4387b;

    public z3(b4 b4Var, String str) {
        this.f4387b = b4Var;
        this.a = str;
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                int i2 = l2.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                h3 m1Var = queryLocalInterface instanceof h3 ? (h3) queryLocalInterface : new m1(iBinder);
                if (m1Var == null) {
                    this.f4387b.a.a().f4091i.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f4387b.a.a().f4096n.a("Install Referrer Service connected");
                this.f4387b.a.d().q(new y3(this, m1Var, this));
            } catch (Exception e2) {
                this.f4387b.a.a().f4091i.b("Exception occurred while calling Install Referrer API", e2);
            }
        } else {
            this.f4387b.a.a().f4091i.a("Install Referrer connection returned with null binder");
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4387b.a.a().f4096n.a("Install Referrer Service disconnected");
    }
}
