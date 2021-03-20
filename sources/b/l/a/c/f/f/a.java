package b.l.a.c.f.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class a extends Handler {
    public a(Looper looper) {
        super(looper);
    }

    public a(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }
}
