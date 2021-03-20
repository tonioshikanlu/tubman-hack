package b.o;

import b.l.f.x.a.g;
import org.json.JSONObject;

public final class g3 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f6103h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ l3 f6104i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f6105j;

    public g3(String str, l3 l3Var, String str2) {
        this.f6103h = str;
        this.f6104i = l3Var;
        this.f6105j = str2;
    }

    public void run() {
        g.U(this.f6103h, (String) null, (JSONObject) null, this.f6104i, 60000, this.f6105j);
    }
}
