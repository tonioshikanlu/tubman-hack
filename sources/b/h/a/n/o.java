package b.h.a.n;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b.h.a.c;
import b.h.a.i;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class o extends Fragment {

    /* renamed from: h  reason: collision with root package name */
    public final a f947h;

    /* renamed from: i  reason: collision with root package name */
    public final m f948i = new a();

    /* renamed from: j  reason: collision with root package name */
    public final Set<o> f949j = new HashSet();
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public o f950k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public i f951l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public Fragment f952m;

    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        a aVar = new a();
        this.f947h = aVar;
    }

    @Nullable
    public final Fragment c() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f952m;
    }

    public final void d(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        e();
        l lVar = c.b(context).f472m;
        Objects.requireNonNull(lVar);
        o d = lVar.d(fragmentManager, (Fragment) null, l.e(context));
        this.f950k = d;
        if (!equals(d)) {
            this.f950k.f949j.add(this);
        }
    }

    public final void e() {
        o oVar = this.f950k;
        if (oVar != null) {
            oVar.f949j.remove(this);
            this.f950k = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            try {
                d(getContext(), fragmentManager);
            } catch (IllegalStateException e2) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f947h.c();
        e();
    }

    public void onDetach() {
        super.onDetach();
        this.f952m = null;
        e();
    }

    public void onStart() {
        super.onStart();
        this.f947h.d();
    }

    public void onStop() {
        super.onStop();
        this.f947h.e();
    }

    public String toString() {
        return super.toString() + "{parent=" + c() + "}";
    }
}
