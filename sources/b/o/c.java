package b.o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.annotation.Nullable;
import b.o.a;
import b.o.i2;
import java.util.Map;
import java.util.Objects;

public class c implements Application.ActivityLifecycleCallbacks {
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public static c f6027h;
    @SuppressLint({"StaticFieldLeak"})
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public static a f6028i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public static ComponentCallbacks f6029j;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        a aVar = f6028i;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        a aVar = f6028i;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, "onActivityDestroyed: " + activity, (Throwable) null);
            a.f5983e.clear();
            if (activity == aVar.a) {
                aVar.a = null;
                aVar.c();
            }
            aVar.d();
        }
    }

    public void onActivityPaused(Activity activity) {
        a aVar = f6028i;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, "onActivityPaused: " + activity, (Throwable) null);
            if (activity == aVar.a) {
                aVar.a = null;
                aVar.c();
            }
            aVar.d();
        }
    }

    public void onActivityResumed(Activity activity) {
        a aVar = f6028i;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, "onActivityResumed: " + activity, (Throwable) null);
            aVar.e(activity);
            aVar.d();
            aVar.b();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        a aVar = f6028i;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    public void onActivityStopped(Activity activity) {
        a aVar = f6028i;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, "onActivityStopped: " + activity, (Throwable) null);
            if (activity == aVar.a) {
                aVar.a = null;
                aVar.c();
            }
            for (Map.Entry<String, a.b> value : a.c.entrySet()) {
                ((a.b) value.getValue()).c(activity);
            }
            aVar.d();
        }
    }
}
