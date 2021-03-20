package b.l.a.c.f.i;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import b.l.a.c.c.p.b;
import b.l.a.c.c.p.c;
import b.l.a.c.i.a.a;
import b.l.a.c.i.b.l5;
import b.l.a.c.i.b.s6;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class f0 {

    /* renamed from: i  reason: collision with root package name */
    public static volatile f0 f3545i;

    /* renamed from: j  reason: collision with root package name */
    public static Boolean f3546j;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3547b;
    public final ExecutorService c;
    public final a d;
    @GuardedBy("listenerList")

    /* renamed from: e  reason: collision with root package name */
    public final List<Pair<l5, w>> f3548e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3549g;

    /* renamed from: h  reason: collision with root package name */
    public volatile qb f3550h;

    public f0(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        this.a = (str == null || !c(str2, str3)) ? "FA" : str;
        this.f3547b = c.a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new p());
        boolean z2 = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.d = new a(this);
        this.f3548e = new ArrayList();
        try {
            if (s6.b(context, "google_app_id", b.l.a.c.b.a.a1(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (!z) {
                    this.f3549g = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        if (!c(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z2)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        this.c.execute(new f(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new e0(this));
        }
    }

    public static /* synthetic */ void a(Context context) {
        Boolean bool = Boolean.TRUE;
        synchronized (f0.class) {
            try {
                if (f3546j == null) {
                    b.l.a.c.b.a.x("app_measurement_internal_disable_startup_flags");
                    try {
                        ApplicationInfo a2 = b.l.a.c.c.q.b.a(context).a(context.getPackageName(), 128);
                        if (a2 != null) {
                            Bundle bundle = a2.metaData;
                            if (bundle != null) {
                                if (bundle.getBoolean("app_measurement_internal_disable_startup_flags")) {
                                    f3546j = bool;
                                    return;
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                    f3546j = Boolean.valueOf(sharedPreferences.getBoolean("allow_remote_dynamite", true));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("allow_remote_dynamite");
                    edit.apply();
                }
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                f3546j = bool;
            }
        }
    }

    public static final boolean c(String str, String str2) {
        boolean z;
        if (!(str2 == null || str == null)) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public static f0 d(Context context, String str, String str2, String str3, Bundle bundle) {
        Objects.requireNonNull(context, "null reference");
        if (f3545i == null) {
            synchronized (f0.class) {
                if (f3545i == null) {
                    f3545i = new f0(context, (String) null, (String) null, (String) null, bundle);
                }
            }
        }
        return f3545i;
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.f3549g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            this.c.execute(new o(this, "Error with data collection. Data lost.", exc));
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    public final void e(String str, String str2, Bundle bundle) {
        this.c.execute(new t(this, (Long) null, str, str2, bundle, true, true));
    }
}
