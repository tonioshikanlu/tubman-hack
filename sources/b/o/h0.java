package b.o;

import android.content.Context;
import b.o.g0;
import java.security.SecureRandom;
import org.json.JSONObject;

public class h0 {
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f6106b;
    public boolean c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6107e;
    public Long f;

    /* renamed from: g  reason: collision with root package name */
    public g0.a f6108g;

    public h0(Context context) {
        this.a = context;
    }

    public Integer a() {
        if (this.f6108g == null) {
            this.f6108g = new g0.a();
        }
        g0.a aVar = this.f6108g;
        if (aVar.a == null) {
            aVar.a = Integer.valueOf(new SecureRandom().nextInt());
        }
        return this.f6108g.a;
    }

    public int b() {
        Integer num;
        g0.a aVar = this.f6108g;
        if (aVar == null || (num = aVar.a) == null) {
            return -1;
        }
        return num.intValue();
    }

    public CharSequence c() {
        return this.f6106b.optString("alert", (String) null);
    }

    public CharSequence d() {
        return this.f6106b.optString("title", (String) null);
    }
}
