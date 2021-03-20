package b.k.a.a.a;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import b.k.a.a.a.c;
import e.x.c.i;

public final class d extends WebViewClient {
    public final /* synthetic */ c a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f2364b;

    public d(c cVar, g gVar) {
        this.a = cVar;
        this.f2364b = gVar;
    }

    public void onPageFinished(WebView webView, String str) {
        i.e(webView, "view");
        i.e(str, "url");
        c cVar = this.a;
        g gVar = this.f2364b;
        int i2 = c.f2357n;
        cVar.a(gVar);
        c.a callBack = this.a.getCallBack();
        if (callBack != null) {
            callBack.a(this.a);
        }
    }
}
