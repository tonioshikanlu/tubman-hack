package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

public class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {
    private final GeneratedAdapter[] mGeneratedAdapters;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.mGeneratedAdapters = generatedAdapterArr;
    }

    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        for (GeneratedAdapter callMethods : this.mGeneratedAdapters) {
            callMethods.callMethods(lifecycleOwner, event, false, methodCallsLogger);
        }
        for (GeneratedAdapter callMethods2 : this.mGeneratedAdapters) {
            callMethods2.callMethods(lifecycleOwner, event, true, methodCallsLogger);
        }
    }
}
