package b.l.a.c.c.l.k;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import b.l.a.c.f.d.d;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public final class d2 extends Fragment implements i {

    /* renamed from: k  reason: collision with root package name */
    public static WeakHashMap<Activity, WeakReference<d2>> f2628k = new WeakHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public Map<String, LifecycleCallback> f2629h = new ArrayMap();

    /* renamed from: i  reason: collision with root package name */
    public int f2630i = 0;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f2631j;

    public final void a(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f2629h.containsKey(str)) {
            this.f2629h.put(str, lifecycleCallback);
            if (this.f2630i > 0) {
                new d(Looper.getMainLooper()).post(new e2(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T extends LifecycleCallback> T b(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f2629h.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f2629h.values()) {
            a.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback c : this.f2629h.values()) {
            c.c(i2, i3, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2630i = 1;
        this.f2631j = bundle;
        for (Map.Entry next : this.f2629h.entrySet()) {
            ((LifecycleCallback) next.getValue()).d(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2630i = 5;
        for (LifecycleCallback requireNonNull : this.f2629h.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onResume() {
        super.onResume();
        this.f2630i = 3;
        for (LifecycleCallback requireNonNull : this.f2629h.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f2629h.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).e(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2630i = 2;
        for (LifecycleCallback f : this.f2629h.values()) {
            f.f();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f2630i = 4;
        for (LifecycleCallback g2 : this.f2629h.values()) {
            g2.g();
        }
    }
}
