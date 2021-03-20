package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import b.l.a.c.b.a;
import b.l.a.c.f.i.e;
import b.l.a.c.f.i.f0;
import b.l.a.c.i.b.n6;
import b.l.d.n.b;
import b.l.d.x.d;
import com.amplitude.api.Constants;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f7331b;
    public final f0 a;

    public FirebaseAnalytics(f0 f0Var) {
        Objects.requireNonNull(f0Var, "null reference");
        this.a = f0Var;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@RecentlyNonNull Context context) {
        if (f7331b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f7331b == null) {
                    f7331b = new FirebaseAnalytics(f0.d(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f7331b;
    }

    @Keep
    @Nullable
    public static n6 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        f0 d = f0.d(context, (String) null, (String) null, (String) null, bundle);
        if (d == null) {
            return null;
        }
        return new b(d);
    }

    @RecentlyNonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) a.c(d.d().getId(), Constants.EVENT_UPLOAD_PERIOD_MILLIS, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @MainThread
    @Deprecated
    @Keep
    public void setCurrentScreen(@RecentlyNonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.c.execute(new e(f0Var, activity, str, str2));
    }
}
