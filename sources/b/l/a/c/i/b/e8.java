package b.l.a.c.i.b;

import android.app.job.JobParameters;
import java.util.Objects;

public final /* synthetic */ class e8 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final h8 f3996h;

    /* renamed from: i  reason: collision with root package name */
    public final k3 f3997i;

    /* renamed from: j  reason: collision with root package name */
    public final JobParameters f3998j;

    public e8(h8 h8Var, k3 k3Var, JobParameters jobParameters) {
        this.f3996h = h8Var;
        this.f3997i = k3Var;
        this.f3998j = jobParameters;
    }

    public final void run() {
        h8 h8Var = this.f3996h;
        k3 k3Var = this.f3997i;
        JobParameters jobParameters = this.f3998j;
        Objects.requireNonNull(h8Var);
        k3Var.f4096n.a("AppMeasurementJobService processed last upload request.");
        ((g8) h8Var.a).c(jobParameters, false);
    }
}
