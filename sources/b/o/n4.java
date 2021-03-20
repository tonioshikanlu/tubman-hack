package b.o;

import b.o.i2;
import org.json.JSONObject;

public class n4 extends l3 {
    public final /* synthetic */ JSONObject a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ JSONObject f6212b;
    public final /* synthetic */ l4 c;

    public n4(l4 l4Var, JSONObject jSONObject, JSONObject jSONObject2) {
        this.c = l4Var;
        this.a = jSONObject;
        this.f6212b = jSONObject2;
    }

    public void a(int i2, String str, Throwable th) {
        i2.k kVar = i2.k.ERROR;
        i2.a(kVar, "Failed PUT sync request with status code: " + i2 + " and response: " + str, (Throwable) null);
        synchronized (this.c.a) {
            if (l4.a(this.c, i2, str, "No user with this id found")) {
                l4.c(this.c);
            } else {
                l4.d(this.c, i2);
            }
        }
        if (this.a.has("tags")) {
            l4 l4Var = this.c;
            i2.t tVar = new i2.t(i2, str);
            while (true) {
                i2.h poll = l4Var.f6177e.poll();
                if (poll == null) {
                    break;
                }
                poll.a(tVar);
            }
        }
        if (this.a.has("external_user_id")) {
            i2.a(kVar, "Error setting external user id for push with status code: " + i2 + " and message: " + str, (Throwable) null);
            this.c.f();
        }
    }

    public void b(String str) {
        synchronized (this.c.a) {
            this.c.f6181j.l(this.f6212b, this.a);
            this.c.s(this.a);
        }
        if (this.a.has("tags")) {
            this.c.w();
        }
        if (this.a.has("external_user_id")) {
            this.c.g();
        }
    }
}
