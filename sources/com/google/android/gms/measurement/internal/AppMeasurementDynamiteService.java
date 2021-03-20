package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.RecentlyNonNull;
import androidx.collection.ArrayMap;
import b.l.a.c.b.a;
import b.l.a.c.d.b;
import b.l.a.c.d.d;
import b.l.a.c.f.i.pb;
import b.l.a.c.f.i.t8;
import b.l.a.c.f.i.tb;
import b.l.a.c.f.i.wb;
import b.l.a.c.f.i.yb;
import b.l.a.c.f.i.zb;
import b.l.a.c.i.b.c6;
import b.l.a.c.i.b.d6;
import b.l.a.c.i.b.e6;
import b.l.a.c.i.b.f;
import b.l.a.c.i.b.f6;
import b.l.a.c.i.b.g6;
import b.l.a.c.i.b.k9;
import b.l.a.c.i.b.l4;
import b.l.a.c.i.b.l5;
import b.l.a.c.i.b.l6;
import b.l.a.c.i.b.l9;
import b.l.a.c.i.b.m6;
import b.l.a.c.i.b.m9;
import b.l.a.c.i.b.n5;
import b.l.a.c.i.b.n9;
import b.l.a.c.i.b.o9;
import b.l.a.c.i.b.p5;
import b.l.a.c.i.b.q;
import b.l.a.c.i.b.r5;
import b.l.a.c.i.b.s;
import b.l.a.c.i.b.t6;
import b.l.a.c.i.b.u5;
import b.l.a.c.i.b.x2;
import b.l.a.c.i.b.x5;
import b.l.a.c.i.b.y5;
import b.l.a.c.i.b.z6;
import b.l.a.c.i.b.z7;
import b.l.a.c.i.b.z8;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@DynamiteApi
public class AppMeasurementDynamiteService extends pb {
    public l4 a = null;
    @GuardedBy("listenerMap")

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, l5> f7321b = new ArrayMap();

    public void beginAdUnitExposure(@RecentlyNonNull String str, long j2) {
        k();
        this.a.g().i(str, j2);
    }

