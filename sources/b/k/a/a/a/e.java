package b.k.a.a.a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import b.e.a.a.a;
import e.x.c.i;

public final class e extends WebChromeClient {
    public final /* synthetic */ c a;

    public e(c cVar) {
        this.a = cVar;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        i.e(webView, "view");
        i.e(str, "url");
        i.e(str2, "message");
        i.e(jsResult, "result");
        super.onJsAlert(webView, str, str2, jsResult);
        String n2 = a.n("url --->", str, "\n\n\n");
        String n3 = a.n("message --->", str2, "\n\n\n");
        new AlertDialog.Builder(this.a.getContext()).setTitle("JavaScript alert Information").setMessage(a.n(n2, n3, "result --->" + jsResult)).setNeutralButton("sure", (DialogInterface.OnClickListener) null).show();
        return true;
    }
}
