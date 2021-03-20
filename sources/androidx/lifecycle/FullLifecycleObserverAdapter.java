package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

public class FullLifecycleObserverAdapter implements LifecycleEventObserver {
    private final FullLifecycleObserver mFullLifecycleObserver;
    private final LifecycleEventObserver mLifecycleEventObserver;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0031 */
        static {
            /*
                androidx.lifecycle.Lifecycle.Event.values()
                r0 = 7
                int[] r1 = new int[r0]
                $SwitchMap$androidx$lifecycle$Lifecycle$Event = r1
                r2 = 1
                androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x000e }
                r3 = 0
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x000e }
            L_0x000e:
                r1 = 2
                int[] r3 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0015 }
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0015 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0015 }
            L_0x0015:
                r2 = 3
                int[] r3 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x001c }
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r1 = 4
                int[] r3 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0023 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r2 = 5
                int[] r3 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r1 = 6
                int[] r3 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0031 }
                androidx.lifecycle.Lifecycle$Event r4 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0031 }
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0031:
                int[] r2 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x0037 }
                androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0037 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0037 }
            L_0x0037:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.AnonymousClass1.<clinit>():void");
        }
    }

    public FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        this.mFullLifecycleObserver = fullLifecycleObserver;
        this.mLifecycleEventObserver = lifecycleEventObserver;
    }

    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        switch (event.ordinal()) {
            case 0:
                this.mFullLifecycleObserver.onCreate(lifecycleOwner);
                break;
            case 1:
                this.mFullLifecycleObserver.onStart(lifecycleOwner);
                break;
            case 2:
                this.mFullLifecycleObserver.onResume(lifecycleOwner);
                break;
            case 3:
                this.mFullLifecycleObserver.onPause(lifecycleOwner);
                break;
            case 4:
                this.mFullLifecycleObserver.onStop(lifecycleOwner);
                break;
            case 5:
                this.mFullLifecycleObserver.onDestroy(lifecycleOwner);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.mLifecycleEventObserver;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
        }
    }
}
