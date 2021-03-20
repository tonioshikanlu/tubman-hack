package b.h.a.m.v;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class z {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f789b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).recycle();
            return true;
        }
    }

    public synchronized void a(w<?> wVar, boolean z) {
        if (!this.a) {
            if (!z) {
                this.a = true;
                wVar.recycle();
                this.a = false;
            }
        }
        this.f789b.obtainMessage(1, wVar).sendToTarget();
    }
}
