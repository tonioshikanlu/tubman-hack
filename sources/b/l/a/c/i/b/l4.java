package b.l.a.c.i.b;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import b.l.a.c.b.a;
import b.l.a.c.c.p.b;
import b.l.a.c.c.p.c;
import b.l.a.c.f.i.c3;
import b.l.a.c.f.i.g3;
import b.l.a.c.f.i.n3;
import b.l.a.c.f.i.o3;
import b.l.a.c.f.i.p3;
import b.l.a.c.f.i.t8;
import b.l.a.c.f.i.u2;
import b.l.a.c.f.i.x2;
import b.l.a.c.f.i.zb;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;

public final class l4 implements h5 {
    public static volatile l4 I;
    public long A;
    public volatile Boolean B;
    public Boolean C;
    public Boolean D;
    public volatile boolean E;
    public int F;
    public final AtomicInteger G = new AtomicInteger(0);
    public final long H;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4112b;
    public final String c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4113e;
    public final y9 f;

    /* renamed from: g  reason: collision with root package name */
    public final f f4114g;

    /* renamed from: h  reason: collision with root package name */
    public final x3 f4115h;

    /* renamed from: i  reason: collision with root package name */
    public final k3 f4116i;

    /* renamed from: j  reason: collision with root package name */
    public final i4 f4117j;

    /* renamed from: k  reason: collision with root package name */
    public final q8 f4118k;

    /* renamed from: l  reason: collision with root package name */
    public final k9 f4119l;

    /* renamed from: m  reason: collision with root package name */
    public final f3 f4120m;

    /* renamed from: n  reason: collision with root package name */
    public final b f4121n;

    /* renamed from: o  reason: collision with root package name */
    public final b7 f4122o;

    /* renamed from: p  reason: collision with root package name */
    public final m6 f4123p;

    /* renamed from: q  reason: collision with root package name */
    public final c2 f4124q;
    public final q6 r;
    public final String s;
    public e3 t;
    public b8 u;
    public m v;
    public c3 w;
    public b4 x;
    public boolean y = false;
    public Boolean z;

