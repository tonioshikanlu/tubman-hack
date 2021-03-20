package b.l.a.c.i.b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;

public final class t8 extends u8 {
    public final AlarmManager d = ((AlarmManager) this.a.a.getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: e  reason: collision with root package name */
    public l f4290e;
    public Integer f;

    public t8(d9 d9Var) {
        super(d9Var);
    }

    public final boolean k() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        n();
        return false;
    }

    public final void l() {
        i();
        this.a.a().f4096n.a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        m().c();
        n();
    }

    public final l m() {
        if (this.f4290e == null) {
            this.f4290e = new s8(this, this.f4305b.f3979j);
        }
        return this.f4290e;
    }

    @TargetApi(24)
    public final void n() {
        JobScheduler jobScheduler = (JobScheduler) this.a.a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    public final int o() {
        if (this.f == null) {
            String valueOf = String.valueOf(this.a.a.getPackageName());
            this.f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f.intValue();
    }

    public final PendingIntent p() {
        Context context = this.a.a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }
}
