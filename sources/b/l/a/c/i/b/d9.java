package b.l.a.c.i.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import b.e.a.a.a;
import b.l.a.c.c.p.c;
import b.l.a.c.c.q.b;
import b.l.a.c.f.i.f2;
import b.l.a.c.f.i.g2;
import b.l.a.c.f.i.n1;
import b.l.a.c.f.i.o1;
import b.l.a.c.f.i.r1;
import b.l.a.c.f.i.s1;
import b.l.a.c.f.i.t8;
import b.l.a.c.f.i.v1;
import b.l.a.c.f.i.w1;
import b.l.a.c.f.i.y9;
import b.l.a.c.f.i.zb;
import com.amplitude.api.DatabaseHelper;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class d9 implements h5 {
    public static volatile d9 A;
    public final e4 a;

    /* renamed from: b  reason: collision with root package name */
    public final p3 f3974b;
    public j c;
    public r3 d;

    /* renamed from: e  reason: collision with root package name */
    public t8 f3975e;
    public x9 f;

    /* renamed from: g  reason: collision with root package name */
    public final f9 f3976g;

    /* renamed from: h  reason: collision with root package name */
    public r6 f3977h;

    /* renamed from: i  reason: collision with root package name */
    public c8 f3978i;

    /* renamed from: j  reason: collision with root package name */
    public final l4 f3979j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3980k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3981l;

    /* renamed from: m  reason: collision with root package name */
    public long f3982m;

    /* renamed from: n  reason: collision with root package name */
    public List<Runnable> f3983n;

    /* renamed from: o  reason: collision with root package name */
    public int f3984o;

    /* renamed from: p  reason: collision with root package name */
    public int f3985p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3986q;
    public boolean r;
    public boolean s;
    public FileLock t;
    public FileChannel u;
    public List<Long> v;
    public List<Long> w;
    public long x;
    public final Map<String, g> y;
    public final j9 z = new b9(this);

    public d9(e9 e9Var, l4 l4Var) {
        l4 h2 = l4.h(e9Var.a, (zb) null, (Long) null);
        this.f3979j = h2;
        this.x = -1;
        f9 f9Var = new f9(this);
        f9Var.j();
        this.f3976g = f9Var;
        p3 p3Var = new p3(this);
        p3Var.j();
        this.f3974b = p3Var;
        e4 e4Var = new e4(this);
        e4Var.j();
        this.a = e4Var;
        this.y = new HashMap();
        h2.d().q(new v8(this, e9Var));
    }

    public static final void I(u8 u8Var) {
        if (u8Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!u8Var.c) {
            String valueOf = String.valueOf(u8Var.getClass());
            throw new IllegalStateException(a.q(new StringBuilder(valueOf.length() + 27), "Component not initialized: ", valueOf));
        }
    }

    public static d9 v(Context context) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (A == null) {
            synchronized (d9.class) {
                if (A == null) {
                    A = new d9(new e9(context), (l4) null);
                }
            }
        }
        return A;
    }

    public static final void w(n1 n1Var, int i2, String str) {
        List<s1> m2 = n1Var.m();
        int i3 = 0;
        while (i3 < m2.size()) {
            if (!"_err".equals(m2.get(i3).t())) {
                i3++;
            } else {
                return;
            }
        }
        r1 E = s1.E();
        E.m("_err");
        E.o(Long.valueOf((long) i2).longValue());
        s1 s1Var = (s1) E.g();
        r1 E2 = s1.E();
        E2.m("_ev");
        E2.n(str);
        s1 s1Var2 = (s1) E2.g();
        if (n1Var.f3655j) {
            n1Var.j();
            n1Var.f3655j = false;
        }
        o1.F((o1) n1Var.f3654i, s1Var);
        if (n1Var.f3655j) {
            n1Var.j();
            n1Var.f3655j = false;
        }
        o1.F((o1) n1Var.f3654i, s1Var2);
    }

    public static final void x(n1 n1Var, @NonNull String str) {
        List<s1> m2 = n1Var.m();
        for (int i2 = 0; i2 < m2.size(); i2++) {
            if (str.equals(m2.get(i2).t())) {
                n1Var.r(i2);
                return;
            }
        }
    }

    public final boolean A(n1 n1Var, n1 n1Var2) {
        b.l.a.c.b.a.j("_e".equals(n1Var.s()));
        P();
        s1 L = f9.L((o1) n1Var.g(), "_sc");
        String str = null;
        String v2 = L == null ? null : L.v();
        P();
        s1 L2 = f9.L((o1) n1Var2.g(), "_pc");
        if (L2 != null) {
            str = L2.v();
        }
        if (str == null || !str.equals(v2)) {
            return false;
        }
        B(n1Var, n1Var2);
        return true;
    }

    public final void B(n1 n1Var, n1 n1Var2) {
        b.l.a.c.b.a.j("_e".equals(n1Var.s()));
        P();
        s1 L = f9.L((o1) n1Var.g(), "_et");
        if (L.w() && L.x() > 0) {
            long x2 = L.x();
            P();
            s1 L2 = f9.L((o1) n1Var2.g(), "_et");
            if (L2 != null && L2.x() > 0) {
                x2 += L2.x();
            }
            P();
            f9.J(n1Var2, "_et", Long.valueOf(x2));
            P();
            f9.J(n1Var, "_fr", 1L);
        }
    }

    public final boolean C() {
        this.f3979j.d().h();
        R();
        return ((L().t("select count(1) > 0 from raw_events", (String[]) null) > 0 ? 1 : (L().t("select count(1) > 0 from raw_events", (String[]) null) == 0 ? 0 : -1)) != 0) || !TextUtils.isEmpty(L().P());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0336  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D() {
        /*
            r19 = this;
            r1 = r19
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.i4 r0 = r0.d()
            r0.h()
            r19.R()
            long r2 = r1.f3982m
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.c.p.b r0 = r0.f4121n
            b.l.a.c.c.p.c r0 = (b.l.a.c.c.p.c) r0
            java.util.Objects.requireNonNull(r0)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r1.f3982m
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            long r2 = r2 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r0.b(r3, r2)
            goto L_0x03c5
        L_0x0045:
            r1.f3982m = r4
        L_0x0047:
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x03b8
            boolean r0 = r19.C()
            if (r0 != 0) goto L_0x0057
            goto L_0x03b8
        L_0x0057:
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.c.p.b r0 = r0.f4121n
            b.l.a.c.c.p.c r0 = (b.l.a.c.c.p.c) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = java.lang.System.currentTimeMillis()
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.f r0 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r0 = b.l.a.c.i.b.x2.A
            r6 = 0
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r7 = r0.longValue()
            long r7 = java.lang.Math.max(r4, r7)
            b.l.a.c.i.b.j r0 = r19.L()
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r9 = r0.t(r9, r6)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0089
            r0 = 1
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            if (r0 != 0) goto L_0x00a2
            b.l.a.c.i.b.j r0 = r19.L()
            java.lang.String r11 = "select count(1) > 0 from queue where has_realtime = 1"
            long r11 = r0.t(r11, r6)
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x009c
            r0 = 1
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r0 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r0 = 0
            goto L_0x00a3
        L_0x00a2:
            r0 = 1
        L_0x00a3:
            b.l.a.c.i.b.l4 r11 = r1.f3979j
            if (r0 == 0) goto L_0x00cd
            b.l.a.c.i.b.f r11 = r11.f4114g
            java.lang.String r12 = "debug.firebase.analytics.app"
            java.lang.String r13 = ""
            java.lang.String r11 = r11.j(r12, r13)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x00c6
            java.lang.String r12 = ".none."
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x00c6
            b.l.a.c.i.b.l4 r11 = r1.f3979j
            b.l.a.c.i.b.f r11 = r11.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r11 = b.l.a.c.i.b.x2.v
            goto L_0x00d1
        L_0x00c6:
            b.l.a.c.i.b.l4 r11 = r1.f3979j
            b.l.a.c.i.b.f r11 = r11.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r11 = b.l.a.c.i.b.x2.u
            goto L_0x00d1
        L_0x00cd:
            b.l.a.c.i.b.f r11 = r11.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r11 = b.l.a.c.i.b.x2.t
        L_0x00d1:
            java.lang.Object r11 = r11.a(r6)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r4, r11)
            b.l.a.c.i.b.l4 r13 = r1.f3979j
            b.l.a.c.i.b.x3 r13 = r13.q()
            b.l.a.c.i.b.u3 r13 = r13.f4353e
            long r13 = r13.a()
            b.l.a.c.i.b.l4 r15 = r1.f3979j
            b.l.a.c.i.b.x3 r15 = r15.q()
            b.l.a.c.i.b.u3 r15 = r15.f
            long r15 = r15.a()
            b.l.a.c.i.b.j r9 = r19.L()
            java.lang.String r10 = "select max(bundle_end_timestamp) from queue"
            long r9 = r9.u(r10, r6, r4)
            b.l.a.c.i.b.j r1 = r19.L()
            r17 = r11
            java.lang.String r11 = "select max(timestamp) from raw_events"
            long r11 = r1.u(r11, r6, r4)
            long r9 = java.lang.Math.max(r9, r11)
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0119
            r1 = r19
            goto L_0x0194
        L_0x0119:
            long r9 = r9 - r2
            long r9 = java.lang.Math.abs(r9)
            long r9 = r2 - r9
            long r13 = r13 - r2
            long r11 = java.lang.Math.abs(r13)
            long r15 = r15 - r2
            long r13 = java.lang.Math.abs(r15)
            long r13 = r2 - r13
            long r2 = r2 - r11
            long r1 = java.lang.Math.max(r2, r13)
            long r7 = r7 + r9
            if (r0 == 0) goto L_0x013e
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x013e
            long r7 = java.lang.Math.min(r9, r1)
            long r7 = r7 + r17
        L_0x013e:
            b.l.a.c.i.b.f9 r0 = r19.P()
            r11 = r17
            boolean r0 = r0.D(r1, r11)
            if (r0 != 0) goto L_0x014c
            long r7 = r1 + r11
        L_0x014c:
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0196
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0196
            r0 = 0
            r1 = r19
        L_0x0157:
            b.l.a.c.i.b.l4 r2 = r1.f3979j
            b.l.a.c.i.b.f r2 = r2.f4114g
            r2 = 20
            b.l.a.c.i.b.w2<java.lang.Integer> r3 = b.l.a.c.i.b.x2.C
            java.lang.Object r3 = r3.a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r9 = 0
            int r3 = java.lang.Math.max(r9, r3)
            int r2 = java.lang.Math.min(r2, r3)
            if (r0 >= r2) goto L_0x0194
            b.l.a.c.i.b.l4 r2 = r1.f3979j
            b.l.a.c.i.b.f r2 = r2.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r2 = b.l.a.c.i.b.x2.B
            java.lang.Object r2 = r2.a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r2 = java.lang.Math.max(r4, r2)
            r9 = 1
            long r9 = r9 << r0
            long r2 = r2 * r9
            long r7 = r7 + r2
            int r2 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0198
            int r0 = r0 + 1
            goto L_0x0157
        L_0x0194:
            r7 = r4
            goto L_0x0198
        L_0x0196:
            r1 = r19
        L_0x0198:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01a8
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.String r2 = "Next upload time is 0"
            goto L_0x03c2
        L_0x01a8:
            b.l.a.c.i.b.p3 r0 = r19.K()
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0361
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.x3 r0 = r0.q()
            b.l.a.c.i.b.u3 r0 = r0.f4354g
            long r2 = r0.a()
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.f r0 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r0 = b.l.a.c.i.b.x2.r
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r9 = r0.longValue()
            long r9 = java.lang.Math.max(r4, r9)
            b.l.a.c.i.b.f9 r0 = r19.P()
            boolean r0 = r0.D(r2, r9)
            if (r0 != 0) goto L_0x01e1
            long r2 = r2 + r9
            long r7 = java.lang.Math.max(r7, r2)
        L_0x01e1:
            b.l.a.c.i.b.r3 r0 = r19.M()
            r0.a()
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.c.p.b r0 = r0.f4121n
            b.l.a.c.c.p.c r0 = (b.l.a.c.c.p.c) r0
            java.util.Objects.requireNonNull(r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0226
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.f r0 = r0.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r0 = b.l.a.c.i.b.x2.w
            java.lang.Object r0 = r0.a(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r7 = java.lang.Math.max(r4, r2)
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.x3 r0 = r0.q()
            b.l.a.c.i.b.u3 r0 = r0.f4353e
            b.l.a.c.i.b.l4 r2 = r1.f3979j
            b.l.a.c.c.p.b r2 = r2.f4121n
            b.l.a.c.c.p.c r2 = (b.l.a.c.c.p.c) r2
            java.util.Objects.requireNonNull(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0.b(r2)
        L_0x0226:
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r0.b(r3, r2)
            b.l.a.c.i.b.t8 r0 = r19.N()
            r0.i()
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.y9 r3 = r2.f
            android.content.Context r2 = r2.a
            boolean r3 = b.l.a.c.i.b.d4.a(r2)
            if (r3 != 0) goto L_0x0257
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f4095m
            java.lang.String r9 = "Receiver not registered/enabled"
            r3.a(r9)
        L_0x0257:
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementJobService"
            boolean r2 = b.l.a.c.i.b.k9.a0(r2, r3)
            if (r2 != 0) goto L_0x026c
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4095m
            java.lang.String r9 = "Service not registered/enabled"
            r2.a(r9)
        L_0x026c:
            r0.l()
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4096n
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            java.lang.String r10 = "Scheduling upload, millis"
            r2.b(r10, r9)
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.c.p.b r2 = r2.f4121n
            b.l.a.c.c.p.c r2 = (b.l.a.c.c.p.c) r2
            java.util.Objects.requireNonNull(r2)
            android.os.SystemClock.elapsedRealtime()
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.f r2 = r2.f4114g
            b.l.a.c.i.b.w2<java.lang.Long> r2 = b.l.a.c.i.b.x2.x
            java.lang.Object r2 = r2.a(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r9 = r2.longValue()
            long r9 = java.lang.Math.max(r4, r9)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x02ba
            b.l.a.c.i.b.l r2 = r0.m()
            long r9 = r2.c
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x02b0
            r2 = 1
            goto L_0x02b1
        L_0x02b0:
            r2 = 0
        L_0x02b1:
            if (r2 != 0) goto L_0x02ba
            b.l.a.c.i.b.l r2 = r0.m()
            r2.b(r7)
        L_0x02ba:
            b.l.a.c.i.b.l4 r2 = r0.a
            b.l.a.c.i.b.y9 r4 = r2.f
            android.content.Context r2 = r2.a
            android.content.ComponentName r4 = new android.content.ComponentName
            r4.<init>(r2, r3)
            int r0 = r0.o()
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            java.lang.String r5 = "action"
            java.lang.String r6 = "com.google.android.gms.measurement.UPLOAD"
            r3.putString(r5, r6)
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            r5.<init>(r0, r4)
            android.app.job.JobInfo$Builder r0 = r5.setMinimumLatency(r7)
            long r7 = r7 + r7
            android.app.job.JobInfo$Builder r0 = r0.setOverrideDeadline(r7)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r3)
            android.app.job.JobInfo r3 = r0.build()
            java.lang.reflect.Method r0 = b.l.a.c.f.i.e4.a
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r2.getSystemService(r0)
            r4 = r0
            android.app.job.JobScheduler r4 = (android.app.job.JobScheduler) r4
            java.util.Objects.requireNonNull(r4)
            java.lang.reflect.Method r0 = b.l.a.c.f.i.e4.a
            if (r0 == 0) goto L_0x035d
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = r2.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x0306
            goto L_0x035d
        L_0x0306:
            java.lang.reflect.Method r0 = b.l.a.c.f.i.e4.f3527b
            if (r0 == 0) goto L_0x032d
            java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x031e, InvocationTargetException -> 0x031c }
            java.lang.Object r0 = r0.invoke(r2, r6)     // Catch:{ IllegalAccessException -> 0x031e, InvocationTargetException -> 0x031c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x031e, InvocationTargetException -> 0x031c }
            if (r0 == 0) goto L_0x032d
            int r9 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x031e, InvocationTargetException -> 0x031c }
            goto L_0x032e
        L_0x031c:
            r0 = move-exception
            goto L_0x031f
        L_0x031e:
            r0 = move-exception
        L_0x031f:
            r2 = 6
            java.lang.String r5 = "JobSchedulerCompat"
            boolean r2 = android.util.Log.isLoggable(r5, r2)
            if (r2 == 0) goto L_0x032d
            java.lang.String r2 = "myUserId invocation illegal"
            android.util.Log.e(r5, r2, r0)
        L_0x032d:
            r9 = 0
        L_0x032e:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = "UploadAlarm"
            java.lang.reflect.Method r5 = b.l.a.c.f.i.e4.a
            if (r5 == 0) goto L_0x035d
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            r7 = 0
            r6[r7] = r3     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            r7 = 1
            r6[r7] = r0     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            r0 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            r6[r0] = r7     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            r0 = 3
            r6[r0] = r2     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            java.lang.Object r0 = r5.invoke(r4, r6)     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            if (r0 == 0) goto L_0x0360
            r0.intValue()     // Catch:{ IllegalAccessException -> 0x0357, InvocationTargetException -> 0x0355 }
            goto L_0x0360
        L_0x0355:
            r0 = move-exception
            goto L_0x0358
        L_0x0357:
            r0 = move-exception
        L_0x0358:
            java.lang.String r5 = "error calling scheduleAsPackage"
            android.util.Log.e(r2, r5, r0)
        L_0x035d:
            r4.schedule(r3)
        L_0x0360:
            return
        L_0x0361:
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.String r2 = "No network"
            r0.a(r2)
            b.l.a.c.i.b.r3 r0 = r19.M()
            b.l.a.c.i.b.d9 r2 = r0.a
            r2.R()
            b.l.a.c.i.b.d9 r2 = r0.a
            b.l.a.c.i.b.i4 r2 = r2.d()
            r2.h()
            boolean r2 = r0.f4238b
            if (r2 == 0) goto L_0x0385
            goto L_0x03cc
        L_0x0385:
            b.l.a.c.i.b.d9 r2 = r0.a
            b.l.a.c.i.b.l4 r2 = r2.f3979j
            android.content.Context r2 = r2.a
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)
            r2.registerReceiver(r0, r3)
            b.l.a.c.i.b.d9 r2 = r0.a
            b.l.a.c.i.b.p3 r2 = r2.K()
            boolean r2 = r2.l()
            r0.c = r2
            b.l.a.c.i.b.d9 r2 = r0.a
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4096n
            boolean r3 = r0.c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.b(r4, r3)
            r2 = 1
            r0.f4238b = r2
            goto L_0x03cc
        L_0x03b8:
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.String r2 = "Nothing to upload or uploading impossible"
        L_0x03c2:
            r0.a(r2)
        L_0x03c5:
            b.l.a.c.i.b.r3 r0 = r19.M()
            r0.a()
        L_0x03cc:
            b.l.a.c.i.b.t8 r0 = r19.N()
            r0.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.D():void");
    }

    @WorkerThread
    public final void E() {
        this.f3979j.d().h();
        if (this.f3986q || this.r || this.s) {
            this.f3979j.a().f4096n.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f3986q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
            return;
        }
        this.f3979j.a().f4096n.a("Stopping uploading service(s)");
        List<Runnable> list = this.f3983n;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f3983n.clear();
        }
    }

    @WorkerThread
    public final Boolean F(a5 a5Var) {
        Boolean bool = Boolean.TRUE;
        try {
            if (a5Var.R() != -2147483648L) {
                if (a5Var.R() == ((long) b.a(this.f3979j.a).b(a5Var.y(), 0).versionCode)) {
                    return bool;
                }
            } else {
                String str = b.a(this.f3979j.a).b(a5Var.y(), 0).versionName;
                if (a5Var.P() != null && a5Var.P().equals(str)) {
                    return bool;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    public final p9 G(String str) {
        i3 i3Var;
        String str2;
        Object obj;
        String str3 = str;
        a5 L = L().L(str3);
        if (L == null || TextUtils.isEmpty(L.P())) {
            i3Var = this.f3979j.a().f4095m;
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean F = F(L);
            if (F == null || F.booleanValue()) {
                String B = L.B();
                String P = L.P();
                long R = L.R();
                String T = L.T();
                long V = L.V();
                long b2 = L.b();
                boolean f2 = L.f();
                String J = L.J();
                long q2 = L.q();
                boolean s2 = L.s();
                String D = L.D();
                Boolean u2 = L.u();
                long d2 = L.d();
                List<String> w2 = L.w();
                y9.b();
                String F2 = this.f3979j.f4114g.r(str3, x2.i0) ? L.F() : null;
                t8.b();
                return new p9(str, B, P, R, T, V, b2, (String) null, f2, false, J, q2, 0, 0, s2, false, D, u2, d2, w2, F2, this.f3979j.f4114g.r((String) null, x2.y0) ? T(str).c() : "");
            }
            i3Var = this.f3979j.a().f;
            str2 = "App version does not match; dropping. appId";
            obj = k3.t(str);
        }
        i3Var.b(str2, obj);
        return null;
    }

    public final boolean H(p9 p9Var) {
        y9.b();
        return this.f3979j.f4114g.r(p9Var.f4218h, x2.i0) ? !TextUtils.isEmpty(p9Var.f4219i) || !TextUtils.isEmpty(p9Var.B) || !TextUtils.isEmpty(p9Var.x) : !TextUtils.isEmpty(p9Var.f4219i) || !TextUtils.isEmpty(p9Var.x);
    }

    public final e4 J() {
        I(this.a);
        return this.a;
    }

    public final p3 K() {
        I(this.f3974b);
        return this.f3974b;
    }

    public final j L() {
        I(this.c);
        return this.c;
    }

    public final r3 M() {
        r3 r3Var = this.d;
        if (r3Var != null) {
            return r3Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final t8 N() {
        I(this.f3975e);
        return this.f3975e;
    }

    public final x9 O() {
        I(this.f);
        return this.f;
    }

    public final f9 P() {
        I(this.f3976g);
        return this.f3976g;
    }

    public final f3 Q() {
        return this.f3979j.u();
    }

    public final void R() {
        if (!this.f3980k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @WorkerThread
    public final void S(String str, g gVar) {
        t8.b();
        f fVar = this.f3979j.f4114g;
        w2<Boolean> w2Var = x2.y0;
        if (fVar.r((String) null, w2Var)) {
            this.f3979j.d().h();
            R();
            this.y.put(str, gVar);
            j L = L();
            t8.b();
            if (L.a.f4114g.r((String) null, w2Var)) {
                Objects.requireNonNull(str, "null reference");
                L.h();
                L.i();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("consent_state", gVar.c());
                try {
                    if (L.y().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                        L.a.a().f.b("Failed to insert/update consent setting (got -1). appId", k3.t(str));
                    }
                } catch (SQLiteException e2) {
                    L.a.a().f.c("Error storing consent setting. appId, error", k3.t(str), e2);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String, android.database.Cursor] */
    @WorkerThread
    public final g T(String str) {
        String str2;
        g gVar = g.c;
        t8.b();
        ? r3 = 0;
        if (this.f3979j.f4114g.r(r3, x2.y0)) {
            this.f3979j.d().h();
            R();
            gVar = this.y.get(str);
            if (gVar == null) {
                j L = L();
                Objects.requireNonNull(str, "null reference");
                L.h();
                L.i();
                try {
                    Cursor rawQuery = L.y().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (rawQuery.moveToFirst()) {
                        str2 = rawQuery.getString(0);
                        rawQuery.close();
                    } else {
                        rawQuery.close();
                        str2 = "G1";
                    }
                    g b2 = g.b(str2);
                    S(str, b2);
                    return b2;
                } catch (SQLiteException e2) {
                    L.a.a().f.c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e2);
                    throw e2;
                } catch (Throwable th) {
                    if (r3 != 0) {
                        r3.close();
                    }
                    throw th;
                }
            }
        }
        return gVar;
    }

    public final long U() {
        Objects.requireNonNull((c) this.f3979j.f4121n);
        long currentTimeMillis = System.currentTimeMillis();
        x3 q2 = this.f3979j.q();
        q2.l();
        q2.h();
        long a2 = q2.f4356i.a();
        if (a2 == 0) {
            a2 = ((long) q2.a.t().d0().nextInt(86400000)) + 1;
            q2.f4356i.b(a2);
        }
        return ((((currentTimeMillis + a2) / 1000) / 60) / 60) / 24;
    }

    @WorkerThread
    public final void V(s sVar, String str) {
        s sVar2 = sVar;
        String str2 = str;
        a5 L = L().L(str2);
        if (L == null || TextUtils.isEmpty(L.P())) {
            this.f3979j.a().f4095m.b("No app data available; dropping event", str2);
            return;
        }
        Boolean F = F(L);
        if (F == null) {
            if (!"_ui".equals(sVar2.f4248h)) {
                this.f3979j.a().f4091i.b("Could not find package. appId", k3.t(str));
            }
        } else if (!F.booleanValue()) {
            this.f3979j.a().f.b("App version does not match; dropping event. appId", k3.t(str));
            return;
        }
        String B = L.B();
        String P = L.P();
        long R = L.R();
        String T = L.T();
        long V = L.V();
        long b2 = L.b();
        boolean f2 = L.f();
        String J = L.J();
        long q2 = L.q();
        boolean s2 = L.s();
        String D = L.D();
        Boolean u2 = L.u();
        long d2 = L.d();
        List<String> w2 = L.w();
        y9.b();
        String F2 = this.f3979j.f4114g.r(L.y(), x2.i0) ? L.F() : null;
        t8.b();
        p9 p9Var = r2;
        p9 p9Var2 = new p9(str, B, P, R, T, V, b2, (String) null, f2, false, J, q2, 0, 0, s2, false, D, u2, d2, w2, F2, this.f3979j.f4114g.r((String) null, x2.y0) ? T(str2).c() : "");
        b(sVar, p9Var);
    }

    public final k3 a() {
        return this.f3979j.a();
    }

    @WorkerThread
    public final void b(s sVar, p9 p9Var) {
        l3 a2 = l3.a(sVar);
        this.f3979j.t().v(a2.d, L().p(p9Var.f4218h));
        this.f3979j.t().u(a2, this.f3979j.f4114g.l(p9Var.f4218h));
        s b2 = a2.b();
        if (this.f3979j.f4114g.r((String) null, x2.d0) && "_cmp".equals(b2.f4248h) && "referrer API v2".equals(b2.f4249i.f4228h.getString("_cis"))) {
            String string = b2.f4249i.f4228h.getString("gclid");
            if (!TextUtils.isEmpty(string)) {
                p(new g9("_lgclid", b2.f4251k, string, "auto"), p9Var);
            }
        }
        g(b2, p9Var);
    }

    public final b.l.a.c.c.p.b c() {
        return this.f3979j.f4121n;
    }

    public final i4 d() {
        return this.f3979j.d();
    }

    public final y9 e() {
        throw null;
    }

    public final Context f() {
        return this.f3979j.a;
    }

    @WorkerThread
    public final void g(s sVar, p9 p9Var) {
        List<b> list;
        List<b> list2;
        List<b> list3;
        i3 i3Var;
        String str;
        Object t2;
        String r2;
        s sVar2 = sVar;
        p9 p9Var2 = p9Var;
        Objects.requireNonNull(p9Var2, "null reference");
        b.l.a.c.b.a.x(p9Var2.f4218h);
        this.f3979j.d().h();
        R();
        String str2 = p9Var2.f4218h;
        long j2 = sVar2.f4251k;
        P();
        if (f9.K(sVar, p9Var)) {
            if (!p9Var2.f4225o) {
                u(p9Var2);
                return;
            }
            List<String> list4 = p9Var2.A;
            if (list4 != null) {
                if (list4.contains(sVar2.f4248h)) {
                    Bundle Z = sVar2.f4249i.Z();
                    Z.putLong("ga_safelisted", 1);
                    sVar2 = new s(sVar2.f4248h, new q(Z), sVar2.f4250j, sVar2.f4251k);
                } else {
                    this.f3979j.a().f4095m.d("Dropping non-safelisted event. appId, event name, origin", str2, sVar2.f4248h, sVar2.f4250j);
                    return;
                }
            }
            L().v();
            try {
                j L = L();
                b.l.a.c.b.a.x(str2);
                L.h();
                L.i();
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i2 < 0) {
                    L.a.a().f4091i.c("Invalid time querying timed out conditional properties", k3.t(str2), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = L.K("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (b next : list) {
                    if (next != null) {
                        this.f3979j.a().f4096n.d("User property timed out", next.f3911h, this.f3979j.u().r(next.f3913j.f4021i), next.f3913j.V());
                        s sVar3 = next.f3917n;
                        if (sVar3 != null) {
                            h(new s(sVar3, j2), p9Var2);
                        }
                        L().I(str2, next.f3913j.f4021i);
                    }
                }
                j L2 = L();
                b.l.a.c.b.a.x(str2);
                L2.h();
                L2.i();
                if (i2 < 0) {
                    L2.a.a().f4091i.c("Invalid time querying expired conditional properties", k3.t(str2), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = L2.K("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (b next2 : list2) {
                    if (next2 != null) {
                        this.f3979j.a().f4096n.d("User property expired", next2.f3911h, this.f3979j.u().r(next2.f3913j.f4021i), next2.f3913j.V());
                        L().B(str2, next2.f3913j.f4021i);
                        s sVar4 = next2.r;
                        if (sVar4 != null) {
                            arrayList.add(sVar4);
                        }
                        L().I(str2, next2.f3913j.f4021i);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h(new s((s) it.next(), j2), p9Var2);
                }
                j L3 = L();
                String str3 = sVar2.f4248h;
                b.l.a.c.b.a.x(str2);
                b.l.a.c.b.a.x(str3);
                L3.h();
                L3.i();
                if (i2 < 0) {
                    L3.a.a().f4091i.d("Invalid time querying triggered conditional properties", k3.t(str2), L3.a.u().p(str3), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = L3.K("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(list3.size());
                for (b next3 : list3) {
                    if (next3 != null) {
                        g9 g9Var = next3.f3913j;
                        i9 i9Var = new i9(next3.f3911h, next3.f3912i, g9Var.f4021i, j2, g9Var.V());
                        if (L().C(i9Var)) {
                            i3Var = this.f3979j.a().f4096n;
                            str = "User property triggered";
                            t2 = next3.f3911h;
                            r2 = this.f3979j.u().r(i9Var.c);
                        } else {
                            i3Var = this.f3979j.a().f;
                            str = "Too many active user properties, ignoring";
                            t2 = k3.t(next3.f3911h);
                            r2 = this.f3979j.u().r(i9Var.c);
                        }
                        i3Var.d(str, t2, r2, i9Var.f4066e);
                        s sVar5 = next3.f3919p;
                        if (sVar5 != null) {
                            arrayList2.add(sVar5);
                        }
                        next3.f3913j = new g9(i9Var);
                        next3.f3915l = true;
                        L().G(next3);
                    }
                }
                h(sVar2, p9Var2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    h(new s((s) it2.next(), j2), p9Var2);
                }
                L().w();
            } finally {
                L().x();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0724, code lost:
        if (android.text.TextUtils.isEmpty(r3.x) == false) goto L_0x0726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x07d0, code lost:
        if (r8.size() == 0) goto L_0x07d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x031b A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x036b A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x036e A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03ce A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0733 A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x074d A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x07d5 A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0821 A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0870 A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x087d A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x08a4 A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x096c A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0984 A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0a18 A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0abd A[Catch:{ SQLiteException -> 0x0ad8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0ad3  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0a25 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ae A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c4 A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023f A[Catch:{ SQLiteException -> 0x02de, all -> 0x0b59 }] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(b.l.a.c.i.b.s r36, b.l.a.c.i.b.p9 r37) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            b.l.a.c.b.a.A(r37)
            java.lang.String r8 = r3.f4218h
            b.l.a.c.b.a.x(r8)
            long r8 = java.lang.System.nanoTime()
            b.l.a.c.i.b.l4 r10 = r1.f3979j
            b.l.a.c.i.b.i4 r10 = r10.d()
            r10.h()
            r35.R()
            java.lang.String r10 = r3.f4218h
            r35.P()
            boolean r11 = b.l.a.c.i.b.f9.K(r36, r37)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.f4225o
            if (r11 != 0) goto L_0x003a
            r1.u(r3)
            return
        L_0x003a:
            b.l.a.c.i.b.e4 r11 = r35.J()
            java.lang.String r12 = r2.f4248h
            boolean r11 = r11.o(r10, r12)
            java.lang.String r15 = "_err"
            r12 = 0
            if (r11 == 0) goto L_0x00eb
            b.l.a.c.i.b.l4 r3 = r1.f3979j
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.p()
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r10)
            b.l.a.c.i.b.l4 r5 = r1.f3979j
            b.l.a.c.i.b.f3 r5 = r5.u()
            java.lang.String r6 = r2.f4248h
            java.lang.String r5 = r5.p(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.c(r6, r4, r5)
            b.l.a.c.i.b.e4 r3 = r35.J()
            boolean r3 = r3.r(r10)
            if (r3 != 0) goto L_0x009c
            b.l.a.c.i.b.e4 r3 = r35.J()
            boolean r3 = r3.s(r10)
            if (r3 == 0) goto L_0x007d
            goto L_0x009c
        L_0x007d:
            java.lang.String r3 = r2.f4248h
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00ea
            b.l.a.c.i.b.l4 r3 = r1.f3979j
            b.l.a.c.i.b.k9 r11 = r3.t()
            b.l.a.c.i.b.j9 r12 = r1.z
            r14 = 11
            java.lang.String r2 = r2.f4248h
            r17 = 0
            java.lang.String r15 = "_ev"
            r13 = r10
            r16 = r2
            r11.A(r12, r13, r14, r15, r16, r17)
            return
        L_0x009c:
            b.l.a.c.i.b.j r2 = r35.L()
            b.l.a.c.i.b.a5 r2 = r2.L(r10)
            if (r2 == 0) goto L_0x00ea
            long r3 = r2.l()
            long r5 = r2.j()
            long r3 = java.lang.Math.max(r3, r5)
            b.l.a.c.i.b.l4 r5 = r1.f3979j
            b.l.a.c.c.p.b r5 = r5.c()
            b.l.a.c.c.p.c r5 = (b.l.a.c.c.p.c) r5
            long r5 = r5.a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            b.l.a.c.i.b.l4 r5 = r1.f3979j
            r5.p()
            b.l.a.c.i.b.w2<java.lang.Long> r5 = b.l.a.c.i.b.x2.z
            java.lang.Object r5 = r5.a(r12)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ea
            b.l.a.c.i.b.l4 r3 = r1.f3979j
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.r()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.a(r4)
            r1.l(r2)
        L_0x00ea:
            return
        L_0x00eb:
            b.l.a.c.i.b.l3 r2 = b.l.a.c.i.b.l3.a(r36)
            b.l.a.c.i.b.l4 r11 = r1.f3979j
            b.l.a.c.i.b.k9 r11 = r11.t()
            b.l.a.c.i.b.l4 r12 = r1.f3979j
            b.l.a.c.i.b.f r12 = r12.p()
            int r12 = r12.l(r10)
            r11.u(r2, r12)
            b.l.a.c.i.b.s r2 = r2.b()
            b.l.a.c.i.b.l4 r11 = r1.f3979j
            b.l.a.c.i.b.k3 r11 = r11.a()
            java.lang.String r11 = r11.v()
            r12 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r12)
            if (r11 == 0) goto L_0x0175
            b.l.a.c.i.b.l4 r11 = r1.f3979j
            b.l.a.c.i.b.k3 r11 = r11.a()
            b.l.a.c.i.b.i3 r11 = r11.s()
            b.l.a.c.i.b.l4 r12 = r1.f3979j
            b.l.a.c.i.b.f3 r12 = r12.u()
            boolean r13 = r12.o()
            if (r13 != 0) goto L_0x0132
            java.lang.String r12 = r2.toString()
            goto L_0x0170
        L_0x0132:
            java.lang.String r13 = "origin="
            java.lang.StringBuilder r13 = b.e.a.a.a.y(r13)
            java.lang.String r14 = r2.f4250j
            r13.append(r14)
            java.lang.String r14 = ",name="
            r13.append(r14)
            java.lang.String r14 = r2.f4248h
            java.lang.String r14 = r12.p(r14)
            r13.append(r14)
            java.lang.String r14 = ",params="
            r13.append(r14)
            b.l.a.c.i.b.q r14 = r2.f4249i
            if (r14 != 0) goto L_0x0156
            r12 = 0
            goto L_0x0169
        L_0x0156:
            boolean r16 = r12.o()
            if (r16 != 0) goto L_0x0161
            java.lang.String r12 = r14.toString()
            goto L_0x0169
        L_0x0161:
            android.os.Bundle r14 = r14.Z()
            java.lang.String r12 = r12.s(r14)
        L_0x0169:
            r13.append(r12)
            java.lang.String r12 = r13.toString()
        L_0x0170:
            java.lang.String r13 = "Logging event"
            r11.b(r13, r12)
        L_0x0175:
            b.l.a.c.i.b.j r11 = r35.L()
            r11.v()
            r1.u(r3)     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0b59 }
            java.lang.String r12 = "refund"
            r28 = 1
            if (r11 != 0) goto L_0x01a2
            java.lang.String r11 = "purchase"
            java.lang.String r13 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0b59 }
            if (r11 != 0) goto L_0x01a2
            java.lang.String r11 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0b59 }
            if (r11 == 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r11 = 0
            goto L_0x01a4
        L_0x01a2:
            r11 = r28
        L_0x01a4:
            java.lang.String r13 = "_iap"
            java.lang.String r14 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0b59 }
            if (r13 != 0) goto L_0x01ba
            if (r11 == 0) goto L_0x01b3
            r11 = r28
            goto L_0x01ba
        L_0x01b3:
            r31 = r4
            r29 = r8
            r4 = r15
            goto L_0x0356
        L_0x01ba:
            b.l.a.c.i.b.q r13 = r2.f4249i     // Catch:{ all -> 0x0b59 }
            java.lang.String r14 = "currency"
            java.lang.String r13 = r13.Y(r14)     // Catch:{ all -> 0x0b59 }
            if (r11 == 0) goto L_0x022d
            b.l.a.c.i.b.q r11 = r2.f4249i     // Catch:{ all -> 0x0b59 }
            java.lang.Double r11 = r11.X()     // Catch:{ all -> 0x0b59 }
            double r16 = r11.doubleValue()     // Catch:{ all -> 0x0b59 }
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r18
            r20 = 0
            int r11 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r11 != 0) goto L_0x01eb
            b.l.a.c.i.b.q r11 = r2.f4249i     // Catch:{ all -> 0x0b59 }
            java.lang.Long r11 = r11.W()     // Catch:{ all -> 0x0b59 }
            r20 = r15
            long r14 = r11.longValue()     // Catch:{ all -> 0x0b59 }
            double r14 = (double) r14     // Catch:{ all -> 0x0b59 }
            double r16 = r14 * r18
            goto L_0x01ed
        L_0x01eb:
            r20 = r15
        L_0x01ed:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x0207
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0207
            long r14 = java.lang.Math.round(r16)     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0b59 }
            if (r11 == 0) goto L_0x0239
            long r14 = -r14
            goto L_0x0239
        L_0x0207:
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r2 = r2.p()     // Catch:{ all -> 0x0b59 }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.Double r5 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x0b59 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r2 = r35.L()     // Catch:{ all -> 0x0b59 }
            r2.w()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r2 = r35.L()
            r2.x()
            return
        L_0x022d:
            r20 = r15
            b.l.a.c.i.b.q r11 = r2.f4249i     // Catch:{ all -> 0x0b59 }
            java.lang.Long r11 = r11.W()     // Catch:{ all -> 0x0b59 }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0b59 }
        L_0x0239:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0b59 }
            if (r11 != 0) goto L_0x0350
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch:{ all -> 0x0b59 }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch:{ all -> 0x0b59 }
            if (r12 == 0) goto L_0x0350
            java.lang.String r12 = "_ltv_"
            int r13 = r11.length()     // Catch:{ all -> 0x0b59 }
            if (r13 == 0) goto L_0x025b
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x0b59 }
        L_0x0259:
            r13 = r11
            goto L_0x0261
        L_0x025b:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0b59 }
            r11.<init>(r12)     // Catch:{ all -> 0x0b59 }
            goto L_0x0259
        L_0x0261:
            b.l.a.c.i.b.j r11 = r35.L()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i9 r11 = r11.D(r10, r13)     // Catch:{ all -> 0x0b59 }
            if (r11 == 0) goto L_0x02a2
            java.lang.Object r11 = r11.f4066e     // Catch:{ all -> 0x0b59 }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b59 }
            if (r12 != 0) goto L_0x0272
            goto L_0x02a2
        L_0x0272:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0b59 }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i9 r18 = new b.l.a.c.i.b.i9     // Catch:{ all -> 0x0b59 }
            r16 = r13
            java.lang.String r13 = r2.f4250j     // Catch:{ all -> 0x0b59 }
            r29 = r8
            b.l.a.c.i.b.l4 r8 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.c.p.b r8 = r8.c()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.c.p.c r8 = (b.l.a.c.c.p.c) r8
            long r8 = r8.a()     // Catch:{ all -> 0x0b59 }
            long r11 = r11 + r14
            java.lang.Long r17 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b59 }
            r11 = r18
            r12 = r10
            r14 = r16
            r31 = r4
            r4 = r20
            r15 = r8
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b59 }
        L_0x029e:
            r8 = r18
            goto L_0x0311
        L_0x02a2:
            r31 = r4
            r29 = r8
            r16 = r13
            r4 = r20
            r8 = 0
            b.l.a.c.i.b.j r9 = r35.L()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r11 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r11 = r11.p()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Integer> r12 = b.l.a.c.i.b.x2.E     // Catch:{ all -> 0x0b59 }
            int r11 = r11.p(r10, r12)     // Catch:{ all -> 0x0b59 }
            int r11 = r11 + -1
            b.l.a.c.b.a.x(r10)     // Catch:{ all -> 0x0b59 }
            r9.h()     // Catch:{ all -> 0x0b59 }
            r9.i()     // Catch:{ all -> 0x0b59 }
            android.database.sqlite.SQLiteDatabase r12 = r9.y()     // Catch:{ SQLiteException -> 0x02de }
            r13 = 3
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x02de }
            r13[r8] = r10     // Catch:{ SQLiteException -> 0x02de }
            r13[r28] = r10     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x02de }
            r11 = 2
            r13[r11] = r8     // Catch:{ SQLiteException -> 0x02de }
            java.lang.String r8 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12.execSQL(r8, r13)     // Catch:{ SQLiteException -> 0x02de }
            goto L_0x02f3
        L_0x02de:
            r0 = move-exception
            r8 = r0
            b.l.a.c.i.b.l4 r9 = r9.a     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r9 = r9.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r9 = r9.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            r9.c(r11, r12, r8)     // Catch:{ all -> 0x0b59 }
        L_0x02f3:
            b.l.a.c.i.b.i9 r18 = new b.l.a.c.i.b.i9     // Catch:{ all -> 0x0b59 }
            java.lang.String r13 = r2.f4250j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r8 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.c.p.b r8 = r8.c()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.c.p.c r8 = (b.l.a.c.c.p.c) r8
            long r8 = r8.a()     // Catch:{ all -> 0x0b59 }
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b59 }
            r11 = r18
            r12 = r10
            r14 = r16
            r15 = r8
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b59 }
            goto L_0x029e
        L_0x0311:
            b.l.a.c.i.b.j r9 = r35.L()     // Catch:{ all -> 0x0b59 }
            boolean r9 = r9.C(r8)     // Catch:{ all -> 0x0b59 }
            if (r9 != 0) goto L_0x0356
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r9 = r9.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r9 = r9.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r12 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r13 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f3 r13 = r13.u()     // Catch:{ all -> 0x0b59 }
            java.lang.String r14 = r8.c     // Catch:{ all -> 0x0b59 }
            java.lang.String r13 = r13.r(r14)     // Catch:{ all -> 0x0b59 }
            java.lang.Object r8 = r8.f4066e     // Catch:{ all -> 0x0b59 }
            r9.d(r11, r12, r13, r8)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r8 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k9 r11 = r8.t()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j9 r12 = r1.z     // Catch:{ all -> 0x0b59 }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b59 }
            goto L_0x0356
        L_0x0350:
            r31 = r4
            r29 = r8
            r4 = r20
        L_0x0356:
            java.lang.String r8 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            boolean r8 = b.l.a.c.i.b.k9.e0(r8)     // Catch:{ all -> 0x0b59 }
            java.lang.String r9 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            boolean r4 = r4.equals(r9)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            r9.t()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.q r9 = r2.f4249i     // Catch:{ all -> 0x0b59 }
            if (r9 != 0) goto L_0x036e
            r11 = 0
            goto L_0x0395
        L_0x036e:
            android.os.Bundle r11 = r9.f4228h     // Catch:{ all -> 0x0b59 }
            java.util.Set r11 = r11.keySet()     // Catch:{ all -> 0x0b59 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0b59 }
            r12 = 0
        L_0x037a:
            boolean r14 = r11.hasNext()     // Catch:{ all -> 0x0b59 }
            if (r14 == 0) goto L_0x0394
            java.lang.Object r14 = r11.next()     // Catch:{ all -> 0x0b59 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0b59 }
            java.lang.Object r14 = r9.V(r14)     // Catch:{ all -> 0x0b59 }
            boolean r15 = r14 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0b59 }
            if (r15 == 0) goto L_0x037a
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14     // Catch:{ all -> 0x0b59 }
            int r14 = r14.length     // Catch:{ all -> 0x0b59 }
            long r14 = (long) r14     // Catch:{ all -> 0x0b59 }
            long r12 = r12 + r14
            goto L_0x037a
        L_0x0394:
            r11 = r12
        L_0x0395:
            r22 = 1
            long r15 = r11 + r22
            b.l.a.c.i.b.j r11 = r35.L()     // Catch:{ all -> 0x0b59 }
            long r12 = r35.U()     // Catch:{ all -> 0x0b59 }
            r17 = 1
            r19 = 0
            r21 = 0
            r24 = 0
            r14 = r10
            r18 = r8
            r20 = r4
            b.l.a.c.i.b.h r9 = r11.O(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0b59 }
            long r11 = r9.f4027b     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r13 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            r13.p()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Integer> r13 = b.l.a.c.i.b.x2.f4346k     // Catch:{ all -> 0x0b59 }
            r14 = 0
            java.lang.Object r13 = r13.a(r14)     // Catch:{ all -> 0x0b59 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0b59 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0b59 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b59 }
            long r11 = r11 - r13
            int r13 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            r14 = 1000(0x3e8, double:4.94E-321)
            if (r13 <= 0) goto L_0x03fb
            long r11 = r11 % r14
            int r2 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x03ec
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            long r5 = r9.f4027b     // Catch:{ all -> 0x0b59 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b59 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0b59 }
        L_0x03ec:
            b.l.a.c.i.b.j r2 = r35.L()     // Catch:{ all -> 0x0b59 }
            r2.w()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r2 = r35.L()
            r2.x()
            return
        L_0x03fb:
            if (r8 == 0) goto L_0x045c
            long r11 = r9.a     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r13 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            r13.p()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Integer> r13 = b.l.a.c.i.b.x2.f4348m     // Catch:{ all -> 0x0b59 }
            r14 = 0
            java.lang.Object r13 = r13.a(r14)     // Catch:{ all -> 0x0b59 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0b59 }
            int r13 = r13.intValue()     // Catch:{ all -> 0x0b59 }
            long r13 = (long) r13     // Catch:{ all -> 0x0b59 }
            long r11 = r11 - r13
            int r13 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r13 <= 0) goto L_0x045c
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 % r13
            int r3 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0437
            b.l.a.c.i.b.l4 r3 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            long r6 = r9.a     // Catch:{ all -> 0x0b59 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b59 }
            r3.c(r4, r5, r6)     // Catch:{ all -> 0x0b59 }
        L_0x0437:
            b.l.a.c.i.b.l4 r3 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k9 r11 = r3.t()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j9 r12 = r1.z     // Catch:{ all -> 0x0b59 }
            r14 = 16
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            r17 = 0
            r13 = r10
            r16 = r2
            r11.A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r2 = r35.L()     // Catch:{ all -> 0x0b59 }
            r2.w()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r2 = r35.L()
            r2.x()
            return
        L_0x045c:
            r11 = 1000000(0xf4240, float:1.401298E-39)
            if (r4 == 0) goto L_0x04ac
            long r12 = r9.d     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r4 = r4.p()     // Catch:{ all -> 0x0b59 }
            java.lang.String r14 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Integer> r15 = b.l.a.c.i.b.x2.f4347l     // Catch:{ all -> 0x0b59 }
            int r4 = r4.p(r14, r15)     // Catch:{ all -> 0x0b59 }
            int r4 = java.lang.Math.min(r11, r4)     // Catch:{ all -> 0x0b59 }
            r14 = 0
            int r4 = java.lang.Math.max(r14, r4)     // Catch:{ all -> 0x0b59 }
            long r14 = (long) r4     // Catch:{ all -> 0x0b59 }
            long r12 = r12 - r14
            int r4 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ac
            int r2 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x049d
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            long r5 = r9.d     // Catch:{ all -> 0x0b59 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b59 }
            r2.c(r3, r4, r5)     // Catch:{ all -> 0x0b59 }
        L_0x049d:
            b.l.a.c.i.b.j r2 = r35.L()     // Catch:{ all -> 0x0b59 }
            r2.w()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r2 = r35.L()
            r2.x()
            return
        L_0x04ac:
            b.l.a.c.i.b.q r4 = r2.f4249i     // Catch:{ all -> 0x0b59 }
            android.os.Bundle r4 = r4.Z()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k9 r9 = r9.t()     // Catch:{ all -> 0x0b59 }
            java.lang.String r12 = "_o"
            java.lang.String r13 = r2.f4250j     // Catch:{ all -> 0x0b59 }
            r9.z(r4, r12, r13)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k9 r9 = r9.t()     // Catch:{ all -> 0x0b59 }
            boolean r9 = r9.H(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.String r15 = "_r"
            if (r9 == 0) goto L_0x04e5
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k9 r9 = r9.t()     // Catch:{ all -> 0x0b59 }
            java.lang.Long r12 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0b59 }
            java.lang.String r13 = "_dbg"
            r9.z(r4, r13, r12)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k9 r9 = r9.t()     // Catch:{ all -> 0x0b59 }
            r9.z(r4, r15, r12)     // Catch:{ all -> 0x0b59 }
        L_0x04e5:
            java.lang.String r9 = "_s"
            java.lang.String r12 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0b59 }
            if (r9 == 0) goto L_0x050c
            b.l.a.c.i.b.j r9 = r35.L()     // Catch:{ all -> 0x0b59 }
            java.lang.String r12 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i9 r9 = r9.D(r12, r7)     // Catch:{ all -> 0x0b59 }
            if (r9 == 0) goto L_0x050c
            java.lang.Object r12 = r9.f4066e     // Catch:{ all -> 0x0b59 }
            boolean r12 = r12 instanceof java.lang.Long     // Catch:{ all -> 0x0b59 }
            if (r12 == 0) goto L_0x050c
            b.l.a.c.i.b.l4 r12 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k9 r12 = r12.t()     // Catch:{ all -> 0x0b59 }
            java.lang.Object r9 = r9.f4066e     // Catch:{ all -> 0x0b59 }
            r12.z(r4, r7, r9)     // Catch:{ all -> 0x0b59 }
        L_0x050c:
            b.l.a.c.i.b.j r7 = r35.L()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.b.a.x(r10)     // Catch:{ all -> 0x0b59 }
            r7.h()     // Catch:{ all -> 0x0b59 }
            r7.i()     // Catch:{ all -> 0x0b59 }
            android.database.sqlite.SQLiteDatabase r9 = r7.y()     // Catch:{ SQLiteException -> 0x0545 }
            b.l.a.c.i.b.l4 r12 = r7.a     // Catch:{ SQLiteException -> 0x0545 }
            b.l.a.c.i.b.f r12 = r12.p()     // Catch:{ SQLiteException -> 0x0545 }
            b.l.a.c.i.b.w2<java.lang.Integer> r13 = b.l.a.c.i.b.x2.f4351p     // Catch:{ SQLiteException -> 0x0545 }
            int r12 = r12.p(r10, r13)     // Catch:{ SQLiteException -> 0x0545 }
            int r11 = java.lang.Math.min(r11, r12)     // Catch:{ SQLiteException -> 0x0545 }
            r12 = 0
            int r11 = java.lang.Math.max(r12, r11)     // Catch:{ SQLiteException -> 0x0545 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x0545 }
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0545 }
            r13[r12] = r10     // Catch:{ SQLiteException -> 0x0545 }
            r13[r28] = r11     // Catch:{ SQLiteException -> 0x0545 }
            java.lang.String r11 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r7 = r9.delete(r6, r11, r13)     // Catch:{ SQLiteException -> 0x0545 }
            long r11 = (long) r7
            goto L_0x055c
        L_0x0545:
            r0 = move-exception
            r9 = r0
            b.l.a.c.i.b.l4 r7 = r7.a     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r7 = r7.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r7 = r7.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = "Error deleting over the limit events. appId"
            java.lang.Object r12 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            r7.c(r11, r12, r9)     // Catch:{ all -> 0x0b59 }
            r11 = r24
        L_0x055c:
            int r7 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            if (r7 <= 0) goto L_0x0577
            b.l.a.c.i.b.l4 r7 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r7 = r7.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r7 = r7.p()     // Catch:{ all -> 0x0b59 }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r13 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b59 }
            r7.c(r9, r13, r11)     // Catch:{ all -> 0x0b59 }
        L_0x0577:
            b.l.a.c.i.b.n r7 = new b.l.a.c.i.b.n     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r12 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            java.lang.String r13 = r2.f4250j     // Catch:{ all -> 0x0b59 }
            java.lang.String r9 = r2.f4248h     // Catch:{ all -> 0x0b59 }
            r32 = r5
            r33 = r6
            long r5 = r2.f4251k     // Catch:{ all -> 0x0b59 }
            r18 = 0
            r11 = r7
            r14 = r10
            r2 = r15
            r15 = r9
            r16 = r5
            r20 = r4
            r11.<init>((b.l.a.c.i.b.l4) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r4 = r35.L()     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = r7.f4163b     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.o r4 = r4.z(r10, r5)     // Catch:{ all -> 0x0b59 }
            if (r4 != 0) goto L_0x061d
            b.l.a.c.i.b.j r4 = r35.L()     // Catch:{ all -> 0x0b59 }
            long r4 = r4.n(r10)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r6 = r6.p()     // Catch:{ all -> 0x0b59 }
            int r6 = r6.m(r10)     // Catch:{ all -> 0x0b59 }
            long r11 = (long) r6     // Catch:{ all -> 0x0b59 }
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x05ff
            if (r8 == 0) goto L_0x05ff
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r10)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f3 r5 = r5.u()     // Catch:{ all -> 0x0b59 }
            java.lang.String r6 = r7.f4163b     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = r5.p(r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r6 = r6.p()     // Catch:{ all -> 0x0b59 }
            int r6 = r6.m(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b59 }
            r2.d(r3, r4, r5, r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k9 r11 = r2.t()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j9 r12 = r1.z     // Catch:{ all -> 0x0b59 }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.A(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r2 = r35.L()
            r2.x()
            return
        L_0x05ff:
            b.l.a.c.i.b.o r4 = new b.l.a.c.i.b.o     // Catch:{ all -> 0x0b59 }
            java.lang.String r13 = r7.f4163b     // Catch:{ all -> 0x0b59 }
            long r5 = r7.d     // Catch:{ all -> 0x0b59 }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r4
            r12 = r10
            r20 = r5
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0b59 }
            goto L_0x062b
        L_0x061d:
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            long r8 = r4.f     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.n r7 = r7.a(r5, r8)     // Catch:{ all -> 0x0b59 }
            long r5 = r7.d     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.o r4 = r4.a(r5)     // Catch:{ all -> 0x0b59 }
        L_0x062b:
            b.l.a.c.i.b.j r5 = r35.L()     // Catch:{ all -> 0x0b59 }
            r5.A(r4)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i4 r4 = r4.d()     // Catch:{ all -> 0x0b59 }
            r4.h()     // Catch:{ all -> 0x0b59 }
            r35.R()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.b.a.A(r7)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.b.a.A(r37)     // Catch:{ all -> 0x0b59 }
            java.lang.String r4 = r7.a     // Catch:{ all -> 0x0b59 }
            b.l.a.c.b.a.x(r4)     // Catch:{ all -> 0x0b59 }
            java.lang.String r4 = r7.a     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.b.a.j(r4)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.f.i.v1 r4 = b.l.a.c.f.i.w1.C0()     // Catch:{ all -> 0x0b59 }
            r4.N()     // Catch:{ all -> 0x0b59 }
            r4.m()     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x066b
            java.lang.String r5 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            r4.t(r5)     // Catch:{ all -> 0x0b59 }
        L_0x066b:
            java.lang.String r5 = r3.f4221k     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x0678
            java.lang.String r5 = r3.f4221k     // Catch:{ all -> 0x0b59 }
            r4.r(r5)     // Catch:{ all -> 0x0b59 }
        L_0x0678:
            java.lang.String r5 = r3.f4220j     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x0685
            java.lang.String r5 = r3.f4220j     // Catch:{ all -> 0x0b59 }
            r4.u(r5)     // Catch:{ all -> 0x0b59 }
        L_0x0685:
            long r5 = r3.f4227q     // Catch:{ all -> 0x0b59 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0692
            int r5 = (int) r5     // Catch:{ all -> 0x0b59 }
            r4.P(r5)     // Catch:{ all -> 0x0b59 }
        L_0x0692:
            long r5 = r3.f4222l     // Catch:{ all -> 0x0b59 }
            r4.v(r5)     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = r3.f4219i     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x06a4
            java.lang.String r5 = r3.f4219i     // Catch:{ all -> 0x0b59 }
            r4.J(r5)     // Catch:{ all -> 0x0b59 }
        L_0x06a4:
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r5 = r5.p()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r6 = b.l.a.c.i.b.x2.y0     // Catch:{ all -> 0x0b59 }
            r8 = 0
            boolean r5 = r5.r(r8, r6)     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x06cd
            java.lang.String r5 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.g r5 = r1.T(r5)     // Catch:{ all -> 0x0b59 }
            java.lang.String r6 = r3.C     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.g r6 = b.l.a.c.i.b.g.b(r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.g r5 = r5.h(r6)     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = r5.c()     // Catch:{ all -> 0x0b59 }
            r4.c0(r5)     // Catch:{ all -> 0x0b59 }
        L_0x06cd:
            b.l.a.c.f.i.y9.b()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r5 = r5.p()     // Catch:{ all -> 0x0b59 }
            java.lang.String r6 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r8 = b.l.a.c.i.b.x2.i0     // Catch:{ all -> 0x0b59 }
            boolean r5 = r5.r(r6, r8)     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x0714
            java.lang.String r5 = r4.I()     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x06f7
            java.lang.String r5 = r3.B     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x06f7
            java.lang.String r5 = r3.B     // Catch:{ all -> 0x0b59 }
            r4.b0(r5)     // Catch:{ all -> 0x0b59 }
        L_0x06f7:
            java.lang.String r5 = r4.I()     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x072b
            java.lang.String r5 = r4.a0()     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x072b
            java.lang.String r5 = r3.x     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x072b
            goto L_0x0726
        L_0x0714:
            java.lang.String r5 = r4.I()     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x072b
            java.lang.String r5 = r3.x     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x072b
        L_0x0726:
            java.lang.String r5 = r3.x     // Catch:{ all -> 0x0b59 }
            r4.W(r5)     // Catch:{ all -> 0x0b59 }
        L_0x072b:
            long r5 = r3.f4223m     // Catch:{ all -> 0x0b59 }
            r8 = 0
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0736
            r4.D(r5)     // Catch:{ all -> 0x0b59 }
        L_0x0736:
            long r5 = r3.z     // Catch:{ all -> 0x0b59 }
            r4.Y(r5)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f9 r5 = r35.P()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.d9 r6 = r5.f4305b     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r6.f3979j     // Catch:{ all -> 0x0b59 }
            android.content.Context r6 = r6.f()     // Catch:{ all -> 0x0b59 }
            java.util.Map r6 = b.l.a.c.i.b.x2.a(r6)     // Catch:{ all -> 0x0b59 }
            if (r6 == 0) goto L_0x07d2
            int r8 = r6.size()     // Catch:{ all -> 0x0b59 }
            if (r8 != 0) goto L_0x0755
            goto L_0x07d2
        L_0x0755:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0b59 }
            r8.<init>()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Integer> r9 = b.l.a.c.i.b.x2.P     // Catch:{ all -> 0x0b59 }
            r10 = 0
            java.lang.Object r9 = r9.a(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0b59 }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0b59 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x0b59 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0b59 }
        L_0x076f:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x0b59 }
            if (r10 == 0) goto L_0x07cc
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x0b59 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0b59 }
            java.lang.Object r11 = r10.getKey()     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0b59 }
            java.lang.String r12 = "measurement.id."
            boolean r11 = r11.startsWith(r12)     // Catch:{ all -> 0x0b59 }
            if (r11 == 0) goto L_0x076f
            java.lang.Object r10 = r10.getValue()     // Catch:{ NumberFormatException -> 0x07ba }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x07ba }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x07ba }
            if (r10 == 0) goto L_0x076f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x07ba }
            r8.add(r10)     // Catch:{ NumberFormatException -> 0x07ba }
            int r10 = r8.size()     // Catch:{ NumberFormatException -> 0x07ba }
            if (r10 < r9) goto L_0x076f
            b.l.a.c.i.b.l4 r10 = r5.a     // Catch:{ NumberFormatException -> 0x07ba }
            b.l.a.c.i.b.k3 r10 = r10.a()     // Catch:{ NumberFormatException -> 0x07ba }
            b.l.a.c.i.b.i3 r10 = r10.p()     // Catch:{ NumberFormatException -> 0x07ba }
            java.lang.String r11 = "Too many experiment IDs. Number of IDs"
            int r12 = r8.size()     // Catch:{ NumberFormatException -> 0x07ba }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x07ba }
            r10.b(r11, r12)     // Catch:{ NumberFormatException -> 0x07ba }
            goto L_0x07cc
        L_0x07ba:
            r0 = move-exception
            r10 = r0
            b.l.a.c.i.b.l4 r11 = r5.a     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r11 = r11.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r11 = r11.p()     // Catch:{ all -> 0x0b59 }
            java.lang.String r12 = "Experiment ID NumberFormatException"
            r11.b(r12, r10)     // Catch:{ all -> 0x0b59 }
            goto L_0x076f
        L_0x07cc:
            int r5 = r8.size()     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x07d3
        L_0x07d2:
            r8 = 0
        L_0x07d3:
            if (r8 == 0) goto L_0x07d8
            r4.X(r8)     // Catch:{ all -> 0x0b59 }
        L_0x07d8:
            java.lang.String r5 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.g r5 = r1.T(r5)     // Catch:{ all -> 0x0b59 }
            java.lang.String r6 = r3.C     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.g r6 = b.l.a.c.i.b.g.b(r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.g r5 = r5.h(r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r6 = r6.p()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r8 = b.l.a.c.i.b.x2.y0     // Catch:{ all -> 0x0b59 }
            r9 = 0
            boolean r6 = r6.r(r9, r8)     // Catch:{ all -> 0x0b59 }
            if (r6 == 0) goto L_0x0800
            boolean r6 = r5.d()     // Catch:{ all -> 0x0b59 }
            if (r6 == 0) goto L_0x082a
        L_0x0800:
            b.l.a.c.i.b.c8 r6 = r1.f3978i     // Catch:{ all -> 0x0b59 }
            java.lang.String r9 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            android.util.Pair r6 = r6.l(r9, r5)     // Catch:{ all -> 0x0b59 }
            java.lang.Object r9 = r6.first     // Catch:{ all -> 0x0b59 }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x0b59 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0b59 }
            if (r9 != 0) goto L_0x082a
            boolean r9 = r3.v     // Catch:{ all -> 0x0b59 }
            if (r9 == 0) goto L_0x082a
            java.lang.Object r9 = r6.first     // Catch:{ all -> 0x0b59 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0b59 }
            r4.x(r9)     // Catch:{ all -> 0x0b59 }
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x0b59 }
            if (r6 == 0) goto L_0x082a
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0b59 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0b59 }
            r4.z(r6)     // Catch:{ all -> 0x0b59 }
        L_0x082a:
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.m r6 = r6.A()     // Catch:{ all -> 0x0b59 }
            r6.l()     // Catch:{ all -> 0x0b59 }
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x0b59 }
            r4.o(r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.m r6 = r6.A()     // Catch:{ all -> 0x0b59 }
            r6.l()     // Catch:{ all -> 0x0b59 }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b59 }
            r4.n(r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.m r6 = r6.A()     // Catch:{ all -> 0x0b59 }
            long r9 = r6.o()     // Catch:{ all -> 0x0b59 }
            int r6 = (int) r9     // Catch:{ all -> 0x0b59 }
            r4.q(r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.m r6 = r6.A()     // Catch:{ all -> 0x0b59 }
            java.lang.String r6 = r6.p()     // Catch:{ all -> 0x0b59 }
            r4.p(r6)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r6 = r6.p()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r9 = b.l.a.c.i.b.x2.v0     // Catch:{ all -> 0x0b59 }
            r10 = 0
            boolean r6 = r6.r(r10, r9)     // Catch:{ all -> 0x0b59 }
            if (r6 != 0) goto L_0x0875
            long r10 = r3.s     // Catch:{ all -> 0x0b59 }
            r4.S(r10)     // Catch:{ all -> 0x0b59 }
        L_0x0875:
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            boolean r6 = r6.j()     // Catch:{ all -> 0x0b59 }
            if (r6 == 0) goto L_0x0898
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r6 = r6.p()     // Catch:{ all -> 0x0b59 }
            r10 = 0
            r6.r(r10, r8)     // Catch:{ all -> 0x0b59 }
            r4.s()     // Catch:{ all -> 0x0b59 }
            boolean r6 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0b59 }
            if (r6 == 0) goto L_0x0894
            goto L_0x0898
        L_0x0894:
            r4.T()     // Catch:{ all -> 0x0b59 }
            throw r10
        L_0x0898:
            b.l.a.c.i.b.j r6 = r35.L()     // Catch:{ all -> 0x0b59 }
            java.lang.String r10 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.a5 r6 = r6.L(r10)     // Catch:{ all -> 0x0b59 }
            if (r6 != 0) goto L_0x093b
            b.l.a.c.i.b.a5 r6 = new b.l.a.c.i.b.a5     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r10 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            r6.<init>(r10, r11)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r10 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r10 = r10.p()     // Catch:{ all -> 0x0b59 }
            r11 = 0
            boolean r10 = r10.r(r11, r8)     // Catch:{ all -> 0x0b59 }
            if (r10 == 0) goto L_0x08c2
            java.lang.String r10 = r1.i(r5)     // Catch:{ all -> 0x0b59 }
            goto L_0x08c6
        L_0x08c2:
            java.lang.String r10 = r35.j()     // Catch:{ all -> 0x0b59 }
        L_0x08c6:
            r6.A(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.String r10 = r3.r     // Catch:{ all -> 0x0b59 }
            r6.K(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.String r10 = r3.f4219i     // Catch:{ all -> 0x0b59 }
            r6.C(r10)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r10 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r10 = r10.p()     // Catch:{ all -> 0x0b59 }
            r11 = 0
            boolean r10 = r10.r(r11, r8)     // Catch:{ all -> 0x0b59 }
            if (r10 == 0) goto L_0x08e9
            boolean r10 = r5.d()     // Catch:{ all -> 0x0b59 }
            if (r10 == 0) goto L_0x08f4
        L_0x08e9:
            b.l.a.c.i.b.c8 r10 = r1.f3978i     // Catch:{ all -> 0x0b59 }
            java.lang.String r11 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            java.lang.String r10 = r10.n(r11)     // Catch:{ all -> 0x0b59 }
            r6.I(r10)     // Catch:{ all -> 0x0b59 }
        L_0x08f4:
            r10 = 0
            r6.h(r10)     // Catch:{ all -> 0x0b59 }
            r6.M(r10)     // Catch:{ all -> 0x0b59 }
            r6.O(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.String r10 = r3.f4220j     // Catch:{ all -> 0x0b59 }
            r6.Q(r10)     // Catch:{ all -> 0x0b59 }
            long r10 = r3.f4227q     // Catch:{ all -> 0x0b59 }
            r6.S(r10)     // Catch:{ all -> 0x0b59 }
            java.lang.String r10 = r3.f4221k     // Catch:{ all -> 0x0b59 }
            r6.U(r10)     // Catch:{ all -> 0x0b59 }
            long r10 = r3.f4222l     // Catch:{ all -> 0x0b59 }
            r6.a(r10)     // Catch:{ all -> 0x0b59 }
            long r10 = r3.f4223m     // Catch:{ all -> 0x0b59 }
            r6.c(r10)     // Catch:{ all -> 0x0b59 }
            boolean r10 = r3.f4225o     // Catch:{ all -> 0x0b59 }
            r6.g(r10)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r10 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r10 = r10.p()     // Catch:{ all -> 0x0b59 }
            r11 = 0
            boolean r9 = r10.r(r11, r9)     // Catch:{ all -> 0x0b59 }
            if (r9 != 0) goto L_0x092f
            long r9 = r3.s     // Catch:{ all -> 0x0b59 }
            r6.r(r9)     // Catch:{ all -> 0x0b59 }
        L_0x092f:
            long r9 = r3.z     // Catch:{ all -> 0x0b59 }
            r6.e(r9)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r9 = r35.L()     // Catch:{ all -> 0x0b59 }
            r9.M(r6)     // Catch:{ all -> 0x0b59 }
        L_0x093b:
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r9 = r9.p()     // Catch:{ all -> 0x0b59 }
            r10 = 0
            boolean r8 = r9.r(r10, r8)     // Catch:{ all -> 0x0b59 }
            if (r8 == 0) goto L_0x0951
            boolean r5 = r5.e()     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x0962
        L_0x0951:
            java.lang.String r5 = r6.z()     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x0962
            java.lang.String r5 = r6.z()     // Catch:{ all -> 0x0b59 }
            r4.B(r5)     // Catch:{ all -> 0x0b59 }
        L_0x0962:
            java.lang.String r5 = r6.J()     // Catch:{ all -> 0x0b59 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 != 0) goto L_0x0973
            java.lang.String r5 = r6.J()     // Catch:{ all -> 0x0b59 }
            r4.O(r5)     // Catch:{ all -> 0x0b59 }
        L_0x0973:
            b.l.a.c.i.b.j r5 = r35.L()     // Catch:{ all -> 0x0b59 }
            java.lang.String r3 = r3.f4218h     // Catch:{ all -> 0x0b59 }
            java.util.List r3 = r5.E(r3)     // Catch:{ all -> 0x0b59 }
            r5 = 0
        L_0x097e:
            int r6 = r3.size()     // Catch:{ all -> 0x0b59 }
            if (r5 >= r6) goto L_0x09b3
            b.l.a.c.f.i.f2 r6 = b.l.a.c.f.i.g2.B()     // Catch:{ all -> 0x0b59 }
            java.lang.Object r8 = r3.get(r5)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i9 r8 = (b.l.a.c.i.b.i9) r8     // Catch:{ all -> 0x0b59 }
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x0b59 }
            r6.n(r8)     // Catch:{ all -> 0x0b59 }
            java.lang.Object r8 = r3.get(r5)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i9 r8 = (b.l.a.c.i.b.i9) r8     // Catch:{ all -> 0x0b59 }
            long r8 = r8.d     // Catch:{ all -> 0x0b59 }
            r6.m(r8)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f9 r8 = r35.P()     // Catch:{ all -> 0x0b59 }
            java.lang.Object r9 = r3.get(r5)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i9 r9 = (b.l.a.c.i.b.i9) r9     // Catch:{ all -> 0x0b59 }
            java.lang.Object r9 = r9.f4066e     // Catch:{ all -> 0x0b59 }
            r8.t(r6, r9)     // Catch:{ all -> 0x0b59 }
            r4.q0(r6)     // Catch:{ all -> 0x0b59 }
            int r5 = r5 + 1
            goto L_0x097e
        L_0x09b3:
            b.l.a.c.i.b.j r3 = r35.L()     // Catch:{ IOException -> 0x0aed }
            b.l.a.c.f.i.p5 r5 = r4.g()     // Catch:{ IOException -> 0x0aed }
            b.l.a.c.f.i.w1 r5 = (b.l.a.c.f.i.w1) r5     // Catch:{ IOException -> 0x0aed }
            r3.h()     // Catch:{ IOException -> 0x0aed }
            r3.i()     // Catch:{ IOException -> 0x0aed }
            b.l.a.c.b.a.A(r5)     // Catch:{ IOException -> 0x0aed }
            java.lang.String r6 = r5.s()     // Catch:{ IOException -> 0x0aed }
            b.l.a.c.b.a.x(r6)     // Catch:{ IOException -> 0x0aed }
            byte[] r6 = r5.e()     // Catch:{ IOException -> 0x0aed }
            b.l.a.c.i.b.d9 r8 = r3.f4305b     // Catch:{ IOException -> 0x0aed }
            b.l.a.c.i.b.f9 r8 = r8.P()     // Catch:{ IOException -> 0x0aed }
            long r8 = r8.E(r6)     // Catch:{ IOException -> 0x0aed }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ IOException -> 0x0aed }
            r10.<init>()     // Catch:{ IOException -> 0x0aed }
            java.lang.String r11 = r5.s()     // Catch:{ IOException -> 0x0aed }
            r12 = r32
            r10.put(r12, r11)     // Catch:{ IOException -> 0x0aed }
            java.lang.Long r11 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0aed }
            r13 = r31
            r10.put(r13, r11)     // Catch:{ IOException -> 0x0aed }
            java.lang.String r11 = "metadata"
            r10.put(r11, r6)     // Catch:{ IOException -> 0x0aed }
            android.database.sqlite.SQLiteDatabase r6 = r3.y()     // Catch:{ SQLiteException -> 0x0af0 }
            java.lang.String r11 = "raw_events_metadata"
            r14 = 4
            r15 = 0
            r6.insertWithOnConflict(r11, r15, r10, r14)     // Catch:{ SQLiteException -> 0x0af0 }
            b.l.a.c.i.b.j r3 = r35.L()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.q r4 = r7.f     // Catch:{ all -> 0x0b59 }
            android.os.Bundle r4 = r4.f4228h     // Catch:{ all -> 0x0b59 }
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x0b59 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0b59 }
        L_0x0a12:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x0a25
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0b59 }
            boolean r5 = r2.equals(r5)     // Catch:{ all -> 0x0b59 }
            if (r5 == 0) goto L_0x0a12
            goto L_0x0a5f
        L_0x0a25:
            b.l.a.c.i.b.e4 r2 = r35.J()     // Catch:{ all -> 0x0b59 }
            java.lang.String r4 = r7.a     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = r7.f4163b     // Catch:{ all -> 0x0b59 }
            boolean r2 = r2.p(r4, r5)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r14 = r35.L()     // Catch:{ all -> 0x0b59 }
            long r15 = r35.U()     // Catch:{ all -> 0x0b59 }
            java.lang.String r4 = r7.a     // Catch:{ all -> 0x0b59 }
            r18 = 0
            r19 = 0
            r17 = r4
            b.l.a.c.i.b.h r4 = r14.N(r15, r17, r18, r19)     // Catch:{ all -> 0x0b59 }
            if (r2 == 0) goto L_0x0a5d
            long r4 = r4.f4028e     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f r2 = r2.p()     // Catch:{ all -> 0x0b59 }
            java.lang.String r6 = r7.a     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.w2<java.lang.Integer> r10 = b.l.a.c.i.b.x2.f4350o     // Catch:{ all -> 0x0b59 }
            int r2 = r2.p(r6, r10)     // Catch:{ all -> 0x0b59 }
            long r10 = (long) r2     // Catch:{ all -> 0x0b59 }
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0a5d
            goto L_0x0a5f
        L_0x0a5d:
            r28 = 0
        L_0x0a5f:
            r3.h()     // Catch:{ all -> 0x0b59 }
            r3.i()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.b.a.A(r7)     // Catch:{ all -> 0x0b59 }
            java.lang.String r2 = r7.a     // Catch:{ all -> 0x0b59 }
            b.l.a.c.b.a.x(r2)     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.d9 r2 = r3.f4305b     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.f9 r2 = r2.P()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.f.i.o1 r2 = r2.v(r7)     // Catch:{ all -> 0x0b59 }
            byte[] r2 = r2.e()     // Catch:{ all -> 0x0b59 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0b59 }
            r4.<init>()     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = r7.a     // Catch:{ all -> 0x0b59 }
            r4.put(r12, r5)     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = "name"
            java.lang.String r6 = r7.f4163b     // Catch:{ all -> 0x0b59 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = "timestamp"
            long r10 = r7.d     // Catch:{ all -> 0x0b59 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0b59 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0b59 }
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0b59 }
            r4.put(r13, r5)     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = "data"
            r4.put(r5, r2)     // Catch:{ all -> 0x0b59 }
            java.lang.String r2 = "realtime"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0b59 }
            r4.put(r2, r5)     // Catch:{ all -> 0x0b59 }
            android.database.sqlite.SQLiteDatabase r2 = r3.y()     // Catch:{ SQLiteException -> 0x0ad8 }
            r5 = 0
            r6 = r33
            long r4 = r2.insert(r6, r5, r4)     // Catch:{ SQLiteException -> 0x0ad8 }
            r8 = -1
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0ad3
            b.l.a.c.i.b.l4 r2 = r3.a     // Catch:{ SQLiteException -> 0x0ad8 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x0ad8 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ SQLiteException -> 0x0ad8 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r5 = r7.a     // Catch:{ SQLiteException -> 0x0ad8 }
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r5)     // Catch:{ SQLiteException -> 0x0ad8 }
            r2.b(r4, r5)     // Catch:{ SQLiteException -> 0x0ad8 }
            goto L_0x0b26
        L_0x0ad3:
            r2 = 0
            r1.f3982m = r2     // Catch:{ all -> 0x0b59 }
            goto L_0x0b26
        L_0x0ad8:
            r0 = move-exception
            r2 = r0
            b.l.a.c.i.b.l4 r3 = r3.a     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r7.a     // Catch:{ all -> 0x0b59 }
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r5)     // Catch:{ all -> 0x0b59 }
            goto L_0x0b23
        L_0x0aed:
            r0 = move-exception
            r2 = r0
            goto L_0x0b0a
        L_0x0af0:
            r0 = move-exception
            r2 = r0
            b.l.a.c.i.b.l4 r3 = r3.a     // Catch:{ IOException -> 0x0aed }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ IOException -> 0x0aed }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ IOException -> 0x0aed }
            java.lang.String r6 = "Error storing raw event metadata. appId"
            java.lang.String r5 = r5.s()     // Catch:{ IOException -> 0x0aed }
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r5)     // Catch:{ IOException -> 0x0aed }
            r3.c(r6, r5, r2)     // Catch:{ IOException -> 0x0aed }
            throw r2     // Catch:{ IOException -> 0x0aed }
        L_0x0b0a:
            b.l.a.c.i.b.l4 r3 = r1.f3979j     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ all -> 0x0b59 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r4 = r4.s()     // Catch:{ all -> 0x0b59 }
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r4)     // Catch:{ all -> 0x0b59 }
            r34 = r5
            r5 = r4
            r4 = r34
        L_0x0b23:
            r3.c(r4, r5, r2)     // Catch:{ all -> 0x0b59 }
        L_0x0b26:
            b.l.a.c.i.b.j r2 = r35.L()     // Catch:{ all -> 0x0b59 }
            r2.w()     // Catch:{ all -> 0x0b59 }
            b.l.a.c.i.b.j r2 = r35.L()
            r2.x()
            r35.D()
            b.l.a.c.i.b.l4 r2 = r1.f3979j
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.s()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r29
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.b(r4, r3)
            return
        L_0x0b59:
            r0 = move-exception
            r2 = r0
            b.l.a.c.i.b.j r3 = r35.L()
            r3.x()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.h(b.l.a.c.i.b.s, b.l.a.c.i.b.p9):void");
    }

    @WorkerThread
    public final String i(g gVar) {
        t8.b();
        if (!this.f3979j.f4114g.r((String) null, x2.y0) || gVar.e()) {
            return j();
        }
        return null;
    }

    @WorkerThread
    @Deprecated
    public final String j() {
        byte[] bArr = new byte[16];
        this.f3979j.t().d0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v18, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:215|216) */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026a, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        r1.f3979j.a().o().c("Failed to parse upload URL. Not uploading. appId", b.l.a.c.i.b.k3.t(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x054e, code lost:
        if (r4 != null) goto L_0x0550;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
        if (r11 != null) goto L_0x0129;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:215:0x04d3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0293 A[SYNTHETIC, Splitter:B:138:0x0293] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x029c A[Catch:{ all -> 0x012f, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x035b A[Catch:{ all -> 0x012f, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0379 A[Catch:{ all -> 0x012f, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x038a A[Catch:{ all -> 0x012f, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0424 A[Catch:{ all -> 0x012f, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0433 A[Catch:{ all -> 0x012f, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0461 A[Catch:{ MalformedURLException -> 0x04d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0471 A[Catch:{ MalformedURLException -> 0x04d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0487 A[Catch:{ MalformedURLException -> 0x04d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04ec A[Catch:{ all -> 0x012f, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0571 A[SYNTHETIC, Splitter:B:251:0x0571] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0133 A[Catch:{ all -> 0x012f, all -> 0x0575 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:238:0x0550=Splitter:B:238:0x0550, B:125:0x0267=Splitter:B:125:0x0267, B:48:0x0118=Splitter:B:48:0x0118, B:51:0x0129=Splitter:B:51:0x0129, B:135:0x027a=Splitter:B:135:0x027a, B:206:0x044f=Splitter:B:206:0x044f} */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r22 = this;
            r1 = r22
            b.l.a.c.i.b.l4 r0 = r1.f3979j
            b.l.a.c.i.b.i4 r0 = r0.d()
            r0.h()
            r22.R()
            r2 = 1
            r1.s = r2
            r3 = 0
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            r0.e()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.b8 r0 = r0.z()     // Catch:{ all -> 0x0575 }
            java.lang.Boolean r0 = r0.m()     // Catch:{ all -> 0x0575 }
            if (r0 != 0) goto L_0x0030
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.i3 r0 = r0.p()     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            goto L_0x0065
        L_0x0030:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x0043
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.i3 r0 = r0.o()     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            goto L_0x0065
        L_0x0043:
            long r4 = r1.f3982m     // Catch:{ all -> 0x0575 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            goto L_0x0082
        L_0x004c:
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.i4 r0 = r0.d()     // Catch:{ all -> 0x0575 }
            r0.h()     // Catch:{ all -> 0x0575 }
            java.util.List<java.lang.Long> r0 = r1.v     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x0069
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.i3 r0 = r0.s()     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = "Uploading requested multiple times"
        L_0x0065:
            r0.a(r2)     // Catch:{ all -> 0x0575 }
            goto L_0x0085
        L_0x0069:
            b.l.a.c.i.b.p3 r0 = r22.K()     // Catch:{ all -> 0x0575 }
            boolean r0 = r0.l()     // Catch:{ all -> 0x0575 }
            if (r0 != 0) goto L_0x0089
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.i3 r0 = r0.s()     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.a(r2)     // Catch:{ all -> 0x0575 }
        L_0x0082:
            r22.D()     // Catch:{ all -> 0x0575 }
        L_0x0085:
            r1.s = r3
            goto L_0x0569
        L_0x0089:
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.c.p.b r0 = r0.c()     // Catch:{ all -> 0x0575 }
            b.l.a.c.c.p.c r0 = (b.l.a.c.c.p.c) r0
            long r4 = r0.a()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r0 = r0.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.Integer> r8 = b.l.a.c.i.b.x2.Q     // Catch:{ all -> 0x0575 }
            r9 = 0
            int r0 = r0.p(r9, r8)     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r8 = r1.f3979j     // Catch:{ all -> 0x0575 }
            r8.p()     // Catch:{ all -> 0x0575 }
            long r10 = b.l.a.c.i.b.f.A()     // Catch:{ all -> 0x0575 }
            long r10 = r4 - r10
            r8 = r3
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.y(r9, r10)     // Catch:{ all -> 0x0575 }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.x3 r0 = r0.q()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.u3 r0 = r0.f4353e     // Catch:{ all -> 0x0575 }
            long r10 = r0.a()     // Catch:{ all -> 0x0575 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00e2
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.i3 r0 = r0.r()     // Catch:{ all -> 0x0575 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0575 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0575 }
            r0.b(r6, r7)     // Catch:{ all -> 0x0575 }
        L_0x00e2:
            b.l.a.c.i.b.j r0 = r22.L()     // Catch:{ all -> 0x0575 }
            java.lang.String r6 = r0.P()     // Catch:{ all -> 0x0575 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0575 }
            r7 = -1
            if (r0 != 0) goto L_0x04f0
            long r10 = r1.x     // Catch:{ all -> 0x0575 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0137
            b.l.a.c.i.b.j r10 = r22.L()     // Catch:{ all -> 0x0575 }
            android.database.sqlite.SQLiteDatabase r0 = r10.y()     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0116, all -> 0x0114 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0112 }
            if (r0 != 0) goto L_0x010d
            goto L_0x0129
        L_0x010d:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0112 }
            goto L_0x0129
        L_0x0112:
            r0 = move-exception
            goto L_0x0118
        L_0x0114:
            r0 = move-exception
            goto L_0x0131
        L_0x0116:
            r0 = move-exception
            r11 = r9
        L_0x0118:
            b.l.a.c.i.b.l4 r10 = r10.a     // Catch:{ all -> 0x012f }
            b.l.a.c.i.b.k3 r10 = r10.a()     // Catch:{ all -> 0x012f }
            b.l.a.c.i.b.i3 r10 = r10.o()     // Catch:{ all -> 0x012f }
            java.lang.String r12 = "Error querying raw events"
            r10.b(r12, r0)     // Catch:{ all -> 0x012f }
            if (r11 == 0) goto L_0x012c
        L_0x0129:
            r11.close()     // Catch:{ all -> 0x0575 }
        L_0x012c:
            r1.x = r7     // Catch:{ all -> 0x0575 }
            goto L_0x0137
        L_0x012f:
            r0 = move-exception
            r9 = r11
        L_0x0131:
            if (r9 == 0) goto L_0x0136
            r9.close()     // Catch:{ all -> 0x0575 }
        L_0x0136:
            throw r0     // Catch:{ all -> 0x0575 }
        L_0x0137:
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r0 = r0.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.Integer> r7 = b.l.a.c.i.b.x2.f4342g     // Catch:{ all -> 0x0575 }
            int r0 = r0.p(r6, r7)     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r7 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r7 = r7.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.Integer> r8 = b.l.a.c.i.b.x2.f4343h     // Catch:{ all -> 0x0575 }
            int r7 = r7.p(r6, r8)     // Catch:{ all -> 0x0575 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.j r8 = r22.L()     // Catch:{ all -> 0x0575 }
            r8.h()     // Catch:{ all -> 0x0575 }
            r8.i()     // Catch:{ all -> 0x0575 }
            if (r0 <= 0) goto L_0x0161
            r10 = r2
            goto L_0x0162
        L_0x0161:
            r10 = r3
        L_0x0162:
            b.l.a.c.b.a.j(r10)     // Catch:{ all -> 0x0575 }
            if (r7 <= 0) goto L_0x0169
            r10 = r2
            goto L_0x016a
        L_0x0169:
            r10 = r3
        L_0x016a:
            b.l.a.c.b.a.j(r10)     // Catch:{ all -> 0x0575 }
            b.l.a.c.b.a.x(r6)     // Catch:{ all -> 0x0575 }
            android.database.sqlite.SQLiteDatabase r11 = r8.y()     // Catch:{ SQLiteException -> 0x0276, all -> 0x0272 }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x0276, all -> 0x0272 }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0276, all -> 0x0272 }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x0276, all -> 0x0272 }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0276, all -> 0x0272 }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x0276, all -> 0x0272 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x026e }
            if (r0 != 0) goto L_0x01a5
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x026e }
            r11.close()     // Catch:{ all -> 0x0575 }
            r20 = r4
            goto L_0x0296
        L_0x01a5:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x026e }
            r12.<init>()     // Catch:{ SQLiteException -> 0x026e }
            r13 = r3
        L_0x01ab:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x026e }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0244 }
            b.l.a.c.i.b.d9 r2 = r8.f4305b     // Catch:{ IOException -> 0x0244 }
            b.l.a.c.i.b.f9 r2 = r2.P()     // Catch:{ IOException -> 0x0244 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022f }
            r9.<init>(r0)     // Catch:{ IOException -> 0x022f }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x022f }
            r0.<init>(r9)     // Catch:{ IOException -> 0x022f }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x022f }
            r3.<init>()     // Catch:{ IOException -> 0x022f }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x022f }
            r20 = r4
        L_0x01ce:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x022d }
            if (r4 > 0) goto L_0x0228
            r0.close()     // Catch:{ IOException -> 0x022d }
            r9.close()     // Catch:{ IOException -> 0x022d }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x022d }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x026c }
            if (r2 != 0) goto L_0x01ea
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x026c }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01ea
            goto L_0x0267
        L_0x01ea:
            b.l.a.c.f.i.v1 r2 = b.l.a.c.f.i.w1.C0()     // Catch:{ IOException -> 0x0216 }
            b.l.a.c.f.i.f4 r2 = b.l.a.c.i.b.f9.G(r2, r0)     // Catch:{ IOException -> 0x0216 }
            b.l.a.c.f.i.v1 r2 = (b.l.a.c.f.i.v1) r2     // Catch:{ IOException -> 0x0216 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x026c }
            if (r4 != 0) goto L_0x0202
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x026c }
            r2.V(r4)     // Catch:{ SQLiteException -> 0x026c }
        L_0x0202:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x026c }
            int r13 = r13 + r0
            b.l.a.c.f.i.p5 r0 = r2.g()     // Catch:{ SQLiteException -> 0x026c }
            b.l.a.c.f.i.w1 r0 = (b.l.a.c.f.i.w1) r0     // Catch:{ SQLiteException -> 0x026c }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x026c }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x026c }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x026c }
            goto L_0x0257
        L_0x0216:
            r0 = move-exception
            b.l.a.c.i.b.l4 r2 = r8.a     // Catch:{ SQLiteException -> 0x026c }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x026c }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ SQLiteException -> 0x026c }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
        L_0x0223:
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r6)     // Catch:{ SQLiteException -> 0x026c }
            goto L_0x0254
        L_0x0228:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x022d }
            goto L_0x01ce
        L_0x022d:
            r0 = move-exception
            goto L_0x0232
        L_0x022f:
            r0 = move-exception
            r20 = r4
        L_0x0232:
            b.l.a.c.i.b.l4 r2 = r2.a     // Catch:{ IOException -> 0x0242 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ IOException -> 0x0242 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ IOException -> 0x0242 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.b(r3, r0)     // Catch:{ IOException -> 0x0242 }
            throw r0     // Catch:{ IOException -> 0x0242 }
        L_0x0242:
            r0 = move-exception
            goto L_0x0247
        L_0x0244:
            r0 = move-exception
            r20 = r4
        L_0x0247:
            b.l.a.c.i.b.l4 r2 = r8.a     // Catch:{ SQLiteException -> 0x026c }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ SQLiteException -> 0x026c }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ SQLiteException -> 0x026c }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            goto L_0x0223
        L_0x0254:
            r2.c(r3, r4, r0)     // Catch:{ SQLiteException -> 0x026c }
        L_0x0257:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x026c }
            if (r0 == 0) goto L_0x0267
            if (r13 <= r7) goto L_0x0260
            goto L_0x0267
        L_0x0260:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01ab
        L_0x0267:
            r11.close()     // Catch:{ all -> 0x0575 }
            r0 = r12
            goto L_0x0296
        L_0x026c:
            r0 = move-exception
            goto L_0x027a
        L_0x026e:
            r0 = move-exception
            r20 = r4
            goto L_0x027a
        L_0x0272:
            r0 = move-exception
            r9 = 0
            goto L_0x04ea
        L_0x0276:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x027a:
            b.l.a.c.i.b.l4 r2 = r8.a     // Catch:{ all -> 0x04e8 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x04e8 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x04e8 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r6)     // Catch:{ all -> 0x04e8 }
            r2.c(r3, r4, r0)     // Catch:{ all -> 0x04e8 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04e8 }
            if (r11 == 0) goto L_0x0296
            r11.close()     // Catch:{ all -> 0x0575 }
        L_0x0296:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0575 }
            if (r2 != 0) goto L_0x0566
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r2 = r2.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.y0     // Catch:{ all -> 0x0575 }
            r4 = 0
            boolean r2 = r2.r(r4, r3)     // Catch:{ all -> 0x0575 }
            if (r2 == 0) goto L_0x02b8
            b.l.a.c.i.b.g r2 = r1.T(r6)     // Catch:{ all -> 0x0575 }
            boolean r2 = r2.d()     // Catch:{ all -> 0x0575 }
            if (r2 == 0) goto L_0x030d
        L_0x02b8:
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0575 }
        L_0x02bc:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0575 }
            if (r3 == 0) goto L_0x02db
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0575 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0575 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.w1 r3 = (b.l.a.c.f.i.w1) r3     // Catch:{ all -> 0x0575 }
            java.lang.String r4 = r3.y()     // Catch:{ all -> 0x0575 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0575 }
            if (r4 != 0) goto L_0x02bc
            java.lang.String r2 = r3.y()     // Catch:{ all -> 0x0575 }
            goto L_0x02dc
        L_0x02db:
            r2 = 0
        L_0x02dc:
            if (r2 == 0) goto L_0x030d
            r3 = 0
        L_0x02df:
            int r4 = r0.size()     // Catch:{ all -> 0x0575 }
            if (r3 >= r4) goto L_0x030d
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0575 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0575 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.w1 r4 = (b.l.a.c.f.i.w1) r4     // Catch:{ all -> 0x0575 }
            java.lang.String r5 = r4.y()     // Catch:{ all -> 0x0575 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0575 }
            if (r5 == 0) goto L_0x02fa
            goto L_0x030a
        L_0x02fa:
            java.lang.String r4 = r4.y()     // Catch:{ all -> 0x0575 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0575 }
            if (r4 != 0) goto L_0x030a
            r2 = 0
            java.util.List r0 = r0.subList(r2, r3)     // Catch:{ all -> 0x0575 }
            goto L_0x030d
        L_0x030a:
            int r3 = r3 + 1
            goto L_0x02df
        L_0x030d:
            b.l.a.c.f.i.t1 r2 = b.l.a.c.f.i.u1.u()     // Catch:{ all -> 0x0575 }
            int r3 = r0.size()     // Catch:{ all -> 0x0575 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0575 }
            int r5 = r0.size()     // Catch:{ all -> 0x0575 }
            r4.<init>(r5)     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r5 = r5.p()     // Catch:{ all -> 0x0575 }
            boolean r5 = r5.x(r6)     // Catch:{ all -> 0x0575 }
            if (r5 == 0) goto L_0x0348
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r5 = r5.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r7 = b.l.a.c.i.b.x2.y0     // Catch:{ all -> 0x0575 }
            r8 = 0
            boolean r5 = r5.r(r8, r7)     // Catch:{ all -> 0x0575 }
            if (r5 == 0) goto L_0x0346
            b.l.a.c.i.b.g r5 = r1.T(r6)     // Catch:{ all -> 0x0575 }
            boolean r5 = r5.d()     // Catch:{ all -> 0x0575 }
            if (r5 == 0) goto L_0x0348
        L_0x0346:
            r5 = 1
            goto L_0x0349
        L_0x0348:
            r5 = 0
        L_0x0349:
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r7 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r7 = r7.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r8 = b.l.a.c.i.b.x2.y0     // Catch:{ all -> 0x0575 }
            r9 = 0
            boolean r7 = r7.r(r9, r8)     // Catch:{ all -> 0x0575 }
            if (r7 == 0) goto L_0x0368
            b.l.a.c.i.b.g r7 = r1.T(r6)     // Catch:{ all -> 0x0575 }
            boolean r7 = r7.d()     // Catch:{ all -> 0x0575 }
            if (r7 == 0) goto L_0x0366
            goto L_0x0368
        L_0x0366:
            r7 = 0
            goto L_0x0369
        L_0x0368:
            r7 = 1
        L_0x0369:
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r9 = r9.p()     // Catch:{ all -> 0x0575 }
            r10 = 0
            boolean r8 = r9.r(r10, r8)     // Catch:{ all -> 0x0575 }
            if (r8 == 0) goto L_0x0386
            b.l.a.c.i.b.g r8 = r1.T(r6)     // Catch:{ all -> 0x0575 }
            boolean r8 = r8.e()     // Catch:{ all -> 0x0575 }
            if (r8 == 0) goto L_0x0384
            goto L_0x0386
        L_0x0384:
            r8 = 0
            goto L_0x0387
        L_0x0386:
            r8 = 1
        L_0x0387:
            r9 = 0
        L_0x0388:
            if (r9 >= r3) goto L_0x0411
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x0575 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0575 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.w1 r10 = (b.l.a.c.f.i.w1) r10     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.m5 r10 = r10.n()     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.v1 r10 = (b.l.a.c.f.i.v1) r10     // Catch:{ all -> 0x0575 }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x0575 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0575 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x0575 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0575 }
            r4.add(r11)     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r11 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r11 = r11.p()     // Catch:{ all -> 0x0575 }
            r11.n()     // Catch:{ all -> 0x0575 }
            r10.w()     // Catch:{ all -> 0x0575 }
            r11 = r20
            r10.s0(r11)     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r13 = r1.f3979j     // Catch:{ all -> 0x0575 }
            r13.e()     // Catch:{ all -> 0x0575 }
            r13 = 0
            r10.K(r13)     // Catch:{ all -> 0x0575 }
            if (r5 != 0) goto L_0x03c6
            r10.U()     // Catch:{ all -> 0x0575 }
        L_0x03c6:
            b.l.a.c.f.i.t8.b()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r13 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r13 = r13.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r14 = b.l.a.c.i.b.x2.y0     // Catch:{ all -> 0x0575 }
            r15 = 0
            boolean r13 = r13.r(r15, r14)     // Catch:{ all -> 0x0575 }
            if (r13 == 0) goto L_0x03e5
            if (r7 != 0) goto L_0x03e0
            r10.y()     // Catch:{ all -> 0x0575 }
            r10.A()     // Catch:{ all -> 0x0575 }
        L_0x03e0:
            if (r8 != 0) goto L_0x03e5
            r10.C()     // Catch:{ all -> 0x0575 }
        L_0x03e5:
            b.l.a.c.i.b.l4 r13 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f r13 = r13.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r14 = b.l.a.c.i.b.x2.W     // Catch:{ all -> 0x0575 }
            boolean r13 = r13.r(r6, r14)     // Catch:{ all -> 0x0575 }
            if (r13 == 0) goto L_0x0408
            b.l.a.c.f.i.p5 r13 = r10.g()     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.w1 r13 = (b.l.a.c.f.i.w1) r13     // Catch:{ all -> 0x0575 }
            byte[] r13 = r13.e()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.f9 r14 = r22.P()     // Catch:{ all -> 0x0575 }
            long r13 = r14.E(r13)     // Catch:{ all -> 0x0575 }
            r10.Z(r13)     // Catch:{ all -> 0x0575 }
        L_0x0408:
            r2.n(r10)     // Catch:{ all -> 0x0575 }
            int r9 = r9 + 1
            r20 = r11
            goto L_0x0388
        L_0x0411:
            r11 = r20
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = r0.v()     // Catch:{ all -> 0x0575 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x0433
            b.l.a.c.i.b.f9 r0 = r22.P()     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.p5 r5 = r2.g()     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.u1 r5 = (b.l.a.c.f.i.u1) r5     // Catch:{ all -> 0x0575 }
            java.lang.String r0 = r0.w(r5)     // Catch:{ all -> 0x0575 }
            goto L_0x0434
        L_0x0433:
            r0 = 0
        L_0x0434:
            r22.P()     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.p5 r5 = r2.g()     // Catch:{ all -> 0x0575 }
            b.l.a.c.f.i.u1 r5 = (b.l.a.c.f.i.u1) r5     // Catch:{ all -> 0x0575 }
            byte[] r14 = r5.e()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0575 }
            r5.p()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.w2<java.lang.String> r5 = b.l.a.c.i.b.x2.f4352q     // Catch:{ all -> 0x0575 }
            r9 = 0
            java.lang.Object r5 = r5.a(r9)     // Catch:{ all -> 0x0575 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0575 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x04d3 }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x04d3 }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x04d3 }
            r8 = 1
            r7 = r7 ^ r8
            b.l.a.c.b.a.j(r7)     // Catch:{ MalformedURLException -> 0x04d3 }
            java.util.List<java.lang.Long> r7 = r1.v     // Catch:{ MalformedURLException -> 0x04d3 }
            if (r7 == 0) goto L_0x0471
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.k3 r4 = r4.a()     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.i3 r4 = r4.o()     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.a(r7)     // Catch:{ MalformedURLException -> 0x04d3 }
            goto L_0x0478
        L_0x0471:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x04d3 }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x04d3 }
            r1.v = r7     // Catch:{ MalformedURLException -> 0x04d3 }
        L_0x0478:
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.x3 r4 = r4.q()     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.u3 r4 = r4.f     // Catch:{ MalformedURLException -> 0x04d3 }
            r4.b(r11)     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x048f
            b.l.a.c.f.i.w1 r2 = r2.m()     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.String r4 = r2.s()     // Catch:{ MalformedURLException -> 0x04d3 }
        L_0x048f:
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.i3 r2 = r2.s()     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x04d3 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x04d3 }
            r2.d(r3, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x04d3 }
            r2 = 1
            r1.r = r2     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.p3 r11 = r22.K()     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.w8 r0 = new b.l.a.c.i.b.w8     // Catch:{ MalformedURLException -> 0x04d3 }
            r0.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x04d3 }
            r11.h()     // Catch:{ MalformedURLException -> 0x04d3 }
            r11.i()     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.b.a.A(r13)     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.b.a.A(r14)     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.b.a.A(r0)     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.l4 r2 = r11.a     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.i4 r2 = r2.d()     // Catch:{ MalformedURLException -> 0x04d3 }
            b.l.a.c.i.b.o3 r3 = new b.l.a.c.i.b.o3     // Catch:{ MalformedURLException -> 0x04d3 }
            r15 = 0
            r10 = r3
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x04d3 }
            r2.t(r3)     // Catch:{ MalformedURLException -> 0x04d3 }
            goto L_0x0566
        L_0x04d3:
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.i3 r0 = r0.o()     // Catch:{ all -> 0x0575 }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = b.l.a.c.i.b.k3.t(r6)     // Catch:{ all -> 0x0575 }
            r0.c(r2, r3, r5)     // Catch:{ all -> 0x0575 }
            goto L_0x0566
        L_0x04e8:
            r0 = move-exception
            r9 = r11
        L_0x04ea:
            if (r9 == 0) goto L_0x04ef
            r9.close()     // Catch:{ all -> 0x0575 }
        L_0x04ef:
            throw r0     // Catch:{ all -> 0x0575 }
        L_0x04f0:
            r11 = r4
            r1.x = r7     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.j r2 = r22.L()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0575 }
            r0.p()     // Catch:{ all -> 0x0575 }
            long r3 = b.l.a.c.i.b.f.A()     // Catch:{ all -> 0x0575 }
            long r4 = r11 - r3
            r2.h()     // Catch:{ all -> 0x0575 }
            r2.i()     // Catch:{ all -> 0x0575 }
            android.database.sqlite.SQLiteDatabase r0 = r2.y()     // Catch:{ SQLiteException -> 0x053d, all -> 0x053b }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x053d, all -> 0x053b }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x053d, all -> 0x053b }
            r5 = 0
            r3[r5] = r4     // Catch:{ SQLiteException -> 0x053d, all -> 0x053b }
            java.lang.String r4 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r4 = r0.rawQuery(r4, r3)     // Catch:{ SQLiteException -> 0x053d, all -> 0x053b }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0539 }
            if (r0 != 0) goto L_0x0532
            b.l.a.c.i.b.l4 r0 = r2.a     // Catch:{ SQLiteException -> 0x0539 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x0539 }
            b.l.a.c.i.b.i3 r0 = r0.s()     // Catch:{ SQLiteException -> 0x0539 }
            java.lang.String r3 = "No expired configs for apps with pending events"
            r0.a(r3)     // Catch:{ SQLiteException -> 0x0539 }
            goto L_0x0550
        L_0x0532:
            r3 = 0
            java.lang.String r0 = r4.getString(r3)     // Catch:{ SQLiteException -> 0x0539 }
            r9 = r0
            goto L_0x0550
        L_0x0539:
            r0 = move-exception
            goto L_0x053f
        L_0x053b:
            r0 = move-exception
            goto L_0x056f
        L_0x053d:
            r0 = move-exception
            r4 = r9
        L_0x053f:
            b.l.a.c.i.b.l4 r2 = r2.a     // Catch:{ all -> 0x056d }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x056d }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x056d }
            java.lang.String r3 = "Error selecting expired configs"
            r2.b(r3, r0)     // Catch:{ all -> 0x056d }
            if (r4 == 0) goto L_0x0553
        L_0x0550:
            r4.close()     // Catch:{ all -> 0x0575 }
        L_0x0553:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0575 }
            if (r0 != 0) goto L_0x0566
            b.l.a.c.i.b.j r0 = r22.L()     // Catch:{ all -> 0x0575 }
            b.l.a.c.i.b.a5 r0 = r0.L(r9)     // Catch:{ all -> 0x0575 }
            if (r0 == 0) goto L_0x0566
            r1.l(r0)     // Catch:{ all -> 0x0575 }
        L_0x0566:
            r2 = 0
            r1.s = r2
        L_0x0569:
            r22.E()
            return
        L_0x056d:
            r0 = move-exception
            r9 = r4
        L_0x056f:
            if (r9 == 0) goto L_0x0574
            r9.close()     // Catch:{ all -> 0x0575 }
        L_0x0574:
            throw r0     // Catch:{ all -> 0x0575 }
        L_0x0575:
            r0 = move-exception
            r2 = 0
            r1.s = r2
            r22.E()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.k():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x0099;
     */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(b.l.a.c.i.b.a5 r13) {
        /*
            r12 = this;
            b.l.a.c.i.b.l4 r0 = r12.f3979j
            b.l.a.c.i.b.i4 r0 = r0.d()
            r0.h()
            b.l.a.c.f.i.y9.b()
            b.l.a.c.i.b.l4 r0 = r12.f3979j
            b.l.a.c.i.b.f r0 = r0.f4114g
            java.lang.String r1 = r13.y()
            b.l.a.c.i.b.w2<java.lang.Boolean> r2 = b.l.a.c.i.b.x2.i0
            boolean r0 = r0.r(r1, r2)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r13.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r13.F()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r13.D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003b
            goto L_0x006b
        L_0x003b:
            java.lang.String r4 = r13.y()
            r5 = 204(0xcc, float:2.86E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r12
            r3.m(r4, r5, r6, r7, r8)
            return
        L_0x0049:
            java.lang.String r0 = r13.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r13.D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006b
            java.lang.String r4 = r13.y()
            r5 = 204(0xcc, float:2.86E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r12
            r3.m(r4, r5, r6, r7, r8)
            return
        L_0x006b:
            b.l.a.c.i.b.l4 r0 = r12.f3979j
            b.l.a.c.i.b.f r0 = r0.f4114g
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r3 = r13.B()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x009d
            b.l.a.c.f.i.y9.b()
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.i.b.f r3 = r3.f4114g
            java.lang.String r4 = r13.y()
            boolean r2 = r3.r(r4, r2)
            if (r2 == 0) goto L_0x0099
            java.lang.String r3 = r13.F()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x009d
        L_0x0099:
            java.lang.String r3 = r13.D()
        L_0x009d:
            b.l.a.c.i.b.w2<java.lang.String> r2 = b.l.a.c.i.b.x2.f4341e
            r4 = 0
            java.lang.Object r2 = r2.a(r4)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r1.scheme(r2)
            b.l.a.c.i.b.w2<java.lang.String> r5 = b.l.a.c.i.b.x2.f
            java.lang.Object r5 = r5.a(r4)
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri$Builder r2 = r2.encodedAuthority(r5)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "config/app/"
            int r6 = r3.length()
            if (r6 == 0) goto L_0x00c7
            java.lang.String r3 = r5.concat(r3)
            goto L_0x00cc
        L_0x00c7:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L_0x00cc:
            android.net.Uri$Builder r2 = r2.path(r3)
            java.lang.String r3 = r13.z()
            java.lang.String r5 = "app_instance_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r5, r3)
            java.lang.String r3 = "platform"
            java.lang.String r5 = "android"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r3, r5)
            r0.n()
            r5 = 39000(0x9858, double:1.92686E-319)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r3 = "gmp_version"
            r2.appendQueryParameter(r3, r0)
            android.net.Uri r0 = r1.build()
            java.lang.String r0 = r0.toString()
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0168 }
            r8.<init>(r0)     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.l4 r1 = r12.f3979j     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.i3 r1 = r1.f4096n     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r2 = "Fetching remote configuration"
            java.lang.String r3 = r13.y()     // Catch:{ MalformedURLException -> 0x0168 }
            r1.b(r2, r3)     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.e4 r1 = r12.J()     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r2 = r13.y()     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.f.i.c1 r1 = r1.l(r2)     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.e4 r2 = r12.J()     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r3 = r13.y()     // Catch:{ MalformedURLException -> 0x0168 }
            r2.h()     // Catch:{ MalformedURLException -> 0x0168 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f3990i     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ MalformedURLException -> 0x0168 }
            if (r1 == 0) goto L_0x0140
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ MalformedURLException -> 0x0168 }
            if (r1 != 0) goto L_0x0140
            androidx.collection.ArrayMap r4 = new androidx.collection.ArrayMap     // Catch:{ MalformedURLException -> 0x0168 }
            r4.<init>()     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r1 = "If-Modified-Since"
            r4.put(r1, r2)     // Catch:{ MalformedURLException -> 0x0168 }
        L_0x0140:
            r10 = r4
            r1 = 1
            r12.f3986q = r1     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.p3 r6 = r12.K()     // Catch:{ MalformedURLException -> 0x0168 }
            java.lang.String r7 = r13.y()     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.x8 r11 = new b.l.a.c.i.b.x8     // Catch:{ MalformedURLException -> 0x0168 }
            r11.<init>(r12)     // Catch:{ MalformedURLException -> 0x0168 }
            r6.h()     // Catch:{ MalformedURLException -> 0x0168 }
            r6.i()     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.l4 r1 = r6.a     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.i4 r1 = r1.d()     // Catch:{ MalformedURLException -> 0x0168 }
            b.l.a.c.i.b.o3 r2 = new b.l.a.c.i.b.o3     // Catch:{ MalformedURLException -> 0x0168 }
            r9 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ MalformedURLException -> 0x0168 }
            r1.t(r2)     // Catch:{ MalformedURLException -> 0x0168 }
            return
        L_0x0168:
            b.l.a.c.i.b.l4 r1 = r12.f3979j
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            java.lang.String r13 = r13.y()
            java.lang.Object r13 = b.l.a.c.i.b.k3.t(r13)
            java.lang.String r2 = "Failed to parse config URL. Not fetching. appId"
            r1.c(r2, r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.l(b.l.a.c.i.b.a5):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ all -> 0x005c, all -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f A[Catch:{ all -> 0x005c, all -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012b A[Catch:{ all -> 0x005c, all -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0139 A[Catch:{ all -> 0x005c, all -> 0x0179 }] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
            r7 = this;
            b.l.a.c.i.b.l4 r0 = r7.f3979j
            b.l.a.c.i.b.i4 r0 = r0.d()
            r0.h()
            r7.R()
            b.l.a.c.b.a.x(r8)
            r0 = 0
            if (r11 != 0) goto L_0x0014
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x0179 }
        L_0x0014:
            b.l.a.c.i.b.l4 r1 = r7.f3979j     // Catch:{ all -> 0x0179 }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ all -> 0x0179 }
            b.l.a.c.i.b.i3 r1 = r1.f4096n     // Catch:{ all -> 0x0179 }
            int r2 = r11.length     // Catch:{ all -> 0x0179 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0179 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.b(r3, r2)     // Catch:{ all -> 0x0179 }
            b.l.a.c.i.b.j r1 = r7.L()     // Catch:{ all -> 0x0179 }
            r1.v()     // Catch:{ all -> 0x0179 }
            b.l.a.c.i.b.j r1 = r7.L()     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.a5 r1 = r1.L(r8)     // Catch:{ all -> 0x005c }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r9 == r3) goto L_0x0042
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 == r3) goto L_0x0042
            if (r9 != r4) goto L_0x0046
            r9 = r4
        L_0x0042:
            if (r10 != 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = r0
        L_0x0047:
            if (r1 != 0) goto L_0x005f
            b.l.a.c.i.b.l4 r9 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.k3 r9 = r9.a()     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.i3 r9 = r9.f4091i     // Catch:{ all -> 0x005c }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = b.l.a.c.i.b.k3.t(r8)     // Catch:{ all -> 0x005c }
            r9.b(r10, r8)     // Catch:{ all -> 0x005c }
            goto L_0x015d
        L_0x005c:
            r8 = move-exception
            goto L_0x0171
        L_0x005f:
            r5 = 404(0x194, float:5.66E-43)
            r6 = 0
            if (r3 != 0) goto L_0x00d8
            if (r9 != r5) goto L_0x0067
            goto L_0x00d8
        L_0x0067:
            b.l.a.c.i.b.l4 r11 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.c.p.b r11 = r11.f4121n     // Catch:{ all -> 0x005c }
            b.l.a.c.c.p.c r11 = (b.l.a.c.c.p.c) r11     // Catch:{ all -> 0x005c }
            java.util.Objects.requireNonNull(r11)     // Catch:{ all -> 0x005c }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005c }
            r1.m(r11)     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.j r11 = r7.L()     // Catch:{ all -> 0x005c }
            r11.M(r1)     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.l4 r11 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.k3 r11 = r11.a()     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.i3 r11 = r11.f4096n     // Catch:{ all -> 0x005c }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x005c }
            r11.c(r12, r1, r10)     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.e4 r10 = r7.J()     // Catch:{ all -> 0x005c }
            r10.h()     // Catch:{ all -> 0x005c }
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f3990i     // Catch:{ all -> 0x005c }
            r10.put(r8, r6)     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.l4 r8 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.x3 r8 = r8.q()     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.u3 r8 = r8.f     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.l4 r10 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.c.p.b r10 = r10.f4121n     // Catch:{ all -> 0x005c }
            b.l.a.c.c.p.c r10 = (b.l.a.c.c.p.c) r10     // Catch:{ all -> 0x005c }
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x005c }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005c }
            r8.b(r10)     // Catch:{ all -> 0x005c }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00bb
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00d3
        L_0x00bb:
            b.l.a.c.i.b.l4 r8 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.x3 r8 = r8.q()     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.u3 r8 = r8.f4354g     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.l4 r9 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.c.p.b r9 = r9.f4121n     // Catch:{ all -> 0x005c }
            b.l.a.c.c.p.c r9 = (b.l.a.c.c.p.c) r9     // Catch:{ all -> 0x005c }
            java.util.Objects.requireNonNull(r9)     // Catch:{ all -> 0x005c }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005c }
            r8.b(r9)     // Catch:{ all -> 0x005c }
        L_0x00d3:
            r7.D()     // Catch:{ all -> 0x005c }
            goto L_0x015d
        L_0x00d8:
            if (r12 == 0) goto L_0x00e3
            java.lang.String r10 = "Last-Modified"
            java.lang.Object r10 = r12.get(r10)     // Catch:{ all -> 0x005c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x005c }
            goto L_0x00e4
        L_0x00e3:
            r10 = r6
        L_0x00e4:
            if (r10 == 0) goto L_0x00f3
            int r12 = r10.size()     // Catch:{ all -> 0x005c }
            if (r12 <= 0) goto L_0x00f3
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x005c }
            goto L_0x00f4
        L_0x00f3:
            r10 = r6
        L_0x00f4:
            if (r9 == r5) goto L_0x0101
            if (r9 != r4) goto L_0x00f9
            goto L_0x0101
        L_0x00f9:
            b.l.a.c.i.b.e4 r12 = r7.J()     // Catch:{ all -> 0x005c }
            r12.n(r8, r11, r10)     // Catch:{ all -> 0x005c }
            goto L_0x0112
        L_0x0101:
            b.l.a.c.i.b.e4 r10 = r7.J()     // Catch:{ all -> 0x005c }
            b.l.a.c.f.i.c1 r10 = r10.l(r8)     // Catch:{ all -> 0x005c }
            if (r10 != 0) goto L_0x0112
            b.l.a.c.i.b.e4 r10 = r7.J()     // Catch:{ all -> 0x005c }
            r10.n(r8, r6, r6)     // Catch:{ all -> 0x005c }
        L_0x0112:
            b.l.a.c.i.b.l4 r10 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.c.p.b r10 = r10.f4121n     // Catch:{ all -> 0x005c }
            b.l.a.c.c.p.c r10 = (b.l.a.c.c.p.c) r10     // Catch:{ all -> 0x005c }
            java.util.Objects.requireNonNull(r10)     // Catch:{ all -> 0x005c }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005c }
            r1.k(r10)     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.j r10 = r7.L()     // Catch:{ all -> 0x005c }
            r10.M(r1)     // Catch:{ all -> 0x005c }
            if (r9 != r5) goto L_0x0139
            b.l.a.c.i.b.l4 r9 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.k3 r9 = r9.a()     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.i3 r9 = r9.f4093k     // Catch:{ all -> 0x005c }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.b(r10, r8)     // Catch:{ all -> 0x005c }
            goto L_0x014a
        L_0x0139:
            b.l.a.c.i.b.l4 r8 = r7.f3979j     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.k3 r8 = r8.a()     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.i3 r8 = r8.f4096n     // Catch:{ all -> 0x005c }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x005c }
            r8.c(r10, r9, r2)     // Catch:{ all -> 0x005c }
        L_0x014a:
            b.l.a.c.i.b.p3 r8 = r7.K()     // Catch:{ all -> 0x005c }
            boolean r8 = r8.l()     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x00d3
            boolean r8 = r7.C()     // Catch:{ all -> 0x005c }
            if (r8 == 0) goto L_0x00d3
            r7.k()     // Catch:{ all -> 0x005c }
        L_0x015d:
            b.l.a.c.i.b.j r8 = r7.L()     // Catch:{ all -> 0x005c }
            r8.w()     // Catch:{ all -> 0x005c }
            b.l.a.c.i.b.j r8 = r7.L()     // Catch:{ all -> 0x0179 }
            r8.x()     // Catch:{ all -> 0x0179 }
            r7.f3986q = r0
            r7.E()
            return
        L_0x0171:
            b.l.a.c.i.b.j r9 = r7.L()     // Catch:{ all -> 0x0179 }
            r9.x()     // Catch:{ all -> 0x0179 }
            throw r8     // Catch:{ all -> 0x0179 }
        L_0x0179:
            r8 = move-exception
            r7.f3986q = r0
            r7.E()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.m(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r10 = this;
            b.l.a.c.i.b.l4 r0 = r10.f3979j
            b.l.a.c.i.b.i4 r0 = r0.d()
            r0.h()
            r10.R()
            boolean r0 = r10.f3981l
            if (r0 != 0) goto L_0x01cd
            r0 = 1
            r10.f3981l = r0
            b.l.a.c.i.b.l4 r1 = r10.f3979j
            b.l.a.c.i.b.i4 r1 = r1.d()
            r1.h()
            b.l.a.c.i.b.l4 r1 = r10.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r2 = b.l.a.c.i.b.x2.h0
            r3 = 0
            boolean r1 = r1.r(r3, r2)
            java.lang.String r2 = "Storage concurrent access okay"
            r4 = 0
            if (r1 == 0) goto L_0x0044
            java.nio.channels.FileLock r1 = r10.t
            if (r1 == 0) goto L_0x0044
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L_0x0037
            goto L_0x0044
        L_0x0037:
            b.l.a.c.i.b.l4 r1 = r10.f3979j
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f4096n
            r1.a(r2)
        L_0x0042:
            r1 = r0
            goto L_0x00af
        L_0x0044:
            b.l.a.c.i.b.j r1 = r10.c
            b.l.a.c.i.b.l4 r1 = r1.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.l4 r1 = r10.f3979j
            android.content.Context r1 = r1.a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "google_app_measurement.db"
            r5.<init>(r1, r6)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            java.lang.String r6 = "rw"
            r1.<init>(r5, r6)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            r10.u = r1     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            r10.t = r1     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            if (r1 == 0) goto L_0x007a
            b.l.a.c.i.b.l4 r1 = r10.f3979j     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            b.l.a.c.i.b.i3 r1 = r1.f4096n     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            goto L_0x0042
        L_0x007a:
            b.l.a.c.i.b.l4 r1 = r10.f3979j     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            b.l.a.c.i.b.i3 r1 = r1.f     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x00a0, IOException -> 0x0094, OverlappingFileLockException -> 0x0088 }
            goto L_0x00ae
        L_0x0088:
            r1 = move-exception
            b.l.a.c.i.b.l4 r2 = r10.f3979j
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f4091i
            java.lang.String r5 = "Storage lock already acquired"
            goto L_0x00ab
        L_0x0094:
            r1 = move-exception
            b.l.a.c.i.b.l4 r2 = r10.f3979j
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f
            java.lang.String r5 = "Failed to access storage lock file"
            goto L_0x00ab
        L_0x00a0:
            r1 = move-exception
            b.l.a.c.i.b.l4 r2 = r10.f3979j
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f
            java.lang.String r5 = "Failed to acquire storage lock"
        L_0x00ab:
            r2.b(r5, r1)
        L_0x00ae:
            r1 = r4
        L_0x00af:
            if (r1 == 0) goto L_0x01cd
            java.nio.channels.FileChannel r1 = r10.u
            b.l.a.c.i.b.l4 r2 = r10.f3979j
            b.l.a.c.i.b.i4 r2 = r2.d()
            r2.h()
            r5 = 0
            java.lang.String r2 = "Bad channel to read from"
            r7 = 4
            if (r1 == 0) goto L_0x0103
            boolean r8 = r1.isOpen()
            if (r8 != 0) goto L_0x00ca
            goto L_0x0103
        L_0x00ca:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r1.position(r5)     // Catch:{ IOException -> 0x00f4 }
            int r1 = r1.read(r8)     // Catch:{ IOException -> 0x00f4 }
            if (r1 == r7) goto L_0x00ec
            r8 = -1
            if (r1 == r8) goto L_0x010e
            b.l.a.c.i.b.l4 r8 = r10.f3979j     // Catch:{ IOException -> 0x00f4 }
            b.l.a.c.i.b.k3 r8 = r8.a()     // Catch:{ IOException -> 0x00f4 }
            b.l.a.c.i.b.i3 r8 = r8.f4091i     // Catch:{ IOException -> 0x00f4 }
            java.lang.String r9 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00f4 }
            r8.b(r9, r1)     // Catch:{ IOException -> 0x00f4 }
            goto L_0x010e
        L_0x00ec:
            r8.flip()     // Catch:{ IOException -> 0x00f4 }
            int r4 = r8.getInt()     // Catch:{ IOException -> 0x00f4 }
            goto L_0x010e
        L_0x00f4:
            r1 = move-exception
            b.l.a.c.i.b.l4 r8 = r10.f3979j
            b.l.a.c.i.b.k3 r8 = r8.a()
            b.l.a.c.i.b.i3 r8 = r8.f
            java.lang.String r9 = "Failed to read from channel"
            r8.b(r9, r1)
            goto L_0x010e
        L_0x0103:
            b.l.a.c.i.b.l4 r1 = r10.f3979j
            b.l.a.c.i.b.k3 r1 = r1.a()
            b.l.a.c.i.b.i3 r1 = r1.f
            r1.a(r2)
        L_0x010e:
            b.l.a.c.i.b.l4 r1 = r10.f3979j
            b.l.a.c.i.b.c3 r1 = r1.b()
            r1.i()
            int r1 = r1.f3937e
            b.l.a.c.i.b.l4 r8 = r10.f3979j
            b.l.a.c.i.b.i4 r8 = r8.d()
            r8.h()
            if (r4 <= r1) goto L_0x013a
            b.l.a.c.i.b.l4 r0 = r10.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
        L_0x0136:
            r0.c(r3, r2, r1)
            return
        L_0x013a:
            if (r4 >= r1) goto L_0x01cd
            java.nio.channels.FileChannel r8 = r10.u
            b.l.a.c.i.b.l4 r9 = r10.f3979j
            b.l.a.c.i.b.i4 r9 = r9.d()
            r9.h()
            if (r8 == 0) goto L_0x01ae
            boolean r9 = r8.isOpen()
            if (r9 != 0) goto L_0x0150
            goto L_0x01ae
        L_0x0150:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r7)
            r2.putInt(r1)
            r2.flip()
            r8.truncate(r5)     // Catch:{ IOException -> 0x019f }
            b.l.a.c.i.b.l4 r5 = r10.f3979j     // Catch:{ IOException -> 0x019f }
            b.l.a.c.i.b.f r5 = r5.f4114g     // Catch:{ IOException -> 0x019f }
            b.l.a.c.i.b.w2<java.lang.Boolean> r6 = b.l.a.c.i.b.x2.r0     // Catch:{ IOException -> 0x019f }
            boolean r3 = r5.r(r3, r6)     // Catch:{ IOException -> 0x019f }
            r8.write(r2)     // Catch:{ IOException -> 0x019f }
            r8.force(r0)     // Catch:{ IOException -> 0x019f }
            long r2 = r8.size()     // Catch:{ IOException -> 0x019f }
            r5 = 4
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x018c
            b.l.a.c.i.b.l4 r0 = r10.f3979j     // Catch:{ IOException -> 0x019f }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ IOException -> 0x019f }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ IOException -> 0x019f }
            java.lang.String r2 = "Error writing to channel. Bytes written"
            long r5 = r8.size()     // Catch:{ IOException -> 0x019f }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x019f }
            r0.b(r2, r3)     // Catch:{ IOException -> 0x019f }
        L_0x018c:
            b.l.a.c.i.b.l4 r0 = r10.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f4096n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            goto L_0x0136
        L_0x019f:
            r0 = move-exception
            b.l.a.c.i.b.l4 r2 = r10.f3979j
            b.l.a.c.i.b.k3 r2 = r2.a()
            b.l.a.c.i.b.i3 r2 = r2.f
            java.lang.String r3 = "Failed to write to channel"
            r2.b(r3, r0)
            goto L_0x01b9
        L_0x01ae:
            b.l.a.c.i.b.l4 r0 = r10.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f
            r0.a(r2)
        L_0x01b9:
            b.l.a.c.i.b.l4 r0 = r10.f3979j
            b.l.a.c.i.b.k3 r0 = r0.a()
            b.l.a.c.i.b.i3 r0 = r0.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            goto L_0x0136
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.n():void");
    }

    @WorkerThread
    public final void o(p9 p9Var) {
        if (this.v != null) {
            ArrayList arrayList = new ArrayList();
            this.w = arrayList;
            arrayList.addAll(this.v);
        }
        j L = L();
        String str = p9Var.f4218h;
        b.l.a.c.b.a.x(str);
        L.h();
        L.i();
        try {
            SQLiteDatabase y2 = L.y();
            String[] strArr = {str};
            int delete = y2.delete("apps", "app_id=?", strArr) + y2.delete(DatabaseHelper.EVENT_TABLE_NAME, "app_id=?", strArr) + y2.delete("user_attributes", "app_id=?", strArr) + y2.delete("conditional_properties", "app_id=?", strArr) + y2.delete("raw_events", "app_id=?", strArr) + y2.delete("raw_events_metadata", "app_id=?", strArr) + y2.delete("queue", "app_id=?", strArr) + y2.delete("audience_filter_values", "app_id=?", strArr) + y2.delete("main_event_params", "app_id=?", strArr) + y2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                L.a.a().f4096n.c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            L.a.a().f.c("Error resetting analytics data. appId, error", k3.t(str), e2);
        }
        if (p9Var.f4225o) {
            r(p9Var);
        }
    }

    @WorkerThread
    public final void p(g9 g9Var, p9 p9Var) {
        long j2;
        this.f3979j.d().h();
        R();
        if (H(p9Var)) {
            if (p9Var.f4225o) {
                int l0 = this.f3979j.t().l0(g9Var.f4021i);
                int i2 = 0;
                k9 t2 = this.f3979j.t();
                String str = g9Var.f4021i;
                if (l0 != 0) {
                    f fVar = this.f3979j.f4114g;
                    String q2 = t2.q(str, 24, true);
                    String str2 = g9Var.f4021i;
                    this.f3979j.t().A(this.z, p9Var.f4218h, l0, "_ev", q2, str2 != null ? str2.length() : 0);
                    return;
                }
                int x2 = t2.x(str, g9Var.V());
                if (x2 != 0) {
                    k9 t3 = this.f3979j.t();
                    String str3 = g9Var.f4021i;
                    f fVar2 = this.f3979j.f4114g;
                    String q3 = t3.q(str3, 24, true);
                    Object V = g9Var.V();
                    if (V != null && ((V instanceof String) || (V instanceof CharSequence))) {
                        i2 = String.valueOf(V).length();
                    }
                    this.f3979j.t().A(this.z, p9Var.f4218h, x2, "_ev", q3, i2);
                    return;
                }
                Object y2 = this.f3979j.t().y(g9Var.f4021i, g9Var.V());
                if (y2 != null) {
                    if ("_sid".equals(g9Var.f4021i)) {
                        long j3 = g9Var.f4022j;
                        String str4 = g9Var.f4025m;
                        i9 D = L().D(p9Var.f4218h, "_sno");
                        if (D != null) {
                            Object obj = D.f4066e;
                            if (obj instanceof Long) {
                                j2 = ((Long) obj).longValue();
                                p(new g9("_sno", j3, Long.valueOf(j2 + 1), str4), p9Var);
                            }
                        }
                        if (D != null) {
                            this.f3979j.a().f4091i.b("Retrieved last session number from database does not contain a valid (long) value", D.f4066e);
                        }
                        o z2 = L().z(p9Var.f4218h, "_s");
                        if (z2 != null) {
                            j2 = z2.c;
                            this.f3979j.a().f4096n.b("Backfill the session number. Last used session number", Long.valueOf(j2));
                        } else {
                            j2 = 0;
                        }
                        p(new g9("_sno", j3, Long.valueOf(j2 + 1), str4), p9Var);
                    }
                    i9 i9Var = new i9(p9Var.f4218h, g9Var.f4025m, g9Var.f4021i, g9Var.f4022j, y2);
                    this.f3979j.a().f4096n.c("Setting user property", this.f3979j.u().r(i9Var.c), y2);
                    L().v();
                    try {
                        u(p9Var);
                        boolean C = L().C(i9Var);
                        L().w();
                        if (!C) {
                            this.f3979j.a().f.c("Too many unique user properties are set. Ignoring user property", this.f3979j.u().r(i9Var.c), i9Var.f4066e);
                            this.f3979j.t().A(this.z, p9Var.f4218h, 9, (String) null, (String) null, 0);
                        }
                    } finally {
                        L().x();
                    }
                }
            } else {
                u(p9Var);
            }
        }
    }

    @WorkerThread
    public final void q(g9 g9Var, p9 p9Var) {
        this.f3979j.d().h();
        R();
        if (H(p9Var)) {
            if (!p9Var.f4225o) {
                u(p9Var);
            } else if (!"_npa".equals(g9Var.f4021i) || p9Var.y == null) {
                this.f3979j.a().f4095m.b("Removing user property", this.f3979j.u().r(g9Var.f4021i));
                L().v();
                try {
                    u(p9Var);
                    L().B(p9Var.f4218h, g9Var.f4021i);
                    L().w();
                    this.f3979j.a().f4095m.b("User property removed", this.f3979j.u().r(g9Var.f4021i));
                } finally {
                    L().x();
                }
            } else {
                this.f3979j.a().f4095m.a("Falling back to manifest metadata value for ad personalization");
                Objects.requireNonNull((c) this.f3979j.f4121n);
                p(new g9("_npa", System.currentTimeMillis(), Long.valueOf(true != p9Var.y.booleanValue() ? 0 : 1), "auto"), p9Var);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0399 A[Catch:{ SQLiteException -> 0x01c3, all -> 0x0473 }] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(b.l.a.c.i.b.p9 r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            b.l.a.c.i.b.l4 r7 = r1.f3979j
            b.l.a.c.i.b.i4 r7 = r7.d()
            r7.h()
            r21.R()
            java.lang.String r7 = "null reference"
            java.util.Objects.requireNonNull(r2, r7)
            java.lang.String r7 = r2.f4218h
            b.l.a.c.b.a.x(r7)
            boolean r7 = r21.H(r22)
            if (r7 != 0) goto L_0x002b
            return
        L_0x002b:
            b.l.a.c.i.b.j r7 = r21.L()
            java.lang.String r8 = r2.f4218h
            b.l.a.c.i.b.a5 r7 = r7.L(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0063
            java.lang.String r10 = r7.B()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0063
            java.lang.String r10 = r2.f4219i
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0063
            r7.k(r8)
            b.l.a.c.i.b.j r10 = r21.L()
            r10.M(r7)
            b.l.a.c.i.b.e4 r7 = r21.J()
            java.lang.String r10 = r2.f4218h
            r7.h()
            java.util.Map<java.lang.String, b.l.a.c.f.i.c1> r7 = r7.f3988g
            r7.remove(r10)
        L_0x0063:
            boolean r7 = r2.f4225o
            if (r7 != 0) goto L_0x006b
            r21.u(r22)
            return
        L_0x006b:
            long r10 = r2.t
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x007e
            b.l.a.c.i.b.l4 r7 = r1.f3979j
            b.l.a.c.c.p.b r7 = r7.f4121n
            b.l.a.c.c.p.c r7 = (b.l.a.c.c.p.c) r7
            java.util.Objects.requireNonNull(r7)
            long r10 = java.lang.System.currentTimeMillis()
        L_0x007e:
            b.l.a.c.i.b.l4 r7 = r1.f3979j
            b.l.a.c.i.b.m r7 = r7.A()
            r7.h()
            r14 = 0
            r7.f = r14
            r7.f4138g = r8
            int r7 = r2.u
            r13 = 1
            if (r7 == 0) goto L_0x00ad
            if (r7 == r13) goto L_0x00ac
            b.l.a.c.i.b.l4 r12 = r1.f3979j
            b.l.a.c.i.b.k3 r12 = r12.a()
            b.l.a.c.i.b.i3 r12 = r12.f4091i
            java.lang.String r14 = r2.f4218h
            java.lang.Object r14 = b.l.a.c.i.b.k3.t(r14)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r15 = "Incorrect app type, assuming installed app. appId, appType"
            r12.c(r15, r14, r7)
            r7 = 0
            goto L_0x00ad
        L_0x00ac:
            r7 = r13
        L_0x00ad:
            b.l.a.c.i.b.j r12 = r21.L()
            r12.v()
            b.l.a.c.i.b.j r12 = r21.L()     // Catch:{ all -> 0x0473 }
            java.lang.String r14 = r2.f4218h     // Catch:{ all -> 0x0473 }
            java.lang.String r15 = "_npa"
            b.l.a.c.i.b.i9 r14 = r12.D(r14, r15)     // Catch:{ all -> 0x0473 }
            if (r14 == 0) goto L_0x00cc
            java.lang.String r12 = "auto"
            java.lang.String r15 = r14.f4065b     // Catch:{ all -> 0x0473 }
            boolean r12 = r12.equals(r15)     // Catch:{ all -> 0x0473 }
            if (r12 == 0) goto L_0x0116
        L_0x00cc:
            java.lang.Boolean r12 = r2.y     // Catch:{ all -> 0x0473 }
            if (r12 == 0) goto L_0x0103
            b.l.a.c.i.b.g9 r15 = new b.l.a.c.i.b.g9     // Catch:{ all -> 0x0473 }
            java.lang.String r18 = "_npa"
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0473 }
            if (r13 == r12) goto L_0x00dd
            r19 = 0
            goto L_0x00df
        L_0x00dd:
            r19 = 1
        L_0x00df:
            java.lang.Long r19 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0473 }
            java.lang.String r20 = "auto"
            r12 = r15
            r8 = r13
            r13 = r18
            r9 = r14
            r8 = r15
            r14 = r10
            r16 = r19
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x0473 }
            if (r9 == 0) goto L_0x00ff
            java.lang.Object r9 = r9.f4066e     // Catch:{ all -> 0x0473 }
            java.lang.Long r12 = r8.f4023k     // Catch:{ all -> 0x0473 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x0473 }
            if (r9 != 0) goto L_0x0116
        L_0x00ff:
            r1.p(r8, r2)     // Catch:{ all -> 0x0473 }
            goto L_0x0116
        L_0x0103:
            r9 = r14
            if (r9 == 0) goto L_0x0116
            b.l.a.c.i.b.g9 r8 = new b.l.a.c.i.b.g9     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x0473 }
            r1.q(r8, r2)     // Catch:{ all -> 0x0473 }
        L_0x0116:
            b.l.a.c.i.b.j r8 = r21.L()     // Catch:{ all -> 0x0473 }
            java.lang.String r9 = r2.f4218h     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.a5 r14 = r8.L(r9)     // Catch:{ all -> 0x0473 }
            if (r14 == 0) goto L_0x01d6
            b.l.a.c.i.b.l4 r8 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.k9 r8 = r8.t()     // Catch:{ all -> 0x0473 }
            java.lang.String r9 = r2.f4219i     // Catch:{ all -> 0x0473 }
            java.lang.String r12 = r14.B()     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = r2.x     // Catch:{ all -> 0x0473 }
            java.lang.String r15 = r14.D()     // Catch:{ all -> 0x0473 }
            boolean r8 = r8.p(r9, r12, r13, r15)     // Catch:{ all -> 0x0473 }
            if (r8 == 0) goto L_0x01d6
            b.l.a.c.i.b.l4 r8 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.k3 r8 = r8.a()     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.i3 r8 = r8.f4091i     // Catch:{ all -> 0x0473 }
            java.lang.String r9 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r12 = r14.y()     // Catch:{ all -> 0x0473 }
            java.lang.Object r12 = b.l.a.c.i.b.k3.t(r12)     // Catch:{ all -> 0x0473 }
            r8.b(r9, r12)     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.j r8 = r21.L()     // Catch:{ all -> 0x0473 }
            java.lang.String r9 = r14.y()     // Catch:{ all -> 0x0473 }
            r8.i()     // Catch:{ all -> 0x0473 }
            r8.h()     // Catch:{ all -> 0x0473 }
            b.l.a.c.b.a.x(r9)     // Catch:{ all -> 0x0473 }
            android.database.sqlite.SQLiteDatabase r12 = r8.y()     // Catch:{ SQLiteException -> 0x01c3 }
            r13 = 1
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x01c3 }
            r13 = 0
            r14[r13] = r9     // Catch:{ SQLiteException -> 0x01c3 }
            java.lang.String r13 = "events"
            int r13 = r12.delete(r13, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            java.lang.String r15 = "user_attributes"
            int r15 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r15
            java.lang.String r15 = "apps"
            int r15 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r12.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01c3 }
            int r13 = r13 + r0
            if (r13 <= 0) goto L_0x01d5
            b.l.a.c.i.b.l4 r0 = r8.a     // Catch:{ SQLiteException -> 0x01c3 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ SQLiteException -> 0x01c3 }
            b.l.a.c.i.b.i3 r0 = r0.f4096n     // Catch:{ SQLiteException -> 0x01c3 }
            java.lang.String r12 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x01c3 }
            r0.c(r12, r9, r13)     // Catch:{ SQLiteException -> 0x01c3 }
            goto L_0x01d5
        L_0x01c3:
            r0 = move-exception
            b.l.a.c.i.b.l4 r8 = r8.a     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.k3 r8 = r8.a()     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.i3 r8 = r8.f     // Catch:{ all -> 0x0473 }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r9 = b.l.a.c.i.b.k3.t(r9)     // Catch:{ all -> 0x0473 }
            r8.c(r12, r9, r0)     // Catch:{ all -> 0x0473 }
        L_0x01d5:
            r14 = 0
        L_0x01d6:
            if (r14 == 0) goto L_0x0235
            long r8 = r14.R()     // Catch:{ all -> 0x0473 }
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x01ef
            long r8 = r14.R()     // Catch:{ all -> 0x0473 }
            long r12 = r2.f4227q     // Catch:{ all -> 0x0473 }
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x01ef
            r0 = 1
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            long r8 = r14.R()     // Catch:{ all -> 0x0473 }
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x020f
            java.lang.String r8 = r14.P()     // Catch:{ all -> 0x0473 }
            if (r8 == 0) goto L_0x020f
            java.lang.String r8 = r14.P()     // Catch:{ all -> 0x0473 }
            java.lang.String r9 = r2.f4220j     // Catch:{ all -> 0x0473 }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0473 }
            if (r8 != 0) goto L_0x020f
            r15 = 1
            goto L_0x0210
        L_0x020f:
            r15 = 0
        L_0x0210:
            r0 = r0 | r15
            if (r0 == 0) goto L_0x0235
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0473 }
            r0.<init>()     // Catch:{ all -> 0x0473 }
            java.lang.String r8 = "_pv"
            java.lang.String r9 = r14.P()     // Catch:{ all -> 0x0473 }
            r0.putString(r8, r9)     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.s r8 = new b.l.a.c.i.b.s     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = "_au"
            b.l.a.c.i.b.q r14 = new b.l.a.c.i.b.q     // Catch:{ all -> 0x0473 }
            r14.<init>(r0)     // Catch:{ all -> 0x0473 }
            java.lang.String r15 = "auto"
            r12 = r8
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x0473 }
            r1.g(r8, r2)     // Catch:{ all -> 0x0473 }
        L_0x0235:
            r21.u(r22)     // Catch:{ all -> 0x0473 }
            if (r7 != 0) goto L_0x0248
            b.l.a.c.i.b.j r0 = r21.L()     // Catch:{ all -> 0x0473 }
            java.lang.String r7 = r2.f4218h     // Catch:{ all -> 0x0473 }
            java.lang.String r8 = "_f"
            b.l.a.c.i.b.o r0 = r0.z(r7, r8)     // Catch:{ all -> 0x0473 }
            r15 = 0
            goto L_0x0255
        L_0x0248:
            b.l.a.c.i.b.j r0 = r21.L()     // Catch:{ all -> 0x0473 }
            java.lang.String r7 = r2.f4218h     // Catch:{ all -> 0x0473 }
            java.lang.String r8 = "_v"
            b.l.a.c.i.b.o r0 = r0.z(r7, r8)     // Catch:{ all -> 0x0473 }
            r15 = 1
        L_0x0255:
            if (r0 != 0) goto L_0x0447
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r10 / r7
            r16 = 1
            long r12 = r12 + r16
            long r12 = r12 * r7
            java.lang.String r0 = "_dac"
            java.lang.String r7 = "_r"
            java.lang.String r8 = "_c"
            java.lang.String r9 = "_et"
            if (r15 != 0) goto L_0x03ce
            b.l.a.c.i.b.g9 r14 = new b.l.a.c.i.b.g9     // Catch:{ all -> 0x0473 }
            java.lang.String r15 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0473 }
            java.lang.String r17 = "auto"
            r12 = r14
            r13 = r15
            r19 = r0
            r0 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x0473 }
            r1.p(r0, r2)     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.i4 r0 = r0.d()     // Catch:{ all -> 0x0473 }
            r0.h()     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.b4 r0 = r0.x     // Catch:{ all -> 0x0473 }
            java.lang.String r12 = r2.f4218h     // Catch:{ all -> 0x0473 }
            r0.a(r12)     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.i4 r0 = r0.d()     // Catch:{ all -> 0x0473 }
            r0.h()     // Catch:{ all -> 0x0473 }
            r21.R()     // Catch:{ all -> 0x0473 }
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{ all -> 0x0473 }
            r14.<init>()     // Catch:{ all -> 0x0473 }
            r12 = 1
            r14.putLong(r8, r12)     // Catch:{ all -> 0x0473 }
            r14.putLong(r7, r12)     // Catch:{ all -> 0x0473 }
            r7 = 0
            r14.putLong(r6, r7)     // Catch:{ all -> 0x0473 }
            r14.putLong(r5, r7)     // Catch:{ all -> 0x0473 }
            r14.putLong(r4, r7)     // Catch:{ all -> 0x0473 }
            r14.putLong(r3, r7)     // Catch:{ all -> 0x0473 }
            r14.putLong(r9, r12)     // Catch:{ all -> 0x0473 }
            boolean r0 = r2.w     // Catch:{ all -> 0x0473 }
            if (r0 == 0) goto L_0x02c6
            r0 = r19
            r14.putLong(r0, r12)     // Catch:{ all -> 0x0473 }
        L_0x02c6:
            b.l.a.c.i.b.j r0 = r21.L()     // Catch:{ all -> 0x0473 }
            java.lang.String r7 = r2.f4218h     // Catch:{ all -> 0x0473 }
            b.l.a.c.b.a.x(r7)     // Catch:{ all -> 0x0473 }
            r0.h()     // Catch:{ all -> 0x0473 }
            r0.i()     // Catch:{ all -> 0x0473 }
            java.lang.String r8 = "first_open_count"
            long r7 = r0.m(r7, r8)     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0473 }
            android.content.Context r0 = r0.a     // Catch:{ all -> 0x0473 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0473 }
            if (r0 != 0) goto L_0x02fb
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.k3 r0 = r0.a()     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.i3 r0 = r0.f     // Catch:{ all -> 0x0473 }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r4 = r2.f4218h     // Catch:{ all -> 0x0473 }
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r4)     // Catch:{ all -> 0x0473 }
            r0.b(r3, r4)     // Catch:{ all -> 0x0473 }
            r3 = r14
            goto L_0x03b3
        L_0x02fb:
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ NameNotFoundException -> 0x030b }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x030b }
            b.l.a.c.c.q.a r0 = b.l.a.c.c.q.b.a(r0)     // Catch:{ NameNotFoundException -> 0x030b }
            java.lang.String r12 = r2.f4218h     // Catch:{ NameNotFoundException -> 0x030b }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.b(r12, r13)     // Catch:{ NameNotFoundException -> 0x030b }
            goto L_0x0320
        L_0x030b:
            r0 = move-exception
            b.l.a.c.i.b.l4 r12 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.k3 r12 = r12.a()     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.i3 r12 = r12.f     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r15 = r2.f4218h     // Catch:{ all -> 0x0473 }
            java.lang.Object r15 = b.l.a.c.i.b.k3.t(r15)     // Catch:{ all -> 0x0473 }
            r12.c(r13, r15, r0)     // Catch:{ all -> 0x0473 }
            r0 = 0
        L_0x0320:
            if (r0 == 0) goto L_0x036c
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x0473 }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x036c
            r19 = r3
            r20 = r4
            long r3 = r0.lastUpdateTime     // Catch:{ all -> 0x0473 }
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x034e
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.f r0 = r0.f4114g     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.m0     // Catch:{ all -> 0x0473 }
            r4 = 0
            boolean r0 = r0.r(r4, r3)     // Catch:{ all -> 0x0473 }
            if (r0 == 0) goto L_0x0347
            r12 = 0
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x034c
        L_0x0347:
            r12 = 1
            r14.putLong(r6, r12)     // Catch:{ all -> 0x0473 }
        L_0x034c:
            r15 = 0
            goto L_0x0350
        L_0x034e:
            r4 = 0
            r15 = 1
        L_0x0350:
            b.l.a.c.i.b.g9 r0 = new b.l.a.c.i.b.g9     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = "_fi"
            r3 = 1
            if (r3 == r15) goto L_0x035a
            r15 = 0
            goto L_0x035c
        L_0x035a:
            r15 = 1
        L_0x035c:
            java.lang.Long r16 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0473 }
            java.lang.String r17 = "auto"
            r12 = r0
            r3 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x0473 }
            r1.p(r0, r2)     // Catch:{ all -> 0x0473 }
            goto L_0x0372
        L_0x036c:
            r19 = r3
            r20 = r4
            r3 = r14
            r4 = 0
        L_0x0372:
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ NameNotFoundException -> 0x0382 }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x0382 }
            b.l.a.c.c.q.a r0 = b.l.a.c.c.q.b.a(r0)     // Catch:{ NameNotFoundException -> 0x0382 }
            java.lang.String r6 = r2.f4218h     // Catch:{ NameNotFoundException -> 0x0382 }
            r12 = 0
            android.content.pm.ApplicationInfo r14 = r0.a(r6, r12)     // Catch:{ NameNotFoundException -> 0x0382 }
            goto L_0x0397
        L_0x0382:
            r0 = move-exception
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.k3 r6 = r6.a()     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.i3 r6 = r6.f     // Catch:{ all -> 0x0473 }
            java.lang.String r12 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r13 = r2.f4218h     // Catch:{ all -> 0x0473 }
            java.lang.Object r13 = b.l.a.c.i.b.k3.t(r13)     // Catch:{ all -> 0x0473 }
            r6.c(r12, r13, r0)     // Catch:{ all -> 0x0473 }
            r14 = r4
        L_0x0397:
            if (r14 == 0) goto L_0x03b3
            int r0 = r14.flags     // Catch:{ all -> 0x0473 }
            r4 = 1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x03a6
            r4 = r20
            r12 = 1
            r3.putLong(r4, r12)     // Catch:{ all -> 0x0473 }
        L_0x03a6:
            int r0 = r14.flags     // Catch:{ all -> 0x0473 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03b3
            r4 = r19
            r12 = 1
            r3.putLong(r4, r12)     // Catch:{ all -> 0x0473 }
        L_0x03b3:
            r12 = 0
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x03bc
            r3.putLong(r5, r7)     // Catch:{ all -> 0x0473 }
        L_0x03bc:
            b.l.a.c.i.b.s r0 = new b.l.a.c.i.b.s     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = "_f"
            b.l.a.c.i.b.q r14 = new b.l.a.c.i.b.q     // Catch:{ all -> 0x0473 }
            r14.<init>(r3)     // Catch:{ all -> 0x0473 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x0473 }
            goto L_0x0415
        L_0x03ce:
            b.l.a.c.i.b.g9 r3 = new b.l.a.c.i.b.g9     // Catch:{ all -> 0x0473 }
            java.lang.String r4 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0473 }
            java.lang.String r17 = "auto"
            r12 = r3
            r13 = r4
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x0473 }
            r1.p(r3, r2)     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.l4 r3 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.i4 r3 = r3.d()     // Catch:{ all -> 0x0473 }
            r3.h()     // Catch:{ all -> 0x0473 }
            r21.R()     // Catch:{ all -> 0x0473 }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x0473 }
            r3.<init>()     // Catch:{ all -> 0x0473 }
            r4 = 1
            r3.putLong(r8, r4)     // Catch:{ all -> 0x0473 }
            r3.putLong(r7, r4)     // Catch:{ all -> 0x0473 }
            r3.putLong(r9, r4)     // Catch:{ all -> 0x0473 }
            boolean r6 = r2.w     // Catch:{ all -> 0x0473 }
            if (r6 == 0) goto L_0x0404
            r3.putLong(r0, r4)     // Catch:{ all -> 0x0473 }
        L_0x0404:
            b.l.a.c.i.b.s r0 = new b.l.a.c.i.b.s     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = "_v"
            b.l.a.c.i.b.q r14 = new b.l.a.c.i.b.q     // Catch:{ all -> 0x0473 }
            r14.<init>(r3)     // Catch:{ all -> 0x0473 }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x0473 }
        L_0x0415:
            r1.b(r0, r2)     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.l4 r0 = r1.f3979j     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.f r0 = r0.f4114g     // Catch:{ all -> 0x0473 }
            java.lang.String r3 = r2.f4218h     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r4 = b.l.a.c.i.b.x2.U     // Catch:{ all -> 0x0473 }
            boolean r0 = r0.r(r3, r4)     // Catch:{ all -> 0x0473 }
            if (r0 != 0) goto L_0x0464
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0473 }
            r0.<init>()     // Catch:{ all -> 0x0473 }
            r3 = 1
            r0.putLong(r9, r3)     // Catch:{ all -> 0x0473 }
            java.lang.String r5 = "_fr"
            r0.putLong(r5, r3)     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.s r3 = new b.l.a.c.i.b.s     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = "_e"
            b.l.a.c.i.b.q r14 = new b.l.a.c.i.b.q     // Catch:{ all -> 0x0473 }
            r14.<init>(r0)     // Catch:{ all -> 0x0473 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x0473 }
            goto L_0x0461
        L_0x0447:
            boolean r0 = r2.f4226p     // Catch:{ all -> 0x0473 }
            if (r0 == 0) goto L_0x0464
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0473 }
            r0.<init>()     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.s r3 = new b.l.a.c.i.b.s     // Catch:{ all -> 0x0473 }
            java.lang.String r13 = "_cd"
            b.l.a.c.i.b.q r14 = new b.l.a.c.i.b.q     // Catch:{ all -> 0x0473 }
            r14.<init>(r0)     // Catch:{ all -> 0x0473 }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x0473 }
        L_0x0461:
            r1.b(r3, r2)     // Catch:{ all -> 0x0473 }
        L_0x0464:
            b.l.a.c.i.b.j r0 = r21.L()     // Catch:{ all -> 0x0473 }
            r0.w()     // Catch:{ all -> 0x0473 }
            b.l.a.c.i.b.j r0 = r21.L()
            r0.x()
            return
        L_0x0473:
            r0 = move-exception
            b.l.a.c.i.b.j r2 = r21.L()
            r2.x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.r(b.l.a.c.i.b.p9):void");
    }

    @WorkerThread
    public final void s(b bVar, p9 p9Var) {
        i3 i3Var;
        String str;
        Object t2;
        String r2;
        Object V;
        i3 i3Var2;
        String str2;
        Object t3;
        String r3;
        Object obj;
        s sVar;
        Objects.requireNonNull(bVar, "null reference");
        b.l.a.c.b.a.x(bVar.f3911h);
        Objects.requireNonNull(bVar.f3912i, "null reference");
        Objects.requireNonNull(bVar.f3913j, "null reference");
        b.l.a.c.b.a.x(bVar.f3913j.f4021i);
        this.f3979j.d().h();
        R();
        if (H(p9Var)) {
            if (!p9Var.f4225o) {
                u(p9Var);
                return;
            }
            b bVar2 = new b(bVar);
            boolean z2 = false;
            bVar2.f3915l = false;
            L().v();
            try {
                b H = L().H(bVar2.f3911h, bVar2.f3913j.f4021i);
                if (H != null && !H.f3912i.equals(bVar2.f3912i)) {
                    this.f3979j.a().f4091i.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f3979j.u().r(bVar2.f3913j.f4021i), bVar2.f3912i, H.f3912i);
                }
                if (H != null && H.f3915l) {
                    bVar2.f3912i = H.f3912i;
                    bVar2.f3914k = H.f3914k;
                    bVar2.f3918o = H.f3918o;
                    bVar2.f3916m = H.f3916m;
                    bVar2.f3919p = H.f3919p;
                    bVar2.f3915l = true;
                    g9 g9Var = bVar2.f3913j;
                    bVar2.f3913j = new g9(g9Var.f4021i, H.f3913j.f4022j, g9Var.V(), H.f3913j.f4025m);
                } else if (TextUtils.isEmpty(bVar2.f3916m)) {
                    g9 g9Var2 = bVar2.f3913j;
                    bVar2.f3913j = new g9(g9Var2.f4021i, bVar2.f3914k, g9Var2.V(), bVar2.f3913j.f4025m);
                    bVar2.f3915l = true;
                    z2 = true;
                }
                if (bVar2.f3915l) {
                    g9 g9Var3 = bVar2.f3913j;
                    i9 i9Var = new i9(bVar2.f3911h, bVar2.f3912i, g9Var3.f4021i, g9Var3.f4022j, g9Var3.V());
                    if (L().C(i9Var)) {
                        i3Var2 = this.f3979j.a().f4095m;
                        str2 = "User property updated immediately";
                        t3 = bVar2.f3911h;
                        r3 = this.f3979j.u().r(i9Var.c);
                        obj = i9Var.f4066e;
                    } else {
                        i3Var2 = this.f3979j.a().f;
                        str2 = "(2)Too many active user properties, ignoring";
                        t3 = k3.t(bVar2.f3911h);
                        r3 = this.f3979j.u().r(i9Var.c);
                        obj = i9Var.f4066e;
                    }
                    i3Var2.d(str2, t3, r3, obj);
                    if (z2 && (sVar = bVar2.f3919p) != null) {
                        h(new s(sVar, bVar2.f3914k), p9Var);
                    }
                }
                if (L().G(bVar2)) {
                    i3Var = this.f3979j.a().f4095m;
                    str = "Conditional property added";
                    t2 = bVar2.f3911h;
                    r2 = this.f3979j.u().r(bVar2.f3913j.f4021i);
                    V = bVar2.f3913j.V();
                } else {
                    i3Var = this.f3979j.a().f;
                    str = "Too many conditional properties, ignoring";
                    t2 = k3.t(bVar2.f3911h);
                    r2 = this.f3979j.u().r(bVar2.f3913j.f4021i);
                    V = bVar2.f3913j.V();
                }
                i3Var.d(str, t2, r2, V);
                L().w();
            } finally {
                L().x();
            }
        }
    }

    @WorkerThread
    public final void t(b bVar, p9 p9Var) {
        Objects.requireNonNull(bVar, "null reference");
        b.l.a.c.b.a.x(bVar.f3911h);
        Objects.requireNonNull(bVar.f3913j, "null reference");
        b.l.a.c.b.a.x(bVar.f3913j.f4021i);
        this.f3979j.d().h();
        R();
        if (H(p9Var)) {
            if (!p9Var.f4225o) {
                u(p9Var);
                return;
            }
            L().v();
            try {
                u(p9Var);
                b H = L().H(bVar.f3911h, bVar.f3913j.f4021i);
                if (H != null) {
                    this.f3979j.a().f4095m.c("Removing conditional user property", bVar.f3911h, this.f3979j.u().r(bVar.f3913j.f4021i));
                    L().I(bVar.f3911h, bVar.f3913j.f4021i);
                    if (H.f3915l) {
                        L().B(bVar.f3911h, bVar.f3913j.f4021i);
                    }
                    s sVar = bVar.r;
                    if (sVar != null) {
                        q qVar = sVar.f4249i;
                        Bundle Z = qVar != null ? qVar.Z() : null;
                        k9 t2 = this.f3979j.t();
                        String str = bVar.f3911h;
                        s sVar2 = bVar.r;
                        h(t2.J(str, sVar2.f4248h, Z, H.f3912i, sVar2.f4251k, true, false), p9Var);
                    }
                } else {
                    this.f3979j.a().f4091i.c("Conditional user property doesn't exist", k3.t(bVar.f3911h), this.f3979j.u().r(bVar.f3913j.f4021i));
                }
                L().w();
            } finally {
                L().x();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x039a, code lost:
        if (r6 != false) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a3, code lost:
        if (r2.d() != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
        if (r2.e() != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ed, code lost:
        if (r1.d() != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022c, code lost:
        if (r1.e() != false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024f, code lost:
        if (r1.e() != false) goto L_0x0251;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x039a  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b.l.a.c.i.b.a5 u(b.l.a.c.i.b.p9 r14) {
        /*
            r13 = this;
            b.l.a.c.i.b.l4 r0 = r13.f3979j
            b.l.a.c.i.b.i4 r0 = r0.d()
            r0.h()
            r13.R()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r14, r0)
            java.lang.String r0 = r14.f4218h
            b.l.a.c.b.a.x(r0)
            b.l.a.c.i.b.j r0 = r13.L()
            java.lang.String r1 = r14.f4218h
            b.l.a.c.i.b.a5 r0 = r0.L(r1)
            b.l.a.c.i.b.g r1 = b.l.a.c.i.b.g.c
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r2 = r13.f3979j
            b.l.a.c.i.b.f r2 = r2.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.y0
            r4 = 0
            boolean r2 = r2.r(r4, r3)
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r14.f4218h
            b.l.a.c.i.b.g r2 = r13.T(r2)
            java.lang.String r5 = r14.C
            b.l.a.c.i.b.g r5 = b.l.a.c.i.b.g.b(r5)
            b.l.a.c.i.b.g r2 = r2.h(r5)
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r5 = r13.f3979j
            b.l.a.c.i.b.f r5 = r5.f4114g
            boolean r5 = r5.r(r4, r3)
            if (r5 == 0) goto L_0x005b
            boolean r5 = r2.d()
            if (r5 == 0) goto L_0x0058
            goto L_0x005b
        L_0x0058:
            java.lang.String r5 = ""
            goto L_0x0063
        L_0x005b:
            b.l.a.c.i.b.c8 r5 = r13.f3978i
            java.lang.String r6 = r14.f4218h
            java.lang.String r5 = r5.n(r6)
        L_0x0063:
            b.l.a.c.f.i.l9 r6 = b.l.a.c.f.i.l9.f3646i
            b.l.a.c.f.i.m9 r6 = r6.a()
            r6.a()
            b.l.a.c.i.b.l4 r6 = r13.f3979j
            b.l.a.c.i.b.f r6 = r6.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r7 = b.l.a.c.i.b.x2.n0
            boolean r6 = r6.r(r4, r7)
            r7 = 0
            if (r6 == 0) goto L_0x01a5
            if (r0 != 0) goto L_0x00b1
            b.l.a.c.i.b.a5 r0 = new b.l.a.c.i.b.a5
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            java.lang.String r6 = r14.f4218h
            r0.<init>(r1, r6)
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            boolean r1 = r1.r(r4, r3)
            if (r1 == 0) goto L_0x00a6
            boolean r1 = r2.e()
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = r13.i(r2)
            r0.A(r1)
        L_0x009f:
            boolean r1 = r2.d()
            if (r1 == 0) goto L_0x0108
            goto L_0x00ad
        L_0x00a6:
            java.lang.String r1 = r13.j()
            r0.A(r1)
        L_0x00ad:
            r0.I(r5)
            goto L_0x0108
        L_0x00b1:
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            boolean r1 = r1.r(r4, r3)
            if (r1 == 0) goto L_0x00c4
            boolean r1 = r2.d()
            if (r1 == 0) goto L_0x00e4
        L_0x00c4:
            java.lang.String r1 = r0.H()
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x00e4
            r0.I(r5)
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            boolean r1 = r1.r(r4, r3)
            if (r1 == 0) goto L_0x00df
            goto L_0x0101
        L_0x00df:
            java.lang.String r1 = r13.j()
            goto L_0x0105
        L_0x00e4:
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            boolean r1 = r1.r(r4, r3)
            if (r1 == 0) goto L_0x0108
            java.lang.String r1 = r0.z()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0108
            boolean r1 = r2.e()
            if (r1 == 0) goto L_0x0108
        L_0x0101:
            java.lang.String r1 = r13.i(r2)
        L_0x0105:
            r0.A(r1)
        L_0x0108:
            java.lang.String r1 = r14.f4219i
            r0.C(r1)
            java.lang.String r1 = r14.x
            r0.E(r1)
            b.l.a.c.f.i.y9.b()
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            java.lang.String r2 = r0.y()
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.i0
            boolean r1 = r1.r(r2, r3)
            if (r1 == 0) goto L_0x012a
            java.lang.String r1 = r14.B
            r0.G(r1)
        L_0x012a:
            java.lang.String r1 = r14.r
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0137
            java.lang.String r1 = r14.r
            r0.K(r1)
        L_0x0137:
            long r1 = r14.f4222l
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0140
            r0.a(r1)
        L_0x0140:
            java.lang.String r1 = r14.f4220j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x014d
            java.lang.String r1 = r14.f4220j
            r0.Q(r1)
        L_0x014d:
            long r1 = r14.f4227q
            r0.S(r1)
            java.lang.String r1 = r14.f4221k
            if (r1 == 0) goto L_0x0159
            r0.U(r1)
        L_0x0159:
            long r1 = r14.f4223m
            r0.c(r1)
            boolean r1 = r14.f4225o
            r0.g(r1)
            java.lang.String r1 = r14.f4224n
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0170
            java.lang.String r1 = r14.f4224n
            r0.p(r1)
        L_0x0170:
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r2 = b.l.a.c.i.b.x2.v0
            boolean r1 = r1.r(r4, r2)
            if (r1 != 0) goto L_0x0181
            long r1 = r14.s
            r0.r(r1)
        L_0x0181:
            boolean r1 = r14.v
            r0.t(r1)
            java.lang.Boolean r1 = r14.y
            r0.v(r1)
            long r1 = r14.z
            r0.e(r1)
            b.l.a.c.i.b.l4 r14 = r0.a
            b.l.a.c.i.b.i4 r14 = r14.d()
            r14.h()
            boolean r14 = r0.D
            if (r14 == 0) goto L_0x01a4
            b.l.a.c.i.b.j r14 = r13.L()
            r14.M(r0)
        L_0x01a4:
            return r0
        L_0x01a5:
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r2 = r13.f3979j
            b.l.a.c.i.b.f r2 = r2.f4114g
            boolean r2 = r2.r(r4, r3)
            if (r2 == 0) goto L_0x01c2
            java.lang.String r1 = r14.f4218h
            b.l.a.c.i.b.g r1 = r13.T(r1)
            java.lang.String r2 = r14.C
            b.l.a.c.i.b.g r2 = b.l.a.c.i.b.g.b(r2)
            b.l.a.c.i.b.g r1 = r1.h(r2)
        L_0x01c2:
            r2 = 0
            r6 = 1
            if (r0 != 0) goto L_0x01fb
            b.l.a.c.i.b.a5 r0 = new b.l.a.c.i.b.a5
            b.l.a.c.i.b.l4 r2 = r13.f3979j
            java.lang.String r9 = r14.f4218h
            r0.<init>(r2, r9)
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r2 = r13.f3979j
            b.l.a.c.i.b.f r2 = r2.f4114g
            boolean r2 = r2.r(r4, r3)
            if (r2 == 0) goto L_0x01f0
            boolean r2 = r1.e()
            if (r2 == 0) goto L_0x01e9
            java.lang.String r2 = r13.i(r1)
            r0.A(r2)
        L_0x01e9:
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x0258
            goto L_0x01f7
        L_0x01f0:
            java.lang.String r1 = r13.j()
            r0.A(r1)
        L_0x01f7:
            r0.I(r5)
            goto L_0x0258
        L_0x01fb:
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r9 = r13.f3979j
            b.l.a.c.i.b.f r9 = r9.f4114g
            boolean r9 = r9.r(r4, r3)
            if (r9 == 0) goto L_0x020e
            boolean r9 = r1.d()
            if (r9 == 0) goto L_0x0234
        L_0x020e:
            java.lang.String r9 = r0.H()
            boolean r9 = r5.equals(r9)
            if (r9 != 0) goto L_0x0234
            r0.I(r5)
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r2 = r13.f3979j
            b.l.a.c.i.b.f r2 = r2.f4114g
            boolean r2 = r2.r(r4, r3)
            if (r2 == 0) goto L_0x022f
            boolean r2 = r1.e()
            if (r2 == 0) goto L_0x0258
            goto L_0x0251
        L_0x022f:
            java.lang.String r1 = r13.j()
            goto L_0x0255
        L_0x0234:
            b.l.a.c.f.i.t8.b()
            b.l.a.c.i.b.l4 r5 = r13.f3979j
            b.l.a.c.i.b.f r5 = r5.f4114g
            boolean r3 = r5.r(r4, r3)
            if (r3 == 0) goto L_0x0259
            java.lang.String r3 = r0.z()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0259
            boolean r3 = r1.e()
            if (r3 == 0) goto L_0x0259
        L_0x0251:
            java.lang.String r1 = r13.i(r1)
        L_0x0255:
            r0.A(r1)
        L_0x0258:
            r2 = r6
        L_0x0259:
            java.lang.String r1 = r14.f4219i
            java.lang.String r3 = r0.B()
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L_0x026b
            java.lang.String r1 = r14.f4219i
            r0.C(r1)
            r2 = r6
        L_0x026b:
            java.lang.String r1 = r14.x
            java.lang.String r3 = r0.D()
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L_0x027d
            java.lang.String r1 = r14.x
            r0.E(r1)
            r2 = r6
        L_0x027d:
            b.l.a.c.f.i.y9.b()
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            java.lang.String r3 = r0.y()
            b.l.a.c.i.b.w2<java.lang.Boolean> r5 = b.l.a.c.i.b.x2.i0
            boolean r1 = r1.r(r3, r5)
            if (r1 == 0) goto L_0x02a2
            java.lang.String r1 = r14.B
            java.lang.String r3 = r0.F()
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L_0x02a2
            java.lang.String r1 = r14.B
            r0.G(r1)
            r2 = r6
        L_0x02a2:
            java.lang.String r1 = r14.r
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02bc
            java.lang.String r1 = r14.r
            java.lang.String r3 = r0.J()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x02bc
            java.lang.String r1 = r14.r
            r0.K(r1)
            r2 = r6
        L_0x02bc:
            long r9 = r14.f4222l
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x02d0
            long r11 = r0.V()
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x02d0
            long r1 = r14.f4222l
            r0.a(r1)
            r2 = r6
        L_0x02d0:
            java.lang.String r1 = r14.f4220j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02ea
            java.lang.String r1 = r14.f4220j
            java.lang.String r3 = r0.P()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x02ea
            java.lang.String r1 = r14.f4220j
            r0.Q(r1)
            r2 = r6
        L_0x02ea:
            long r9 = r14.f4227q
            long r11 = r0.R()
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x02fa
            long r1 = r14.f4227q
            r0.S(r1)
            r2 = r6
        L_0x02fa:
            java.lang.String r1 = r14.f4221k
            if (r1 == 0) goto L_0x030e
            java.lang.String r3 = r0.T()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x030e
            java.lang.String r1 = r14.f4221k
            r0.U(r1)
            r2 = r6
        L_0x030e:
            long r9 = r14.f4223m
            long r11 = r0.b()
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x031e
            long r1 = r14.f4223m
            r0.c(r1)
            r2 = r6
        L_0x031e:
            boolean r1 = r14.f4225o
            boolean r3 = r0.f()
            if (r1 == r3) goto L_0x032c
            boolean r1 = r14.f4225o
            r0.g(r1)
            r2 = r6
        L_0x032c:
            java.lang.String r1 = r14.f4224n
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x034d
            java.lang.String r1 = r14.f4224n
            b.l.a.c.i.b.l4 r3 = r0.a
            b.l.a.c.i.b.i4 r3 = r3.d()
            r3.h()
            java.lang.String r3 = r0.C
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x034d
            java.lang.String r1 = r14.f4224n
            r0.p(r1)
            r2 = r6
        L_0x034d:
            b.l.a.c.i.b.l4 r1 = r13.f3979j
            b.l.a.c.i.b.f r1 = r1.f4114g
            b.l.a.c.i.b.w2<java.lang.Boolean> r3 = b.l.a.c.i.b.x2.v0
            boolean r1 = r1.r(r4, r3)
            if (r1 != 0) goto L_0x0369
            long r3 = r14.s
            long r9 = r0.q()
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0369
            long r1 = r14.s
            r0.r(r1)
            r2 = r6
        L_0x0369:
            boolean r1 = r14.v
            boolean r3 = r0.s()
            if (r1 == r3) goto L_0x0377
            boolean r1 = r14.v
            r0.t(r1)
            r2 = r6
        L_0x0377:
            java.lang.Boolean r1 = r14.y
            java.lang.Boolean r3 = r0.u()
            if (r1 == r3) goto L_0x0385
            java.lang.Boolean r1 = r14.y
            r0.v(r1)
            goto L_0x0386
        L_0x0385:
            r6 = r2
        L_0x0386:
            long r1 = r14.z
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x039a
            long r3 = r0.d()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x039a
            long r1 = r14.z
            r0.e(r1)
            goto L_0x039c
        L_0x039a:
            if (r6 == 0) goto L_0x03a3
        L_0x039c:
            b.l.a.c.i.b.j r14 = r13.L()
            r14.M(r0)
        L_0x03a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.u(b.l.a.c.i.b.p9):b.l.a.c.i.b.a5");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0cba, code lost:
        if (r10 > (b.l.a.c.i.b.f.i() + r8)) goto L_0x0cbc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03c6 A[Catch:{ NumberFormatException -> 0x090c, all -> 0x0b82 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x048e A[Catch:{ NumberFormatException -> 0x090c, all -> 0x0b82 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04e4 A[Catch:{ NumberFormatException -> 0x090c, all -> 0x0b82 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0621 A[Catch:{ NumberFormatException -> 0x090c, all -> 0x0b82 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0638 A[Catch:{ NumberFormatException -> 0x090c, all -> 0x0b82 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0949 A[Catch:{ NumberFormatException -> 0x090c, all -> 0x0b82 }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0991 A[Catch:{ NumberFormatException -> 0x090c, all -> 0x0b82 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x09b5 A[Catch:{ NumberFormatException -> 0x090c, all -> 0x0b82 }] */
    /* JADX WARNING: Removed duplicated region for block: B:430:0x0caa A[Catch:{ all -> 0x0b47, all -> 0x0e36 }] */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0d30 A[Catch:{ all -> 0x0b47, all -> 0x0e36 }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0d4c A[Catch:{ SQLiteException -> 0x0d64 }] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0dae A[Catch:{ all -> 0x0b47, all -> 0x0e36 }] */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ddf A[Catch:{ all -> 0x0b47, all -> 0x0e36 }] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y(java.lang.String r47, long r48) {
        /*
            r46 = this;
            r1 = r46
            java.lang.String r2 = "_si"
            java.lang.String r3 = "_sc"
            java.lang.String r4 = "_sn"
            java.lang.String r5 = "_npa"
            java.lang.String r6 = "_ai"
            b.l.a.c.i.b.j r7 = r46.L()
            r7.v()
            b.l.a.c.i.b.c9 r7 = new b.l.a.c.i.b.c9     // Catch:{ all -> 0x0b82 }
            r7.<init>(r1)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.j r8 = r46.L()     // Catch:{ all -> 0x0b82 }
            r9 = 0
            long r12 = r1.x     // Catch:{ all -> 0x0b82 }
            r10 = r48
            r14 = r7
            r8.r(r9, r10, r12, r14)     // Catch:{ all -> 0x0b82 }
            java.util.List<b.l.a.c.f.i.o1> r8 = r7.c     // Catch:{ all -> 0x0b82 }
            if (r8 == 0) goto L_0x0e39
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0b82 }
            if (r8 == 0) goto L_0x0031
            goto L_0x0e39
        L_0x0031:
            b.l.a.c.f.i.w1 r8 = r7.a     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.m5 r8 = r8.n()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.v1 r8 = (b.l.a.c.f.i.v1) r8     // Catch:{ all -> 0x0b82 }
            r8.j0()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r10 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f r10 = r10.p()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r11 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r11 = r11.s()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r12 = b.l.a.c.i.b.x2.U     // Catch:{ all -> 0x0b82 }
            boolean r10 = r10.r(r11, r12)     // Catch:{ all -> 0x0b82 }
            r9 = -1
            r11 = -1
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x005b:
            java.util.List<b.l.a.c.f.i.o1> r12 = r7.c     // Catch:{ all -> 0x0b82 }
            int r12 = r12.size()     // Catch:{ all -> 0x0b82 }
            java.lang.String r13 = "_fr"
            r21 = r5
            java.lang.String r5 = "_et"
            r22 = r15
            java.lang.String r15 = "_e"
            r16 = r10
            r24 = r11
            if (r14 >= r12) goto L_0x068e
            java.util.List<b.l.a.c.f.i.o1> r11 = r7.c     // Catch:{ all -> 0x0b82 }
            java.lang.Object r11 = r11.get(r14)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r11 = (b.l.a.c.f.i.o1) r11     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.m5 r11 = r11.n()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.n1 r11 = (b.l.a.c.f.i.n1) r11     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.e4 r12 = r46.J()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r10 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = r10.s()     // Catch:{ all -> 0x0b82 }
            r28 = r14
            java.lang.String r14 = r11.s()     // Catch:{ all -> 0x0b82 }
            boolean r10 = r12.o(r10, r14)     // Catch:{ all -> 0x0b82 }
            java.lang.String r12 = "_err"
            if (r10 == 0) goto L_0x0117
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r5 = r5.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r5 = r5.p()     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = "Dropping blacklisted raw event. appId"
            b.l.a.c.f.i.w1 r13 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r13 = r13.s()     // Catch:{ all -> 0x0b82 }
            java.lang.Object r13 = b.l.a.c.i.b.k3.t(r13)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r14 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f3 r14 = r14.u()     // Catch:{ all -> 0x0b82 }
            java.lang.String r15 = r11.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = r14.p(r15)     // Catch:{ all -> 0x0b82 }
            r5.c(r10, r13, r14)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.e4 r5 = r46.J()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r10 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = r10.s()     // Catch:{ all -> 0x0b82 }
            boolean r5 = r5.r(r10)     // Catch:{ all -> 0x0b82 }
            if (r5 != 0) goto L_0x0106
            b.l.a.c.i.b.e4 r5 = r46.J()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r10 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = r10.s()     // Catch:{ all -> 0x0b82 }
            boolean r5 = r5.s(r10)     // Catch:{ all -> 0x0b82 }
            if (r5 == 0) goto L_0x00df
            goto L_0x0106
        L_0x00df:
            java.lang.String r5 = r11.s()     // Catch:{ all -> 0x0b82 }
            boolean r5 = r12.equals(r5)     // Catch:{ all -> 0x0b82 }
            if (r5 != 0) goto L_0x0106
            b.l.a.c.i.b.l4 r5 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k9 r29 = r5.t()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.j9 r5 = r1.z     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r10 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r31 = r10.s()     // Catch:{ all -> 0x0b82 }
            r32 = 11
            java.lang.String r33 = "_ev"
            java.lang.String r34 = r11.s()     // Catch:{ all -> 0x0b82 }
            r35 = 0
            r30 = r5
            r29.A(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0b82 }
        L_0x0106:
            r12 = r3
            r30 = r6
            r5 = r22
            r11 = r24
            r14 = r28
            r3 = r2
            r45 = r9
            r9 = r4
            r4 = r45
            goto L_0x067c
        L_0x0117:
            java.lang.String r10 = r11.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = b.l.a.c.i.b.i5.a(r6)     // Catch:{ all -> 0x0b82 }
            boolean r10 = r10.equals(r14)     // Catch:{ all -> 0x0b82 }
            if (r10 == 0) goto L_0x0193
            r11.t(r6)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r10 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r10 = r10.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r10 = r10.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = "Renaming ad_impression to _ai"
            r10.a(r14)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r10 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r10 = r10.a()     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = r10.v()     // Catch:{ all -> 0x0b82 }
            r14 = 5
            boolean r10 = android.util.Log.isLoggable(r10, r14)     // Catch:{ all -> 0x0b82 }
            if (r10 == 0) goto L_0x0193
            r10 = 0
        L_0x0149:
            int r14 = r11.n()     // Catch:{ all -> 0x0b82 }
            if (r10 >= r14) goto L_0x0193
            java.lang.String r14 = "ad_platform"
            b.l.a.c.f.i.s1 r29 = r11.o(r10)     // Catch:{ all -> 0x0b82 }
            r30 = r6
            java.lang.String r6 = r29.t()     // Catch:{ all -> 0x0b82 }
            boolean r6 = r14.equals(r6)     // Catch:{ all -> 0x0b82 }
            if (r6 == 0) goto L_0x018e
            b.l.a.c.f.i.s1 r6 = r11.o(r10)     // Catch:{ all -> 0x0b82 }
            java.lang.String r6 = r6.v()     // Catch:{ all -> 0x0b82 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0b82 }
            if (r6 != 0) goto L_0x018e
            java.lang.String r6 = "admob"
            b.l.a.c.f.i.s1 r14 = r11.o(r10)     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = r14.v()     // Catch:{ all -> 0x0b82 }
            boolean r6 = r6.equalsIgnoreCase(r14)     // Catch:{ all -> 0x0b82 }
            if (r6 == 0) goto L_0x018e
            b.l.a.c.i.b.l4 r6 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r6 = r6.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r6 = r6.q()     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = "AdMob ad impression logged from app. Potentially duplicative."
            r6.a(r14)     // Catch:{ all -> 0x0b82 }
        L_0x018e:
            int r10 = r10 + 1
            r6 = r30
            goto L_0x0149
        L_0x0193:
            r30 = r6
            b.l.a.c.i.b.e4 r6 = r46.J()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r10 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = r10.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = r11.s()     // Catch:{ all -> 0x0b82 }
            boolean r6 = r6.p(r10, r14)     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = "_c"
            if (r6 != 0) goto L_0x01fd
            r46.P()     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = r11.s()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.b.a.x(r14)     // Catch:{ all -> 0x0b82 }
            r29 = r2
            int r2 = r14.hashCode()     // Catch:{ all -> 0x0b82 }
            r31 = r3
            r3 = 94660(0x171c4, float:1.32647E-40)
            if (r2 == r3) goto L_0x01e1
            r3 = 95025(0x17331, float:1.33158E-40)
            if (r2 == r3) goto L_0x01d7
            r3 = 95027(0x17333, float:1.33161E-40)
            if (r2 == r3) goto L_0x01cd
            goto L_0x01eb
        L_0x01cd:
            java.lang.String r2 = "_ui"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x01eb
            r2 = 1
            goto L_0x01ec
        L_0x01d7:
            java.lang.String r2 = "_ug"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x01eb
            r2 = 2
            goto L_0x01ec
        L_0x01e1:
            java.lang.String r2 = "_in"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x01eb
            r2 = 0
            goto L_0x01ec
        L_0x01eb:
            r2 = -1
        L_0x01ec:
            if (r2 == 0) goto L_0x0201
            r3 = 1
            if (r2 == r3) goto L_0x0201
            r3 = 2
            if (r2 == r3) goto L_0x0201
            r25 = r4
            r33 = r5
            r32 = r9
            r6 = 0
            goto L_0x03c4
        L_0x01fd:
            r29 = r2
            r31 = r3
        L_0x0201:
            r25 = r4
            r2 = 0
            r3 = 0
            r14 = 0
        L_0x0206:
            int r4 = r11.n()     // Catch:{ all -> 0x0b82 }
            r32 = r9
            java.lang.String r9 = "_r"
            if (r2 >= r4) goto L_0x026f
            b.l.a.c.f.i.s1 r4 = r11.o(r2)     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r4.t()     // Catch:{ all -> 0x0b82 }
            boolean r4 = r10.equals(r4)     // Catch:{ all -> 0x0b82 }
            if (r4 == 0) goto L_0x023b
            b.l.a.c.f.i.s1 r3 = r11.o(r2)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.m5 r3 = r3.n()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.r1 r3 = (b.l.a.c.f.i.r1) r3     // Catch:{ all -> 0x0b82 }
            r33 = r5
            r4 = 1
            r3.o(r4)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r3 = r3.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r3 = (b.l.a.c.f.i.s1) r3     // Catch:{ all -> 0x0b82 }
            r11.p(r2, r3)     // Catch:{ all -> 0x0b82 }
            r5 = r8
            r3 = 1
            goto L_0x0267
        L_0x023b:
            r33 = r5
            b.l.a.c.f.i.s1 r4 = r11.o(r2)     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r4.t()     // Catch:{ all -> 0x0b82 }
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x0b82 }
            if (r4 == 0) goto L_0x0266
            b.l.a.c.f.i.s1 r4 = r11.o(r2)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.m5 r4 = r4.n()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.r1 r4 = (b.l.a.c.f.i.r1) r4     // Catch:{ all -> 0x0b82 }
            r5 = r8
            r8 = 1
            r4.o(r8)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r4 = r4.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r4 = (b.l.a.c.f.i.s1) r4     // Catch:{ all -> 0x0b82 }
            r11.p(r2, r4)     // Catch:{ all -> 0x0b82 }
            r14 = 1
            goto L_0x0267
        L_0x0266:
            r5 = r8
        L_0x0267:
            int r2 = r2 + 1
            r8 = r5
            r9 = r32
            r5 = r33
            goto L_0x0206
        L_0x026f:
            r33 = r5
            r5 = r8
            if (r3 != 0) goto L_0x02a2
            if (r6 == 0) goto L_0x02a2
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r3 = "Marking event as conversion"
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f3 r4 = r4.u()     // Catch:{ all -> 0x0b82 }
            java.lang.String r8 = r11.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r4.p(r8)     // Catch:{ all -> 0x0b82 }
            r2.b(r3, r4)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.r1 r2 = b.l.a.c.f.i.s1.E()     // Catch:{ all -> 0x0b82 }
            r2.m(r10)     // Catch:{ all -> 0x0b82 }
            r3 = 1
            r2.o(r3)     // Catch:{ all -> 0x0b82 }
            r11.q(r2)     // Catch:{ all -> 0x0b82 }
        L_0x02a2:
            if (r14 != 0) goto L_0x02d0
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r3 = "Marking event as real-time"
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f3 r4 = r4.u()     // Catch:{ all -> 0x0b82 }
            java.lang.String r8 = r11.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r4.p(r8)     // Catch:{ all -> 0x0b82 }
            r2.b(r3, r4)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.r1 r2 = b.l.a.c.f.i.s1.E()     // Catch:{ all -> 0x0b82 }
            r2.m(r9)     // Catch:{ all -> 0x0b82 }
            r3 = 1
            r2.o(r3)     // Catch:{ all -> 0x0b82 }
            r11.q(r2)     // Catch:{ all -> 0x0b82 }
        L_0x02d0:
            b.l.a.c.i.b.j r34 = r46.L()     // Catch:{ all -> 0x0b82 }
            long r35 = r46.U()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r2 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r37 = r2.s()     // Catch:{ all -> 0x0b82 }
            r38 = 0
            r39 = 1
            b.l.a.c.i.b.h r2 = r34.N(r35, r37, r38, r39)     // Catch:{ all -> 0x0b82 }
            long r2 = r2.f4028e     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f r4 = r4.p()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r8 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r8 = r8.s()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.w2<java.lang.Integer> r14 = b.l.a.c.i.b.x2.f4350o     // Catch:{ all -> 0x0b82 }
            int r4 = r4.p(r8, r14)     // Catch:{ all -> 0x0b82 }
            r8 = r5
            long r4 = (long) r4     // Catch:{ all -> 0x0b82 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0304
            x(r11, r9)     // Catch:{ all -> 0x0b82 }
            goto L_0x0306
        L_0x0304:
            r20 = 1
        L_0x0306:
            java.lang.String r2 = r11.s()     // Catch:{ all -> 0x0b82 }
            boolean r2 = b.l.a.c.i.b.k9.e0(r2)     // Catch:{ all -> 0x0b82 }
            if (r2 == 0) goto L_0x03c4
            if (r6 == 0) goto L_0x03c4
            b.l.a.c.i.b.j r34 = r46.L()     // Catch:{ all -> 0x0b82 }
            long r35 = r46.U()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r2 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r37 = r2.s()     // Catch:{ all -> 0x0b82 }
            r38 = 1
            r39 = 0
            b.l.a.c.i.b.h r2 = r34.N(r35, r37, r38, r39)     // Catch:{ all -> 0x0b82 }
            long r2 = r2.c     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f r4 = r4.p()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r5 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = r5.s()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.w2<java.lang.Integer> r9 = b.l.a.c.i.b.x2.f4349n     // Catch:{ all -> 0x0b82 }
            int r4 = r4.p(r5, r9)     // Catch:{ all -> 0x0b82 }
            long r4 = (long) r4     // Catch:{ all -> 0x0b82 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x03c4
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.p()     // Catch:{ all -> 0x0b82 }
            java.lang.String r3 = "Too many conversions. Not logging as conversion. appId"
            b.l.a.c.f.i.w1 r4 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r4.s()     // Catch:{ all -> 0x0b82 }
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r4)     // Catch:{ all -> 0x0b82 }
            r2.b(r3, r4)     // Catch:{ all -> 0x0b82 }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = -1
        L_0x035e:
            int r9 = r11.n()     // Catch:{ all -> 0x0b82 }
            if (r3 >= r9) goto L_0x0388
            b.l.a.c.f.i.s1 r9 = r11.o(r3)     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = r9.t()     // Catch:{ all -> 0x0b82 }
            boolean r14 = r10.equals(r14)     // Catch:{ all -> 0x0b82 }
            if (r14 == 0) goto L_0x037a
            b.l.a.c.f.i.m5 r2 = r9.n()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.r1 r2 = (b.l.a.c.f.i.r1) r2     // Catch:{ all -> 0x0b82 }
            r5 = r3
            goto L_0x0385
        L_0x037a:
            java.lang.String r9 = r9.t()     // Catch:{ all -> 0x0b82 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0b82 }
            if (r9 == 0) goto L_0x0385
            r4 = 1
        L_0x0385:
            int r3 = r3 + 1
            goto L_0x035e
        L_0x0388:
            if (r4 == 0) goto L_0x0391
            if (r2 == 0) goto L_0x0390
            r11.r(r5)     // Catch:{ all -> 0x0b82 }
            goto L_0x03c4
        L_0x0390:
            r2 = 0
        L_0x0391:
            if (r2 == 0) goto L_0x03ab
            b.l.a.c.f.i.m5 r2 = r2.clone()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.r1 r2 = (b.l.a.c.f.i.r1) r2     // Catch:{ all -> 0x0b82 }
            r2.m(r12)     // Catch:{ all -> 0x0b82 }
            r3 = 10
            r2.o(r3)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r2 = r2.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r2 = (b.l.a.c.f.i.s1) r2     // Catch:{ all -> 0x0b82 }
            r11.p(r5, r2)     // Catch:{ all -> 0x0b82 }
            goto L_0x03c4
        L_0x03ab:
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x0b82 }
            java.lang.String r3 = "Did not find conversion parameter. appId"
            b.l.a.c.f.i.w1 r4 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r4.s()     // Catch:{ all -> 0x0b82 }
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r4)     // Catch:{ all -> 0x0b82 }
            r2.b(r3, r4)     // Catch:{ all -> 0x0b82 }
        L_0x03c4:
            if (r6 == 0) goto L_0x0481
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0b82 }
            java.util.List r3 = r11.m()     // Catch:{ all -> 0x0b82 }
            r2.<init>(r3)     // Catch:{ all -> 0x0b82 }
            r3 = 0
            r4 = -1
            r5 = -1
        L_0x03d2:
            int r6 = r2.size()     // Catch:{ all -> 0x0b82 }
            java.lang.String r9 = "currency"
            java.lang.String r12 = "value"
            if (r3 >= r6) goto L_0x0402
            java.lang.Object r6 = r2.get(r3)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r6 = (b.l.a.c.f.i.s1) r6     // Catch:{ all -> 0x0b82 }
            java.lang.String r6 = r6.t()     // Catch:{ all -> 0x0b82 }
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x0b82 }
            if (r6 == 0) goto L_0x03ee
            r4 = r3
            goto L_0x03ff
        L_0x03ee:
            java.lang.Object r6 = r2.get(r3)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r6 = (b.l.a.c.f.i.s1) r6     // Catch:{ all -> 0x0b82 }
            java.lang.String r6 = r6.t()     // Catch:{ all -> 0x0b82 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0b82 }
            if (r6 == 0) goto L_0x03ff
            r5 = r3
        L_0x03ff:
            int r3 = r3 + 1
            goto L_0x03d2
        L_0x0402:
            r3 = -1
            if (r4 != r3) goto L_0x0407
            goto L_0x0482
        L_0x0407:
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r3 = (b.l.a.c.f.i.s1) r3     // Catch:{ all -> 0x0b82 }
            boolean r3 = r3.w()     // Catch:{ all -> 0x0b82 }
            if (r3 != 0) goto L_0x043a
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r3 = (b.l.a.c.f.i.s1) r3     // Catch:{ all -> 0x0b82 }
            boolean r3 = r3.A()     // Catch:{ all -> 0x0b82 }
            if (r3 != 0) goto L_0x043a
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.q()     // Catch:{ all -> 0x0b82 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x0b82 }
            r11.r(r4)     // Catch:{ all -> 0x0b82 }
            x(r11, r10)     // Catch:{ all -> 0x0b82 }
            r2 = 18
            w(r11, r2, r12)     // Catch:{ all -> 0x0b82 }
            goto L_0x0481
        L_0x043a:
            r3 = -1
            if (r5 != r3) goto L_0x043e
            goto L_0x0466
        L_0x043e:
            java.lang.Object r2 = r2.get(r5)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r2 = (b.l.a.c.f.i.s1) r2     // Catch:{ all -> 0x0b82 }
            java.lang.String r2 = r2.v()     // Catch:{ all -> 0x0b82 }
            int r5 = r2.length()     // Catch:{ all -> 0x0b82 }
            r6 = 3
            if (r5 != r6) goto L_0x0466
            r5 = 0
        L_0x0450:
            int r6 = r2.length()     // Catch:{ all -> 0x0b82 }
            if (r5 >= r6) goto L_0x0482
            int r6 = r2.codePointAt(r5)     // Catch:{ all -> 0x0b82 }
            boolean r12 = java.lang.Character.isLetter(r6)     // Catch:{ all -> 0x0b82 }
            if (r12 == 0) goto L_0x0466
            int r6 = java.lang.Character.charCount(r6)     // Catch:{ all -> 0x0b82 }
            int r5 = r5 + r6
            goto L_0x0450
        L_0x0466:
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.q()     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r5)     // Catch:{ all -> 0x0b82 }
            r11.r(r4)     // Catch:{ all -> 0x0b82 }
            x(r11, r10)     // Catch:{ all -> 0x0b82 }
            r2 = 19
            w(r11, r2, r9)     // Catch:{ all -> 0x0b82 }
            goto L_0x0482
        L_0x0481:
            r3 = -1
        L_0x0482:
            java.lang.String r2 = r11.s()     // Catch:{ all -> 0x0b82 }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0b82 }
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04e4
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r2 = r11.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r2 = (b.l.a.c.f.i.o1) r2     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r2 = b.l.a.c.i.b.f9.L(r2, r13)     // Catch:{ all -> 0x0b82 }
            if (r2 != 0) goto L_0x04d9
            if (r18 == 0) goto L_0x04c7
            long r9 = r18.u()     // Catch:{ all -> 0x0b82 }
            long r12 = r11.u()     // Catch:{ all -> 0x0b82 }
            long r9 = r9 - r12
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0b82 }
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x04c7
            b.l.a.c.f.i.m5 r2 = r18.clone()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.n1 r2 = (b.l.a.c.f.i.n1) r2     // Catch:{ all -> 0x0b82 }
            boolean r4 = r1.A(r11, r2)     // Catch:{ all -> 0x0b82 }
            if (r4 == 0) goto L_0x04c7
            r13 = r24
            r8.g0(r13, r2)     // Catch:{ all -> 0x0b82 }
            r9 = r32
            r2 = 0
            r18 = 0
            goto L_0x04cc
        L_0x04c7:
            r13 = r24
            r2 = r11
            r9 = r19
        L_0x04cc:
            r17 = r2
            r4 = r9
            r9 = r25
            r3 = r29
            r12 = r31
        L_0x04d5:
            r6 = r33
            goto L_0x060f
        L_0x04d9:
            r13 = r24
            r9 = r25
            r3 = r29
            r12 = r31
            r4 = r32
            goto L_0x04d5
        L_0x04e4:
            r13 = r24
            java.lang.String r2 = "_vs"
            java.lang.String r6 = r11.s()     // Catch:{ all -> 0x0b82 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0b82 }
            if (r2 == 0) goto L_0x0545
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r2 = r11.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r2 = (b.l.a.c.f.i.o1) r2     // Catch:{ all -> 0x0b82 }
            r6 = r33
            b.l.a.c.f.i.s1 r2 = b.l.a.c.i.b.f9.L(r2, r6)     // Catch:{ all -> 0x0b82 }
            if (r2 != 0) goto L_0x0542
            if (r17 == 0) goto L_0x0534
            long r9 = r17.u()     // Catch:{ all -> 0x0b82 }
            long r26 = r11.u()     // Catch:{ all -> 0x0b82 }
            long r9 = r9 - r26
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0b82 }
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0534
            b.l.a.c.f.i.m5 r2 = r17.clone()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.n1 r2 = (b.l.a.c.f.i.n1) r2     // Catch:{ all -> 0x0b82 }
            boolean r4 = r1.A(r2, r11)     // Catch:{ all -> 0x0b82 }
            if (r4 == 0) goto L_0x052c
            r4 = r32
            r8.g0(r4, r2)     // Catch:{ all -> 0x0b82 }
            r2 = 0
            r17 = 0
            goto L_0x0531
        L_0x052c:
            r4 = r32
            r2 = r11
            r13 = r19
        L_0x0531:
            r18 = r2
            goto L_0x053a
        L_0x0534:
            r4 = r32
            r18 = r11
            r13 = r19
        L_0x053a:
            r9 = r25
            r3 = r29
            r12 = r31
            goto L_0x060f
        L_0x0542:
            r4 = r32
            goto L_0x053a
        L_0x0545:
            r4 = r32
            r6 = r33
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f r2 = r2.p()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r5 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = r5.s()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.w2<java.lang.Boolean> r9 = b.l.a.c.i.b.x2.l0     // Catch:{ all -> 0x0b82 }
            boolean r2 = r2.r(r5, r9)     // Catch:{ all -> 0x0b82 }
            if (r2 == 0) goto L_0x053a
            java.lang.String r2 = "_ab"
            java.lang.String r5 = r11.s()     // Catch:{ all -> 0x0b82 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0b82 }
            if (r2 == 0) goto L_0x053a
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r2 = r11.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r2 = (b.l.a.c.f.i.o1) r2     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r2 = b.l.a.c.i.b.f9.L(r2, r6)     // Catch:{ all -> 0x0b82 }
            if (r2 != 0) goto L_0x053a
            if (r17 == 0) goto L_0x053a
            long r9 = r17.u()     // Catch:{ all -> 0x0b82 }
            long r26 = r11.u()     // Catch:{ all -> 0x0b82 }
            long r9 = r9 - r26
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0b82 }
            r26 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r2 > 0) goto L_0x053a
            b.l.a.c.f.i.m5 r2 = r17.clone()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.n1 r2 = (b.l.a.c.f.i.n1) r2     // Catch:{ all -> 0x0b82 }
            r1.B(r2, r11)     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = r2.s()     // Catch:{ all -> 0x0b82 }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.b.a.j(r5)     // Catch:{ all -> 0x0b82 }
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r5 = r2.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r5 = (b.l.a.c.f.i.o1) r5     // Catch:{ all -> 0x0b82 }
            r9 = r25
            b.l.a.c.f.i.s1 r5 = b.l.a.c.i.b.f9.L(r5, r9)     // Catch:{ all -> 0x0b82 }
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r10 = r2.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r10 = (b.l.a.c.f.i.o1) r10     // Catch:{ all -> 0x0b82 }
            r12 = r31
            b.l.a.c.f.i.s1 r10 = b.l.a.c.i.b.f9.L(r10, r12)     // Catch:{ all -> 0x0b82 }
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r14 = r2.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r14 = (b.l.a.c.f.i.o1) r14     // Catch:{ all -> 0x0b82 }
            r3 = r29
            b.l.a.c.f.i.s1 r14 = b.l.a.c.i.b.f9.L(r14, r3)     // Catch:{ all -> 0x0b82 }
            java.lang.String r17 = ""
            if (r5 == 0) goto L_0x05d8
            java.lang.String r5 = r5.v()     // Catch:{ all -> 0x0b82 }
            goto L_0x05da
        L_0x05d8:
            r5 = r17
        L_0x05da:
            boolean r24 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b82 }
            if (r24 != 0) goto L_0x05e6
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f9.J(r11, r9, r5)     // Catch:{ all -> 0x0b82 }
        L_0x05e6:
            if (r10 == 0) goto L_0x05ec
            java.lang.String r17 = r10.v()     // Catch:{ all -> 0x0b82 }
        L_0x05ec:
            r5 = r17
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0b82 }
            if (r10 != 0) goto L_0x05fa
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f9.J(r11, r12, r5)     // Catch:{ all -> 0x0b82 }
        L_0x05fa:
            if (r14 == 0) goto L_0x060a
            r46.P()     // Catch:{ all -> 0x0b82 }
            long r24 = r14.x()     // Catch:{ all -> 0x0b82 }
            java.lang.Long r5 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f9.J(r11, r3, r5)     // Catch:{ all -> 0x0b82 }
        L_0x060a:
            r8.g0(r4, r2)     // Catch:{ all -> 0x0b82 }
            r17 = 0
        L_0x060f:
            if (r16 != 0) goto L_0x0667
            java.lang.String r2 = r11.s()     // Catch:{ all -> 0x0b82 }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0b82 }
            if (r2 == 0) goto L_0x0667
            int r2 = r11.n()     // Catch:{ all -> 0x0b82 }
            if (r2 != 0) goto L_0x0638
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.p()     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = "Engagement event does not contain any parameters. appId"
            b.l.a.c.f.i.w1 r6 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r6 = r6.s()     // Catch:{ all -> 0x0b82 }
        L_0x0633:
            java.lang.Object r6 = b.l.a.c.i.b.k3.t(r6)     // Catch:{ all -> 0x0b82 }
            goto L_0x065c
        L_0x0638:
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r2 = r11.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r2 = (b.l.a.c.f.i.o1) r2     // Catch:{ all -> 0x0b82 }
            java.lang.Object r2 = b.l.a.c.i.b.f9.l(r2, r6)     // Catch:{ all -> 0x0b82 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0b82 }
            if (r2 != 0) goto L_0x0660
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.p()     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = "Engagement event does not include duration. appId"
            b.l.a.c.f.i.w1 r6 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r6 = r6.s()     // Catch:{ all -> 0x0b82 }
            goto L_0x0633
        L_0x065c:
            r2.b(r5, r6)     // Catch:{ all -> 0x0b82 }
            goto L_0x0667
        L_0x0660:
            long r5 = r2.longValue()     // Catch:{ all -> 0x0b82 }
            long r5 = r22 + r5
            goto L_0x0669
        L_0x0667:
            r5 = r22
        L_0x0669:
            java.util.List<b.l.a.c.f.i.o1> r2 = r7.c     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r10 = r11.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r10 = (b.l.a.c.f.i.o1) r10     // Catch:{ all -> 0x0b82 }
            r14 = r28
            r2.set(r14, r10)     // Catch:{ all -> 0x0b82 }
            int r19 = r19 + 1
            r8.h0(r11)     // Catch:{ all -> 0x0b82 }
            r11 = r13
        L_0x067c:
            int r14 = r14 + 1
            r2 = r3
            r3 = r12
            r10 = r16
            r15 = r5
            r5 = r21
            r6 = r30
            r45 = r9
            r9 = r4
            r4 = r45
            goto L_0x005b
        L_0x068e:
            r6 = r5
            if (r16 == 0) goto L_0x06e3
            r3 = r19
            r2 = 0
        L_0x0694:
            if (r2 >= r3) goto L_0x06e3
            b.l.a.c.f.i.o1 r4 = r8.f0(r2)     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = r4.v()     // Catch:{ all -> 0x0b82 }
            boolean r5 = r15.equals(r5)     // Catch:{ all -> 0x0b82 }
            if (r5 == 0) goto L_0x06b5
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r5 = b.l.a.c.i.b.f9.L(r4, r13)     // Catch:{ all -> 0x0b82 }
            if (r5 == 0) goto L_0x06b5
            r8.k0(r2)     // Catch:{ all -> 0x0b82 }
            int r3 = r3 + -1
            int r2 = r2 + -1
            goto L_0x06e0
        L_0x06b5:
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r4 = b.l.a.c.i.b.f9.L(r4, r6)     // Catch:{ all -> 0x0b82 }
            if (r4 == 0) goto L_0x06e0
            boolean r5 = r4.w()     // Catch:{ all -> 0x0b82 }
            if (r5 == 0) goto L_0x06cd
            long r4 = r4.x()     // Catch:{ all -> 0x0b82 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b82 }
            goto L_0x06ce
        L_0x06cd:
            r4 = 0
        L_0x06ce:
            if (r4 == 0) goto L_0x06e0
            long r9 = r4.longValue()     // Catch:{ all -> 0x0b82 }
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x06e0
            long r4 = r4.longValue()     // Catch:{ all -> 0x0b82 }
            long r22 = r22 + r4
        L_0x06e0:
            r4 = 1
            int r2 = r2 + r4
            goto L_0x0694
        L_0x06e3:
            r2 = r22
            r4 = 0
            r1.z(r8, r2, r4)     // Catch:{ all -> 0x0b82 }
            java.util.List r4 = r8.d0()     // Catch:{ all -> 0x0b82 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0b82 }
        L_0x06f1:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0b82 }
            java.lang.String r6 = "_se"
            if (r5 == 0) goto L_0x0716
            java.lang.String r5 = "_s"
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r9 = (b.l.a.c.f.i.o1) r9     // Catch:{ all -> 0x0b82 }
            java.lang.String r9 = r9.v()     // Catch:{ all -> 0x0b82 }
            boolean r5 = r5.equals(r9)     // Catch:{ all -> 0x0b82 }
            if (r5 == 0) goto L_0x06f1
            b.l.a.c.i.b.j r4 = r46.L()     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = r8.s()     // Catch:{ all -> 0x0b82 }
            r4.B(r5, r6)     // Catch:{ all -> 0x0b82 }
        L_0x0716:
            java.lang.String r4 = "_sid"
            int r4 = b.l.a.c.i.b.f9.H(r8, r4)     // Catch:{ all -> 0x0b82 }
            if (r4 < 0) goto L_0x0723
            r4 = 1
            r1.z(r8, r2, r4)     // Catch:{ all -> 0x0b82 }
            goto L_0x0745
        L_0x0723:
            int r2 = b.l.a.c.i.b.f9.H(r8, r6)     // Catch:{ all -> 0x0b82 }
            if (r2 < 0) goto L_0x0745
            r8.r0(r2)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r2 = r2.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r2 = r2.o()     // Catch:{ all -> 0x0b82 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            b.l.a.c.f.i.w1 r4 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r4.s()     // Catch:{ all -> 0x0b82 }
            java.lang.Object r4 = b.l.a.c.i.b.k3.t(r4)     // Catch:{ all -> 0x0b82 }
            r2.b(r3, r4)     // Catch:{ all -> 0x0b82 }
        L_0x0745:
            b.l.a.c.i.b.f9 r2 = r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r3 = r2.a     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r3 = r3.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.a(r4)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.d9 r3 = r2.f4305b     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.e4 r3 = r3.J()     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r8.s()     // Catch:{ all -> 0x0b82 }
            boolean r3 = r3.m(r4)     // Catch:{ all -> 0x0b82 }
            if (r3 == 0) goto L_0x07d9
            b.l.a.c.i.b.d9 r3 = r2.f4305b     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.j r3 = r3.L()     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = r8.s()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.a5 r3 = r3.L(r4)     // Catch:{ all -> 0x0b82 }
            if (r3 == 0) goto L_0x07d9
            boolean r3 = r3.s()     // Catch:{ all -> 0x0b82 }
            if (r3 == 0) goto L_0x07d9
            b.l.a.c.i.b.l4 r3 = r2.a     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.m r3 = r3.A()     // Catch:{ all -> 0x0b82 }
            boolean r3 = r3.r()     // Catch:{ all -> 0x0b82 }
            if (r3 == 0) goto L_0x07d9
            b.l.a.c.i.b.l4 r3 = r2.a     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r3 = r3.r()     // Catch:{ all -> 0x0b82 }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.a(r4)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.f2 r3 = b.l.a.c.f.i.g2.B()     // Catch:{ all -> 0x0b82 }
            r4 = r21
            r3.n(r4)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r2 = r2.a     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.m r2 = r2.A()     // Catch:{ all -> 0x0b82 }
            long r5 = r2.q()     // Catch:{ all -> 0x0b82 }
            r3.m(r5)     // Catch:{ all -> 0x0b82 }
            r5 = 1
            r3.o(r5)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r2 = r3.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.g2 r2 = (b.l.a.c.f.i.g2) r2     // Catch:{ all -> 0x0b82 }
            r3 = 0
        L_0x07bb:
            int r5 = r8.m0()     // Catch:{ all -> 0x0b82 }
            if (r3 >= r5) goto L_0x07d6
            b.l.a.c.f.i.g2 r5 = r8.n0(r3)     // Catch:{ all -> 0x0b82 }
            java.lang.String r5 = r5.u()     // Catch:{ all -> 0x0b82 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x0b82 }
            if (r5 == 0) goto L_0x07d3
            r8.o0(r3, r2)     // Catch:{ all -> 0x0b82 }
            goto L_0x07d9
        L_0x07d3:
            int r3 = r3 + 1
            goto L_0x07bb
        L_0x07d6:
            r8.p0(r2)     // Catch:{ all -> 0x0b82 }
        L_0x07d9:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.u0(r2)     // Catch:{ all -> 0x0b82 }
            r2 = -9223372036854775808
            r8.w0(r2)     // Catch:{ all -> 0x0b82 }
            r2 = 0
        L_0x07e7:
            int r3 = r8.e0()     // Catch:{ all -> 0x0b82 }
            if (r2 >= r3) goto L_0x081a
            b.l.a.c.f.i.o1 r3 = r8.f0(r2)     // Catch:{ all -> 0x0b82 }
            long r4 = r3.x()     // Catch:{ all -> 0x0b82 }
            long r9 = r8.t0()     // Catch:{ all -> 0x0b82 }
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0804
            long r4 = r3.x()     // Catch:{ all -> 0x0b82 }
            r8.u0(r4)     // Catch:{ all -> 0x0b82 }
        L_0x0804:
            long r4 = r3.x()     // Catch:{ all -> 0x0b82 }
            long r9 = r8.v0()     // Catch:{ all -> 0x0b82 }
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0817
            long r3 = r3.x()     // Catch:{ all -> 0x0b82 }
            r8.w0(r3)     // Catch:{ all -> 0x0b82 }
        L_0x0817:
            int r2 = r2 + 1
            goto L_0x07e7
        L_0x081a:
            r8.Q()     // Catch:{ all -> 0x0b82 }
            r8.M()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.x9 r9 = r46.O()     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = r8.s()     // Catch:{ all -> 0x0b82 }
            java.util.List r11 = r8.d0()     // Catch:{ all -> 0x0b82 }
            java.util.List r12 = r8.l0()     // Catch:{ all -> 0x0b82 }
            long r2 = r8.t0()     // Catch:{ all -> 0x0b82 }
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0b82 }
            long r2 = r8.v0()     // Catch:{ all -> 0x0b82 }
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0b82 }
            java.util.List r2 = r9.l(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0b82 }
            r8.L(r2)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r2 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f r2 = r2.p()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r3 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r3 = r3.s()     // Catch:{ all -> 0x0b82 }
            boolean r2 = r2.y(r3)     // Catch:{ all -> 0x0b82 }
            if (r2 == 0) goto L_0x0b87
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0b82 }
            r2.<init>()     // Catch:{ all -> 0x0b82 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0b82 }
            r3.<init>()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.l4 r4 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k9 r4 = r4.t()     // Catch:{ all -> 0x0b82 }
            java.security.SecureRandom r4 = r4.d0()     // Catch:{ all -> 0x0b82 }
            r5 = 0
        L_0x086e:
            int r6 = r8.e0()     // Catch:{ all -> 0x0b82 }
            if (r5 >= r6) goto L_0x0b4b
            b.l.a.c.f.i.o1 r6 = r8.f0(r5)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.m5 r6 = r6.n()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.n1 r6 = (b.l.a.c.f.i.n1) r6     // Catch:{ all -> 0x0b82 }
            java.lang.String r9 = r6.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0b82 }
            java.lang.String r10 = "_sr"
            java.lang.String r11 = "_efs"
            if (r9 == 0) goto L_0x08f1
            r46.P()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r9 = r6.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r9 = (b.l.a.c.f.i.o1) r9     // Catch:{ all -> 0x0b82 }
            java.lang.String r12 = "_en"
            java.lang.Object r9 = b.l.a.c.i.b.f9.l(r9, r12)     // Catch:{ all -> 0x0b82 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0b82 }
            java.lang.Object r12 = r2.get(r9)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.o r12 = (b.l.a.c.i.b.o) r12     // Catch:{ all -> 0x0b82 }
            if (r12 != 0) goto L_0x08b8
            b.l.a.c.i.b.j r12 = r46.L()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r13 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r13 = r13.s()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.o r12 = r12.z(r13, r9)     // Catch:{ all -> 0x0b82 }
            r2.put(r9, r12)     // Catch:{ all -> 0x0b82 }
        L_0x08b8:
            java.lang.Long r9 = r12.f4184i     // Catch:{ all -> 0x0b82 }
            if (r9 != 0) goto L_0x09b0
            java.lang.Long r9 = r12.f4185j     // Catch:{ all -> 0x0b82 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x0b82 }
            r15 = 1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x08d0
            r46.P()     // Catch:{ all -> 0x0b82 }
            java.lang.Long r9 = r12.f4185j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f9.J(r6, r10, r9)     // Catch:{ all -> 0x0b82 }
        L_0x08d0:
            java.lang.Boolean r9 = r12.f4186k     // Catch:{ all -> 0x0b82 }
            if (r9 == 0) goto L_0x08e6
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b82 }
            if (r9 == 0) goto L_0x08e6
            r46.P()     // Catch:{ all -> 0x0b82 }
            r9 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.f9.J(r6, r11, r12)     // Catch:{ all -> 0x0b82 }
        L_0x08e6:
            b.l.a.c.f.i.p5 r9 = r6.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r9 = (b.l.a.c.f.i.o1) r9     // Catch:{ all -> 0x0b82 }
        L_0x08ec:
            r3.add(r9)     // Catch:{ all -> 0x0b82 }
            goto L_0x09b0
        L_0x08f1:
            b.l.a.c.i.b.e4 r9 = r46.J()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r12 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r12 = r12.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r13 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r13 = r9.b(r12, r13)     // Catch:{ all -> 0x0b82 }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0b82 }
            if (r14 != 0) goto L_0x0921
            long r12 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x090c }
            goto L_0x0923
        L_0x090c:
            r0 = move-exception
            r13 = r0
            b.l.a.c.i.b.l4 r9 = r9.a     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r9 = r9.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r9 = r9.p()     // Catch:{ all -> 0x0b82 }
            java.lang.String r14 = "Unable to parse timezone offset. appId"
            java.lang.Object r12 = b.l.a.c.i.b.k3.t(r12)     // Catch:{ all -> 0x0b82 }
            r9.c(r14, r12, r13)     // Catch:{ all -> 0x0b82 }
        L_0x0921:
            r12 = 0
        L_0x0923:
            b.l.a.c.i.b.l4 r9 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k9 r9 = r9.t()     // Catch:{ all -> 0x0b82 }
            long r14 = r6.u()     // Catch:{ all -> 0x0b82 }
            long r14 = r9.N(r14, r12)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r9 = r6.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r9 = (b.l.a.c.f.i.o1) r9     // Catch:{ all -> 0x0b82 }
            r49 = r11
            r16 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0b82 }
            r16 = r12
            java.lang.String r12 = "_dbg"
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0b82 }
            if (r13 != 0) goto L_0x097d
            java.util.List r9 = r9.s()     // Catch:{ all -> 0x0b82 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0b82 }
        L_0x0951:
            boolean r13 = r9.hasNext()     // Catch:{ all -> 0x0b82 }
            if (r13 == 0) goto L_0x097d
            java.lang.Object r13 = r9.next()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.s1 r13 = (b.l.a.c.f.i.s1) r13     // Catch:{ all -> 0x0b82 }
            r18 = r9
            java.lang.String r9 = r13.t()     // Catch:{ all -> 0x0b82 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0b82 }
            if (r9 == 0) goto L_0x097a
            long r12 = r13.x()     // Catch:{ all -> 0x0b82 }
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0b82 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0b82 }
            if (r9 != 0) goto L_0x0978
            goto L_0x097d
        L_0x0978:
            r9 = 1
            goto L_0x098f
        L_0x097a:
            r9 = r18
            goto L_0x0951
        L_0x097d:
            b.l.a.c.i.b.e4 r9 = r46.J()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.w1 r11 = r7.a     // Catch:{ all -> 0x0b82 }
            java.lang.String r11 = r11.s()     // Catch:{ all -> 0x0b82 }
            java.lang.String r12 = r6.s()     // Catch:{ all -> 0x0b82 }
            int r9 = r9.q(r11, r12)     // Catch:{ all -> 0x0b82 }
        L_0x098f:
            if (r9 > 0) goto L_0x09b5
            b.l.a.c.i.b.l4 r10 = r1.f3979j     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.k3 r10 = r10.a()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.i3 r10 = r10.p()     // Catch:{ all -> 0x0b82 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r6.s()     // Catch:{ all -> 0x0b82 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0b82 }
            r10.c(r11, r12, r9)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.p5 r9 = r6.g()     // Catch:{ all -> 0x0b82 }
            b.l.a.c.f.i.o1 r9 = (b.l.a.c.f.i.o1) r9     // Catch:{ all -> 0x0b82 }
            goto L_0x08ec
        L_0x09b0:
            r8.g0(r5, r6)     // Catch:{ all -> 0x0b82 }
            goto L_0x0a5a
        L_0x09b5:
            java.lang.String r11 = r6.s()     // Catch:{ all -> 0x0b82 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0b82 }
            b.l.a.c.i.b.o r11 = (b.l.a.c.i.b.o) r11     // Catch:{ all -> 0x0b82 }
            if (r11 != 0) goto L_0x0a13
            b.l.a.c.i.b.j r11 = r46.L()     // Catch:{ all -> 0x0b47 }
            b.l.a.c.f.i.w1 r12 = r7.a     // Catch:{ all -> 0x0b47 }
            java.lang.String r12 = r12.s()     // Catch:{ all -> 0x0b47 }
            java.lang.String r13 = r6.s()     // Catch:{ all -> 0x0b47 }
            b.l.a.c.i.b.o r11 = r11.z(r12, r13)     // Catch:{ all -> 0x0b47 }
            if (r11 != 0) goto L_0x0a13
            b.l.a.c.i.b.l4 r11 = r1.f3979j     // Catch:{ all -> 0x0b47 }
            b.l.a.c.i.b.k3 r11 = r11.a()     // Catch:{ all -> 0x0b47 }
            b.l.a.c.i.b.i3 r11 = r11.p()     // Catch:{ all -> 0x0b47 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            b.l.a.c.f.i.w1 r13 = r7.a     // Catch:{ all -> 0x0b47 }
            java.lang.String r13 = r13.s()     // Catch:{ all -> 0x0b47 }
            java.lang.String r1 = r6.s()     // Catch:{ all -> 0x0b47 }
            r11.c(r12, r13, r1)     // Catch:{ all -> 0x0b47 }
            b.l.a.c.i.b.o r11 = new b.l.a.c.i.b.o     // Catch:{ all -> 0x0b47 }
            b.l.a.c.f.i.w1 r1 = r7.a     // Catch:{ all -> 0x0b47 }
            java.lang.String r29 = r1.s()     // Catch:{ all -> 0x0b47 }
            java.lang.String r30 = r6.s()     // Catch:{ all -> 0x0b47 }
            r31 = 1
            r33 = 1
            r35 = 1
            long r37 = r6.u()     // Catch:{ all -> 0x0b47 }
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r28 = r11
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r41, r42, r43, r44)     // Catch:{ all -> 0x0b47 }
        L_0x0a13:
            r46.P()     // Catch:{ all -> 0x0b47 }
            b.l.a.c.f.i.p5 r1 = r6.g()     // Catch:{ all -> 0x0b47 }
            b.l.a.c.f.i.o1 r1 = (b.l.a.c.f.i.o1) r1     // Catch:{ all -> 0x0b47 }
            java.lang.String r12 = "_eid"
            java.lang.Object r1 = b.l.a.c.i.b.f9.l(r1, r12)     // Catch:{ all -> 0x0b47 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x0a28
            r12 = 1
            goto L_0x0a29
        L_0x0a28:
            r12 = 0
        L_0x0a29:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0b47 }
            r13 = 1
            if (r9 != r13) goto L_0x0a66
            b.l.a.c.f.i.p5 r1 = r6.g()     // Catch:{ all -> 0x0b47 }
            b.l.a.c.f.i.o1 r1 = (b.l.a.c.f.i.o1) r1     // Catch:{ all -> 0x0b47 }
            r3.add(r1)     // Catch:{ all -> 0x0b47 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x0a57
            java.lang.Long r1 = r11.f4184i     // Catch:{ all -> 0x0b47 }
            if (r1 != 0) goto L_0x0a4b
            java.lang.Long r1 = r11.f4185j     // Catch:{ all -> 0x0b47 }
            if (r1 != 0) goto L_0x0a4b
            java.lang.Boolean r1 = r11.f4186k     // Catch:{ all -> 0x0b47 }
            if (r1 == 0) goto L_0x0a57
        L_0x0a4b:
            r1 = 0
            b.l.a.c.i.b.o r9 = r11.c(r1, r1, r1)     // Catch:{ all -> 0x0b47 }
            java.lang.String r1 = r6.s()     // Catch:{ all -> 0x0b47 }
            r2.put(r1, r9)     // Catch:{ all -> 0x0b47 }
        L_0x0a57:
            r8.g0(r5, r6)     // Catch:{ all -> 0x0b47 }
        L_0x0a5a:
            r13 = r4
            r19 = r7
            r4 = r46
            r7 = r5
            r5 = r8
            r8 = r2
            r1 = 1
            goto L_0x0b3c
        L_0x0a66:
            int r13 = r4.nextInt(r9)     // Catch:{ all -> 0x0b47 }
            if (r13 != 0) goto L_0x0aa9
            r46.P()     // Catch:{ all -> 0x0b47 }
            r13 = r4
            r18 = r5
            long r4 = (long) r9     // Catch:{ all -> 0x0b47 }
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0b47 }
            b.l.a.c.i.b.f9.J(r6, r10, r1)     // Catch:{ all -> 0x0b47 }
            b.l.a.c.f.i.p5 r4 = r6.g()     // Catch:{ all -> 0x0b47 }
            b.l.a.c.f.i.o1 r4 = (b.l.a.c.f.i.o1) r4     // Catch:{ all -> 0x0b47 }
            r3.add(r4)     // Catch:{ all -> 0x0b47 }
            boolean r4 = r12.booleanValue()     // Catch:{ all -> 0x0b47 }
            if (r4 == 0) goto L_0x0a8e
            r4 = 0
            b.l.a.c.i.b.o r11 = r11.c(r4, r1, r4)     // Catch:{ all -> 0x0b47 }
        L_0x0a8e:
            java.lang.String r1 = r6.s()     // Catch:{ all -> 0x0b47 }
            long r4 = r6.u()     // Catch:{ all -> 0x0b47 }
            b.l.a.c.i.b.o r4 = r11.b(r4, r14)     // Catch:{ all -> 0x0b47 }
            r2.put(r1, r4)     // Catch:{ all -> 0x0b47 }
            r4 = r46
            r19 = r7
            r5 = r8
            r7 = r18
            r8 = r2
            r1 = 1
            goto L_0x0b39
        L_0x0aa9:
            r13 = r4
            r18 = r5
            java.lang.Long r4 = r11.f4183h     // Catch:{ all -> 0x0b47 }
            if (r4 == 0) goto L_0x0ac0
            long r4 = r4.longValue()     // Catch:{ all -> 0x0b47 }
            r23 = r1
            r22 = r2
            r1 = r4
            r19 = r7
            r21 = r8
            r4 = r46
            goto L_0x0ada
        L_0x0ac0:
            r4 = r46
            b.l.a.c.i.b.l4 r5 = r4.f3979j     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k9 r5 = r5.t()     // Catch:{ all -> 0x0e36 }
            r19 = r7
            r21 = r8
            long r7 = r6.v()     // Catch:{ all -> 0x0e36 }
            r23 = r1
            r22 = r2
            r1 = r16
            long r1 = r5.N(r7, r1)     // Catch:{ all -> 0x0e36 }
        L_0x0ada:
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0b1a
            r46.P()     // Catch:{ all -> 0x0e36 }
            r1 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0e36 }
            r7 = r49
            b.l.a.c.i.b.f9.J(r6, r7, r5)     // Catch:{ all -> 0x0e36 }
            r46.P()     // Catch:{ all -> 0x0e36 }
            long r7 = (long) r9     // Catch:{ all -> 0x0e36 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.f9.J(r6, r10, r5)     // Catch:{ all -> 0x0e36 }
            b.l.a.c.f.i.p5 r7 = r6.g()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.f.i.o1 r7 = (b.l.a.c.f.i.o1) r7     // Catch:{ all -> 0x0e36 }
            r3.add(r7)     // Catch:{ all -> 0x0e36 }
            boolean r7 = r12.booleanValue()     // Catch:{ all -> 0x0e36 }
            if (r7 == 0) goto L_0x0b0d
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0e36 }
            r8 = 0
            b.l.a.c.i.b.o r11 = r11.c(r8, r5, r7)     // Catch:{ all -> 0x0e36 }
        L_0x0b0d:
            java.lang.String r5 = r6.s()     // Catch:{ all -> 0x0e36 }
            long r7 = r6.u()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.o r7 = r11.b(r7, r14)     // Catch:{ all -> 0x0e36 }
            goto L_0x0b2d
        L_0x0b1a:
            r1 = 1
            boolean r5 = r12.booleanValue()     // Catch:{ all -> 0x0e36 }
            if (r5 == 0) goto L_0x0b33
            java.lang.String r5 = r6.s()     // Catch:{ all -> 0x0e36 }
            r7 = r23
            r8 = 0
            b.l.a.c.i.b.o r7 = r11.c(r7, r8, r8)     // Catch:{ all -> 0x0e36 }
        L_0x0b2d:
            r8 = r22
            r8.put(r5, r7)     // Catch:{ all -> 0x0e36 }
            goto L_0x0b35
        L_0x0b33:
            r8 = r22
        L_0x0b35:
            r7 = r18
            r5 = r21
        L_0x0b39:
            r5.g0(r7, r6)     // Catch:{ all -> 0x0e36 }
        L_0x0b3c:
            int r6 = r7 + 1
            r1 = r4
            r2 = r8
            r4 = r13
            r7 = r19
            r8 = r5
            r5 = r6
            goto L_0x086e
        L_0x0b47:
            r0 = move-exception
            r4 = r46
            goto L_0x0b84
        L_0x0b4b:
            r4 = r1
            r19 = r7
            r5 = r8
            r8 = r2
            int r1 = r3.size()     // Catch:{ all -> 0x0e36 }
            int r2 = r5.e0()     // Catch:{ all -> 0x0e36 }
            if (r1 >= r2) goto L_0x0b60
            r5.j0()     // Catch:{ all -> 0x0e36 }
            r5.i0(r3)     // Catch:{ all -> 0x0e36 }
        L_0x0b60:
            java.util.Set r1 = r8.entrySet()     // Catch:{ all -> 0x0e36 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0e36 }
        L_0x0b68:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0e36 }
            if (r2 == 0) goto L_0x0b8b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0e36 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.j r3 = r46.L()     // Catch:{ all -> 0x0e36 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.o r2 = (b.l.a.c.i.b.o) r2     // Catch:{ all -> 0x0e36 }
            r3.A(r2)     // Catch:{ all -> 0x0e36 }
            goto L_0x0b68
        L_0x0b82:
            r0 = move-exception
            r4 = r1
        L_0x0b84:
            r1 = r0
            goto L_0x0e4a
        L_0x0b87:
            r4 = r1
            r19 = r7
            r5 = r8
        L_0x0b8b:
            r1 = r19
            b.l.a.c.f.i.w1 r2 = r1.a     // Catch:{ all -> 0x0e36 }
            java.lang.String r2 = r2.s()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.j r3 = r46.L()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.a5 r3 = r3.L(r2)     // Catch:{ all -> 0x0e36 }
            if (r3 != 0) goto L_0x0bb7
            b.l.a.c.i.b.l4 r3 = r4.f3979j     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ all -> 0x0e36 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            b.l.a.c.f.i.w1 r7 = r1.a     // Catch:{ all -> 0x0e36 }
            java.lang.String r7 = r7.s()     // Catch:{ all -> 0x0e36 }
            java.lang.Object r7 = b.l.a.c.i.b.k3.t(r7)     // Catch:{ all -> 0x0e36 }
            r3.b(r6, r7)     // Catch:{ all -> 0x0e36 }
            goto L_0x0c12
        L_0x0bb7:
            int r6 = r5.e0()     // Catch:{ all -> 0x0e36 }
            if (r6 <= 0) goto L_0x0c12
            long r6 = r3.N()     // Catch:{ all -> 0x0e36 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0bcb
            r5.z0(r6)     // Catch:{ all -> 0x0e36 }
            goto L_0x0bce
        L_0x0bcb:
            r5.A0()     // Catch:{ all -> 0x0e36 }
        L_0x0bce:
            long r8 = r3.L()     // Catch:{ all -> 0x0e36 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0bd9
            goto L_0x0bda
        L_0x0bd9:
            r6 = r8
        L_0x0bda:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0be2
            r5.x0(r6)     // Catch:{ all -> 0x0e36 }
            goto L_0x0be5
        L_0x0be2:
            r5.y0()     // Catch:{ all -> 0x0e36 }
        L_0x0be5:
            r3.n()     // Catch:{ all -> 0x0e36 }
            long r6 = r3.i()     // Catch:{ all -> 0x0e36 }
            int r6 = (int) r6     // Catch:{ all -> 0x0e36 }
            r5.E(r6)     // Catch:{ all -> 0x0e36 }
            long r6 = r5.t0()     // Catch:{ all -> 0x0e36 }
            r3.M(r6)     // Catch:{ all -> 0x0e36 }
            long r6 = r5.v0()     // Catch:{ all -> 0x0e36 }
            r3.O(r6)     // Catch:{ all -> 0x0e36 }
            java.lang.String r6 = r3.o()     // Catch:{ all -> 0x0e36 }
            if (r6 == 0) goto L_0x0c08
            r5.F(r6)     // Catch:{ all -> 0x0e36 }
            goto L_0x0c0b
        L_0x0c08:
            r5.G()     // Catch:{ all -> 0x0e36 }
        L_0x0c0b:
            b.l.a.c.i.b.j r6 = r46.L()     // Catch:{ all -> 0x0e36 }
            r6.M(r3)     // Catch:{ all -> 0x0e36 }
        L_0x0c12:
            int r3 = r5.e0()     // Catch:{ all -> 0x0e36 }
            if (r3 <= 0) goto L_0x0d91
            b.l.a.c.i.b.l4 r3 = r4.f3979j     // Catch:{ all -> 0x0e36 }
            r3.e()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.e4 r3 = r46.J()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.f.i.w1 r6 = r1.a     // Catch:{ all -> 0x0e36 }
            java.lang.String r6 = r6.s()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.f.i.c1 r3 = r3.l(r6)     // Catch:{ all -> 0x0e36 }
            r6 = -1
            if (r3 == 0) goto L_0x0c3e
            boolean r8 = r3.s()     // Catch:{ all -> 0x0e36 }
            if (r8 != 0) goto L_0x0c36
            goto L_0x0c3e
        L_0x0c36:
            long r8 = r3.t()     // Catch:{ all -> 0x0e36 }
            r5.R(r8)     // Catch:{ all -> 0x0e36 }
            goto L_0x0c67
        L_0x0c3e:
            b.l.a.c.f.i.w1 r3 = r1.a     // Catch:{ all -> 0x0e36 }
            java.lang.String r3 = r3.H()     // Catch:{ all -> 0x0e36 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0e36 }
            if (r3 == 0) goto L_0x0c4e
            r5.R(r6)     // Catch:{ all -> 0x0e36 }
            goto L_0x0c67
        L_0x0c4e:
            b.l.a.c.i.b.l4 r3 = r4.f3979j     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.i3 r3 = r3.p()     // Catch:{ all -> 0x0e36 }
            java.lang.String r8 = "Did not find measurement config or missing version info. appId"
            b.l.a.c.f.i.w1 r9 = r1.a     // Catch:{ all -> 0x0e36 }
            java.lang.String r9 = r9.s()     // Catch:{ all -> 0x0e36 }
            java.lang.Object r9 = b.l.a.c.i.b.k3.t(r9)     // Catch:{ all -> 0x0e36 }
            r3.b(r8, r9)     // Catch:{ all -> 0x0e36 }
        L_0x0c67:
            b.l.a.c.i.b.j r3 = r46.L()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.f.i.p5 r5 = r5.g()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.f.i.w1 r5 = (b.l.a.c.f.i.w1) r5     // Catch:{ all -> 0x0e36 }
            r3.h()     // Catch:{ all -> 0x0e36 }
            r3.i()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.b.a.A(r5)     // Catch:{ all -> 0x0e36 }
            java.lang.String r8 = r5.s()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.b.a.x(r8)     // Catch:{ all -> 0x0e36 }
            boolean r8 = r5.s1()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.b.a.F(r8)     // Catch:{ all -> 0x0e36 }
            r3.Q()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.l4 r8 = r3.a     // Catch:{ all -> 0x0e36 }
            b.l.a.c.c.p.b r8 = r8.c()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.c.p.c r8 = (b.l.a.c.c.p.c) r8
            long r8 = r8.a()     // Catch:{ all -> 0x0e36 }
            long r10 = r5.t1()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.l4 r12 = r3.a     // Catch:{ all -> 0x0e36 }
            r12.p()     // Catch:{ all -> 0x0e36 }
            long r12 = b.l.a.c.i.b.f.i()     // Catch:{ all -> 0x0e36 }
            long r12 = r8 - r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 < 0) goto L_0x0cbc
            long r10 = r5.t1()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.l4 r12 = r3.a     // Catch:{ all -> 0x0e36 }
            r12.p()     // Catch:{ all -> 0x0e36 }
            long r12 = b.l.a.c.i.b.f.i()     // Catch:{ all -> 0x0e36 }
            long r12 = r12 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0cdf
        L_0x0cbc:
            b.l.a.c.i.b.l4 r10 = r3.a     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k3 r10 = r10.a()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.i3 r10 = r10.p()     // Catch:{ all -> 0x0e36 }
            java.lang.String r11 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            java.lang.String r12 = r5.s()     // Catch:{ all -> 0x0e36 }
            java.lang.Object r12 = b.l.a.c.i.b.k3.t(r12)     // Catch:{ all -> 0x0e36 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0e36 }
            long r13 = r5.t1()     // Catch:{ all -> 0x0e36 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0e36 }
            r10.d(r11, r12, r8, r9)     // Catch:{ all -> 0x0e36 }
        L_0x0cdf:
            byte[] r8 = r5.e()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.d9 r9 = r3.f4305b     // Catch:{ IOException -> 0x0d7b }
            b.l.a.c.i.b.f9 r9 = r9.P()     // Catch:{ IOException -> 0x0d7b }
            byte[] r8 = r9.F(r8)     // Catch:{ IOException -> 0x0d7b }
            b.l.a.c.i.b.l4 r9 = r3.a     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k3 r9 = r9.a()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.i3 r9 = r9.s()     // Catch:{ all -> 0x0e36 }
            java.lang.String r10 = "Saving bundle, size"
            int r11 = r8.length     // Catch:{ all -> 0x0e36 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0e36 }
            r9.b(r10, r11)     // Catch:{ all -> 0x0e36 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0e36 }
            r9.<init>()     // Catch:{ all -> 0x0e36 }
            java.lang.String r10 = "app_id"
            java.lang.String r11 = r5.s()     // Catch:{ all -> 0x0e36 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0e36 }
            java.lang.String r10 = "bundle_end_timestamp"
            long r11 = r5.t1()     // Catch:{ all -> 0x0e36 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0e36 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0e36 }
            java.lang.String r10 = "data"
            r9.put(r10, r8)     // Catch:{ all -> 0x0e36 }
            java.lang.String r8 = "has_realtime"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0e36 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0e36 }
            boolean r8 = r5.u0()     // Catch:{ all -> 0x0e36 }
            if (r8 == 0) goto L_0x0d3d
            java.lang.String r8 = "retry_count"
            int r10 = r5.v0()     // Catch:{ all -> 0x0e36 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0e36 }
            r9.put(r8, r10)     // Catch:{ all -> 0x0e36 }
        L_0x0d3d:
            android.database.sqlite.SQLiteDatabase r8 = r3.y()     // Catch:{ SQLiteException -> 0x0d64 }
            java.lang.String r10 = "queue"
            r11 = 0
            long r8 = r8.insert(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0d64 }
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0d91
            b.l.a.c.i.b.l4 r6 = r3.a     // Catch:{ SQLiteException -> 0x0d64 }
            b.l.a.c.i.b.k3 r6 = r6.a()     // Catch:{ SQLiteException -> 0x0d64 }
            b.l.a.c.i.b.i3 r6 = r6.o()     // Catch:{ SQLiteException -> 0x0d64 }
            java.lang.String r7 = "Failed to insert bundle (got -1). appId"
            java.lang.String r8 = r5.s()     // Catch:{ SQLiteException -> 0x0d64 }
            java.lang.Object r8 = b.l.a.c.i.b.k3.t(r8)     // Catch:{ SQLiteException -> 0x0d64 }
            r6.b(r7, r8)     // Catch:{ SQLiteException -> 0x0d64 }
            goto L_0x0d91
        L_0x0d64:
            r0 = move-exception
            r6 = r0
            b.l.a.c.i.b.l4 r3 = r3.a     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ all -> 0x0e36 }
            java.lang.String r7 = "Error storing bundle. appId"
            java.lang.String r5 = r5.s()     // Catch:{ all -> 0x0e36 }
        L_0x0d76:
            java.lang.Object r5 = b.l.a.c.i.b.k3.t(r5)     // Catch:{ all -> 0x0e36 }
            goto L_0x0d8e
        L_0x0d7b:
            r0 = move-exception
            r6 = r0
            b.l.a.c.i.b.l4 r3 = r3.a     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ all -> 0x0e36 }
            java.lang.String r7 = "Data loss. Failed to serialize bundle. appId"
            java.lang.String r5 = r5.s()     // Catch:{ all -> 0x0e36 }
            goto L_0x0d76
        L_0x0d8e:
            r3.c(r7, r5, r6)     // Catch:{ all -> 0x0e36 }
        L_0x0d91:
            b.l.a.c.i.b.j r3 = r46.L()     // Catch:{ all -> 0x0e36 }
            java.util.List<java.lang.Long> r1 = r1.f3956b     // Catch:{ all -> 0x0e36 }
            b.l.a.c.b.a.A(r1)     // Catch:{ all -> 0x0e36 }
            r3.h()     // Catch:{ all -> 0x0e36 }
            r3.i()     // Catch:{ all -> 0x0e36 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e36 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0e36 }
            r6 = 0
        L_0x0da8:
            int r7 = r1.size()     // Catch:{ all -> 0x0e36 }
            if (r6 >= r7) goto L_0x0dc5
            if (r6 == 0) goto L_0x0db5
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0e36 }
        L_0x0db5:
            java.lang.Object r7 = r1.get(r6)     // Catch:{ all -> 0x0e36 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0e36 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0e36 }
            r5.append(r7)     // Catch:{ all -> 0x0e36 }
            int r6 = r6 + 1
            goto L_0x0da8
        L_0x0dc5:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0e36 }
            android.database.sqlite.SQLiteDatabase r6 = r3.y()     // Catch:{ all -> 0x0e36 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0e36 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0e36 }
            int r6 = r1.size()     // Catch:{ all -> 0x0e36 }
            if (r5 == r6) goto L_0x0dfa
            b.l.a.c.i.b.l4 r3 = r3.a     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k3 r3 = r3.a()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.i3 r3 = r3.o()     // Catch:{ all -> 0x0e36 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0e36 }
            int r1 = r1.size()     // Catch:{ all -> 0x0e36 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0e36 }
            r3.c(r6, r5, r1)     // Catch:{ all -> 0x0e36 }
        L_0x0dfa:
            b.l.a.c.i.b.j r1 = r46.L()     // Catch:{ all -> 0x0e36 }
            android.database.sqlite.SQLiteDatabase r3 = r1.y()     // Catch:{ all -> 0x0e36 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0e11 }
            r6 = 0
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0e11 }
            r6 = 1
            r5[r6] = r2     // Catch:{ SQLiteException -> 0x0e11 }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r3.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0e11 }
            goto L_0x0e26
        L_0x0e11:
            r0 = move-exception
            r3 = r0
            b.l.a.c.i.b.l4 r1 = r1.a     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.k3 r1 = r1.a()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.i3 r1 = r1.o()     // Catch:{ all -> 0x0e36 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = b.l.a.c.i.b.k3.t(r2)     // Catch:{ all -> 0x0e36 }
            r1.c(r5, r2, r3)     // Catch:{ all -> 0x0e36 }
        L_0x0e26:
            b.l.a.c.i.b.j r1 = r46.L()     // Catch:{ all -> 0x0e36 }
            r1.w()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.j r1 = r46.L()
            r1.x()
            r1 = 1
            return r1
        L_0x0e36:
            r0 = move-exception
            goto L_0x0b84
        L_0x0e39:
            r4 = r1
            b.l.a.c.i.b.j r1 = r46.L()     // Catch:{ all -> 0x0e36 }
            r1.w()     // Catch:{ all -> 0x0e36 }
            b.l.a.c.i.b.j r1 = r46.L()
            r1.x()
            r1 = 0
            return r1
        L_0x0e4a:
            b.l.a.c.i.b.j r2 = r46.L()
            r2.x()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.i.b.d9.y(java.lang.String, long):boolean");
    }

    public final void z(v1 v1Var, long j2, boolean z2) {
        i9 i9Var;
        String str = true != z2 ? "_lte" : "_se";
        i9 D = L().D(v1Var.s(), str);
        if (D == null || D.f4066e == null) {
            String s2 = v1Var.s();
            Objects.requireNonNull((c) this.f3979j.f4121n);
            i9Var = new i9(s2, "auto", str, System.currentTimeMillis(), Long.valueOf(j2));
        } else {
            String s3 = v1Var.s();
            Objects.requireNonNull((c) this.f3979j.f4121n);
            i9Var = new i9(s3, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) D.f4066e).longValue() + j2));
        }
        f2 B = g2.B();
        B.n(str);
        Objects.requireNonNull((c) this.f3979j.f4121n);
        B.m(System.currentTimeMillis());
        B.o(((Long) i9Var.f4066e).longValue());
        g2 g2Var = (g2) B.g();
        int H = f9.H(v1Var, str);
        if (H >= 0) {
            if (v1Var.f3655j) {
                v1Var.j();
                v1Var.f3655j = false;
            }
            w1.K0((w1) v1Var.f3654i, H, g2Var);
        } else {
            if (v1Var.f3655j) {
                v1Var.j();
                v1Var.f3655j = false;
            }
            w1.L0((w1) v1Var.f3654i, g2Var);
        }
        if (j2 > 0) {
            L().C(i9Var);
            this.f3979j.a().f4096n.c("Updated engagement user property. scope, value", true != z2 ? "lifetime" : "session-scoped", i9Var.f4066e);
        }
    }
}
