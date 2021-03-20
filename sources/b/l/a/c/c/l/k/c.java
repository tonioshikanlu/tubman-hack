package b.l.a.c.c.l.k;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: l  reason: collision with root package name */
    public static final c f2618l = new c();

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f2619h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f2620i = new AtomicBoolean();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<a> f2621j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public boolean f2622k = false;

    public interface a {
        void a(boolean z);
    }

    public static void b(Application application) {
        c cVar = f2618l;
        synchronized (cVar) {
            if (!cVar.f2622k) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f2622k = true;
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f2618l) {
            this.f2621j.add(aVar);
        }
    }

    public final void c(boolean z) {
        synchronized (f2618l) {
            ArrayList<a> arrayList = this.f2621j;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                a aVar = arrayList.get(i2);
                i2++;
                aVar.a(z);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f2619h.compareAndSet(true, false);
        this.f2620i.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f2619h.compareAndSet(true, false);
        this.f2620i.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f2619h.compareAndSet(false, true)) {
            this.f2620i.set(true);
            c(true);
        }
    }
}
