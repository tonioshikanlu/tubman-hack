package b.a.a.k;

import androidx.fragment.app.FragmentManager;
import com.wuman.android.auth.DialogFragmentController;

public final class f extends DialogFragmentController {
    public final /* synthetic */ b a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(b bVar, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.a = bVar;
    }

    public String getRedirectUri() {
        return this.a.f328g;
    }
}
