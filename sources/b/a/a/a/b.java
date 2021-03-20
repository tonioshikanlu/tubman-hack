package b.a.a.a;

import androidx.fragment.app.Fragment;
import b.a.a.e.a;
import b.f.a.e;
import com.appfoundry.previewer.model.Page;
import com.segment.analytics.Analytics;
import java.util.UUID;

public class b extends Fragment {

    /* renamed from: h  reason: collision with root package name */
    public Page f74h;

    /* renamed from: i  reason: collision with root package name */
    public String f75i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f76j = Boolean.FALSE;

    public void c() {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    public void onPause() {
        super.onPause();
        a aVar = a.f235b;
        Page page = this.f74h;
        String str = null;
        String str2 = page != null ? page.a : null;
        if (page != null) {
            str = page.f7126b;
        }
        String str3 = this.f75i;
        Analytics with = Analytics.with(e.c());
        String c = a.c();
        if (str3 == null) {
            str3 = "";
        }
        b.e.a.a.a.K("Slack", false, with, "Page Closed", a.b(c, str3).putValue("page_id", (Object) str2).putValue("page_name", (Object) str));
    }

    public void onResume() {
        super.onResume();
        String uuid = UUID.randomUUID().toString();
        this.f75i = uuid;
        a aVar = a.f235b;
        Page page = this.f74h;
        String str = null;
        String str2 = page != null ? page.a : null;
        if (page != null) {
            str = page.f7126b;
        }
        Analytics with = Analytics.with(e.c());
        String c = a.c();
        if (uuid == null) {
            uuid = "";
        }
        b.e.a.a.a.K("Slack", false, with, "Page Opened", a.b(c, uuid).putValue("page_id", (Object) str2).putValue("page_name", (Object) str));
    }
}
