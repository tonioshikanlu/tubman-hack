package b.l.a.c.c.m;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b.l.a.c.f.c.c;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class j implements Handler.Callback {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<GoogleApiClient.b> f2793b = new ArrayList<>();
    public final ArrayList<GoogleApiClient.b> c = new ArrayList<>();
    public final ArrayList<GoogleApiClient.c> d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f2794e = false;
    public final AtomicInteger f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    public boolean f2795g = false;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f2796h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f2797i = new Object();

    public interface a {
        boolean a();

        Bundle u();
    }

    public j(Looper looper, a aVar) {
        this.a = aVar;
        this.f2796h = new c(looper, this);
    }

    public final void a() {
        this.f2794e = false;
        this.f.incrementAndGet();
    }

    public final void b(GoogleApiClient.c cVar) {
        Objects.requireNonNull(cVar, "null reference");
        synchronized (this.f2797i) {
            if (this.d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.d.add(cVar);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            GoogleApiClient.b bVar = (GoogleApiClient.b) message.obj;
            synchronized (this.f2797i) {
                if (this.f2794e && this.a.a() && this.f2793b.contains(bVar)) {
                    bVar.k(this.a.u());
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", b.e.a.a.a.Q(45, "Don't know how to handle message: ", i2), new Exception());
        return false;
    }
}
