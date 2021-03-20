package b.l.d.v;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

public final class d0 extends BroadcastReceiver {
    public z a;

    public d0(z zVar) {
        this.a = zVar;
    }

    public final void onReceive(Context context, Intent intent) {
        z zVar = this.a;
        if (zVar != null && zVar.c()) {
            if (FirebaseInstanceId.n()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.f(this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
