package b.l.a.a.f.q.h;

import android.content.Context;
import androidx.annotation.RequiresApi;
import b.l.a.a.f.q.i.c;

@RequiresApi(api = 21)
public class d implements r {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2518b;
    public final f c;

    public d(Context context, c cVar, f fVar) {
        this.a = context;
        this.f2518b = cVar;
        this.c = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0092, code lost:
        r7 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(b.l.a.a.f.h r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r0.a
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService> r5 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class
            r3.<init>(r4, r5)
            android.content.Context r4 = r0.a
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.job.JobScheduler r4 = (android.app.job.JobScheduler) r4
            java.util.zip.Adler32 r5 = new java.util.zip.Adler32
            r5.<init>()
            android.content.Context r6 = r0.a
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r7)
            byte[] r6 = r6.getBytes(r8)
            r5.update(r6)
            java.lang.String r6 = r18.b()
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r6 = r6.getBytes(r7)
            r5.update(r6)
            r6 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            b.l.a.a.b r8 = r18.d()
            int r8 = b.l.a.a.f.t.a.a(r8)
            java.nio.ByteBuffer r7 = r7.putInt(r8)
            byte[] r7 = r7.array()
            r5.update(r7)
            byte[] r7 = r18.c()
            if (r7 == 0) goto L_0x0065
            byte[] r7 = r18.c()
            r5.update(r7)
        L_0x0065:
            long r7 = r5.getValue()
            int r5 = (int) r7
            java.util.List r7 = r4.getAllPendingJobs()
            java.util.Iterator r7 = r7.iterator()
        L_0x0072:
            boolean r8 = r7.hasNext()
            java.lang.String r9 = "attemptNumber"
            if (r8 == 0) goto L_0x0092
            java.lang.Object r8 = r7.next()
            android.app.job.JobInfo r8 = (android.app.job.JobInfo) r8
            android.os.PersistableBundle r12 = r8.getExtras()
            int r12 = r12.getInt(r9)
            int r8 = r8.getId()
            if (r8 != r5) goto L_0x0072
            if (r12 < r2) goto L_0x0092
            r7 = 1
            goto L_0x0093
        L_0x0092:
            r7 = 0
        L_0x0093:
            java.lang.String r8 = "JobInfoScheduler"
            if (r7 == 0) goto L_0x009d
            java.lang.String r2 = "Upload for context %s is already scheduled. Returning..."
            b.a.a.n.f.c(r8, r2, r1)
            return
        L_0x009d:
            b.l.a.a.f.q.i.c r7 = r0.f2518b
            long r12 = r7.R(r1)
            b.l.a.a.f.q.h.f r7 = r0.c
            android.app.job.JobInfo$Builder r14 = new android.app.job.JobInfo$Builder
            r14.<init>(r5, r3)
            b.l.a.a.b r3 = r18.d()
            long r10 = r7.b(r3, r12, r2)
            r14.setMinimumLatency(r10)
            java.util.Map r7 = r7.c()
            java.lang.Object r3 = r7.get(r3)
            b.l.a.a.f.q.h.f$a r3 = (b.l.a.a.f.q.h.f.a) r3
            java.util.Set r3 = r3.c()
            b.l.a.a.f.q.h.f$b r7 = b.l.a.a.f.q.h.f.b.NETWORK_UNMETERED
            boolean r7 = r3.contains(r7)
            r10 = 2
            if (r7 == 0) goto L_0x00d1
            r14.setRequiredNetworkType(r10)
            r7 = 1
            goto L_0x00d5
        L_0x00d1:
            r7 = 1
            r14.setRequiredNetworkType(r7)
        L_0x00d5:
            b.l.a.a.f.q.h.f$b r11 = b.l.a.a.f.q.h.f.b.DEVICE_CHARGING
            boolean r11 = r3.contains(r11)
            if (r11 == 0) goto L_0x00e0
            r14.setRequiresCharging(r7)
        L_0x00e0:
            b.l.a.a.f.q.h.f$b r11 = b.l.a.a.f.q.h.f.b.DEVICE_IDLE
            boolean r3 = r3.contains(r11)
            if (r3 == 0) goto L_0x00eb
            r14.setRequiresDeviceIdle(r7)
        L_0x00eb:
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            r3.putInt(r9, r2)
            java.lang.String r7 = r18.b()
            java.lang.String r9 = "backendName"
            r3.putString(r9, r7)
            b.l.a.a.b r7 = r18.d()
            int r7 = b.l.a.a.f.t.a.a(r7)
            java.lang.String r9 = "priority"
            r3.putInt(r9, r7)
            byte[] r7 = r18.c()
            if (r7 == 0) goto L_0x011e
            byte[] r7 = r18.c()
            r9 = 0
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r9)
            java.lang.String r11 = "extras"
            r3.putString(r11, r7)
            goto L_0x011f
        L_0x011e:
            r9 = 0
        L_0x011f:
            r14.setExtras(r3)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r9] = r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 1
            r3[r7] = r5
            b.l.a.a.f.q.h.f r5 = r0.c
            b.l.a.a.b r1 = r18.d()
            long r15 = r5.b(r1, r12, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            r3[r10] = r1
            r1 = 3
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r3[r1] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r3[r6] = r1
            java.lang.String r1 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"
            b.a.a.n.f.d(r8, r1, r3)
            android.app.job.JobInfo r1 = r14.build()
            r4.schedule(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.a.f.q.h.d.a(b.l.a.a.f.h, int):void");
    }
}
