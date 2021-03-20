package b.l.a.c.c.l.k;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface i {
    void a(String str, @NonNull LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T b(String str, Class<T> cls);
}
