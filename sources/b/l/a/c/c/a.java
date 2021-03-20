package b.l.a.c.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a implements ServiceConnection {
    public boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<IBinder> f2581b = new LinkedBlockingQueue();

    public IBinder a(long j2, TimeUnit timeUnit) {
        b.l.a.c.b.a.z("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.a) {
            this.a = true;
            IBinder poll = this.f2581b.poll(j2, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2581b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
