package b.l.a.c.c.l.k;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b.l.a.c.f.c.c;
import java.util.Objects;

public final class r0 extends c {
    public final /* synthetic */ p0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(p0 p0Var, Looper looper) {
        super(looper);
        this.a = p0Var;
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            o0 o0Var = (o0) message.obj;
            p0 p0Var = this.a;
            Objects.requireNonNull(o0Var);
            p0Var.a.lock();
            try {
                if (p0Var.f2699k == o0Var.a) {
                    o0Var.a();
                }
            } finally {
                p0Var.a.unlock();
            }
        } else if (i2 != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
