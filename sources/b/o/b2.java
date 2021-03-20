package b.o;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class b2 extends FragmentManager.FragmentLifecycleCallbacks {
    public final /* synthetic */ FragmentManager a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c2 f6019b;

    public b2(c2 c2Var, FragmentManager fragmentManager) {
        this.f6019b = c2Var;
        this.a = fragmentManager;
    }

    public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        super.onFragmentDetached(fragmentManager, fragment);
        if (fragment instanceof DialogFragment) {
            this.a.unregisterFragmentLifecycleCallbacks(this);
            this.f6019b.a.b();
        }
    }
}
