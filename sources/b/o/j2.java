package b.o;

import b.o.i2;
import b.o.l4;
import java.util.Iterator;
import org.json.JSONObject;

public final class j2 implements Runnable {
    public void run() {
        JSONObject jSONObject;
        l4.b d = o3.d(!i2.L);
        if (d.a) {
            i2.L = true;
        }
        synchronized (i2.K) {
            Iterator<i2.i> it = i2.K.iterator();
            while (it.hasNext()) {
                i2.i next = it.next();
                if (d.f6183b != null) {
                    if (!d.toString().equals("{}")) {
                        jSONObject = d.f6183b;
                        next.a(jSONObject);
                    }
                }
                jSONObject = null;
                next.a(jSONObject);
            }
            i2.K.clear();
        }
    }
}
