package b.l.a.c.i.b;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.p.c;
import b.l.a.c.f.i.c9;
import java.util.Objects;

public final class p8 {
    public final /* synthetic */ q8 a;

    public p8(q8 q8Var) {
        this.a = q8Var;
    }

    @WorkerThread
    public final void a() {
        this.a.h();
        x3 q2 = this.a.a.q();
        Objects.requireNonNull((c) this.a.a.f4121n);
        if (q2.u(System.currentTimeMillis())) {
            this.a.a.q().f4364q.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.a.a().f4096n.a("Detected application was in foreground");
                Objects.requireNonNull((c) this.a.a.f4121n);
                c(System.currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    public final void b(long j2, boolean z) {
        this.a.h();
        this.a.l();
        if (this.a.a.q().u(j2)) {
            this.a.a.q().f4364q.b(true);
        }
        this.a.a.q().t.b(j2);
        if (this.a.a.q().f4364q.a()) {
            c(j2, z);
        }
    }

    @WorkerThread
    public final void c(long j2, boolean z) {
        this.a.h();
        if (this.a.a.j()) {
            this.a.a.q().t.b(j2);
            Objects.requireNonNull((c) this.a.a.f4121n);
            this.a.a.a().f4096n.b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j2 / 1000);
            this.a.a.s().m("auto", "_sid", valueOf, j2);
            this.a.a.q().f4364q.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.a.a.f4114g.r((String) null, x2.j0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.a.a.s().B("auto", "_s", j2, bundle);
            c9.b();
            if (this.a.a.f4114g.r((String) null, x2.o0)) {
                String a2 = this.a.a.q().y.a();
                if (!TextUtils.isEmpty(a2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a2);
                    this.a.a.s().B("auto", "_ssr", j2, bundle2);
                }
            }
        }
    }
}
