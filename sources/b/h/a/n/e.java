package b.h.a.n;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import b.h.a.i;
import b.h.a.n.c;
import b.h.a.q.b;
import b.h.a.s.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class e implements c {

    /* renamed from: h  reason: collision with root package name */
    public final Context f933h;

    /* renamed from: i  reason: collision with root package name */
    public final c.a f934i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f935j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f936k;

    /* renamed from: l  reason: collision with root package name */
    public final BroadcastReceiver f937l = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(@NonNull Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.f935j;
            eVar.f935j = eVar.k(context);
            if (z != e.this.f935j) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder y = b.e.a.a.a.y("connectivity changed, isConnected: ");
                    y.append(e.this.f935j);
                    Log.d("ConnectivityMonitor", y.toString());
                }
                e eVar2 = e.this;
                c.a aVar = eVar2.f934i;
                boolean z2 = eVar2.f935j;
                i.b bVar = (i.b) aVar;
                Objects.requireNonNull(bVar);
                if (z2) {
                    synchronized (i.this) {
                        n nVar = bVar.a;
                        Iterator it = ((ArrayList) j.e(nVar.a)).iterator();
                        while (it.hasNext()) {
                            b bVar2 = (b) it.next();
                            if (!bVar2.c() && !bVar2.b()) {
                                bVar2.clear();
                                if (!nVar.c) {
                                    bVar2.a();
                                } else {
                                    nVar.f946b.add(bVar2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public e(@NonNull Context context, @NonNull c.a aVar) {
        this.f933h = context.getApplicationContext();
        this.f934i = aVar;
    }

    public void d() {
        if (this.f936k) {
            this.f933h.unregisterReceiver(this.f937l);
            this.f936k = false;
        }
    }

    public void j() {
    }

    @SuppressLint({"MissingPermission"})
    public boolean k(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        Objects.requireNonNull(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }

    public void onStart() {
        if (!this.f936k) {
            this.f935j = k(this.f933h);
            try {
                this.f933h.registerReceiver(this.f937l, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f936k = true;
            } catch (SecurityException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e2);
                }
            }
        }
    }
}
