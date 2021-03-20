package b.l.a.c.i.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.MainThread;
import b.l.a.c.c.p.c;
import com.segment.analytics.AnalyticsContext;
import java.util.Objects;

@TargetApi(14)
@MainThread
public final class l6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m6 f4125h;

    public /* synthetic */ l6(m6 m6Var) {
        this.f4125h = m6Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f4125h.a.a().f4096n.a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f4125h.a.t();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f4125h.a.d().q(new k6(this, z, data, str, queryParameter));
                    }
                }
            }
        } catch (Exception e2) {
            this.f4125h.a.a().f.b("Throwable caught in onActivityCreated", e2);
        } catch (Throwable th) {
            this.f4125h.a.y().t(activity, bundle);
            throw th;
        }
        this.f4125h.a.y().t(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        b7 y = this.f4125h.a.y();
        synchronized (y.f3930l) {
            if (activity == y.f3925g) {
                y.f3925g = null;
            }
        }
        if (y.a.f4114g.w()) {
            y.f.remove(activity);
        }
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        b7 y = this.f4125h.a.y();
        if (y.a.f4114g.r((String) null, x2.u0)) {
            synchronized (y.f3930l) {
                y.f3929k = false;
                y.f3926h = true;
            }
        }
        Objects.requireNonNull((c) y.a.f4121n);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!y.a.f4114g.r((String) null, x2.t0) || y.a.f4114g.w()) {
            t6 o2 = y.o(activity);
            y.d = y.c;
            y.c = null;
            y.a.d().q(new y6(y, o2, elapsedRealtime));
        } else {
            y.c = null;
            y.a.d().q(new x6(y, elapsedRealtime));
        }
        q8 r = this.f4125h.a.r();
        Objects.requireNonNull((c) r.a.f4121n);
        r.a.d().q(new j8(r, SystemClock.elapsedRealtime()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        q8 r = this.f4125h.a.r();
        Objects.requireNonNull((c) r.a.f4121n);
        r.a.d().q(new i8(r, SystemClock.elapsedRealtime()));
        b7 y = this.f4125h.a.y();
        if (y.a.f4114g.r((String) null, x2.u0)) {
            synchronized (y.f3930l) {
                y.f3929k = true;
                if (activity != y.f3925g) {
                    synchronized (y.f3930l) {
                        y.f3925g = activity;
                        y.f3926h = false;
                    }
                    if (y.a.f4114g.r((String) null, x2.t0) && y.a.f4114g.w()) {
                        y.f3927i = null;
                        y.a.d().q(new a7(y));
                    }
                }
            }
        }
        if (!y.a.f4114g.r((String) null, x2.t0) || y.a.f4114g.w()) {
            y.l(activity, y.o(activity), false);
            c2 g2 = y.a.g();
            Objects.requireNonNull((c) g2.a.f4121n);
            g2.a.d().q(new b1(g2, SystemClock.elapsedRealtime()));
            return;
        }
        y.c = y.f3927i;
        y.a.d().q(new w6(y));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        t6 t6Var;
        b7 y = this.f4125h.a.y();
        if (y.a.f4114g.w() && bundle != null && (t6Var = y.f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(AnalyticsContext.Device.DEVICE_ID_KEY, t6Var.c);
            bundle2.putString("name", t6Var.a);
            bundle2.putString("referrer_name", t6Var.f4282b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
