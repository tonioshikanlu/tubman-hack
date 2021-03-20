package b.o;

import b.l.f.x.a.g;
import org.json.JSONObject;

public final class f3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f6095h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ JSONObject f6096i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l3 f6097j;

    public f3(String str, JSONObject jSONObject, l3 l3Var) {
        this.f6095h = str;
        this.f6096i = jSONObject;
        this.f6097j = l3Var;
    }

    public void run() {
        g.U(this.f6095h, "POST", this.f6096i, this.f6097j, 120000, (String) null);
    }
}
