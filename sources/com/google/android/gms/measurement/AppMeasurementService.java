package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.RecentlyNonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import b.l.a.c.f.i.zb;
import b.l.a.c.i.b.d8;
import b.l.a.c.i.b.d9;
import b.l.a.c.i.b.e5;
import b.l.a.c.i.b.f8;
import b.l.a.c.i.b.g8;
import b.l.a.c.i.b.h8;
import b.l.a.c.i.b.k3;
import b.l.a.c.i.b.l4;
import java.util.Objects;

public final class AppMeasurementService extends Service implements g8 {

    /* renamed from: h  reason: collision with root package name */
    public h8<AppMeasurementService> f7320h;

    public final boolean a(int i2) {
        return stopSelfResult(i2);
    }

    public final void b(@RecentlyNonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    public final void c(@RecentlyNonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final h8<AppMeasurementService> d() {
        if (this.f7320h == null) {
            this.f7320h = new h8<>(this);
        }
        return this.f7320h;
    }

    @RecentlyNonNull
    @MainThread
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        h8<AppMeasurementService> d = d();
        Objects.requireNonNull(d);
        if (intent == null) {
            d.c().f.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new e5(d9.v(d.a));
        }
        d.c().f4091i.b("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public void onCreate() {
        super.onCreate();
        l4.h(d().a, (zb) null, (Long) null).a().f4096n.a("Local AppMeasurementService is starting up");
    }

    @MainThread
    public void onDestroy() {
        l4.h(d().a, (zb) null, (Long) null).a().f4096n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @MainThread
    public void onRebind(@RecentlyNonNull Intent intent) {
        d().b(intent);
    }

    @MainThread
    public int onStartCommand(@RecentlyNonNull Intent intent, int i2, int i3) {
        h8<AppMeasurementService> d = d();
        k3 a = l4.h(d.a, (zb) null, (Long) null).a();
        if (intent == null) {
            a.f4091i.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.f4096n.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        d8 d8Var = new d8(d, i3, a, intent);
        d9 v = d9.v(d.a);
        v.d().q(new f8(v, d8Var));
        return 2;
    }

    @MainThread
    public boolean onUnbind(@RecentlyNonNull Intent intent) {
        d().a(intent);
        return true;
    }
}