    public l4(m5 m5Var) {
        long j2;
        String str;
        i3 i3Var;
        Context context;
        Bundle bundle;
        boolean z2 = false;
        Context context2 = m5Var.a;
        y9 y9Var = new y9();
        this.f = y9Var;
        a.f2580h = y9Var;
        this.a = context2;
        this.f4112b = m5Var.f4142b;
        this.c = m5Var.c;
        this.d = m5Var.d;
        this.f4113e = m5Var.f4145h;
        this.B = m5Var.f4143e;
        this.s = m5Var.f4147j;
        this.E = true;
        zb zbVar = m5Var.f4144g;
        if (!(zbVar == null || (bundle = zbVar.f3851n) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.C = (Boolean) obj;
            }
            Object obj2 = zbVar.f3851n.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.D = (Boolean) obj2;
            }
        }
        synchronized (o3.f) {
            n3 n3Var = o3.f3671g;
            Context applicationContext = context2.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context2;
            }
            if (n3Var == null || n3Var.a() != applicationContext) {
                x2.c();
                p3.a();
                synchronized (c3.class) {
                    c3 c3Var = c3.c;
                    if (!(c3Var == null || (context = c3Var.a) == null || c3Var.f3507b == null)) {
                        context.getContentResolver().unregisterContentObserver(c3.c.f3507b);
                    }
                    c3.c = null;
                }
                o3.f3671g = new u2(applicationContext, a.W0(new g3(applicationContext)));
                o3.f3672h.incrementAndGet();
            }
        }
        this.f4121n = c.a;
        Long l2 = m5Var.f4146i;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = System.currentTimeMillis();
        }
        this.H = j2;
        this.f4114g = new f(this);
        x3 x3Var = new x3(this);
        x3Var.m();
        this.f4115h = x3Var;
        k3 k3Var = new k3(this);
        k3Var.m();
        this.f4116i = k3Var;
        k9 k9Var = new k9(this);
        k9Var.m();
        this.f4119l = k9Var;
        f3 f3Var = new f3(this);
        f3Var.m();
        this.f4120m = f3Var;
        this.f4124q = new c2(this);
        b7 b7Var = new b7(this);
        b7Var.j();
        this.f4122o = b7Var;
        m6 m6Var = new m6(this);
        m6Var.j();
        this.f4123p = m6Var;
        q8 q8Var = new q8(this);
        q8Var.j();
        this.f4118k = q8Var;
        q6 q6Var = new q6(this);
        q6Var.m();
        this.r = q6Var;
        i4 i4Var = new i4(this);
        i4Var.m();
        this.f4117j = i4Var;
        zb zbVar2 = m5Var.f4144g;
        z2 = (zbVar2 == null || zbVar2.f3846i == 0) ? true : z2;
        if (context2.getApplicationContext() instanceof Application) {
            m6 s2 = s();
            if (s2.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) s2.a.a.getApplicationContext();
                if (s2.c == null) {
                    s2.c = new l6(s2);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(s2.c);
                    application.registerActivityLifecycleCallbacks(s2.c);
                    i3Var = s2.a.a().f4096n;
                    str = "Registered activity lifecycle callback";
                }
            }
            i4Var.q(new k4(this, m5Var));
        }
        i3Var = a().f4091i;
        str = "Application context is not an Application";
        i3Var.a(str);
        i4Var.q(new k4(this, m5Var));
    }

    public static l4 h(Context context, zb zbVar, Long l2) {
        Bundle bundle;
        if (zbVar != null && (zbVar.f3849l == null || zbVar.f3850m == null)) {
            zbVar = new zb(zbVar.f3845h, zbVar.f3846i, zbVar.f3847j, zbVar.f3848k, (String) null, (String) null, zbVar.f3851n, (String) null);
        }
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (I == null) {
            synchronized (l4.class) {
                if (I == null) {
                    I = new l4(new m5(context, zbVar, l2));
                }
            }
        } else if (!(zbVar == null || (bundle = zbVar.f3851n) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            Objects.requireNonNull(I, "null reference");
            I.B = Boolean.valueOf(zbVar.f3851n.getBoolean("dataCollectionDefaultEnabled"));
        }
        Objects.requireNonNull(I, "null reference");
        return I;
    }

    public static final void m(f5 f5Var) {
        if (f5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void n(a4 a4Var) {
        if (a4Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!a4Var.f3887b) {
            String valueOf = String.valueOf(a4Var.getClass());
            throw new IllegalStateException(b.e.a.a.a.q(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    public static final void o(g5 g5Var) {
        if (g5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!g5Var.k()) {
            String valueOf = String.valueOf(g5Var.getClass());
            throw new IllegalStateException(b.e.a.a.a.q(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    @Pure
    public final m A() {
        o(this.v);
        return this.v;
    }

    @Pure
    public final k3 a() {
        o(this.f4116i);
        return this.f4116i;
    }

    @Pure
    public final c3 b() {
        n(this.w);
        return this.w;
    }

    @Pure
    public final b c() {
        return this.f4121n;
    }

    @Pure
    public final i4 d() {
        o(this.f4117j);
        return this.f4117j;
    }

    @Pure
    public final y9 e() {
        return this.f;
    }

    @Pure
    public final Context f() {
        return this.a;
    }

    @Pure
    public final c2 g() {
        c2 c2Var = this.f4124q;
        if (c2Var != null) {
            return c2Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @WorkerThread
    public final boolean i() {
        return this.B != null && this.B.booleanValue();
    }

    @WorkerThread
    public final boolean j() {
        return k() == 0;
    }

    @WorkerThread
    public final int k() {
        d().h();
        if (this.f4114g.u()) {
            return 1;
        }
        Boolean bool = this.D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        t8.b();
        if (this.f4114g.r((String) null, x2.w0)) {
            d().h();
            if (!this.E) {
                return 8;
            }
        }
        Boolean q2 = q().q();
        if (q2 != null) {
            return q2.booleanValue() ? 0 : 3;
        }
        f fVar = this.f4114g;
        y9 y9Var = fVar.a.f;
        Boolean t2 = fVar.t("firebase_analytics_collection_enabled");
        if (t2 != null) {
            return t2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (!this.f4114g.r((String) null, x2.T) || this.B == null || this.B.booleanValue()) ? 0 : 7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r8.A) > 1000) goto L_0x0035;
     */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l() {
        /*
            r8 = this;
            boolean r0 = r8.y
            if (r0 == 0) goto L_0x00d8
            b.l.a.c.i.b.i4 r0 = r8.d()
            r0.h()
            java.lang.Boolean r0 = r8.z
            if (r0 == 0) goto L_0x0035
            long r1 = r8.A
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0035
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00d1
            b.l.a.c.c.p.b r0 = r8.f4121n
            b.l.a.c.c.p.c r0 = (b.l.a.c.c.p.c) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.A
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
        L_0x0035:
            b.l.a.c.c.p.b r0 = r8.f4121n
            b.l.a.c.c.p.c r0 = (b.l.a.c.c.p.c) r0
            java.util.Objects.requireNonNull(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A = r0
            b.l.a.c.i.b.k9 r0 = r8.t()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.E(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0082
            b.l.a.c.i.b.k9 r0 = r8.t()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.E(r3)
            if (r0 == 0) goto L_0x0082
            android.content.Context r0 = r8.a
            b.l.a.c.c.q.a r0 = b.l.a.c.c.q.b.a(r0)
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0080
            b.l.a.c.i.b.f r0 = r8.f4114g
            boolean r0 = r0.z()
            if (r0 != 0) goto L_0x0080
            android.content.Context r0 = r8.a
            boolean r0 = b.l.a.c.i.b.d4.a(r0)
            if (r0 == 0) goto L_0x0082
            android.content.Context r0 = r8.a
            boolean r0 = b.l.a.c.i.b.k9.D(r0)
            if (r0 == 0) goto L_0x0082
        L_0x0080:
            r0 = r1
            goto L_0x0083
        L_0x0082:
            r0 = r2
        L_0x0083:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.z = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d1
            b.l.a.c.i.b.k9 r0 = r8.t()
            b.l.a.c.i.b.c3 r3 = r8.b()
            java.lang.String r3 = r3.n()
            b.l.a.c.i.b.c3 r4 = r8.b()
            r4.i()
            java.lang.String r4 = r4.f3943l
            b.l.a.c.i.b.c3 r5 = r8.b()
            r5.i()
            java.lang.String r6 = r5.f3944m
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r6, r7)
            java.lang.String r5 = r5.f3944m
            boolean r0 = r0.o(r3, r4, r5)
            if (r0 != 0) goto L_0x00cb
            b.l.a.c.i.b.c3 r0 = r8.b()
            r0.i()
            java.lang.String r0 = r0.f3943l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = r2
        L_0x00cb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.z = r0
        L_0x00d1:
            java.lang.Boolean r0 = r8.z
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00d8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.l4.l():boolean");
    }

    @Pure
    public final f p() {
        return this.f4114g;
    }

    @Pure
    public final x3 q() {
        m(this.f4115h);
        return this.f4115h;
    }

    @Pure
    public final q8 r() {
        n(this.f4118k);
        return this.f4118k;
    }

    @Pure
    public final m6 s() {
        n(this.f4123p);
        return this.f4123p;
    }

    @Pure
    public final k9 t() {
        m(this.f4119l);
        return this.f4119l;
    }

    @Pure
    public final f3 u() {
        m(this.f4120m);
        return this.f4120m;
    }

    @Pure
    public final e3 v() {
        n(this.t);
        return this.t;
    }

    @Pure
    public final q6 w() {
        o(this.r);
        return this.r;
    }

    @Pure
    public final boolean x() {
        return TextUtils.isEmpty(this.f4112b);
    }

    @Pure
    public final b7 y() {
        n(this.f4122o);
        return this.f4122o;
    }

    @Pure
    public final b8 z() {
        n(this.u);
        return this.u;
    }
}
