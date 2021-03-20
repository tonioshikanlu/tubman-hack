package b.l.a.c.i.b;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.p.c;
import com.segment.analytics.AnalyticsContext;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class b7 extends a4 {
    public volatile t6 c;
    public t6 d;

    /* renamed from: e  reason: collision with root package name */
    public t6 f3924e;
    public final Map<Activity, t6> f = new ConcurrentHashMap();
    @GuardedBy("activityLock")

    /* renamed from: g  reason: collision with root package name */
    public Activity f3925g;
    @GuardedBy("activityLock")

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f3926h;

    /* renamed from: i  reason: collision with root package name */
    public volatile t6 f3927i;

    /* renamed from: j  reason: collision with root package name */
    public t6 f3928j;
    @GuardedBy("activityLock")

    /* renamed from: k  reason: collision with root package name */
    public boolean f3929k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f3930l = new Object();
    @GuardedBy("this")

    /* renamed from: m  reason: collision with root package name */
    public String f3931m;

    public b7(l4 l4Var) {
        super(l4Var);
    }

    public static void r(t6 t6Var, Bundle bundle, boolean z) {
        if (t6Var != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = t6Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = t6Var.f4282b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", t6Var.c);
                return;
            }
            z = false;
        }
        if (t6Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final boolean k() {
        return false;
    }

    @MainThread
    public final void l(Activity activity, t6 t6Var, boolean z) {
        t6 t6Var2;
        t6 t6Var3 = t6Var;
        t6 t6Var4 = this.c == null ? this.d : this.c;
        if (t6Var3.f4282b == null) {
            t6Var2 = new t6(t6Var3.a, activity != null ? q(activity.getClass(), "Activity") : null, t6Var3.c, t6Var3.f4283e, t6Var3.f);
        } else {
            t6Var2 = t6Var3;
        }
        this.d = this.c;
        this.c = t6Var2;
        Objects.requireNonNull((c) this.a.f4121n);
        this.a.d().q(new v6(this, t6Var2, t6Var4, SystemClock.elapsedRealtime(), z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(b.l.a.c.i.b.t6 r19, b.l.a.c.i.b.t6 r20, long r21, boolean r23, android.os.Bundle r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r24
            r18.h()
            r6 = 1
            if (r23 == 0) goto L_0x0016
            b.l.a.c.i.b.t6 r7 = r0.f3924e
            if (r7 == 0) goto L_0x0016
            r7 = r6
            goto L_0x0017
        L_0x0016:
            r7 = 0
        L_0x0017:
            if (r7 == 0) goto L_0x001e
            b.l.a.c.i.b.t6 r8 = r0.f3924e
            r0.n(r8, r6, r3)
        L_0x001e:
            r8 = 0
            if (r2 == 0) goto L_0x003d
            long r9 = r2.c
            long r11 = r1.c
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x003d
            java.lang.String r9 = r2.f4282b
            java.lang.String r10 = r1.f4282b
            boolean r9 = b.l.a.c.i.b.k9.G(r9, r10)
            if (r9 == 0) goto L_0x003d
            java.lang.String r9 = r2.a
            java.lang.String r10 = r1.a
            boolean r9 = b.l.a.c.i.b.k9.G(r9, r10)
            if (r9 != 0) goto L_0x0108
        L_0x003d:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            b.l.a.c.i.b.l4 r10 = r0.a
            b.l.a.c.i.b.f r10 = r10.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r11 = b.l.a.c.i.b.x2.u0
            boolean r10 = r10.r(r8, r11)
            if (r10 == 0) goto L_0x0059
            android.os.Bundle r9 = new android.os.Bundle
            if (r5 == 0) goto L_0x0056
            r9.<init>(r5)
            goto L_0x0059
        L_0x0056:
            r9.<init>()
        L_0x0059:
            r(r1, r9, r6)
            if (r2 == 0) goto L_0x0077
            java.lang.String r5 = r2.a
            if (r5 == 0) goto L_0x0067
            java.lang.String r10 = "_pn"
            r9.putString(r10, r5)
        L_0x0067:
            java.lang.String r5 = r2.f4282b
            if (r5 == 0) goto L_0x0070
            java.lang.String r10 = "_pc"
            r9.putString(r10, r5)
        L_0x0070:
            long r12 = r2.c
            java.lang.String r2 = "_pi"
            r9.putLong(r2, r12)
        L_0x0077:
            r12 = 0
            if (r7 == 0) goto L_0x0096
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.q8 r2 = r2.r()
            b.l.a.c.i.b.o8 r2 = r2.f4237e
            long r14 = r2.f4203b
            long r14 = r3 - r14
            r2.f4203b = r3
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.k9 r2 = r2.t()
            r2.O(r9, r14)
        L_0x0096:
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.f r2 = r2.f4114g
            boolean r2 = r2.r(r8, r11)
            if (r2 == 0) goto L_0x00b9
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.f r2 = r2.f4114g
            boolean r2 = r2.w()
            if (r2 != 0) goto L_0x00b1
            r2 = 1
            java.lang.String r4 = "_mst"
            r9.putLong(r4, r2)
        L_0x00b1:
            boolean r2 = r1.f4283e
            if (r6 == r2) goto L_0x00b6
            goto L_0x00b9
        L_0x00b6:
            java.lang.String r2 = "app"
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r2 = "auto"
        L_0x00bb:
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.i.b.f r3 = r3.f4114g
            boolean r3 = r3.r(r8, r11)
            if (r3 == 0) goto L_0x00e6
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.c.p.b r3 = r3.f4121n
            b.l.a.c.c.p.c r3 = (b.l.a.c.c.p.c) r3
            java.util.Objects.requireNonNull(r3)
            long r3 = java.lang.System.currentTimeMillis()
            boolean r5 = r1.f4283e
            if (r5 == 0) goto L_0x00dd
            long r5 = r1.f
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x00dd
            r3 = r5
        L_0x00dd:
            b.l.a.c.i.b.l4 r5 = r0.a
            b.l.a.c.i.b.m6 r5 = r5.s()
            r15 = r3
            r12 = r5
            goto L_0x0100
        L_0x00e6:
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.i.b.m6 r3 = r3.s()
            b.l.a.c.i.b.l4 r4 = r3.a
            r3.h()
            b.l.a.c.i.b.l4 r4 = r3.a
            b.l.a.c.c.p.b r4 = r4.f4121n
            b.l.a.c.c.p.c r4 = (b.l.a.c.c.p.c) r4
            java.util.Objects.requireNonNull(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r12 = r3
            r15 = r4
        L_0x0100:
            java.lang.String r14 = "_vs"
            r13 = r2
            r17 = r9
            r12.B(r13, r14, r15, r17)
        L_0x0108:
            r0.f3924e = r1
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.f r2 = r2.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.u0
            boolean r2 = r2.r(r8, r3)
            if (r2 == 0) goto L_0x011c
            boolean r2 = r1.f4283e
            if (r2 == 0) goto L_0x011c
            r0.f3928j = r1
        L_0x011c:
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.b8 r2 = r2.z()
            r2.h()
            r2.i()
            b.l.a.c.i.b.i7 r3 = new b.l.a.c.i.b.i7
            r3.<init>(r2, r1)
            r2.t(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.b7.m(b.l.a.c.i.b.t6, b.l.a.c.i.b.t6, long, boolean, android.os.Bundle):void");
    }

    @WorkerThread
    public final void n(t6 t6Var, boolean z, long j2) {
        c2 g2 = this.a.g();
        Objects.requireNonNull((c) this.a.f4121n);
        g2.k(SystemClock.elapsedRealtime());
        if (this.a.r().f4237e.a(t6Var != null && t6Var.d, z, j2) && t6Var != null) {
            t6Var.d = false;
        }
    }

    @MainThread
    public final t6 o(@NonNull Activity activity) {
        Objects.requireNonNull(activity, "null reference");
        t6 t6Var = this.f.get(activity);
        if (t6Var == null) {
            t6 t6Var2 = new t6((String) null, q(activity.getClass(), "Activity"), this.a.t().c0());
            this.f.put(activity, t6Var2);
            t6Var = t6Var2;
        }
        return (this.a.f4114g.r((String) null, x2.u0) && this.f3927i != null) ? this.f3927i : t6Var;
    }

    @WorkerThread
    public final t6 p(boolean z) {
        i();
        h();
        if (!this.a.f4114g.r((String) null, x2.u0) || !z) {
            return this.f3924e;
        }
        t6 t6Var = this.f3924e;
        return t6Var != null ? t6Var : this.f3928j;
    }

    public final String q(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        f fVar = this.a.f4114g;
        return length2 > 100 ? str2.substring(0, 100) : str2;
    }

    @WorkerThread
    public final void s(String str, t6 t6Var) {
        h();
        synchronized (this) {
            String str2 = this.f3931m;
            if (str2 == null || str2.equals(str)) {
                this.f3931m = str;
            }
        }
    }

    @MainThread
    public final void t(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.a.f4114g.w() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f.put(activity, new t6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(AnalyticsContext.Device.DEVICE_ID_KEY)));
        }
    }
}
