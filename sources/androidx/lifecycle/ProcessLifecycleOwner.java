package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;

public class ProcessLifecycleOwner implements LifecycleOwner {
    @VisibleForTesting
    public static final long TIMEOUT_MS = 700;
    private static final ProcessLifecycleOwner sInstance = new ProcessLifecycleOwner();
    private Runnable mDelayedPauseRunnable = new Runnable() {
        public void run() {
            ProcessLifecycleOwner.this.dispatchPauseIfNeeded();
            ProcessLifecycleOwner.this.dispatchStopIfNeeded();
        }
    };
    private Handler mHandler;
    public ReportFragment.ActivityInitializationListener mInitializationListener = new ReportFragment.ActivityInitializationListener() {
        public void onCreate() {
        }

        public void onResume() {
            ProcessLifecycleOwner.this.activityResumed();
        }

        public void onStart() {
            ProcessLifecycleOwner.this.activityStarted();
        }
    };
    private boolean mPauseSent = true;
    private final LifecycleRegistry mRegistry = new LifecycleRegistry(this);
    private int mResumedCounter = 0;
    private int mStartedCounter = 0;
    private boolean mStopSent = true;

    private ProcessLifecycleOwner() {
    }

    @NonNull
    public static LifecycleOwner get() {
        return sInstance;
    }

    public static void init(Context context) {
        sInstance.attach(context);
    }

    public void activityPaused() {
        int i2 = this.mResumedCounter - 1;
        this.mResumedCounter = i2;
        if (i2 == 0) {
            this.mHandler.postDelayed(this.mDelayedPauseRunnable, 700);
        }
    }

    public void activityResumed() {
        int i2 = this.mResumedCounter + 1;
        this.mResumedCounter = i2;
        if (i2 != 1) {
            return;
        }
        if (this.mPauseSent) {
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            this.mPauseSent = false;
            return;
        }
        this.mHandler.removeCallbacks(this.mDelayedPauseRunnable);
    }

    public void activityStarted() {
        int i2 = this.mStartedCounter + 1;
        this.mStartedCounter = i2;
        if (i2 == 1 && this.mStopSent) {
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.mStopSent = false;
        }
    }

    public void activityStopped() {
        this.mStartedCounter--;
        dispatchStopIfNeeded();
    }

    public void attach(Context context) {
        this.mHandler = new Handler();
        this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (Build.VERSION.SDK_INT < 29) {
                    ReportFragment.get(activity).setProcessListener(ProcessLifecycleOwner.this.mInitializationListener);
                }
            }

            public void onActivityPaused(Activity activity) {
                ProcessLifecycleOwner.this.activityPaused();
            }

            public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
                activity.registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() {
                    public void onActivityPostResumed(@NonNull Activity activity) {
                        ProcessLifecycleOwner.this.activityResumed();
                    }

                    public void onActivityPostStarted(@NonNull Activity activity) {
                        ProcessLifecycleOwner.this.activityStarted();
                    }
                });
            }

            public void onActivityStopped(Activity activity) {
                ProcessLifecycleOwner.this.activityStopped();
            }
        });
    }

    public void dispatchPauseIfNeeded() {
        if (this.mResumedCounter == 0) {
            this.mPauseSent = true;
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public void dispatchStopIfNeeded() {
        if (this.mStartedCounter == 0 && this.mPauseSent) {
            this.mRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.mStopSent = true;
        }
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.mRegistry;
    }
}
