package b.m.a.t;

import android.os.Handler;
import android.os.HandlerThread;

public class h {

    /* renamed from: e  reason: collision with root package name */
    public static h f5971e;
    public Handler a;

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f5972b;
    public int c = 0;
    public final Object d = new Object();

    public final void a() {
        synchronized (this.d) {
            if (this.a == null) {
                if (this.c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f5972b = handlerThread;
                    handlerThread.start();
                    this.a = new Handler(this.f5972b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    public void b(Runnable runnable) {
        synchronized (this.d) {
            a();
            this.a.post(runnable);
        }
    }
}
