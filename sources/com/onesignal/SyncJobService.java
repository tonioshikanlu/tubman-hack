package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;
import b.o.i2;
import b.o.p3;

@RequiresApi(api = 21)
public class SyncJobService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        p3.b bVar = new p3.b(this, jobParameters);
        Long l2 = p3.a;
        i2.E(this);
        Thread thread = new Thread(bVar, "OS_SYNCSRV_BG_SYNC");
        p3.c = thread;
        thread.start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        Thread thread = p3.c;
        boolean z = false;
        if (thread != null && thread.isAlive()) {
            p3.c.interrupt();
            z = true;
        }
        i2.k kVar = i2.k.DEBUG;
        i2.a(kVar, "SyncJobService onStopJob called, system conditions not available reschedule: " + z, (Throwable) null);
        return z;
    }
}
