package com.segment.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class AnalyticsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
    private static LifecycleOwner stubOwner = new LifecycleOwner() {
        public Lifecycle stubLifecycle = new Lifecycle() {
            public void addObserver(@NonNull LifecycleObserver lifecycleObserver) {
            }

            @NonNull
            public Lifecycle.State getCurrentState() {
                return Lifecycle.State.DESTROYED;
            }

            public void removeObserver(@NonNull LifecycleObserver lifecycleObserver) {
            }
        };

        @NonNull
        public Lifecycle getLifecycle() {
            return this.stubLifecycle;
        }
    };
    private Analytics analytics;
    private ExecutorService analyticsExecutor;
    private AtomicBoolean firstLaunch;
    private AtomicBoolean isChangingActivityConfigurations;
    private AtomicInteger numberOfActivities;
    private PackageInfo packageInfo;
    private Boolean shouldRecordScreenViews;
    private Boolean shouldTrackApplicationLifecycleEvents;
    private Boolean trackDeepLinks;
    private AtomicBoolean trackedApplicationLifecycleEvents;
    private Boolean useNewLifecycleMethods;

    public static class Builder {
        private Analytics analytics;
        private ExecutorService analyticsExecutor;
        private PackageInfo packageInfo;
        private Boolean shouldRecordScreenViews;
        private Boolean shouldTrackApplicationLifecycleEvents;
        private Boolean trackDeepLinks;
        private Boolean useNewLifecycleMethods;

        public Builder analytics(Analytics analytics2) {
            this.analytics = analytics2;
            return this;
        }

        public Builder analyticsExecutor(ExecutorService executorService) {
            this.analyticsExecutor = executorService;
            return this;
        }

        public AnalyticsActivityLifecycleCallbacks build() {
            return new AnalyticsActivityLifecycleCallbacks(this.analytics, this.analyticsExecutor, this.shouldTrackApplicationLifecycleEvents, this.trackDeepLinks, this.shouldRecordScreenViews, this.packageInfo, this.useNewLifecycleMethods);
        }

        public Builder packageInfo(PackageInfo packageInfo2) {
            this.packageInfo = packageInfo2;
            return this;
        }

        public Builder shouldRecordScreenViews(Boolean bool) {
            this.shouldRecordScreenViews = bool;
            return this;
        }

        public Builder shouldTrackApplicationLifecycleEvents(Boolean bool) {
            this.shouldTrackApplicationLifecycleEvents = bool;
            return this;
        }

        public Builder trackDeepLinks(Boolean bool) {
            this.trackDeepLinks = bool;
            return this;
        }

        public Builder useNewLifecycleMethods(boolean z) {
            this.useNewLifecycleMethods = Boolean.valueOf(z);
            return this;
        }
    }

    private AnalyticsActivityLifecycleCallbacks(Analytics analytics2, ExecutorService executorService, Boolean bool, Boolean bool2, Boolean bool3, PackageInfo packageInfo2, Boolean bool4) {
        this.trackedApplicationLifecycleEvents = new AtomicBoolean(false);
        this.numberOfActivities = new AtomicInteger(1);
        this.firstLaunch = new AtomicBoolean(false);
        this.analytics = analytics2;
        this.analyticsExecutor = executorService;
        this.shouldTrackApplicationLifecycleEvents = bool;
        this.trackDeepLinks = bool2;
        this.shouldRecordScreenViews = bool3;
        this.packageInfo = packageInfo2;
        this.useNewLifecycleMethods = bool4;
        this.isChangingActivityConfigurations = new AtomicBoolean(false);
    }

    private void trackDeepLink(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && intent.getData() != null) {
            Properties properties = new Properties();
            Uri data = intent.getData();
            for (String next : data.getQueryParameterNames()) {
                String queryParameter = data.getQueryParameter(next);
                if (queryParameter != null && !queryParameter.trim().isEmpty()) {
                    properties.put(next, (Object) queryParameter);
                }
            }
            properties.put("url", (Object) data.toString());
            this.analytics.track("Deep Link Opened", properties);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityCreated(activity, bundle));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onCreate(stubOwner);
        }
        if (this.trackDeepLinks.booleanValue()) {
            trackDeepLink(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityDestroyed(activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onDestroy(stubOwner);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityPaused(activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onPause(stubOwner);
        }
    }

    public void onActivityResumed(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityResumed(activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onStart(stubOwner);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivitySaveInstanceState(activity, bundle));
    }

    public void onActivityStarted(Activity activity) {
        if (this.shouldRecordScreenViews.booleanValue()) {
            this.analytics.recordScreenViews(activity);
        }
        this.analytics.runOnMainThread(IntegrationOperation.onActivityStarted(activity));
    }

    public void onActivityStopped(Activity activity) {
        this.analytics.runOnMainThread(IntegrationOperation.onActivityStopped(activity));
        if (!this.useNewLifecycleMethods.booleanValue()) {
            onStop(stubOwner);
        }
    }

    public void onCreate(@NonNull LifecycleOwner lifecycleOwner) {
        if (!this.trackedApplicationLifecycleEvents.getAndSet(true) && this.shouldTrackApplicationLifecycleEvents.booleanValue()) {
            this.numberOfActivities.set(0);
            this.firstLaunch.set(true);
            this.analytics.trackApplicationLifecycleEvents();
        }
    }

    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        if (this.shouldTrackApplicationLifecycleEvents.booleanValue() && this.numberOfActivities.incrementAndGet() == 1 && !this.isChangingActivityConfigurations.get()) {
            Properties properties = new Properties();
            if (this.firstLaunch.get()) {
                properties.putValue("version", (Object) this.packageInfo.versionName).putValue("build", (Object) String.valueOf(this.packageInfo.versionCode));
            }
            properties.putValue("from_background", (Object) Boolean.valueOf(true ^ this.firstLaunch.getAndSet(false)));
            this.analytics.track("Application Opened", properties);
        }
    }

    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        if (this.shouldTrackApplicationLifecycleEvents.booleanValue() && this.numberOfActivities.decrementAndGet() == 0 && !this.isChangingActivityConfigurations.get()) {
            this.analytics.track("Application Backgrounded");
        }
    }
}
