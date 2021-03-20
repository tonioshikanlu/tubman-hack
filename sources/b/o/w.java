package b.o;

import android.view.ViewGroup;
import android.webkit.WebView;
import b.o.i2;

public class w implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f6338h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ a0 f6339i;

    public w(a0 a0Var, int i2) {
        this.f6339i = a0Var;
        this.f6338h = i2;
    }

    public void run() {
        WebView webView = this.f6339i.f6000k;
        if (webView == null) {
            i2.a(i2.k.WARN, "WebView height update skipped, new height will be used once it is displayed.", (Throwable) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
        layoutParams.height = this.f6338h;
        this.f6339i.f6000k.setLayoutParams(layoutParams);
        a0 a0Var = this.f6339i;
        m mVar = a0Var.f6002m;
        if (mVar != null) {
            mVar.a(a0Var.c(this.f6338h, a0Var.f5999j));
        }
    }
}
