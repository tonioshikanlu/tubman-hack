package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import b.l.a.a.f.b;
import b.l.a.a.f.h;
import b.l.a.a.f.k;
import b.l.a.a.f.q.h.e;
import b.l.a.a.f.q.h.g;
import b.l.a.a.f.q.h.l;
import b.l.a.a.f.t.a;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f7200h = 0;

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        k.b(getApplicationContext());
        h.a a = h.a();
        a.b(string);
        a.c(a.b(i2));
        if (string2 != null) {
            ((b.C0054b) a).f2471b = Base64.decode(string2, 0);
        }
        l lVar = k.a().d;
        lVar.f2534e.execute(new g(lVar, a.a(), i3, new e(this, jobParameters)));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
