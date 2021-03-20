package b.a.a.h;

import android.view.View;
import b.f.a.e;
import com.appfoundry.previewer.model.Container;
import p.a.a.c;

public final class g implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Container f266h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f267i;

    public g(Container container, String str) {
        this.f266h = container;
        this.f267i = str;
    }

    public final void onClick(View view) {
        c b2 = c.b();
        String str = this.f267i;
        Container container = this.f266h;
        b2.g(e.L(str, container.a, container.d, container.f7102k, container.f7097e, container.f7101j));
    }
}
