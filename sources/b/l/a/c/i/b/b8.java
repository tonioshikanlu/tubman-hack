package b.l.a.c.i.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import b.l.a.c.c.o.a;
import b.l.a.c.c.p.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class b8 extends a4 {
    public final a8 c;
    public a3 d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f3932e;
    public final l f;

    /* renamed from: g  reason: collision with root package name */
    public final r8 f3933g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Runnable> f3934h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final l f3935i;

    public b8(l4 l4Var) {
        super(l4Var);
        this.f3933g = new r8(l4Var.f4121n);
        this.c = new a8(this);
        this.f = new k7(this, l4Var);
        this.f3935i = new m7(this, l4Var);
    }

    public static void q(b8 b8Var, ComponentName componentName) {
        b8Var.h();
        if (b8Var.d != null) {
            b8Var.d = null;
            b8Var.a.a().f4096n.b("Disconnected from device MeasurementService", componentName);
            b8Var.h();
            b8Var.l();
        }
    }

    public final boolean k() {
        return false;
    }

    @WorkerThread
    public final void l() {
        h();
        i();
        if (!w()) {
            if (n()) {
                a8 a8Var = this.c;
                a8Var.c.h();
                Context context = a8Var.c.a.a;
                synchronized (a8Var) {
                    if (a8Var.a) {
                        a8Var.c.a.a().f4096n.a("Connection attempt already in progress");
                    } else if (a8Var.f3907b == null || (!a8Var.f3907b.o() && !a8Var.f3907b.a())) {
                        a8Var.f3907b = new g3(context, Looper.getMainLooper(), a8Var, a8Var);
                        a8Var.c.a.a().f4096n.a("Connecting to remote service");
                        a8Var.a = true;
                        Objects.requireNonNull(a8Var.f3907b, "null reference");
                        a8Var.f3907b.v();
                    } else {
                        a8Var.c.a.a().f4096n.a("Already awaiting connection attempt");
                    }
                }
            } else if (!this.a.f4114g.z()) {
                l4 l4Var = this.a;
                y9 y9Var = l4Var.f;
                List<ResolveInfo> queryIntentServices = l4Var.a.getPackageManager().queryIntentServices(new Intent().setClassName(this.a.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.a.a().f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                l4 l4Var2 = this.a;
                Context context2 = l4Var2.a;
                y9 y9Var2 = l4Var2.f;
                intent.setComponent(new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementService"));
                a8 a8Var2 = this.c;
                a8Var2.c.h();
                Context context3 = a8Var2.c.a.a;
                a b2 = a.b();
                synchronized (a8Var2) {
                    if (a8Var2.a) {
                        a8Var2.c.a.a().f4096n.a("Connection attempt already in progress");
                    } else {
                        a8Var2.c.a.a().f4096n.a("Using local app measurement service");
                        a8Var2.a = true;
                        a8 a8Var3 = a8Var2.c.c;
                        Objects.requireNonNull(b2);
                        context3.getClass().getName();
                        b2.c(context3, intent, a8Var3, 129);
                    }
                }
            }
        }
    }

    public final Boolean m() {
        return this.f3932e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0116  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n() {
        /*
            r8 = this;
            r8.h()
            r8.i()
            java.lang.Boolean r0 = r8.f3932e
            if (r0 != 0) goto L_0x0136
            r8.h()
            r8.i()
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.x3 r0 = r0.q()
            r0.h()
            android.content.SharedPreferences r1 = r0.o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0130
        L_0x003f:
            b.l.a.c.i.b.l4 r4 = r8.a
            b.l.a.c.i.b.y9 r5 = r4.f
            b.l.a.c.i.b.c3 r4 = r4.b()
            r4.i()
            int r4 = r4.f3941j
            if (r4 != r1) goto L_0x0050
            goto L_0x00fb
        L_0x0050:
            b.l.a.c.i.b.l4 r4 = r8.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.f4096n
            java.lang.String r5 = "Checking service availability"
            r4.a(r5)
            b.l.a.c.i.b.l4 r4 = r8.a
            b.l.a.c.i.b.k9 r4 = r4.t()
            java.util.Objects.requireNonNull(r4)
            b.l.a.c.c.f r5 = b.l.a.c.c.f.f2599b
            b.l.a.c.i.b.l4 r4 = r4.a
            android.content.Context r4 = r4.a
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.b(r4, r6)
            if (r4 == 0) goto L_0x00ee
            if (r4 == r1) goto L_0x00e0
            r5 = 2
            if (r4 == r5) goto L_0x00bc
            r0 = 3
            if (r4 == r0) goto L_0x00ad
            r0 = 9
            if (r4 == r0) goto L_0x00a2
            r0 = 18
            if (r4 == r0) goto L_0x0097
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4091i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.b(r4, r1)
            goto L_0x00ba
        L_0x0097:
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4091i
            java.lang.String r3 = "Service updating"
            goto L_0x00f8
        L_0x00a2:
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4091i
            java.lang.String r1 = "Service invalid"
            goto L_0x00b7
        L_0x00ad:
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4091i
            java.lang.String r1 = "Service disabled"
        L_0x00b7:
            r0.a(r1)
        L_0x00ba:
            r1 = r3
            goto L_0x00fc
        L_0x00bc:
            b.l.a.c.i.b.l4 r4 = r8.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.f4095m
            java.lang.String r5 = "Service container out of date"
            r4.a(r5)
            b.l.a.c.i.b.l4 r4 = r8.a
            b.l.a.c.i.b.k9 r4 = r4.t()
            int r4 = r4.M()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00d8
            goto L_0x00fc
        L_0x00d8:
            if (r0 != 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r1 = r3
        L_0x00dc:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x00fc
        L_0x00e0:
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.String r4 = "Service missing"
            r0.a(r4)
            goto L_0x00fc
        L_0x00ee:
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.String r3 = "Service available"
        L_0x00f8:
            r0.a(r3)
        L_0x00fb:
            r3 = r1
        L_0x00fc:
            if (r3 != 0) goto L_0x0116
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x0116
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r1)
            goto L_0x012f
        L_0x0116:
            if (r1 == 0) goto L_0x012f
            b.l.a.c.i.b.l4 r0 = r8.a
            b.l.a.c.i.b.x3 r0 = r0.q()
            r0.h()
            android.content.SharedPreferences r0 = r0.o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x012f:
            r1 = r3
        L_0x0130:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.f3932e = r0
        L_0x0136:
            java.lang.Boolean r0 = r8.f3932e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.b8.n():boolean");
    }

    @WorkerThread
    public final void o() {
        h();
        i();
        a8 a8Var = this.c;
        if (a8Var.f3907b != null && (a8Var.f3907b.a() || a8Var.f3907b.o())) {
            a8Var.f3907b.b();
        }
        a8Var.f3907b = null;
        try {
            a b2 = a.b();
            Context context = this.a.a;
            a8 a8Var2 = this.c;
            Objects.requireNonNull(b2);
            context.unbindService(a8Var2);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    @WorkerThread
    public final boolean p() {
        h();
        i();
        if (!this.a.f4114g.r((String) null, x2.y0)) {
            return false;
        }
        return !n() || this.a.t().M() >= x2.z0.a(null).intValue();
    }

    public final boolean r() {
        y9 y9Var = this.a.f;
        return true;
    }

    @WorkerThread
    public final void s() {
        h();
        r8 r8Var = this.f3933g;
        Objects.requireNonNull((c) r8Var.a);
        r8Var.f4247b = SystemClock.elapsedRealtime();
        l lVar = this.f;
        f fVar = this.a.f4114g;
        lVar.b(x2.J.a(null).longValue());
    }

    @WorkerThread
    public final void t(Runnable runnable) {
        h();
        if (w()) {
            runnable.run();
            return;
        }
        int size = this.f3934h.size();
        l4 l4Var = this.a;
        f fVar = l4Var.f4114g;
        if (((long) size) >= 1000) {
            l4Var.a().f.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f3934h.add(runnable);
        this.f3935i.b(60000);
        l();
    }

    @WorkerThread
    public final void u() {
        h();
        this.a.a().f4096n.b("Processing queued up service tasks", Integer.valueOf(this.f3934h.size()));
        for (Runnable run : this.f3934h) {
            try {
                run.run();
            } catch (Exception e2) {
                this.a.a().f.b("Task exception while flushing queue", e2);
            }
        }
        this.f3934h.clear();
        this.f3935i.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02c5  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.i.b.p9 v(boolean r37) {
        /*
            r36 = this;
            r1 = r36
            b.l.a.c.i.b.l4 r0 = r1.a
            b.l.a.c.i.b.y9 r2 = r0.f
            b.l.a.c.i.b.c3 r2 = r0.b()
            r3 = 0
            r5 = 1
            r0 = 0
            if (r37 == 0) goto L_0x00c6
            b.l.a.c.i.b.l4 r6 = r1.a
            b.l.a.c.i.b.k3 r6 = r6.a()
            b.l.a.c.i.b.l4 r7 = r6.a
            b.l.a.c.i.b.x3 r7 = r7.q()
            b.l.a.c.i.b.v3 r7 = r7.d
            if (r7 != 0) goto L_0x0022
            goto L_0x00c6
        L_0x0022:
            b.l.a.c.i.b.l4 r6 = r6.a
            b.l.a.c.i.b.x3 r6 = r6.q()
            b.l.a.c.i.b.v3 r6 = r6.d
            b.l.a.c.i.b.x3 r7 = r6.f4309e
            r7.h()
            b.l.a.c.i.b.x3 r7 = r6.f4309e
            r7.h()
            b.l.a.c.i.b.x3 r7 = r6.f4309e
            android.content.SharedPreferences r7 = r7.o()
            java.lang.String r8 = r6.a
            long r7 = r7.getLong(r8, r3)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0049
            r6.a()
            r7 = r3
            goto L_0x005d
        L_0x0049:
            b.l.a.c.i.b.x3 r9 = r6.f4309e
            b.l.a.c.i.b.l4 r9 = r9.a
            b.l.a.c.c.p.b r9 = r9.f4121n
            b.l.a.c.c.p.c r9 = (b.l.a.c.c.p.c) r9
            java.util.Objects.requireNonNull(r9)
            long r9 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
        L_0x005d:
            long r9 = r6.d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            long r9 = r9 + r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x006e
            r6.a()
        L_0x006c:
            r6 = r0
            goto L_0x009c
        L_0x006e:
            b.l.a.c.i.b.x3 r7 = r6.f4309e
            android.content.SharedPreferences r7 = r7.o()
            java.lang.String r8 = r6.c
            java.lang.String r7 = r7.getString(r8, r0)
            b.l.a.c.i.b.x3 r8 = r6.f4309e
            android.content.SharedPreferences r8 = r8.o()
            java.lang.String r9 = r6.f4308b
            long r8 = r8.getLong(r9, r3)
            r6.a()
            if (r7 == 0) goto L_0x009a
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0090
            goto L_0x009a
        L_0x0090:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.<init>(r7, r8)
            goto L_0x009c
        L_0x009a:
            android.util.Pair<java.lang.String, java.lang.Long> r6 = b.l.a.c.i.b.x3.C
        L_0x009c:
            if (r6 == 0) goto L_0x00c6
            android.util.Pair<java.lang.String, java.lang.Long> r7 = b.l.a.c.i.b.x3.C
            if (r6 != r7) goto L_0x00a3
            goto L_0x00c6
        L_0x00a3:
            java.lang.Object r0 = r6.second
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r6 = r6.first
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r0.length()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + r5
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = ":"
            java.lang.String r0 = b.e.a.a.a.r(r9, r0, r7, r6)
        L_0x00c6:
            r17 = r0
            r2.h()
            b.l.a.c.i.b.p9 r35 = new b.l.a.c.i.b.p9
            java.lang.String r7 = r2.m()
            java.lang.String r8 = r2.n()
            r2.i()
            java.lang.String r9 = r2.d
            r2.i()
            int r0 = r2.f3937e
            long r10 = (long) r0
            r2.i()
            java.lang.String r0 = r2.f
            java.lang.String r6 = "null reference"
            java.util.Objects.requireNonNull(r0, r6)
            java.lang.String r12 = r2.f
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            r0.n()
            r2.i()
            r2.h()
            long r13 = r2.f3938g
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            r3 = 0
            if (r0 != 0) goto L_0x0180
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.k9 r4 = r0.t()
            b.l.a.c.i.b.l4 r0 = r2.a
            android.content.Context r0 = r0.a
            java.lang.String r13 = r0.getPackageName()
            r4.h()
            b.l.a.c.b.a.x(r13)
            android.content.pm.PackageManager r14 = r0.getPackageManager()
            java.security.MessageDigest r15 = b.l.a.c.i.b.k9.B()
            r18 = -1
            if (r15 != 0) goto L_0x012e
            b.l.a.c.i.b.l4 r0 = r4.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f
            java.lang.String r4 = "Could not get MD5 instance"
            r0.a(r4)
            goto L_0x017c
        L_0x012e:
            if (r14 == 0) goto L_0x017a
            boolean r13 = r4.K(r0, r13)     // Catch:{ NameNotFoundException -> 0x016c }
            if (r13 != 0) goto L_0x017a
            b.l.a.c.c.q.a r0 = b.l.a.c.c.q.b.a(r0)     // Catch:{ NameNotFoundException -> 0x016c }
            b.l.a.c.i.b.l4 r13 = r4.a     // Catch:{ NameNotFoundException -> 0x016c }
            android.content.Context r13 = r13.a     // Catch:{ NameNotFoundException -> 0x016c }
            java.lang.String r13 = r13.getPackageName()     // Catch:{ NameNotFoundException -> 0x016c }
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.b(r13, r14)     // Catch:{ NameNotFoundException -> 0x016c }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x016c }
            if (r0 == 0) goto L_0x015e
            int r13 = r0.length     // Catch:{ NameNotFoundException -> 0x016c }
            if (r13 <= 0) goto L_0x015e
            r0 = r0[r3]     // Catch:{ NameNotFoundException -> 0x016c }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x016c }
            byte[] r0 = r15.digest(r0)     // Catch:{ NameNotFoundException -> 0x016c }
            long r18 = b.l.a.c.i.b.k9.C(r0)     // Catch:{ NameNotFoundException -> 0x016c }
            goto L_0x017c
        L_0x015e:
            b.l.a.c.i.b.l4 r0 = r4.a     // Catch:{ NameNotFoundException -> 0x016c }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ NameNotFoundException -> 0x016c }
            b.l.a.c.i.b.i3 r0 = r0.f4091i     // Catch:{ NameNotFoundException -> 0x016c }
            java.lang.String r13 = "Could not get signatures"
            r0.a(r13)     // Catch:{ NameNotFoundException -> 0x016c }
            goto L_0x017c
        L_0x016c:
            r0 = move-exception
            b.l.a.c.i.b.l4 r4 = r4.a
            b.l.a.c.i.b.k3 r4 = r4.a()
            b.l.a.c.i.b.i3 r4 = r4.f
            java.lang.String r13 = "Package name not found"
            r4.b(r13, r0)
        L_0x017a:
            r18 = 0
        L_0x017c:
            r13 = r18
            r2.f3938g = r13
        L_0x0180:
            r15 = r13
            b.l.a.c.i.b.l4 r0 = r2.a
            boolean r18 = r0.j()
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.x3 r0 = r0.q()
            boolean r0 = r0.u
            r19 = r0 ^ 1
            r2.h()
            b.l.a.c.i.b.l4 r0 = r2.a
            boolean r0 = r0.j()
            if (r0 != 0) goto L_0x019e
            goto L_0x0216
        L_0x019e:
            b.l.a.c.f.i.db r0 = b.l.a.c.f.i.db.f3519i
            b.l.a.c.f.i.eb r0 = r0.a()
            r0.a()
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r4 = b.l.a.c.i.b.x2.k0
            r13 = 0
            boolean r0 = r0.r(r13, r4)
            if (r0 == 0) goto L_0x01c2
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.String r3 = "Disabled IID for tests."
        L_0x01be:
            r0.a(r3)
            goto L_0x0216
        L_0x01c2:
            b.l.a.c.i.b.l4 r0 = r2.a     // Catch:{ ClassNotFoundException -> 0x0216 }
            android.content.Context r0 = r0.a     // Catch:{ ClassNotFoundException -> 0x0216 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0216 }
            java.lang.String r4 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0216 }
            if (r0 != 0) goto L_0x01d3
            goto L_0x0216
        L_0x01d3:
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x020b }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r4[r3] = r13     // Catch:{ Exception -> 0x020b }
            java.lang.String r13 = "getInstance"
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r13, r4)     // Catch:{ Exception -> 0x020b }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x020b }
            b.l.a.c.i.b.l4 r13 = r2.a     // Catch:{ Exception -> 0x020b }
            android.content.Context r13 = r13.a     // Catch:{ Exception -> 0x020b }
            r5[r3] = r13     // Catch:{ Exception -> 0x020b }
            r13 = 0
            java.lang.Object r4 = r4.invoke(r13, r5)     // Catch:{ Exception -> 0x020b }
            if (r4 != 0) goto L_0x01ef
            goto L_0x0216
        L_0x01ef:
            java.lang.String r5 = "getFirebaseInstanceId"
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0200 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r13)     // Catch:{ Exception -> 0x0200 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0200 }
            java.lang.Object r0 = r0.invoke(r4, r3)     // Catch:{ Exception -> 0x0200 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0200 }
            goto L_0x0217
        L_0x0200:
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4093k
            java.lang.String r3 = "Failed to retrieve Firebase Instance Id"
            goto L_0x01be
        L_0x020b:
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4092j
            java.lang.String r3 = "Failed to obtain Firebase Analytics instance"
            goto L_0x01be
        L_0x0216:
            r0 = 0
        L_0x0217:
            r20 = r0
            b.l.a.c.i.b.l4 r0 = r2.a
            b.l.a.c.i.b.x3 r3 = r0.q()
            b.l.a.c.i.b.u3 r3 = r3.f4357j
            long r3 = r3.a()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r4 = r3.longValue()
            r13 = 0
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0236
            long r3 = r0.H
            goto L_0x0240
        L_0x0236:
            long r4 = r0.H
            long r13 = r3.longValue()
            long r3 = java.lang.Math.min(r4, r13)
        L_0x0240:
            r23 = r3
            r2.i()
            int r0 = r2.f3941j
            b.l.a.c.i.b.l4 r3 = r2.a
            b.l.a.c.i.b.f r3 = r3.f4114g
            boolean r26 = r3.v()
            b.l.a.c.i.b.l4 r3 = r2.a
            b.l.a.c.i.b.x3 r3 = r3.q()
            r3.h()
            android.content.SharedPreferences r3 = r3.o()
            java.lang.String r4 = "deferred_analytics_collection"
            r5 = 0
            boolean r27 = r3.getBoolean(r4, r5)
            r2.i()
            java.lang.String r3 = r2.f3943l
            b.l.a.c.i.b.l4 r4 = r2.a
            b.l.a.c.i.b.f r4 = r4.f4114g
            java.lang.String r5 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r4 = r4.t(r5)
            if (r4 != 0) goto L_0x0276
            r4 = 0
            goto L_0x0280
        L_0x0276:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x0280:
            r29 = r4
            long r4 = r2.f3939h
            java.util.List<java.lang.String> r13 = r2.f3940i
            b.l.a.c.f.i.y9.b()
            b.l.a.c.i.b.l4 r14 = r2.a
            b.l.a.c.i.b.f r14 = r14.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r1 = b.l.a.c.i.b.x2.i0
            r21 = r13
            r13 = 0
            boolean r1 = r14.r(r13, r1)
            if (r1 == 0) goto L_0x02a3
            r2.i()
            java.lang.String r1 = r2.f3944m
            java.util.Objects.requireNonNull(r1, r6)
            java.lang.String r1 = r2.f3944m
            goto L_0x02a4
        L_0x02a3:
            r1 = 0
        L_0x02a4:
            r33 = r1
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r1 = r2.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r6 = b.l.a.c.i.b.x2.w0
            r13 = 0
            boolean r1 = r1.r(r13, r6)
            if (r1 == 0) goto L_0x02c5
            b.l.a.c.i.b.l4 r1 = r2.a
            b.l.a.c.i.b.x3 r1 = r1.q()
            b.l.a.c.i.b.g r1 = r1.s()
            java.lang.String r1 = r1.c()
            goto L_0x02c7
        L_0x02c5:
            java.lang.String r1 = ""
        L_0x02c7:
            r34 = r1
            r13 = 39000(0x9858, double:1.92686E-319)
            r1 = r21
            r21 = 0
            r6 = r35
            r25 = r0
            r28 = r3
            r30 = r4
            r32 = r1
            r6.<init>((java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (long) r10, (java.lang.String) r12, (long) r13, (long) r15, (java.lang.String) r17, (boolean) r18, (boolean) r19, (java.lang.String) r20, (long) r21, (long) r23, (int) r25, (boolean) r26, (boolean) r27, (java.lang.String) r28, (java.lang.Boolean) r29, (long) r30, (java.util.List<java.lang.String>) r32, (java.lang.String) r33, (java.lang.String) r34)
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.b8.v(boolean):b.l.a.c.i.b.p9");
    }

    @WorkerThread
    public final boolean w() {
        h();
        i();
        return this.d != null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v59, resolved type: int} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:76|77|78|79) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:91|92|93|94) */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x023e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0240, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0242, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0244, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0245, code lost:
        r17 = r7;
        r16 = r10;
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x024b, code lost:
        r17 = r7;
        r16 = r10;
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0253, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0254, code lost:
        r17 = r7;
        r16 = r10;
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x026f, code lost:
        if (r5.inTransaction() != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0271, code lost:
        r5.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0284, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x029b, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02b9, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02ce, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02cf, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02d2, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02d7, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x01ba, code lost:
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0113, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r9.a.a().f.a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0128, code lost:
        r17 = r17;
        r17 = r17;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r14.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r9.a.a().f.a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r9.a.a().f.a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x011b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0150 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0184 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x023a A[SYNTHETIC, Splitter:B:140:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0242 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x026b A[SYNTHETIC, Splitter:B:165:0x026b] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x023d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x02c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x02c1 A[SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(b.l.a.c.i.b.a3 r28, b.l.a.c.c.m.v.a r29, b.l.a.c.i.b.p9 r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r27.h()
            r27.i()
            r27.r()
            b.l.a.c.i.b.l4 r0 = r1.a
            b.l.a.c.i.b.f r0 = r0.f4114g
            r5 = 100
            r6 = 0
            r0 = r5
            r7 = r6
        L_0x001a:
            r8 = 1001(0x3e9, float:1.403E-42)
            if (r7 >= r8) goto L_0x036d
            if (r0 != r5) goto L_0x036d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            b.l.a.c.i.b.l4 r0 = r1.a
            b.l.a.c.i.b.e3 r9 = r0.v()
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "Error reading entries from local database"
            r9.h()
            boolean r0 = r9.d
            if (r0 == 0) goto L_0x0037
            goto L_0x005a
        L_0x0037:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            b.l.a.c.i.b.l4 r0 = r9.a
            android.content.Context r0 = r0.a
            java.lang.String r14 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r14)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x02ec
            r14 = 5
            r15 = r6
            r12 = r14
        L_0x004f:
            if (r15 >= r14) goto L_0x02db
            r14 = 1
            android.database.sqlite.SQLiteDatabase r5 = r9.n()     // Catch:{ SQLiteFullException -> 0x02a1, SQLiteDatabaseLockedException -> 0x028b, SQLiteException -> 0x0261, all -> 0x025c }
            if (r5 != 0) goto L_0x005e
            r9.d = r14     // Catch:{ SQLiteFullException -> 0x0253, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0244, all -> 0x0242 }
        L_0x005a:
            r17 = r7
            goto L_0x02ea
        L_0x005e:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0253, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0244, all -> 0x0242 }
            java.lang.String r0 = "3"
            java.lang.String r17 = "messages"
            java.lang.String[] r18 = new java.lang.String[]{r10}     // Catch:{ all -> 0x0231 }
            java.lang.String r19 = "type=?"
            java.lang.String[] r20 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0231 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid desc"
            java.lang.String r24 = "1"
            r16 = r5
            android.database.Cursor r14 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0231 }
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x022a }
            r25 = -1
            if (r0 == 0) goto L_0x008d
            long r16 = r14.getLong(r6)     // Catch:{ all -> 0x022a }
            r14.close()     // Catch:{ SQLiteFullException -> 0x0253, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0244, all -> 0x0242 }
            goto L_0x0092
        L_0x008d:
            r14.close()     // Catch:{ SQLiteFullException -> 0x0253, SQLiteDatabaseLockedException -> 0x024b, SQLiteException -> 0x0244, all -> 0x0242 }
            r16 = r25
        L_0x0092:
            int r0 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "rowid<?"
            r14 = 1
            java.lang.String[] r6 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            java.lang.String r14 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            r16 = 0
            r6[r16] = r14     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            r19 = r0
            r20 = r6
            goto L_0x00c1
        L_0x00a8:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x0268
        L_0x00af:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x0250
        L_0x00b6:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x0259
        L_0x00bd:
            r19 = 0
            r20 = 0
        L_0x00c1:
            java.lang.String r0 = "type"
            java.lang.String r6 = "entry"
            java.lang.String[] r18 = new java.lang.String[]{r10, r0, r6}     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            java.lang.String r17 = "messages"
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r6 = 100
            java.lang.String r24 = java.lang.Integer.toString(r6)     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
            r16 = r5
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x0227, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0224, all -> 0x0242 }
        L_0x00dd:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLiteFullException -> 0x021e, SQLiteDatabaseLockedException -> 0x0218, SQLiteException -> 0x0212 }
            if (r0 == 0) goto L_0x01d1
            r14 = 0
            long r25 = r6.getLong(r14)     // Catch:{ SQLiteFullException -> 0x021e, SQLiteDatabaseLockedException -> 0x0218, SQLiteException -> 0x0212 }
            r14 = 1
            int r0 = r6.getInt(r14)     // Catch:{ SQLiteFullException -> 0x021e, SQLiteDatabaseLockedException -> 0x0218, SQLiteException -> 0x0212 }
            r14 = 2
            r16 = r10
            byte[] r10 = r6.getBlob(r14)     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0 }
            if (r0 != 0) goto L_0x0131
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01c7, SQLiteDatabaseLockedException -> 0x01c4, SQLiteException -> 0x01c0 }
            int r0 = r10.length     // Catch:{ b -> 0x0119, all -> 0x0115 }
            r17 = r7
            r7 = 0
            r14.unmarshall(r10, r7, r0)     // Catch:{ b -> 0x011b }
            r14.setDataPosition(r7)     // Catch:{ b -> 0x011b }
            android.os.Parcelable$Creator<b.l.a.c.i.b.s> r0 = b.l.a.c.i.b.s.CREATOR     // Catch:{ b -> 0x011b }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ b -> 0x011b }
            b.l.a.c.i.b.s r0 = (b.l.a.c.i.b.s) r0     // Catch:{ b -> 0x011b }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            if (r0 == 0) goto L_0x01ba
            goto L_0x0197
        L_0x0113:
            r0 = move-exception
            goto L_0x012d
        L_0x0115:
            r0 = move-exception
            r17 = r7
            goto L_0x012d
        L_0x0119:
            r17 = r7
        L_0x011b:
            b.l.a.c.i.b.l4 r0 = r9.a     // Catch:{ all -> 0x0113 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0113 }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = "Failed to load event from local database"
            r0.a(r7)     // Catch:{ all -> 0x0113 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            goto L_0x01ba
        L_0x012d:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
        L_0x0131:
            r17 = r7
            r7 = 1
            if (r0 != r7) goto L_0x0168
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            int r0 = r10.length     // Catch:{ b -> 0x0150 }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ b -> 0x0150 }
            r7.setDataPosition(r14)     // Catch:{ b -> 0x0150 }
            android.os.Parcelable$Creator<b.l.a.c.i.b.g9> r0 = b.l.a.c.i.b.g9.CREATOR     // Catch:{ b -> 0x0150 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ b -> 0x0150 }
            b.l.a.c.i.b.g9 r0 = (b.l.a.c.i.b.g9) r0     // Catch:{ b -> 0x0150 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            goto L_0x0161
        L_0x014e:
            r0 = move-exception
            goto L_0x0164
        L_0x0150:
            b.l.a.c.i.b.l4 r0 = r9.a     // Catch:{ all -> 0x014e }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x014e }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ all -> 0x014e }
            java.lang.String r10 = "Failed to load user property from local database"
            r0.a(r10)     // Catch:{ all -> 0x014e }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            r0 = 0
        L_0x0161:
            if (r0 == 0) goto L_0x01ba
            goto L_0x0197
        L_0x0164:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
        L_0x0168:
            if (r0 != r14) goto L_0x019f
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            int r0 = r10.length     // Catch:{ b -> 0x0184 }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ b -> 0x0184 }
            r7.setDataPosition(r14)     // Catch:{ b -> 0x0184 }
            android.os.Parcelable$Creator<b.l.a.c.i.b.b> r0 = b.l.a.c.i.b.b.CREATOR     // Catch:{ b -> 0x0184 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ b -> 0x0184 }
            b.l.a.c.i.b.b r0 = (b.l.a.c.i.b.b) r0     // Catch:{ b -> 0x0184 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            goto L_0x0195
        L_0x0182:
            r0 = move-exception
            goto L_0x019b
        L_0x0184:
            b.l.a.c.i.b.l4 r0 = r9.a     // Catch:{ all -> 0x0182 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0182 }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ all -> 0x0182 }
            java.lang.String r10 = "Failed to load conditional user property from local database"
            r0.a(r10)     // Catch:{ all -> 0x0182 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            r0 = 0
        L_0x0195:
            if (r0 == 0) goto L_0x01ba
        L_0x0197:
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            goto L_0x01ba
        L_0x019b:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            throw r0     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
        L_0x019f:
            r7 = 3
            if (r0 != r7) goto L_0x01ad
            b.l.a.c.i.b.l4 r0 = r9.a     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            b.l.a.c.i.b.i3 r0 = r0.f4091i     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            java.lang.String r7 = "Skipping app launch break"
            goto L_0x01b7
        L_0x01ad:
            b.l.a.c.i.b.l4 r0 = r9.a     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            java.lang.String r7 = "Unknown record type in local database"
        L_0x01b7:
            r0.a(r7)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
        L_0x01ba:
            r10 = r16
            r7 = r17
            goto L_0x00dd
        L_0x01c0:
            r0 = move-exception
            r17 = r7
            goto L_0x01cb
        L_0x01c4:
            r17 = r7
            goto L_0x021c
        L_0x01c7:
            r0 = move-exception
            r17 = r7
            goto L_0x01ce
        L_0x01cb:
            r10 = 0
            goto L_0x0269
        L_0x01ce:
            r10 = 0
            goto L_0x025a
        L_0x01d1:
            r17 = r7
            r16 = r10
            r7 = 1
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            java.lang.String r7 = java.lang.Long.toString(r25)     // Catch:{ SQLiteFullException -> 0x0210, SQLiteDatabaseLockedException -> 0x021c, SQLiteException -> 0x020e }
            r10 = 0
            r0[r10] = r7     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            java.lang.String r7 = "messages"
            java.lang.String r14 = "rowid <= ?"
            int r0 = r5.delete(r7, r14, r0)     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            int r7 = r13.size()     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            if (r0 >= r7) goto L_0x01fa
            b.l.a.c.i.b.l4 r0 = r9.a     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            java.lang.String r7 = "Fewer entries removed from local database than expected"
            r0.a(r7)     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
        L_0x01fa:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x020b, SQLiteDatabaseLockedException -> 0x0251, SQLiteException -> 0x0208 }
            r6.close()
            r5.close()
            goto L_0x02ee
        L_0x0208:
            r0 = move-exception
            goto L_0x0269
        L_0x020b:
            r0 = move-exception
            goto L_0x025a
        L_0x020e:
            r0 = move-exception
            goto L_0x01cb
        L_0x0210:
            r0 = move-exception
            goto L_0x01ce
        L_0x0212:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01cb
        L_0x0218:
            r17 = r7
            r16 = r10
        L_0x021c:
            r10 = 0
            goto L_0x0251
        L_0x021e:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01ce
        L_0x0224:
            r0 = move-exception
            goto L_0x00a8
        L_0x0227:
            r0 = move-exception
            goto L_0x00b6
        L_0x022a:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            goto L_0x0238
        L_0x0231:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            r14 = 0
        L_0x0238:
            if (r14 == 0) goto L_0x023d
            r14.close()     // Catch:{ SQLiteFullException -> 0x0240, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023e, all -> 0x0242 }
        L_0x023d:
            throw r0     // Catch:{ SQLiteFullException -> 0x0240, SQLiteDatabaseLockedException -> 0x0250, SQLiteException -> 0x023e, all -> 0x0242 }
        L_0x023e:
            r0 = move-exception
            goto L_0x0268
        L_0x0240:
            r0 = move-exception
            goto L_0x0259
        L_0x0242:
            r0 = move-exception
            goto L_0x025e
        L_0x0244:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            goto L_0x0268
        L_0x024b:
            r17 = r7
            r16 = r10
            r10 = r6
        L_0x0250:
            r6 = 0
        L_0x0251:
            r7 = r11
            goto L_0x0293
        L_0x0253:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
        L_0x0259:
            r6 = 0
        L_0x025a:
            r7 = r11
            goto L_0x02a9
        L_0x025c:
            r0 = move-exception
            r5 = 0
        L_0x025e:
            r12 = 0
            goto L_0x02d0
        L_0x0261:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            r5 = 0
        L_0x0268:
            r6 = 0
        L_0x0269:
            if (r5 == 0) goto L_0x0274
            boolean r7 = r5.inTransaction()     // Catch:{ all -> 0x02ce }
            if (r7 == 0) goto L_0x0274
            r5.endTransaction()     // Catch:{ all -> 0x02ce }
        L_0x0274:
            b.l.a.c.i.b.l4 r7 = r9.a     // Catch:{ all -> 0x02ce }
            b.l.a.c.i.b.k3 r7 = r7.a()     // Catch:{ all -> 0x02ce }
            b.l.a.c.i.b.i3 r7 = r7.f     // Catch:{ all -> 0x02ce }
            r7.b(r11, r0)     // Catch:{ all -> 0x02ce }
            r7 = 1
            r9.d = r7     // Catch:{ all -> 0x02ce }
            if (r6 == 0) goto L_0x0287
            r6.close()
        L_0x0287:
            r7 = r11
            if (r5 == 0) goto L_0x02c1
            goto L_0x02be
        L_0x028b:
            r17 = r7
            r16 = r10
            r10 = r6
            r7 = r11
            r5 = 0
            r6 = 0
        L_0x0293:
            long r10 = (long) r12
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x02ce }
            int r12 = r12 + 20
            if (r6 == 0) goto L_0x029e
            r6.close()
        L_0x029e:
            if (r5 == 0) goto L_0x02c1
            goto L_0x02be
        L_0x02a1:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r7 = r11
            r5 = 0
            r6 = 0
        L_0x02a9:
            b.l.a.c.i.b.l4 r10 = r9.a     // Catch:{ all -> 0x02ce }
            b.l.a.c.i.b.k3 r10 = r10.a()     // Catch:{ all -> 0x02ce }
            b.l.a.c.i.b.i3 r10 = r10.f     // Catch:{ all -> 0x02ce }
            r10.b(r7, r0)     // Catch:{ all -> 0x02ce }
            r10 = 1
            r9.d = r10     // Catch:{ all -> 0x02ce }
            if (r6 == 0) goto L_0x02bc
            r6.close()
        L_0x02bc:
            if (r5 == 0) goto L_0x02c1
        L_0x02be:
            r5.close()
        L_0x02c1:
            int r15 = r15 + 1
            r11 = r7
            r10 = r16
            r7 = r17
            r5 = 100
            r6 = 0
            r14 = 5
            goto L_0x004f
        L_0x02ce:
            r0 = move-exception
            r12 = r6
        L_0x02d0:
            if (r12 == 0) goto L_0x02d5
            r12.close()
        L_0x02d5:
            if (r5 == 0) goto L_0x02da
            r5.close()
        L_0x02da:
            throw r0
        L_0x02db:
            r17 = r7
            b.l.a.c.i.b.l4 r0 = r9.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4091i
            java.lang.String r5 = "Failed to read events from database in reasonable time"
            r0.a(r5)
        L_0x02ea:
            r12 = 0
            goto L_0x02ef
        L_0x02ec:
            r17 = r7
        L_0x02ee:
            r12 = r13
        L_0x02ef:
            if (r12 == 0) goto L_0x02fa
            r8.addAll(r12)
            int r0 = r12.size()
            r5 = r0
            goto L_0x02fb
        L_0x02fa:
            r5 = 0
        L_0x02fb:
            r6 = 100
            if (r3 == 0) goto L_0x0304
            if (r5 >= r6) goto L_0x0304
            r8.add(r3)
        L_0x0304:
            int r7 = r8.size()
            r9 = 0
        L_0x0309:
            if (r9 >= r7) goto L_0x0366
            java.lang.Object r0 = r8.get(r9)
            b.l.a.c.c.m.v.a r0 = (b.l.a.c.c.m.v.a) r0
            boolean r10 = r0 instanceof b.l.a.c.i.b.s
            if (r10 == 0) goto L_0x0327
            b.l.a.c.i.b.s r0 = (b.l.a.c.i.b.s) r0     // Catch:{ RemoteException -> 0x031b }
            r2.Y0(r0, r4)     // Catch:{ RemoteException -> 0x031b }
            goto L_0x0363
        L_0x031b:
            r0 = move-exception
            b.l.a.c.i.b.l4 r10 = r1.a
            b.l.a.c.i.b.k3 r10 = r10.a()
            b.l.a.c.i.b.i3 r10 = r10.f
            java.lang.String r11 = "Failed to send event to the service"
            goto L_0x0352
        L_0x0327:
            boolean r10 = r0 instanceof b.l.a.c.i.b.g9
            if (r10 == 0) goto L_0x033d
            b.l.a.c.i.b.g9 r0 = (b.l.a.c.i.b.g9) r0     // Catch:{ RemoteException -> 0x0331 }
            r2.S(r0, r4)     // Catch:{ RemoteException -> 0x0331 }
            goto L_0x0363
        L_0x0331:
            r0 = move-exception
            b.l.a.c.i.b.l4 r10 = r1.a
            b.l.a.c.i.b.k3 r10 = r10.a()
            b.l.a.c.i.b.i3 r10 = r10.f
            java.lang.String r11 = "Failed to send user property to the service"
            goto L_0x0352
        L_0x033d:
            boolean r10 = r0 instanceof b.l.a.c.i.b.b
            if (r10 == 0) goto L_0x0356
            b.l.a.c.i.b.b r0 = (b.l.a.c.i.b.b) r0     // Catch:{ RemoteException -> 0x0347 }
            r2.C0(r0, r4)     // Catch:{ RemoteException -> 0x0347 }
            goto L_0x0363
        L_0x0347:
            r0 = move-exception
            b.l.a.c.i.b.l4 r10 = r1.a
            b.l.a.c.i.b.k3 r10 = r10.a()
            b.l.a.c.i.b.i3 r10 = r10.f
            java.lang.String r11 = "Failed to send conditional user property to the service"
        L_0x0352:
            r10.b(r11, r0)
            goto L_0x0363
        L_0x0356:
            b.l.a.c.i.b.l4 r0 = r1.a
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f
            java.lang.String r10 = "Discarding data. Unrecognized parcel type."
            r0.a(r10)
        L_0x0363:
            int r9 = r9 + 1
            goto L_0x0309
        L_0x0366:
            int r7 = r17 + 1
            r0 = r5
            r5 = r6
            r6 = 0
            goto L_0x001a
        L_0x036d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.b8.x(b.l.a.c.i.b.a3, b.l.a.c.c.m.v.a, b.l.a.c.i.b.p9):void");
    }

    @WorkerThread
    public final void y(b bVar) {
        boolean z;
        h();
        i();
        l4 l4Var = this.a;
        y9 y9Var = l4Var.f;
        e3 v = l4Var.v();
        byte[] L = v.a.t().L(bVar);
        if (L.length > 131072) {
            v.a.a().f4089g.a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = v.o(2, L);
        }
        b bVar2 = new b(bVar);
        t(new q7(this, v(true), z, bVar2, bVar));
    }

    @WorkerThread
    public final void z(AtomicReference<String> atomicReference) {
        h();
        i();
        t(new f7(this, atomicReference, v(false)));
    }
}
