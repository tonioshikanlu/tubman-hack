package b.o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.o.a;
import b.o.i2;
import com.segment.analytics.AnalyticsContext;
import java.io.UnsupportedEncodingException;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(19)
public class q4 extends a.b {

    /* renamed from: g  reason: collision with root package name */
    public static final String f6243g = "b.o.q4";

    /* renamed from: h  reason: collision with root package name */
    public static final int f6244h = g2.b(24);
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public static q4 f6245i = null;
    @Nullable
    public h2 a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public a0 f6246b;
    @NonNull
    public Activity c;
    @NonNull
    public s0 d;

    /* renamed from: e  reason: collision with root package name */
    public String f6247e = null;
    public Integer f = null;

    public static class a implements f {
        public final /* synthetic */ Activity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s0 f6248b;
        public final /* synthetic */ String c;

        public a(Activity activity, s0 s0Var, String str) {
            this.a = activity;
            this.f6248b = s0Var;
            this.c = str;
        }

        public void a() {
            q4.f6245i = null;
            q4.g(this.a, this.f6248b, this.c);
        }
    }

    public static class b implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ s0 f6249h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f6250i;

        public b(s0 s0Var, String str) {
            this.f6249h = s0Var;
            this.f6250i = str;
        }

        public void run() {
            q4.i(this.f6249h, this.f6250i);
        }
    }

    public static class c implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ q4 f6251h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Activity f6252i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f6253j;

        public c(q4 q4Var, Activity activity, String str) {
            this.f6251h = q4Var;
            this.f6252i = activity;
            this.f6253j = str;
        }

        public void run() {
            q4 q4Var = this.f6251h;
            Activity activity = this.f6252i;
            String str = this.f6253j;
            Objects.requireNonNull(q4Var);
            if (i2.e(i2.k.DEBUG)) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            h2 h2Var = new h2(activity);
            q4Var.a = h2Var;
            h2Var.setOverScrollMode(2);
            q4Var.a.setVerticalScrollBarEnabled(false);
            q4Var.a.setHorizontalScrollBarEnabled(false);
            q4Var.a.getSettings().setJavaScriptEnabled(true);
            q4Var.a.addJavascriptInterface(new e(), "OSAndroid");
            g2.a(activity, new s4(q4Var, activity, str));
        }
    }

    public class d implements f {
        public final /* synthetic */ f a;

        public d(f fVar) {
            this.a = fVar;
        }

        public void a() {
            q4.this.f6246b = null;
            f fVar = this.a;
            if (fVar != null) {
                fVar.a();
            }
        }
    }

    public class e {
        public e() {
        }

        public final void a(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String optString = jSONObject2.optString(AnalyticsContext.Device.DEVICE_ID_KEY, (String) null);
            if (q4.this.d.f6278k) {
                i2.p().s(q4.this.d, jSONObject2);
            } else if (optString != null) {
                i2.p().r(q4.this.d, jSONObject2);
            }
            if (jSONObject2.getBoolean("close")) {
                q4.this.f((f) null);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[SYNTHETIC, Splitter:B:13:0x002f] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(org.json.JSONObject r9) {
            /*
                r8 = this;
                b.o.q4$g r0 = b.o.q4.g.FULL_SCREEN
                java.lang.String r1 = "displayLocation"
                boolean r2 = r9.has(r1)     // Catch:{ JSONException -> 0x0026 }
                if (r2 == 0) goto L_0x002a
                java.lang.Object r2 = r9.get(r1)     // Catch:{ JSONException -> 0x0026 }
                java.lang.String r3 = ""
                boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x0026 }
                if (r2 != 0) goto L_0x002a
                java.lang.String r2 = "FULL_SCREEN"
                java.lang.String r1 = r9.optString(r1, r2)     // Catch:{ JSONException -> 0x0026 }
                java.lang.String r1 = r1.toUpperCase()     // Catch:{ JSONException -> 0x0026 }
                b.o.q4$g r1 = b.o.q4.g.valueOf(r1)     // Catch:{ JSONException -> 0x0026 }
                r4 = r1
                goto L_0x002b
            L_0x0026:
                r1 = move-exception
                r1.printStackTrace()
            L_0x002a:
                r4 = r0
            L_0x002b:
                r1 = -1
                if (r4 != r0) goto L_0x002f
                goto L_0x003f
            L_0x002f:
                b.o.q4 r0 = b.o.q4.this     // Catch:{ JSONException -> 0x003f }
                android.app.Activity r0 = r0.c     // Catch:{ JSONException -> 0x003f }
                java.lang.String r2 = "pageMetaData"
                org.json.JSONObject r2 = r9.getJSONObject(r2)     // Catch:{ JSONException -> 0x003f }
                int r0 = b.o.q4.d(r0, r2)     // Catch:{ JSONException -> 0x003f }
                r5 = r0
                goto L_0x0040
            L_0x003f:
                r5 = r1
            L_0x0040:
                java.lang.String r0 = "dragToDismissDisabled"
                r9.getBoolean(r0)     // Catch:{ JSONException -> 0x0045 }
            L_0x0045:
                b.o.q4 r9 = b.o.q4.this
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                r9.f = r0
                b.o.a0 r0 = new b.o.a0
                b.o.h2 r3 = r9.a
                b.o.s0 r1 = r9.d
                double r6 = r1.f
                r2 = r0
                r2.<init>(r3, r4, r5, r6)
                r9.f6246b = r0
                b.o.t4 r1 = new b.o.t4
                r1.<init>(r9)
                r0.f6003n = r1
                b.o.a r0 = b.o.c.f6028i
                if (r0 == 0) goto L_0x007e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = b.o.q4.f6243g
                r1.append(r2)
                b.o.s0 r2 = r9.d
                java.lang.String r2 = r2.a
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.a(r1, r9)
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.o.q4.e.b(org.json.JSONObject):void");
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                i2.k kVar = i2.k.DEBUG;
                i2.a(kVar, "OSJavaScriptInterface:postMessage: " + str, (Throwable) null);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                if (string.equals("rendering_complete")) {
                    b(jSONObject);
                } else if (string.equals("action_taken") && !q4.this.f6246b.f5998i) {
                    a(jSONObject);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public interface f {
        void a();
    }

    public enum g {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN
    }

    public q4(@NonNull s0 s0Var, @NonNull Activity activity) {
        this.d = s0Var;
        this.c = activity;
    }

    public static int d(Activity activity, JSONObject jSONObject) {
        try {
            int b2 = g2.b(jSONObject.getJSONObject("rect").getInt("height"));
            i2.k kVar = i2.k.DEBUG;
            i2.a(kVar, "getPageHeightData:pxHeight: " + b2, (Throwable) null);
            int c2 = g2.c(activity) - (f6244h * 2);
            if (b2 <= c2) {
                return b2;
            }
            i2.a(kVar, "getPageHeightData:pxHeight is over screen max: " + c2, (Throwable) null);
            return c2;
        } catch (JSONException e2) {
            i2.a(i2.k.ERROR, "pageRectToViewHeight could not get page height", e2);
            return -1;
        }
    }

    public static void e(q4 q4Var, Activity activity) {
        h2 h2Var = q4Var.a;
        int i2 = g2.a;
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int width = rect.width();
        int i3 = f6244h * 2;
        h2Var.layout(0, 0, width - i3, g2.c(activity) - i3);
    }

    public static void g(@NonNull Activity activity, @NonNull s0 s0Var, @NonNull String str) {
        try {
            String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 2);
            q4 q4Var = new q4(s0Var, activity);
            f6245i = q4Var;
            f2.u(new c(q4Var, activity, encodeToString));
        } catch (UnsupportedEncodingException e2) {
            i2.a(i2.k.ERROR, "Catch on initInAppMessage: ", e2);
            e2.printStackTrace();
        }
    }

    public static void i(@NonNull s0 s0Var, @NonNull String str) {
        Activity k2 = i2.k();
        i2.k kVar = i2.k.DEBUG;
        i2.a(kVar, "in app message showHTMLString on currentActivity: " + k2, (Throwable) null);
        if (k2 != null) {
            q4 q4Var = f6245i;
            if (q4Var == null || !s0Var.f6278k) {
                g(k2, s0Var, str);
            } else {
                q4Var.f(new a(k2, s0Var, str));
            }
        } else {
            Looper.prepare();
            new Handler().postDelayed(new b(s0Var, str), 200);
        }
    }

    public void a(@NonNull Activity activity) {
        String str = this.f6247e;
        this.c = activity;
        String localClassName = activity.getLocalClassName();
        this.f6247e = localClassName;
        if (str == null) {
            j((Integer) null);
        } else if (!str.equals(localClassName)) {
            a0 a0Var = this.f6246b;
            if (a0Var != null) {
                a0Var.h();
            }
            j(this.f);
        } else {
            a0 a0Var2 = this.f6246b;
            if (a0Var2 != null) {
                if (a0Var2.f5999j == g.FULL_SCREEN) {
                    j((Integer) null);
                    return;
                }
                i2.a(i2.k.DEBUG, "In app message new activity, calculate height and show ", (Throwable) null);
                g2.a(this.c, new r4(this));
            }
        }
    }

    public void b() {
        u0 p2 = i2.p();
        s0 s0Var = this.d;
        Objects.requireNonNull(p2);
        i2.k kVar = i2.k.DEBUG;
        StringBuilder y = b.e.a.a.a.y("OSInAppMessageController messageWasDismissed by back press: ");
        y.append(s0Var.toString());
        i2.a(kVar, y.toString(), (Throwable) null);
        p2.g(s0Var);
        h();
        this.f6246b = null;
    }

    public void c(Activity activity) {
        i2.a(i2.k.DEBUG, "In app message activity stopped, cleaning views", (Throwable) null);
        if (this.f6246b != null && this.f6247e.equals(activity.getLocalClassName())) {
            this.f6246b.h();
        }
    }

    public void f(@Nullable f fVar) {
        a0 a0Var = this.f6246b;
        if (a0Var != null) {
            a0Var.e(new d(fVar));
        } else if (fVar != null) {
            ((a) fVar).a();
        }
    }

    public final void h() {
        if (c.f6028i != null) {
            a.c.remove(f6243g + this.d.a);
        }
    }

    public final void j(@Nullable Integer num) {
        if (this.f6246b == null) {
            i2.a(i2.k.WARN, "No messageView found to update a with a new height.", (Throwable) null);
            return;
        }
        i2.k kVar = i2.k.DEBUG;
        i2.a(kVar, "In app message, showing first one with height: " + num, (Throwable) null);
        a0 a0Var = this.f6246b;
        a0Var.f6000k = this.a;
        if (num != null) {
            this.f = num;
            int intValue = num.intValue();
            a0Var.f5995e = intValue;
            f2.u(new w(a0Var, intValue));
        }
        this.f6246b.d(this.c);
        a0 a0Var2 = this.f6246b;
        if (a0Var2.f5997h) {
            a0Var2.f5997h = false;
            a0Var2.f((f) null);
        }
    }
}
