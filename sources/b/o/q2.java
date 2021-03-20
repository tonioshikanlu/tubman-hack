package b.o;

import b.o.i2;
import org.json.JSONException;

public final class q2 implements Runnable {
    public void run() {
        try {
            i2.b();
            l0.a(i2.a, i2.d, d.a);
        } catch (JSONException e2) {
            i2.a(i2.k.FATAL, "FATAL Error registering device!", e2);
        }
    }
}
