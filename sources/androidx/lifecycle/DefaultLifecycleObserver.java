package androidx.lifecycle;

import androidx.annotation.NonNull;

public interface DefaultLifecycleObserver extends FullLifecycleObserver {
    void onCreate(@NonNull LifecycleOwner lifecycleOwner) {
    }

    void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
    }

    void onPause(@NonNull LifecycleOwner lifecycleOwner) {
    }

    void onResume(@NonNull LifecycleOwner lifecycleOwner) {
    }

    void onStart(@NonNull LifecycleOwner lifecycleOwner) {
    }

    void onStop(@NonNull LifecycleOwner lifecycleOwner) {
    }
}
