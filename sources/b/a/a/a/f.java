package b.a.a.a;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import q.a.a;

public final class f implements SwipeRefreshLayout.OnRefreshListener {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    public final void onRefresh() {
        try {
            this.a.e(true);
        } catch (Exception e2) {
            a.d.b("Exception pulling to refresh: %s", e2.getLocalizedMessage());
        }
    }
}
