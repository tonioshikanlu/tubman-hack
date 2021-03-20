package b.l.d.v;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import b.l.d.d;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.segment.analytics.AnalyticsContext;
import java.io.IOException;

public final class z implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final long f5352h;

    /* renamed from: i  reason: collision with root package name */
    public final PowerManager.WakeLock f5353i;

    /* renamed from: j  reason: collision with root package name */
    public final FirebaseInstanceId f5354j;

    /* renamed from: k  reason: collision with root package name */
    public final b0 f5355k;

    public z(FirebaseInstanceId firebaseInstanceId, b0 b0Var, long j2) {
        this.f5354j = firebaseInstanceId;
        this.f5355k = b0Var;
        this.f5352h = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f5353i = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final Context a() {
        d dVar = this.f5354j.f7353b;
        dVar.a();
        return dVar.a;
    }

    public final boolean b() {
        a0 m2 = this.f5354j.m();
        if (!this.f5354j.d.c() && !this.f5354j.h(m2)) {
            return true;
        }
        try {
            FirebaseInstanceId firebaseInstanceId = this.f5354j;
            String b2 = firebaseInstanceId.b(q.a(firebaseInstanceId.f7353b), "*");
            if (b2 == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (m2 == null || !b2.equals(m2.a)) {
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(AnalyticsContext.Device.DEVICE_TOKEN_KEY, b2);
                Context a = a();
                Intent intent2 = new Intent(a, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException | SecurityException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
            return false;
        }
    }

    public final boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        boolean b2;
        try {
            if (y.a().b(a())) {
                this.f5353i.acquire();
            }
            boolean z = true;
            this.f5354j.g(true);
            if (!this.f5354j.d.e()) {
                this.f5354j.g(false);
                if (!b2) {
                    return;
                }
                return;
            }
            y a = y.a();
            Context a2 = a();
            if (a.c == null) {
                if (a2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    z = false;
                }
                a.c = Boolean.valueOf(z);
            }
            if (!a.f5351b.booleanValue()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                }
            }
            if (!a.c.booleanValue() || c()) {
                if (!b() || !this.f5355k.b(this.f5354j)) {
                    this.f5354j.e(this.f5352h);
                } else {
                    this.f5354j.g(false);
                }
                if (y.a().b(a())) {
                    this.f5353i.release();
                    return;
                }
                return;
            }
            d0 d0Var = new d0(this);
            if (FirebaseInstanceId.n()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            d0Var.a.a().registerReceiver(d0Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (y.a().b(a())) {
                this.f5353i.release();
            }
        } finally {
            if (y.a().b(a())) {
                this.f5353i.release();
            }
        }
    }
}
