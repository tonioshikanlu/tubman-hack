package b.l.a.c.c.l.k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class b1 extends BroadcastReceiver {
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a1 f2617b;

    public b1(a1 a1Var) {
        this.f2617b = a1Var;
    }

    public final synchronized void a() {
        Context context = this.a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2617b.a();
            a();
        }
    }
}
