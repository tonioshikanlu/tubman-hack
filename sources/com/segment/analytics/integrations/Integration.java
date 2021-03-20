package com.segment.analytics.integrations;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.segment.analytics.Analytics;
import com.segment.analytics.ValueMap;

public abstract class Integration<T> {

    public interface Factory {
        Integration<?> create(ValueMap valueMap, Analytics analytics);

        @NonNull
        String key();
    }

    public void alias(AliasPayload aliasPayload) {
    }

    public void flush() {
    }

    public T getUnderlyingInstance() {
        return null;
    }

    public void group(GroupPayload groupPayload) {
    }

    public void identify(IdentifyPayload identifyPayload) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void reset() {
    }

    public void screen(ScreenPayload screenPayload) {
    }

    public void track(TrackPayload trackPayload) {
    }
}
