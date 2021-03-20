package b.a.a.h;

import android.view.View;
import android.widget.ImageView;
import b.a.a.g.p;
import com.appfoundry.previewer.model.Style;
import p.a.a.c;

public final class j implements View.OnClickListener {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ImageView f275h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f276i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f277j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Style f278k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f279l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f280m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f281n;

    public j(ImageView imageView, String str, String str2, Style style, int i2, int i3, int i4) {
        this.f275h = imageView;
        this.f276i = str;
        this.f277j = str2;
        this.f278k = style;
        this.f279l = i2;
        this.f280m = i3;
        this.f281n = i4;
    }

    public final void onClick(View view) {
        c.b().g(new p(this.f276i, this.f277j, this.f275h, this.f278k, this.f279l, this.f280m, this.f281n));
    }
}
