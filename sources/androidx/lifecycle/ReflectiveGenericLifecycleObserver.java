package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;

public class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    private final ClassesInfoCache.CallbackInfo mInfo;
    private final Object mWrapped;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.mWrapped = obj;
        this.mInfo = ClassesInfoCache.sInstance.getInfo(obj.getClass());
    }

    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        this.mInfo.invokeCallbacks(lifecycleOwner, event, this.mWrapped);
    }
}