    public void clearConditionalUserProperty(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle) {
        k();
        this.a.s().r(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j2) {
        k();
        m6 s = this.a.s();
        s.i();
        s.a.d().q(new g6(s, (Boolean) null));
    }

    public void endAdUnitExposure(@RecentlyNonNull String str, long j2) {
        k();
        this.a.g().j(str, j2);
    }

    public void generateEventId(tb tbVar) {
        k();
        long c0 = this.a.t().c0();
        k();
        this.a.t().Q(tbVar, c0);
    }

    public void getAppInstanceId(tb tbVar) {
        k();
        this.a.d().q(new y5(this, tbVar));
    }

    public void getCachedAppInstanceId(tb tbVar) {
        k();
        k();
        this.a.t().P(tbVar, this.a.s().f4149g.get());
    }

    public void getConditionalUserProperties(String str, String str2, tb tbVar) {
        k();
        this.a.d().q(new l9(this, tbVar, str, str2));
    }

    public void getCurrentScreenClass(tb tbVar) {
        k();
        t6 t6Var = this.a.s().a.y().c;
        String str = t6Var != null ? t6Var.f4282b : null;
        k();
        this.a.t().P(tbVar, str);
    }

    public void getCurrentScreenName(tb tbVar) {
        k();
        t6 t6Var = this.a.s().a.y().c;
        String str = t6Var != null ? t6Var.a : null;
        k();
        this.a.t().P(tbVar, str);
    }

    public void getGmpAppId(tb tbVar) {
        k();
        String s = this.a.s().s();
        k();
        this.a.t().P(tbVar, s);
    }

    public void getMaxUserProperties(String str, tb tbVar) {
        k();
        m6 s = this.a.s();
        Objects.requireNonNull(s);
        a.x(str);
        f fVar = s.a.f4114g;
        k();
        this.a.t().R(tbVar, 25);
    }

    public void getTestFlag(tb tbVar, int i2) {
        k();
        if (i2 == 0) {
            k9 t = this.a.t();
            m6 s = this.a.s();
            Objects.requireNonNull(s);
            AtomicReference atomicReference = new AtomicReference();
            t.P(tbVar, (String) s.a.d().r(atomicReference, 15000, "String test flag value", new c6(s, atomicReference)));
        } else if (i2 == 1) {
            k9 t2 = this.a.t();
            m6 s2 = this.a.s();
            Objects.requireNonNull(s2);
            AtomicReference atomicReference2 = new AtomicReference();
            t2.Q(tbVar, ((Long) s2.a.d().r(atomicReference2, 15000, "long test flag value", new d6(s2, atomicReference2))).longValue());
        } else if (i2 == 2) {
            k9 t3 = this.a.t();
            m6 s3 = this.a.s();
            Objects.requireNonNull(s3);
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) s3.a.d().r(atomicReference3, 15000, "double test flag value", new f6(s3, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                tbVar.Z(bundle);
            } catch (RemoteException e2) {
                t3.a.a().f4091i.b("Error returning double value to wrapper", e2);
            }
        } else if (i2 == 3) {
            k9 t4 = this.a.t();
            m6 s4 = this.a.s();
            Objects.requireNonNull(s4);
            AtomicReference atomicReference4 = new AtomicReference();
            t4.R(tbVar, ((Integer) s4.a.d().r(atomicReference4, 15000, "int test flag value", new e6(s4, atomicReference4))).intValue());
        } else if (i2 == 4) {
            k9 t5 = this.a.t();
            m6 s5 = this.a.s();
            Objects.requireNonNull(s5);
            AtomicReference atomicReference5 = new AtomicReference();
            t5.T(tbVar, ((Boolean) s5.a.d().r(atomicReference5, 15000, "boolean test flag value", new x5(s5, atomicReference5))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, tb tbVar) {
        k();
        this.a.d().q(new z7(this, tbVar, str, str2, z));
    }

    public void initForTests(@RecentlyNonNull Map map) {
        k();
    }

    public void initialize(b bVar, zb zbVar, long j2) {
        l4 l4Var = this.a;
        if (l4Var == null) {
            Context context = (Context) d.n(bVar);
            Objects.requireNonNull(context, "null reference");
            this.a = l4.h(context, zbVar, Long.valueOf(j2));
            return;
        }
        l4Var.a().f4091i.a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(tb tbVar) {
        k();
        this.a.d().q(new m9(this, tbVar));
    }

    @EnsuresNonNull({"scion"})
    public final void k() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void logEvent(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull Bundle bundle, boolean z, boolean z2, long j2) {
        k();
        this.a.s().D(str, str2, bundle, z, z2, j2);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, tb tbVar, long j2) {
        Bundle bundle2;
        k();
        a.x(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.a.d().q(new z6(this, tbVar, new s(str2, new q(bundle), "app", j2), str));
    }

    public void logHealthData(int i2, @RecentlyNonNull String str, @RecentlyNonNull b bVar, @RecentlyNonNull b bVar2, @RecentlyNonNull b bVar3) {
        k();
        Object obj = null;
        Object n2 = bVar == null ? null : d.n(bVar);
        Object n3 = bVar2 == null ? null : d.n(bVar2);
        if (bVar3 != null) {
            obj = d.n(bVar3);
        }
        this.a.a().u(i2, true, false, str, n2, n3, obj);
    }

    public void onActivityCreated(@RecentlyNonNull b bVar, @RecentlyNonNull Bundle bundle, long j2) {
        k();
        l6 l6Var = this.a.s().c;
        if (l6Var != null) {
            this.a.s().w();
            l6Var.onActivityCreated((Activity) d.n(bVar), bundle);
        }
    }

    public void onActivityDestroyed(@RecentlyNonNull b bVar, long j2) {
        k();
        l6 l6Var = this.a.s().c;
        if (l6Var != null) {
            this.a.s().w();
            l6Var.onActivityDestroyed((Activity) d.n(bVar));
        }
    }

    public void onActivityPaused(@RecentlyNonNull b bVar, long j2) {
        k();
        l6 l6Var = this.a.s().c;
        if (l6Var != null) {
            this.a.s().w();
            l6Var.onActivityPaused((Activity) d.n(bVar));
        }
    }

    public void onActivityResumed(@RecentlyNonNull b bVar, long j2) {
        k();
        l6 l6Var = this.a.s().c;
        if (l6Var != null) {
            this.a.s().w();
            l6Var.onActivityResumed((Activity) d.n(bVar));
        }
    }

    public void onActivitySaveInstanceState(b bVar, tb tbVar, long j2) {
        k();
        l6 l6Var = this.a.s().c;
        Bundle bundle = new Bundle();
        if (l6Var != null) {
            this.a.s().w();
            l6Var.onActivitySaveInstanceState((Activity) d.n(bVar), bundle);
        }
        try {
            tbVar.Z(bundle);
        } catch (RemoteException e2) {
            this.a.a().f4091i.b("Error returning bundle value to wrapper", e2);
        }
    }

    public void onActivityStarted(@RecentlyNonNull b bVar, long j2) {
        k();
        if (this.a.s().c != null) {
            this.a.s().w();
            Activity activity = (Activity) d.n(bVar);
        }
    }

    public void onActivityStopped(@RecentlyNonNull b bVar, long j2) {
        k();
        if (this.a.s().c != null) {
            this.a.s().w();
            Activity activity = (Activity) d.n(bVar);
        }
    }

    public void performAction(Bundle bundle, tb tbVar, long j2) {
        k();
        tbVar.Z((Bundle) null);
    }

    public void registerOnMeasurementEventListener(wb wbVar) {
        Object obj;
        k();
        synchronized (this.f7321b) {
            obj = this.f7321b.get(Integer.valueOf(wbVar.e()));
            if (obj == null) {
                obj = new o9(this, wbVar);
                this.f7321b.put(Integer.valueOf(wbVar.e()), obj);
            }
        }
        m6 s = this.a.s();
        s.i();
        if (!s.f4148e.add(obj)) {
            s.a.a().f4091i.a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j2) {
        k();
        m6 s = this.a.s();
        s.f4149g.set((Object) null);
        s.a.d().q(new u5(s, j2));
    }

    public void setConditionalUserProperty(@RecentlyNonNull Bundle bundle, long j2) {
        k();
        if (bundle == null) {
            this.a.a().f.a("Conditional user property must not be null");
        } else {
            this.a.s().q(bundle, j2);
        }
    }

    public void setConsent(@RecentlyNonNull Bundle bundle, long j2) {
        k();
        m6 s = this.a.s();
        t8.b();
        if (s.a.f4114g.r((String) null, x2.w0)) {
            s.x(bundle, 30, j2);
        }
    }

    public void setConsentThirdParty(@RecentlyNonNull Bundle bundle, long j2) {
        k();
        m6 s = this.a.s();
        t8.b();
        if (s.a.f4114g.r((String) null, x2.x0)) {
            s.x(bundle, 10, j2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r0 <= 100) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r0 <= 100) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreen(@androidx.annotation.RecentlyNonNull b.l.a.c.d.b r3, @androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull java.lang.String r5, long r6) {
        /*
            r2 = this;
            r2.k()
            b.l.a.c.i.b.l4 r6 = r2.a
            b.l.a.c.i.b.b7 r6 = r6.y()
            java.lang.Object r3 = b.l.a.c.d.d.n(r3)
            android.app.Activity r3 = (android.app.Activity) r3
            b.l.a.c.i.b.l4 r7 = r6.a
            b.l.a.c.i.b.f r7 = r7.f4114g
            boolean r7 = r7.w()
            if (r7 != 0) goto L_0x0028
            b.l.a.c.i.b.l4 r3 = r6.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f4093k
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
        L_0x0023:
            r3.a(r4)
            goto L_0x00ee
        L_0x0028:
            b.l.a.c.i.b.t6 r7 = r6.c
            if (r7 != 0) goto L_0x0037
            b.l.a.c.i.b.l4 r3 = r6.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f4093k
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            goto L_0x0023
        L_0x0037:
            java.util.Map<android.app.Activity, b.l.a.c.i.b.t6> r0 = r6.f
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L_0x004a
            b.l.a.c.i.b.l4 r3 = r6.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f4093k
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            goto L_0x0023
        L_0x004a:
            if (r5 != 0) goto L_0x0056
            java.lang.Class r5 = r3.getClass()
            java.lang.String r0 = "Activity"
            java.lang.String r5 = r6.q(r5, r0)
        L_0x0056:
            java.lang.String r0 = r7.f4282b
            boolean r0 = b.l.a.c.i.b.k9.G(r0, r5)
            java.lang.String r7 = r7.a
            boolean r7 = b.l.a.c.i.b.k9.G(r7, r4)
            if (r0 == 0) goto L_0x0072
            if (r7 != 0) goto L_0x0067
            goto L_0x0072
        L_0x0067:
            b.l.a.c.i.b.l4 r3 = r6.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f4093k
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            goto L_0x0023
        L_0x0072:
            r7 = 100
            if (r4 == 0) goto L_0x009d
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0087
            int r0 = r4.length()
            b.l.a.c.i.b.l4 r1 = r6.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            if (r0 > r7) goto L_0x0087
            goto L_0x009d
        L_0x0087:
            b.l.a.c.i.b.l4 r3 = r6.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f4093k
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
        L_0x0099:
            r3.b(r5, r4)
            goto L_0x00ee
        L_0x009d:
            if (r5 == 0) goto L_0x00c3
            int r0 = r5.length()
            if (r0 <= 0) goto L_0x00b0
            int r0 = r5.length()
            b.l.a.c.i.b.l4 r1 = r6.a
            b.l.a.c.i.b.f r1 = r1.f4114g
            if (r0 > r7) goto L_0x00b0
            goto L_0x00c3
        L_0x00b0:
            b.l.a.c.i.b.l4 r3 = r6.a
            b.l.a.c.i.b.k3 r3 = r3.a()
            b.l.a.c.i.b.i3 r3 = r3.f4093k
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            goto L_0x0099
        L_0x00c3:
            b.l.a.c.i.b.l4 r7 = r6.a
            b.l.a.c.i.b.k3 r7 = r7.a()
            b.l.a.c.i.b.i3 r7 = r7.f4096n
            if (r4 != 0) goto L_0x00d0
            java.lang.String r0 = "null"
            goto L_0x00d1
        L_0x00d0:
            r0 = r4
        L_0x00d1:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.c(r1, r0, r5)
            b.l.a.c.i.b.t6 r7 = new b.l.a.c.i.b.t6
            b.l.a.c.i.b.l4 r0 = r6.a
            b.l.a.c.i.b.k9 r0 = r0.t()
            long r0 = r0.c0()
            r7.<init>(r4, r5, r0)
            java.util.Map<android.app.Activity, b.l.a.c.i.b.t6> r4 = r6.f
            r4.put(r3, r7)
            r4 = 1
            r6.l(r3, r7, r4)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(b.l.a.c.d.b, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z) {
        k();
        m6 s = this.a.s();
        s.i();
        s.a.d().q(new p5(s, z));
    }

    public void setDefaultEventParameters(@RecentlyNonNull Bundle bundle) {
        k();
        m6 s = this.a.s();
        s.a.d().q(new n5(s, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(wb wbVar) {
        k();
        n9 n9Var = new n9(this, wbVar);
        if (this.a.d().o()) {
            this.a.s().p(n9Var);
        } else {
            this.a.d().q(new z8(this, n9Var));
        }
    }

    public void setInstanceIdProvider(yb ybVar) {
        k();
    }

    public void setMeasurementEnabled(boolean z, long j2) {
        k();
        m6 s = this.a.s();
        Boolean valueOf = Boolean.valueOf(z);
        s.i();
        s.a.d().q(new g6(s, valueOf));
    }

    public void setMinimumSessionDuration(long j2) {
        k();
    }

    public void setSessionTimeoutDuration(long j2) {
        k();
        m6 s = this.a.s();
        s.a.d().q(new r5(s, j2));
    }

    public void setUserId(@RecentlyNonNull String str, long j2) {
        k();
        this.a.s().G((String) null, "_id", str, true, j2);
    }

    public void setUserProperty(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull b bVar, boolean z, long j2) {
        k();
        this.a.s().G(str, str2, d.n(bVar), z, j2);
    }

    public void unregisterOnMeasurementEventListener(wb wbVar) {
        Object remove;
        k();
        synchronized (this.f7321b) {
            remove = this.f7321b.remove(Integer.valueOf(wbVar.e()));
        }
        if (remove == null) {
            remove = new o9(this, wbVar);
        }
        m6 s = this.a.s();
        s.i();
        if (!s.f4148e.remove(remove)) {
            s.a.a().f4091i.a("OnEventListener had not been registered");
        }
    }
}
