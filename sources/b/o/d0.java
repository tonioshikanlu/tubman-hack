package b.o;

import android.os.Bundle;
import b.l.f.x.a.g;
import org.json.JSONArray;

public final class d0 implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Bundle f6060h;

    public d0(Bundle bundle) {
        this.f6060h = bundle;
    }

    public void run() {
        Bundle bundle = this.f6060h;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(g.f(bundle));
        i2.t(jSONArray, false, false);
    }
}
