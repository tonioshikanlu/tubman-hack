package b.k.a.a.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b.l.e.e0.s;
import b.l.e.k;
import com.segment.analytics.integrations.BasePayload;
import com.segment.analytics.integrations.ScreenPayload;
import e.x.c.i;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005B\u0011\b\u0016\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R.\u0010-\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R.\u0010/\u001a\u0004\u0018\u00010\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(¨\u00065"}, d2 = {"Lb/k/a/a/a/c;", "Landroid/webkit/WebView;", "Lb/k/a/a/a/g;", "chartOptions", "Le/r;", "a", "(Lb/k/a/a/a/g;)V", "", "javaScriptString", "b", "(Ljava/lang/String;)V", "message", "androidMethod", "(Ljava/lang/String;)Ljava/lang/String;", "m", "Ljava/lang/String;", "optionsJson", "Lb/k/a/a/a/c$a;", "l", "Lb/k/a/a/a/c$a;", "getCallBack", "()Lb/k/a/a/a/c$a;", "setCallBack", "(Lb/k/a/a/a/c$a;)V", "callBack", "", "value", "i", "Ljava/lang/Float;", "getContentHeight", "()Ljava/lang/Float;", "setContentHeight", "(Ljava/lang/Float;)V", "contentHeight", "", "j", "Ljava/lang/Boolean;", "getChartSeriesHidden", "()Ljava/lang/Boolean;", "setChartSeriesHidden", "(Ljava/lang/Boolean;)V", "chartSeriesHidden", "h", "getContentWidth", "setContentWidth", "contentWidth", "k", "isClearBackgroundColor", "setClearBackgroundColor", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "charts_release"}, k = 1, mv = {1, 1, 15})
public final class c extends WebView {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f2357n = 0;

    /* renamed from: h  reason: collision with root package name */
    public Float f2358h;

    /* renamed from: i  reason: collision with root package name */
    public Float f2359i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f2360j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f2361k;

    /* renamed from: l  reason: collision with root package name */
    public a f2362l;

    /* renamed from: m  reason: collision with root package name */
    public String f2363m;

    public interface a {
        void a(c cVar);

        void b(c cVar, f fVar);
    }

    public static final class b<T> implements ValueCallback<String> {
        public static final b a = new b();

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        i.e(context, BasePayload.CONTEXT_KEY);
        setContentWidth(Float.valueOf(420.0f));
        setContentHeight(Float.valueOf(580.0f));
        setClearBackgroundColor(Boolean.FALSE);
        WebSettings settings = getSettings();
        i.d(settings, "settings");
        settings.setJavaScriptEnabled(true);
        WebView.setWebContentsDebuggingEnabled(true);
        addJavascriptInterface(this, "androidObject");
    }

    public final void a(g gVar) {
        Boolean bool = this.f2361k;
        i.c(bool);
        if (bool.booleanValue()) {
            i.c(gVar.a);
        }
        String i2 = new k().i(gVar);
        this.f2363m = i2;
        StringBuilder C = b.e.a.a.a.C("loadTheHighChartView('", i2, "','");
        C.append(this.f2358h);
        C.append("','");
        C.append(this.f2359i);
        C.append("')");
        b(C.toString());
    }

    @JavascriptInterface
    public final String androidMethod(String str) {
        Object c = new k().c(str, new HashMap().getClass());
        i.d(c, "Gson().fromJson(message, messageBody.javaClass)");
        HashMap hashMap = (HashMap) c;
        f fVar = new f();
        String.valueOf(hashMap.get("name"));
        Double d = (Double) hashMap.get("x");
        Double d2 = (Double) hashMap.get("y");
        String.valueOf(hashMap.get(ScreenPayload.CATEGORY_KEY));
        s sVar = (s) hashMap.get("offset");
        Double d3 = (Double) hashMap.get("index");
        if (d3 != null) {
            d3.doubleValue();
        }
        a aVar = this.f2362l;
        if (aVar == null) {
            return "";
        }
        aVar.b(this, fVar);
        return "";
    }

    public final void b(String str) {
        evaluateJavascript(b.e.a.a.a.m("javascript:", str), b.a);
    }

    public final a getCallBack() {
        return this.f2362l;
    }

    public final Boolean getChartSeriesHidden() {
        return this.f2360j;
    }

    public final Float getContentHeight() {
        return this.f2359i;
    }

    public final Float getContentWidth() {
        return this.f2358h;
    }

    public final void setCallBack(a aVar) {
        this.f2362l = aVar;
    }

    public final void setChartSeriesHidden(Boolean bool) {
        this.f2360j = bool;
        StringBuilder y = b.e.a.a.a.y("setChartSeriesHidden('");
        y.append(this.f2360j);
        y.append("')");
        b(y.toString());
    }

    public final void setClearBackgroundColor(Boolean bool) {
        this.f2361k = bool;
        if (i.a(bool, Boolean.TRUE)) {
            setBackgroundColor(0);
            Drawable background = getBackground();
            if (background != null) {
                background.setAlpha(0);
                return;
            }
            return;
        }
        setBackgroundColor(1);
        Drawable background2 = getBackground();
        if (background2 != null) {
            background2.setAlpha(255);
        }
    }

    public final void setContentHeight(Float f) {
        this.f2359i = f;
        StringBuilder y = b.e.a.a.a.y("setTheChartViewContentHeight('");
        y.append(this.f2359i);
        y.append("')");
        b(y.toString());
    }

    public final void setContentWidth(Float f) {
        this.f2358h = f;
        StringBuilder y = b.e.a.a.a.y("setTheChartViewContentWidth('");
        y.append(this.f2358h);
        y.append("')");
        b(y.toString());
    }
}
