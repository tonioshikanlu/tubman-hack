package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RecentlyNonNull;
import b.l.a.c.f.i.zb;
import b.l.a.c.i.b.d9;
import b.l.a.c.i.b.e8;
import b.l.a.c.i.b.f8;
import b.l.a.c.i.b.g8;
import b.l.a.c.i.b.h8;
import b.l.a.c.i.b.k3;
import b.l.a.c.i.b.l4;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements g8 {

    /* renamed from: h  reason: collision with root package name */
    public h8<AppMeasurementJobService> f7319h;

    public final boolean a(int i2) {
        throw new UnsupportedOperationException();
    }

    public final void b(@RecentlyNonNull Intent intent) {
    }

    @TargetApi(24)
    public final void c(@RecentlyNonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final h8<AppMeasurementJobService> d() {
        if (this.f7319h == null) {
            this.f7319h = new h8<>(this);
        }
        return this.f7319h;
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

    public boolean onStartJob(@RecentlyNonNull JobParameters jobParameters) {
        h8<AppMeasurementJobService> d = d();
        k3 a = l4.h(d.a, (zb) null, (Long) null).a();
        String string = jobParameters.getExtras().getString("action");
        a.f4096n.b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        e8 e8Var = new e8(d, a, jobParameters);
        d9 v = d9.v(d.a);
        v.d().q(new f8(v, e8Var));
        return true;
    }

    public boolean onStopJob(@RecentlyNonNull JobParameters jobParameters) {
        return false;
    }

    @MainThread
    public boolean onUnbind(@RecentlyNonNull Intent intent) {
        d().a(intent);
        return true;
    }
}
