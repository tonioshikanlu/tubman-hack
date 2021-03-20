package b.l.a.d.a.e;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class o implements ServiceConnection {
    public final /* synthetic */ p a;

    public /* synthetic */ o(p pVar) {
        this.a = pVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.f4669b.b(4, "ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
        this.a.c(new m(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.f4669b.b(4, "ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
        this.a.c(new n(this));
    }
}
