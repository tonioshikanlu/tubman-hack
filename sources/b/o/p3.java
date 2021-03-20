package b.o;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.RequiresApi;
import b.l.f.x.a.g;
import b.o.c0;
import b.o.i2;
import b.o.n;
import com.amplitude.api.Constants;
import com.onesignal.SyncJobService;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class p3 {
    public static Long a = 0L;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6227b = false;
    public static Thread c;

    public static class a extends c {

        /* renamed from: h  reason: collision with root package name */
        public Service f6228h;

        public a(Service service) {
            this.f6228h = service;
        }

        public void a() {
            i2.a(i2.k.DEBUG, "LegacySyncRunnable:Stopped", (Throwable) null);
            this.f6228h.stopSelf();
        }
    }

    @RequiresApi(api = 21)
    public static class b extends c {

        /* renamed from: h  reason: collision with root package name */
        public JobService f6229h;

        /* renamed from: i  reason: collision with root package name */
        public JobParameters f6230i;

        public b(JobService jobService, JobParameters jobParameters) {
            this.f6229h = jobService;
            this.f6230i = jobParameters;
        }

        public void a() {
            i2.k kVar = i2.k.DEBUG;
            StringBuilder y = b.e.a.a.a.y("LollipopSyncRunnable:JobFinished needsJobReschedule: ");
            y.append(p3.f6227b);
            i2.a(kVar, y.toString(), (Throwable) null);
            boolean z = p3.f6227b;
            p3.f6227b = false;
            this.f6229h.jobFinished(this.f6230i, z);
        }
    }

    public static abstract class c implements Runnable {

        public class a implements c0.b {
            public final /* synthetic */ BlockingQueue a;

            public a(c cVar, BlockingQueue blockingQueue) {
                this.a = blockingQueue;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: b.o.c0$d} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: b.o.c0$d} */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(b.o.c0.d r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L_0x0003
                    goto L_0x0008
                L_0x0003:
                    java.lang.Object r2 = new java.lang.Object
                    r2.<init>()
                L_0x0008:
                    java.util.concurrent.BlockingQueue r0 = r1.a
                    r0.offer(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: b.o.p3.c.a.a(b.o.c0$d):void");
            }

            public c0.f d() {
                return c0.f.SYNC_SERVICE;
            }
        }

        public abstract void a();

        public final void run() {
            synchronized (p3.class) {
                p3.a = 0L;
            }
            if (i2.r() == null) {
                a();
                return;
            }
            i2.a = i2.q();
            o3.b().p();
            o3.a().p();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                c0.d(i2.c, false, false, new a(this, arrayBlockingQueue));
                Object take = arrayBlockingQueue.take();
                if (take instanceof c0.d) {
                    o3.e((c0.d) take);
                }
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            o3.b().y(true);
            o3.a().y(true);
            n a2 = n.a();
            Objects.requireNonNull(a2);
            if (!i2.f6120h) {
                for (n.d next : a2.f6203b) {
                    if (next.d()) {
                        next.j();
                    }
                }
            }
            a();
        }
    }

    @RequiresApi(21)
    public static void a(Context context, long j2) {
        boolean z;
        boolean z2;
        Thread thread;
        i2.k kVar = i2.k.VERBOSE;
        i2.a(kVar, "scheduleSyncServiceAsJob:atTime: " + j2, (Throwable) null);
        Iterator<JobInfo> it = ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (true) {
            z = false;
            if (it.hasNext()) {
                if (it.next().getId() == 2071862118 && (thread = c) != null && thread.isAlive()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            i2.a(kVar, "scheduleSyncServiceAsJob Scheduler already running!", (Throwable) null);
            f6227b = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(2071862118, new ComponentName(context, SyncJobService.class));
        builder.setMinimumLatency(j2).setRequiredNetworkType(1);
        if (g.i(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            z = true;
        }
        if (z) {
            builder.setPersisted(true);
        }
        try {
            int schedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            i2.a(i2.k.INFO, "scheduleSyncServiceAsJob:result: " + schedule, (Throwable) null);
        } catch (NullPointerException e2) {
            i2.a(i2.k.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e2);
        }
    }

    public static void b(Context context) {
        i2.a(i2.k.VERBOSE, "scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", (Throwable) null);
        c(context, Constants.EVENT_UPLOAD_PERIOD_MILLIS);
    }

    public static synchronized void c(Context context, long j2) {
        synchronized (p3.class) {
            if (a.longValue() == 0 || System.currentTimeMillis() + j2 <= a.longValue()) {
                if (j2 < 5000) {
                    j2 = 5000;
                }
                a(context, j2);
                a = Long.valueOf(System.currentTimeMillis() + j2);
            }
        }
    }
}
