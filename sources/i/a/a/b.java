package i.a.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Deque;
import java.util.Locale;

public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: h  reason: collision with root package name */
    public int f8041h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final DateFormat f8042i = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity.getClass() != c.f8043b.f8053p) {
            c.d = new WeakReference<>(activity);
        }
        if (c.f8043b.f8050m) {
            Deque<String> deque = c.c;
            deque.add(this.f8042i.format(new Date()) + ": " + activity.getClass().getSimpleName() + " created\n");
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (c.f8043b.f8050m) {
            Deque<String> deque = c.c;
            deque.add(this.f8042i.format(new Date()) + ": " + activity.getClass().getSimpleName() + " destroyed\n");
        }
    }

    public void onActivityPaused(Activity activity) {
        if (c.f8043b.f8050m) {
            Deque<String> deque = c.c;
            deque.add(this.f8042i.format(new Date()) + ": " + activity.getClass().getSimpleName() + " paused\n");
        }
    }

    public void onActivityResumed(Activity activity) {
        if (c.f8043b.f8050m) {
            Deque<String> deque = c.c;
            deque.add(this.f8042i.format(new Date()) + ": " + activity.getClass().getSimpleName() + " resumed\n");
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        boolean z = true;
        int i2 = this.f8041h + 1;
        this.f8041h = i2;
        if (i2 != 0) {
            z = false;
        }
        c.f8044e = z;
    }

    public void onActivityStopped(Activity activity) {
        boolean z = true;
        int i2 = this.f8041h - 1;
        this.f8041h = i2;
        if (i2 != 0) {
            z = false;
        }
        c.f8044e = z;
    }
}
