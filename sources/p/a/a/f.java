package p.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

public class f extends Handler implements l {

    /* renamed from: h  reason: collision with root package name */
    public final k f10520h = new k();

    /* renamed from: i  reason: collision with root package name */
    public final int f10521i;

    /* renamed from: j  reason: collision with root package name */
    public final c f10522j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10523k;

    public f(c cVar, Looper looper, int i2) {
        super(looper);
        this.f10522j = cVar;
        this.f10521i = i2;
    }

    public void a(q qVar, Object obj) {
        j a = j.a(qVar, obj);
        synchronized (this) {
            this.f10520h.a(a);
            if (!this.f10523k) {
                this.f10523k = true;
                if (!sendMessage(obtainMessage())) {
                    throw new e("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                j b2 = this.f10520h.b();
                if (b2 == null) {
                    synchronized (this) {
                        b2 = this.f10520h.b();
                        if (b2 == null) {
                            this.f10523k = false;
                            this.f10523k = false;
                            return;
                        }
                    }
                }
                this.f10522j.c(b2);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f10521i));
            if (sendMessage(obtainMessage())) {
                this.f10523k = true;
                return;
            }
            throw new e("Could not send handler message");
        } catch (Throwable th) {
            this.f10523k = false;
            throw th;
        }
    }
}
