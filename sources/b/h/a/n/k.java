package b.h.a.n;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.h.a.c;
import b.h.a.i;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Deprecated
public class k extends Fragment {

    /* renamed from: h  reason: collision with root package name */
    public final a f938h;

    /* renamed from: i  reason: collision with root package name */
    public final m f939i = new a();

    /* renamed from: j  reason: collision with root package name */
    public final Set<k> f940j = new HashSet();
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public i f941k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public k f942l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public Fragment f943m;

    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        a aVar = new a();
        this.f938h = aVar;
    }

    public final void a(@NonNull Activity activity) {
        b();
        l lVar = c.b(activity).f472m;
        Objects.requireNonNull(lVar);
        k c = lVar.c(activity.getFragmentManager(), (Fragment) null, l.e(activity));
        this.f942l = c;
        if (!equals(c)) {
            this.f942l.f940j.add(this);
        }
    }

    public final void b() {
        k kVar = this.f942l;
        if (kVar != null) {
            kVar.f940j.remove(this);
            this.f942l = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f938h.c();
        b();
    }

    public void onDetach() {
        super.onDetach();
        b();
    }

    public void onStart() {
        super.onStart();
        this.f938h.d();
    }

    public void onStop() {
        super.onStop();
        this.f938h.e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f943m;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
