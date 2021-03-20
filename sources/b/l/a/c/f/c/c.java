package b.l.a.c.f.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class c extends Handler {
    public c(Looper looper) {
        super(looper);
    }

    public c(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
