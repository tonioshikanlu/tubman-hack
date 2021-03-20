package b.l.a.c.c.l.k;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b.l.a.c.f.c.c;

public final class k0 extends c {
    public final /* synthetic */ j0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, Looper looper) {
        super(looper);
        this.a = j0Var;
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            j0 j0Var = this.a;
            j0Var.f2674b.lock();
            try {
                if (j0Var.m()) {
                    j0Var.l();
                }
            } finally {
                j0Var.f2674b.unlock();
            }
        } else if (i2 != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            j0.k(this.a);
        }
    }
}
