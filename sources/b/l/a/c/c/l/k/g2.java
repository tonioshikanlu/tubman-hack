package b.l.a.c.c.l.k;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import b.l.a.c.f.d.d;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public final class g2 extends Fragment implements i {

    /* renamed from: k  reason: collision with root package name */
    public static WeakHashMap<FragmentActivity, WeakReference<g2>> f2662k = new WeakHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public Map<String, LifecycleCallback> f2663h = new ArrayMap();

    /* renamed from: i  reason: collision with root package name */
    public int f2664i = 0;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f2665j;

    public final void a(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f2663h.containsKey(str)) {
            this.f2663h.put(str, lifecycleCallback);
            if (this.f2664i > 0) {
                new d(Looper.getMainLooper()).post(new f2(this, lifecycleCallback, str));
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
        return (LifecycleCallback) cls.cast(this.f2663h.get(str));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f2663h.values()) {
            a.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (LifecycleCallback c : this.f2663h.values()) {
            c.c(i2, i3, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2664i = 1;
        this.f2665j = bundle;
        for (Map.Entry next : this.f2663h.entrySet()) {
            ((LifecycleCallback) next.getValue()).d(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2664i = 5;
        for (LifecycleCallback requireNonNull : this.f2663h.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onResume() {
        super.onResume();
        this.f2664i = 3;
        for (LifecycleCallback requireNonNull : this.f2663h.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f2663h.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).e(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f2664i = 2;
        for (LifecycleCallback f : this.f2663h.values()) {
            f.f();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f2664i = 4;
        for (LifecycleCallback g2 : this.f2663h.values()) {
            g2.g();
        }
    }
}
