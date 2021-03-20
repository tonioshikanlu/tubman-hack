package b.o;

import android.webkit.ValueCallback;
import org.json.JSONException;
import org.json.JSONObject;

public class r4 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q4 f6270h;

    public class a implements ValueCallback<String> {
        public a() {
        }

        public void onReceiveValue(Object obj) {
            try {
                r4.this.f6270h.j(Integer.valueOf(q4.d(r4.this.f6270h.c, new JSONObject((String) obj))));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public r4(q4 q4Var) {
        this.f6270h = q4Var;
    }

    public void run() {
        q4 q4Var = this.f6270h;
        q4.e(q4Var, q4Var.c);
        this.f6270h.a.evaluateJavascript("getPageMetaData()", new a());
    }
}
