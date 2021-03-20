package b.o;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.RequiresApi;
import com.onesignal.RestoreKickoffJobService;
import java.util.Objects;

@RequiresApi(api = 21)
public abstract class a3 extends JobService {

    public class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ JobService f6012h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ JobParameters f6013i;

        public a(JobService jobService, JobParameters jobParameters) {
            this.f6012h = jobService;
            this.f6013i = jobParameters;
        }

        public void run() {
            RestoreKickoffJobService restoreKickoffJobService = (RestoreKickoffJobService) a3.this;
            Objects.requireNonNull(restoreKickoffJobService);
            Thread.currentThread().setPriority(10);
            i2.E(restoreKickoffJobService);
            n0.b(restoreKickoffJobService.getApplicationContext());
            a3.this.jobFinished(this.f6013i, false);
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getExtras() == null) {
            return false;
        }
        new Thread(new a(this, jobParameters), "OS_JOBSERVICE_BASE").start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
