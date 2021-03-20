package b.l.a.a.f.q.h;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final JobInfoSchedulerService f2519h;

    /* renamed from: i  reason: collision with root package name */
    public final JobParameters f2520i;

    public e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f2519h = jobInfoSchedulerService;
        this.f2520i = jobParameters;
    }

    public void run() {
        JobInfoSchedulerService jobInfoSchedulerService = this.f2519h;
        JobParameters jobParameters = this.f2520i;
        int i2 = JobInfoSchedulerService.f7200h;
        jobInfoSchedulerService.jobFinished(jobParameters, false);
    }
}
