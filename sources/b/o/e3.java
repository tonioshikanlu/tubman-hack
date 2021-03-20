package b.o;

import b.l.f.x.a.g;
import org.json.JSONObject;

public final class e3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f6084h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ JSONObject f6085i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l3 f6086j;

    public e3(String str, JSONObject jSONObject, l3 l3Var) {
        this.f6084h = str;
        this.f6085i = jSONObject;
        this.f6086j = l3Var;
    }

    public void run() {
        g.U(this.f6084h, "PUT", this.f6085i, this.f6086j, 120000, (String) null);
    }
}
