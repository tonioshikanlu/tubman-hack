package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;

public class LifecycleDispatcher {
    private static AtomicBoolean sInitialized = new AtomicBoolean(false);

    @VisibleForTesting
    public static class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.injectIfNeededIn(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private LifecycleDispatcher() {
    }

    public static void init(Context context) {
        if (!sInitialized.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
        }
    }
}
