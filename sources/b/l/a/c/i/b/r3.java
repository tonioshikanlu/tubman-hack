package b.l.a.c.i.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;

public final class r3 extends BroadcastReceiver {
    public final d9 a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4238b;
    public boolean c;

    static {
        Class<r3> cls = r3.class;
    }

    public r3(d9 d9Var) {
        this.a = d9Var;
    }

    @WorkerThread
    public final void a() {
        this.a.R();
        this.a.d().h();
        this.a.d().h();
        if (this.f4238b) {
            this.a.a().f4096n.a("Unregistering connectivity change receiver");
            this.f4238b = false;
            this.c = false;
            try {
                this.a.f3979j.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.a.a().f.b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    @MainThread
    public final void onReceive(Context context, Intent intent) {
        this.a.R();
        String action = intent.getAction();
        this.a.a().f4096n.b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean l2 = this.a.K().l();
            if (this.c != l2) {
                this.c = l2;
                this.a.d().q(new q3(this, l2));
                return;
            }
            return;
        }
        this.a.a().f4091i.b("NetworkBroadcastReceiver received unknown action", action);
    }
}
